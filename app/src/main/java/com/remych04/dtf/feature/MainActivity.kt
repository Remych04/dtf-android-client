package com.remych04.dtf.feature

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.remych04.dtf.R
import com.remych04.dtf.feature.domain.DtfUseCase
import dagger.android.AndroidInjection
import kotlinx.coroutines.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var api: DtfUseCase

    private var job: Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        job = CoroutineScope(Dispatchers.IO).launch {
            val result = api.getData()
            withContext(Dispatchers.Main) {
                Log.d("asd123", result.string())
            }
        }
    }

    override fun onDestroy() {
        job?.cancel()
        super.onDestroy()
    }
}
