package com.vampi.vampimaestro.presentation.login

import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.domain.model.Usuario

sealed class LoginViewState : BaseViewState() {

    data class UsuarioReceived(val usuario: Usuario) : BaseViewState()

}
