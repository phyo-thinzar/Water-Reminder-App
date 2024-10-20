package com.example.waterremindershwe.viewmodel

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.waterremindershwe.data.WaterData
import com.example.waterremindershwe.repository.WaterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import javax.inject.Inject

@HiltViewModel
class WaterViewModel @Inject constructor(
    private val repository: WaterRepository) : ViewModel() {

        val lengthCount : Flow<Int> = repository.getAlldata()
            .map { dataList -> dataList.size }
    @RequiresApi(Build.VERSION_CODES.O)
    fun insert(waterAmount: Int) = viewModelScope.launch {
        val date = LocalDate.now()

        Log.d("Insert" , "Insert Success : Before")
        val waterData = WaterData(waterAmount= waterAmount, date = date)
        withContext(Dispatchers.IO){
            repository.insertData(waterData)
            Log.d("Insert" , "Insert Success : After date -> ${date}")
        }
    }

   fun updateWaterAmount(waterAmount: Int, id: Int) = viewModelScope.launch {
        withContext(Dispatchers.IO){
            repository.updateWaterAmount(waterAmount = waterAmount , id = id)
            Log.d( "Update" , "Update Success  ${id} ${waterAmount} ")
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

    //show database result
    fun showResult(){
        viewModelScope.launch {
            repository.getAlldata().collect{
                resultList->
                resultList.forEach {
                    result ->
                    Log.d("Water Result","ID: ${result.id}, Water Amount : ${result.waterAmount}")
                }
            }
        }
    }

}


