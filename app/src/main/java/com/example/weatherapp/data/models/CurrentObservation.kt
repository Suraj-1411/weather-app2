package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class CurrentObservation(
    var wind:WindModel? = WindModel(),
    var atmosphere: AtmosphereModel? = AtmosphereModel(),
    var astronomy : AstronomyModel? = AstronomyModel(),
    var condition : ConditionModel? = ConditionModel(),
    var pubDate : Long = 0,
)
