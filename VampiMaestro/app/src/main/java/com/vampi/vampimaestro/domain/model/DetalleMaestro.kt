package com.vampi.vampimaestro.domain.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class DetalleMaestro(
    @Json(name = "iddetalle_maestro") val idDetalleMaestro: Int = 0,
    @Json(name = "idmateria") val idMateria: Int = 0,
    val matricula: Int = 0
) : Parcelable