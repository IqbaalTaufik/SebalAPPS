package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mainidle.db.dbdaili
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_daily.*
import kotlinx.android.synthetic.main.activity_r_cgaleri.*
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
class daily : AppCompatActivity() {
    private lateinit var betn: Button
    private lateinit var daili: DailiAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)
            val data = dbdaili.setData()
            daili = DailiAdapter()
            daili.setDailyAdapter(data)
            recycleview.apply {
                layoutManager = LinearLayoutManager(this@daily)
                //,LinearLayoutManager.Horizontal,false
                //,GridLayoutManager,2
                this.adapter = daili
            }
        betn = findViewById(R.id.batt)
        betn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
