package com.example.weatherapp.data.models

import java.math.BigDecimal

data class ForecastWeekModel(
    var day: String? = "",
    var date: BigDecimal? = BigDecimal.ZERO,
    var low: Int? = 0,
    var high: Int? = 0,
    var text: String? = "",
    var code: Int? = 0
)
