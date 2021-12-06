package com.vampi.vampimaestro.presentation.login

import androidx.lifecycle.ViewModel
import com.vampi.vampimaestro.core.presentation.BaseViewModel
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.usecase.GetUsuarioByMatricula
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class LoginViewModel @Inject constructor(
    private val getUsuarioByMatricula: GetUsuarioByMatricula
): BaseViewModel(){

    fun getUsuarioByMatricula(matricula: Int) {
        getUsuarioByMatricula(matricula) {
            it.fold(::handleFailure) { response ->
                state.value = LoginViewState.UsuarioReceived(response.usuarios ?: listOf())

                true
            }
        }
    }

}