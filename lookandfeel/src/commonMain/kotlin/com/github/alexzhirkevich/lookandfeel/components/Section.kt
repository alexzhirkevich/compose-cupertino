package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun Section(
    modifier : Modifier = Modifier,
    title : String? = null,
    caption : String ? = null,
    content : @Composable ColumnScope.() -> Unit
)