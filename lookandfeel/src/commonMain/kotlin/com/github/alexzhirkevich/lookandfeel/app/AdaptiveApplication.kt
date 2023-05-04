package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.cupertino

/**
 * Native look application
 * */
@Composable
expect fun AdaptiveApplication(
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
)