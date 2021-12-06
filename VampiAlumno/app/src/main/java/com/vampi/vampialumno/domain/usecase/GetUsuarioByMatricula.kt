package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.data.dto.UsuariosResponse
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.repository.UsuarioRepository
import javax.inject.Inject

class GetUsuarioByMatricula @Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<UsuariosResponse, Int>() {

    override suspend fun run(params: Int) = usuarioRepository.getUserByMatricula(params)

}