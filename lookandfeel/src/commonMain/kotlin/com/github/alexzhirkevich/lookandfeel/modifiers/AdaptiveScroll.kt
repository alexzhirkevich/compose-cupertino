@file:OptIn(ExperimentalMaterial3Api::class)

package com.github.alexzhirkevich.lookandfeel.modifiers

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.cupertinoScrollOverflow
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel



/**
 * Applied to [LazyColumn], [LazyRow] or lazy grids
 * to match [currentLookAndFeel] scroll behavior.
 *
 * Actually can be applied to any composable BEFORE [verticalScroll] or [horizontalScroll]
 * */
fun Modifier.adaptiveScrollOverflow(
    orientation: Orientation,
    state: ScrollableState,
    enabled: Boolean = true
) = composed {
    when(currentLookAndFeel){
        LookAndFeel.Cupertino ->
            cupertinoScrollOverflow(
                orientation = orientation,
                enabled = enabled,
                scrollState = state,
            )
        else -> Modifier
    }
}

/**
 * Analog to [verticalScroll] with scroll behavior for [currentLookAndFeel]
 * */
fun Modifier.adaptiveVerticalScroll(
    state: ScrollState,
    enabled: Boolean = true,
    flingBehavior: FlingBehavior? = null,
    reverseScrolling: Boolean = false
) = adaptiveScrollOverflow(Orientation.Vertical, state, enabled)
        .verticalScroll(state, enabled, flingBehavior, reverseScrolling)


/**
 * Analog to [horizontalScroll] with scroll behavior for [currentLookAndFeel]
 * */
fun Modifier.adaptiveHorizontalScroll(
    state: ScrollState,
    enabled: Boolean = true,
    flingBehavior: FlingBehavior? = null,
    reverseScrolling: Boolean = false
) = adaptiveScrollOverflow(Orientation.Horizontal, state, enabled)
        .verticalScroll(state, enabled, flingBehavior, reverseScrolling)

