
package com.example.mycity.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.mycity.data.model.Place
import com.example.mycity.ui.components.PlacePhoto
import java.text.NumberFormat
import java.util.Locale

private val BackgroundColor = Color(0xFFF6F7F9)
private val PrimaryColor = Color(0xFF245C50)

@Composable
fun PlaceDetailScreen(
    place: Place,
    onBackClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {

        // HEADER
        TextButton(
            onClick = onBackClick,
            modifier = Modifier.padding(horizontal = 16.dp),
            contentPadding = PaddingValues(
                horizontal = 0.dp,
                vertical = 6.dp
            )
        ) {
            Text(
                text = "‹  Kembali",
                color = PrimaryColor
            )
        }

        // DETAIL CONTENT
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {

            // DESTINATION PHOTO
            PlacePhoto(
                placeId = place.id,
                contentDescription = place.name,
                height = 250.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text(
                    text = place.category.displayName.uppercase(),
                    color = PrimaryColor,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = place.name,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF202A29),
                    lineHeight = 34.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = place.shortDescription,
                    fontSize = 14.sp,
                    color = Color(0xFF78817F),
                    lineHeight = 22.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                // DESCRIPTION
                DetailSection(
                    title = "Tentang Destinasi",
                    content = place.description
                )

                // ADDRESS
                DetailSection(
                    title = "Alamat",
                    content = place.address
                )

                // OPENING HOURS
                DetailSection(
                    title = "Jam Operasional",
                    content = place.openingHours
                )

                // PRICE
                DetailSection(
                    title = "Informasi Harga",
                    content = place.priceInformation
                )

                // FACILITIES
                if (place.facilities.isNotEmpty()) {

                    Text(
                        text = "Fasilitas",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF26332F)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )
                    ) {

                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {

                            place.facilities.forEach { facility ->

                                Text(
                                    text = "•  $facility",
                                    fontSize = 14.sp,
                                    color = Color(0xFF59635F),
                                    modifier = Modifier.padding(
                                        vertical = 5.dp
                                    )
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))
                }

                // MENU
                if (place.menuItems.isNotEmpty()) {

                    Text(
                        text = "Menu Tersedia",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF26332F)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )
                    ) {

                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {

                            place.menuItems.forEach { menu ->

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 8.dp),
                                    horizontalArrangement =
                                        Arrangement.SpaceBetween
                                ) {

                                    Text(
                                        text = menu.name,
                                        fontSize = 13.sp,
                                        color = Color(0xFF59635F),
                                        modifier = Modifier.weight(1f)
                                    )

                                    Spacer(
                                        modifier = Modifier.width(12.dp)
                                    )

                                    Text(
                                        text = "Rp ${
                                            NumberFormat.getNumberInstance(
                                                Locale("id", "ID")
                                            ).format(menu.price)
                                        }",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}

@Composable
private fun DetailSection(
    title: String,
    content: String
) {

    Column(
        modifier = Modifier.padding(bottom = 22.dp)
    ) {

        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF26332F)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {

            Text(
                text = content,
                modifier = Modifier.padding(16.dp),
                fontSize = 14.sp,
                color = Color(0xFF59635F),
                lineHeight = 23.sp
            )
        }
    }
}
