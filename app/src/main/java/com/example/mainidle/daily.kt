package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainidle.db.MyAppDB
import com.example.mainidle.db.dbdaili
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.Schedulers.io
import kotlinx.android.synthetic.main.activity_daily.*

class daily : AppCompatActivity() {
    private lateinit var betn : Button
private lateinit var daili : DailiAdapter
    private var dispo = CompositeDisposable()
    private  var debe : MyAppDB? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)
        betn = findViewById(R.id.batt)
        betn.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        debe = MyAppDB.getInstance(this)
        setData()
        getData()

    }
    fun setData(){
        val data = dbdaili.setData()
        dispo.add(Observable.fromCallable{debe?.dailydao()?.insertDatadaily(data) }
            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe())
    }
    fun getData(){
        dispo.add(Observable.fromCallable{debe?.dailydao()?.getData() }
            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                recycleview.apply {
                    layoutManager = LinearLayoutManager(this@daily)
                    daili = DailiAdapter()
                    daili.setDailyAdapter(it!!)
                    recycleview.adapter = daili
                }
            })
    }
}
