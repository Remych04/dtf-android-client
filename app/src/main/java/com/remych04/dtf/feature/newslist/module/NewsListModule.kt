package com.remych04.dtf.feature.newslist.module

import com.remych04.dtf.feature.newslist.domain.NewsListCommand
import com.remych04.dtf.feature.newslist.presentation.NewsListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val newsListModule = module {
    factory { NewsListCommand(get(), get()) }
    viewModel { NewsListViewModel(get()) }
}