package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.runtime.staticCompositionLocalOf

val LocalPlatformConfiguration = staticCompositionLocalOf<PlatformConfiguration?>{
    null
}

enum class PlatformTheme {
    Material3, Cupertino
}

class PlatformConfiguration(
    val platformHaptics : Boolean,
    val darkMode : Boolean,
    val theme : PlatformTheme
)