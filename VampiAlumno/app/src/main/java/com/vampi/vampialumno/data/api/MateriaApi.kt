package com.vampi.vampialumno.data.api

import com.vampi.vampialumno.data.dto.MateriasResponse
import com.vampi.vampialumno.data.dto.UsuariosResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MateriaApi {
    @GET("Materia/{idMateria}")
    fun getMateriaById(@Path("idMateria") idMateria: Int): Call<MateriasResponse>
}