package com.example.weatherapp.data.models

import java.math.BigDecimal

data class AtmosphereModel(
    var humidity: Int? = 0,
    var visibility: Int? = 0,
    var pressure: BigDecimal? = BigDecimal.ZERO,
    var rising: Int? = 0
)
