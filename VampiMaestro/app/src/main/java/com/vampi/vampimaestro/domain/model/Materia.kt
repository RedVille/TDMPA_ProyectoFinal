package com.vampi.vampimaestro.domain.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class Materia(
    val idMateria: Int = 0,
    val nombre: String = "",
    val descripcion: String = "",
    val foto: String = "",
    val horario: String = ""
) : Parcelable