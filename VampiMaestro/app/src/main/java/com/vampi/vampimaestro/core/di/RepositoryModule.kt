package com.vampi.vampimaestro.core.di

import com.vampi.vampimaestro.core.plataform.NetworkHandler
import com.vampi.vampimaestro.data.api.UsuarioApi
import com.vampi.vampimaestro.data.source.UsuarioRepositoryImpl
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
        networkHandler: NetworkHandler
    ): UsuarioRepository =
        UsuarioRepositoryImpl(
            apiProvider.getEndpoint(UsuarioApi::class.java),
            networkHandler
        )

}