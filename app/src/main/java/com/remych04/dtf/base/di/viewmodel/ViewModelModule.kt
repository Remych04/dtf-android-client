package com.remych04.dtf.base.di.viewmodel

import androidx.lifecycle.ViewModel
import com.remych04.dtf.feature.domain.NewsListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NewsListViewModel::class)
    internal abstract fun demoViewModel(viewModel: NewsListViewModel): ViewModel
}