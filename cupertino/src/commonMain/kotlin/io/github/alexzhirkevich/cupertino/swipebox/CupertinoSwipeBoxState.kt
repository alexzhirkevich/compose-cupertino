package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.foundation.gestures.snapTo
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import kotlinx.coroutines.CancellationException


private val DismissThreshold = 125.dp

@ExperimentalCupertinoApi
@OptIn(ExperimentalFoundationApi::class)
@Stable
class CupertinoSwipeBoxState(
    internal val density: Density,
    initialValue: CupertinoSwipeBoxValue = CupertinoSwipeBoxValue.Collapsed,
    internal val animationSpec: FiniteAnimationSpec<Float> = CupertinoSwipeBoxDefaults.AnimationSpec,
    internal val dismissThreshold: Float = CupertinoSwipeBoxDefaults.DismissThreshold,
    internal val confirmValueChange: (CupertinoSwipeBoxValue) -> Boolean = { true },
) {

    init {
        require(dismissThreshold in 0f..1f){
            "dismissThreshold must be between 0.0 an 1.0 but $dismissThreshold got"
        }
    }

    internal var isDismissed : Boolean by mutableStateOf(false)

    internal val anchoredDraggableState : AnchoredDraggableState<CupertinoSwipeBoxValue> = AnchoredDraggableState(
        initialValue = initialValue,
        snapAnimationSpec = animationSpec,
        decayAnimationSpec = splineBasedDecay(density),
        confirmValueChange = { it: CupertinoSwipeBoxValue ->
            if ((it == CupertinoSwipeBoxValue.DismissedToStart ||
                        it == CupertinoSwipeBoxValue.DismissedToEnd) && !isDismissed
            ) {
                false
            } else {
                confirmValueChange(it)
            }
        },
        positionalThreshold = { it / 2 },
        velocityThreshold = {
            density.run { DismissThreshold.toPx() }
        }
    )


    internal val offset: Float
        get() = anchoredDraggableState.offset

    /**
     * Require the current offset.
     *
     * @throws IllegalStateException If the offset has not been initialized yet
     */
    fun requireOffset(): Float = anchoredDraggableState.requireOffset()

    /**
     * The current state value of the [CupertinoSwipeBoxState].
     */
    val currentValue: CupertinoSwipeBoxValue get() = anchoredDraggableState.currentValue

    /**
     * The target state. This is the closest state to the current offset (taking into account
     * positional thresholds). If no interactions like animations or drags are in progress, this
     * will be the current state.
     */
    val targetValue: CupertinoSwipeBoxValue get() = anchoredDraggableState.targetValue

    /**
     * The fraction of the progress going from currentValue to targetValue, within [0f..1f] bounds.
     */
    val progress: Float
        get() = anchoredDraggableState.progress(anchoredDraggableState.currentValue, anchoredDraggableState.targetValue)

    val dismissDirection: CupertinoSwipeBoxValue
        get() = when {
            offset == 0f || offset.isNaN() -> CupertinoSwipeBoxValue.Collapsed
            offset >= 0f && isDismissed -> CupertinoSwipeBoxValue.DismissedToEnd
            offset >= 0f -> CupertinoSwipeBoxValue.ExpandedToEnd
            offset <= 0f && isDismissed -> CupertinoSwipeBoxValue.DismissedToStart
            else -> CupertinoSwipeBoxValue.ExpandedToStart
        }
    /**
     * Set the state without any animation and suspend until it's set
     *
     * @param targetValue The new target value
     */
    suspend fun snapTo(targetValue: CupertinoSwipeBoxValue) {
        anchoredDraggableState.snapTo(targetValue)
    }

    suspend fun animateTo(direction: CupertinoSwipeBoxValue) {
        anchoredDraggableState.animateTo(targetValue = direction)
    }

    /**
     * Reset the component to the default position with animation and suspend until it if fully
     * reset or animation has been cancelled. This method will throw [CancellationException] if
     * the animation is interrupted
     *
     * @return the reason the reset animation ended
     */
    suspend fun reset() = animateTo(CupertinoSwipeBoxValue.Collapsed)


    companion object {

        /**
         * The default [Saver] implementation for [CupertinoSwipeBoxState].
         */
        fun Saver(
            dismissThreshold: Float,
            animationSpec : FiniteAnimationSpec<Float>,
            confirmValueChange: (CupertinoSwipeBoxValue) -> Boolean,
            density: Density,
        ) = Saver<CupertinoSwipeBoxState, CupertinoSwipeBoxValue>(
            save = { it.currentValue },
            restore = {
                CupertinoSwipeBoxState(
                    density = density,
                    initialValue = it,
                    animationSpec = animationSpec,
                    dismissThreshold = dismissThreshold,
                    confirmValueChange = confirmValueChange,
                )
            }
        )
    }
}