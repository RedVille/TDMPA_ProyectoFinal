package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.domain.model.DetalleAlumno
import com.vampi.vampimaestro.domain.repository.DetalleAlumnoRepository
import javax.inject.Inject

class EditCalif @Inject constructor(private val detalleAlumnoRepository: DetalleAlumnoRepository) :
    UseCase<Int, DetalleAlumno>() {

    override suspend fun run(params: DetalleAlumno) = detalleAlumnoRepository.editCalif(params)

}