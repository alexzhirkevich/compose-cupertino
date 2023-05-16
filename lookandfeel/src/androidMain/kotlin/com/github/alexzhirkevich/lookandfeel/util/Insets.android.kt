package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.foundation.layout.ime as androidIme
import androidx.compose.foundation.layout.navigationBars as androidNavigationBars
import androidx.compose.foundation.layout.safeContent as androidSafeContent
import androidx.compose.foundation.layout.statusBars as androidStatusBars

actual val WindowInsets.Companion.ime : WindowInsets
    @Composable
    @NonRestartableComposable
    get() = androidIme

actual val WindowInsets.Companion.statusBars : WindowInsets
    @Composable
    @NonRestartableComposable
    get() = androidStatusBars

actual val WindowInsets.Companion.navigationBars : WindowInsets
    @Composable
    @NonRestartableComposable
    get() = androidNavigationBars

actual val WindowInsets.Companion.safeContent : WindowInsets
    @Composable
    @NonRestartableComposable
    get() = androidSafeContent
