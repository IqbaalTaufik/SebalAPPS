package com.example.mainidle.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "deli")
data class dbdaili(
    @PrimaryKey
    val id : Int,
    val kegiatan : String
){
    companion object{
        fun setData(): ArrayList<dbdaili>{
            val list = ArrayList<dbdaili>()
            list.add(
                dbdaili(1,"ngupil")
            )
            return list
        }
    }
}