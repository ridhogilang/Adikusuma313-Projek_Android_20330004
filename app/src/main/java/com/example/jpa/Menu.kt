package com.example.jpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btn1 = findViewById(R.id.button1) as Button
        var btn2 = findViewById(R.id.button2) as Button
        var btn3 = findViewById(R.id.button3) as Button
        var btn4 = findViewById(R.id.button4) as Button
        var btn5 = findViewById(R.id.button_exit) as Button

        btn1.setOnClickListener {
            startActivity(Intent(this, Toyota::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, Honda::class.java))
        }
        btn3.setOnClickListener {
            startActivity(Intent(this, Mitsubishi::class.java))
        }
        btn5.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn4.setOnClickListener {
            startActivity(Intent(this, Tambahbrand::class.java))
        }
    }
}