package com.vampi.vampimaestro.presentation.login

import android.os.Bundle
import android.view.View
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

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when (state) {
            is LoginViewState.UsuarioReceived -> {
                if (state.usuarios.isNotEmpty()){
                    if (loginViewModel.validatePassword(state.usuarios[0]) && loginViewModel.validateType(state.usuarios[0])) {
                        loginViewModel.setLocalUser(state.usuarios[0])
                        navController.navigate(LoginFragmentDirections.actionLoginFragmentToMenuFragment())
                    }
                    else
                        showToast("Credeciales Incorrectas D:")
                }
                else
                    showToast("Usuario no encontrado :(")
            }
        }
    }

    override fun setBinding(view: View) {
        binding = LoginFragmentBinding.bind(view)

        setHasOptionsMenu(true)

        binding.apply {
            lifecycleOwner = this@LoginFragment

            vm = loginViewModel

            btnDoLogin.setOnClickListener { doLogin() }
        }

    }

    private fun doLogin() {
        if (loginViewModel.validateEmpties()) {
            if (loginViewModel.validateMatricula()) loginViewModel.getUsuarioByMatricula()
            else showToast("Matricula invalida")
        } else showToast("Campos vacios")
    }

}