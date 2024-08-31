package com.example.waterremindershwe.datasource

import com.example.waterremindershwe.dao.WaterDao
import com.example.waterremindershwe.data.WaterDb
import kotlinx.coroutines.flow.Flow

class WaterLocalSource(private val waterDao: WaterDao) {

    fun getAllData():Flow<List<WaterDb>>{
        return waterDao.getAll()
    }

    fun insertAll(water : WaterDb){
        waterDao.insertAll(water)
    }

    //update water amount

}