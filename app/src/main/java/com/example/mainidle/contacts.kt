package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class contacts : AppCompatActivity() {
private lateinit var betn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        betn = findViewById(R.id.batt)
        betn.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
