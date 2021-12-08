package com.vampi.vampialumno.presentation.profile.edit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vampi.vampialumno.core.presentation.BaseViewModel
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.usecase.EditUser
import com.vampi.vampialumno.domain.usecase.GetLocalUser
import com.vampi.vampialumno.domain.usecase.GetUsuarioByMatricula
import com.vampi.vampialumno.domain.usecase.SetLocalUser
import com.vampi.vampialumno.presentation.login.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class EditProfileViewModel @Inject constructor(
    private val editUser: EditUser,
    private val setLocalUser: SetLocalUser
): BaseViewModel(){

    val nombre = MutableLiveData("")
    val apPaterno = MutableLiveData("")
    val apMaterno = MutableLiveData("")
    val correo = MutableLiveData("")
    //val foto =

    fun editUser(usuario: Usuario){
        editUser(usuario){
            it.fold(::handleFailure){ true }
        }
    }

    fun setLocalUser(usuario: Usuario){
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