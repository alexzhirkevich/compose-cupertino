package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Divider
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CupertinoNavigationBar(
    modifier: Modifier,
    containerColor: Color,
    contentColor: Color,
    tonalElevation: Dp,
    windowInsets: WindowInsets,
    content: @Composable RowScope.() -> Unit
) {

    Column(
        modifier = modifier
            .background(containerColor)
            .windowInsetsPadding(windowInsets)
    ) {
        Divider()
        Row(
            Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(top = 2.dp)
                .selectableGroup(),
            horizontalArrangement = Arrangement.SpaceBetween,
            content = content
        )
    }
}

@Composable
fun RowScope.CupertinoNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    label: @Composable (() -> Unit)?,
    alwaysShowLabel: Boolean,
    colors: NavigationBarItemColors,
    interactionSource: MutableInteractionSource
) {

    val pressed by interactionSource.collectIsPressedAsState()

    Column(
        Modifier
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
        val color by rememberUpdatedState(
            if (selected)
                MaterialTheme.colorScheme.primary else LocalContentColor.current
        )

        CompositionLocalProvider(
            LocalContentColor provides color
        ) {
            icon()
            if (alwaysShowLabel || selected) {
                label?.let {
                    CompositionLocalProvider(
                        LocalTextStyle provides MaterialTheme.typography.labelSmall
                    ) {
                        it()
                    }
                }
            }
        }
    }
}