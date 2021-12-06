package com.vampi.vampialumno.domain.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class Usuario (
    val matricula: Int = 0,
    val nombre: String = "",
    val apPaterno: String = "",
    val apMaterno: String = "",
    val correo: String = "",
    val contrasena: String = "",
    val foto: String = "",
    val tipo: String = ""
) : Parcelable