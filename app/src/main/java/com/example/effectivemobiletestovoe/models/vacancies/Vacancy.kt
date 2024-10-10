package com.example.effectivemobiletestovoe.models.vacancies

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Vacancy(
    @PrimaryKey val id: String,
    val lookingNumber: Int,
    @Embedded val title: Address,
    val company: String,
    @Embedded val experience: Experience,
    val publishedDate: String,
    val isFavorite: Boolean,
    @Embedded val salary: Salary,
    val schedules: List<String>,
    val appliedNumber: Int,
    val description: String,
    val responsibilities: String,
    val questions: List<String>
)
