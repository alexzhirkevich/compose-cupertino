package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.platform.LocalHapticFeedback

@Composable
internal actual fun rememberHapticFeedback() : HapticFeedback {
    return LocalHapticFeedback.current
}