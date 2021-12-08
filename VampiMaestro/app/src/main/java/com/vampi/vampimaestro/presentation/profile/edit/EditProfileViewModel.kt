package com.vampi.vampimaestro.presentation.profile.edit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vampi.vampimaestro.core.presentation.BaseViewModel
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.usecase.EditUser
import com.vampi.vampimaestro.domain.usecase.SetLocalUser
import com.vampi.vampimaestro.presentation.login.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class EditProfileViewModel @Inject constructor(
    private val editUser: EditUser,
    private val setLocalUser: SetLocalUser
) : BaseViewModel() {

    val nombre = MutableLiveData("")
    val apPaterno = MutableLiveData("")
    val apMaterno = MutableLiveData("")
    val correo = MutableLiveData("")
    

    fun editUser(usuario: Usuario) {
        editUser(usuario) {
            it.fold(::handleFailure) { true }
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

}