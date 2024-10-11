package com.example.effectivemobiletestovoe.common.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.effectivemobiletestovoe.common.room.convertor.TypeConvertor
import com.example.effectivemobiletestovoe.common.room.dao.VacancyDao
import com.example.effectivemobiletestovoe.models.vacancies.Vacancy

@Database(entities = [Vacancy::class], version = 6)
@TypeConverters(TypeConvertor::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun vacancyDao(): VacancyDao
}