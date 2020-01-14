package com.remych04.dtf.base.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.remych04.dtf.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {

    @Singleton
    @Provides
    fun getMoshi(): MoshiConverterFactory {
        return MoshiConverterFactory.create()
    }

    @Singleton
    @Provides
    fun getHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG) {
            logging.level = HttpLoggingInterceptor.Level.BODY
        } else {
            logging.level = HttpLoggingInterceptor.Level.NONE
        }
        return logging
    }

    @Singleton
    @Provides
    fun getChucker(context: Context) = ChuckerInterceptor(context)

    @Singleton
    @Provides
    fun getOkhttp(chuckerInterceptor: ChuckerInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(chuckerInterceptor)
            .build()
    }

    @Singleton
    @Provides
    fun getRetrofit(
        moshi: MoshiConverterFactory,
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.dtf.ru/v1.8/")
            .addConverterFactory(moshi)
            .client(okHttpClient)
            .build()
    }
}