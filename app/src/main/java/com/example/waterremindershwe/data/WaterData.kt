package com.example.waterremindershwe.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "water_data")
data class WaterData(
    @PrimaryKey(autoGenerate = true) val id:Int = 0,
    val waterAmount: Int,
    //@ColumnInfo(name = "date") val date: LocalDate,
)
