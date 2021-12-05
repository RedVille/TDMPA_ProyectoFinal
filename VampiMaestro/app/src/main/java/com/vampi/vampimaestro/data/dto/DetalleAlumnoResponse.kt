package com.vampi.vampimaestro.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampimaestro.domain.model.DetalleAlumno

@JsonClass(generateAdapter = true)
data class DetalleAlumnoResponse(val detalleAlumno: List<DetalleAlumno>? = listOf())
