
package com.example.mycity.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = MyCityColors.Forest,
    onPrimary = MyCityColors.White,
    primaryContainer = MyCityColors.Sage,
    onPrimaryContainer = MyCityColors.ForestDark,
    secondary = MyCityColors.Green,
    onSecondary = MyCityColors.White,
    tertiary = MyCityColors.Gold,
    background = MyCityColors.Cream,
    onBackground = MyCityColors.Ink,
    surface = MyCityColors.White,
    onSurface = MyCityColors.Ink,
    surfaceVariant = MyCityColors.Mint,
    onSurfaceVariant = MyCityColors.Muted,
    outline = MyCityColors.Line
)

private val DarkColorScheme = darkColorScheme(
    primary = MyCityColors.Sage,
    onPrimary = MyCityColors.ForestDark,
    secondary = MyCityColors.Green,
    tertiary = MyCityColors.Gold,
    background = MyCityColors.ForestDark,
    surface = MyCityColors.Forest,
    onSurface = MyCityColors.White
)

@Composable
fun MyCityTheme(
    darkTheme: Boolean = false,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
