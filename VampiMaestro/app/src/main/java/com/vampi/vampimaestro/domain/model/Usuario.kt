package com.vampi.vampimaestro.domain.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class Usuario(
    val matricula: Int = 0,
    val nombre: String = "",
    @Json(name = "appaterno") val apPaterno: String = "",
    @Json(name = "apmaterno") val apMaterno: String = "",
    val correo: String = "",
    val contrasena: String = "",
    val foto: String = "",
    val tipo: String = ""
) : Parcelable