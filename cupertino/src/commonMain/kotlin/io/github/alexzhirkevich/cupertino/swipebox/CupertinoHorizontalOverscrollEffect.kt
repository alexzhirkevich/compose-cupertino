@file:OptIn(ExperimentalFoundationApi::class)

package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.animation.core.*
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.OverscrollEffect
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.toSize
import kotlin.coroutines.coroutineContext
import kotlin.math.abs
import kotlin.math.roundToInt
import kotlin.math.sign
import kotlinx.coroutines.isActive

class CupertinoHorizontalOverscrollEffect(
    private val density: Float,
    layoutDirection: LayoutDirection
) : OverscrollEffect {

    private val reverseHorizontal = layoutDirection == LayoutDirection.Rtl
    private var scrollSize by mutableStateOf(Size.Zero)
    private var overscrollOffset by mutableStateOf(0f)
    private var lastFlingDelta = 0f

    override val isInProgress: Boolean
        get() = overscrollOffset != 0f

    override val effectModifier: Modifier = Modifier
        .onPlaced { scrollSize = it.size.toSize() }
        .offset { IntOffset(getVisibleOffset(), 0) }

    private fun getVisibleOffset(): Int = overscrollOffset
        .let { if (reverseHorizontal) -it else it }
        .let { rubberBand(it) }
        .roundToInt()

    private fun rubberBand(value: Float): Float {
        if (scrollSize.width == 0f) return 0f
        val dpValue = value / density
        val dpSize = scrollSize.width / density
        return (sign(dpValue) * (1f - 1f / (abs(dpValue) * RUBBER_BAND_COEFF / dpSize + 1f)) * dpSize) * density
    }

    override fun applyToScroll(
        delta: Offset,
        source: NestedScrollSource,
        performScroll: (Offset) -> Offset
    ): Offset {
        val horizontalDelta = applyScroll(delta.x, source) { performScroll(Offset(it, 0f)).x }
        return Offset(horizontalDelta, 0f)
    }

    private fun applyScroll(
        delta: Float,
        source: NestedScrollSource,
        performScroll: (Float) -> Float
    ): Float {
        val isFling = source == NestedScrollSource.SideEffect
        val (usableDelta, newOffset) = calculateDelta(delta, overscrollOffset, isFling)
        overscrollOffset = newOffset

        val consumed = performScroll(usableDelta)
        val remaining = usableDelta - consumed

        if (!isFling) overscrollOffset += remaining
        else lastFlingDelta = remaining

        return delta - remaining
    }

    private fun calculateDelta(
        delta: Float, overscroll: Float, isFling: Boolean
    ): Pair<Float, Float> {
        if (isFling) return delta to overscroll
        val newOffset = overscroll + delta
        return if (newOffset > 0f) newOffset to 0f else 0f to newOffset
    }

    override suspend fun applyToFling(
        velocity: Velocity,
        performFling: suspend (Velocity) -> Velocity
    ) {
        val adjustedVelocity = handleSpringAnimationIfNeeded(velocity.x)
        val consumed = performFling(Velocity(adjustedVelocity, 0f)).x
        val postFling = adjustedVelocity - consumed
        playSpringAnimation(lastFlingDelta, postFling)
    }

    private suspend fun handleSpringAnimationIfNeeded(initialVelocity: Float): Float {
        return if (overscrollOffset * initialVelocity < 0f) {
            playSpringAnimation(0f, initialVelocity)
        } else initialVelocity
    }

    private suspend fun playSpringAnimation(
        unconsumedDelta: Float,
        initialVelocity: Float
    ): Float {
        val initialValue = overscrollOffset + unconsumedDelta
        val initialSign = sign(initialValue)
        var currentVelocity = initialVelocity
        val threshold = 0.5f / density

        val spec = spring(
            stiffness = if (unconsumedDelta != 0f) 400f else 200f,
            visibilityThreshold = threshold
        )

        val state = AnimationState(
            initialValue = initialValue / density,
            initialVelocity = initialVelocity / density
        )

        state.animateTo(0f, spec) {
            overscrollOffset = value * density
            currentVelocity = velocity * density
            if (sign(value) != initialSign) cancelAnimation()
        }

        if (coroutineContext.isActive) overscrollOffset = 0f
        return currentVelocity
    }

    companion object {
        private const val RUBBER_BAND_COEFF = 0.55f
    }
}