package com.example.model

@kotlinx.serialization.Serializable
data class HealthcheckResponseBody(
    val currentTime: String,
    val serviceStatus: Int
)
