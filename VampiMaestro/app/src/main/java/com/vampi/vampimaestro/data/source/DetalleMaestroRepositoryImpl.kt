package com.vampi.vampimaestro.data.source

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.core.functional.leftOrElse
import com.vampi.vampimaestro.core.plataform.NetworkHandler
import com.vampi.vampimaestro.data.api.DetalleMaestroApi
import com.vampi.vampimaestro.data.dto.DetalleAlumnoResponse
import com.vampi.vampimaestro.data.dto.DetalleMaestroResponse
import com.vampi.vampimaestro.domain.repository.DetalleMaestroRepository
import com.vampi.vampimaestro.framework.api.ApiRequest
import javax.inject.Inject

class DetalleMaestroRepositoryImpl @Inject constructor(
    private val detalleMaestroApi: DetalleMaestroApi,
    private val networkHandler: NetworkHandler
) : DetalleMaestroRepository, ApiRequest {

    override fun getDetalleMaestroByMatricula(matricula: Int): Either<Failure, DetalleMaestroResponse> {
        val result = makeRequest(
            networkHandler,
            detalleMaestroApi.getDetalleMaestroByMatricula(matricula),
            { it },
            DetalleMaestroResponse(
                emptyList()
            )
        )

        return if (result.isLeft) {
            Either.Left(result.leftOrElse(Failure.NetworkConnection))
        } else result
    }

}