package com.example.mainidle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mainidle.db.dbdaili
import com.example.mainidle.R
import kotlinx.android.synthetic.main.activity_daily.view.*
import kotlinx.android.synthetic.main.daily_menu.view.*
import kotlinx.android.synthetic.main.frenlis_menu.view.*
import kotlinx.android.synthetic.main.item_galeri.view.*
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
class frenlistAdapter : RecyclerView.Adapter<frenlistAdapter.viewHolder>(){
    private var isian : List<dbfrenlist> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): frenlistAdapter.viewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.frenlis_menu,parent, false)
        )
    }

    override fun getItemCount(): Int {
        return isian.size
    }

    override fun onBindViewHolder(holder:frenlistAdapter.viewHolder, position: Int) {
        holder.bindaily(isian.get(position))
    }

    fun setfrenlistAdapter (dbgaleri: List<dbfrenlist>){
        isian = dbgaleri
    }
    class viewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val image = view.ivfren
        val title = view.tvfrenlis

        fun bindaily(dbgalerii: dbfrenlist){
            image.setImageResource(dbgalerii.imagee)
            title.text = (dbgalerii.nama)
        }
    }
}