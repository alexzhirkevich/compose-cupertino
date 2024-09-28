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

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White
import io.github.alexzhirkevich.cupertino.theme.isDark
import io.github.alexzhirkevich.cupertino.theme.systemGray8


/**
 * Sliding segmented control
 *
 * @param selectedTabIndex index of the current selected tab
 * @param modifier control modifier
 * @param colors segmented control colors
 * @param shape shape of the segmented control and its indicator
 * @param paddingValues outer paddings. Default values are equal to section paddings
 * @param indicator sliding indicator
 * @param tabs segmented control tabs. Usually [CupertinoSegmentedControlTab]
 *
 * @see CupertinoSegmentedControlTab
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSegmentedControl(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    colors : CupertinoSegmentedControlColors = CupertinoSegmentedControlDefaults.colors(),
    shape : Shape = CupertinoSegmentedControlDefaults.shape,
    paddingValues: PaddingValues = CupertinoSegmentedControlDefaults.PaddingValues,
    indicator: @Composable (tabPositions: List<TabPosition>) -> Unit = @Composable { tabPositions ->
        CupertinoSegmentedControlIndicator(
            selectedTabIndex = selectedTabIndex,
            tabPositions = tabPositions,
            color = colors.indicatorColor,
            shape = shape,
            separatorColor = colors.separatorColor
        )
    },
    tabs: @Composable () -> Unit
) {

    CompositionLocalProvider(
        LocalSelectedInteractionSource provides mutableStateOf(null)
    ) {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            modifier = modifier
                .padding(paddingValues)
                .heightIn(min = CupertinoSegmentedControlTokens.MinHeight)
                .clip(shape),
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            indicator = indicator,
            tabs = tabs,
        )
    }
}


/**
 * Sliding indicator of the [CupertinoSegmentedControl]
 *
 * @param selectedTabIndex index of the current selected tab
 * @param tabPositions positions of the [CupertinoSegmentedControl] tabs
 * @param shape indicator shape. Should be the same as [CupertinoSegmentedControl] shape.
 * @param color indicator color
 * @param separatorColor color of the divider between tabs
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSegmentedControlIndicator(
    selectedTabIndex: Int,
    tabPositions: List<TabPosition>,
    modifier: Modifier = Modifier,
    shape: Shape = CupertinoTheme.shapes.small,
    color: Color = CupertinoSegmentedControlDefaults.colors().indicatorColor,
    separatorColor : Color = CupertinoTheme.colorScheme.separator,
) {

    val isSmall = isTabSelectedAndPressed()

    val animatedSize by animateFloatAsState(if (isSmall) .95f else 1f)

    Spacer(
        modifier = Modifier
            .drawBehind {
                tabPositions
                    .dropLast(1)
                    .fastForEach {
                        translate(
                            left = it.right.toPx(),
                            top = size.height * 0.2f
                        ) {
                            drawLine(
                                color = separatorColor,
                                start = Offset.Zero,
                                end = Offset(0f, size.height * 0.6f)
                            )
                        }
                    }
            }
            .graphicsLayer {
                if (selectedTabIndex in tabPositions.indices) {
                    scaleX = animatedSize
                    scaleY = animatedSize

                    val selectedTabCenter = tabPositions[selectedTabIndex].let {
                        it.left + it.width / 2
                    }.toPx()

                    transformOrigin = TransformOrigin(
                        pivotFractionX = selectedTabCenter / size.width,
                        pivotFractionY = .5f
                    )
                }
            }
            .then(modifier)
            .cupertinoTabIndicatorOffset(
                tabPositions = tabPositions,
                selectedTabIndex = selectedTabIndex
            )
            .padding(CupertinoSegmentedControlTokens.IndicatorPadding)
            .shadow(
                elevation = CupertinoSegmentedControlTokens.IndicatorElevation,
                shape = shape
            )
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color)
    )
}

/**
 * Tab of the [CupertinoSegmentedControl]
 *
 * @param onClick tab click callback
 * @param modifier tab modifier
 * @param interactionSource tab interaction source
 * @param content tab content
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSegmentedControlTab(
    onClick: () -> Unit,
    isSelected : Boolean,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {

    val pressed by interactionSource.collectIsPressedAsState()

    val animatedAloha by animateFloatAsState(
        if (pressed) CupertinoButtonTokens.PressedPlainButonAlpha else 1f
    )

    val source = LocalSelectedInteractionSource.current

    LaunchedEffect(source, isSelected) {
        if (isSelected) {
            source.value = interactionSource
        }
    }

    val animatedScale by animateFloatAsState(
        if (pressed && isSelected) .9f  else 1f
    )

    Box(
        modifier = modifier
            .heightIn(min = CupertinoSegmentedControlTokens.MinHeight)
            .graphicsLayer {
                alpha = animatedAloha
                scaleY = animatedScale
                scaleX = animatedScale
            }
            .clickable(
                onClick = onClick,
                indication = null,
                interactionSource = interactionSource,
                role = Role.Tab
            ),
        contentAlignment = Alignment.Center
    ) {
        ProvideTextStyle(
            CupertinoTheme.typography.caption1.copy(
                fontWeight = FontWeight.SemiBold,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center
            ),
            content = content
        )
    }
}

class CupertinoSegmentedControlColors internal constructor(
    val containerColor: Color,
    val contentColor : Color,
    val indicatorColor: Color,
    val separatorColor : Color
)

internal object CupertinoSegmentedControlTokens {
    val MinHeight = 34.dp
    val IndicatorElevation : Dp = 4.dp
    val IndicatorPadding : Dp = 2.dp
}

@Immutable
object CupertinoSegmentedControlDefaults {

    val PaddingValues : PaddingValues
        get() = CupertinoSectionDefaults.PaddingValues

    val shape : Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.shapes.small

    @Composable
    @ReadOnlyComposable
    fun colors(
        containerColor : Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicatorColor: Color = if (isDark())
            CupertinoColors.systemGray8(true)
        else CupertinoColors.White,
        contentColor: Color = CupertinoTheme.colorScheme.label,
        separatorColor: Color = CupertinoTheme.colorScheme.separator
    ) = CupertinoSegmentedControlColors(
        containerColor = containerColor,
        contentColor = contentColor,
        indicatorColor = indicatorColor,
        separatorColor = separatorColor
    )
}


private val OffsetShift = 10.dp

private fun Modifier.cupertinoTabIndicatorOffset(
    tabPositions: List<TabPosition>,
    selectedTabIndex: Int,
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "tabIndicatorOffset"
        value = tabPositions[selectedTabIndex]
    }
) {

    val isFirst = selectedTabIndex == 0
    val isLast = selectedTabIndex == tabPositions.lastIndex

    val currentTabPosition = tabPositions[selectedTabIndex]


    val currentTabWidth by animateDpAsState(
        targetValue = currentTabPosition.width +
                if (isFirst || isLast) OffsetShift/2 else OffsetShift,
        animationSpec = cupertinoTween()
    )
    val indicatorOffset by animateDpAsState(
        targetValue = currentTabPosition.left - if (isFirst) 0.dp else OffsetShift/2,
        animationSpec = cupertinoTween()
    )

    fillMaxWidth()
        .wrapContentSize(Alignment.CenterStart)
        .offset(x = indicatorOffset)
        .width(currentTabWidth)
}

@Composable
private fun isTabSelectedAndPressed() : Boolean {
    val source = LocalSelectedInteractionSource.current.value ?: return false

    return source.collectIsPressedAsState().value
}

private val LocalSelectedInteractionSource =
    compositionLocalOf<MutableState<InteractionSource?>> {
        mutableStateOf(null)
    }