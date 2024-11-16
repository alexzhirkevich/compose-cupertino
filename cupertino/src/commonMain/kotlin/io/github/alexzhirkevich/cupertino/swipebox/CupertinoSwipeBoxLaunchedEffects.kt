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
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.InternalCupertinoApi
import io.github.alexzhirkevich.cupertino.swipebox.SimpleCupertinoSwipeBoxDefaults.actionItemWidth


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
    amountOfStartActionItems: Int,
    amountOfEndActionItems: Int,
    totalStartActionItemWidth: Dp = actionItemWidth,
    totalEndActionItemWidth: Dp = actionItemWidth,
    onAnchorsInitialized: (Boolean) -> Unit,
) {
    val startSwipeOffset = with(density) { totalStartActionItemWidth.toPx() }
    val endSwipeOffset = with(density) { totalEndActionItemWidth.toPx() }
    LaunchedEffect(parentWidth) {
        if (parentWidth > 0) {
            // If there's 1 action item, the fullSwipeOffset should be 50%, if there's 2 or more it should be 90%
            val fullSwipeStartOffset = parentWidth * (if (amountOfStartActionItems >= 2) 0.85f else 0.5f) // TODO test this
            val fullSwipeEndOffset = parentWidth * (if (amountOfEndActionItems >= 2) 0.85f else 0.5f) // TODO test this
            val anchors = DraggableAnchors {
                SwipeBoxStates.Resting at 0f
                if (isStartActionItemSupplied) SwipeBoxStates.StartVisible at startSwipeOffset
                if (isEndActionItemSupplied) SwipeBoxStates.EndVisible at -endSwipeOffset
                if (fullExpansionStart && isStartActionItemSupplied) SwipeBoxStates.StartFullyExpanded at fullSwipeStartOffset
                if (fullExpansionEnd && isEndActionItemSupplied) SwipeBoxStates.EndFullyExpanded at -fullSwipeEndOffset
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
        }

        if (fullExpansionEnd) {
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
    scrollableState: ScrollableState?,
    swipeBoxState: AnchoredDraggableState<SwipeBoxStates>
) {
    LaunchedEffect(scrollableState) {
        snapshotFlow { scrollableState?.isScrollInProgress }
            .collect { isScrolling ->
                if (isScrolling == true && swipeBoxState.currentValue != SwipeBoxStates.Resting) {
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
            kotlinx.coroutines.delay(10)
            swipeBoxState.animateTo(SwipeBoxStates.Resting)
            startFullExpansionOnClick?.let { it() }
        }

        if (fullExpansionEnd && (isEndActionItemSupplied && (swipeBoxState.settledValue == SwipeBoxStates.EndFullyExpanded))) {
            kotlinx.coroutines.delay(10)
            swipeBoxState.animateTo(SwipeBoxStates.Resting)
            endFullExpansionOnClick?.let { it() }
        }
    }
}