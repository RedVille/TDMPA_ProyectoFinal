package com.vampi.vampialumno.domain.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class Materia (
    @Json(name = "idmateria")val idMateria: Int = 0,
    val nombre: String = "",
    val descripcion: String = "",
    val foto: String = "",
    val horario: String = ""
        ) : Parcelable