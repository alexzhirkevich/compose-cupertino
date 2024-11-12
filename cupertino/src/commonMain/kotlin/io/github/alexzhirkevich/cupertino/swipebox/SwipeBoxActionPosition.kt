package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.runtime.compositionLocalOf

enum class SwipeActionPosition {
    Start,
    End
}

val LocalSwipeActionPosition = compositionLocalOf { SwipeActionPosition.Start }
val LocalSwipeBoxExpansionState = compositionLocalOf { SwipeBoxExpansionState(false, false) }
