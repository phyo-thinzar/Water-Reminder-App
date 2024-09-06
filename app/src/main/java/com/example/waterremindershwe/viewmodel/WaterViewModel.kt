package com.example.waterremindershwe.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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
    //waterAmount from ui
    private val _waterAmount = MutableLiveData<Int>()
    val waterAmount: LiveData<Int> get() = _waterAmount

    init{
        _waterAmount.value = 0
    }

    /*fun setNewAmount(newWaterAmount: Int) {
        val currentValue = _waterAmount.value ?: 0
        _waterAmount.value = currentValue + newWaterAmount
    }*/

    //add first value to database
    fun insert(waterData : WaterDb) = viewModelScope.launch {
        withContext(Dispatchers.IO){
            repository.insertData(waterData)
        }
    }

    /*///Test Coding
    private val _waterAmount = MutableLiveData<Int>()
    val waterAmount: LiveData<Int> get() = _waterAmount

    init{
        _waterAmount.value = 0
    }
    fun setNewAmount(newWaterAmount: Int) {
        val currentValue = _waterAmount.value ?: 0
        _waterAmount.value = currentValue + newWaterAmount
    }*/


}


