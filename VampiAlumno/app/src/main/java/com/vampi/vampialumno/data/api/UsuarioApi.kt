package com.vampi.vampialumno.data.api

import com.vampi.vampialumno.data.dto.UsuariosResponse
import com.vampi.vampialumno.domain.model.Usuario
import retrofit2.Call
import retrofit2.http.*

interface UsuarioApi {

    @GET("Usuario/{matricula}")
    fun getUserByMatricula(@Path("matricula") matricula: Int): Call<UsuariosResponse>

    @PUT("Usuario")
    fun editUser(@Body usuario: Usuario): Call<Int>

}