package com.ivasco.coffeeshop.local.roomDatabase

import androidx.room.*
import com.ivasco.coffeeshop.ui.screens.homeScreen.viewModel.state.RecommendationDrinks

@Dao
interface DrinkDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertDrink(drink: RecommendationDrinks)

    @Query("DELETE FROM favorite_drinks_db WHERE id = :id")
    suspend fun deleteDrink(id: Int)

    @Query("SELECT * FROM favorite_drinks_db")
    suspend fun getAllFavDrinks(): List<RecommendationDrinks>
}