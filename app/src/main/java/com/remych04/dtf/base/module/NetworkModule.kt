package com.remych04.dtf.base.module

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.remych04.dtf.feature.newslist.data.DtfApi
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val networkModule = module {

    single { provideChucker(androidContext()) }
    single { provideMoshiConverter() }
    single { provideOkHttp(get()) }
    single { provideRetrofit(get(), get()) }
    single { provideDtfApi(get()) }
}

fun provideChucker(context: Context): ChuckerInterceptor {
    return ChuckerInterceptor(context)
}

fun provideMoshiConverter(): MoshiConverterFactory {
    return MoshiConverterFactory.create()
}

fun provideOkHttp(chuckerInterceptor: ChuckerInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
        .build()
}

fun provideRetrofit(
    moshiConverterFactory: MoshiConverterFactory,
    okHttpClient: OkHttpClient
): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://api.dtf.ru/v1.8/")
        .addConverterFactory(moshiConverterFactory)
        .client(okHttpClient)
        .build()
}

fun provideDtfApi(retrofit: Retrofit): DtfApi {
    return retrofit.create(DtfApi::class.java)
}