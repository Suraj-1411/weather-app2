package com.example.weatherapp.data.models

import java.math.BigDecimal

data class LocationModel (
    var city: String? = "",
    var region: String? = "",
    var woeid: Int? = 0,
    var country: String? = "",
    var lat: BigDecimal? = BigDecimal.ZERO,
    var long:BigDecimal? = BigDecimal.ZERO,
    var timezone_id: String? = ""
)