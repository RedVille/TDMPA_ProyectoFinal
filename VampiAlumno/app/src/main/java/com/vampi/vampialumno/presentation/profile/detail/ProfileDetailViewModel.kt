package com.vampi.vampialumno.presentation.profile.detail

import androidx.lifecycle.ViewModel
import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.core.presentation.BaseViewModel
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.usecase.EditUser
import com.vampi.vampialumno.domain.usecase.GetLocalUser
import com.vampi.vampialumno.domain.usecase.GetUsuarioByMatricula
import com.vampi.vampialumno.presentation.login.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class ProfileDetailViewModel @Inject constructor(
    private val getUsuarioByMatricula: GetUsuarioByMatricula,
    private val getLocalUser: GetLocalUser
): BaseViewModel(){

    fun getLocalUser() {
        getLocalUser(UseCase.None()) {
            it.fold(::userNotFound) { localUser ->
                getUsuarioByMatricula(localUser.matricula) {
                    it.fold({
                        setUserInfo(localUser)
                        ::handleFailure
                    }) {
                        setUserInfo(localUser)
                        true
                    }
                }
            }
        }
    }

    private fun setUserInfo(usuario: Usuario) {
        state.value = LoginViewState.LoggedUser(usuario)
    }

    private fun userNotFound(failure: Failure) {
        state.value = LoginViewState.UserNotFound
        handleFailure(failure)
    }

}