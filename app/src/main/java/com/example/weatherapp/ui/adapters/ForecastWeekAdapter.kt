package com.example.weatherapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.data.models.ForecastWeekModel
import com.example.weatherapp.databinding.ForecastWeekItemBinding

class ForecastWeekAdapter(private val list: List<ForecastWeekModel>) :
    RecyclerView.Adapter<ForecastWeekAdapter.ForecastViewHolder>() {

    inner class ForecastViewHolder(private val binding: ForecastWeekItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(forecastWeekModel: ForecastWeekModel) {
            binding.dayTv.text = forecastWeekModel.day?.uppercase()?.trim()
            binding.tempTv.text = String.format(
                "%s%s", forecastWeekModel.high.toString(), binding.tempTv.context.getString(
                    R.string.degree
                ).trim()
            )
            binding.temp2.text = forecastWeekModel.low.toString().trim()
            binding.weatherStatus.text = forecastWeekModel.text?.trim()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val binding =
            ForecastWeekItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ForecastViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}