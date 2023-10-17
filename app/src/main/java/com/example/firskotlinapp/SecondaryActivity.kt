package com.example.firskotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        var datos = intent.getStringExtra("texto")
        var textOutput = findViewById<TextView>(R.id.textOutput)
        textOutput.text = datos;
    }
}