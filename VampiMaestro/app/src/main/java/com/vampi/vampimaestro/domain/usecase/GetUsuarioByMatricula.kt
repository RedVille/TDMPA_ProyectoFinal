package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.repository.UsuarioRepository
import javax.inject.Inject

class GetUsuarioByMatricula /*@Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<Usuario, Int>() {

    override suspend fun run(params: Int) = usuarioRepository.getUserByMatricula(params)

}*/