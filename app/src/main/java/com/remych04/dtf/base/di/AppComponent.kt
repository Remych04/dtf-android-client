package com.remych04.dtf.base.di

import com.remych04.dtf.DtfApplication
import com.remych04.dtf.feature.category.di.CategoryModule
import com.remych04.dtf.feature.newslist.di.NewsListModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        NetworkModule::class,
        DtfApiModule::class,
        BaseModule::class,
        NewsListModule::class,
        CategoryModule::class
    ]
)
interface AppComponent : AndroidInjector<DtfApplication> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<DtfApplication>
}