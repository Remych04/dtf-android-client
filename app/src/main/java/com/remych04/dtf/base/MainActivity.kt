package com.remych04.dtf.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.remych04.dtf.R
import com.remych04.dtf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.mainToolbar)

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.navigation_host_fragment) as NavHostFragment? ?: return

        binding.bottomNavView.setupWithNavController(host.navController)
    }
}
