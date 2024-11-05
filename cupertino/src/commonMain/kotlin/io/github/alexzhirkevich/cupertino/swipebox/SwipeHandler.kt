package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.zIndex
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

@Composable
@ExperimentalCupertinoApi
fun SwipeHandle(
    modifier: Modifier,
    state: CupertinoSwipeBoxState,
    height : Int
) {
    val density = LocalDensity.current
    Spacer(
        modifier
            .zIndex(1f)
            .height(density.run { height.toDp() })
            .swipeHandle(state)
    )
}