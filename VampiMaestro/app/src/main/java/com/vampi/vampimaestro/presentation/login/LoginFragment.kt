package com.vampi.vampimaestro.presentation.login

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.vampi.vampimaestro.R
import com.vampi.vampimaestro.core.extension.failure
import com.vampi.vampimaestro.core.extension.observe
import com.vampi.vampimaestro.core.presentation.BaseFragment
import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.databinding.LoginFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class LoginFragment : BaseFragment(R.layout.login_fragment) {

    private lateinit var binding: LoginFragmentBinding

    private val loginViewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
    }

    override fun setBinding(view: View) {
        binding = LoginFragmentBinding.bind(view)

        setHasOptionsMenu(true)

        binding.lifecycleOwner = this

        //baseActivity.setBottomNavVisibility(View.VISIBLE)
    }

}