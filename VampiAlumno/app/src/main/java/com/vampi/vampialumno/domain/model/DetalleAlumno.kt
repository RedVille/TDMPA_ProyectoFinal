package com.vampi.vampialumno.domain.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class DetalleAlumno (
    @Json(name = "iddetalle_alumno")val idDetalleAlumno:  Int = 0,
    @Json(name = "idmateria")val idMateria:  Int = 0,
    val matricula:  Int = 0,
    val calif1: Double = 0.0,
    val calif2: Double = 0.0,
    val calif3: Double = 0.0
        ) : Parcelable