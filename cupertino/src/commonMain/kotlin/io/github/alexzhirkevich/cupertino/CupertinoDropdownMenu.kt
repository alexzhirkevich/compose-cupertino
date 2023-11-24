/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.section.Draw
import io.github.alexzhirkevich.cupertino.section.SectionScopeImpl
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.section.SectionTokens
import io.github.alexzhirkevich.cupertino.theme.BrightSeparatorColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.SystemGray7
import kotlin.math.max
import kotlin.math.min


@Composable
@ExperimentalCupertinoApi
fun CupertinoDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    paddingValues: PaddingValues = CupertinoDropdownMenuDefaults.PaddingValues,
    containerColor : Color = CupertinoDropdownMenuDefaults.ContainerColor,
    width: Dp = CupertinoDropdownMenuDefaults.Width,
    elevation: Dp = DropdownMenuElevation,
    scrollState: ScrollState = rememberScrollState(),
    properties: PopupProperties = PopupProperties(focusable = true),
    title: (@Composable (PaddingValues) -> Unit)? = null,
    content: CupertinoDropdownMenuScope.() -> Unit
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
            DropdownMenuContent(
                containerColor = containerColor,
                expandedStates = expandedStates,
                transformOriginState = transformOriginState,
                scrollState = scrollState,
                modifier = modifier,
                title = title,
                content = content,
                width = width,
                paddingValue = paddingValues,
                elevation = elevation
            )
        }
    }
}

interface CupertinoDropdownMenuScope {

    /**
     * Plain section item withoud additional controls
     * */
    fun item(
        key: Any? = null,
        minHeight : Dp = MinItemHeight,
        hasDivider : Boolean = true,
        content: @Composable (padding : PaddingValues) -> Unit
    )

    fun button(
        onClick: () -> Unit,
        key: Any? = null,
        enabled: Boolean = true,
        contentColor : @Composable () -> Color = { Color.Unspecified },
        icon: (@Composable () -> Unit) = {},
        caption : @Composable () -> Unit = {},
        title: @Composable () -> Unit,
    )

    fun divider()
}


internal class CupertinoDropdownMenuScopeImpl : CupertinoDropdownMenuScope {

    val delegate = SectionScopeImpl()

    override fun item(
        key: Any?,
        minHeight : Dp,
        hasDivider : Boolean,
        content: @Composable (padding: PaddingValues) -> Unit
    ) {
        delegate.item(
            key = key,
            dividerPadding = if (hasDivider) 0.dp else null,
            minHeight = minHeight,
            content = content,
        )
    }

    override fun button(
        onClick: () -> Unit,
        key: Any?,
        enabled: Boolean,
        contentColor : @Composable () -> Color ,
        icon: @Composable (() -> Unit),
        caption: @Composable () -> Unit,
        title: @Composable () -> Unit
    ) {
        item(key = key) {

            val color = contentColor().takeOrElse {
                LocalContentColor.current
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .heightIn(min = SectionTokens.MinHeight)
                    .fillMaxWidth()
                    .clickable(
                        enabled = enabled,
                        onClick = onClick,
                        role = Role.DropdownList,
                    )
                    .padding(it)
            ) {

                CompositionLocalProvider(LocalContentColor provides color) {
                    ProvideTextStyle(CupertinoTheme.typography.body) {
                        title()

                        Spacer(Modifier.weight(1f))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(SectionTokens.SplitPadding)
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
    }

    override fun divider() {
        delegate.item(
            minHeight = DividerHeight,
            dividerPadding = null
        ) {
            Spacer(
                modifier = Modifier
                    .height(DividerHeight)
                    .fillMaxWidth()
                    .background(CupertinoDropdownMenuDefaults.DividerColor)
            )
        }
    }
}

@Composable
internal fun DropdownMenuContent(
    width : Dp,
    containerColor : Color,
    expandedStates: MutableTransitionState<Boolean>,
    transformOriginState: MutableState<TransformOrigin>,
    scrollState: ScrollState,
    paddingValue: PaddingValues,
    modifier: Modifier = Modifier,
    elevation : Dp,
    title: (@Composable (PaddingValues) -> Unit)?,
    content: CupertinoDropdownMenuScope.() -> Unit
) {
    // Menu open/close animation.
    val transition = updateTransition(expandedStates, "DropDownMenu")

    val scale by transition.animateFloat(
        transitionSpec = {
            if (false isTransitioningTo true) {
                // Dismissed to expanded
                tween(
                    durationMillis = TransitionDuration,
                    easing = LinearOutSlowInEasing
                )
            } else {
//                cupertinoTween(
//                    durationMillis = TransitionDuration
//                )
                // Expanded to dismissed.
                tween(
                    durationMillis = TransitionDuration,
                    easing = LinearOutSlowInEasing
                )
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
                tween(durationMillis = TransitionDuration)
            } else {
                // Expanded to dismissed.
                tween(durationMillis = TransitionDuration)
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

    Surface(
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
        color = containerColor,
    ) {

        val scope = remember(content) { CupertinoDropdownMenuScopeImpl().apply(content) }

        CompositionLocalProvider(
            LocalSeparatorColor provides BrightSeparatorColor
        ) {
            Column(
                modifier = modifier
                    .width(IntrinsicSize.Max)
                    .verticalScroll(scrollState),
            ) {
                if (title != null) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        ProvideTextStyle(
                            CupertinoTheme.typography.footnote.copy(
                                textAlign = TextAlign.Center,
                            )
                        ) {
                            CompositionLocalProvider(
                                LocalContentColor provides CupertinoTheme.colorScheme.tertiaryLabel
                            ) {
                                title(CupertinoDropdownMenuDefaults.TitlePadding)
                            }
                        }
                    }
                    Separator()
                }
                ProvideTextStyle(
                    CupertinoTheme.typography.body.copy(
                        fontWeight = FontWeight.Light
                    )
                ) {
                    scope.delegate.Draw()
                }
            }
        }
    }
}

//@Composable
//internal fun DropdownMenuItemContent(
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier,
//    enabled: Boolean = true,
//    contentPadding: PaddingValues = MenuDefaults.DropdownMenuItemContentPadding,
//    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
//    content: @Composable RowScope.() -> Unit
//) {
//    // TODO(popam, b/156911853): investigate replacing this Row with ListItem
//    Row(
//        modifier = modifier
//            .clickable(
//                enabled = enabled,
//                onClick = onClick,
//                indication = LocalIndication.current,
//                interactionSource = interactionSource,
//            )
//            .fillMaxWidth()
//            // Preferred min and max width used during the intrinsic measurement.
//            .sizeIn(
//                minWidth = DropdownMenuItemDefaultMinWidth,
//                maxWidth = DropdownMenuItemDefaultMaxWidth,
//                minHeight = DropdownMenuItemDefaultMinHeight
//            )
//            .padding(contentPadding),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        val typography = CupertinoTheme.typography
//        ProvideTextStyle(typography.body) {
//            val contentAlpha = if (enabled) 1f else CupertinoButtonDefaults.PressedPlainButonAlpha
//
//            CompositionLocalProvider(LocalContentColor provides LocalContentColor.current.copy(
//                alpha = contentAlpha
//            )) {
//                content()
//            }
//        }
//    }
//}


private val MinItemHeight = SectionTokens.MinHeight
private val DividerHeight = 6.dp
private val DropdownMenuElevation = 2.dp


/**
 * Contains default values used for [DropdownMenuItem].
 */
object CupertinoDropdownMenuDefaults {

    val Width = 260.dp

    val PaddingValues = PaddingValues(0.dp, 6.dp)

    val TitlePadding = PaddingValues(8.dp)

    val Shape: Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoSectionDefaults.shape(SectionStyle.InsetGrouped)

//    /**
//     * Default padding used for [DropdownMenuItem].
//     */
//    val DropdownMenuItemContentPadding = PaddingValues(
//        horizontal = DropdownMenuItemHorizontalPadding,
//        vertical = 0.dp
//    )

    val ContainerColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.tertiarySystemBackground

    val DividerColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoColors.SystemGray7
}

// Size defaults.
internal val MenuVerticalMargin = 48.dp

// Menu animation.
internal const val TransitionDuration = 250

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
                (max(parentBounds.left, menuBounds.left) + min(parentBounds.right, menuBounds.right)) / 2
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

// Menu positioning.

/**
 * Calculates the position of a Material [DropdownMenu].
 */
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
        val centerToAnchorTop = anchorBounds.top - popupContentSize.height / 2 + contentOffsetY
        val bottomToWindowBottom = windowSize.height - popupContentSize.height - verticalMargin
        val y = sequenceOf(
            topToAnchorBottom,
            bottomToAnchorTop,
            centerToAnchorTop,
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