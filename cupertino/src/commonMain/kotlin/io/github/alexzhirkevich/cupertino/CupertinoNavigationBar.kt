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

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

/**
 * Return true if container can't scroll forward
 * */
inline val ScrollableState.isNavigationBarTransparent: Boolean
    get() = !canScrollForward


/**
 * Navigation bar itself does not produce cupertino thin material glass effect.
 * This effect works only inside [CupertinoScaffold], [CupertinoBottomSheetScaffold], [CupertinoBottomSheetContent].
 * Use this function to achieve this effect with custom bottom bar.
 * It will communicate with scaffold and return either [Color.Transparent] if color was
 * successfully applied to scaffold (and navigation bar itself should be transparent) or passed color
 * if scaffold wasn't found.
 *
 * @param color navigation bar container color. Alpha is controlled by the [CupertinoScaffold]
 * @param isTransparent if navigation bar currently should be transparent. See [CupertinoNavigationBar]
 * for use cases example.
 * */
@Composable
@ExperimentalCupertinoApi
fun cupertinoTranslucentBottomBarColor(
    color: Color,
    isTranslucent: Boolean,
    isTransparent: Boolean,
): Color {

    if (!isTranslucent)
        return color

    val appBarsState = LocalAppBarsState.current ?: return color

    DisposableEffect(appBarsState, color) {
        appBarsState.bottomBarColor.value = color
        onDispose {
            appBarsState.bottomBarColor.value = Color.Unspecified
        }
    }

    DisposableEffect(isTransparent, appBarsState) {
        appBarsState.isBottomBarTransparent.value = isTransparent
        onDispose {
            appBarsState.isBottomBarTransparent.value = true
        }
    }
    return Color.Transparent
}

/**
 * Cupertino bottom navigation tab bar
 *
 * [CupertinoNavigationBarItem]s should be used as navigation bar content
 *
 * Note: navigation bar itself does not produce cupertino thin material glass effect.
 * This effect works only inside [CupertinoScaffold], [CupertinoBottomSheetScaffold], [CupertinoBottomSheetContent].
 * To achieve this effect with custom bottom bar use [cupertinoTranslucentTopBarColor]
 * function that will communicate with scaffold and return either
 * [Color.Transparent] if color was successfully applied to scaffold (and top bar itself
 * should be transparent) or passed color if scaffold wasn't found.
 *
 * @param modifier the [Modifier] to be applied to this top app bar.
 * @param windowInsets a window insets that app bar will respect.
 * @param containerColor color of the navigation bar background.
 * @param isTransparent navigation bar is usually transparent if scroll container reached bottom.
 * [ScrollableState.isNavigationBarTransparent] and [LazyListState.isNavigationBarTransparent] can be used to track it
 * @param isTranslucent works only inside [CupertinoScaffold]. Blurred content behind navigation bar will be
 * visible if navigation bar is translucent. Simulates iOS app bars material.
 * @param divider top divider when [isTransparent] is false
 * @param content navigation bar content, usually [CupertinoNavigationBarItem]
 *
 * @see CupertinoNavigationBarItem
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoNavigationBar(
    modifier: Modifier = Modifier,
    containerColor: Color = CupertinoNavigationBarDefaults.containerColor,
    windowInsets: WindowInsets = WindowInsets.navigationBars,
    isTransparent: Boolean = false,
    isTranslucent: Boolean = LocalAppBarsState.current != null,
    divider: @Composable () -> Unit = {
        CupertinoNavigationBarDefaults.divider()
    },
    content: @Composable RowScope.() -> Unit
) {

    val color = cupertinoTranslucentBottomBarColor(
        color = containerColor,
        isTranslucent = isTranslucent,
        isTransparent = isTransparent
    )

    CupertinoSurface(
        modifier = modifier,
        color = color
    ) {
        Column(
            Modifier.windowInsetsPadding(windowInsets)
        ) {
            if (!isTransparent) {
                divider()
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(CupertinoNavigationBarTokens.Height)
                    .selectableGroup(),
                horizontalArrangement = Arrangement.SpaceBetween,
                content = content
            )
        }
    }
}

/**
 * Item of the [CupertinoNavigationBar]
 *
 * @param selected if tab with this item is selected
 * @param onClick action performed on item click
 * @param icon item icon
 * @param modifier modifier applied to item container
 * @param enabled if this item is clickable
 * @param label item label located below the [icon]
 * @param alwaysShowLabel if label should always be visible. If this flag is false then
 * label will only be visible if this item is selected
 * @param colors item colors. See [CupertinoNavigationBarDefaults.itemColors]
 * @param interactionSource interaction source of the item click modifier
 * */
@Composable
@ExperimentalCupertinoApi
fun RowScope.CupertinoNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
    pressIndicationEnabled: Boolean = false,
    colors: CupertinoNavigationBarItemColors = CupertinoNavigationBarDefaults.itemColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {

    val pressed by interactionSource.collectIsPressedAsState()

    Column(
        modifier
            .selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.Tab,
                interactionSource = interactionSource,
                indication = null
            )
            .weight(1f)
            .padding(top = 6.dp)
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {

        val iconColor = colors.iconColor(selected, enabled)
        val textColor = colors.textColor(selected, enabled)

        ProvideTextStyle(
            value = CupertinoTheme.typography.caption2
        ) {
            val alpha = if (pressIndicationEnabled && pressed && !selected)
                textColor.alpha * CupertinoButtonTokens.PressedPlainButonAlpha
            else textColor.alpha

            CompositionLocalProvider(
                LocalContentColor provides iconColor.copy(alpha = alpha)
            ) {
                Box(
                    modifier = Modifier.size(CupertinoIconDefaults.MediumSize),
                    contentAlignment = Alignment.Center
                ) {
                    icon()
                }

                if (label != null && (alwaysShowLabel || selected)) {
                    label()
                }
            }
        }
    }
}

@Stable
@ExperimentalCupertinoApi
class CupertinoNavigationBarItemColors internal constructor(
    private val selectedIconColor: Color,
    private val selectedTextColor: Color,
    private val unselectedIconColor: Color,
    private val unselectedTextColor: Color,
    private val disabledIconColor: Color,
    private val disabledTextColor: Color,
) {
    /**
     * Represents the icon color for this item, depending on whether it is [selected].
     *
     * @param selected whether the item is selected
     * @param enabled whether the item is enabled
     */
    @Composable
    internal fun iconColor(selected: Boolean, enabled: Boolean): Color {
        return when {
            !enabled -> disabledIconColor
            selected -> selectedIconColor
            else -> unselectedIconColor
        }
    }

    /**
     * Represents the text color for this item, depending on whether it is [selected].
     *
     * @param selected whether the item is selected
     * @param enabled whether the item is enabled
     */
    @Composable
    internal fun textColor(selected: Boolean, enabled: Boolean): Color {
        return when {
            !enabled -> disabledTextColor
            selected -> selectedTextColor
            else -> unselectedTextColor
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CupertinoNavigationBarItemColors) return false

        if (selectedIconColor != other.selectedIconColor) return false
        if (unselectedIconColor != other.unselectedIconColor) return false
        if (selectedTextColor != other.selectedTextColor) return false
        if (unselectedTextColor != other.unselectedTextColor) return false
        if (disabledIconColor != other.disabledIconColor) return false
        return disabledTextColor == other.disabledTextColor
    }

    override fun hashCode(): Int {
        var result = selectedIconColor.hashCode()
        result = 31 * result + unselectedIconColor.hashCode()
        result = 31 * result + selectedTextColor.hashCode()
        result = 31 * result + unselectedTextColor.hashCode()
        result = 31 * result + disabledIconColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()

        return result
    }
}


@ExperimentalCupertinoApi
@Immutable
object CupertinoNavigationBarDefaults {

    /**
     * Default container color of the [CupertinoNavigationBar]
     *
     * Note: navigation bar itself does not produce cupertino thin material glass effect.
     * This effect works only inside [CupertinoScaffold], [CupertinoBottomSheetScaffold], [CupertinoBottomSheetContent].
     * To achieve this effect with custom top app bar use [cupertinoTranslucentTopBarColor]
     * function that will communicate with scaffold and return either
     * [Color.Transparent] if color was successfully applied to scaffold (and top bar itself
     * should be transparent) or passed color if scaffold wasn't found.
     * */
    val containerColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.tertiarySystemBackground

    @Composable
    @ReadOnlyComposable
    fun itemColors(
        selectedIconColor: Color = CupertinoTheme.colorScheme.accent,
        selectedTextColor: Color = CupertinoTheme.colorScheme.accent,
        unselectedIconColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        unselectedTextColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        disabledIconColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledTextColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
    ) = CupertinoNavigationBarItemColors(
        selectedIconColor = selectedIconColor,
        selectedTextColor = selectedTextColor,
        unselectedIconColor = unselectedIconColor,
        unselectedTextColor = unselectedTextColor,
        disabledIconColor = disabledIconColor,
        disabledTextColor = disabledTextColor
    )

    @Composable
    fun divider() {
        CupertinoHorizontalDivider()
    }
}

internal object CupertinoNavigationBarTokens {
    val Height = 49.dp
}
