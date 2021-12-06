package com.vampi.vampimaestro.presentation.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.vampi.vampimaestro.databinding.FragmentMenuBinding
import com.vampi.vampimaestro.R
import com.vampi.vampimaestro.core.extension.failure
import com.vampi.vampimaestro.core.extension.observe
import com.vampi.vampimaestro.core.presentation.BaseFragment
import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.presentation.login.LoginViewState
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class MenuFragment : BaseFragment(R.layout.fragment_menu) {

    private lateinit var binding: FragmentMenuBinding

    private val menuViewModel by viewModels<MenuViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        menuViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when(state){
            LoginViewState.UserNotFound -> navController.navigate(MenuFragmentDirections.actionMenuFragmentToLoginFragment())
        }
    }

    override fun onResume() {
        super.onResume()

        menuViewModel.getLocalUser()
    }

    override fun setBinding(view: View) {
        binding = FragmentMenuBinding.bind(view)
        binding.apply {
            lifecycleOwner = this@MenuFragment
            btnLogout.setOnClickListener { menuViewModel.doLogout() }
        }
    }

}