@file:OptIn(ExperimentalFoundationApi::class)

package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.InternalCupertinoApi


@InternalCupertinoApi
@Composable
fun AnchorsEffect(
    parentWidth: Int,
    fullExpansionStart: Boolean,
    isStartActionItemSupplied: Boolean,
    fullExpansionEnd: Boolean,
    isEndActionItemSupplied: Boolean,
    swipeBoxState: AnchoredDraggableState<SwipeBoxStates>,
    density: Density,
    onAnchorsInitialized: (Boolean) -> Unit
) {
    val swipeOffset = with(density) { 84.dp.toPx() }
    LaunchedEffect(parentWidth) {
        if (parentWidth > 0) {
            val fullSwipeOffset = parentWidth * 0.5f // TODO make this configurable based on actionItem size
            val anchors = DraggableAnchors {
                SwipeBoxStates.Resting at 0f
                if (isEndActionItemSupplied) SwipeBoxStates.EndVisible at -swipeOffset
                if (isStartActionItemSupplied) SwipeBoxStates.StartVisible at swipeOffset
                if (fullExpansionEnd && isEndActionItemSupplied) SwipeBoxStates.EndFullyExpanded at -fullSwipeOffset
                if (fullExpansionStart && isStartActionItemSupplied) SwipeBoxStates.StartFullyExpanded at fullSwipeOffset
            }
            swipeBoxState.updateAnchors(anchors)
            onAnchorsInitialized(true)
        }
    }
}

@InternalCupertinoApi
@Composable
fun HapticFeedbackEffect(
    fullExpansionStart: Boolean,
    fullExpansionEnd: Boolean,
    isFullyExpandedStart: MutableState<Boolean>,
    isFullyExpandedEnd: MutableState<Boolean>,
    swipeBoxState: AnchoredDraggableState<SwipeBoxStates>,
    hapticFeedback: HapticFeedback,
    hasTriggeredHapticFeedback: Boolean,
    onHapticFeedbackTriggered: (Boolean) -> Unit
) {
    LaunchedEffect(swipeBoxState.currentValue, swipeBoxState.targetValue) {
        if (fullExpansionStart) {
            if ((swipeBoxState.targetValue == SwipeBoxStates.StartFullyExpanded) && !hasTriggeredHapticFeedback) {
                hapticFeedback.performHapticFeedback(HapticFeedbackType(3001))
                onHapticFeedbackTriggered(true)
                isFullyExpandedEnd.value = true
            }

            if (swipeBoxState.targetValue != SwipeBoxStates.StartFullyExpanded) {
                onHapticFeedbackTriggered(false)
                isFullyExpandedStart.value = false
            }
        } else if (fullExpansionEnd) {
            if ((swipeBoxState.targetValue == SwipeBoxStates.EndFullyExpanded) && !hasTriggeredHapticFeedback) {
                hapticFeedback.performHapticFeedback(HapticFeedbackType(3001))
                onHapticFeedbackTriggered(true)
                isFullyExpandedEnd.value = true
            }

            if (swipeBoxState.targetValue != SwipeBoxStates.EndFullyExpanded) {
                onHapticFeedbackTriggered(false)
                isFullyExpandedEnd.value = false
            }
        }
    }
}

@InternalCupertinoApi
@Composable
fun ScrollEffect(
    scrollableState: ScrollableState,
    swipeBoxState: AnchoredDraggableState<SwipeBoxStates>
) {
    LaunchedEffect(scrollableState) {
        snapshotFlow { scrollableState.isScrollInProgress }
            .collect { isScrolling ->
                if (isScrolling && swipeBoxState.currentValue != SwipeBoxStates.Resting) {
                    swipeBoxState.animateTo(SwipeBoxStates.Resting)
                }
            }
    }
}

@InternalCupertinoApi
@Composable
fun DismissFullyExpandedEffect(
    swipeBoxState: AnchoredDraggableState<SwipeBoxStates>,
    isStartActionItemSupplied: Boolean,
    fullExpansionStart: Boolean,
    isEndActionItemSupplied: Boolean,
    fullExpansionEnd: Boolean,
    startFullExpansionOnClick: (() -> Unit)? = null,
    endFullExpansionOnClick: (() -> Unit)? = null,
) {
    LaunchedEffect(swipeBoxState.settledValue) {
        if (fullExpansionStart && ((isStartActionItemSupplied && (swipeBoxState.settledValue == SwipeBoxStates.StartFullyExpanded)))) {
            println("We shall dismiss the start to end full swipe")
            kotlinx.coroutines.delay(10)
            swipeBoxState.animateTo(SwipeBoxStates.Resting)
            startFullExpansionOnClick?.let { it() }
        }

        if (fullExpansionEnd && (isEndActionItemSupplied && (swipeBoxState.settledValue == SwipeBoxStates.EndFullyExpanded))) {
            println("We shall dismiss the end to start full swipe")
            kotlinx.coroutines.delay(10)
            swipeBoxState.animateTo(SwipeBoxStates.Resting)
            endFullExpansionOnClick?.let { it() }
        }
    }
}