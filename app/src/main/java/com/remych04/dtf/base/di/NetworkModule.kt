package com.remych04.dtf.base.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.remych04.dtf.base.di.scope.AppScope
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
object NetworkModule {

    @AppScope
    @Provides
    @JvmStatic
    fun getGson(): Gson {
        return GsonBuilder().create()
    }

    @AppScope
    @Provides
    @JvmStatic
    fun getOkhttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @AppScope
    @Provides
    @JvmStatic
    fun getRetrofit(
        gson: Gson,
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.dtf.ru/v1.8/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
    }
}