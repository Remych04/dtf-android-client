package com.remych04.dtf.base.di

import com.remych04.dtf.base.di.scope.ActivityScope
import com.remych04.dtf.feature.MainActivity
import com.remych04.dtf.feature.di.DtfApiModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [DtfApiModule::class])
    abstract fun main(): MainActivity
}