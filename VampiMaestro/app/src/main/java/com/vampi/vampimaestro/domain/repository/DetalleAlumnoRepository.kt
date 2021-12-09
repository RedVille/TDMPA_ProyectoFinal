package com.vampi.vampimaestro.domain.repository

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.data.dto.DetalleAlumnoResponse
import com.vampi.vampimaestro.domain.model.DetalleAlumno

interface DetalleAlumnoRepository {

    fun getDetalleAlumnoByIdMateria(idMateria: Int): Either<Failure, DetalleAlumnoResponse>

    fun editCalif(detalleAlumno: DetalleAlumno): Either<Failure, Int>

}