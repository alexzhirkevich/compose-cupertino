package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier

@Composable
fun CupertinoIconButton(
    onClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    colors: IconButtonColors,
    interactionSource: MutableInteractionSource,
    content: @Composable () -> Unit
) {

    val pressed by interactionSource.collectIsPressedAsState()

    val contentAlpha by rememberUpdatedState(if (pressed) .5f else 1f)

    Box(
        modifier
            .clickable(
                interactionSource = interactionSource,
                onClick = onClick,
                enabled = enabled,
                indication = null
            )
    ) {
        CompositionLocalProvider(
            LocalContentColor provides MaterialTheme.colorScheme.primary
                .copy(alpha = contentAlpha)
        ) {
            content()
        }
    }
}