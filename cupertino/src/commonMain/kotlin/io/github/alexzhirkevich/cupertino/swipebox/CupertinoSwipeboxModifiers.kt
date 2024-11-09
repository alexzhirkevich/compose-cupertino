package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import io.github.alexzhirkevich.cupertino.FractionalThreshold
import io.github.alexzhirkevich.cupertino.rememberSwipeableState
import io.github.alexzhirkevich.cupertino.swipeable

@OptIn(ExperimentalFoundationApi::class)
fun Modifier.swipeActions(
    edge: SwipeEdge,
    actions: List<SwipeAction>
): Modifier = composed {
    this.then(
        Modifier.swipeable(
            state = rememberSwipeableState(initialValue = 0),
            anchors = mapOf(
                0f to 0,
                300f to 1 // Adjust as needed
            ),
            orientation = Orientation.Horizontal,
            enabled = true,
            reverseDirection = (edge == SwipeEdge.End),
            thresholds = { _, _ -> FractionalThreshold(0.5f) }
        )
    )
}