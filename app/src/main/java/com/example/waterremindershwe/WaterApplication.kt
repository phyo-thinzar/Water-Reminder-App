package com.example.waterremindershwe

import android.app.Application
import com.example.waterremindershwe.database.WaterDatabase
import com.example.waterremindershwe.datasource.WaterLocalSource
import com.example.waterremindershwe.repository.WaterRepository
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

@HiltAndroidApp
class WaterApplication:Application() {
    private val applicationScope = CoroutineScope(SupervisorJob())

    private val dataBase by lazy { WaterDatabase.getDatabase(this) }

    private val waterLocalSource by lazy { WaterLocalSource(dataBase.waterDao()) }
    val waterRepository by lazy { WaterRepository(waterLocalSource) }
}
