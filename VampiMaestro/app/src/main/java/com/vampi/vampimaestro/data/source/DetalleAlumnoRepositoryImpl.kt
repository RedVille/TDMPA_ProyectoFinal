package com.vampi.vampimaestro.data.source

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.core.functional.leftOrElse
import com.vampi.vampimaestro.core.plataform.NetworkHandler
import com.vampi.vampimaestro.data.api.DetalleAlumnoApi
import com.vampi.vampimaestro.data.dto.DetalleAlumnoResponse
import com.vampi.vampimaestro.domain.repository.DetalleAlumnoRepository
import com.vampi.vampimaestro.framework.api.ApiRequest
import javax.inject.Inject

class DetalleAlumnoRepositoryImpl @Inject constructor(
    private val detalleAlumnoApi: DetalleAlumnoApi,
    private val networkHandler: NetworkHandler
) : DetalleAlumnoRepository, ApiRequest{

    override fun getDetalleAlumnoByIdMateria(idMateria: Int): Either<Failure, DetalleAlumnoResponse> {
        val result = makeRequest(
            networkHandler,
            detalleAlumnoApi.getDetalleAlumnoByIdMateria(idMateria),
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