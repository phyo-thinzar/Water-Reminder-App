package com.example.waterremindershwe.di

import android.content.Context
import com.example.waterremindershwe.database.WaterDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Singleton
    @Provides

    fun provideWaterDatabase(
        @ApplicationContext context: Context
    ):WaterDatabase{
        return WaterDatabase.getDatabase(context)
    }

    @Provides
    fun provideWaterDao(waterDatabase: WaterDatabase) = waterDatabase.waterDao()
}