package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable

class CupertinoSwipeBoxActionsBuilder {
    private val _startActions = mutableListOf<SwipeAction>()
    private val _endActions = mutableListOf<SwipeAction>()

    val startActions: List<SwipeAction> get() = _startActions
    val endActions: List<SwipeAction> get() = _endActions

    fun start(onClick: (() -> Unit)? = null, content: @Composable RowScope.() -> Unit) {
        _startActions.add(SwipeAction(onClick, content))
    }

    fun end(onClick: (() -> Unit)? = null, content: @Composable RowScope.() -> Unit) {
        _endActions.add(SwipeAction(onClick, content))
    }

    class SwipeAction(
        val onClick: (() -> Unit)? = null,
        val content: @Composable RowScope.() -> Unit
    )
}
