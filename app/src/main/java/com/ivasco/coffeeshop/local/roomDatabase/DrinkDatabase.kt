package com.ivasco.coffeeshop.local.roomDatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ivasco.coffeeshop.ui.screens.homeScreen.viewModel.state.RecommendationDrinks

@Database(entities = [RecommendationDrinks::class], version = 1)
abstract class DrinkDatabase : RoomDatabase() {
    abstract fun dao(): DrinkDao
}