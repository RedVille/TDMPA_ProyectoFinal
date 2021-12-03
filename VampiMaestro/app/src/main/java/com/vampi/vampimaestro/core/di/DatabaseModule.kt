package com.vampi.vampimaestro.core.di

import android.content.Context
import androidx.room.Room
//import com.vampi.vampimaestro.framework.db.MealsDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

/*    @Provides
    @Singleton
    fun provideMealsDb(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, MealsDb::class.java, "meals").addMigrations().build()*/

}