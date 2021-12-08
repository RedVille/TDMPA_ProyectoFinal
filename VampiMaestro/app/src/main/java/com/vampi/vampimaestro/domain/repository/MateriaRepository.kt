package com.vampi.vampimaestro.domain.repository

import com.vampi.vampimaestro.core.exception.Failure
import com.vampi.vampimaestro.core.functional.Either
import com.vampi.vampimaestro.data.dto.MateriasResponse

interface MateriaRepository {

    fun getMateriaById(idMateria: Int): Either<Failure, MateriasResponse>

}