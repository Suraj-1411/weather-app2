package com.example.weatherapp.data.models

import java.math.BigDecimal

data class CurrentObservation(
    var wind:WindModel? = WindModel(),
    var atmosphere: AtmosphereModel? = AtmosphereModel(),
    var astronomy : AstronomyModel? = AstronomyModel(),
    var condition : ConditionModel? = ConditionModel(),
    var pubDate : BigDecimal = BigDecimal.ZERO
)
