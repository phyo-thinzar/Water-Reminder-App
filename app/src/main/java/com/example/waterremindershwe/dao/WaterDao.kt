/*
package com.example.waterremindershwe.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.waterremindershwe.data.WaterDb

@Dao
interface WaterDao{

    //insert all data
    @Insert
    fun insertAll(vararg waterInfo: WaterDb)

    //get all user information
    @Query("SELECT * FROM water_db")
    fun getAll() : List<WaterDb>

    //update water amount
}*/
