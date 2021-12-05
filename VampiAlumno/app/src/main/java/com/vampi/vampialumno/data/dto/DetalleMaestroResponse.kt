package com.vampi.vampialumno.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampialumno.domain.model.DetalleMaestro

@JsonClass(generateAdapter = true)
data class DetalleMaestroResponse(val detalleMaestro: List<DetalleMaestro>? = listOf())
