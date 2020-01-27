package com.remych04.dtf.feature.newslist.domain

import com.remych04.dtf.base.cache.CacheDuration
import com.remych04.dtf.base.cache.CacheManager
import com.remych04.dtf.base.domain.CacheBaseCommand
import com.remych04.dtf.feature.newslist.data.DtfApi
import com.remych04.dtf.feature.newslist.data.models.NewsListResult
import com.remych04.dtf.feature.newslist.presentation.models.Category
import com.remych04.dtf.feature.newslist.presentation.models.Sorting

class NewsListCommand constructor(
    private val api: DtfApi,
    cacheManager: CacheManager
) : CacheBaseCommand<NewsListResult>(NewsListResult::class.java, cacheManager) {

    override suspend fun run(): NewsListResult {
        return api.getNewsTimeLine(Category.INDEX.name, Sorting.POPULAR.name)
    }

    override fun getCacheKey() = NewsListResult::class.java.simpleName

    override fun getCacheTime() = CacheDuration.ONE_MINUTE * 2
}