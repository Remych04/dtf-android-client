package com.remych04.dtf.feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.remych04.dtf.R
import com.remych04.dtf.base.viewmodel.injectViewModel
import com.remych04.dtf.feature.domain.NewsListViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var demoViewModel: NewsListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        demoViewModel = injectViewModel(viewModelFactory)
    }

    override fun onResume() {
        super.onResume()
    }
}
