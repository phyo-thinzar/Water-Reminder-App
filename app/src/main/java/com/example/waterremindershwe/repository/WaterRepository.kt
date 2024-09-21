package com.example.waterremindershwe.repository

import com.example.waterremindershwe.data.WaterData
import com.example.waterremindershwe.datasource.WaterLocalSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WaterRepository @Inject constructor(private val waterSource : WaterLocalSource) {

    val allData: Flow<List<WaterData>> = waterSource.getAllData()

    suspend fun insertData(water: WaterData){
        waterSource.insertAll(water)
    }
    fun getAlldata(): Flow<List<WaterData>> {
        return waterSource.getAllData()
    }

    /*suspend fun updateWaterAmount(date : LocalDate, waterAmount: Int){
        waterSource.updateWaterAmount(date = date, newAmount = waterAmount)
    }*/

}
