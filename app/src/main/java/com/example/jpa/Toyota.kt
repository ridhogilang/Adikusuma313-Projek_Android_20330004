package com.example.jpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Toyota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toyota)

        var btn1 = findViewById(R.id.button1) as Button
        var btn5 = findViewById(R.id.button6) as Button

        btn1.setOnClickListener {
            startActivity(Intent(this, Inova::class.java))
        }
        btn5.setOnClickListener{
            startActivity(Intent(this,Tambahmobil::class.java))
        }
    }
}