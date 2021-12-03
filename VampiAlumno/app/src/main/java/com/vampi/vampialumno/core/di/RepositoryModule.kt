package com.vampi.vampialumno.core.di

/*import com.vampi.vampialumno.core.plataform.AuthManager
import com.vampi.vampialumno.core.plataform.NetworkHandler
import com.vampi.vampialumno.data.api.CategoryApi
import com.vampi.vampialumno.data.api.MealApi
import com.vampi.vampialumno.data.source.CategoryRepositoryImpl
import com.vampi.vampialumno.data.source.MealRepositoryImpl
import com.vampi.vampialumno.data.source.UserRepositoryImpl
import com.vampi.vampialumno.domain.repository.CategoryRepository
import com.vampi.vampialumno.domain.repository.MealRepository
import com.vampi.vampialumno.domain.repository.UserRepository
import com.vampi.vampialumno.framework.api.ApiProvider
import com.vampi.vampialumno.framework.db.MealsDb*/
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