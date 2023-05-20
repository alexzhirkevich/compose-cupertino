package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable

enum class LocalizedStrings {
    Cancel, Search, Back
}

@Composable
expect fun LocalizedStrings.localized() : String