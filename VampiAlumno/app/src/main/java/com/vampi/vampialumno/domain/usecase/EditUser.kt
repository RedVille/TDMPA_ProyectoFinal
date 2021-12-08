package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.functional.Either
import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.repository.UsuarioRepository
import javax.inject.Inject

class EditUser @Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<Int, Usuario>(){
    override suspend fun run(params: Usuario) = usuarioRepository.editUser(params)

}