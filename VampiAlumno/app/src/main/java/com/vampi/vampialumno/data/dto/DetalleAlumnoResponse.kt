package com.vampi.vampialumno.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampialumno.domain.model.DetalleAlumno

@JsonClass(generateAdapter = true)
data class DetalleAlumnoResponse(val detalleAlumnos: List<DetalleAlumno>? = listOf())
