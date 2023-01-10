package com.example.jpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Triton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triton)

        var btn6 = findViewById(R.id.button6) as Button

        btn6.setOnClickListener {
            startActivity(Intent(this, Tambahpart::class.java))
        }
    }
}