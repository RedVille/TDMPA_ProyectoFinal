package com.vampi.vampiappa.domain.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class Usuario (
    var matricula: Int = 0,
    var nombre: String = "",
    var apPaterno: String = "",
    var apMaterno: String = "",
    var correo: String = "",
    var contrasena: String = "",
    var foto: String = "",
    var tipo: String = ""
) : Parcelable