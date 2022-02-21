package com.example.weatherapp.data

import android.content.Context
import android.widget.Toast
import com.example.weatherapp.data.models.ForecastWeekModel
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

const val DISPLAY_DAY_TIME_DATE_FORMAT = "EEE h a"
private var weekForecast : List<ForecastWeekModel>? = emptyList()

fun getDayTime(date : Date) : String {
    val dateFormat = SimpleDateFormat(DISPLAY_DAY_TIME_DATE_FORMAT,Locale.getDefault())
    return dateFormat.format(date)
}

fun Context.displayToast(msg : String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}

fun setWeekList(list : List<ForecastWeekModel>){
    weekForecast = list
}

fun getWeekList():List<ForecastWeekModel>?{
    return weekForecast
}