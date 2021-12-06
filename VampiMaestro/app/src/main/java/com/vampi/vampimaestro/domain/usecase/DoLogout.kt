package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.domain.repository.UsuarioRepository
import javax.inject.Inject

class DoLogout @Inject constructor(private val usuarioRepository: UsuarioRepository) :
    UseCase<Boolean, UseCase.None>() {

    override suspend fun run(params: None) = usuarioRepository.doLogout()

}