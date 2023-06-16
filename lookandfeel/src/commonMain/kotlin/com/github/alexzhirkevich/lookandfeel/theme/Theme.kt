package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
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
    displayLarge = titleLarge.copy(
        fontSize = 34.sp,
        lineHeight = 34.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    displayMedium = titleMedium.copy(
        fontSize = 28.sp,
        lineHeight = 28.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    displaySmall = titleSmall.copy(
        fontSize = 22.sp,
        lineHeight = 22.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    titleLarge = titleLarge.copy(
        fontSize = 34.sp,
        lineHeight = 34.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    titleMedium = titleMedium.copy(
        fontSize = 28.sp,
        lineHeight = 28.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    titleSmall = titleSmall.copy(
        fontSize = 22.sp,
        lineHeight = 22.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    headlineLarge = headlineLarge.copy(
        fontSize = 17.sp,
        lineHeight = 17.sp * 1.4f,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.5).sp
    ),
    headlineMedium = headlineMedium.copy(
        fontSize = 16.sp,
        lineHeight = 16.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    headlineSmall = headlineSmall.copy(
        fontSize = 15.sp,
        lineHeight = 15.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    bodyLarge = bodyLarge.copy(
        fontSize = 17.sp,
        lineHeight = 19.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    bodyMedium = bodyMedium.copy(
        fontSize = 17.sp,
        lineHeight = 17.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    bodySmall = bodySmall.copy(
        fontSize = 15.sp,
        lineHeight = 15.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    labelLarge = labelLarge.copy(
        fontSize = 13.sp,
        lineHeight = 13.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    labelMedium = labelMedium.copy(
        fontSize = 12.sp,
        lineHeight = 12.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
    labelSmall = labelSmall.copy(
        fontSize = 11.sp,
        lineHeight = 11.sp * 1.4f,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.5).sp
    ),
)

fun ColorScheme.cupertino(dark : Boolean) : ColorScheme = copy(
    background = if (dark) Color.Black else AppleColors.gray6(false),
    surface = if (dark) AppleColors.gray6(true) else Color.White,
    surfaceVariant = if (dark) AppleColors.gray6(true) else Color.White,
    onSurfaceVariant = if (dark) Color.White else Color.Black,
    primaryContainer = AppleColors.gray5(dark),
    secondaryContainer = AppleColors.gray8(dark), // Segmented control indicator
    tertiaryContainer = AppleColors.gray7(dark), // Alert dialog
    onTertiaryContainer = if (dark) Color.White else Color.Black,
    error = AppleColors.red(dark),
    outlineVariant = AppleColors.gray(dark)
//    outlineVariant = outlineVariant.copy(alpha = .75f)
)

@Composable
internal expect fun NativeThemeEffect(configuration: PlatformConfiguration? = LocalPlatformConfiguration.current)
