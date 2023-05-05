package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalPlatformConfiguration = staticCompositionLocalOf<PlatformConfiguration?>{
    null
}

val currentLookAndFeel : LookAndFeel
    @Composable get() = LocalPlatformConfiguration.current?.lookAndFeel ?: LookAndFeel.Material3

enum class LookAndFeel {
    Material3, Cupertino
}

class PlatformConfiguration(
    val platformHaptics : Boolean,
    val darkMode : Boolean,
    val lookAndFeel : LookAndFeel
)