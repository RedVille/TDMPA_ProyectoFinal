package com.vampi.vampimaestro.data.source

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.core.functional.leftOrElse
import com.vampi.vampimaestro.core.plataform.NetworkHandler
import com.vampi.vampimaestro.data.api.MateriaApi
import com.vampi.vampimaestro.data.dto.MateriasResponse
import com.vampi.vampimaestro.data.dto.UsuariosResponse
import com.vampi.vampimaestro.domain.repository.MateriaRepository
import com.vampi.vampimaestro.domain.repository.UsuarioRepository
import com.vampi.vampimaestro.framework.api.ApiRequest
import javax.inject.Inject

class MateriaRepositoryImpl @Inject constructor(
    private val materiaApi: MateriaApi,
    private val networkHandler: NetworkHandler
) : MateriaRepository, ApiRequest {

    override fun getMateriaById(idMateria: Int): Either<Failure, MateriasResponse> {
        val result = makeRequest(
            networkHandler,
            materiaApi.getMateriaById(idMateria),
            { it },
            MateriasResponse(
                emptyList()
            )
        )

        return if (result.isLeft) {
            Either.Left(result.leftOrElse(Failure.NetworkConnection))
        } else result
    }

}