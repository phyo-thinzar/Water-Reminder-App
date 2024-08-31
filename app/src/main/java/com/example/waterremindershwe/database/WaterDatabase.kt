package com.example.waterremindershwe.database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.waterremindershwe.dao.WaterDao
import com.example.waterremindershwe.data.WaterDb
import kotlinx.coroutines.CoroutineScope

@Database(entities = [WaterDb::class], exportSchema = true, version = 1)
abstract class WaterDatabase:RoomDatabase(), WaterDao {

    abstract fun waterDao(): WaterDao

    companion object {
        @Volatile
        private var INSTANCE: WaterDatabase? = null

        fun getDatabase(
            context: Context,
            applicationScope: CoroutineScope
        ): WaterDatabase {
            return (INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WaterDatabase::class.java,
                    "water_table"
                ).build()
                INSTANCE = instance
                instance
            }) as WaterDatabase
        }
    }

}