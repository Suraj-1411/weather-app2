package com.example.weatherapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.R
import com.example.weatherapp.base.BaseFragment
import com.example.weatherapp.databinding.FragmentForecastBinding
import com.example.weatherapp.ui.adapters.ForecastWeekAdapter


class ForecastFragment : BaseFragment(R.layout.fragment_forecast) {

    lateinit var mBinding : FragmentForecastBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentForecastBinding.bind(view)

        mBinding.recyclerView.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        mBinding.recyclerView.adapter= ForecastWeekAdapter()
    }
}