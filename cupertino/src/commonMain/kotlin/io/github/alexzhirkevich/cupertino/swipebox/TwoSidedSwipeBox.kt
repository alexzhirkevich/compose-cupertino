@file:OptIn(ExperimentalFoundationApi::class)

package io.github.alexzhirkevich.cupertino.swipebox


import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.InternalCupertinoApi
import io.github.alexzhirkevich.cupertino.LocalContainerColor
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.systemBlue
import kotlin.math.roundToInt

enum class SwipeBoxStates {
    Resting,
    EndVisible,
    StartVisible,
    EndFullyExpanded,
    StartFullyExpanded,
}

@Composable
fun TwoSidedSwipeBox(
    height: Dp = 72.dp,
    fullExpansionStart: Boolean = true,
    fullExpansionEnd: Boolean = true,
    scrollableState: ScrollableState,
    startActionItem: (@Composable RowScope.() -> Unit)? = null,
    endActionItem: (@Composable RowScope.() -> Unit)? = null,
    content: @Composable BoxScope.() -> Unit
) {
    TwoSidedSwipeBox(
        height = height,
        fullExpansionStart = fullExpansionStart,
        fullExpansionEnd = fullExpansionEnd,
        scrollableState = scrollableState,
        startActionItems = if (startActionItem == null) emptyList() else listOf(startActionItem),
        endActionItems =  if (endActionItem == null) emptyList() else listOf(endActionItem),
        content = content
    )
}

@OptIn(ExperimentalFoundationApi::class, InternalCupertinoApi::class,)
@Composable
fun TwoSidedSwipeBox(
    height: Dp = 72.dp,
    fullExpansionStart: Boolean = true,
    fullExpansionEnd: Boolean = true,
    scrollableState: ScrollableState,
    startActionItems: List<@Composable RowScope.() -> Unit> = emptyList(),
    endActionItems: List<@Composable RowScope.() -> Unit> = emptyList(),
    content: @Composable BoxScope.() -> Unit
) {
    val density = LocalDensity.current
    var parentWidth by remember { mutableStateOf(0) }
    val isStartActionItemSupplied = startActionItems.isNotEmpty()
    val isEndActionItemSupplied = endActionItems.isNotEmpty()

    val swipeBoxState = remember {
        AnchoredDraggableState(
            initialValue = SwipeBoxStates.Resting,
            snapAnimationSpec = SpringSpec(
                stiffness = Spring.StiffnessMedium,
                dampingRatio = Spring.DampingRatioLowBouncy
            ),
            decayAnimationSpec = splineBasedDecay(density),
            positionalThreshold = { distance -> distance * 0.5f },
            velocityThreshold = { Float.POSITIVE_INFINITY }
        )
    }

    val hapticFeedback = LocalHapticFeedback.current
    var hasTriggeredHapticFeedback by remember { mutableStateOf(false) }
    var anchorsInitialized by remember { mutableStateOf(false) }

    // Store state of fully expanded
    val isFullyExpandedStart = remember { mutableStateOf(false) }
    val isFullyExpandedEnd = remember { mutableStateOf(false) }

    AnchorsEffect(
        parentWidth = parentWidth,
        fullExpansionStart = fullExpansionStart,
        isStartActionItemSupplied = isStartActionItemSupplied,
        fullExpansionEnd = fullExpansionEnd,
        isEndActionItemSupplied = isEndActionItemSupplied,
        swipeBoxState = swipeBoxState,
        density = density
    ) { anchorsInitialized = it }

    HapticFeedbackEffect(
        fullExpansionStart = fullExpansionStart,
        fullExpansionEnd = fullExpansionEnd,
        isFullyExpandedStart = isFullyExpandedStart,
        isFullyExpandedEnd = isFullyExpandedEnd,
        swipeBoxState = swipeBoxState,
        hapticFeedback = hapticFeedback,
        hasTriggeredHapticFeedback = hasTriggeredHapticFeedback
    ) { hasTriggeredHapticFeedback = it }

    ScrollEffect(
        scrollableState = scrollableState,
        swipeBoxState = swipeBoxState
    )

    DismissFullyExpandedEffect(
        swipeBoxState = swipeBoxState,
        isStartActionItemSupplied = isStartActionItemSupplied,
        fullExpansionStart = fullExpansionStart,
        isEndActionItemSupplied = isEndActionItemSupplied,
        fullExpansionEnd = fullExpansionEnd,
    )

    CompositionLocalProvider(
        LocalSwipeBoxExpansionState provides SwipeBoxExpansionState(
            isStartFullyExpanded = isFullyExpandedStart.value,
            isEndFullyExpanded = isFullyExpandedEnd.value
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .onGloballyPositioned { coordinates ->
                    parentWidth = coordinates.size.width
                }
        ) {
            val offset = if (anchorsInitialized) swipeBoxState.offset else 0f

            if (offset > 0 && isStartActionItemSupplied) {
                Box(
                    modifier = Modifier
                        .height(height)
                        .width(with(density) { offset.toDp() })
                        .align(Alignment.CenterStart)
                        .background(CupertinoColors.systemBlue)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        startActionItems.forEach {
                            it()
                        }
                    }
                }
            }

            if (offset < 0 && isEndActionItemSupplied) {
                Box(
                    modifier = Modifier
                        .height(height)
                        .width(with(density) { -offset.toDp() })
                        .align(Alignment.CenterEnd)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        endActionItems.forEach {
                            it()
                        }
                    }
                }
            }

            if (anchorsInitialized) {
                Box(
                    modifier = Modifier
                        .offset { IntOffset(swipeBoxState.requireOffset().roundToInt(), 0) }
                        .anchoredDraggable(
                            state = swipeBoxState,
                            orientation = Orientation.Horizontal
                        )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(height)
                            .background(LocalContainerColor.current)
                            .padding(
                                start = CupertinoSectionDefaults.PaddingValues
                                    .calculateStartPadding(LocalLayoutDirection.current)
                            )
                    ) {
                        content()
                    }
                }
            }
        }
    }
}