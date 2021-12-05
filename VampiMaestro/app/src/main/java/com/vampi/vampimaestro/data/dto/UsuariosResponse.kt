package com.vampi.vampimaestro.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampimaestro.domain.model.Usuario

@JsonClass(generateAdapter = true)
data class UsuariosResponse(val usuarios: List<Usuario>? = listOf())
