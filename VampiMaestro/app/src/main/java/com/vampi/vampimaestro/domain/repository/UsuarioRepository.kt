package com.vampi.vampimaestro.domain.repository

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.data.dto.UsuariosResponse

interface UsuarioRepository {

    fun getUserByMatricula(matricula: Int): Either<Failure, UsuariosResponse>

}