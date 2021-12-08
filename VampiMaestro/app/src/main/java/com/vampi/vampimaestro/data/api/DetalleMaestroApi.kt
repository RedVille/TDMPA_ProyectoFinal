package com.vampi.vampimaestro.data.api

import com.vampi.vampimaestro.data.dto.DetalleMaestroResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DetalleMaestroApi {

    @GET("DetalleMaestro/{matricula}")
    fun getDetalleMaestroByMatricula(@Path("matricula") matricula: Int): Call<DetalleMaestroResponse>

}