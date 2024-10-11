package com.example.effectivemobiletestovoe.common.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.effectivemobiletestovoe.models.vacancies.Vacancy

@Dao
interface VacancyDao {
    @Query("select * from vacancy")
    fun getVacancies(): List<Vacancy>

    @Query("select * from vacancy where id like :id")
    fun getVacancy(id: String): Vacancy

    @Insert
    fun insertVacancies(vacancies: List<Vacancy>)

    @Update
    fun updateVacancies(vacancies: List<Vacancy>)

    @Update
    fun updateVacancy(vacancy: Vacancy)
}