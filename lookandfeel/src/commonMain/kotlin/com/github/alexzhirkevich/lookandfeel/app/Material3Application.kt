package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.PlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel

@Composable
fun MaterialApplication(
    darkMode : Boolean = isSystemInDarkTheme(),
    theme: ApplicationTheme = ApplicationTheme(
        MaterialTheme.colorScheme,
        MaterialTheme.shapes,
        MaterialTheme.typography
    ),
    content : @Composable () -> Unit
) {
    val config = remember(darkMode) {
        PlatformConfiguration(
            platformHaptics = true,
            darkMode = darkMode,
            lookAndFeel = LookAndFeel.Material3
        )
    }

    CompositionLocalProvider(
        LocalPlatformConfiguration provides config,
    ) {
        MaterialTheme(theme.colorScheme, theme.shapes, theme.typography, content)
    }
}