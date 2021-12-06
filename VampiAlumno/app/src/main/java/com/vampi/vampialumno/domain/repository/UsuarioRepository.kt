package com.vampi.vampialumno.domain.repository

import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.functional.Either
import com.vampi.vampialumno.data.dto.UsuariosResponse
import com.vampi.vampialumno.domain.model.Usuario

interface UsuarioRepository {

    fun getUserByMatricula(matricula: Int): Either<Failure, UsuariosResponse>

    fun getLocalUser(): Either<Failure, Usuario>

    fun doLogout(): Either<Failure, Boolean>

    fun setLocalUser(usuario: Usuario): Either<Failure, Boolean>
}