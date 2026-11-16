
package com.example.mycity.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycity.ui.theme.MyCityColors

@Composable
fun PlacePhoto(
    placeId: Int,
    contentDescription: String,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(20.dp)
) {
    val context = LocalContext.current
    val imageName = PlaceImageProvider.getImageName(placeId)

    val imageResource = remember(imageName, context.packageName) {
        if (imageName == null) {
            0
        } else {
            context.resources.getIdentifier(
                imageName,
                "drawable",
                context.packageName
            )
        }
    }

    Box(
        modifier = modifier
            .clip(shape)
            .background(MyCityColors.Placeholder),
        contentAlignment = Alignment.Center
    ) {
        if (imageResource != 0) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = contentDescription,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        } else {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "MYCITY",
                    color = MyCityColors.Forest,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold,
                    letterSpacing = 2.sp
                )

                Text(
                    text = "Foto belum ditambahkan",
                    color = MyCityColors.Muted,
                    fontSize = 11.sp
                )
            }
        }
    }
}
