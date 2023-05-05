package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveView
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.PlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.cupertino
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

internal expect val platformLookAndFeel : LookAndFeel


/**
 * Native look application
 * */
@Composable
fun AdaptiveApplication(
    darkMode : Boolean = isSystemInDarkTheme(),
    materialTheme : ApplicationTheme = ApplicationTheme(
        MaterialTheme.colorScheme,
        MaterialTheme.shapes,
        MaterialTheme.typography
    ),
    cupertinoTheme : ApplicationTheme = remember(materialTheme, darkMode) {
        materialTheme.copy(
            colorScheme = materialTheme.colorScheme.cupertino(darkMode),
            typography = materialTheme.typography.cupertino()
        )
    },
    platformHaptics : Boolean = true,
    content : @Composable () -> Unit
){
    CompositionLocalProvider(
        LocalPlatformConfiguration provides remember(darkMode, materialTheme, cupertinoTheme, platformHaptics){
            PlatformConfiguration(
                platformHaptics = platformHaptics,
                darkMode = darkMode,
                lookAndFeel = platformLookAndFeel,
                materialTheme = materialTheme,
                cupertinoTheme = cupertinoTheme
            )
        }
    ) {
        ProvideLookAndFeel(currentLookAndFeel, content)
    }
}

@Composable
fun ProvideLookAndFeel(lookAndFeel: LookAndFeel, content: @Composable () -> Unit) {

    val theme = when (lookAndFeel) {
        LookAndFeel.Cupertino -> LocalPlatformConfiguration.current?.cupertinoTheme
        else -> LocalPlatformConfiguration.current?.materialTheme
    }

    CompositionLocalProvider(
        LocalPlatformConfiguration provides LocalPlatformConfiguration.current?.copy(
            lookAndFeel = lookAndFeel,
        ),
    ) {
        MaterialTheme(
            colorScheme = theme?.colorScheme ?: AdaptiveTheme.colorScheme,
            shapes = theme?.shapes ?: AdaptiveTheme.shapes,
            typography = theme?.typography ?: AdaptiveTheme.typography,
            content = content
        )
    }
}