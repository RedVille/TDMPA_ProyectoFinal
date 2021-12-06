package com.vampi.vampialumno.data.source

import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.functional.Either
import com.vampi.vampialumno.core.functional.leftOrElse
import com.vampi.vampialumno.core.plataform.AuthManager
import com.vampi.vampialumno.core.plataform.NetworkHandler
import com.vampi.vampialumno.data.api.DetalleAlumnoApi
import com.vampi.vampialumno.data.dto.DetalleAlumnoResponse
import com.vampi.vampialumno.data.dto.UsuariosResponse
import com.vampi.vampialumno.domain.repository.DetalleAlumnoRepository
import com.vampi.vampialumno.framework.api.ApiRequest
import javax.inject.Inject

class DetalleAlumnoRepositoryImpl @Inject constructor(
    private val detalleAlumnoApi: DetalleAlumnoApi,
    private val networkHandler: NetworkHandler
) : DetalleAlumnoRepository, ApiRequest{
    override fun getDetalleAlumnoByMatricula(matricula: Int): Either<Failure, DetalleAlumnoResponse> {
        val result = makeRequest(
            networkHandler,
            detalleAlumnoApi.getDetalleAlumnoByMatricula(matricula),
            { it },
            DetalleAlumnoResponse(
                emptyList()
            )
        )
        return if (result.isLeft) {
            Either.Left(result.leftOrElse(Failure.NetworkConnection))
        } else result
    }

    override fun getDetalleAlumnoByMatriculaAndId(
        matricula: Int,
        idMateria: Int
    ): Either<Failure, DetalleAlumnoResponse> {
        val result = makeRequest(
            networkHandler,
            detalleAlumnoApi.getDetalleAlumnoByMatriculaAndId(matricula, idMateria),
            { it },
            DetalleAlumnoResponse(
                emptyList()
            )
        )
        return if (result.isLeft) {
            Either.Left(result.leftOrElse(Failure.NetworkConnection))
        } else result
    }
}