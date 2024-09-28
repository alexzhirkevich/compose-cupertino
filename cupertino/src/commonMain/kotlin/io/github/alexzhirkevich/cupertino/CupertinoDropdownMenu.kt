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

import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.rememberTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.util.fastMap
import androidx.compose.ui.util.fastSumBy
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.Checkmark
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionTokens
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.theme.BrightSeparatorColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.systemGray7
import io.github.alexzhirkevich.cupertino.theme.systemRed
import kotlin.math.max
import kotlin.math.min

sealed interface CupertinoMenuScope

/**
 * Cupertino elevated dropdown menu. Usually used for top bar actions.
 *
 * @see MenuSection
 * @see MenuTitle
 * @see MenuAction
 * @see MenuPickerAction
 * @see MenuDivider
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    paddingValues: PaddingValues = CupertinoDropdownMenuDefaults.PaddingValues,
    containerColor: Color = CupertinoDropdownMenuDefaults.ContainerColor,
    width: Dp = CupertinoDropdownMenuDefaults.DefaultWidth,
    elevation: Dp = CupertinoDropdownMenuDefaults.Elevation,
    scrollState: ScrollState = rememberScrollState(),
    properties: PopupProperties = PopupProperties(focusable = true),
    content: @Composable CupertinoMenuScope.() -> Unit
) {

    val expandedStates = remember { MutableTransitionState(false) }
    expandedStates.targetState = expanded

    if (expandedStates.currentState || expandedStates.targetState) {
        val transformOriginState = remember { mutableStateOf(TransformOrigin.Center) }
        val density = LocalDensity.current
        val popupPositionProvider = DropdownMenuPositionProvider(
            offset,
            density
        ) { parentBounds, menuBounds ->
            transformOriginState.value = calculateTransformOrigin(parentBounds, menuBounds)
        }

        Popup(
            onDismissRequest = onDismissRequest,
            popupPositionProvider = popupPositionProvider,
            properties = properties
        ) {

            val scope = remember {
                CupertinoMenuScopeImpl()
            }
            DropdownMenuContent(
                containerColor = containerColor,
                expandedStates = expandedStates,
                transformOriginState = transformOriginState,
                scrollState = scrollState,
                modifier = modifier,
                content = { scope.run { content() } },
                width = width,
                paddingValue = paddingValues,
                elevation = elevation
            )
        }
    }
}


/**
 * Plain menu item with manual padding control.
 * Usually shouldn't be used directly.
 *
 * @param minHeight minimum item height
 * @param content item content
 *
 * @see MenuSection
 * @see MenuTitle
 * @see MenuAction
 * @see MenuPickerAction
 * @see MenuDivider
 * */
@Composable
fun CupertinoMenuScope.MenuItem(
    modifier: Modifier = Modifier,
    minHeight: Dp = MinItemHeight,
    content: @Composable (padding: PaddingValues) -> Unit
) {
    this as CupertinoMenuScopeImpl

    Box(
        modifier = modifier.heightIn(minHeight),
        contentAlignment = Alignment.CenterStart
    ) {
        content(
            CupertinoSectionDefaults.PaddingValues.let {
                if (!hasPicker) it else it.copy(
                    start = it.calculateStartPadding(
                        LocalLayoutDirection.current
                    ) + SelectorSize
                )
            }
        )
    }
}

/**
 * Group of buttons with top [MenuTitle] and bottom [MenuDivider]
 *
 * @see MenuTitle
 * @see MenuDivider
 * */
@Composable
inline fun CupertinoMenuScope.MenuSection(
    noinline title: (@Composable () -> Unit)? = null,
    content: @Composable CupertinoMenuScope.() -> Unit
) {
    if (title != null)
        MenuTitle(title = title)
    content()
    MenuDivider()
}


/**
 * Title of the [MenuSection]
 * */
@Composable
fun CupertinoMenuScope.MenuTitle(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit
) {
    MenuItem(
        modifier = modifier,
        minHeight = MinTitleHeight
    ) {
        CompositionLocalProvider(
            LocalContentColor provides CupertinoTheme.colorScheme.secondaryLabel
        ) {
            ProvideTextStyle(
                CupertinoTheme.typography.footnote
            ) {
                Box(
                    Modifier
                        .padding(it),
                ) {
                    title()
                }
            }
        }
    }
}

/**
 * Default menu button

 * @param onClick block performed on action click
 * @param modifier item modifier
 * @param onClickLabel semantics label for the [onClick] action. Should be the same text as in [title]
 * @param contentColor color of the item contend.
 * Usually [CupertinoColors.systemRed] is used for destructive actions.
 * @param icon action trailing icon
 * @param caption content before [icon]
 * @param title action title
 * */
@Composable
fun CupertinoMenuScope.MenuAction(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onClickLabel: String? = null,
    enabled: Boolean = true,
    contentColor: Color = CupertinoDropdownMenuDefaults.ContentColor,
    icon: (@Composable () -> Unit) = {},
    caption: @Composable () -> Unit = {},
    title: @Composable () -> Unit,
) = ActionWithoutPadding(
    onClickLabel = onClickLabel,
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    contentColor = contentColor,
    icon = icon,
    caption = caption
) {
    Box(
        modifier = Modifier.padding(it)
    ) {
        title()
    }
}

/**
 * Picker action with leading icon ([Checkmark] by default) if selected.
 *
 * If menu has at least one picker action (no matter selected or not)
 * then all menu items will have additional start padding
 *
 * @param isSelected selection flag. If item is selected, it will have a [selectionIcon]
 * @param onClick block performed on action click
 * @param modifier item modifier
 * @param onClickLabel semantics label for the [onClick] action. Should be the same text as in [title]
 * @param contentColor color of the item contend.
 * Usually [CupertinoColors.systemRed] is used for destructive actions.
 * @param icon action trailing icon
 * @param caption content before [icon]
 * @param title action title
 * */
@Composable
fun CupertinoMenuScope.MenuPickerAction(
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onClickLabel: String? = null,
    enabled: Boolean = true,
    contentColor: Color = CupertinoDropdownMenuDefaults.ContentColor,
    selectionIcon: (@Composable () -> Unit) = { CupertinoDropdownMenuDefaults.PickerLeadingIcon() },
    icon: (@Composable () -> Unit) = {},
    caption: @Composable () -> Unit = {},
    title: @Composable () -> Unit,
) {
    this as CupertinoMenuScopeImpl

    DisposableEffect(this) {
        val prev = hasPicker
        hasPicker = true
        onDispose {
            hasPicker = prev
        }
    }

    ActionWithoutPadding(
        modifier = modifier
            .semantics(mergeDescendants = true) {
                selected = isSelected
                role = Role.DropdownList
            },
        onClickLabel = onClickLabel,
        onClick = onClick,
        enabled = enabled,
        contentColor = contentColor,
        icon = icon,
        caption = caption,
        title = { pv ->
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier.size(MinItemHeight),
                    contentAlignment = Alignment.Center
                ) {
                    if (isSelected) {
                        selectionIcon()
                    }
                }
                Box(
                    modifier = Modifier.padding(pv)
                ) {
                    title()
                }
            }
        }
    )
}


/**
 * Separator for the menu actions groups
 * */
@Composable
fun CupertinoMenuScope.MenuDivider(
    modifier: Modifier = Modifier,
    color: Color? = null,
    height: Dp = DividerHeight
) = MenuItem(
    minHeight = DividerHeight,
) {
    Spacer(
        modifier = modifier
            .height(height)
            .fillMaxWidth()
            .background(color ?: CupertinoDropdownMenuDefaults.DividerColor)
    )
}


@Composable
private fun CupertinoMenuScope.ActionWithoutPadding(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onClickLabel: String? = null,
    enabled: Boolean = true,
    contentColor: Color = Color.Unspecified,
    icon: @Composable () -> Unit = {},
    caption: @Composable () -> Unit = {},
    title: @Composable (PaddingValues) -> Unit,
) = MenuItem {

    val color = contentColor.takeOrElse {
        LocalContentColor.current
    }.let {
        if (enabled) it else it.copy(alpha = it.alpha / 4f)
    }
    ProvideTextStyle(CupertinoTheme.typography.body) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .heightIn(min = CupertinoSectionTokens.MinHeight)
                .fillMaxWidth()
                .clickable(
                    enabled = enabled,
                    onClick = onClick,
                    onClickLabel = onClickLabel,
                    role = Role.DropdownList,
                ),
        ) {
            CompositionLocalProvider(LocalContentColor provides color) {
                title(it.copy(end = 0.dp))

                Spacer(Modifier.weight(1f))

                Row(
                    modifier = Modifier.padding(
                        it.copy(start = 0.dp)
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(CupertinoSectionTokens.SplitPadding)
                ) {
                    caption.invoke()

                    Box(
                        Modifier
                            .size(MinItemHeight / 2),
                        contentAlignment = Alignment.Center
                    ) {
                        icon.invoke()
                    }
                }
            }
        }
    }
}

/**
 * Contains default values used for [CupertinoDropdownMenu].
 */
@Immutable
object CupertinoDropdownMenuDefaults {

    val DefaultWidth = 260.dp
    val SmallWidth = 160.dp

    val Elevation = 16.dp

    val PaddingValues = PaddingValues(
        horizontal = DividerHeight,
        vertical = 6.dp
    )

    val Shape: Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoSectionDefaults.shape(SectionStyle.InsetGrouped)

    val ContainerColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.tertiarySystemBackground


    val ContentColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.label

    val DividerColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoColors.systemGray7

    @Composable
    fun PickerLeadingIcon() {
        CupertinoIcon(
            imageVector = CupertinoIcons.Default.Checkmark,
            modifier = Modifier.size(CupertinoIconDefaults.SmallSize),
            contentDescription = null
        )
    }
}

@Composable
private fun DropdownMenuContent(
    width: Dp,
    containerColor: Color,
    expandedStates: MutableTransitionState<Boolean>,
    transformOriginState: MutableState<TransformOrigin>,
    scrollState: ScrollState,
    paddingValue: PaddingValues,
    modifier: Modifier = Modifier,
    elevation: Dp,
    content: @Composable () -> Unit
) {
    // Menu open/close animation.
    val transition = rememberTransition(expandedStates, "DropDownMenu")

    val scale by transition.animateFloat(
        transitionSpec = {
            if (false isTransitioningTo true) {
                // Dismissed to expanded
                MenuEnterTransition
            } else {
                // Expanded to dismissed.
                MenuExitTransition
            }
        }
    ) {
        if (it) {
            // Menu is expanded.
            1f
        } else {
            // Menu is dismissed.
            .1f
        }
    }

    val alpha by transition.animateFloat(
        transitionSpec = {
            if (false isTransitioningTo true) {
                // Dismissed to expanded
                MenuEnterTransition
            } else {
                MenuExitTransition
            }
        }
    ) {
        if (it) {
            // Menu is expanded.
            1f
        } else {
            // Menu is dismissed.
            0f
        }
    }

    val shape = CupertinoDropdownMenuDefaults.Shape

    CupertinoSurface(
        modifier = Modifier
            .padding(paddingValue)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
                this.alpha = alpha
                transformOrigin = transformOriginState.value
                this.shape = shape
                clip = true
                shadowElevation = elevation.toPx()
            }.width(width),
        color = containerColor
    ) {

        CompositionLocalProvider(
            LocalSeparatorColor provides BrightSeparatorColor
        ) {
            ProvideTextStyle(
                CupertinoTheme.typography.body
            ) {
                SubcomposeLayout(
                    modifier = modifier
                        .fillMaxWidth()
                        .heightIn(max = MenuMaxHeight)
                        .verticalScroll(scrollState)
                ) { constraints ->
                    val layoutWidth = constraints.maxWidth

                    val itemPlaceables = subcompose(CupertinoDropdownMenuSlots.Item, content)
                        .fastMap { it.measure(constraints) }

                    val dividerHeightPx = DividerHeight.toPx()

                    fun dividerPlaceable(idx: Int) =
                        subcompose(idx) { CupertinoHorizontalDivider() }.first().measure(constraints)

                    val allPlacements = buildList(itemPlaceables.size * 2) {
                        itemPlaceables.fastForEachIndexed { index, placeable ->
                            add(placeable)
                            if (index != itemPlaceables.lastIndex &&
                                placeable.height > dividerHeightPx &&
                                itemPlaceables[index + 1].height > dividerHeightPx
                            ) {
                                add(dividerPlaceable(index))
                            }
                        }
                    }

                    val height = allPlacements.fastSumBy { it.height }

                    layout(layoutWidth, height) {
                        var y = 0
                        allPlacements.fastForEach {
                            it.placeRelative(0, y)
                            y += it.height
                        }
                    }
                }
            }
        }
    }
}

private enum class CupertinoDropdownMenuSlots {
    Item, Separator
}

internal fun calculateTransformOrigin(
    parentBounds: IntRect,
    menuBounds: IntRect
): TransformOrigin {
    val pivotX = when {
        menuBounds.left >= parentBounds.right -> 0f
        menuBounds.right <= parentBounds.left -> 1f
        menuBounds.width == 0 -> 0f
        else -> {
            val intersectionCenter =
                (max(parentBounds.left, menuBounds.left) + min(
                    parentBounds.right,
                    menuBounds.right
                )) / 2
            (intersectionCenter - menuBounds.left).toFloat() / menuBounds.width
        }
    }
    val pivotY = when {
        menuBounds.top >= parentBounds.bottom -> 0f
        menuBounds.bottom <= parentBounds.top -> 1f
        menuBounds.height == 0 -> 0f
        else -> {
            val intersectionCenter =
                (
                        max(parentBounds.top, menuBounds.top) +
                                min(parentBounds.bottom, menuBounds.bottom)
                        ) / 2
            (intersectionCenter - menuBounds.top).toFloat() / menuBounds.height
        }
    }
    return TransformOrigin(pivotX, pivotY)
}

@Immutable
internal data class DropdownMenuPositionProvider(
    val contentOffset: DpOffset,
    val density: Density,
    val onPositionCalculated: (IntRect, IntRect) -> Unit = { _, _ -> }
) : PopupPositionProvider {
    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        // The min margin above and below the menu, relative to the screen.
        val verticalMargin = with(density) { MenuVerticalMargin.roundToPx() }
        // The content offset specified using the dropdown offset parameter.
        val contentOffsetX = with(density) {
            contentOffset.x.roundToPx() * (if (layoutDirection == LayoutDirection.Ltr) 1 else -1)
        }
        val contentOffsetY = with(density) { contentOffset.y.roundToPx() }

        // Compute horizontal position.
        val leftToAnchorLeft = anchorBounds.left + contentOffsetX
        val rightToAnchorRight = anchorBounds.right - popupContentSize.width + contentOffsetX
        val rightToWindowRight = windowSize.width - popupContentSize.width
        val leftToWindowLeft = 0
        val x = if (layoutDirection == LayoutDirection.Ltr) {
            sequenceOf(
                leftToAnchorLeft,
                rightToAnchorRight,
                // If the anchor gets outside of the window on the left, we want to position
                // toDisplayLeft for proximity to the anchor. Otherwise, toDisplayRight.
                if (anchorBounds.left >= 0) rightToWindowRight else leftToWindowLeft
            )
        } else {
            sequenceOf(
                rightToAnchorRight,
                leftToAnchorLeft,
                // If the anchor gets outside of the window on the right, we want to position
                // toDisplayRight for proximity to the anchor. Otherwise, toDisplayLeft.
                if (anchorBounds.right <= windowSize.width) leftToWindowLeft else rightToWindowRight
            )
        }.firstOrNull {
            it >= 0 && it + popupContentSize.width <= windowSize.width
        } ?: rightToAnchorRight

        // Compute vertical position.
        val topToAnchorBottom = maxOf(anchorBounds.bottom + contentOffsetY, verticalMargin)
        val bottomToAnchorTop = anchorBounds.top - popupContentSize.height + contentOffsetY
//        val centerToAnchorTop = anchorBounds.top - popupContentSize.height / 2 + contentOffsetY
        val bottomToWindowBottom = windowSize.height - popupContentSize.height - verticalMargin
        val y = sequenceOf(
            topToAnchorBottom,
            bottomToAnchorTop,
//            centerToAnchorTop,
            bottomToWindowBottom
        ).firstOrNull {
            it >= verticalMargin &&
                    it + popupContentSize.height <= windowSize.height - verticalMargin
        } ?: bottomToAnchorTop

        onPositionCalculated(
            anchorBounds,
            IntRect(x, y, x + popupContentSize.width, y + popupContentSize.height)
        )
        return IntOffset(x, y)
    }
}

internal class CupertinoMenuScopeImpl : CupertinoMenuScope {
    var hasPicker: Boolean by mutableStateOf(false)
}


private val MenuMaxHeight: Dp = 600.dp
private val SelectorSize = 20.dp

private val MenuVerticalMargin = 12.dp
private val MinItemHeight = CupertinoSectionTokens.MinHeight
private val DividerHeight = 8.dp
private val MinTitleHeight = 32.dp

private val MenuEnterTransition = spring<Float>(
    dampingRatio = .825f,
    stiffness = Spring.StiffnessMediumLow
)

private val MenuExitTransition = tween<Float>(
    durationMillis = 350,
    easing = LinearOutSlowInEasing
)
