package com.example.mainidle.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [dbdaili::class], version = 1)
abstract class MyAppDB : RoomDatabase() {

    abstract fun dailydao(): DailiDao

    companion object{
        @Volatile private var INSTANCE : MyAppDB? = null

        fun getInstance (context: Context): MyAppDB = INSTANCE?: synchronized(this){
            INSTANCE?: buildDatabase(context).also { INSTANCE = it }
        }
        private fun buildDatabase(context: Context)=
            Room.databaseBuilder(context.applicationContext,MyAppDB::class.java,"mydb").fallbackToDestructiveMigration().build()
    }
}