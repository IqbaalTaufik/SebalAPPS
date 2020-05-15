package com.example.mainidle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class findmee : AppCompatActivity() {
    private lateinit var betn: Button
    private lateinit var bet: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findmee)
        betn = findViewById(R.id.batt)
        betn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        bet = findViewById(R.id.button)
        bet.setOnClickListener {
            val orul = Intent(Intent.ACTION_VIEW)
            orul.data = Uri.parse("https://www.google.com/maps/place/6%C2%B019'31.3%22S+107%C2%B008'14.1%22E/@-6.3251798,107.1371186,19.75z/data=!4m5!3m4!1s0x0:0x0!8m2!3d-6.3253491!4d107.1372421?hl=en")
            startActivity(orul)
        }
        val lok = findViewById(R.id.textView8) as TextView
        lok.setOnClickListener{
            val link = Intent(Intent.ACTION_VIEW)
            link.data = Uri.parse("https://www.google.com/maps/place/6%C2%B019'31.3%22S+107%C2%B008'14.1%22E/@-6.3251798,107.1371186,19.75z/data=!4m5!3m4!1s0x0:0x0!8m2!3d-6.3253491!4d107.1372421?hl=en")
            startActivity(link)
        }
    }
}