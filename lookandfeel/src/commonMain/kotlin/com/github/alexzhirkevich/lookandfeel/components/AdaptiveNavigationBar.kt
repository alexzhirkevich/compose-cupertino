package com.github.alexzhirkevich.lookandfeel.components

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
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import com.github.alexzhirkevich.lookandfeel.util.navigationBars

/**
 * @see AdaptiveNavigationBar
 * */
@Composable
fun AdaptiveNavigationBar(
    modifier: Modifier = Modifier,
    containerColor: Color = NavigationBarDefaults.containerColor,
    contentColor: Color = MaterialTheme.colorScheme.contentColorFor(containerColor),
    tonalElevation: Dp = NavigationBarDefaults.Elevation,
    windowInsets: WindowInsets = WindowInsets.navigationBars,
    content: @Composable RowScope.() -> Unit
){
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> CupertinoNavigationBar(
            modifier = modifier,
            containerColor = containerColor,
            contentColor = contentColor,
            tonalElevation = tonalElevation,
            windowInsets = windowInsets,
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
fun RowScope.AdaptiveNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
    colors: NavigationBarItemColors = NavigationBarItemDefaults.colors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
){
    when(LocalPlatformConfiguration.current?.lookAndFeel){
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