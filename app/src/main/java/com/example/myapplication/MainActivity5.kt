package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent (this, MainActivity6::class.java)
        }
    }
}