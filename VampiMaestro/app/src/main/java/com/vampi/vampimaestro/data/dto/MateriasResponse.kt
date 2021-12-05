package com.vampi.vampimaestro.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampimaestro.domain.model.Materia

@JsonClass(generateAdapter = true)
data class MateriasResponse(val materias: List<Materia>? = listOf())
