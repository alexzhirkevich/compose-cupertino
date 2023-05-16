package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.ScrollbarStyle
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.AppleColors
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration

val CupertinoScrollBarStyle
    @Composable
    get() = ScrollbarStyle(
    minimalHeight = 100.dp,
    hoverDurationMillis = 300,
    thickness = 3.dp,
    shape = CircleShape,
    unhoverColor = AppleColors.gray(LocalPlatformConfiguration.current?.darkMode?: isSystemInDarkTheme()),
    hoverColor = AppleColors.gray(LocalPlatformConfiguration.current?.darkMode?: isSystemInDarkTheme()),
)