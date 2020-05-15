package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_frenlis.*
import kotlinx.android.synthetic.main.activity_musikdanvideo.*
import kotlinx.android.synthetic.main.activity_r_cgaleri.*
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
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
