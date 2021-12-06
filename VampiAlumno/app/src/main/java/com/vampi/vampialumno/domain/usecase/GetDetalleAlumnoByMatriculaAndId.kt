package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.data.dto.DetalleAlumnoResponse
import com.vampi.vampialumno.domain.model.DetalleAlumno
import com.vampi.vampialumno.domain.repository.DetalleAlumnoRepository
import javax.inject.Inject

class GetDetalleAlumnoByMatriculaAndId @Inject constructor(private val detalleAlumnoRepository: DetalleAlumnoRepository):
    UseCase<DetalleAlumnoResponse, DetalleAlumno>()
{
    override suspend fun run(params: DetalleAlumno) = detalleAlumnoRepository.getDetalleAlumnoByMatriculaAndId(params.matricula, params.idMateria)
}