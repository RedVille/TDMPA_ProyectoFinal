package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.repository.UsuarioRepository
import javax.inject.Inject

class DoLogout @Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<Boolean, UseCase.None>() {

    override suspend fun run(params: None) = usuarioRepository.doLogout()

}