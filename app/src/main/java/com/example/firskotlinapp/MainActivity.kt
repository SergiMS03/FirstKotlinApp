package com.example.firskotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inputText = findViewById<TextInputEditText>(R.id.textInput)
        var bntMostrar = findViewById<Button>(R.id.btnMostrar)

        bntMostrar.setOnClickListener{
            var intent = Intent(this, SecondaryActivity::class.java)
            intent.putExtra("texto", inputText.text.toString())
            startActivity(intent);
        }
    }
}