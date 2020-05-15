package com.example.mainidle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mainidle.db.dbdaili
import com.example.mainidle.R
import kotlinx.android.synthetic.main.activity_daily.view.*
import kotlinx.android.synthetic.main.daily_menu.view.*
import kotlinx.android.synthetic.main.item_galeri.view.*

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
        val image = view.ivgal

        fun bindaily(dbgaleri: dbfrenlist){
            image.setImageResource(dbgaleri.imagee)
        }
    }
}