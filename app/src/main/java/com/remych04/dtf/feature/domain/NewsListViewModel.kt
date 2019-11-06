package com.remych04.dtf.feature.domain

import androidx.lifecycle.ViewModel
import com.remych04.dtf.feature.data.DtfApi
import kotlinx.coroutines.*
import okhttp3.ResponseBody
import javax.inject.Inject

class NewsListViewModel @Inject constructor(
    private val api: DtfApi
) : ViewModel() {

    private var job: Job? = null

    fun getApi() {
        var result :ResponseBody? = null
        job = CoroutineScope(Dispatchers.IO).launch {
            result = api.getJobAsync()
            withContext(Dispatchers.Main) {

            }
        }
    }
}