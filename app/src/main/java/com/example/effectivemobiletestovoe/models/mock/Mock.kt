package com.example.effectivemobiletestovoe.models.mock

import android.annotation.SuppressLint
import com.example.effectivemobiletestovoe.models.offers.Offer
import com.example.effectivemobiletestovoe.models.vacancies.Vacancy
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class Mock(
    val offers: List<Offer>,
    val vacancies: List<Vacancy>
)
