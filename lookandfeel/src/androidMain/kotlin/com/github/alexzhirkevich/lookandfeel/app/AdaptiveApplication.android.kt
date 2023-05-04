package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.runtime.Composable
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme

@Composable
actual fun AdaptiveApplication(
    darkMode : Boolean,
    materialTheme : ApplicationTheme,
    cupertinoTheme : ApplicationTheme,
    platformHaptics : Boolean,
    content : @Composable () -> Unit
) = MaterialApplication(
    darkMode = darkMode,
    theme = materialTheme,
    content = content
)
