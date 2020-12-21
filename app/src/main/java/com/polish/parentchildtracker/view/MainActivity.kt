package com.polish.parentchildtracker.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.polish.parentchildtracker.R
import com.polish.parentchildtracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**
     * viewBinding reference
     */
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * initialize the binding object
         */
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}