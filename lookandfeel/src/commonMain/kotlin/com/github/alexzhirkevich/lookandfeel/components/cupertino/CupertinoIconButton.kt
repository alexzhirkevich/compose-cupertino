@file:Suppress("INVISIBLE_MEMBER")
package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun CupertinoButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
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
                role = Role.Button,
                indication = null
            )

    ) {
        CompositionLocalProvider(
            LocalContentColor provides colors.contentColor(enabled)
                .value.copy(alpha = contentAlpha)
        ) {
            content()
        }
    }
}