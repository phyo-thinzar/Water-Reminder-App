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
    private val _waterAmount = MutableLiveData<String>()
    val waterAmount: LiveData<String> get() = _waterAmount

    fun setText(newText: String) {
        _waterAmount.value = newText
    }

}

/*
data class fakeData(
    val waterAmount : Int,
)*/
