package com.vampi.vampialumno

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentContainerView
import com.vampi.vampialumno.core.presentation.BaseActivity
import com.vampi.vampialumno.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun layoutId() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setBinding()
    }

    override val fragmentContainer: FragmentContainerView
        get() = binding.mainFragmentContainer

    override fun setBinding() {
        binding = DataBindingUtil.setContentView(this, layoutId())

        /*binding.apply {
            lifecycleOwner = this@MainActivity
        }*/
    }

    override fun showProgress(show: Boolean) {
    }
}