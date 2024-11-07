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

/**
 * TODO javadocs
 */
@OptIn(ExperimentalFoundationApi::class, InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBox(
    state: AnchoredDraggableState<DragAnchors> = rememberCupertinoSwipeBoxState(),
    modifier: Modifier = Modifier,
    enableHapticFeedback: Boolean = true,
    startContent: @Composable (RowScope.(anchoredDraggableState: AnchoredDraggableState<DragAnchors>, startSwipeProgress: Float) -> Unit)? = null,
    startContentWidth: Dp = 0.dp,
    endContent: @Composable (RowScope.(anchoredDraggableState: AnchoredDraggableState<DragAnchors>, startSwipeProgress: Float) -> Unit)? = null,
    endContentWidth: Dp = 0.dp,
    swipeDirection: SwipeDirection = SwipeDirection.EndToStart,
    content: @Composable BoxScope.(anchoredDraggableState: AnchoredDraggableState<DragAnchors>, startSwipeProgress: Float, endSwipeProgress: Float) -> Unit
) {
    val hapticFeedback = LocalHapticFeedback.current
    val density = LocalDensity.current
    val startWidthPx = with(density) { startContentWidth.toPx() }
    val endWidthPx = with(density) { endContentWidth.toPx() }

    val draggableAnchors: DraggableAnchors<DragAnchors> =
        getDraggableAnchors(swipeDirection, startWidthPx, endWidthPx)

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
    val debounceInterval = 1000L // in milliseconds
    val lastHapticTime = remember { mutableStateOf(0L) }

    // Store previous swipe progress
    val previousStartSwipeProgress = remember { mutableStateOf(0f) }
    val previousEndSwipeProgress = remember { mutableStateOf(0f) }

    // Trigger haptic feedback at a specific swipe progress threshold (e.g., 0.75) only when expanding
    hapticCheckLaunchedEffect(
        enableHapticFeedback,
        startSwipeProgress,
        endSwipeProgress,
        lastHapticTime,
        debounceInterval,
        previousStartSwipeProgress,
        previousEndSwipeProgress,
        hapticFeedback
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
                    startContent(state, startSwipeProgress)
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
                    endContent(state, endSwipeProgress)
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
                Orientation.Horizontal
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
    hapticFeedback: HapticFeedback
) {
    LaunchedEffect(enableHapticFeedback, startSwipeProgress, endSwipeProgress) {
        val currentTime = Clock.System.now().toEpochMilliseconds()
        if (enableHapticFeedback &&
            currentTime - lastHapticTime.value >= debounceInterval
        ) {

            val isStartSwipeExpanding = previousStartSwipeProgress.value < startSwipeProgress
            val isEndSwipeExpanding = previousEndSwipeProgress.value < endSwipeProgress

            val isStartSwipeCrossedThreshold =
                previousStartSwipeProgress.value < 0.75f && startSwipeProgress >= 0.75f && isStartSwipeExpanding
            val isEndSwipeCrossedThreshold =
                previousEndSwipeProgress.value < 0.75f && endSwipeProgress >= 0.75f && isEndSwipeExpanding

            if (isStartSwipeCrossedThreshold || isEndSwipeCrossedThreshold) {
                hapticFeedback.performHapticFeedback(CupertinoHapticFeedback.ImpactLight)
                lastHapticTime.value = currentTime
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
    endWidthPx: Float
): DraggableAnchors<DragAnchors> {
    val draggableAnchors: DraggableAnchors<DragAnchors> = when (swipeDirection) {
        SwipeDirection.StartToEnd -> DraggableAnchors {
            DragAnchors.Start at startWidthPx
            DragAnchors.Center at 0f
        }

        SwipeDirection.EndToStart -> DraggableAnchors {
            DragAnchors.Center at 0f
            DragAnchors.End at -endWidthPx
        }

        SwipeDirection.Both -> DraggableAnchors {
            DragAnchors.Start at -startWidthPx
            DragAnchors.Center at 0f
            DragAnchors.End at endWidthPx
        }
    }
    return draggableAnchors
}