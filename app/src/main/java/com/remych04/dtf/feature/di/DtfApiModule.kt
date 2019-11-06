package com.remych04.dtf.feature.di

import com.remych04.dtf.base.di.scope.ActivityScope
import com.remych04.dtf.base.di.viewmodel.ViewModelModule
import com.remych04.dtf.feature.data.DtfApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(includes = [ViewModelModule::class])
class DtfApiModule {

    @Provides
    @ActivityScope
    fun getDtfApi(retrofit: Retrofit): DtfApi {
        return retrofit.create(DtfApi::class.java)
    }
}