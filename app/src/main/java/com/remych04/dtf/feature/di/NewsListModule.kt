package com.remych04.dtf.feature.di

import androidx.lifecycle.ViewModel
import com.remych04.dtf.base.di.viewmodel.ViewModelFactoryModule
import com.remych04.dtf.base.di.viewmodel.ViewModelKey
import com.remych04.dtf.feature.NewsListFragment
import com.remych04.dtf.feature.NewsListViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class NewsListModule {

    @ContributesAndroidInjector(modules = [ViewModelFactoryModule::class])
    internal abstract fun newsListFragment(): NewsListFragment

    @Binds
    @IntoMap
    @ViewModelKey(NewsListViewModel::class)
    internal abstract fun demoViewModel(viewModel: NewsListViewModel): ViewModel
}