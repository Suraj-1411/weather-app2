package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable

@Serializable
data class AstronomyModel(
    var sunrise: String? = "",//":"6:41 am"
    var sunset: String? = ""//":"6:18 pm"
)
