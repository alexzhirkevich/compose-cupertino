package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

enum class LookAndFeel {
    Material3, Cupertino
}
val currentLookAndFeel : LookAndFeel
    @Composable get() = LocalPlatformConfiguration.current?.lookAndFeel ?: LookAndFeel.Material3



internal val LocalPlatformConfiguration = staticCompositionLocalOf<PlatformConfiguration?>{
    null
}

internal class PlatformConfiguration(
    val platformHaptics : Boolean,
    val darkMode : Boolean,
    val lookAndFeel : LookAndFeel,
    internal val materialTheme : ApplicationTheme,
    internal val cupertinoTheme : ApplicationTheme,
){
    fun copy(
        platformHaptics: Boolean = this.platformHaptics,
        darkMode: Boolean = this.darkMode,
        lookAndFeel: LookAndFeel = this.lookAndFeel
    ) = PlatformConfiguration(
        platformHaptics = platformHaptics,
        darkMode = darkMode,
        lookAndFeel = lookAndFeel,
        materialTheme = materialTheme,
        cupertinoTheme = cupertinoTheme
    )
}