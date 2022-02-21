package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class AtmosphereModel(
    var humidity: Int? = 0,
    var visibility: Float? = 0f,
    var pressure: Double? = 0.0,
    var rising: Int? = 0
)
