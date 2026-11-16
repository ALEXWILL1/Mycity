
package com.example.mycity.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycity.data.model.Place
import com.example.mycity.ui.components.PlacePhoto
import com.example.mycity.ui.theme.MyCityColors
import java.text.NumberFormat
import java.util.Locale

@Composable
fun PlaceDetailScreen(
    place: Place,
    onBackClick: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MyCityColors.Cream)
            .navigationBarsPadding(),
        contentPadding = PaddingValues(bottom = 32.dp)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(310.dp)
            ) {
                PlacePhoto(
                    placeId = place.id,
                    contentDescription = place.name,
                    modifier = Modifier.fillMaxSize(),
                    shape = RoundedCornerShape(
                        bottomStart = 30.dp,
                        bottomEnd = 30.dp
                    )
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Black.copy(alpha = 0.38f),
                                    Color.Transparent,
                                    Color.Black.copy(alpha = 0.58f)
                                )
                            )
                        )
                )

                TextButton(
                    onClick = onBackClick,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .statusBarsPadding()
                        .padding(start = 18.dp, top = 8.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.94f)),
                    contentPadding = PaddingValues(
                        horizontal = 16.dp,
                        vertical = 9.dp
                    )
                ) {
                    Text(
                        text = "<  Kembali",
                        color = MyCityColors.Forest,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(
                            start = 22.dp,
                            end = 22.dp,
                            bottom = 23.dp
                        )
                ) {
                    Text(
                        text = place.category.displayName.uppercase(),
                        color = Color.White.copy(alpha = 0.9f),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.7.sp
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = place.name,
                        color = Color.White,
                        fontSize = 27.sp,
                        lineHeight = 33.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
        }

        item {
            Column(
                modifier = Modifier.padding(
                    horizontal = 20.dp,
                    vertical = 22.dp
                )
            ) {
                Text(
                    text = "KENALI DESTINASI",
                    color = MyCityColors.Green,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = place.shortDescription,
                    color = MyCityColors.Ink,
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(22.dp))

                DetailInfoCard(
                    title = "Tentang tempat ini",
                    content = place.description
                )

                Spacer(modifier = Modifier.height(13.dp))

                DetailInfoCard(
                    title = "Alamat",
                    content = place.address,
                    leading = "LOC"
                )

                Spacer(modifier = Modifier.height(13.dp))

                DetailInfoCard(
                    title = "Jam operasional",
                    content = place.openingHours,
                    leading = "JAM"
                )

                Spacer(modifier = Modifier.height(13.dp))

                DetailInfoCard(
                    title = "Informasi harga",
                    content = place.priceInformation,
                    leading = "RP"
                )
            }
        }

        if (place.facilities.isNotEmpty()) {
            item {
                Column(
                    modifier = Modifier.padding(horizontal = 20.dp)
                ) {
                    SectionTitle(
                        title = "Fasilitas",
                        subtitle = "Yang tersedia di lokasi"
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MyCityColors.White
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 1.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(17.dp)
                        ) {
                            place.facilities.forEach { facility ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 7.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(7.dp)
                                            .clip(CircleShape)
                                            .background(MyCityColors.Green)
                                    )

                                    Spacer(modifier = Modifier.width(11.dp))

                                    Text(
                                        text = facility,
                                        color = MyCityColors.Ink,
                                        fontSize = 13.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        if (place.menuItems.isNotEmpty()) {
            item {
                Column(
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 22.dp
                    )
                ) {
                    SectionTitle(
                        title = "Menu pilihan",
                        subtitle = "Beberapa pilihan yang tercatat"
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MyCityColors.White
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 1.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(
                                horizontal = 17.dp,
                                vertical = 5.dp
                            )
                        ) {
                            place.menuItems.forEachIndexed { index, menu ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 13.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = menu.name,
                                        color = MyCityColors.Ink,
                                        fontSize = 13.sp,
                                        modifier = Modifier.weight(1f)
                                    )

                                    Spacer(modifier = Modifier.width(12.dp))

                                    Text(
                                        text = formatRupiah(menu.price),
                                        color = MyCityColors.Forest,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }

                                if (index != place.menuItems.lastIndex) {
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(1.dp)
                                            .background(MyCityColors.Line)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        item {
            Text(
                text = "MYCITY  |  YOUR LOCAL GUIDE",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 18.dp),
                color = MyCityColors.Muted,
                fontSize = 9.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.2.sp
            )
        }
    }
}

@Composable
private fun DetailInfoCard(
    title: String,
    content: String,
    leading: String = "INFO"
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = MyCityColors.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp
        )
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(11.dp))
                    .background(MyCityColors.Mint)
                    .padding(
                        horizontal = 9.dp,
                        vertical = 8.dp
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = leading,
                    color = MyCityColors.Forest,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }

            Spacer(modifier = Modifier.width(13.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    color = MyCityColors.Ink,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = content,
                    color = MyCityColors.Muted,
                    fontSize = 12.sp,
                    lineHeight = 19.sp
                )
            }
        }
    }
}

@Composable
private fun SectionTitle(
    title: String,
    subtitle: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            color = MyCityColors.Ink,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = subtitle,
            color = MyCityColors.Muted,
            fontSize = 12.sp
        )
    }
}

private fun formatRupiah(value: Int): String {
    return NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        .format(value)
        .replace(",00", "")
}
