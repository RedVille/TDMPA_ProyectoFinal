package com.vampi.vampialumno.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampialumno.domain.model.Materia

@JsonClass(generateAdapter = true)
data class MateriasResponse(val materias: List<Materia>? = listOf())
