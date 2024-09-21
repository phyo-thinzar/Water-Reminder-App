package com.example.waterremindershwe.datasource

import com.example.waterremindershwe.dao.WaterDao
import com.example.waterremindershwe.data.WaterData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WaterLocalSource @Inject constructor(private val waterDao:WaterDao) {


    fun getAllData():Flow<List<WaterData>>{
        return waterDao.getAll()
    }

    suspend fun insertAll(water : WaterData){
        waterDao.insertAll(water)
    }

    //update water amount
    /*suspend fun updateWaterAmount(date: LocalDate, newAmount:Int){
        waterDao.updaterWaterAmount(currentDate = date,newWaterAmount = newAmount)
    }*/
}
