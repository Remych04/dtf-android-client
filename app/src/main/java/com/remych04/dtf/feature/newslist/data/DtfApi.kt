package com.remych04.dtf.feature.newslist.data

import okhttp3.ResponseBody
import retrofit2.http.GET

interface DtfApi {

    @GET("job")
    suspend fun getJobAsync(): ResponseBody
}