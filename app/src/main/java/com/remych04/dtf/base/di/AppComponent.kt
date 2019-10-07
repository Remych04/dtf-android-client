package com.remych04.dtf.base.di

import com.remych04.dtf.DtfApplication
import com.remych04.dtf.base.di.scope.AppScope
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@AppScope
@Component(modules = [AndroidInjectionModule::class, MainModule::class])
interface AppComponent : AndroidInjector<DtfApplication> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<DtfApplication>
}