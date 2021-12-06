package com.vampi.vampimaestro.domain.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class DetalleAlumno(
    val idDetalleAlumno: Int = 0,
    val idMateria: Int = 0,
    val matricula: Int = 0,
    val calif1: Double = 0.0,
    val calif2: Double = 0.0,
    val calif3: Double = 0.0
) : Parcelable