package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.DraggableAnchors
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import kotlin.math.abs

@ExperimentalCupertinoApi
@ExperimentalFoundationApi
class MapDraggableAnchorsStep(
    private val anchors: Map<CupertinoSwipeBoxValue, Float>,
    private val state: CupertinoSwipeBoxState
) : DraggableAnchors<CupertinoSwipeBoxValue> {

    override fun positionOf(value: CupertinoSwipeBoxValue): Float = anchors[value] ?: Float.NaN
    override fun hasAnchorFor(value: CupertinoSwipeBoxValue) = anchors.containsKey(value)

    override fun closestAnchor(position: Float): CupertinoSwipeBoxValue? {

        if (position == 0f)
            return CupertinoSwipeBoxValue.Collapsed

        return anchors.minByOrNull {
            abs(position - it.value)
        }?.key
    }


    override fun closestAnchor(
        position: Float,
        searchUpwards: Boolean
    ): CupertinoSwipeBoxValue? {

        if (position == 0f)
            return CupertinoSwipeBoxValue.Collapsed

        val closest =  anchors.minByOrNull { (_, anchor) ->
            val delta = if (searchUpwards) anchor - position else position - anchor
            if (delta < 0) Float.POSITIVE_INFINITY else delta
        }?.key ?: return null

        if (dismissedClosest(closest)){
            return closest
        }

        val currentPos = state.currentValue.let {
            anchors[it]
        } ?: return closest

        val closestPos = anchors[closest] ?: return closest

        return firstBetween(currentPos, closestPos) ?: closest
    }

    private fun dismissedClosest(closest : CupertinoSwipeBoxValue) : Boolean {
        return state.isDismissed &&
                (closest == CupertinoSwipeBoxValue.DismissedToEnd ||
                        closest == CupertinoSwipeBoxValue.DismissedToStart)
    }

    private fun firstBetween(
        current : Float,
        closest : Float
    ) : CupertinoSwipeBoxValue? {

        return if (closest > current) {
            anchors.firstNotNullOfOrNull {
                if (it.value > current)
                    it.key
                else null
            }
        } else {
            anchors.firstNotNullOfOrNull {
                if (it.value < current)
                    it.key
                else null
            }
        }
    }

    override fun minAnchor() = anchors.values.minOrNull() ?: Float.NaN

    override fun maxAnchor() = anchors.values.maxOrNull() ?: Float.NaN

    override val size: Int
        get() = anchors.size

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapDraggableAnchorsStep) return false

        return anchors == other.anchors
    }

    override fun forEach(block: (anchor: CupertinoSwipeBoxValue, position: Float) -> Unit) {
        anchors.forEach { (key, value) ->
            block(key, value)
        }
    }

    override fun hashCode() = 31 * anchors.hashCode()

    override fun toString() = "MapDraggableAnchors($anchors)"
}