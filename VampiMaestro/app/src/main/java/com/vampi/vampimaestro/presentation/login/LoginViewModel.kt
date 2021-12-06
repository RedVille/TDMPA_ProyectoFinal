package com.vampi.vampimaestro.presentation.login

import androidx.lifecycle.MutableLiveData
import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.core.presentation.BaseViewModel
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.usecase.DoLogout
import com.vampi.vampimaestro.domain.usecase.GetLocalUser
import com.vampi.vampimaestro.domain.usecase.GetUsuarioByMatricula
import com.vampi.vampimaestro.domain.usecase.SetLocalUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import java.lang.NumberFormatException
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class LoginViewModel @Inject constructor(
    private val getUsuarioByMatricula: GetUsuarioByMatricula,
    private val setLocalUser: SetLocalUser,
    private val getLocalUser: GetLocalUser,
    private val doLogout: DoLogout
): BaseViewModel(){

    val matricula = MutableLiveData("")
    val contrasena = MutableLiveData("")

    fun getUsuarioByMatricula() {
        val mat = matricula.value?.toInt()?: 0

        getUsuarioByMatricula(params = mat) {
            it.fold(::handleFailure) { response ->
                state.value = LoginViewState.UsuarioReceived(response.usuarios ?: listOf())

                true
            }
        }
    }

    fun setLocalUser(usuario: Usuario) {
        setLocalUser(usuario) {
            it.fold(::handleFailure) {
                setUserInfo(usuario)

                true
            }
        }
    }

    private fun setUserInfo(usuario: Usuario) {
        state.value = LoginViewState.LoggedUser(usuario)
    }

    fun validatePassword(usuario: Usuario): Boolean {
         return contrasena.value.toString() == usuario.contrasena
    }

    fun validateMatricula(): Boolean {
        return try {
            matricula.value?.toInt()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

    fun validateEmpties(): Boolean {
        return !(matricula.value.isNullOrBlank() || contrasena.value.isNullOrBlank())
    }

    fun validateType(usuario: Usuario): Boolean {
        return usuario.tipo == "M"
    }

}