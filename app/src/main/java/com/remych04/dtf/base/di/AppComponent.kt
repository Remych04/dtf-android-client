package com.remych04.dtf.base.di

import com.remych04.dtf.DtfApplication
import com.remych04.dtf.base.di.viewmodel.ViewModelFactoryModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ViewModelFactoryModule::class,
        MainModule::class,
        NetworkModule::class,
        BaseModule::class
    ]
)
interface AppComponent : AndroidInjector<DtfApplication> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<DtfApplication>
}