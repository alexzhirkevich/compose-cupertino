package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MenuDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoContextMenu
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

@ExperimentalAnimationApi
@Composable
actual fun AdaptiveContextMenu(
    visible : Boolean,
    onDismissRequest : () -> Unit,
    enterTransition : EnterTransition,
    exitTransition: ExitTransition,
    alignment: Alignment.Horizontal,
    menu : ContextMenuScope.() -> Unit,
    modifier: Modifier,
    content: @Composable () -> Unit
) {
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> CupertinoContextMenu(
            visible = visible,
            onDismissRequest = onDismissRequest,
            enterTransition = enterTransition,
            exitTransition = exitTransition,
            alignment = alignment,
            menu = menu,
            modifier = modifier,
            content = content
        )
        else -> DropdownContextMenu(
            visible = visible,
            onDismissRequest = onDismissRequest,
            menu = menu,
            modifier = modifier,
            content = content
        )
    }
}


private class ContextMenuScopeImpl : ContextMenuScope {

    val items = mutableListOf<@Composable (PaddingValues) -> Unit>()

    override fun item(content: @Composable (PaddingValues) -> Unit) {
        items.add(content)
    }

    override fun label(
        enabled: Boolean,
        onClick: () -> Unit,
        icon: @Composable () -> Unit,
        title: @Composable () -> Unit
    ) = item {
        DropdownMenuItem(
            text = title,
            leadingIcon = icon,
            enabled = enabled,
            onClick = onClick
        )
    }
}


@Composable
fun DropdownContextMenu(
    visible : Boolean,
    onDismissRequest : () -> Unit,
    menu : ContextMenuScope.() -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val scope = remember(menu){
        ContextMenuScopeImpl().apply(menu)
    }

    Box(modifier) {
        content()
        DropdownMenu(
            expanded = visible,
            onDismissRequest = onDismissRequest,
        ) {
            scope.items.forEach {
                it(MenuDefaults.DropdownMenuItemContentPadding)
            }
        }
    }
}