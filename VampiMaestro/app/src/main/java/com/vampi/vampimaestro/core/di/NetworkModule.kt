package com.vampi.vampimaestro.core.di

import android.content.Context
import com.vampi.vampimaestro.core.plataform.NetworkHandler
//import com.vampi.vampimaestro.framework.api.ApiProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
/*
    @Provides
    @Singleton
    fun provideApiProvider() = ApiProvider()*/

    @Provides
    @Singleton
    fun provideNetworkHandler(@ApplicationContext context: Context) = NetworkHandler(context)

}