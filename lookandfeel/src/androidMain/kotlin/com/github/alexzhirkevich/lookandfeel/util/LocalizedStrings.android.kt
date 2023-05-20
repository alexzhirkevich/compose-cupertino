package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext


@Composable
actual fun LocalizedStrings.localized(): String {
    val context = LocalContext.current
    return when (this){
        LocalizedStrings.Cancel -> context.getString(android.R.string.cancel)
        LocalizedStrings.Search -> context.getString(android.R.string.search_go)
        else -> name
    }
}