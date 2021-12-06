package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.functional.Either
import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.data.dto.DetalleAlumnoResponse
import com.vampi.vampialumno.domain.repository.DetalleAlumnoRepository
import javax.inject.Inject

class GetDetalleAlumnoByMatricula @Inject constructor(private val detalleAlumnoRepository: DetalleAlumnoRepository):
    UseCase<DetalleAlumnoResponse, Int>()
{
    override suspend fun run(params: Int) = detalleAlumnoRepository.getDetalleAlumnoByMatricula(params)
}