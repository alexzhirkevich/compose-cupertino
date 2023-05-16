package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoContextMenu

@ExperimentalAnimationApi
@Composable
actual inline fun AdaptiveContextMenu(
    visible : Boolean,
    noinline onDismissRequest : () -> Unit,
    enterTransition : EnterTransition,
    exitTransition: ExitTransition,
    alignment: Alignment.Horizontal,
    noinline menu : ContextMenuScope.() -> Unit,
    modifier: Modifier,
    noinline content: @Composable () -> Unit
) = CupertinoContextMenu(
    visible = visible,
    onDismissRequest = onDismissRequest,
    enterTransition = enterTransition,
    exitTransition = exitTransition,
    alignment = alignment,
    menu = menu,
    modifier = modifier,
    content = content
)