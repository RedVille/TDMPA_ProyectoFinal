package com.vampi.vampimaestro

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentContainerView
import com.vampi.vampimaestro.core.presentation.BaseActivity
import com.vampi.vampimaestro.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setBinding()
    }

    override fun setBinding() {
        binding = DataBindingUtil.setContentView(this, layoutId())

        binding.apply {
            lifecycleOwner = this@MainActivity
        }
    }

    override fun layoutId() = R.layout.activity_main

    override val fragmentContainer: FragmentContainerView
        get() = binding.mainFragmentContainer

    override fun showProgress(show: Boolean) {

    }

}