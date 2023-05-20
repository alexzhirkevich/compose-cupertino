package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.interop.LocalUIViewController
import com.github.alexzhirkevich.lookandfeel.util.applyTheme

@Composable
internal actual fun NativeThemeEffect(configuration: PlatformConfiguration?) {
    val controller = LocalUIViewController.current

    val isSystemInDm = isSystemInDarkTheme()
    LaunchedEffect(configuration){
        controller.applyTheme(configuration?.darkMode ?: isSystemInDm)
    }
}