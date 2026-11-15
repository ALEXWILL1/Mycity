
package com.example.mycity.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlacePhoto(
    placeId: Int,
    contentDescription: String,
    modifier: Modifier = Modifier,
    height: Dp = 180.dp
) {

    val context = LocalContext.current

    val imageName = PlaceImageProvider.getImageName(placeId)

    val imageResId = remember(placeId, context) {

        if (imageName != null) {

            context.resources.getIdentifier(
                imageName,
                "drawable",
                context.packageName
            )

        } else {
            0
        }
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFE6EEEB)),
        contentAlignment = Alignment.Center
    ) {

        if (imageResId != 0) {

            Image(
                painter = painterResource(id = imageResId),
                contentDescription = contentDescription,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        } else {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "📷",
                    fontSize = 32.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Foto destinasi",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF245C50)
                )

                Text(
                    text = imageName ?: "Foto belum tersedia",
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }
        }
    }
}
