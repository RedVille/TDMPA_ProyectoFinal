package com.vampi.vampimaestro.data.api

import com.vampi.vampimaestro.data.dto.DetalleAlumnoResponse
import com.vampi.vampimaestro.data.dto.UsuariosResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DetalleAlumnoApi {

    @GET("DetalleAlumno/matricula/{matricula}")
    fun getDetalleAlumnoByMatricula(@Path("matricula") matricula: Int): Call<DetalleAlumnoResponse>

}