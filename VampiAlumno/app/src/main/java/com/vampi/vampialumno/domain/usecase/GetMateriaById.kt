package com.vampi.vampialumno.domain.usecase

import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.data.dto.MateriasResponse
import com.vampi.vampialumno.domain.repository.MateriaRepository
import javax.inject.Inject

class GetMateriaById @Inject constructor(private val materiaRepository: MateriaRepository):
    UseCase<MateriasResponse, Int>()
{
    override suspend fun run(params: Int) = materiaRepository.getMateriaById(params)
}