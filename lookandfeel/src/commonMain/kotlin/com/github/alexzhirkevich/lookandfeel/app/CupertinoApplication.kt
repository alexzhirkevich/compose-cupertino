package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.LocalScrollbarStyle2
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalHapticFeedback
import com.github.alexzhirkevich.lookandfeel.components.cupertino.ContextMenuContainer
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoIndication
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoScrollBarStyle
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.PlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.cupertino
import com.github.alexzhirkevich.lookandfeel.util.rememberHapticFeedback


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
        ProvideCupertinoLookAndFeel(content)
    }
}

@Composable
internal fun ProvideCupertinoLookAndFeel(
    content: @Composable () -> Unit
) {
    val theme = requireNotNull(LocalPlatformConfiguration.current?.cupertinoTheme) {
        "Cupertino look and feel can be provided only inside CupertinoApplication and AdaptiveApplication"
    }

    CompositionLocalProvider(
        LocalPlatformConfiguration provides LocalPlatformConfiguration.current?.copy(
            lookAndFeel = LookAndFeel.Cupertino,
        ),
        LocalScrollbarStyle2 provides CupertinoScrollBarStyle,
        LocalHapticFeedback provides rememberHapticFeedback()
    ) {
        MaterialTheme(
            colorScheme = theme.colorScheme,
            shapes = theme.shapes,
            typography = theme.typography,
            content = {

                //TODO: uncomment when PlatformRipple implemented for ios
//                if (platformLookAndFeel != LookAndFeel.Cupertino) {
                CompositionLocalProvider(LocalIndication provides remember { CupertinoIndication() }) {
                    ContextMenuContainer(content)
                }
//               }
            }
        )
    }
}