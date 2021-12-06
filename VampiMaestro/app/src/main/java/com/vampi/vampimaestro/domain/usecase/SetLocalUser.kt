package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.repository.UsuarioRepository
import javax.inject.Inject

class SetLocalUser @Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<Boolean, Usuario>()
{
    override suspend fun run(params: Usuario) = usuarioRepository.setLocalUser(params)

}