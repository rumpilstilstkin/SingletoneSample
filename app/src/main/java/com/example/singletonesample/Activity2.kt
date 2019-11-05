package com.example.singletonesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Log.d("Dto", SingleToneSample.instance().token ?: "null")
    }
}
