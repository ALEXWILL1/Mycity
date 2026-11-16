
package com.example.mycity.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycity.data.model.Category
import com.example.mycity.ui.components.PlacePhoto
import com.example.mycity.ui.theme.MyCityColors

@Composable
fun CategoryScreen(
    categories: List<Category>,
    placeCount: (Category) -> Int,
    onCategoryClick: (Category) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MyCityColors.Cream)
            .statusBarsPadding()
            .navigationBarsPadding(),
        contentPadding = PaddingValues(
            start = 20.dp,
            end = 20.dp,
            top = 18.dp,
            bottom = 30.dp
        ),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(43.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(MyCityColors.Forest),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "M",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }

                Spacer(modifier = Modifier.width(11.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "MYCITY",
                        color = MyCityColors.Forest,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.ExtraBold,
                        letterSpacing = 1.8.sp
                    )
                    Text(
                        text = "JELAJAHI YOGYAKARTA",
                        color = MyCityColors.Muted,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Medium,
                        letterSpacing = 1.2.sp
                    )
                }

                Text(
                    text = "LOCAL GUIDE",
                    color = MyCityColors.Forest,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(MyCityColors.Sage)
                        .padding(horizontal = 11.dp, vertical = 8.dp)
                )
            }
        }

        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = "Temukan sisi menarik\ndari Yogyakarta.",
                    color = MyCityColors.Ink,
                    fontSize = 29.sp,
                    lineHeight = 35.sp,
                    fontWeight = FontWeight.ExtraBold
                )

                Text(
                    text = "Pilih kategori, temukan tempat, dan rencanakan kunjunganmu.",
                    color = MyCityColors.Muted,
                    fontSize = 13.sp,
                    lineHeight = 20.sp
                )
            }
        }

        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .clip(RoundedCornerShape(24.dp))
            ) {
                PlacePhoto(
                    placeId = 18,
                    contentDescription = "Pantai Parangtritis",
                    modifier = Modifier.fillMaxSize(),
                    shape = RoundedCornerShape(24.dp)
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black.copy(alpha = 0.72f)
                                )
                            )
                        )
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(18.dp),
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "REKOMENDASI DESTINASI",
                        color = Color.White.copy(alpha = 0.85f),
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.5.sp
                    )

                    Text(
                        text = "Pantai Parangtritis",
                        color = Color.White,
                        fontSize = 21.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Jelajahi keindahan alam Yogyakarta",
                        color = Color.White.copy(alpha = 0.9f),
                        fontSize = 11.sp
                    )
                }
            }
        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Jelajahi kategori",
                        color = MyCityColors.Ink,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Temukan tempat sesuai minatmu",
                        color = MyCityColors.Muted,
                        fontSize = 12.sp
                    )
                }

                Text(
                    text = "${categories.size} KATEGORI",
                    color = MyCityColors.Forest,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.8.sp
                )
            }
        }

        items(categories.chunked(2)) { categoryRow ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                categoryRow.forEach { category ->
                    CategoryCard(
                        category = category,
                        totalPlaces = placeCount(category),
                        modifier = Modifier.weight(1f),
                        onClick = { onCategoryClick(category) }
                    )
                }

                if (categoryRow.size == 1) {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }

        item {
            Text(
                text = "MYCITY  |  YOUR LOCAL GUIDE",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp),
                color = MyCityColors.Muted,
                fontSize = 9.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.2.sp
            )
        }
    }
}

@Composable
private fun CategoryCard(
    category: Category,
    totalPlaces: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val (symbol, tint) = when (category) {
        Category.CAFE -> "\u2615" to Color(0xFFF2E7D8)
        Category.LIBRARY -> "\uD83D\uDCDA" to Color(0xFFE5ECF5)
        Category.RECREATION_PARK -> "\uD83C\uDFA1" to Color(0xFFF5EBD9)
        Category.MUSEUM -> "\uD83C\uDFFA" to Color(0xFFECE5F2)
        Category.HISTORICAL_SITE -> "\uD83C\uDFF0" to Color(0xFFF2E7DF)
        Category.NATURE -> "\uD83C\uDF3F" to Color(0xFFE1EEE4)
        Category.CULINARY -> "\uD83C\uDF5C" to Color(0xFFF5E4DD)
    }

    Card(
        modifier = modifier
            .height(174.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(21.dp),
        colors = CardDefaults.cardColors(
            containerColor = MyCityColors.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .size(43.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(tint),
                contentAlignment = Alignment.Center
            ) {
                Text(text = symbol, fontSize = 23.sp)
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(
                    text = category.displayName,
                    color = MyCityColors.Ink,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = category.description,
                    color = MyCityColors.Muted,
                    fontSize = 10.sp,
                    lineHeight = 14.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = "$totalPlaces tempat  >",
                    color = MyCityColors.Forest,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
