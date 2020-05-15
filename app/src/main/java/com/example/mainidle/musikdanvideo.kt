package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_frenlis.*
import kotlinx.android.synthetic.main.activity_musikdanvideo.*
import kotlinx.android.synthetic.main.activity_r_cgaleri.*

class musikdanvideo : AppCompatActivity() {
    private lateinit var dbmusk : musikAdapter
    private lateinit var bett : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musikdanvideo)
        val data = dbmusik.Datamusk()
        dbmusk = musikAdapter()
        dbmusk.setmusikAdapter(data)
        rcmusik.apply {
            layoutManager = LinearLayoutManager(this@musikdanvideo)
            //,LinearLayoutManager.Horizontal,false
            //,GridLayoutManager,2
            this.adapter = dbmusk
        }
        bett = findViewById(R.id.batt)
        bett.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
