package com.remych04.dtf.feature.domain

import com.remych04.dtf.feature.data.DtfApi
import okhttp3.ResponseBody
import javax.inject.Inject

class DtfUseCase
@Inject constructor(private val dtfApi: DtfApi) {

    suspend fun getData(): ResponseBody {
        return dtfApi.getJobAsync()
    }
}