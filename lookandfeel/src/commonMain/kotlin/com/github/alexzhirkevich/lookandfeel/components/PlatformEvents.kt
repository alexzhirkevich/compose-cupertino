package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.runtime.Composable


expect object PlatformEvents {

    @Composable
    fun OnStatusBarClicked(block : () -> Unit)
}