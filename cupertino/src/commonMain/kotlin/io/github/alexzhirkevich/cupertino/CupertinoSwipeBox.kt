package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.splineBasedDecay
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.swipebox.DragAnchors
import io.github.alexzhirkevich.cupertino.swipebox.SwipeDirection
import kotlin.math.absoluteValue
import kotlin.math.roundToInt


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun rememberAnchoredDraggableState(
    initialValue: DragAnchors = DragAnchors.Center,
    positionalThreshold: (distance: Float) -> Float = { distance -> distance * 0.5f },
    velocityThreshold: Dp = 125.dp,
    animationSpec: SpringSpec<Float> = SpringSpec(),
): AnchoredDraggableState<DragAnchors> {
    val density = LocalDensity.current
    return remember {
        AnchoredDraggableState(
            initialValue = initialValue,
            snapAnimationSpec = animationSpec,
            decayAnimationSpec = splineBasedDecay(density),
            confirmValueChange = { true },
            positionalThreshold = positionalThreshold,
            velocityThreshold = {
                density.run { velocityThreshold.toPx() }
            }
        )
    }
}

/**
 * TODO javadocs
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBox(
    state: AnchoredDraggableState<DragAnchors> = rememberAnchoredDraggableState(),
    modifier: Modifier = Modifier,
    startContent: @Composable (RowScope.(anchoredDraggableState: AnchoredDraggableState<DragAnchors>, startSwipeProgress: Float) -> Unit)? = null,
    startContentWidth: Dp = 0.dp,
    endContent: @Composable (RowScope.(anchoredDraggableState: AnchoredDraggableState<DragAnchors>, startSwipeProgress: Float) -> Unit)? = null,
    endContentWidth: Dp = 0.dp,
    swipeDirection: SwipeDirection = SwipeDirection.EndToStart,
    content: @Composable BoxScope.(anchoredDraggableState: AnchoredDraggableState<DragAnchors>, startSwipeProgress: Float, endSwipeProgress: Float) -> Unit
) {
    val density = LocalDensity.current
    val startWidthPx = with(density) { startContentWidth.toPx() }
    val endWidthPx = with(density) { endContentWidth.toPx() }

    val draggableAnchors : DraggableAnchors<DragAnchors> = when (swipeDirection) {
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

    state.updateAnchors(draggableAnchors)

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