package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable

actual object PlatformEvents {

    @Composable
    @NonRestartableComposable
    actual fun OnStatusBarClicked(block : () -> Unit) = Unit
}
