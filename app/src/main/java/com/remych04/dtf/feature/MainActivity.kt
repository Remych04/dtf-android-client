package com.remych04.dtf.feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.remych04.dtf.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
