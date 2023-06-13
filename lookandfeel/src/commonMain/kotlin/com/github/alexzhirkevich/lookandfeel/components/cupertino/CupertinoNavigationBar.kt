@file:Suppress("INVISIBLE_MEMBER")

package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.util.navigationBars

val NavigationBarDefaults.CupertinoElevation get() = 0.dp

/**
 * @see [NavigationBar]
 *
 * @param isTransparent set [containerColor] opacity to zero and hide divider
 * (default behavior of divider, can be changed with [withDivider] argument).
 * Typical use case is when [ScrollableState.canScrollForward] is false.
 * Or if your scrollable container has padding you can set
 * [ScrollState.maxValue] - [ScrollState.value] < padding
 * */
@Composable
@NonRestartableComposable
fun CupertinoNavigationBar(
    modifier: Modifier = Modifier,
    containerColor: Color = NavigationBarDefaults.containerColor,
    contentColor: Color = contentColorFor(containerColor),
    tonalElevation: Dp = NavigationBarDefaults.CupertinoElevation,
    windowInsets: WindowInsets = WindowInsets.navigationBars,
    isTransparent : () -> Boolean = { false },
    withDivider : Boolean = !isTransparent(),
    content: @Composable RowScope.() -> Unit
) {
    val background by remember {
        derivedStateOf {
            if (isTransparent())
                containerColor.copy(alpha = 0f) else containerColor
        }
    }
    Surface(
        modifier = modifier,
        color = background,
        tonalElevation = tonalElevation,
        contentColor = contentColor,
    ) {
        Column(Modifier.windowInsetsPadding(windowInsets)) {
            if (withDivider) {
                CupertinoDivider()
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(CupertinoNavigationBarDefaults.height)
                    .padding(top = 2.dp)
                    .selectableGroup(),
                horizontalArrangement = Arrangement.SpaceBetween,
                content = content
            )
        }
    }
}


@Composable
fun NavigationBarItemDefaults.cupertinoColors(
    selectedIconColor: Color = AdaptiveTheme.colorScheme.primary,
    selectedTextColor: Color = AdaptiveTheme.colorScheme.primary,
    unselectedIconColor: Color = AdaptiveTheme.colorScheme.onSurface,
    unselectedTextColor: Color = AdaptiveTheme.colorScheme.onSurface,
) = colors(
    selectedIconColor = selectedIconColor,
    selectedTextColor = selectedTextColor,
    unselectedIconColor = unselectedIconColor,
    unselectedTextColor = unselectedTextColor
)

@Composable
fun RowScope.CupertinoNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
    colors: NavigationBarItemColors = NavigationBarItemDefaults.cupertinoColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {

    val pressed by interactionSource.collectIsPressedAsState()

    Column(
        modifier
            .graphicsLayer {
                alpha = if (!selected && pressed) .5f else 1f
            }
            .selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.Tab,
                interactionSource = interactionSource,
                indication = null
            )
            .weight(1f)
            .padding(top = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        CompositionLocalProvider(
            LocalContentColor provides colors.iconColor(selected = selected).value
        ) {
            icon()
        }
        if (label != null && (alwaysShowLabel || selected)) {
            CompositionLocalProvider(
                LocalTextStyle provides MaterialTheme.typography.labelSmall.copy(
                    color = colors.textColor(selected = selected).value
                )
            ) {
                label()
            }
        }
    }
}

object CupertinoNavigationBarDefaults {
    val height = 50.dp
}