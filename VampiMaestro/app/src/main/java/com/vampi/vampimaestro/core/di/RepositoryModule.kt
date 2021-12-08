package com.vampi.vampimaestro.core.di

import com.vampi.vampimaestro.core.plataform.AuthManager
import com.vampi.vampimaestro.core.plataform.NetworkHandler
import com.vampi.vampimaestro.data.api.DetalleAlumnoApi
import com.vampi.vampimaestro.data.api.DetalleMaestroApi
import com.vampi.vampimaestro.data.api.MateriaApi
import com.vampi.vampimaestro.data.api.UsuarioApi
import com.vampi.vampimaestro.data.source.DetalleAlumnoRepositoryImpl
import com.vampi.vampimaestro.data.source.DetalleMaestroRepositoryImpl
import com.vampi.vampimaestro.data.source.MateriaRepositoryImpl
import com.vampi.vampimaestro.data.source.UsuarioRepositoryImpl
import com.vampi.vampimaestro.domain.repository.DetalleAlumnoRepository
import com.vampi.vampimaestro.domain.repository.DetalleMaestroRepository
import com.vampi.vampimaestro.domain.repository.MateriaRepository
import com.vampi.vampimaestro.domain.repository.UsuarioRepository
import com.vampi.vampimaestro.framework.api.ApiProvider
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

    @Provides
    @Singleton
    fun provideDetalleMaestroRepository(
        apiProvider: ApiProvider,
        networkHandler: NetworkHandler
    ): DetalleMaestroRepository =
        DetalleMaestroRepositoryImpl(
            apiProvider.getEndpoint(DetalleMaestroApi::class.java),
            networkHandler
        )

}