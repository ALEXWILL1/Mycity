
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycity.data.model.Category
import com.example.mycity.data.model.Place
import com.example.mycity.ui.components.PlacePhoto
import com.example.mycity.ui.theme.MyCityColors

@Composable
fun PlaceListScreen(
    category: Category,
    places: List<Place>,
    onBackClick: () -> Unit,
    onPlaceClick: (Place) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MyCityColors.Cream)
            .navigationBarsPadding(),
        contentPadding = PaddingValues(bottom = 28.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MyCityColors.Cream)
                    .statusBarsPadding()
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 10.dp
                    )
            ) {
                TextButton(
                    onClick = onBackClick,
                    contentPadding = PaddingValues(
                        horizontal = 0.dp,
                        vertical = 5.dp
                    )
                ) {
                    Text(
                        text = "<  Kembali ke kategori",
                        color = MyCityColors.Forest,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "PILIHAN DESTINASI",
                    color = MyCityColors.Green,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.7.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = category.displayName,
                    color = MyCityColors.Ink,
                    fontSize = 29.sp,
                    fontWeight = FontWeight.ExtraBold
                )

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = category.description,
                    color = MyCityColors.Muted,
                    fontSize = 13.sp,
                    lineHeight = 20.sp
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(MyCityColors.Sage)
                        .padding(horizontal = 13.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "${places.size} DESTINASI TERSEDIA",
                        color = MyCityColors.Forest,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.7.sp
                    )
                }
            }
        }

        items(
            items = places,
            key = { it.id }
        ) { place ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .clickable {
                        onPlaceClick(place)
                    },
                shape = RoundedCornerShape(23.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MyCityColors.White
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp
                )
            ) {
                Column {
                    Box {
                        PlacePhoto(
                            placeId = place.id,
                            contentDescription = place.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(190.dp),
                            shape = RoundedCornerShape(
                                topStart = 23.dp,
                                topEnd = 23.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp
                            )
                        )

                        Text(
                            text = category.displayName.uppercase(),
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(13.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .background(Color.White.copy(alpha = 0.94f))
                                .padding(
                                    horizontal = 11.dp,
                                    vertical = 7.dp
                                ),
                            color = MyCityColors.Forest,
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.8.sp
                        )
                    }

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = place.name,
                            color = MyCityColors.Ink,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = place.shortDescription,
                            color = MyCityColors.Muted,
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "LIHAT DETAIL",
                                color = MyCityColors.Forest,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.ExtraBold,
                                letterSpacing = 1.sp,
                                modifier = Modifier.weight(1f)
                            )

                            Text(
                                text = ">",
                                color = MyCityColors.Forest,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }

        item {
            Text(
                text = "Informasi destinasi bersumber dari data lokal MyCity.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                color = MyCityColors.Muted,
                fontSize = 10.sp
            )
        }
    }
}
