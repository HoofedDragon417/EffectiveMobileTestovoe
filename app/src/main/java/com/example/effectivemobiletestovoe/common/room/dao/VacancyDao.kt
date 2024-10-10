package com.example.effectivemobiletestovoe.common.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.effectivemobiletestovoe.models.vacancies.Vacancy
import kotlinx.coroutines.flow.Flow

@Dao
interface VacancyDao {
    @Query("select * from vacancy")
    fun getVacancies(): Flow<List<Vacancy>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertVacancies(vacancies: List<Vacancy>)

    @Update
    fun updateVacancy(vacancies: List<Vacancy>)
}