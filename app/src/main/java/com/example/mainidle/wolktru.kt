package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_wolktru.*

class wolktru : AppCompatActivity() {
    private lateinit var betn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wolktru)
        viewpager.adapter = MyPagerAdapter(supportFragmentManager)

    }
}
