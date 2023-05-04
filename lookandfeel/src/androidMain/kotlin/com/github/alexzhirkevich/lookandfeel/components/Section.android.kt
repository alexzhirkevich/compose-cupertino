package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun Section(
    modifier: Modifier,
    title: String?,
    caption: String?,
    content: @Composable ColumnScope.() -> Unit
) {
}