package com.vampi.vampimaestro.presentation.profile.detail

import androidx.lifecycle.ViewModel
import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.core.presentation.BaseViewModel
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.usecase.EditUser
import com.vampi.vampimaestro.domain.usecase.GetLocalUser
import com.vampi.vampimaestro.domain.usecase.GetUsuarioByMatricula
import com.vampi.vampimaestro.presentation.login.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class ProfileDetailViewModel @Inject constructor(
    private val getUsuarioByMatricula: GetUsuarioByMatricula,
    private val getLocalUser: GetLocalUser
) : BaseViewModel() {

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