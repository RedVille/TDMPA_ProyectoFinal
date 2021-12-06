package com.vampi.vampialumno.data.source

import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.functional.Either
import com.vampi.vampialumno.core.functional.leftOrElse
import com.vampi.vampialumno.core.plataform.AuthManager
import com.vampi.vampialumno.core.plataform.NetworkHandler
import com.vampi.vampialumno.data.api.UsuarioApi
import com.vampi.vampialumno.data.dto.UsuariosResponse
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.repository.UsuarioRepository
import com.vampi.vampialumno.framework.api.ApiRequest
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