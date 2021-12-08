package com.vampi.vampimaestro.data.api

import com.vampi.vampimaestro.data.dto.MateriasResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MateriaApi {

    @GET("Materia/{idMateria}")
    fun getMateriaById(@Path("idMateria") idMateria: Int): Call<MateriasResponse>


}