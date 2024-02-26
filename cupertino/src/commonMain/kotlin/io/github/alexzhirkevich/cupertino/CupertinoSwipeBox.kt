package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.snapTo
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.node.LayoutModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.util.lerp
import androidx.compose.ui.zIndex
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.roundToInt

@ExperimentalCupertinoApi
enum class CupertinoSwipeBoxValue {

    /** Box is is initial collapsed state */
    Collapsed,

    /** Box is dismissed to end. The first background item should be activated */
    DismissedToEnd,

    /** Box is dismissed to start. The first background item should be activated */
    DismissedToStart,

    /** Start items are expanded */
    ExpandedToEnd,

    /** End items are expanded */
    ExpandedToStart
}

/**
 * Should be together with [CupertinoSwipeBoxState.dismissDirection] to detect dismiss direction
 * towards end and display start items
 * */
@ExperimentalCupertinoApi
val CupertinoSwipeBoxValue.isTowardsEnd : Boolean
    get() = this == CupertinoSwipeBoxValue.ExpandedToEnd
            || this == CupertinoSwipeBoxValue.DismissedToEnd

/**
 * Should be together with [CupertinoSwipeBoxState.dismissDirection] to detect dismiss direction
 * towards start and display end items
 * */
@ExperimentalCupertinoApi
val CupertinoSwipeBoxValue.isTowardsStart : Boolean
    get() = this == CupertinoSwipeBoxValue.ExpandedToStart
            || this == CupertinoSwipeBoxValue.DismissedToStart

/**
 * Remember [CupertinoSwipeBoxState] with [initialValue].
 * Use [dismissThreshold] to setup offset fractions that will be considered dismissed.
 * Use [confirmValueChange] to block value changes or react on dismisses
 * */
@Composable
@ExperimentalCupertinoApi
fun rememberCupertinoSwipeToDismissBoxState(
    initialValue: CupertinoSwipeBoxValue = CupertinoSwipeBoxValue.Collapsed,
    dismissThreshold: Float = .7f,
    confirmValueChange: (CupertinoSwipeBoxValue) -> Boolean = { true },
) : CupertinoSwipeBoxState {
    val density = LocalDensity.current

    return rememberSaveable(
        saver = CupertinoSwipeBoxState.Saver(
            dismissThreshold = dismissThreshold,
            confirmValueChange = confirmValueChange,
            density = density
        )
    ) {
        CupertinoSwipeBoxState(
            initialValue = initialValue,
            dismissThreshold = dismissThreshold,
            density = density,
            confirmValueChange = confirmValueChange,
        )
    }
}

/**
 * Swipe box that can display multiple actions for list item and perform dismiss operations.
 *
 * @param state swipe box state. See [rememberCupertinoSearchTextFieldState]
 * @param items action items. Use [CupertinoSwipeBoxState.dismissDirection] to display start or end items.
 * [CupertinoSwipeBoxItem] should be used as an item.
 * Items are displayed in a row with parallax and bound effect. Display direction for end items is reversed.
 * @param modifier box container modifier.
 * @param handleWidth width of the swipe handle in the [CupertinoSwipeBoxValue.Collapsed] state.
 * When state is expanded or dismissed, swipe can be performed over full item. Tap on item will trigger state collapse.
 * @param itemWidth width of the actions items.
 * @param enableStartToEnd id expansion/dismissal to end is enabled.
 * @param enableEndToStart id expansion/dismissal to start is enabled.
 * @param content foreground content. Should have a non-transparent background
 *
 * @see CupertinoSwipeBoxItem
 * */
@OptIn(InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBox(
    state: CupertinoSwipeBoxState,
    items: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    handleWidth : Dp = CupertinoSwipeBoxDefaults.HandleWidth,
    itemWidth: Dp = CupertinoSwipeBoxDefaults.ItemWidth,
    enableStartToEnd: Boolean = true,
    enableEndToStart: Boolean = true,
    content: @Composable RowScope.() -> Unit,
) {

    var height by remember {
        mutableStateOf(0)
    }

    val scope = rememberCoroutineScope()

    Box{
        if (state.currentValue == CupertinoSwipeBoxValue.Collapsed) {
            SwipeHandle(Modifier.width(handleWidth).align(Alignment.CenterStart), state, height)
            SwipeHandle(Modifier.width(handleWidth).align(Alignment.CenterEnd), state, height)
        } else {
            SwipeHandle(Modifier.fillMaxWidth().offset {
                IntOffset(x = state.offset.roundToInt(), y = 0)
            }.pointerInput(state){
                 detectTapGestures {
                     if (state.confirmValueChange(CupertinoSwipeBoxValue.Collapsed)) {
                         scope.launch {
                             state.reset()
                         }
                     }
                 }
            }, state, height)
        }
        BoxWithConstraints(
            modifier = modifier.onSizeChanged {
                height = it.height
            },
            propagateMinConstraints = true
        ) {

            val itemsCountState = remember {
                mutableStateOf(0)
            }

            var itemsCount by itemsCountState

            val shouldDismiss = (abs(state.offset) > (state.dismissThreshold * constraints.maxWidth))

            state.isDismissed = shouldDismiss

            val firstItemWidth by animateFloatAsState(
                targetValue = if (shouldDismiss) 1f else 0f,
                animationSpec = spring(stiffness = Spring.StiffnessMediumLow)
            )

            val haptic = LocalHapticFeedback.current

            DisposableEffect(state) {
                onDispose {
                    state.isDismissed = false
                }
            }

            LaunchedEffect(haptic, state) {
                snapshotFlow { shouldDismiss }
                    .drop(1)
                    .collect {
                        haptic.performHapticFeedback(CupertinoHapticFeedback.ImpactLight)
                    }
            }

            CompositionLocalProvider(LocalSwipeBoxState provides state) {
                SubcomposeLayout(
                    modifier = Modifier.matchParentSize()
                ) { constraints ->

                    val itemsMeasurables = subcompose(null) {
                        items()
                    }
                    itemsCount = itemsMeasurables.size

                    val pleceables = itemsMeasurables.mapIndexed { index, it ->

                        val animatedMultiplier = if (index == 0) firstItemWidth else 0f

                        val min =
                            (abs(state.offset) / itemsCount).coerceAtLeast(itemWidth.toPx() + 1)
                        val max = abs(state.offset).coerceAtLeast(itemWidth.toPx() + 1)

                        it.measure(
                            constraints.copy(
                                minWidth = itemWidth.roundToPx(),
                                maxWidth = lerp(min, max, animatedMultiplier).roundToInt()
                            )
                        )
                    }

                    val parallax = ((itemWidth * itemsCount).toPx() - abs(state.offset))
                        .takeIf { it > 0 }
                        ?.roundToInt() ?: 0

                    layout(constraints.maxWidth, constraints.maxHeight) {

                        val isTowardsEnd = state.dismissDirection.isTowardsEnd

                        var x = if (isTowardsEnd) 0 else constraints.maxWidth

                        pleceables.fastForEachIndexed { i, it ->

                            if (!isTowardsEnd) {
                                x -= it.width
                            }

                            val parallaxAmount = (parallax / itemsCount) * (i + 1) *
                                    if (isTowardsEnd) -1 else 1

                            it.placeRelative(
                                x = x + parallaxAmount,
                                y = 0,
                                zIndex = pleceables.size - i.toFloat()
                            )
                            if (state.dismissDirection.isTowardsEnd) {
                                x += it.width
                            }
                        }
                    }
                }
            }
            Row(
                content = content,
                modifier = Modifier.swipeBoxAnchors(
                    state = state,
                    enableStartToEnd = enableStartToEnd,
                    enableEndToStart = enableEndToStart,
                    itemWidth = itemWidth,
                    count = itemsCountState
                )
            )
        }
    }
}

/**
 * Item for the [CupertinoSwipeBox]
 *
 * @param color item container color
 * @param onClick item click handler
 * @param modifier item modifier
 * @param content item content
 *
 * @see CupertinoSwipeBox
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBoxItem(
    color : Color,
    onClick : () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    CompositionLocalProvider(
        LocalContentColor provides CupertinoColors.White
    ) {

        val state = LocalSwipeBoxState.current

        val animHorizBias by animateFloatAsState(
            when {
                state == null -> 0f
                state.isDismissed && state.dismissDirection.isTowardsEnd -> 1f
                state.isDismissed && state.dismissDirection.isTowardsStart -> -1f
                else -> 0f
            }
        )

        ProvideTextStyle(
            CupertinoTheme.typography.caption1
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color)
                    .clickable(onClick = onClick)
                    .padding(horizontal = 8.dp)
                    .then(modifier),
                contentAlignment =  BiasAlignment(
                    verticalBias = .5f,
                    horizontalBias = animHorizBias
                )
            ) {
                Column(
                    verticalArrangement = Arrangement
                        .spacedBy(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    content = content
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
@ExperimentalCupertinoApi
private fun SwipeHandle(
    modifier: Modifier,
    state: CupertinoSwipeBoxState,
    height : Int
) {
    val density = LocalDensity.current
    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
    Spacer(
        modifier
            .zIndex(1f)
            .height(density.run { height.toDp() })
            .anchoredDraggable(
                state = state.anchoredDraggableState,
                orientation = Orientation.Horizontal,
                enabled = state.currentValue != CupertinoSwipeBoxValue.DismissedToStart &&
                        state.currentValue != CupertinoSwipeBoxValue.DismissedToEnd,
                reverseDirection = isRtl,
            )
    )
}

@ExperimentalCupertinoApi
@OptIn(ExperimentalFoundationApi::class)
class CupertinoSwipeBoxState(
    initialValue: CupertinoSwipeBoxValue,
    internal val dismissThreshold: Float = .7f,
    internal val density: Density,
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
        animationSpec = spring(),
        confirmValueChange = {
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


    internal val offset: Float get() = anchoredDraggableState.offset

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
    val progress: Float get() = anchoredDraggableState.progress

    val dismissDirection: CupertinoSwipeBoxValue
        get() = when {
            offset == 0f || offset.isNaN() -> CupertinoSwipeBoxValue.Collapsed
            offset >= 0f -> CupertinoSwipeBoxValue.ExpandedToEnd
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
            confirmValueChange: (CupertinoSwipeBoxValue) -> Boolean,
            density: Density
        ) = Saver<CupertinoSwipeBoxState, CupertinoSwipeBoxValue>(
            save = { it.currentValue },
            restore = {
                CupertinoSwipeBoxState(
                    initialValue = it,
                    dismissThreshold = dismissThreshold,
                    density = density,
                    confirmValueChange = confirmValueChange,
                )
            }
        )
    }
}


@ExperimentalCupertinoApi
private val LocalSwipeBoxState = compositionLocalOf<CupertinoSwipeBoxState?> {
    null
}

@ExperimentalCupertinoApi
private fun Modifier.swipeBoxAnchors(
    state: CupertinoSwipeBoxState,
    enableStartToEnd: Boolean,
    enableEndToStart: Boolean,
    itemWidth: Dp,
    count: State<Int>,
) = this then SwipeBoxAnchorsElement(
    state = state,
    enableStartToEnd = enableStartToEnd,
    enableEndToStart = enableEndToStart,
    itemWidth = itemWidth,
    count = count
)

@ExperimentalCupertinoApi
private class SwipeBoxAnchorsElement(
    private val state: CupertinoSwipeBoxState,
    private val enableStartToEnd: Boolean,
    private val enableEndToStart: Boolean,
    private val itemWidth: Dp,
    private val count: State<Int>,
) : ModifierNodeElement<SwipeBoxAnchorsNode>() {

    override fun create() = SwipeBoxAnchorsNode(
        state = state,
        enableStartToEnd = enableStartToEnd,
        enableEndToStart = enableEndToStart,
        itemWidth = itemWidth,
        count = count
    )

    override fun update(node: SwipeBoxAnchorsNode) {
        node.state = state
        node.enableStartToEnd = enableStartToEnd
        node.enableEndToStart = enableEndToStart
        node.itemWidth = itemWidth
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        other as SwipeBoxAnchorsElement
        if (state != other.state) return false
        if (enableStartToEnd != other.enableStartToEnd) return false
        return enableEndToStart == other.enableEndToStart
    }

    override fun hashCode(): Int {
        var result = state.hashCode()
        result = 31 * result + enableStartToEnd.hashCode()
        result = 31 * result + enableEndToStart.hashCode()
        return result
    }

    override fun InspectorInfo.inspectableProperties() {
        debugInspectorInfo {
            properties["state"] = state
            properties["enableDismissFromStartToEnd"] = enableStartToEnd
            properties["enableDismissFromEndToStart"] = enableEndToStart
        }
    }
}

@ExperimentalCupertinoApi
private class SwipeBoxAnchorsNode(
    var state: CupertinoSwipeBoxState,
    var enableStartToEnd: Boolean,
    var enableEndToStart: Boolean,
    var itemWidth: Dp,
    count: State<Int>,
) : Modifier.Node(), LayoutModifierNode {

    private var didLookahead: Boolean = false

    var count by mutableStateOf(count)

    override fun onDetach() {
        didLookahead = false
    }

    @OptIn(ExperimentalFoundationApi::class)
    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        val placeable = measurable.measure(constraints)
        // If we are in a lookahead pass, we only want to update the anchors here and not in
        // post-lookahead. If there is no lookahead happening (!isLookingAhead && !didLookahead),
        // update the anchors in the main pass.
        if (isLookingAhead || !didLookahead) {
            val width = placeable.width.toFloat()
            val itemsWidth = count.value * itemWidth.toPx()
            val newAnchors = buildMap {
                this[CupertinoSwipeBoxValue.Collapsed] = 0f
                if (enableStartToEnd) {
                    this[CupertinoSwipeBoxValue.ExpandedToEnd] = itemsWidth
                    this[CupertinoSwipeBoxValue.DismissedToEnd] = width
                }
                if (enableEndToStart) {
                    this[CupertinoSwipeBoxValue.ExpandedToStart] = -itemsWidth
                    this[CupertinoSwipeBoxValue.DismissedToStart] = -width
                }
            }
            val map = MapDraggableAnchorsStep(
                anchors = newAnchors,
                state = state
            )
            state.anchoredDraggableState.updateAnchors(map)
        }

        didLookahead = isLookingAhead || didLookahead

        return layout(placeable.width, placeable.height) {
            // In a lookahead pass, we use the position of the current target as this is where any
            // ongoing animations would move. If SwipeToDismissBox is in a settled state, lookahead
            // and post-lookahead will converge.
            val xOffset = if (isLookingAhead) {
                state.anchoredDraggableState.anchors.positionOf(state.targetValue)
            } else state.requireOffset()

            placeable.place(xOffset.roundToInt(), 0)
        }
    }
}

@Stable
object CupertinoSwipeBoxDefaults {
    val ItemWidth : Dp = 58.dp
    val HandleWidth : Dp = 24.dp
}

private val DismissThreshold = 125.dp



@OptIn(ExperimentalFoundationApi::class, ExperimentalCupertinoApi::class)
private class MapDraggableAnchorsStep(
    private val anchors: Map<CupertinoSwipeBoxValue, Float>,
    private val state: CupertinoSwipeBoxState
) : DraggableAnchors<CupertinoSwipeBoxValue> {

    override fun positionOf(value: CupertinoSwipeBoxValue): Float = anchors[value] ?: Float.NaN
    override fun hasAnchorFor(value: CupertinoSwipeBoxValue) = anchors.containsKey(value)

    override fun closestAnchor(position: Float): CupertinoSwipeBoxValue? {

        if (position == 0f)
            return CupertinoSwipeBoxValue.Collapsed

        val closest = anchors.minByOrNull {
            abs(position - it.value)
        }?.key ?: return null

        if (dismissedClosest(closest)){
            return closest
        }

        val c = state.currentValue

        val closestX = anchors[closest] ?: return closest
        val currentX = anchors[c] ?: return closest

        return firstBetween(currentX, closestX) ?: closest
    }

    private fun dismissedClosest(closest : CupertinoSwipeBoxValue) : Boolean {
        return state.isDismissed &&
                (closest == CupertinoSwipeBoxValue.DismissedToEnd ||
                        closest == CupertinoSwipeBoxValue.DismissedToStart)
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

    override fun hashCode() = 31 * anchors.hashCode()

    override fun toString() = "MapDraggableAnchors($anchors)"
}
