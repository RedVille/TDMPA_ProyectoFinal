package com.vampi.vampimaestro.core.di

//import com.vampi.vampimaestro.core.plataform.AuthManager
//import com.vampi.vampimaestro.core.plataform.NetworkHandler
//import com.vampi.vampimaestro.data.api.CategoryApi
//import com.vampi.vampimaestro.data.api.MealApi
//import com.vampi.vampimaestro.data.source.CategoryRepositoryImpl
//import com.vampi.vampimaestro.data.source.MealRepositoryImpl
//import com.vampi.vampimaestro.data.source.UserRepositoryImpl
//import com.vampi.vampimaestro.domain.repository.CategoryRepository
//import com.vampi.vampimaestro.domain.repository.MealRepository
//import com.vampi.vampimaestro.domain.repository.UserRepository
//import com.vampi.vampimaestro.framework.api.ApiProvider
//import com.vampi.vampimaestro.framework.db.MealsDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    /*@Provides
    @Singleton
    fun provideCategoryRepository(
        apiProvider: ApiProvider,
        mealsDb: MealsDb,
        networkHandler: NetworkHandler
    ): CategoryRepository =
        CategoryRepositoryImpl(
            apiProvider.getEndpoint(CategoryApi::class.java),
            mealsDb.categoryDao(),
            networkHandler
        )

    @Provides
    @Singleton
    fun provideMealRepository(
        apiProvider: ApiProvider,
        mealsDb: MealsDb,
        networkHandler: NetworkHandler
    ): MealRepository =
        MealRepositoryImpl(
            apiProvider.getEndpoint(MealApi::class.java),
            mealsDb.mealDao(),
            mealsDb.userMealLikesDao(),
            networkHandler
        )

    @Provides
    @Singleton
    fun provideUserRepository(authManager: AuthManager, mealsDb: MealsDb): UserRepository =
        UserRepositoryImpl(authManager, mealsDb.userDao())*/

}