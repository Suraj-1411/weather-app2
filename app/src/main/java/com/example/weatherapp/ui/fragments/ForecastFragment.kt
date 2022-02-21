package com.example.weatherapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.R
import com.example.weatherapp.base.BaseFragment
import com.example.weatherapp.data.Resource
import com.example.weatherapp.data.displayToast
import com.example.weatherapp.data.getWeekList
import com.example.weatherapp.databinding.FragmentForecastBinding
import com.example.weatherapp.ui.adapters.ForecastWeekAdapter
import com.example.weatherapp.viewmodel.DashBoardViewModel


class ForecastFragment : BaseFragment(R.layout.fragment_forecast) {

    lateinit var mBinding : FragmentForecastBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentForecastBinding.bind(view)

        mBinding.recyclerView.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        mBinding.recyclerView.adapter= ForecastWeekAdapter(getWeekList() ?: emptyList())

    }
}