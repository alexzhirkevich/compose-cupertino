package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Platform-neutral typealias for [MaterialTheme]
 * */
typealias AdaptiveTheme = MaterialTheme

data class ApplicationTheme(
    val colorScheme: ColorScheme,
    val shapes: Shapes,
    val typography: Typography
)

fun Typography.cupertino() : Typography = copy(
    displayLarge = titleLarge.copy(fontSize = 34.sp, lineHeight = 34.sp * 1.4f, fontWeight = FontWeight.Normal),
    displayMedium = titleMedium.copy(fontSize = 28.sp, lineHeight = 28.sp * 1.4f, fontWeight = FontWeight.Normal),
    displaySmall = titleSmall.copy(fontSize = 22.sp, lineHeight = 22.sp * 1.4f, fontWeight = FontWeight.Normal),
    titleLarge = titleLarge.copy(fontSize = 34.sp, lineHeight = 34.sp * 1.4f, fontWeight = FontWeight.Normal),
    titleMedium = titleMedium.copy(fontSize = 28.sp, lineHeight = 28.sp * 1.4f, fontWeight = FontWeight.Normal),
    titleSmall = titleSmall.copy(fontSize = 22.sp, lineHeight = 22.sp * 1.4f, fontWeight = FontWeight.Normal),
    headlineLarge = headlineLarge.copy(fontSize = 17.sp, lineHeight = 17.sp * 1.4f, fontWeight = FontWeight.SemiBold),
    headlineMedium = headlineLarge.copy(fontSize = 16.sp, lineHeight = 16.sp * 1.4f, fontWeight = FontWeight.Normal),
    headlineSmall = headlineLarge.copy(fontSize = 15.sp, lineHeight = 15.sp * 1.4f, fontWeight = FontWeight.Normal),
    bodyLarge = headlineLarge.copy(fontSize = 17.sp, lineHeight = 19.sp * 1.4f, fontWeight = FontWeight.Normal),
    bodyMedium = headlineLarge.copy(fontSize = 17.sp, lineHeight = 17.sp * 1.4f, fontWeight = FontWeight.Normal),
    bodySmall = headlineLarge.copy(fontSize = 15.sp, lineHeight = 15.sp * 1.4f, fontWeight = FontWeight.Normal),
    labelLarge = headlineLarge.copy(fontSize = 13.sp, lineHeight = 13.sp * 1.4f, fontWeight = FontWeight.Normal),
    labelMedium = headlineLarge.copy(fontSize = 12.sp, lineHeight = 12.sp * 1.4f, fontWeight = FontWeight.Normal),
    labelSmall = headlineLarge.copy(fontSize = 11.sp, lineHeight = 11.sp * 1.4f, fontWeight = FontWeight.Normal),
)

fun ColorScheme.cupertino(dark : Boolean) : ColorScheme = copy(
    background = if (dark) Color.Black else AppleColors.gray5(false),
    surface = AppleColors.gray6(dark),
    surfaceVariant = AppleColors.gray6(dark) ,
    onSurfaceVariant = if (dark) Color.White else Color.Black,
    primaryContainer = AppleColors.gray5(dark),
    error = AppleColors.red(dark),
    outlineVariant = outlineVariant.copy(alpha = .5f)
)