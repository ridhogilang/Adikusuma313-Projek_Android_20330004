package com.example.jpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_submit.setOnClickListener {
            startActivity(Intent(this, Menu::class.java))
        }
    }
}