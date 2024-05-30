package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val intent = Intent (this, MainActivity3::class.java)
        }

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {

            val intent = Intent (this, MainActivity2::class.java)
        }

    }
}