@file:OptIn(ExperimentalMaterialApi::class)

package com.github.alexzhirkevich.lookandfeel.modifiers

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.cupertinoScrollOverflow
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

/**
 * Applied to [LazyColumn], [LazyRow] or lazy grids
 * to match current look and feel scroll behavior.
 *
 * Actually can be applied to any composable BEFORE [verticalScroll] or [horizontalScroll]
 * */
fun Modifier.adaptiveScrollOverflow(orientation: Orientation, enabled: Boolean = true) = composed {
    when(currentLookAndFeel){
        LookAndFeel.Cupertino ->
            cupertinoScrollOverflow(orientation, enabled)
        else -> Modifier
    }
}

/**
 * Analog to [verticalScroll] with scroll behavior for current look and feel
 * */
fun Modifier.adaptiveVerticalScroll(
    state: ScrollState,
    enabled: Boolean = true,
    flingBehavior: FlingBehavior? = null,
    reverseScrolling: Boolean = false
) = composed {
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> {
            cupertinoScrollOverflow(Orientation.Vertical, enabled)
                .verticalScroll(state, enabled, flingBehavior, reverseScrolling)
        }
        else -> verticalScroll(state, enabled, flingBehavior, reverseScrolling)
    }
}

/**
 * Analog to [horizontalScroll] with scroll behavior for current look and feel
 * */
fun Modifier.adaptiveHorizontalScroll(
    state: ScrollState,
    enabled: Boolean = true,
    flingBehavior: FlingBehavior? = null,
    reverseScrolling: Boolean = false
) = composed {
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> {
            cupertinoScrollOverflow(Orientation.Horizontal, enabled)
                .horizontalScroll(state, enabled, flingBehavior, reverseScrolling)
        }
        else -> horizontalScroll(state, enabled, flingBehavior, reverseScrolling)
    }
}

