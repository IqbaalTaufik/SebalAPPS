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
import kotlinx.android.synthetic.main.musik_menu.view.*
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
class musikAdapter : RecyclerView.Adapter<musikAdapter.viewHolder>(){
    private var isian : List<dbmusik> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): musikAdapter.viewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.musik_menu,parent, false)
        )
    }

    override fun getItemCount(): Int {
        return isian.size
    }

    override fun onBindViewHolder(holder:musikAdapter.viewHolder, position: Int) {
        holder.bindaily(isian.get(position))
    }

    fun setmusikAdapter (dbmuss: List<dbmusik>){
        isian = dbmuss
    }
    class viewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val title = view.tvmusik

        fun bindaily(dbgalerii: dbmusik){
            title.text = (dbgalerii.nama)
        }
    }
}