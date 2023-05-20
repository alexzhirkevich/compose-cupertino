package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable
import platform.Foundation.NSBundle


@Composable
actual fun LocalizedStrings.localized() : String {

    return NSBundle.mainBundle
        .localizedStringForKey(name, null, null)
}