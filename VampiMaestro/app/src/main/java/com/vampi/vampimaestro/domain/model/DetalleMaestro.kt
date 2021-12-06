package com.vampi.vampimaestro.domain.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class DetalleMaestro(
    val idDetalleMaestro: Int = 0,
    val idMateria: Int = 0,
    val matricula: Int = 0
) : Parcelable