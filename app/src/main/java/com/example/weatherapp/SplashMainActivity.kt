package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.weatherapp.base.BaseActivity
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.ui.activities.DashboardActivity

class SplashMainActivity : BaseActivity() {

    lateinit var mBinding : ActivityMainBinding
    var imgAnim : Animation?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        imgAnim= AnimationUtils.loadAnimation(this,R.anim.img_down)
        mBinding.splashImageview.startAnimation(imgAnim)

        mBinding.getStartedBtn.setOnClickListener {
            startActivity(Intent(this,DashboardActivity::class.java))
            finish()
        }
    }
}