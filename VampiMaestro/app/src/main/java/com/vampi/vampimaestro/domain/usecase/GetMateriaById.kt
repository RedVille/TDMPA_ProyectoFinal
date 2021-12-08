package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.data.dto.MateriasResponse
import com.vampi.vampimaestro.domain.repository.MateriaRepository
import javax.inject.Inject

class GetMateriaById @Inject constructor(private val materiaRepository: MateriaRepository) :
    UseCase<MateriasResponse, Int>() {

    override suspend fun run(params: Int) = materiaRepository.getMateriaById(params)

}