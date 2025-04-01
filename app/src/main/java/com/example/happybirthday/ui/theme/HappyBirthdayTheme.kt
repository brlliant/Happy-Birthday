package com.example.happybirthday.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define a basic color scheme
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE),
    onPrimary = Color.White,
    secondary = Color(0xFF03DAC5),
    background = Color.White,
    surface = Color.White,
    onSurface = Color.Black
)

@Composable
fun HappyBirthdayTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme, // Correct usage
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
