package com.example.effectivemobiletestovoe.common.di.room

import android.app.Application
import androidx.room.Room
import com.example.effectivemobiletestovoe.common.room.AppDatabase
import com.example.effectivemobiletestovoe.common.room.dao.VacancyDao
import org.koin.dsl.module

fun provideDataBase(application: Application) =
    Room.databaseBuilder(
        application,
        AppDatabase::class.java,
        "db"
    ).fallbackToDestructiveMigration().build()

fun provideDao(appDatabase: AppDatabase): VacancyDao = appDatabase.vacancyDao()

val roomModule = module {
    single { provideDataBase(get()) }
    single { provideDao(get()) }
}