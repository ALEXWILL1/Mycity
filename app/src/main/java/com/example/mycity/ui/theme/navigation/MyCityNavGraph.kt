
package com.example.mycity.ui.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

import com.example.mycity.data.model.Category
import com.example.mycity.data.repository.PlaceRepository
import com.example.mycity.ui.screens.CategoryScreen
import com.example.mycity.ui.screens.PlaceListScreen
import com.example.mycity.ui.screens.PlaceDetailScreen

@Composable
fun MyCityNavGraph() {

    val navController = rememberNavController()

    val repository = remember {
        PlaceRepository()
    }

    NavHost(
        navController = navController,
        startDestination = "categories"
    ) {

        // PAGE 1: CATEGORY
        composable(
            route = "categories"
        ) {

            CategoryScreen(
                categories = repository.getCategories(),

                placeCount = { category ->
                    repository.getPlacesByCategory(category).size
                },

                onCategoryClick = { category ->

                    navController.navigate(
                        "places/${category.name}"
                    )
                }
            )
        }

        // PAGE 2: PLACE LIST
        composable(
            route = "places/{categoryName}",
            arguments = listOf(
                navArgument("categoryName") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val categoryName = backStackEntry
                .arguments
                ?.getString("categoryName")

            val category = Category.entries.find {
                it.name == categoryName
            }

            if (category != null) {

                val places = remember(category) {
                    repository.getPlacesByCategory(category)
                }

                PlaceListScreen(
                    category = category,
                    places = places,

                    onBackClick = {
                        navController.popBackStack()
                    },

                    onPlaceClick = { place ->

                        navController.navigate(
                            "detail/${place.id}"
                        )
                    }
                )

            } else {

                DataNotFoundScreen {
                    navController.popBackStack()
                }
            }
        }

        // PAGE 3: PLACE DETAIL
        composable(
            route = "detail/{placeId}",
            arguments = listOf(
                navArgument("placeId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->

            val placeId = backStackEntry
                .arguments
                ?.getInt("placeId")

            val place = placeId?.let {
                repository.getPlaceById(it)
            }

            if (place != null) {

                PlaceDetailScreen(
                    place = place,

                    onBackClick = {
                        navController.popBackStack()
                    }
                )

            } else {

                DataNotFoundScreen {
                    navController.popBackStack()
                }
            }
        }
    }
}

@Composable
private fun DataNotFoundScreen(
    onBackClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Data tidak ditemukan",
            style = MaterialTheme.typography.titleLarge
        )

        Button(
            onClick = onBackClick,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Kembali")
        }
    }
}
