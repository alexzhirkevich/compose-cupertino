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
import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.*

/**
 * Cupertino-styled segmented control.
 *
 * @param selectedTabIndex The index of the currently selected tab.
 * @param modifier Modifier for customization.
 * @param colors Colors used for the segmented control.
 * @param shape The shape of the segmented control and its indicator.
 * @param paddingValues Padding around the segmented control.
 * @param indicator The composable defining the sliding indicator.
 * @param tabs Composable representing the tabs.
 */
@Composable
fun CupertinoSegmentedControl(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    colors: CupertinoSegmentedControlColors = CupertinoSegmentedControlDefaults.colors(),
    shape: Shape = CupertinoSegmentedControlDefaults.shape,
    paddingValues: PaddingValues = CupertinoSegmentedControlDefaults.PaddingValues,
    indicator: @Composable (List<TabPosition>) -> Unit = { tabPositions ->
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
        LocalSelectedInteractionSource provides remember { mutableStateOf(null) }
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
 * Cupertino-styled segmented control indicator.
 *
 * @param selectedTabIndex Index of the currently selected tab.
 * @param tabPositions Positions of the tabs in the segmented control.
 * @param shape The shape of the indicator.
 * @param color The color of the indicator.
 * @param separatorColor Color of the dividers between tabs.
 */
@Composable
fun CupertinoSegmentedControlIndicator(
    selectedTabIndex: Int,
    tabPositions: List<TabPosition>,
    modifier: Modifier = Modifier,
    shape: Shape = CupertinoTheme.shapes.small,
    color: Color = CupertinoSegmentedControlDefaults.colors().indicatorColor,
    separatorColor: Color = CupertinoTheme.colorScheme.separator
) {
    val isPressed = isTabSelectedAndPressed()
    val animatedScale by animateFloatAsState(if (isPressed) 0.95f else 1f)

    Spacer(
        modifier = Modifier
            .drawBehind {
                tabPositions.dropLast(1).fastForEach {
                    translate(left = it.right.toPx(), top = size.height * 0.2f) {
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
                    scaleX = animatedScale
                    scaleY = animatedScale
                    val selectedTabCenter = tabPositions[selectedTabIndex].let {
                        it.left + it.width / 2
                    }.toPx()

                    transformOrigin = TransformOrigin(
                        pivotFractionX = selectedTabCenter / size.width,
                        pivotFractionY = 0.5f
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
 * A single tab in the Cupertino segmented control.
 *
 * @param onClick Action to perform when the tab is clicked.
 * @param isSelected Whether the tab is selected.
 * @param modifier Modifier for customization.
 * @param interactionSource Interaction source for user input.
 * @param content Content of the tab.
 */
@Composable
fun CupertinoSegmentedControlTab(
    onClick: () -> Unit,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    val isPressed by interactionSource.collectIsPressedAsState()
    val animatedAlpha by animateFloatAsState(
        if (isPressed) CupertinoButtonTokens.PressedPlainButtonAlpha else 1f
    )
    val animatedScale by animateFloatAsState(
        if (isPressed && isSelected) 0.9f else 1f
    )

    Box(
        modifier = modifier
            .heightIn(min = CupertinoSegmentedControlTokens.MinHeight)
            .graphicsLayer {
                alpha = animatedAlpha
                scaleX = animatedScale
                scaleY = animatedScale
            }
            .clickable(
                onClick = onClick,
                interactionSource = interactionSource,
                indication = null,
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

@Composable
private fun isTabSelectedAndPressed(): Boolean {
    val source = LocalSelectedInteractionSource.current.value ?: return false
    return source.collectIsPressedAsState().value
}

private val LocalSelectedInteractionSource =
    compositionLocalOf<MutableState<InteractionSource?>> { mutableStateOf(null) }

private fun Modifier.cupertinoTabIndicatorOffset(
    tabPositions: List<TabPosition>,
    selectedTabIndex: Int
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "tabIndicatorOffset"
        value = tabPositions[selectedTabIndex]
    }
) {
    val isFirst = selectedTabIndex == 0
    val isLast = selectedTabIndex == tabPositions.lastIndex
    val currentTabPosition = tabPositions[selectedTabIndex]

    val animatedTabWidth by animateDpAsState(
        targetValue = currentTabPosition.width + if (isFirst || isLast) OffsetShift / 2 else OffsetShift,
        animationSpec = cupertinoTween()
    )
    val animatedOffset by animateDpAsState(
        targetValue = currentTabPosition.left - if (isFirst) 0.dp else OffsetShift / 2,
        animationSpec = cupertinoTween()
    )

    fillMaxWidth()
        .wrapContentSize(Alignment.CenterStart)
        .offset(x = animatedOffset)
        .width(animatedTabWidth)
}

private val OffsetShift = 10.dp
