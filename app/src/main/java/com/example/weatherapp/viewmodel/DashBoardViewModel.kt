package com.example.weatherapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.data.RemoteService
import com.example.weatherapp.data.RepositorySDK
import com.example.weatherapp.data.Resource
import com.example.weatherapp.data.models.ForecastModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DashBoardViewModel : ViewModel() {

    private val _weatherData = MutableLiveData<Resource<ForecastModel>>()
    val weatherData : LiveData<Resource<ForecastModel>>
    get() = _weatherData

    private val repositorySDK : RepositorySDK
    init {
        repositorySDK = RepositorySDK(RemoteService())
    }

    fun getWeatherData(location:String){
        viewModelScope.launch(Dispatchers.IO) {
        _weatherData.postValue(Resource.Loading())
            kotlin.runCatching {
                repositorySDK.getWeatherData(location,'c')
            }.onSuccess {
                _weatherData.postValue(Resource.Success(it))
            }.onFailure {
                _weatherData.postValue(Resource.Failed(it.message))
            }
        }
    }

}