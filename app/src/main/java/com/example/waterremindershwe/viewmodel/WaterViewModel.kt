package com.example.waterremindershwe.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.waterremindershwe.data.WaterDb
import com.example.waterremindershwe.repository.WaterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WaterViewModel(private val repository: WaterRepository) : ViewModel() {

    val allData: LiveData<List<WaterDb>> = repository.allData.asLiveData()

    fun insert(waterData : WaterDb) = viewModelScope.launch {
        withContext(Dispatchers.IO){
            repository.insertData(waterData)
        }
    }

}