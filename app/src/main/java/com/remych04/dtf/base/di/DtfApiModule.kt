package com.remych04.dtf.base.di

import com.remych04.dtf.feature.newslist.data.DtfApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class DtfApiModule {

    @Provides
    @Singleton
    fun getDtfApi(retrofit: Retrofit): DtfApi {
        return retrofit.create(DtfApi::class.java)
    }
}