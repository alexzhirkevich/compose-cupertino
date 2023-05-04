package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.ime as androidIme
import androidx.compose.foundation.layout.navigationBars as androidNavigationBars
import androidx.compose.foundation.layout.safeContent as androidSafeContent
import androidx.compose.foundation.layout.statusBars as androidStatusBars

actual val WindowInsets.Companion.ime : WindowInsets
    @Composable get() = androidIme

actual val WindowInsets.Companion.statusBars : WindowInsets
    @Composable get() = androidStatusBars

actual val WindowInsets.Companion.navigationBars : WindowInsets
    @Composable get() = androidNavigationBars

actual val WindowInsets.Companion.safeContent : WindowInsets
    @Composable get() = androidSafeContent
