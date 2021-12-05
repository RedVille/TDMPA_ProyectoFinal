package com.vampi.vampimaestro.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampimaestro.domain.model.DetalleMaestro

@JsonClass(generateAdapter = true)
data class DetalleMaestroResponse(val detalleMaestro: List<DetalleMaestro>? = listOf())
