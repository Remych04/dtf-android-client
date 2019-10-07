package com.remych04.dtf

import androidx.multidex.MultiDexApplication
import com.remych04.dtf.base.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class DtfApplication : MultiDexApplication(), HasAndroidInjector {
    @Inject
    lateinit var injector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.factory()
            .create(this)
            .inject(this)
    }

    override fun androidInjector() = injector
}