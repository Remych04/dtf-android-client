package com.remych04.dtf

import androidx.multidex.MultiDexApplication
import com.remych04.dtf.base.module.networkModule
import com.remych04.dtf.feature.newslist.module.newsListModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class DtfApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@DtfApplication)
            modules(listOf(networkModule, newsListModule))
        }
        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}