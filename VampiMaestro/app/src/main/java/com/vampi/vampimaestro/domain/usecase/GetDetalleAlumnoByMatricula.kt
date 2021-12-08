package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.data.dto.DetalleAlumnoResponse
import com.vampi.vampimaestro.domain.repository.DetalleAlumnoRepository
import javax.inject.Inject

class GetDetalleAlumnoByMatricula @Inject constructor(private val detalleAlumnoRepository: DetalleAlumnoRepository) :
    UseCase<DetalleAlumnoResponse, Int>() {

    override suspend fun run(params: Int) = detalleAlumnoRepository.getDetalleAlumnoByMatricula(params)

}