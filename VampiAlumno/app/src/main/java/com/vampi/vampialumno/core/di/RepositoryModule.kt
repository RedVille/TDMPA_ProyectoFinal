package com.vampi.vampialumno.core.di

import com.vampi.vampialumno.core.plataform.AuthManager
import com.vampi.vampialumno.core.plataform.NetworkHandler
import com.vampi.vampialumno.data.api.DetalleAlumnoApi
import com.vampi.vampialumno.data.api.MateriaApi
import com.vampi.vampialumno.data.api.UsuarioApi
import com.vampi.vampialumno.data.source.DetalleAlumnoRepositoryImpl
import com.vampi.vampialumno.data.source.MateriaRepositoryImpl
import com.vampi.vampialumno.data.source.UsuarioRepositoryImpl
import com.vampi.vampialumno.domain.repository.DetalleAlumnoRepository
import com.vampi.vampialumno.domain.repository.MateriaRepository
import com.vampi.vampialumno.domain.repository.UsuarioRepository
import com.vampi.vampialumno.framework.api.ApiProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideUsuarioRepository(
        apiProvider: ApiProvider,
        networkHandler: NetworkHandler,
        authManager: AuthManager
    ): UsuarioRepository =
        UsuarioRepositoryImpl(
            apiProvider.getEndpoint(UsuarioApi::class.java),
            networkHandler,
            authManager
        )

    @Provides
    @Singleton
    fun provideMateriaRepository(
        apiProvider: ApiProvider,
        networkHandler: NetworkHandler
    ): MateriaRepository =
        MateriaRepositoryImpl(
            apiProvider.getEndpoint(MateriaApi::class.java),
            networkHandler
        )

    @Provides
    @Singleton
    fun provideDetalleAlumnoRepository(
        apiProvider: ApiProvider,
        networkHandler: NetworkHandler
    ): DetalleAlumnoRepository =
        DetalleAlumnoRepositoryImpl(
            apiProvider.getEndpoint(DetalleAlumnoApi::class.java),
            networkHandler
        )

}