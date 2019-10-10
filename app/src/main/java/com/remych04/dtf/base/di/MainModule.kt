package com.remych04.dtf.base.di

import com.remych04.dtf.base.di.scope.ActivityScope
import com.remych04.dtf.feature.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainModule {

    @ActivityScope
    @ContributesAndroidInjector()
    abstract fun main(): MainActivity
}