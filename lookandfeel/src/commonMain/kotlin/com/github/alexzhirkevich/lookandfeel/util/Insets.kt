package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

@get:Composable
expect val WindowInsets.Companion.ime : WindowInsets

@get:Composable
@get:NonRestartableComposable
expect val WindowInsets.Companion.statusBars : WindowInsets

@get:Composable
@get:NonRestartableComposable
expect val WindowInsets.Companion.navigationBars : WindowInsets

@get:Composable
@get:NonRestartableComposable
expect val WindowInsets.Companion.safeContent : WindowInsets

fun Modifier.safeContentPadding() = composed {
    windowInsetsPadding(WindowInsets.safeContent)
}

fun Modifier.statusBarsPadding() = composed {
    windowInsetsPadding(WindowInsets.statusBars)
}

fun Modifier.navigationBarsPadding() = composed {
    windowInsetsPadding(WindowInsets.navigationBars)
}

fun Modifier.imePadding() = composed {
    windowInsetsPadding(WindowInsets.ime)
}