package com.juanpablo.actividades_y_su_ciclo_de_vida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("onCreate", "onCreate() se ha llamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "onStart() se ha llamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "onResume() se ha llamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "onPause() se ha llamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "onStop() se ha llamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "onDestroy() se ha llamado")
    }
}
