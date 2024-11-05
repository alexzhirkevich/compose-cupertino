package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

@OptIn(ExperimentalFoundationApi::class)
@ExperimentalCupertinoApi
@Composable
fun Modifier.swipeHandle(state: CupertinoSwipeBoxState) = anchoredDraggable(
    state = state.anchoredDraggableState,
    orientation = Orientation.Horizontal,
    enabled = state.currentValue != CupertinoSwipeBoxValue.DismissedToStart &&
            state.currentValue != CupertinoSwipeBoxValue.DismissedToEnd,
    reverseDirection = LocalLayoutDirection.current == LayoutDirection.Rtl,
)

@ExperimentalCupertinoApi
fun Modifier.swipeBoxAnchors(
    state: CupertinoSwipeBoxState,
    startToEnd: SwipeBoxBehavior,
    endToStart: SwipeBoxBehavior,
    itemWidth: Dp,
    count: State<Int>,
) = this then SwipeBoxAnchorsElement(
    state = state,
    startToEnd = startToEnd,
    endToStart = endToStart,
    itemWidth = itemWidth,
    count = count
)