package com.example.waterremindershwe.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.waterremindershwe.data.WaterDb
import kotlinx.coroutines.flow.Flow

@Dao
interface WaterDao{

    //insert all data
    @Insert
    fun insertAll(vararg waterInfo: WaterDb)

    //get all user information
    @Query("SELECT * FROM water_db")
    fun getAll() : Flow<List<WaterDb>>

    //update water amount
}
