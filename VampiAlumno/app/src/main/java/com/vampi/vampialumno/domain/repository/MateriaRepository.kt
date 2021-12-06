package com.vampi.vampialumno.domain.repository

import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.functional.Either
import com.vampi.vampialumno.data.dto.MateriasResponse

interface MateriaRepository {
    fun getMateriaById(idMateria: Int): Either<Failure, MateriasResponse>
}