package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

internal class SectionItem(
    val key: Any? = null,
    val contentType: Any? = null,
    val dividerPadding: Dp?,
    val content: @Composable (PaddingValues) -> Unit,
)