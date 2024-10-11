package com.example.effectivemobiletestovoe.models.vacancies

import kotlinx.serialization.Serializable

@Serializable
data class Experience(
    val previewText: String,
    val text: String
)
