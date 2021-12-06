package com.vampi.vampimaestro.data.source

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.core.functional.leftOrElse
import com.vampi.vampimaestro.core.plataform.AuthManager
import com.vampi.vampimaestro.core.plataform.NetworkHandler
import com.vampi.vampimaestro.data.api.UsuarioApi
import com.vampi.vampimaestro.data.dto.UsuariosResponse
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.domain.repository.UsuarioRepository
import com.vampi.vampimaestro.framework.api.ApiRequest
import javax.inject.Inject

class UsuarioRepositoryImpl @Inject constructor(
    private val usuarioApi: UsuarioApi,
    private val networkHandler: NetworkHandler
) : UsuarioRepository, ApiRequest {

    override fun getUserByMatricula(matricula: Int): Either<Failure, UsuariosResponse> {
        val result = makeRequest(
            networkHandler,
            usuarioApi.getUserByMatricula(matricula),
            { it },
            UsuariosResponse(
                emptyList()
            )
        )

        return if (result.isLeft) {
            Either.Left(result.leftOrElse(Failure.NetworkConnection))
        } else result

    }

}