package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoNavigationBar
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoNavigationBarItem
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoColors
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoElevation
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel.Cupertino
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import com.github.alexzhirkevich.lookandfeel.util.navigationBars

val NavigationBarDefaults.AdaptiveElevation
    @Composable
    get() = when(currentLookAndFeel) {
        LookAndFeel.Cupertino -> CupertinoElevation
        else -> Elevation
    }

/**
 * @see [NavigationBar]
 *
 * @param isTransparent  [[Cupertino]] set [containerColor] opacity to zero and hide divider
 * (default behavior of divider, can be changed with [withDivider] argument of cupertino).
 * Typical use case is when [ScrollableState.canScrollForward] is false.
 * Or if your scrollable container has padding you can set
 * [ScrollState.maxValue] - [ScrollState.value] < padding
 * */
@Composable
fun AdaptiveNavigationBar(
    modifier: Modifier = Modifier,
    containerColor: Color = NavigationBarDefaults.containerColor,
    contentColor: Color = MaterialTheme.colorScheme.contentColorFor(containerColor),
    tonalElevation: Dp = NavigationBarDefaults.AdaptiveElevation,
    windowInsets: WindowInsets = WindowInsets.navigationBars,
    isTransparent : () -> Boolean = { false },
    content: @Composable RowScope.() -> Unit
){
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> CupertinoNavigationBar(
            modifier = modifier,
            containerColor = containerColor,
            contentColor = contentColor,
            tonalElevation = tonalElevation,
            windowInsets = windowInsets,
            isTransparent = isTransparent,
            content = content
        )
        else -> NavigationBar(
            modifier = modifier,
            containerColor = containerColor,
            contentColor = contentColor,
            tonalElevation = tonalElevation,
            windowInsets = windowInsets,
            content = content
        )
    }
}

@Composable
fun NavigationBarItemDefaults.adaptiveColors() = when(currentLookAndFeel) {
    LookAndFeel.Cupertino -> NavigationBarItemDefaults.cupertinoColors()
    else -> colors()
}

@Composable
fun RowScope.AdaptiveNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
    colors: NavigationBarItemColors = NavigationBarItemDefaults.adaptiveColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
){
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> CupertinoNavigationBarItem(
            selected = selected,
            onClick = onClick,
            icon = icon,
            modifier = modifier,
            enabled = enabled,
            label = label,
            alwaysShowLabel = alwaysShowLabel,
            colors = colors,
            interactionSource = interactionSource
        )
        else -> NavigationBarItem(
            selected = selected,
            onClick = onClick,
            icon = icon,
            modifier = modifier,
            enabled = enabled,
            label = label,
            alwaysShowLabel = alwaysShowLabel,
            colors = colors,
            interactionSource = interactionSource
        )
    }
}