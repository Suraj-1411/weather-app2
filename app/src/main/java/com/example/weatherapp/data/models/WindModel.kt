package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable

@Serializable
data class WindModel(
    var chill: Int? = 0,
    var direction: Int? = 0,
    var speed: Float? = 0f
)
