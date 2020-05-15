package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
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
