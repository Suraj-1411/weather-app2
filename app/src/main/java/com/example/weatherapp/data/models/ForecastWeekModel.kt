package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class ForecastWeekModel(
    var day: String? = "",
    var date: Long? = 0,
    var low: Int? = 0,
    var high: Int? = 0,
    var text: String? = "",
    var code: Int? = 0
)
