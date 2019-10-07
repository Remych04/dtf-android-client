package com.remych04.dtf.base.di

import com.remych04.dtf.base.di.scope.ActivityScope
import com.remych04.dtf.feature.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainModule {

    @ActivityScope
    @ContributesAndroidInjector()
    fun main(): MainActivity
}