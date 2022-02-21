package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable

@Serializable
data class ForecastModel(
    var location : LocationModel? = LocationModel(),
    var current_observation : CurrentObservation?= CurrentObservation(),
    var forecasts:List<ForecastWeekModel> = emptyList()
)
