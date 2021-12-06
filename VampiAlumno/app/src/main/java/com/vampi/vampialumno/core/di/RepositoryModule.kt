package com.vampi.vampialumno.core.di

import com.vampi.vampialumno.core.plataform.NetworkHandler
import com.vampi.vampialumno.data.api.UsuarioApi
import com.vampi.vampialumno.data.source.UsuarioRepositoryImpl
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
        networkHandler: NetworkHandler
    ): UsuarioRepository =
        UsuarioRepositoryImpl(
            apiProvider.getEndpoint(UsuarioApi::class.java),
            networkHandler
        )

}