package com.vampi.vampimaestro.domain.usecase

import com.vampi.vampimaestro.core.interactor.UseCase
import com.vampi.vampimaestro.data.dto.DetalleMaestroResponse
import com.vampi.vampimaestro.domain.repository.DetalleMaestroRepository
import javax.inject.Inject

class GetDetalleMaestroByMatricula @Inject constructor(private val detalleMaestroRepository: DetalleMaestroRepository) :
    UseCase<DetalleMaestroResponse, Int>() {

    override suspend fun run(params: Int) = detalleMaestroRepository.getDetalleMaestroByMatricula(params)

}