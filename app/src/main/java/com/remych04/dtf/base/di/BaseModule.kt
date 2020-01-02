package com.remych04.dtf.base.di

import android.content.Context
import com.remych04.dtf.DtfApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseModule {

    @Provides
    @Singleton
    fun getContext(application: DtfApplication): Context = application
}