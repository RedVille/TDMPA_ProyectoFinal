package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.repository.UsuarioRepository
import javax.inject.Inject

class EditUser @Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<Int, Usuario>() {

    override suspend fun run(params: Usuario) = usuarioRepository.editUser(params)

}