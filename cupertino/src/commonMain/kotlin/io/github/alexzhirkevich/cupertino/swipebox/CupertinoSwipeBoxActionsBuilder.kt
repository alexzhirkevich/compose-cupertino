package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import kotlinx.serialization.json.JsonNull.content

class CupertinoSwipeBoxActionsBuilder {
    private val _startActions = mutableListOf<SwipeAction>()
    private val _endActions = mutableListOf<SwipeAction>()

    val startActions: List<SwipeAction> get() = _startActions
    val endActions: List<SwipeAction> get() = _endActions

    fun start(
        key: Any? = null,
        onClick: (() -> Unit)? = null,
        content: @Composable RowScope.() -> Unit
    ) {
        _startActions.add(SwipeAction(key, onClick, content))
    }

    fun end(
        key: Any? = null,
        onClick: (() -> Unit)? = null,
        content: @Composable RowScope.() -> Unit
    ) {
        _endActions.add(SwipeAction(key, onClick, content))
    }

    class SwipeAction(
        val key: Any? = null,
        val onClick: (() -> Unit)? = null,
        val content: @Composable RowScope.() -> Unit
    )
}
