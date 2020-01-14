package com.remych04.dtf

import androidx.multidex.MultiDexApplication
import com.remych04.dtf.base.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import timber.log.Timber
import javax.inject.Inject


class DtfApplication : MultiDexApplication(), HasAndroidInjector {
    @Inject
    lateinit var injector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.factory()
            .create(this)
            .inject(this)

        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun androidInjector() = injector
}