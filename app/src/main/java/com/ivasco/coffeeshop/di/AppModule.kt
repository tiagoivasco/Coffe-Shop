package com.ivasco.coffeeshop.di

import android.content.Context
import androidx.room.Room
import com.ivasco.coffeeshop.local.roomDatabase.DrinkDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDrinkDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, DrinkDatabase::class.java, "favorite_drinks_db").build()

    @Provides
    @Singleton
    fun provideDrinkDao(db: DrinkDatabase) = db.dao()


}