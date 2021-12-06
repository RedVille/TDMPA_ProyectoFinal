package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.repository.UsuarioRepository
import javax.inject.Inject

class SetLocalUser @Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<Boolean, Usuario>()
{
    override suspend fun run(params: Usuario) = usuarioRepository.setLocalUser(params)
}