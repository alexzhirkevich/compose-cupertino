package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.FiniteAnimationSpec
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
import androidx.compose.foundation.gestures.snapTo
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.derivedStateOf
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
import androidx.compose.ui.semantics.Role
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
 * Dismiss will be performed with [animationSpec]
 * */
@Composable
@ExperimentalCupertinoApi
@Stable
fun rememberCupertinoSwipeBoxState(
    initialValue: CupertinoSwipeBoxValue = CupertinoSwipeBoxValue.Collapsed,
    dismissThreshold: Float = CupertinoSwipeBoxDefaults.DismissThreshold,
    animationSpec : FiniteAnimationSpec<Float> = CupertinoSwipeBoxDefaults.AnimationSpec,
    confirmValueChange: (CupertinoSwipeBoxValue) -> Boolean = { true },
) : CupertinoSwipeBoxState {
    val density = LocalDensity.current

    return rememberSaveable(
        saver = CupertinoSwipeBoxState.Saver(
            dismissThreshold = dismissThreshold,
            animationSpec = animationSpec,
            confirmValueChange = confirmValueChange,
            density = density
        )
    ) {
        CupertinoSwipeBoxState(
            animationSpec = animationSpec,
            initialValue = initialValue,
            dismissThreshold = dismissThreshold,
            density = density,
            confirmValueChange = confirmValueChange,
        )
    }
}

enum class SwipeBoxBehavior {

    /**
     * Swipe in this direction is completely disabled
     * */
    Disabled,

    /**
     * Background items can be expanded and settled but can't be dismissed
     * */
    Expandable,

    /**
     * Background items can be expanded and the first item can be swiped out to the end hiding other items
     * */
    Dismissible
}

/**
 * Swipe box that can display multiple actions for list item and perform dismiss operations.
 *
 * @param state swipe box state. See [rememberCupertinoSwipeBoxState]
 * @param items action items. Use [CupertinoSwipeBoxState.dismissDirection] to display start or end items.
 * [CupertinoSwipeBoxItem] should be used as an item.
 * Items are displayed in a row with parallax and bound effect. Display direction for end items is reversed.
 * @param modifier box container modifier.
 * @param restoreOnClick click on foreground part will collapse the box when it is expanded.
 * Any other tap gestures will be consumed.
 * @param handleWidth width of the swipe handle in the [CupertinoSwipeBoxValue.Collapsed] state.
 * When state is expanded or dismissed, swipe can be performed over the whole foreground part.
 * Use [Dp.Unspecified] or [Dp.Infinity] to enable full-box swipe.
 * Tap on item will trigger state collapse.
 * @param itemWidth width of the actions items.
 * @param startToEndBehavior id expansion/dismissal to end is enabled.
 * @param endToStartBehavior id expansion/dismissal to start is enabled.
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
    restoreOnClick : Boolean = true,
    handleWidth : Dp = Dp.Unspecified,
    itemWidth: Dp = CupertinoSwipeBoxDefaults.ItemWidth,
    startToEndBehavior: SwipeBoxBehavior = SwipeBoxBehavior.Dismissible,
    endToStartBehavior: SwipeBoxBehavior = SwipeBoxBehavior.Dismissible,
    content: @Composable RowScope.() -> Unit,
) {

    var height by remember {
        mutableStateOf(0)
    }

    val scope = rememberCoroutineScope()

    val isFullBoxSwipe = handleWidth == Dp.Unspecified || handleWidth == Dp.Infinity

    Box {
        if (state.currentValue == CupertinoSwipeBoxValue.Collapsed) {
            if (!isFullBoxSwipe) {
                SwipeHandle(Modifier.width(handleWidth).align(Alignment.CenterStart), state, height)
                SwipeHandle(Modifier.width(handleWidth).align(Alignment.CenterEnd), state, height)
            }
        } else {
            if (restoreOnClick) {
                SwipeHandle(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset {
                            IntOffset(x = state.offset.roundToInt(), y = 0)
                        }.clickable(
                            onClick = {
                                if (state.confirmValueChange(CupertinoSwipeBoxValue.Collapsed)) {
                                    scope.launch {
                                        state.reset()
                                    }
                                }
                            },
                            onClickLabel = "Collapse",
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }
                        ),
                    state = state, height = height
                )
            }
        }

        val isSwipeHandleOnBox by remember(state) {
            derivedStateOf {
                state.currentValue == CupertinoSwipeBoxValue.Collapsed && isFullBoxSwipe ||
                        state.currentValue != CupertinoSwipeBoxValue.Collapsed && !restoreOnClick
            }
        }

        BoxWithConstraints(
            modifier = modifier
                .onSizeChanged { height = it.height } then
                    if (isSwipeHandleOnBox) Modifier.swipeHandle(state) else Modifier,
            propagateMinConstraints = true
        ) {

            val itemsCountState = remember {
                mutableStateOf(0)
            }

            var itemsCount by itemsCountState

            val shouldDismiss by remember(state) {
                derivedStateOf {
                    val canDismiss =
                        state.dismissDirection.isTowardsEnd && startToEndBehavior == SwipeBoxBehavior.Dismissible ||
                                state.dismissDirection.isTowardsStart && endToStartBehavior == SwipeBoxBehavior.Dismissible
                    canDismiss && (abs(state.offset) > (state.dismissThreshold * constraints.maxWidth))
                }
            }

            SideEffect {
                state.isDismissed = shouldDismiss
            }

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

                    val itemWidthPx = itemWidth.toPx()

                    val pleceables = itemsMeasurables.mapIndexed { index, it ->

                        val animatedMultiplier = if (index == 0) firstItemWidth else 0f

                        val min =
                            (abs(state.offset) / itemsCount).coerceAtLeast(itemWidthPx + 1)
                        val max = abs(state.offset).coerceAtLeast(itemWidthPx + 1)

                        it.measure(
                            constraints.copy(
                                minWidth = itemWidth.roundToPx(),
                                maxWidth = lerp(min, max, animatedMultiplier).roundToInt()
                            )
                        )
                    }

                    val parallax = ((itemWidth * itemsCount).toPx() - abs(state.offset))
                        .coerceAtLeast(0f)
                        .roundToInt()

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
                    startToEnd = startToEndBehavior,
                    endToStart = endToStartBehavior,
                    itemWidth = itemWidth,
                    count = itemsCountState
                ) then if (isFullBoxSwipe) Modifier else Modifier.systemGestureExclusion()
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
 * @param enabled if item can be clicked
 * @param onClickLabel semantic / accessibility label for the onClick action
 * @param icon item icon
 * @param label item label
 *
 * @see CupertinoSwipeBox
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBoxItem(
    color : Color,
    onClick : () -> Unit,
    modifier: Modifier = Modifier,
    enabled : Boolean = true,
    onClickLabel : String? = null,
    icon : @Composable () -> Unit,
    label : @Composable () -> Unit
) {
    CupertinoSwipeBoxItem(
        color = color,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        onClickLabel = onClickLabel,
        content = {
            Box(
                modifier = Modifier.weight(.6f),
                contentAlignment = BiasAlignment(
                    horizontalBias = 0f,
                    verticalBias = .5f
                )
            ){
                icon()
            }
            Box(
                modifier = Modifier.weight(.4f),
                contentAlignment = Alignment.TopCenter
            ){
                label()
            }
        }
    )
}


/**
 * Item for the [CupertinoSwipeBox]
 *
 * @param color item container color
 * @param onClick item click handler
 * @param modifier item modifier
 * @param enabled if item can be clicked
 * @param onClickLabel semantic / accessibility label for the onClick action
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
    enabled : Boolean = true,
    onClickLabel : String? = null,
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
            },
            animationSpec = state?.animationSpec ?: spring()
        )

        ProvideTextStyle(
            CupertinoTheme.typography.footnote
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color)
                    .clickable(
                        onClick = onClick,
                        enabled = enabled,
                        role = Role.Button,
                        onClickLabel = onClickLabel
                    )
                    .padding(horizontal = 8.dp)
                    .then(modifier),
                contentAlignment = BiasAlignment(
                    verticalBias = 0f,
                    horizontalBias = animHorizBias
                )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    content = content
                )
            }
        }
    }
}



@ExperimentalCupertinoApi
@OptIn(ExperimentalFoundationApi::class)
@Stable
class CupertinoSwipeBoxState(
    initialValue: CupertinoSwipeBoxValue,
    internal val density: Density,
    internal val animationSpec : FiniteAnimationSpec<Float> = CupertinoSwipeBoxDefaults.AnimationSpec,
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
        animationSpec = animationSpec,
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
            density: Density
        ) = Saver<CupertinoSwipeBoxState, CupertinoSwipeBoxValue>(
            save = { it.currentValue },
            restore = {
                CupertinoSwipeBoxState(
                    initialValue = it,
                    animationSpec = animationSpec,
                    dismissThreshold = dismissThreshold,
                    density = density,
                    confirmValueChange = confirmValueChange,
                )
            }
        )
    }
}

@Composable
@ExperimentalCupertinoApi
private fun SwipeHandle(
    modifier: Modifier,
    state: CupertinoSwipeBoxState,
    height : Int
) {
    val density = LocalDensity.current
    Spacer(
        modifier
            .zIndex(1f)
            .height(density.run { height.toDp() })
            .swipeHandle(state)
    )
}

@OptIn(ExperimentalFoundationApi::class)
@ExperimentalCupertinoApi
@Composable
private fun Modifier.swipeHandle(state: CupertinoSwipeBoxState) = anchoredDraggable(
    state = state.anchoredDraggableState,
    orientation = Orientation.Horizontal,
    enabled = state.currentValue != CupertinoSwipeBoxValue.DismissedToStart &&
    state.currentValue != CupertinoSwipeBoxValue.DismissedToEnd,
    reverseDirection = LocalLayoutDirection.current == LayoutDirection.Rtl,
)

@ExperimentalCupertinoApi
private val LocalSwipeBoxState = compositionLocalOf<CupertinoSwipeBoxState?> {
    null
}

@ExperimentalCupertinoApi
private fun Modifier.swipeBoxAnchors(
    state: CupertinoSwipeBoxState,
    startToEnd: SwipeBoxBehavior,
    endToStart: SwipeBoxBehavior,
    itemWidth: Dp,
    count: State<Int>,
) = this then SwipeBoxAnchorsElement(
    state = state,
    startToEnd = startToEnd,
    endToStart = endToStart,
    itemWidth = itemWidth,
    count = count
)

@ExperimentalCupertinoApi
private class SwipeBoxAnchorsElement(
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

@ExperimentalCupertinoApi
private class SwipeBoxAnchorsNode(
    var state: CupertinoSwipeBoxState,
    var startToEnd: SwipeBoxBehavior,
    var endToStart: SwipeBoxBehavior,
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
                if (startToEnd != SwipeBoxBehavior.Disabled) {
                    this[CupertinoSwipeBoxValue.ExpandedToEnd] = itemsWidth
                    this[CupertinoSwipeBoxValue.DismissedToEnd] = width
                }

                if (endToStart != SwipeBoxBehavior.Disabled) {
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

@Immutable
object CupertinoSwipeBoxDefaults {
    val ItemWidth: Dp = 72.dp
    const val DismissThreshold: Float = .7f
    val AnimationSpec = spring<Float>(stiffness = Spring.StiffnessMediumLow)
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
