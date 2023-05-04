package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.PlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.PlatformTheme
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
    val config = remember(darkMode){
        PlatformConfiguration(
            platformHaptics = platformHaptics,
            darkMode = darkMode,
            theme = PlatformTheme.Cupertino
        )
    }

    MaterialTheme(theme.colorScheme, theme.shapes, theme.typography) {
        CompositionLocalProvider(
            LocalPlatformConfiguration provides config,
            LocalTextStyle provides theme.typography.bodyMedium,
            content = content
        )
    }
}