package com.example.weatherapp.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.weatherapp.R
import com.example.weatherapp.base.BaseFragment
import com.example.weatherapp.data.Resource
import com.example.weatherapp.data.displayToast
import com.example.weatherapp.data.getDayTime
import com.example.weatherapp.data.models.ForecastModel
import com.example.weatherapp.data.setWeekList
import com.example.weatherapp.databinding.FragmentHomeBinding
import com.example.weatherapp.viewmodel.DashBoardViewModel
import java.util.*


class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private val viewModel: DashBoardViewModel by viewModels()
    lateinit var mBinding: FragmentHomeBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.getWeatherData("hyderabad")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentHomeBinding.bind(view)
        setListeners()
        setObservers()
    }

    private fun setListeners() {
        mBinding.searchBtn.setOnClickListener {
            val searchText= mBinding.searchPlaceET.text.toString().trim()
            if(searchText.isNotEmpty()){
                viewModel.getWeatherData(searchText)
                requireContext().displayToast("currently Stopped API ")
            }else{
                requireContext().displayToast(getString(R.string.place_txt))
            }
        }
    }

    private fun setObservers() {
        viewModel.weatherData.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Loading -> {
                    mBinding.loadingBar.visibility = View.VISIBLE
                }
                is Resource.Success -> {
                    mBinding.loadingBar.visibility = View.GONE
                    bindData(it.data)
                }
                is Resource.Failed -> {
                    mBinding.loadingBar.visibility = View.GONE
                    mBinding.cityStateTv.text = it.message
                }
            }
        })
    }

    private fun bindData(data: ForecastModel?) {
        data?.let { forecast ->

            setWeekList(forecast.forecasts)

            mBinding.cityStateTv.text =
                String.format("%s,%s", forecast.location?.city, forecast.location?.region)
            mBinding.dayTimeTv.text = getDayTime(Date())

            mBinding.tempTv.text = String.format("%s%s",forecast.current_observation?.condition?.temperature.toString(),getString(R.string.degree))
            mBinding.weatherStatus.text = forecast.current_observation?.condition?.text

            mBinding.pressureTv.text =
                forecast.current_observation?.atmosphere?.pressure.toString().plus("mb")
            mBinding.visibilityTv.text =
                forecast.current_observation?.atmosphere?.visibility.toString().plus("km")
            mBinding.humidityTv.text =
                forecast.current_observation?.atmosphere?.humidity.toString().plus("%")


            mBinding.sunriseTv.text = forecast.current_observation?.astronomy?.sunrise?.uppercase()
            mBinding.sunsetTv.text = forecast.current_observation?.astronomy?.sunset?.uppercase()

        }
    }


}