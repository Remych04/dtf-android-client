package com.remych04.dtf.feature.newslist.data.models

import com.squareup.moshi.Json

data class NewsListResult(
    @field:Json(name = "result") val newsList: List<NewsList>
)