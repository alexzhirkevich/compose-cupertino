
package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoContextMenu
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel

interface ContextMenuScope {

    fun item(
        content: @Composable (PaddingValues) -> Unit
    )

    fun label(
        enabled: Boolean = true,
        onClick: () -> Unit,
        icon: @Composable () -> Unit = {},
        title: @Composable () -> Unit,
    )
}

/**
 * Adaptive context menu.
 *
 * For [LookAndFeel.Cupertino] it is always [CupertinoContextMenu].
 * For [LookAndFeel.Material3] it is DropdownMenu on Android and [CupertinoContextMenu] on iOS
 * (dropdown menu is not implemented for iOS)
 * */
@ExperimentalAnimationApi
@Composable
expect fun AdaptiveContextMenu(
    visible : Boolean,
    onDismissRequest : () -> Unit,
    enterTransition : EnterTransition = scaleIn(
        animationSpec = tween(
            durationMillis = 100
        ),
        transformOrigin = TransformOrigin(.5f, 0f)
    ),
    exitTransition: ExitTransition = scaleOut(
        animationSpec = tween(
            durationMillis = 100
        ),
        transformOrigin = TransformOrigin(.5f, 0f)
    ),
    alignment: Alignment.Horizontal = Alignment.End,
    menu : ContextMenuScope.() -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
)
