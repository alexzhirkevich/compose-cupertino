package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import platform.UIKit.UIImpactFeedbackGenerator
import platform.UIKit.UIImpactFeedbackStyle

@Composable
internal actual fun rememberHapticFeedback() :HapticFeedback {
    return remember { IosHapticFeedback() }
}

private class IosHapticFeedback : HapticFeedback {
    private val generator1 = UIImpactFeedbackGenerator(
        style = UIImpactFeedbackStyle.UIImpactFeedbackStyleMedium
    )
    private val generator2 = UIImpactFeedbackGenerator(
        style = UIImpactFeedbackStyle.UIImpactFeedbackStyleLight
    )
    override fun performHapticFeedback(hapticFeedbackType: HapticFeedbackType) {
        if (hapticFeedbackType == HapticFeedbackType.LongPress) {
            generator1.impactOccurred()
        } else {
            generator2.impactOccurred()
        }
    }
}