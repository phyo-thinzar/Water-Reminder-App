package com.example.waterremindershwe.repository

import com.example.waterremindershwe.data.WaterDb
import com.example.waterremindershwe.datasource.WaterLocalSource
import kotlinx.coroutines.flow.Flow

class WaterRepository(private val waterSource : WaterLocalSource) {

    val allData: Flow<List<WaterDb>> = waterSource.getAllData()

    fun insertData(water: WaterDb){
        waterSource.insertAll(water)
    }

}