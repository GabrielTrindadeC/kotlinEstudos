package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("lifeCycleApp", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifeCycleApp", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("lifeCycleApp", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("lifeCycleApp", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("lifeCycleApp", "onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("lifeCycleApp", "onRestart")

    }
}