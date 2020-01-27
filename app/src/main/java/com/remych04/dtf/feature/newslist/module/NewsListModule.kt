package com.remych04.dtf.feature.newslist.module

import com.remych04.dtf.feature.newslist.data.DtfApi
import com.remych04.dtf.feature.newslist.domain.NewsListCommand
import com.remych04.dtf.feature.newslist.presentation.NewsListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val newsListModule = module {
    factory { provideDtfApi(get()) }
    factory { NewsListCommand(get(), get()) }
    viewModel { NewsListViewModel(get()) }
}

fun provideDtfApi(retrofit: Retrofit): DtfApi {
    return retrofit.create(DtfApi::class.java)
}