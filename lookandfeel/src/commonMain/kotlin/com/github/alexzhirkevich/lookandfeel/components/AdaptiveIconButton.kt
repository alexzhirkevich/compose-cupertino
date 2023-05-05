package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoIconButton
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

@Composable
fun AdaptiveIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    when (currentLookAndFeel) {
        LookAndFeel.Cupertino ->
            CupertinoIconButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                colors = colors,
                interactionSource = interactionSource,
                content = content
            )

        else -> IconButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            colors = colors,
            interactionSource = interactionSource,
            content = content
        )
    }
}
