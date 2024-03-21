/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBar
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBarDefaults
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBarItem
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBarItemColors
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBarDefaults
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

@OptIn(ExperimentalCupertinoApi::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveNavigationBar(
    modifier: Modifier = Modifier,
    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets,
    adaptation: AdaptationScope<CupertinoNavigationBarAdaptation, MaterialNavigationBarAdaptation>.() -> Unit = {},
    content: @Composable RowScope.() -> Unit
) {
    AdaptiveWidget(
        adaptation = remember {
            NavigationBarAdaptation()
        },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoNavigationBar(
                modifier = modifier,
                windowInsets = windowInsets,
                containerColor = it.containerColor,
                isTransparent = it.isTransparent,
                isTranslucent = it.isTranslucent,
                divider = it.divider,
                content = content
            )
        },
        material = {
            NavigationBar(
                modifier = modifier,
                containerColor = it.containerColor,
                contentColor = it.contentColor,
                tonalElevation = it.tonalElevation,
                windowInsets = windowInsets,
                content = content
            )
        }
    )
}

@OptIn(ExperimentalCupertinoApi::class, ExperimentalAdaptiveApi::class)
@Composable
fun RowScope.AdaptiveNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation: AdaptationScope<CupertinoNavigationBarItemAdaptation, MaterialNavigationBarItemAdaptation>.() -> Unit = {},
) {
    AdaptiveWidget(
        adaptation = remember {
            NavigationBarItemAdaptation()
        },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoNavigationBarItem(
                selected = selected,
                onClick = onClick,
                icon = icon,
                modifier = modifier,
                enabled = enabled,
                label = label,
                alwaysShowLabel = alwaysShowLabel,
                colors = it.colors,
                interactionSource = interactionSource,
            )
        },
        material = {
            NavigationBarItem(
                selected = selected,
                onClick = onClick,
                icon = icon,
                modifier = modifier,
                enabled = enabled,
                label = label,
                alwaysShowLabel = alwaysShowLabel,
                colors = it.colors,
                interactionSource = interactionSource
            )
        }
    )
}

class MaterialNavigationBarAdaptation internal constructor(
    containerColor : Color,
    contentColor : Color,
    tonalElevation: Dp = NavigationBarDefaults.Elevation,
) {
    var containerColor : Color by mutableStateOf(containerColor)
    var contentColor : Color by mutableStateOf(contentColor)
    var tonalElevation: Dp by mutableStateOf(tonalElevation)
}

@OptIn(ExperimentalCupertinoApi::class)
class CupertinoNavigationBarAdaptation internal constructor(
    containerColor : Color,
    isTransparent: Boolean = false,
    isTranslucent: Boolean = true,
    divider : @Composable () -> Unit = { CupertinoNavigationBarDefaults.divider() }
) {
    var containerColor : Color by mutableStateOf(containerColor)
    var isTransparent: Boolean by mutableStateOf(isTransparent)
    var isTranslucent: Boolean by mutableStateOf(isTranslucent)
    var divider : @Composable () -> Unit by mutableStateOf(divider)
}

@Stable
class MaterialNavigationBarItemAdaptation internal constructor(
    colors : NavigationBarItemColors,
) {
    var colors : NavigationBarItemColors by mutableStateOf(colors)
}

@Stable
@OptIn(ExperimentalCupertinoApi::class)
class CupertinoNavigationBarItemAdaptation internal constructor(
    colors : CupertinoNavigationBarItemColors,
){
    var colors : CupertinoNavigationBarItemColors by mutableStateOf(colors)
}

@OptIn(ExperimentalAdaptiveApi::class)
@Stable
private class NavigationBarAdaptation :
    Adaptation<CupertinoNavigationBarAdaptation, MaterialNavigationBarAdaptation>() {

    @OptIn(ExperimentalCupertinoApi::class)
    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoNavigationBarAdaptation {

        val containerColor = CupertinoNavigationBarDefaults.containerColor

        return remember(containerColor) {
            CupertinoNavigationBarAdaptation(
                containerColor = containerColor
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialNavigationBarAdaptation {
        val containerColor = NavigationBarDefaults.containerColor
        val contentColor = contentColorFor(containerColor)

        return remember(containerColor) {
            MaterialNavigationBarAdaptation(
                containerColor = containerColor,
                contentColor = contentColor
            )
        }
    }
}

@Stable
private class NavigationBarItemAdaptation :
    Adaptation<CupertinoNavigationBarItemAdaptation, MaterialNavigationBarItemAdaptation>() {

    @OptIn(ExperimentalCupertinoApi::class)
    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoNavigationBarItemAdaptation {

        val colors = CupertinoNavigationBarDefaults.itemColors()

        return remember(colors) {
            CupertinoNavigationBarItemAdaptation(
                colors = colors
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialNavigationBarItemAdaptation {

        val colors = NavigationBarItemDefaults.colors()

        return remember(colors) {
            MaterialNavigationBarItemAdaptation(
                colors = colors
            )
        }
    }
}