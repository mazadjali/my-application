package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener {
            val intent = Intent (this, MainActivity4::class.java)
        }
        var imageButton4 = findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener {
            val intent = Intent (this, MainActivity4::class.java)
        }
        var imageButton5 = findViewById<ImageButton>(R.id.imageButton5)
        imageButton5.setOnClickListener {
            val intent = Intent (this, MainActivity4::class.java)
        }
    }
}