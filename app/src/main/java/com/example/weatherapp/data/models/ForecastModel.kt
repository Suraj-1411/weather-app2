package com.example.weatherapp.data.models

data class ForecastModel(
    var location : LocationModel? = LocationModel(),
    var current_observation : CurrentObservation?= CurrentObservation(),
    var forecasts:ForecastWeekModel = ForecastWeekModel()
)
