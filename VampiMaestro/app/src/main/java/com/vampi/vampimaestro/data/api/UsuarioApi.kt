package com.vampi.vampimaestro.data.api

import com.vampi.vampimaestro.data.dto.UsuariosResponse
import com.vampi.vampimaestro.domain.model.Usuario
import retrofit2.Call
import retrofit2.http.*

interface UsuarioApi {

    @GET("Usuario/{matricula}")
    fun getUserByMatricula(@Path("matricula") matricula: Int): Call<UsuariosResponse>

    @Headers("Content-Type: application/json")
    @PUT("Usuario/")
    fun editUser(@Body usuario: Usuario): Call<Int>

}