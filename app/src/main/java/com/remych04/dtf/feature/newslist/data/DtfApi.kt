package com.remych04.dtf.feature.newslist.data

import com.remych04.dtf.feature.newslist.data.models.NewsListResult
import retrofit2.http.GET
import retrofit2.http.Path

interface DtfApi {

    @GET("timeline/{category}/{sorting}")
    suspend fun getNewsTimeLine(
        @Path("category") category: String,
        @Path("sorting") sorting: String
    ): NewsListResult
}