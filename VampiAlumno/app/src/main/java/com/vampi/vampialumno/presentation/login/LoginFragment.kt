package com.vampi.vampialumno.presentation.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.vampi.vampialumno.R
import com.vampi.vampialumno.core.extension.failure
import com.vampi.vampialumno.core.extension.observe
import com.vampi.vampialumno.core.presentation.BaseFragment
import com.vampi.vampialumno.core.presentation.BaseViewState
import com.vampi.vampialumno.databinding.LoginFragmentBinding
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

            getUsuarioByMatricula(70561)
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