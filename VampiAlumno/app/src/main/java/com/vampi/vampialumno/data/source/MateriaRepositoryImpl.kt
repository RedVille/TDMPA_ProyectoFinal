package com.vampi.vampialumno.data.source

import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.functional.Either
import com.vampi.vampialumno.core.functional.leftOrElse
import com.vampi.vampialumno.core.plataform.NetworkHandler
import com.vampi.vampialumno.data.api.DetalleAlumnoApi
import com.vampi.vampialumno.data.api.MateriaApi
import com.vampi.vampialumno.data.dto.DetalleAlumnoResponse
import com.vampi.vampialumno.data.dto.MateriasResponse
import com.vampi.vampialumno.domain.repository.MateriaRepository
import com.vampi.vampialumno.framework.api.ApiRequest
import javax.inject.Inject

class MateriaRepositoryImpl @Inject constructor(
    private val materiaApi: MateriaApi,
    private val networkHandler: NetworkHandler
) : MateriaRepository, ApiRequest{
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