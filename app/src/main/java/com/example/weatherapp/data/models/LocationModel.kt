package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class LocationModel (
    var city: String? = "",
    var region: String? = "",
    var woeid: Int? = 0,
    var country: String? = "",
    var lat: Double? = 0.0,
    var long: Double? = 0.0,
    var timezone_id: String? = ""
)