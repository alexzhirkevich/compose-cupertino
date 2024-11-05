package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.runtime.Stable
import io.github.alexzhirkevich.cupertino.EmptySwipeBoxState
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import kotlinx.coroutines.flow.MutableSharedFlow

/**
 * Each expanded [CupertinoSwipeBoxState] remembered with this controller will be
 * collapsed when another [CupertinoSwipeBoxState] is expanded
 * */
@Stable
@ExperimentalCupertinoApi
class SharedSwipeBoxController {

    @OptIn(ExperimentalCupertinoApi::class)
    internal val expanded: MutableSharedFlow<CupertinoSwipeBoxState> = MutableSharedFlow()

    /**
     * Collapse the expanded state managed by this controller if any
     * */
    @OptIn(ExperimentalCupertinoApi::class)
    fun collapse() {
        expanded.tryEmit(EmptySwipeBoxState)
    }
}