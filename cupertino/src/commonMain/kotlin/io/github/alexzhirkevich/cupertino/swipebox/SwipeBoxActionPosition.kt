package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.runtime.compositionLocalOf

/**
 * Provides context to `SimpleCupertinoSwipeBoxItem` about the positioning of the current action item.
 */
internal enum class CupertinoSwipeActionPosition {
    Start,
    End
}

internal val LocalSwipeBoxItemDynamicWidth = compositionLocalOf { 1f }

internal val LocalSwipeBoxItemFullSwipe = compositionLocalOf { false }

internal val LocalSwipeActionPosition = compositionLocalOf { CupertinoSwipeActionPosition.Start }

@OptIn(ExperimentalFoundationApi::class)
internal val LocalSwipeBoxState = compositionLocalOf<AnchoredDraggableState<SwipeBoxStates>> {
    error("No SwipeBoxState provided")
}