package com.example.jpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mitsubishi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mitsubishi)

        var btn1 = findViewById(R.id.button1) as Button
        var btn2 = findViewById(R.id.button2) as Button
        var btn6 = findViewById(R.id.button6) as Button

        btn1.setOnClickListener {
            startActivity(
                Intent(this,Pajero::class.java))
        }

        btn2.setOnClickListener {
            startActivity(
                Intent(this, Triton::class.java))
        }
        btn6.setOnClickListener {
            startActivity(Intent(this, Tambahmobil::class.java))
        }
    }
}
