package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_frenlis.*
import kotlinx.android.synthetic.main.activity_r_cgaleri.*
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
class frenlis : AppCompatActivity() {
    private lateinit var dbfren : frenlistAdapter
    private lateinit var bett : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frenlis)
        val data = dbfrenlist.Datafren()
        dbfren = frenlistAdapter()
        dbfren.setfrenlistAdapter(data)
        rcfren.apply {
            layoutManager = LinearLayoutManager(this@frenlis,LinearLayoutManager.HORIZONTAL,false)
            //,LinearLayoutManager.Horizontal,false
            //,GridLayoutManager,2
            this.adapter = dbfren
        }
        bett = findViewById(R.id.batt)
        bett.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
