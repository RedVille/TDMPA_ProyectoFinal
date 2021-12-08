package com.vampi.vampialumno.data.api

import com.vampi.vampialumno.data.dto.DetalleAlumnoResponse
import com.vampi.vampialumno.data.dto.UsuariosResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DetalleAlumnoApi {

    @GET("DetalleAlumno/matricula/{matricula}")
    fun getDetalleAlumnoByMatricula(@Path("matricula") matricula: Int): Call<DetalleAlumnoResponse>

}