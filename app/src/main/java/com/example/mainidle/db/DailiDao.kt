package com.example.mainidle.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DailiDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDatadaily(dbdaili : List<dbdaili>)

    @Query("select * from deli")
    fun getData(): List<dbdaili>
}