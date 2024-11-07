package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun rememberCupertinoSwipeBoxState(
    initialValue: DragAnchors = DragAnchors.Center,
    positionalThreshold: (distance: Float) -> Float = { distance -> distance * 0.5f },
    velocityThreshold: Dp = 125.dp,
    animationSpec: SpringSpec<Float> = SpringSpec(),
    scrollableState: ScrollableState? = null
): AnchoredDraggableState<DragAnchors> {
    val density = LocalDensity.current
    val anchoredDraggableState = remember {
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

    // Use a LaunchedEffect to monitor scroll events and reset the draggable state if needed
    LaunchedEffect(scrollableState) {
        snapshotFlow { scrollableState?.isScrollInProgress }
            .collect { isScrolling ->
                if (isScrolling == true && anchoredDraggableState.currentValue != DragAnchors.Center) {
                    anchoredDraggableState.animateTo(DragAnchors.Center)
                }
            }
    }

    return anchoredDraggableState
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun rememberCupertinoSwipeBoxState(
    key: Any?,
    initialValue: DragAnchors = DragAnchors.Center,
    positionalThreshold: (distance: Float) -> Float = { distance -> distance * 0.5f },
    velocityThreshold: Dp = 125.dp,
    animationSpec: SpringSpec<Float> = SpringSpec(),
    scrollableState: ScrollableState? = null
): AnchoredDraggableState<DragAnchors> {
    val density = LocalDensity.current
    val anchoredDraggableState = remember(key) {
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

    // Use a LaunchedEffect to monitor scroll events and reset the draggable state if needed
    LaunchedEffect(scrollableState) {
        snapshotFlow { scrollableState?.isScrollInProgress }
            .collect { isScrolling ->
                if (isScrolling == true && anchoredDraggableState.currentValue != DragAnchors.Center) {
                    anchoredDraggableState.animateTo(DragAnchors.Center)
                }
            }
    }

    return anchoredDraggableState
}