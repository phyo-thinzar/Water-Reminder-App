package com.example.waterremindershwe.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "water_data")
data class WaterData(
    @PrimaryKey(autoGenerate = true) val id:Int = 0,
    val waterAmount: Int,
    val date: LocalDate,
)
