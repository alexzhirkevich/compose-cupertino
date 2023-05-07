package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.components.cupertino.ContextMenuContainer
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.PlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.cupertino

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
        ProvideLookAndFeel(platformLookAndFeel){
            ContextMenuContainer(content)
        }
    }
}

@Composable
fun ProvideLookAndFeel(lookAndFeel: LookAndFeel, content: @Composable () -> Unit) {
    when(lookAndFeel){
        LookAndFeel.Cupertino -> ProvideCupertinoLookAndFeel(content)
        else -> ProvideMaterial3LookAndFeel(content)
    }
}