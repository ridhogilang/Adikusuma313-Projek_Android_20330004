package com.example.jpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inova : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inova)

        var btn1 = findViewById(R.id.button1) as Button
        var btn6 = findViewById(R.id.button6) as Button

        btn1.setOnClickListener {
            startActivity(Intent(this, Compinv::class.java))
        }
        btn6.setOnClickListener{
            startActivity(Intent(this,Tambahpart::class.java))
        }
    }
}