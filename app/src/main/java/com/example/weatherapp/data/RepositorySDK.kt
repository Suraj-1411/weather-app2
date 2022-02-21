package com.example.weatherapp.data

import com.example.weatherapp.data.models.ForecastModel
import io.ktor.client.*
import io.ktor.client.request.*

class RepositorySDK(private val service: RemoteService) {

    @Throws(Exception::class)
    suspend fun getWeatherData(location: String,scale : Char) : ForecastModel {
        return service.httpClient.get{
            url(Constants.Weather)
            headers{
                service.addHeaders(this)
            }
            parameter("location",location)
            parameter("u",scale)
            parameter("format","json")
        }
    }
}