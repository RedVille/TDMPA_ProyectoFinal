package com.vampi.vampimaestro.data.api

import com.vampi.vampimaestro.data.dto.DetalleAlumnoResponse
import com.vampi.vampimaestro.data.dto.UsuariosResponse
import com.vampi.vampimaestro.domain.model.DetalleAlumno
import com.vampi.vampimaestro.domain.model.Usuario
import retrofit2.Call
import retrofit2.http.*

interface DetalleAlumnoApi {

    @GET("DetalleAlumno/idMateria/{idMateria}")
    fun getDetalleAlumnoByIdMateria(@Path("idMateria") idMateria: Int): Call<DetalleAlumnoResponse>

    @Headers("Content-Type: application/json")
    @PUT("DetalleAlumno/")
    fun editCalif(@Body detalleAlumno: DetalleAlumno): Call<Int>

}