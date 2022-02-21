package com.example.weatherapp.data

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.utils.*
import io.ktor.http.*

class RemoteService() {

    val httpClient = HttpClient(Android){
        install(Logging){
            level = LogLevel.ALL
        }
        install(JsonFeature){
            serializer= KotlinxSerializer(kotlinx.serialization.json.Json{
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }


    @Throws(Exception::class)
    fun addHeaders(headersBuilder: HeadersBuilder){
        headersBuilder.apply {
            append(Constants.HOST,"yahoo-weather5.p.rapidapi.com")
            append(Constants.API_KEY,Constants.KEY)
        }
    }
}