package com.example.weatherapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.databinding.ForecastWeekItemBinding

class ForecastWeekAdapter : RecyclerView.Adapter<ForecastWeekAdapter.ForecastViewHolder>() {

    inner class ForecastViewHolder(binding: ForecastWeekItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val binding =
            ForecastWeekItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ForecastViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
    }

    override fun getItemCount(): Int = 10
}