package com.ivasco.coffeeshop.local.roomDatabase

import com.ivasco.coffeeshop.ui.screens.homeScreen.viewModel.state.RecommendationDrinks
import javax.inject.Inject

class DrinkRepository @Inject constructor(
    private val drinkDao: DrinkDao
) {
    suspend fun upsertDrink(drink: RecommendationDrinks) = drinkDao.upsertDrink(drink)
    suspend fun deleteDrink(id: Int) = drinkDao.deleteDrink(id)
    suspend fun getAllFavDrinks() = drinkDao.getAllFavDrinks()
}