package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.PlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.cupertino


@Composable
fun CupertinoApplication(
    darkMode : Boolean = isSystemInDarkTheme(),
    theme: ApplicationTheme = ApplicationTheme(
        MaterialTheme.colorScheme.cupertino(darkMode),
        MaterialTheme.shapes,
        MaterialTheme.typography.cupertino()
    ),
    platformHaptics : Boolean = true,
    content : @Composable () -> Unit
) {

    val oldConfig = LocalPlatformConfiguration.current

    val config = remember(platformHaptics, oldConfig, theme, darkMode){
        PlatformConfiguration(
            platformHaptics = platformHaptics,
            darkMode = darkMode,
            lookAndFeel = LookAndFeel.Cupertino,
            materialTheme = oldConfig?.materialTheme ?: theme,
            cupertinoTheme = theme
        )
    }
    CompositionLocalProvider(LocalPlatformConfiguration provides config) {
        ProvideLookAndFeel(LookAndFeel.Cupertino, content)
    }
}