package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.LocalScrollbarStyle2
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.components.cupertino.ContextMenuContainer
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoScrollBarStyle
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

    val oldConfig = LocalPlatformConfiguration.current

    val config = remember(oldConfig, theme, darkMode) {
        PlatformConfiguration(
            platformHaptics = true,
            darkMode = darkMode,
            lookAndFeel = LookAndFeel.Material3,
            materialTheme = theme,
            cupertinoTheme = oldConfig?.cupertinoTheme ?: theme
        )
    }

    CompositionLocalProvider(LocalPlatformConfiguration provides config) {
        ProvideMaterial3LookAndFeel(content)
    }
}

@Composable
internal fun ProvideMaterial3LookAndFeel(content: @Composable () -> Unit) {

    val theme= requireNotNull(LocalPlatformConfiguration.current?.materialTheme){
        "Cupertino look and feel can be provided only inside MaterialApplication and AdaptiveApplication"
    }

    CompositionLocalProvider(
        LocalPlatformConfiguration provides LocalPlatformConfiguration.current?.copy(
            lookAndFeel = LookAndFeel.Material3,
        ),
        LocalScrollbarStyle2 provides CupertinoScrollBarStyle, // TODO
    ) {
        MaterialTheme(
            colorScheme = theme.colorScheme,
            shapes = theme.shapes,
            typography = theme.typography,
        ){
            ContextMenuContainer(content)
        }
    }
}