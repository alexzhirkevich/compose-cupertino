package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.roundToInt

/**
 * The state that is associated with a [PullToRefreshContainer].
 * Each instance of [PullToRefreshContainer] should have its own [PullToRefreshState].
 *
 * [PullToRefreshState] can be used with other progress indicators like so:
 */
@Stable
@ExperimentalCupertinoApi
interface PullToRefreshState {
    /** The threshold (in pixels), above which if a release occurs, a refresh will be called */
    val positionalThreshold: Float

    /**
     * PullRefresh progress towards [positionalThreshold]. 0.0 indicates no progress, 1.0 indicates
     * complete progress, > 1.0 indicates overshoot beyond the provided threshold
     */
    val progress: Float

    /**
     * Indicates whether a refresh is occurring.
     */
    val isRefreshing: Boolean

    val isCollapsing : Boolean

    /**
     * Sets [isRefreshing] to true.
     */
    suspend fun startRefresh()

    /**
     * Sets [isRefreshing] to false.
     */
    suspend fun endRefresh()


    /**
     * The vertical offset (in pixels) for the [PullToRefreshContainer] to consume
     */
    val verticalOffset: Float

    /**
     * A [NestedScrollConnection] that should be attached to a [Modifier.nestedScroll] in order to
     * keep track of the scroll events.
     */
    var nestedScrollConnection: NestedScrollConnection
}

@ExperimentalCupertinoApi
@Composable
fun rememberCupertinoPullToRefreshState(
    positionalThreshold: Dp = CupertinoPullToRefreshDefaults.PositionalThreshold,
    enabled: () -> Boolean = { true },
) : PullToRefreshState {
    val density = LocalDensity.current
    val positionalThresholdPx = with(density) { positionalThreshold.toPx() }
    return rememberSaveable(
        positionalThresholdPx, enabled,
        saver = PullToRefreshStateImpl.Saver(
            positionalThreshold = positionalThresholdPx,
            enabled = enabled,
        )
    ) {
        PullToRefreshStateImpl(
            initialRefreshing = false,
            positionalThreshold = positionalThresholdPx,
            enabled = enabled,
        )
    }
}


@Composable
@ExperimentalCupertinoApi
fun CupertinoPullToRefreshContainer(
    state: PullToRefreshState,
    modifier: Modifier = Modifier,
    indicatorModifier : Modifier = Modifier,
    indicator : @Composable (PullToRefreshState, Modifier) -> Unit = { s, m ->
        CupertinoPullToRefreshDefaults.Indicator(s, m)
    },
    content : @Composable () -> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .offset { IntOffset(0, state.verticalOffset.roundToInt()) }
                .nestedScroll(state.nestedScrollConnection)
        ) {
            content()
        }
        indicator(state, indicatorModifier)
    }
}

@Stable
@ExperimentalCupertinoApi
object CupertinoPullToRefreshDefaults {

    val PositionalThreshold = 80.dp

    @Composable
    fun Indicator(state: PullToRefreshState, modifier: Modifier = Modifier) {

        val animSpec = cupertinoTween<Float>()

        val visible = !state.isCollapsing &&
                (state.isRefreshing || state.progress != 0f)

        val rotation by animateFloatAsState(
            if (visible) 0f else 360f,
        )

        AnimatedVisibility(
            exit = scaleOut(animSpec),
            enter = EnterTransition.None,
            visible = visible
        ) {
            CupertinoActivityIndicator(
                modifier = modifier.graphicsLayer {
                    if (!visible) {
                        rotationZ = rotation
                    }
                },
                progress = if (state.isRefreshing) 1f else state.progress.coerceIn(0f, 1f)
            )
        }
    }
}

@ExperimentalCupertinoApi
internal class PullToRefreshStateImpl(
//    private val hapticFeedback: HapticFeedback,
    initialRefreshing: Boolean,
    override val positionalThreshold: Float,
    enabled: () -> Boolean,
) : PullToRefreshState {

    override val progress get() = adjustedDistancePulled / positionalThreshold
    override val verticalOffset get() = _verticalOffset

    override val isRefreshing get() = progress >= 1f || _refreshing

    private var _isCollapsing: Boolean by mutableStateOf(false)
    override val isCollapsing get() = _isCollapsing

    override suspend fun startRefresh() {
        _refreshing = true
        animateTo(positionalThreshold)
    }

    override suspend fun endRefresh() {
        _isCollapsing = true
        animateTo(0f)
        _isCollapsing = false
        _refreshing = false
    }

    override var nestedScrollConnection = object : NestedScrollConnection {
        override fun onPreScroll(
            available: Offset,
            source: NestedScrollSource,
        ): Offset = when {
            !enabled() -> Offset.Zero
            // Swiping up
            source == NestedScrollSource.Drag && available.y < 0 -> {
                consumeAvailableOffset(available)
            }

            else -> Offset.Zero
        }

        override fun onPostScroll(
            consumed: Offset,
            available: Offset,
            source: NestedScrollSource
        ): Offset = when {
            !enabled() -> Offset.Zero
            // Swiping down
            source == NestedScrollSource.Drag && available.y > 0 -> {
                consumeAvailableOffset(available)
            }

            else -> Offset.Zero
        }

        override suspend fun onPreFling(available: Velocity): Velocity {
            return Velocity(0f, onRelease(available.y))
        }
    }

    /** Helper method for nested scroll connection */
    fun consumeAvailableOffset(available: Offset): Offset {
        val y = if (isRefreshing) 0f else {
            val newOffset = (distancePulled + available.y).coerceAtLeast(0f)
            val dragConsumed = newOffset - distancePulled
            distancePulled = newOffset
            _verticalOffset = calculateVerticalOffset()
            dragConsumed
        }

        return Offset(0f, y)
    }

    /** Helper method for nested scroll connection. Calls onRefresh callback when triggered */
    suspend fun onRelease(velocity: Float): Float {
//        if (isRefreshing) return 0f // Already refreshing, do nothing
        // Trigger refresh
        if (adjustedDistancePulled > positionalThreshold) {
            startRefresh()
        } else {
            animateTo(0f)
        }

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

    suspend fun animateTo(offset: Float) {
        animate(initialValue = _verticalOffset, targetValue = offset) { value, _ ->
            _verticalOffset = value
        }
    }

    /** Provides custom vertical offset behavior for [PullToRefreshContainer] */
    fun calculateVerticalOffset(): Float = when {
        // If drag hasn't gone past the threshold, the position is the adjustedDistancePulled.
        adjustedDistancePulled <= positionalThreshold -> adjustedDistancePulled
        else -> {
            // How far beyond the threshold pull has gone, as a percentage of the threshold.
            val overshootPercent = abs(progress) - 1.0f
            // Limit the overshoot to 200%. Linear between 0 and 200.
            val linearTension = overshootPercent.coerceIn(0f, 2f)
            // Non-linear tension. Increases with linearTension, but at a decreasing rate.
            val tensionPercent = linearTension - linearTension.pow(2) / 4
            // The additional offset beyond the threshold.
            val extraOffset = positionalThreshold * tensionPercent
            positionalThreshold + extraOffset
        }
    }

    companion object {
        /** The default [Saver] for [PullToRefreshStateImpl]. */
        fun Saver(
            positionalThreshold: Float,
            enabled: () -> Boolean,
        ) = Saver<PullToRefreshState, Boolean>(
            save = { it.isRefreshing },
            restore = { isRefreshing ->
                PullToRefreshStateImpl(isRefreshing, positionalThreshold, enabled)
            }
        )
    }

    internal var distancePulled by mutableFloatStateOf(0f)
    private val adjustedDistancePulled: Float get() = distancePulled * DragMultiplier
    private var _verticalOffset by mutableFloatStateOf(0f)
    private var _refreshing by mutableStateOf(initialRefreshing)
}

private const val DragMultiplier = 0.5f
