package com.example.mainidle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mainidle.db.dbdaili
import com.example.mainidle.R
import kotlinx.android.synthetic.main.activity_daily.view.*
import kotlinx.android.synthetic.main.daily_menu.view.*

class DailiAdapter: RecyclerView.Adapter<DailiAdapter.viewHolder>(){
    private var isian : List<dbdaili> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailiAdapter.viewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.daily_menu,parent, false)
        )
    }

    override fun getItemCount(): Int {
        return isian.size
    }

    override fun onBindViewHolder(holder: DailiAdapter.viewHolder, position: Int) {
        holder.bindaily(isian.get(position))
    }

    fun setDailyAdapter (dbdaili: List<dbdaili>){
        isian = dbdaili
    }
    class viewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val title = view.tvdaili

        fun bindaily(dbdaili: dbdaili){
            title.text = dbdaili.kegiatan
        }
    }
}