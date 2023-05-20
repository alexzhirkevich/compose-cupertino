package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration

val isDark : Boolean
    @Composable get() = LocalPlatformConfiguration.current?.darkMode ?: isSystemInDarkTheme()






