package com.example.waterremindershwe.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WaterViewModel/*(private val repository: WaterRepository)*/ : ViewModel() {

    //val allData: LiveData<List<WaterDb>> = repository.allData.asLiveData()

    /*fun insert(waterData : WaterDb) = viewModelScope.launch {
        withContext(Dispatchers.IO){
            repository.insertData(waterData)
        }
    }*/

    ///Test Coding
    private val _waterAmount = MutableLiveData<Int>()
    val waterAmount: LiveData<Int> get() = _waterAmount

    init{
        _waterAmount.value = 0
    }
    fun setNewAmount(newWaterAmount: Int) {
        val currentValue = _waterAmount.value ?: 0
        _waterAmount.value = currentValue + newWaterAmount
    }


}


