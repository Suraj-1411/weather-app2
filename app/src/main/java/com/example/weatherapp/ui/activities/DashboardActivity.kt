package com.example.weatherapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.weatherapp.R
import com.example.weatherapp.base.BaseActivity
import com.example.weatherapp.databinding.ActivityDashboardBinding

class DashboardActivity : BaseActivity() {
    lateinit var mBinding:ActivityDashboardBinding
    var navController:NavController?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        navController= (supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment).navController

        setUpBottomBar()
    }

    private fun setUpBottomBar() {
        val popMenu = PopupMenu(this,null)
        popMenu.inflate(R.menu.bottom_nav_menu)
        val menu = popMenu.menu
        navController?.let { mBinding.bottomBar.setupWithNavController(menu, it) }
    }
}