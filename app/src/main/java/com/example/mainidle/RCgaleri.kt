package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_r_cgaleri.*

class RCgaleri : AppCompatActivity() {
private lateinit var dbgaleri : galeriAdapter
    private lateinit var bett : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_cgaleri)
        val data = DataGaeri.Datagal()
        dbgaleri = galeriAdapter()
        dbgaleri.setgaleriAdapter(data)
        rcc.apply {
            layoutManager = LinearLayoutManager(this@RCgaleri)
            //,LinearLayoutManager.Horizontal,false
            //,GridLayoutManager,2
            this.adapter = dbgaleri
        }
        bett = findViewById(R.id.batt)
        bett.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
