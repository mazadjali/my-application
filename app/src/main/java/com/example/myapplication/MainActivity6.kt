package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        var button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent (this, MainActivity3::class.java)
        }
    }
}