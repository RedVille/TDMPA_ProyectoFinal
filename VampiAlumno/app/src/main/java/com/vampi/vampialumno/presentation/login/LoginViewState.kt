package com.vampi.vampialumno.presentation.login

import com.vampi.vampialumno.core.presentation.BaseViewState
import com.vampi.vampialumno.domain.model.Usuario

sealed class LoginViewState: BaseViewState() {

    data class UsuarioReceived(val usuarios: List<Usuario>) : BaseViewState()

    data class LoggedUser(val usuario: Usuario) : BaseViewState()

    object UserNotFound : BaseViewState()

}
