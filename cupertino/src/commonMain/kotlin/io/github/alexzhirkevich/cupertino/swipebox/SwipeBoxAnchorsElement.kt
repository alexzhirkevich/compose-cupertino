package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.runtime.State
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

@ExperimentalCupertinoApi
class SwipeBoxAnchorsElement(
    private val state: CupertinoSwipeBoxState,
    private val startToEnd: SwipeBoxBehavior,
    private val endToStart: SwipeBoxBehavior,
    private val itemWidth: Dp,
    private val count: State<Int>,
) : ModifierNodeElement<SwipeBoxAnchorsNode>() {

    override fun create() = SwipeBoxAnchorsNode(
        state = state,
        startToEnd = startToEnd,
        endToStart = endToStart,
        itemWidth = itemWidth,
        count = count
    )

    override fun update(node: SwipeBoxAnchorsNode) {
        node.state = state
        node.startToEnd = startToEnd
        node.endToStart = endToStart
        node.itemWidth = itemWidth
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        other as SwipeBoxAnchorsElement
        if (state != other.state) return false
        if (startToEnd != other.startToEnd) return false
        return endToStart == other.endToStart
    }

    override fun hashCode(): Int {
        var result = state.hashCode()
        result = 31 * result + startToEnd.hashCode()
        result = 31 * result + endToStart.hashCode()
        return result
    }

    override fun InspectorInfo.inspectableProperties() {
        debugInspectorInfo {
            properties["state"] = state
            properties["enableDismissFromStartToEnd"] = startToEnd
            properties["enableDismissFromEndToStart"] = endToStart
        }
    }
}