@file:OptIn(ExperimentalMaterialApi::class)

package com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers

import androidx.compose.animation.core.animate
import androidx.compose.foundation.MutatorMutex
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.pow

fun Modifier.cupertinoScrollOverflow(
    orientation: Orientation,
    enabled: Boolean = true
) = composed {
    val pull = rememberVerticalCupertinoScroll()
    nestedScroll(
        CupertinoScrollConnection(
            orientation = orientation,
            onPull = pull::onPull,
            onRelease = pull::onRelease,
            enabled = enabled
        )
    ).graphicsLayer {
        if (orientation == Orientation.Vertical)
            translationY = pull.position
        else translationX = pull.position
    }
}

@Composable
private fun rememberVerticalCupertinoScroll(
    refreshThreshold: Dp = PullRefreshDefaults.RefreshThreshold,
    refreshingOffset: Dp = PullRefreshDefaults.RefreshingOffset,
): CupertinoScroll {
    require(refreshThreshold > 0.dp) { "The refresh trigger must be greater than zero!" }

    val scope = rememberCoroutineScope()
    val thresholdPx: Float
    val refreshingOffsetPx: Float

    with(LocalDensity.current) {
        thresholdPx = refreshThreshold.toPx()
        refreshingOffsetPx = refreshingOffset.toPx()
    }

    val state = remember(scope) {
        CupertinoScroll(scope, refreshingOffsetPx, thresholdPx)
    }

    SideEffect {
        state.setThreshold(thresholdPx)
        state.setRefreshingOffset(refreshingOffsetPx)
    }

    return state
}


private class CupertinoScrollConnection(
    private val orientation: Orientation,
    private val onPull: (pullDelta: Float) -> Float,
    private val onRelease: suspend (flingVelocity: Float) -> Float,
    private val enabled: Boolean
) : NestedScrollConnection {

    override fun onPreScroll(
        available: Offset,
        source: NestedScrollSource
    ): Offset = when {
        !enabled -> Offset.Zero
        orientation == Orientation.Vertical &&
                source == NestedScrollSource.Drag &&
                available.y < 0 -> Offset(0f, onPull(available.y)) // Pulling up
        orientation == Orientation.Horizontal &&
                source == NestedScrollSource.Drag &&
                available.x < 0 -> Offset(onPull(available.x), 0f) // Pulling left
        else -> Offset.Zero
    }

    override fun onPostScroll(
        consumed: Offset,
        available: Offset,
        source: NestedScrollSource
    ): Offset = when {
        !enabled -> Offset.Zero
        orientation == Orientation.Vertical &&
                source == NestedScrollSource.Drag &&
                available.y > 0 -> Offset(0f, onPull(available.y)) // Pulling down

        orientation == Orientation.Horizontal &&
                source == NestedScrollSource.Drag &&
                available.x > 0 -> Offset(onPull(available.x),0f) // Pulling right

        else -> Offset.Zero
    }

    override suspend fun onPreFling(available: Velocity): Velocity {
        return Velocity(0f, onRelease(available.y))
    }
}

private class CupertinoScroll(
    private val animationScope: CoroutineScope,
    refreshingOffset: Float,
    threshold: Float
) {
    /**
     * A float representing how far the user has pulled as a percentage of the refreshThreshold.
     *
     * If the component has not been pulled at all, progress is zero. If the pull has reached
     * halfway to the threshold, progress is 0.5f. A value greater than 1 indicates that pull has
     * gone beyond the refreshThreshold - e.g. a value of 2f indicates that the user has pulled to
     * two times the refreshThreshold.
     */
    private val progress get() = adjustedDistancePulled / threshold

    internal val position get() = _position
    internal val threshold get() = _threshold

    private val adjustedDistancePulled by derivedStateOf { distancePulled * DragMultiplier }

    private var _refreshing by mutableStateOf(false)
    private var _position by mutableStateOf(0f)
    private var distancePulled by mutableStateOf(0f)
    private var _threshold by mutableStateOf(threshold)
    private var _refreshingOffset by mutableStateOf(refreshingOffset)

    internal fun onPull(pullDelta: Float): Float {
        if (_refreshing) return 0f // Already refreshing, do nothing.

        val newOffset = (distancePulled + pullDelta)
        val dragConsumed = newOffset - distancePulled
        distancePulled = newOffset
        _position = calculateIndicatorPosition()
        return dragConsumed
    }

    internal fun onRelease(velocity: Float): Float {

        animateIndicatorTo(0f)
        val consumed = when {
            // We are flinging without having dragged the pull refresh (for example a fling inside
            // a list) - don't consume
            distancePulled == 0f -> 0f
            // If the velocity is negative, the fling is upwards, and we don't want to prevent the
            // the list from scrolling
            velocity < 0f -> 0f
            // We are showing the indicator, and the fling is downwards - consume everything
            else -> velocity
        }
        distancePulled = 0f
        return consumed
    }

    internal fun setRefreshing(refreshing: Boolean) {
        if (_refreshing != refreshing) {
            _refreshing = refreshing
            distancePulled = 0f
            animateIndicatorTo(if (refreshing) _refreshingOffset else 0f)
        }
    }

    internal fun setThreshold(threshold: Float) {
        _threshold = threshold
    }

    internal fun setRefreshingOffset(refreshingOffset: Float) {
        if (_refreshingOffset != refreshingOffset) {
            _refreshingOffset = refreshingOffset
        }
    }

    // Make sure to cancel any existing animations when we launch a new one. We use this instead of
    // Animatable as calling snapTo() on every drag delta has a one frame delay, and some extra
    // overhead of running through the animation pipeline instead of directly mutating the state.
    private val mutatorMutex = MutatorMutex()

    private fun animateIndicatorTo(offset: Float) = animationScope.launch {
        mutatorMutex.mutate {
            animate(initialValue = _position, targetValue = offset) { value, _ ->
                _position = value
            }
        }
    }

    private fun calculateIndicatorPosition(): Float = when {
        // If drag hasn't gone past the threshold, the position is the adjustedDistancePulled.
        abs(adjustedDistancePulled) <= threshold -> adjustedDistancePulled
        else -> {
            // How far beyond the threshold pull has gone, as a percentage of the threshold.
            val overshootPercent = abs(progress) - 1.0f
            // Limit the overshoot to 200%. Linear between 0 and 200.
            val linearTension = overshootPercent.coerceIn(0f, 2f)
            // Non-linear tension. Increases with linearTension, but at a decreasing rate.
            val tensionPercent = linearTension - linearTension.pow(2) / 4
            // The additional offset beyond the threshold.
            val extraOffset = threshold * tensionPercent


            if (progress >= 0)
                threshold+extraOffset
            else -(threshold+extraOffset)
        }
    }
}



/**
 * The distance pulled is multiplied by this value to give us the adjusted distance pulled, which
 * is used in calculating the indicator position (when the adjusted distance pulled is less than
 * the refresh threshold, it is the indicator position, otherwise the indicator position is
 * derived from the progress).
 */
private const val DragMultiplier = 0.5f
