package com.example.weatherapp.data.models

import kotlinx.serialization.Serializable

@Serializable
data class ConditionModel(
    var code: Int? = 0,
    var text: String? = "",
    var temperature: Int? = 0,
)
