package com.example.mainidle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class datadiri : AppCompatActivity() {
private lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datadiri)
        btn1 = findViewById(R.id.batt)
        btn1.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        val imail =findViewById(R.id.textView14) as TextView
        imail.setOnClickListener{
            val orul = Intent(Intent.ACTION_VIEW)
            orul.data = Uri.parse("https://mail.google.com/mail/u/2/#inbox?compose=GTvVlcSDbFjvqJMWMHFHSQJkhRwXgBKbBxhlKkMKTzmxpvgVLSHgdwLDsmCnKWrZFWJjqSHmggpsq")
            startActivity(orul)
        }
        val ige = findViewById(R.id.textView15) as TextView
        ige.setOnClickListener{
            val orul1 = Intent(Intent.ACTION_VIEW)
            orul1.data = Uri.parse("https://www.instagram.com/iqbaal_taufik/")
            startActivity(orul1)
        }
        val hab = findViewById(R.id.textView16) as TextView
        hab.setOnClickListener{
            val orul2 = Intent(Intent.ACTION_VIEW)
            orul2.data = Uri.parse("https://github.com/IqbaalTaufik")
            startActivity(orul2)
        }
    }
}
