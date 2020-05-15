package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class interests : AppCompatActivity() {
private lateinit var baten: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interests)
        baten = findViewById(R.id.batt)
        baten.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
