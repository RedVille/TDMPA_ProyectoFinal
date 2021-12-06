package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.repository.UsuarioRepository
import javax.inject.Inject

class GetLocalUser @Inject constructor(private val userRepository: UsuarioRepository) :
    UseCase<Usuario, UseCase.None>() {

    override suspend fun run(params: None) = userRepository.getLocalUser()

}