package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.swipebox.DragAnchors
import io.github.alexzhirkevich.cupertino.swipebox.SwipeDirection
import io.github.alexzhirkevich.cupertino.swipebox.rememberCupertinoSwipeBoxState
import kotlinx.datetime.Clock
import kotlin.math.absoluteValue
import kotlin.math.roundToInt

object CupertinoSwipeBoxDefaults {
    const val enableHapticFeedback = true
    const val allowFullSwipe = false
    const val hapticThreshold = 1f
    const val debounceInterval = 1000L
    val swipeDirection = SwipeDirection.EndToStart
    val velocityThreshold = 125.dp
    val itemSize = 96.dp
}

/**
 * Basically tries to mimic the iOS swipeActions behavior - [docs](https://developer.apple.com/documentation/swiftui/view/swipeactions(edge:allowsfullswipe:content:))
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBox(
    state: AnchoredDraggableState<DragAnchors> = rememberCupertinoSwipeBoxState(),
    modifier: Modifier = Modifier,
    enableHapticFeedback: Boolean = CupertinoSwipeBoxDefaults.enableHapticFeedback,
    hapticThreshold: Float = CupertinoSwipeBoxDefaults.hapticThreshold,
    allowsFullSwipeStart: Boolean = CupertinoSwipeBoxDefaults.allowFullSwipe,
    allowsFullSwipeEnd: Boolean = CupertinoSwipeBoxDefaults.allowFullSwipe,
    startContent: @Composable (RowScope.() -> Unit)? = null,
    startContentWidth: Dp = CupertinoSwipeBoxDefaults.itemSize,
    endContent: @Composable (RowScope.() -> Unit)? = null,
    endContentWidth: Dp = CupertinoSwipeBoxDefaults.itemSize,
    swipeDirection: SwipeDirection = CupertinoSwipeBoxDefaults.swipeDirection,
    content: @Composable BoxScope.(anchoredDraggableState: AnchoredDraggableState<DragAnchors>, startSwipeProgress: Float, endSwipeProgress: Float) -> Unit
) {
    val hapticFeedback = LocalHapticFeedback.current
    val density = LocalDensity.current
    val startWidthPx = with(density) { startContentWidth.toPx() }
    val endWidthPx = with(density) { endContentWidth.toPx() }

    val draggableAnchors: DraggableAnchors<DragAnchors> =
        getDraggableAnchors(swipeDirection, startWidthPx, endWidthPx, allowsFullSwipeStart, allowsFullSwipeEnd)

    state.updateAnchors(draggableAnchors)

    // Calculate swipe progress
    val offsetRange = when (swipeDirection) {
        SwipeDirection.StartToEnd -> 0f..Float.POSITIVE_INFINITY
        SwipeDirection.EndToStart -> Float.NEGATIVE_INFINITY..0f
        SwipeDirection.Both -> Float.NEGATIVE_INFINITY..Float.POSITIVE_INFINITY
    }
    val offset = state.requireOffset()
    val startSwipeProgress = if (offset > 0f && startWidthPx != 0f) {
        (offset / startWidthPx).absoluteValue
    } else 0f
    val endSwipeProgress = if (offset < 0f && endWidthPx != 0f) {
        (offset / endWidthPx).absoluteValue
    } else 0f
    val startContentLiveWidth = startContentWidth * startSwipeProgress
    val endContentLiveWidth = endContentWidth * endSwipeProgress

    // Store last trigger time and debounce interval
    val lastHapticTime = remember { mutableStateOf(0L) }

    // Store previous swipe progress
    val previousStartSwipeProgress = remember { mutableStateOf(0f) }
    val previousEndSwipeProgress = remember { mutableStateOf(0f) }

    // Store state of fully expanded
    val isFullyExpanded = remember { mutableStateOf(false) }

    // Trigger haptic feedback at a specific swipe progress threshold (e.g., 0.75) only when expanding
    hapticCheckLaunchedEffect(
        enableHapticFeedback,
        startSwipeProgress,
        endSwipeProgress,
        lastHapticTime,
        CupertinoSwipeBoxDefaults.debounceInterval,
        previousStartSwipeProgress,
        previousEndSwipeProgress,
        hapticFeedback,
        hapticThreshold,
        isFullyExpanded
    )

    Box(
        modifier = modifier
            .clipToBounds()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .matchParentSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = when (swipeDirection) {
                SwipeDirection.StartToEnd -> Arrangement.Start
                SwipeDirection.EndToStart -> Arrangement.End
                SwipeDirection.Both -> Arrangement.SpaceBetween
            }
        ) {
            if (swipeDirection in listOf(
                    SwipeDirection.StartToEnd,
                    SwipeDirection.Both
                ) && startContent != null
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                        .width(startContentLiveWidth)
                        .clipToBounds()
                ) {
                    startContent()
                }
            }
            if (swipeDirection in listOf(
                    SwipeDirection.EndToStart,
                    SwipeDirection.Both
                ) && endContent != null
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                        .width(endContentLiveWidth)
                        .clipToBounds()
                ) {
                    endContent()
                }
            }
        } // Bottom Layer
        Box(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .offset {
                IntOffset(
                    state
                        .requireOffset()
                        .coerceIn(offsetRange)
                        .roundToInt(), 0
                )
            }
            .anchoredDraggable(
                state,
                orientation = Orientation.Horizontal,
                enabled = true,
                startDragImmediately = state.isAnimationRunning,
                overscrollEffect = null
            )) {
            content(state, startSwipeProgress, endSwipeProgress)
        }
    }
}

@Composable
@OptIn(InternalCupertinoApi::class)
private fun hapticCheckLaunchedEffect(
    enableHapticFeedback: Boolean,
    startSwipeProgress: Float,
    endSwipeProgress: Float,
    lastHapticTime: MutableState<Long>,
    debounceInterval: Long,
    previousStartSwipeProgress: MutableState<Float>,
    previousEndSwipeProgress: MutableState<Float>,
    hapticFeedback: HapticFeedback,
    hapticThreshold: Float,
    isFullyExpanded: MutableState<Boolean>
) {
    LaunchedEffect(enableHapticFeedback, startSwipeProgress, endSwipeProgress) {
        val currentTime = Clock.System.now().toEpochMilliseconds()
        if (enableHapticFeedback &&
            currentTime - lastHapticTime.value >= debounceInterval
        ) {
            val isStartSwipeExpanding = previousStartSwipeProgress.value < startSwipeProgress
            val isEndSwipeExpanding = previousEndSwipeProgress.value < endSwipeProgress

            val isStartSwipeCrossedThreshold =
                previousStartSwipeProgress.value < hapticThreshold && startSwipeProgress >= hapticThreshold && isStartSwipeExpanding
            val isEndSwipeCrossedThreshold =
                previousEndSwipeProgress.value < hapticThreshold && endSwipeProgress >= hapticThreshold && isEndSwipeExpanding

            if (isStartSwipeCrossedThreshold || isEndSwipeCrossedThreshold) {
                println("We have expanded the item fully")
                hapticFeedback.performHapticFeedback(CupertinoHapticFeedback.ImpactLight)
                lastHapticTime.value = currentTime
                isFullyExpanded.value = true
            } else {
                isFullyExpanded.value = false
            }
        }
        previousStartSwipeProgress.value = startSwipeProgress
        previousEndSwipeProgress.value = endSwipeProgress
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun getDraggableAnchors(
    swipeDirection: SwipeDirection,
    startWidthPx: Float,
    endWidthPx: Float,
    allowFullSwipeStart: Boolean,
    allowFullSwipeEnd: Boolean,
): DraggableAnchors<DragAnchors> {
    val draggableAnchors: DraggableAnchors<DragAnchors> = when (swipeDirection) {
        SwipeDirection.StartToEnd -> DraggableAnchors {
            DragAnchors.Start at startWidthPx
            DragAnchors.Center at 0f

            if (allowFullSwipeStart) {
                DragAnchors.End at Float.POSITIVE_INFINITY
            }
        }

        SwipeDirection.EndToStart -> DraggableAnchors {
            DragAnchors.Center at 0f
            DragAnchors.End at -endWidthPx

            if (allowFullSwipeEnd) {
                DragAnchors.Start at Float.NEGATIVE_INFINITY
            }
        }

        SwipeDirection.Both -> DraggableAnchors {
            DragAnchors.Start at -startWidthPx
            DragAnchors.Center at 0f
            DragAnchors.End at endWidthPx

            if (allowFullSwipeStart) {
                DragAnchors.StartToEndDismissed at Float.POSITIVE_INFINITY
            }

            if (allowFullSwipeEnd) {
                DragAnchors.EndToStartDismissed at Float.NEGATIVE_INFINITY
            }
        }
    }
    return draggableAnchors
}