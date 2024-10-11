package com.example.effectivemobiletestovoe.models.vacancies

import android.annotation.SuppressLint
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Entity
@Serializable
data class Vacancy(
    @PrimaryKey val id: String,
    val lookingNumber: Int? = null,
    val title: String,
    @Embedded val address: Address,
    val company: String,
    @Embedded val experience: Experience,
    val publishedDate: String,
    val isFavorite: Boolean,
    @Embedded val salary: Salary,
    val schedules: List<String>,
    val appliedNumber: Int? = null,
    val description: String? = null,
    val responsibilities: String,
    val questions: List<String>
)
