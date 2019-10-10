package com.remych04.dtf.base.di

import android.content.Context
import com.remych04.dtf.DtfApplication
import com.remych04.dtf.base.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
object BaseModule {

    @Provides
    @AppScope
    @JvmStatic
    fun getContext(application: DtfApplication): Context = application
}