package com.example.waterremindershwe.database

import android.app.Application
import android.content.Context
import android.util.Log.v
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bumptech.glide.load.model.ByteArrayLoader.Converter
import com.example.waterremindershwe.converter.DateConverter
import com.example.waterremindershwe.dao.WaterDao
import com.example.waterremindershwe.data.WaterData
import dagger.hilt.android.HiltAndroidApp

@Database(entities = [WaterData::class], exportSchema = true, version = 1)
@TypeConverters(DateConverter::class)
abstract class WaterDatabase:RoomDatabase(){

    abstract fun waterDao(): WaterDao

    companion object {
        @Volatile
        private var INSTANCE: WaterDatabase? = null

        fun getDatabase(
            context: Context
        ): WaterDatabase {
            return (INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WaterDatabase::class.java,
                    "water_db"
                ).build()
                INSTANCE = instance
                instance
            }) as WaterDatabase
        }
    }

}


