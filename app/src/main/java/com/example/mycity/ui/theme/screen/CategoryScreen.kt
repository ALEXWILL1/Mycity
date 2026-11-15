
package com.example.mycity.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.mycity.data.model.Category

private val BackgroundColor = Color(0xFFF6F7F9)
private val PrimaryColor = Color(0xFF245C50)

@Composable
fun CategoryScreen(
    categories: List<Category>,
    placeCount: (Category) -> Int,
    onCategoryClick: (Category) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {

        // HEADER
        Column(
            modifier = Modifier.padding(
                start = 20.dp,
                end = 20.dp,
                top = 24.dp,
                bottom = 18.dp
            )
        ) {

            Text(
                text = "MYCITY",
                color = PrimaryColor,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 3.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Explore Yogyakarta",
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF202A29)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Temukan tempat menarik dan pengalaman baru di Yogyakarta.",
                fontSize = 14.sp,
                color = Color(0xFF78817F),
                lineHeight = 21.sp
            )
        }

        // SECTION TITLE
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Kategori Destinasi",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF202A29)
            )

            Text(
                text = "${categories.size} kategori",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }

        // CATEGORY GRID
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(
                start = 16.dp,
                end = 16.dp,
                top = 12.dp,
                bottom = 24.dp
            ),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            items(categories) { category ->

                CategoryCard(
                    category = category,
                    totalPlaces = placeCount(category),
                    onClick = {
                        onCategoryClick(category)
                    }
                )
            }
        }
    }
}

@Composable
private fun CategoryCard(
    category: Category,
    totalPlaces: Int,
    onClick: () -> Unit
) {

    val emoji = when (category) {
        Category.CAFE -> "☕"
        Category.LIBRARY -> "📚"
        Category.RECREATION_PARK -> "🎡"
        Category.MUSEUM -> "🏛️"
        Category.HISTORICAL_SITE -> "🏰"
        Category.NATURE -> "🌿"
        Category.CULINARY -> "🍜"
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = emoji,
                fontSize = 32.sp
            )

            Column {

                Text(
                    text = category.displayName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF26332F),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = category.description,
                    fontSize = 11.sp,
                    color = Color(0xFF78817F),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    lineHeight = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "$totalPlaces Destinasi →",
                    color = PrimaryColor,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
