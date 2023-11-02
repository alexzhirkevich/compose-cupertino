package io.github.alexzhirkevich.cupertino.theme

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

class PlatformConfiguration(
    val platformHaptics : Boolean,
    val darkMode : Boolean,
    val lookAndFeel : LookAndFeel,
    internal val materialTheme : CupertinoTheme,
    internal val cupertinoTheme : CupertinoTheme,
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