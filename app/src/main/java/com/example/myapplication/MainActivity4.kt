package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent (this, MainActivity5::class.java)
        }
    }
}