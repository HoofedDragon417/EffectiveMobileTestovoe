package com.example.effectivemobiletestovoe.models.offers

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class Offer(
    val id: String? = null,
    val title: String,
    val link: String,
    val button: Button? = null
)
