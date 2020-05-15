package com.example.mainidle.db
import androidx.room.PrimaryKey

data class dbdaili(
    @PrimaryKey
    val id : Int,
    val kegiatan : String
){
    companion object{
        fun setData(): ArrayList<dbdaili>{
            val list = ArrayList<dbdaili>()
            list.add(dbdaili(1,"Makan"))
            list.add(dbdaili(2,"Ngoding"))
            list.add(dbdaili(3,"Main Game"))
            return list
        }
    }
}