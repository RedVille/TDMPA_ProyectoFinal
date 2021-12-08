package com.vampi.vampimaestro.domain.repository

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.data.dto.DetalleMaestroResponse

interface DetalleMaestroRepository {

    fun getDetalleMaestroByMatricula(matricula: Int): Either<Failure, DetalleMaestroResponse>

}