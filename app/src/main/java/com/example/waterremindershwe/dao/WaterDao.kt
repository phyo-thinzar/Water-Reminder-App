package com.example.waterremindershwe.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.waterremindershwe.data.WaterData
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

@Dao
interface WaterDao{



    //insert all data
    @Insert
    suspend fun insertAll(vararg waterAmount: WaterData)

    //get all user information
    @Query("SELECT * FROM water_data")
    fun getAll() : Flow<List<WaterData>>

    //update water amount
    @Query("UPDATE water_data SET waterAmount = :newWaterAmount WHERE id = :id")
    suspend fun updateWaterAmount(newWaterAmount : Int,id : Int)


}
