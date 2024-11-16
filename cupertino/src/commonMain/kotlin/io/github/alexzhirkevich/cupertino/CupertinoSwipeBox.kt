@file:OptIn(ExperimentalFoundationApi::class)

package io.github.alexzhirkevich.cupertino


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.Orientation
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
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.swipebox.AnchorsEffect
import io.github.alexzhirkevich.cupertino.swipebox.DismissFullyExpandedEffect
import io.github.alexzhirkevich.cupertino.swipebox.HapticFeedbackEffect
import io.github.alexzhirkevich.cupertino.swipebox.LocalSwipeActionPosition
import io.github.alexzhirkevich.cupertino.swipebox.LocalSwipeBoxExpansionState
import io.github.alexzhirkevich.cupertino.swipebox.SwipeActionPosition
import io.github.alexzhirkevich.cupertino.swipebox.SwipeBoxExpansionState
import io.github.alexzhirkevich.cupertino.swipebox.SwipeBoxStates
import io.github.alexzhirkevich.cupertino.swipebox.rememberSimpleCupertinoSwipeBoxState
import kotlin.math.roundToInt

// TODO clean this up
object SimpleCupertinoSwipeBoxDefaults {
    const val enableHapticFeedback = true // TODO
    const val debounceInterval = 100L // TODO, this might not be needed anymore
    val allowFullSwipe = true
    val velocityThreshold = Float.POSITIVE_INFINITY
    val actionItemWidth = 84.dp
    val actionItemHeight = 72.dp
}

/**
 * TODO javadocs
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CupertinoSwipeBox(
    state: AnchoredDraggableState<SwipeBoxStates> = rememberSimpleCupertinoSwipeBoxState(),
    modifier: Modifier = Modifier,
    actionItemWidth: Dp = SimpleCupertinoSwipeBoxDefaults.actionItemWidth,
    height: Dp = SimpleCupertinoSwipeBoxDefaults.actionItemHeight,
    fullExpansionStart: Boolean = SimpleCupertinoSwipeBoxDefaults.allowFullSwipe,
    fullExpansionEnd: Boolean = SimpleCupertinoSwipeBoxDefaults.allowFullSwipe,
    startActionItem: Pair<(@Composable RowScope.() -> Unit), (() -> Unit)>? = null,
    endActionItem: Pair<(@Composable RowScope.() -> Unit), (() -> Unit)>? = null,
    content: @Composable BoxScope.() -> Unit
) {
    CupertinoSwipeBox(
        state = state,
        modifier = modifier,
        actionItemWidth = actionItemWidth,
        height = height,
        fullExpansionStart = fullExpansionStart,
        fullExpansionEnd = fullExpansionEnd,
        startActionItems = if (startActionItem == null) emptyList() else listOf(startActionItem),
        endActionItems =  if (endActionItem == null) emptyList() else listOf(endActionItem),
        content = content
    )
}

@OptIn(ExperimentalFoundationApi::class, InternalCupertinoApi::class,)
@Composable
fun CupertinoSwipeBox(
    state: AnchoredDraggableState<SwipeBoxStates> = rememberSimpleCupertinoSwipeBoxState(),
    modifier: Modifier = Modifier,
    actionItemWidth: Dp = SimpleCupertinoSwipeBoxDefaults.actionItemWidth,
    height: Dp = SimpleCupertinoSwipeBoxDefaults.actionItemHeight,
    fullExpansionStart: Boolean = SimpleCupertinoSwipeBoxDefaults.allowFullSwipe,
    fullExpansionEnd: Boolean = SimpleCupertinoSwipeBoxDefaults.allowFullSwipe,
    startActionItems: List<Pair<(@Composable RowScope.() -> Unit), (() -> Unit)>> = emptyList(),
    endActionItems: List<Pair<(@Composable RowScope.() -> Unit), (() -> Unit)>> = emptyList(),
    content: @Composable BoxScope.() -> Unit
) {
    val density = LocalDensity.current
    var parentWidth by remember { mutableStateOf(0) }
    val isStartActionItemSupplied = startActionItems.isNotEmpty()
    val isEndActionItemSupplied = endActionItems.isNotEmpty()
    val startFullSwipeAction = startActionItems.firstOrNull()?.second
    val endFullSwipeAction = endActionItems.firstOrNull()?.second

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
        swipeBoxState = state,
        density = density,
        amountOfStartActionItems = startActionItems.size,
        amountOfEndActionItems = endActionItems.size,
        actionItemWidth = actionItemWidth
    ) { anchorsInitialized = it }

    HapticFeedbackEffect(
        fullExpansionStart = fullExpansionStart,
        fullExpansionEnd = fullExpansionEnd,
        isFullyExpandedStart = isFullyExpandedStart,
        isFullyExpandedEnd = isFullyExpandedEnd,
        swipeBoxState = state,
        hapticFeedback = hapticFeedback,
        hasTriggeredHapticFeedback = hasTriggeredHapticFeedback
    ) { hasTriggeredHapticFeedback = it }

    DismissFullyExpandedEffect(
        swipeBoxState = state,
        isStartActionItemSupplied = isStartActionItemSupplied,
        fullExpansionStart = fullExpansionStart,
        isEndActionItemSupplied = isEndActionItemSupplied,
        fullExpansionEnd = fullExpansionEnd,
        startFullExpansionOnClick = startFullSwipeAction,
        endFullExpansionOnClick = endFullSwipeAction
    )

    CompositionLocalProvider(
        LocalSwipeBoxExpansionState provides SwipeBoxExpansionState(
            isStartFullyExpanded = isFullyExpandedStart.value,
            isEndFullyExpanded = isFullyExpandedEnd.value
        )
    ) {
        Box(
            modifier = modifier.then(
                Modifier
                    .fillMaxSize()
                    .onGloballyPositioned { coordinates ->
                        parentWidth = coordinates.size.width
                    }
            )
        ) {
            val offset = if (anchorsInitialized) state.offset else 0f

            if (offset > 0 && isStartActionItemSupplied) {
                CompositionLocalProvider(
                    LocalSwipeActionPosition provides SwipeActionPosition.Start
                ) {
                    Box(
                        modifier = Modifier
                            .height(height)
                            .width(with(density) { offset.toDp() })
                            .align(Alignment.CenterStart)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            startActionItems.forEach { actionItem ->
                                actionItem.run { first() }
                            }
                        }
                    }
                }
            }

            if (offset < 0 && isEndActionItemSupplied) {
                CompositionLocalProvider(
                    LocalSwipeActionPosition provides SwipeActionPosition.End
                ) {
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
                            endActionItems.forEach { actionItem ->
                                actionItem.run { first() }
                            }
                        }
                    }
                }
            }

            if (anchorsInitialized) {
                Box(
                    modifier = Modifier
                        .offset { IntOffset(state.requireOffset().roundToInt(), 0) }
                        .anchoredDraggable(
                            state = state,
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
                                    .calculateStartPadding(LocalLayoutDirection.current),
                                end = CupertinoSectionDefaults.PaddingValues
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