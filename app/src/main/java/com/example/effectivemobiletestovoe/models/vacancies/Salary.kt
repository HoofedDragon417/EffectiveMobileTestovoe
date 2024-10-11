package com.example.effectivemobiletestovoe.models.vacancies

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class Salary(
    val short: String? = null,
    val full: String
)
