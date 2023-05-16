@file:OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)

package com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.tween
import androidx.compose.foundation.MutatorMutex
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoLargeTopAppBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.pow



/**
 * Add ios-like scroll overflow to the scrollable container.
 * Must be applied before scroll modifiers or to host container. Can be applied directly to lazy lists
 *
 * @param orientation Orientation of the scroll
 * @param scrollState State of the scroll
 * @param overflowState state of this overflow
 * @param topAppBarState state from the [CupertinoLargeTopAppBar]s scroll behavior
 * Do not pass other top bars state.
 * @param enabled is overflow enabled
 * */
fun Modifier.cupertinoScrollOverflow(
    orientation: Orientation,
    scrollState: ScrollableState,
    overflowState: ScrollOverflowState? = null,
    topAppBarState: TopAppBarState? = null,
    enabled: Boolean = true,
) = composed {

    val pull by rememberUpdatedState(overflowState ?: rememberCupertinoScrollOverflowState())

    nestedScroll(
        CupertinoScrollConnection(
            scrollState = scrollState,
            topAppBarState = topAppBarState,
            pull = pull,
            orientation = orientation,
            enabled = enabled,
        )
    ).graphicsLayer {
        // offset will be added by top bar
        if (topAppBarState != null && orientation == Orientation.Vertical && pull.position >= 0)
            return@graphicsLayer

        if (orientation == Orientation.Vertical)
            translationY = pull.position
        else translationX = pull.position
    }
}

val ScrollOverflowState.topBarScrollEnabled : Boolean
    get() = position <= 0f

@Composable
fun rememberCupertinoScrollOverflowState(): ScrollOverflowState {

    val scope = rememberCoroutineScope()
    val thresholdPx: Float
    val refreshingOffsetPx: Float

    with(LocalDensity.current) {
        thresholdPx = 100.dp.toPx()
        refreshingOffsetPx = PullRefreshDefaults.RefreshingOffset.toPx()
    }


    val state = remember(scope) {
        CupertinoScrollOverflowState(scope, refreshingOffsetPx, thresholdPx)
    }

    SideEffect {
        state.setThreshold(thresholdPx)
        state.setRefreshingOffset(refreshingOffsetPx)
    }

    return state
}

private class CupertinoScrollConnection(
    private val scrollState: ScrollableState,
    private val topAppBarState: TopAppBarState? = null,
    private val pull: ScrollOverflowState,
    private val orientation: Orientation,
    private val enabled: Boolean,
) : NestedScrollConnection {

    override fun onPreScroll(
        available: Offset,
        source: NestedScrollSource
    ): Offset = when {
        !enabled -> Offset.Zero

        pull.position <= 0 && scrollState.canScrollForward ||
                pull.position >= 0 && scrollState.canScrollBackward
        -> Offset.Zero

        source == NestedScrollSource.Fling && orientation == Orientation.Vertical -> {
            Offset(0f,pull.onPull(available.y.coerceAtMost(0f)))
        }

        source == NestedScrollSource.Fling && orientation == Orientation.Horizontal ->{
            pull.onPull(if (available.x < 0) available.x else available.x/20)
            available.copy(y=0f)
        }
        orientation == Orientation.Vertical ->
            Offset(0f, pull.onPull(available.y))

        orientation == Orientation.Horizontal ->
            Offset(pull.onPull(available.x), 0f) // Pulling left
        else -> Offset.Zero
    }

    override fun onPostScroll(
        consumed: Offset,
        available: Offset,
        source: NestedScrollSource
    ): Offset {
        return when {
            !enabled || topAppBarState != null && topAppBarState.collapsedFraction != 0f -> Offset.Zero

//            source == NestedScrollSource.Fling &&
//                    (orientation == Orientation.Vertical && available.y > 0 ||
//                            orientation == Orientation.Horizontal && available.x > 0) ->

            source == NestedScrollSource.Fling && orientation == Orientation.Vertical ->{
//                pull.onPull(if (available.y < 0) available.y else available.y/10)

//                available.copy(x=0f)
                Offset(0f,pull.onPull(available.y.coerceAtMost(0f)))
            }

            source == NestedScrollSource.Fling && orientation == Orientation.Horizontal -> {
                pull.onPull(if (available.x < 0) available.x else available.x/10)
                available.copy(y=0f)
            }

            orientation == Orientation.Vertical && available.y != 0f ->
                Offset(0f, pull.onPull(available.y))

            orientation == Orientation.Horizontal && available.y != 0f ->
                Offset(pull.onPull(available.x), 0f)

            else -> Offset.Zero
        }
    }
    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        return super.onPostFling(consumed, available) +
            if (orientation == Orientation.Vertical)
                Velocity(0f, pull.onRelease(available.y))
            else Velocity(pull.onRelease(available.x), 0f)
    }
}


abstract class ScrollOverflowState {

    abstract val position : Float

    internal abstract fun onPull(pullDelta: Float): Float

    internal abstract fun onRelease(velocity: Float): Float
}


private class CupertinoScrollOverflowState(
    private val animationScope: CoroutineScope,
    refreshingOffset: Float,
    threshold: Float
) : ScrollOverflowState(), ScrollScope {
    /**
     * A float representing how far the user has pulled as a percentage of the refreshThreshold.
     *
     * If the component has not been pulled at all, progress is zero. If the pull has reached
     * halfway to the threshold, progress is 0.5f. A value greater than 1 indicates that pull has
     * gone beyond the refreshThreshold - e.g. a value of 2f indicates that the user has pulled to
     * two times the refreshThreshold.
     */
    private val progress get() = adjustedDistancePulled / threshold

    override val position get() = _position
    internal val threshold get() = _threshold

    private val adjustedDistancePulled by derivedStateOf { distancePulled * DragMultiplier }

    private var _refreshing by mutableStateOf(false)
    private var _position by mutableStateOf(0f)
    private var distancePulled by mutableStateOf(0f)
    private var _threshold by mutableStateOf(threshold)
    private var _refreshingOffset by mutableStateOf(refreshingOffset)
    override fun scrollBy(pixels: Float): Float {
        _position += pixels
        return pixels
    }

    override fun onPull(pullDelta: Float): Float {
        if (_refreshing) return 0f // Already refreshing, do nothing.

        val newOffset = (distancePulled + pullDelta)
        val dragConsumed = newOffset - distancePulled
        distancePulled = newOffset

        val newPosition = if (distancePulled < 0 && pullDelta > 0 ||
            distancePulled > 0 && pullDelta < 0
        ) position + pullDelta else
            calculateIndicatorPosition()

        if (_position >= 0 && newPosition <= 0 || _position <= 0 && newPosition >= 0) {
            distancePulled = 0f
        }

        _position = newPosition


        return dragConsumed
    }

    override fun onRelease(velocity: Float): Float {
        if (distancePulled != 0f) {
            animateIndicatorTo(0f)
        }
        distancePulled = 0f

        return velocity
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
            animate(
                initialValue = _position,
                targetValue = offset,
                animationSpec = tween(
                    easing = CubicBezierEasing(0.4f, 0.0f, 0.3f, 1.0f)
                )
            ) { value, _ ->
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
