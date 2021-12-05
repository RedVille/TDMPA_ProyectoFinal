package com.vampi.vampialumno.data.dto

import com.squareup.moshi.JsonClass
import com.vampi.vampialumno.domain.model.Usuario

@JsonClass(generateAdapter = true)
data class UsuariosResponse(val usuarios: List<Usuario>? = listOf())
