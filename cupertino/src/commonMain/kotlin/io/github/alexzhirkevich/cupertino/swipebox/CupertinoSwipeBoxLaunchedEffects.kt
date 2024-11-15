@file:OptIn(ExperimentalFoundationApi::class)

package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
            val fullSwipeOffset = parentWidth * 0.5f
            val anchors = DraggableAnchors {
                SwipeBoxStates.Resting at 0f
                if (isEndActionItemSupplied) SwipeBoxStates.EndVisible at -swipeOffset
                if (isStartActionItemSupplied) SwipeBoxStates.StartVisible at swipeOffset
                if (fullExpansionStart && isEndActionItemSupplied) SwipeBoxStates.EndFullyExpanded at -fullSwipeOffset
                if (fullExpansionEnd && isStartActionItemSupplied) SwipeBoxStates.StartFullyExpanded at fullSwipeOffset
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
    swipeBoxState: AnchoredDraggableState<SwipeBoxStates>,
    hapticFeedback: HapticFeedback,
    hasTriggeredHapticFeedback: Boolean,
    onHapticFeedbackTriggered: (Boolean) -> Unit
) {
    LaunchedEffect(swipeBoxState.currentValue, swipeBoxState.targetValue) {
        if (fullExpansionStart || fullExpansionEnd) {
            if ((swipeBoxState.targetValue == SwipeBoxStates.EndFullyExpanded ||
                        swipeBoxState.targetValue == SwipeBoxStates.StartFullyExpanded) &&
                !hasTriggeredHapticFeedback
            ) {
                hapticFeedback.performHapticFeedback(HapticFeedbackType(3001))
                onHapticFeedbackTriggered(true)
            }

            if (swipeBoxState.targetValue != SwipeBoxStates.EndFullyExpanded &&
                swipeBoxState.targetValue != SwipeBoxStates.StartFullyExpanded
            ) {
                onHapticFeedbackTriggered(false)
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
) {
    LaunchedEffect(swipeBoxState.settledValue) {
        // TODO we might have to change this logic so its fullExpansionStart && isStartActionItemSupplied ...
        if (fullExpansionStart || fullExpansionEnd) {
            if ((isStartActionItemSupplied && (swipeBoxState.settledValue == SwipeBoxStates.StartFullyExpanded)) ||
                isEndActionItemSupplied && (swipeBoxState.settledValue == SwipeBoxStates.EndFullyExpanded)
            ) {
                kotlinx.coroutines.delay(10)
                swipeBoxState.animateTo(SwipeBoxStates.Resting)
            }
        }
    }
}