
package com.example.mycity.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.mycity.data.model.Category
import com.example.mycity.data.model.Place
import com.example.mycity.ui.components.PlacePhoto

private val BackgroundColor = Color(0xFFF6F7F9)
private val PrimaryColor = Color(0xFF245C50)

@Composable
fun PlaceListScreen(
    category: Category,
    places: List<Place>,
    onBackClick: () -> Unit,
    onPlaceClick: (Place) -> Unit
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
                top = 12.dp,
                bottom = 16.dp
            )
        ) {

            TextButton(
                onClick = onBackClick,
                contentPadding = PaddingValues(
                    horizontal = 0.dp,
                    vertical = 4.dp
                )
            ) {
                Text(
                    text = "‹  Kembali",
                    color = PrimaryColor
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = category.displayName,
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF202A29)
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = category.description,
                fontSize = 13.sp,
                color = Color(0xFF78817F),
                lineHeight = 20.sp
            )

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = "${places.size} Destinasi Ditemukan",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryColor
            )
        }

        // PLACE LIST
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(
                start = 16.dp,
                end = 16.dp,
                bottom = 24.dp
            ),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            items(
                items = places,
                key = { it.id }
            ) { place ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onPlaceClick(place)
                        },
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp
                    )
                ) {

                    Column {

                        PlacePhoto(
                            placeId = place.id,
                            contentDescription = place.name,
                            height = 170.dp,
                            modifier = Modifier.fillMaxWidth()
                        )

                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {

                            Text(
                                text = place.name,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF26332F)
                            )

                            Spacer(
                                modifier = Modifier.height(7.dp)
                            )

                            Text(
                                text = place.shortDescription,
                                fontSize = 13.sp,
                                color = Color(0xFF78817F),
                                lineHeight = 20.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )

                            Spacer(
                                modifier = Modifier.height(12.dp)
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {

                                Text(
                                    text = "Lihat Detail  →",
                                    color = PrimaryColor,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
