package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor

import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertinoTween
import kotlinx.coroutines.CancellationException
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encodeToString
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlin.jvm.JvmName



/**
 * Content of the Cupertino modal bottom sheet.
 * */
@Composable
fun CupertinoBottomSheetContent(
    modifier: Modifier = Modifier,
    containerColor: Color = LocalContainerColor.current.takeOrElse {
        CupertinoBottomSheetDefaults.ContainerColor
    },
    contentColor: Color = LocalContentColor.current.takeOrElse {
        CupertinoBottomSheetDefaults.ContentColor
    },
    appBarsAlpha : Float = LocalAppBarsBlurAlpha.current,
    appBarsBlurRadius : Dp = LocalAppBarsBlurRadius.current,
    topBar : @Composable () -> Unit = {},
    bottomBar : @Composable () -> Unit = {},
    content : @Composable (PaddingValues) -> Unit
) {
    CupertinoScaffold(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        appBarsBlurAlpha = appBarsAlpha,
        appBarsBlurRadius = appBarsBlurRadius,
        topBar = {
            Box(
                Modifier.pointerInput(0){}
            ) {
                topBar()
            }
        },
        bottomBar =  bottomBar,
        contentWindowInsets = CupertinoScaffoldDefaults.ContentWindowInsets.union(
            WindowInsets(bottom = CupertinoBottomSheetTokens.MaxOverflow)
        ),
        content = content
    )
}

object CupertinoBottomSheetDefaults {
    val ContentColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.label

    val ContainerColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.secondarySystemGroupedBackground

    val Shape: Shape
        @Composable get() = CupertinoTheme.shapes.large.copy(
            bottomStart = CornerSize(0),
            bottomEnd = CornerSize(0)
        )

    val ShadowElevation: Dp = 4.dp

    @Composable
    fun DragHandle(
        modifier: Modifier = Modifier,
        width: Dp = DragHandleWidth,
        height: Dp = DragHandleHeight,
        shape: Shape = CircleShape,
        color: Color = CupertinoTheme.colorScheme.systemFill
    ) {
        Surface(
            modifier = modifier
                .padding(vertical = DragHandlePadding),
            color = color,
            shape = shape
        ) {
            Spacer(
                modifier = Modifier
                    .size(
                        width = width,
                        height = height
                    )
            )
        }
    }
}

enum class PresentationContentInteraction {
    Scroll, Resize
}

@Serializable
@Stable
@Immutable
sealed interface PresentationDetent {
    fun calculate(density: Density, height: Float): Float

    @Stable
    @Immutable
    @Serializable
    data object Large : PresentationDetent {
        override fun calculate(density: Density, height: Float): Float {
            return height + Float.MIN_VALUE // large always be the biggest
        }
    }

    @Stable
    @Immutable
    @Serializable
    data object Medium : PresentationDetent by Fraction(.5f)

    @Stable
    @Immutable
    @Serializable(with = HeightSerializer::class)
    class Height(
        internal val height : Dp
    ) : PresentationDetent {

        override fun hashCode(): Int {
            return height.hashCode()
        }

        override fun equals(other: Any?): Boolean {
            return height == (other as? Height)?.height
        }

        override fun calculate(density: Density, height: Float): Float {
            return (density.run { this@Height.height.toPx() } * height).coerceAtMost(height)
        }

        override fun toString(): String {
            return "Height(height=$height)"
        }
    }

    @Stable
    @Immutable
    @Serializable
    class Fraction(
        private val fraction: Float
    ) : PresentationDetent {

        init {
            require(fraction in 0f..1f) {
                "fraction must be between 0 and 1"
            }
        }

        override fun hashCode(): Int {
            return fraction.hashCode()
        }

        override fun equals(other: Any?): Boolean {
            return fraction == (other as? Fraction)?.fraction
        }

        override fun toString(): String {
            return "Fraction(fraction=$fraction)"
        }

        override fun calculate(density: Density, height: Float): Float {
            return fraction * height
        }
    }
}

private class HeightSerializer : KSerializer<PresentationDetent.Height> {

    override val descriptor: SerialDescriptor
        get() = Float.serializer().descriptor

    override fun deserialize(decoder: Decoder): PresentationDetent.Height {
        return PresentationDetent.Height(decoder.decodeFloat().dp)
    }

    override fun serialize(encoder: Encoder, value: PresentationDetent.Height) {
        encoder.encodeFloat(value.height.value)
    }

}

@Serializable
sealed interface CupertinoSheetValue {

    /**
     * Sheet is hidden
     * */
    @Serializable
    data object Hidden : CupertinoSheetValue

    /**
     * Sheet is partially expanded with [detent]
     * */
    @Serializable
    class PartiallyExpanded(val detent: PresentationDetent) : CupertinoSheetValue {
        override fun equals(other: Any?): Boolean {
            return detent == (other as? PartiallyExpanded)?.detent
        }

        override fun hashCode(): Int {
            return detent.hashCode()
        }

        override fun toString(): String {
            return "PartiallyExpanded(detent = $detent)"
        }
    }

    /**
     * Sheet is fully expanded with the biggest [PresentationDetent] or with [PresentationStyle.Fullscreen]
     * */
    @Serializable
    data object Expanded : CupertinoSheetValue
}

sealed interface PresentationStyle {
    data object Fullscreen : PresentationStyle

    class Modal(
        val detents: Set<PresentationDetent> = setOf(PresentationDetent.Large),
        val contentInteraction: PresentationContentInteraction = PresentationContentInteraction.Resize,
        val isBackgroundInteractive: (CupertinoSheetValue) -> Boolean = { false },
    ) : PresentationStyle {
        init {
            require(detents.isNotEmpty()){
                "Modal predentation style must have at least one detent"
            }
        }
    }
}

/**
 * State of a sheet composable
 *
 * Contains states relating to it's swipe position as well as animations between state values.
 *
 * @param skipPartiallyExpanded Whether the partially expanded state, if the sheet is large
 * enough, should be skipped. If true, the sheet will always expand to the [Expanded] state and move
 * to the [Hidden] state if available when hiding the sheet, either programmatically or by user
 * interaction.
 * @param initialValue The initial value of the state.
 * @param confirmValueChange Optional callback invoked to confirm or veto a pending state change.
 * expand to the [Expanded] state and move to the [PartiallyExpanded] if available, either
 * programmatically or by user interaction.
 */
@Stable
class CupertinoSheetState(
    initialValue: CupertinoSheetValue = CupertinoSheetValue.Hidden,
    internal val presentationStyle: PresentationStyle = PresentationStyle.Modal(),
    internal val confirmValueChange: (CupertinoSheetValue) -> Boolean = { true },
) {
    init {
        require(
            initialValue is CupertinoSheetValue.Hidden ||
                    initialValue is CupertinoSheetValue.Expanded ||
                    (initialValue is CupertinoSheetValue.PartiallyExpanded &&
                            (presentationStyle is PresentationStyle.Modal &&
                                    presentationStyle.detents.any { it == initialValue.detent }))
        ) {
            "initialValue must be presented in modal decents"
        }
    }

    /**
     * The current value of the state.
     *
     * If no swipe or animation is in progress, this corresponds to the state the bottom sheet is
     * currently in. If a swipe or an animation is in progress, this corresponds the state the sheet
     * was in before the swipe or animation started.
     */

    val currentValue: CupertinoSheetValue get() = swipeableState.currentValue

    /**
     * The target value of the bottom sheet state.
     *
     * If a swipe is in progress, this is the value that the sheet would animate to if the
     * swipe finishes. If an animation is running, this is the target value of that animation.
     * Finally, if no swipe or animation is in progress, this is the same as the [currentValue].
     */
    val targetValue: CupertinoSheetValue get() = swipeableState.targetValue

    /**
     * Whether the modal bottom sheet is visible.
     */
    val isVisible: Boolean
        get() = swipeableState.currentValue !is CupertinoSheetValue.Hidden

    /**
     * Require the current offset (in pixels) of the bottom sheet.
     *
     * The offset will be initialized during the first measurement phase of the provided sheet
     * content.
     *
     * These are the phases:
     * Composition { -> Effects } -> Layout { Measurement -> Placement } -> Drawing
     *
     * During the first composition, an [IllegalStateException] is thrown. In subsequent
     * compositions, the offset will be derived from the anchors of the previous pass. Always prefer
     * accessing the offset from a LaunchedEffect as it will be scheduled to be executed the next
     * frame, after layout.
     *
     * @throws IllegalStateException If the offset has not been initialized yet
     */
    fun requireOffset(): Float = swipeableState.requireOffset()

    /**
     * Whether the modal bottom sheet has a partially expanded state defined.
     */
    internal val hasPartiallyExpandedState: Boolean
        get() = (presentationStyle as? PresentationStyle.Modal)?.detents?.let {
            it.size > 1
        } == true

    /**
     * Fully expand the bottom sheet with animation and suspend until it is fully expanded or
     * animation has been cancelled.
     * *
     * @throws [CancellationException] if the animation is interrupted
     */
    suspend fun expand() {
        swipeableState.animateTo(CupertinoSheetValue.Expanded)
    }

    /**
     * Animate the bottom sheet and suspend until it is partially expanded or animation has been
     * cancelled.
     * @throws [CancellationException] if the animation is interrupted
     * @throws [IllegalStateException] if [skipPartiallyExpanded] is set to true
     */
    suspend fun partialExpand(detent : PresentationDetent) {
        require(presentationStyle is PresentationStyle.Modal){
            "Sheet can be partially expanded only in Modal PresentationStyle"
        }

        require(presentationStyle.detents.any { it == detent }){
            "Detent $detent is not in detents list"
        }
        animateTo(CupertinoSheetValue.PartiallyExpanded(detent))
    }

    /**
     * Expand the bottom sheet with animation and suspend until it is [PartiallyExpanded] if defined
     * else [Expanded].
     * @throws [CancellationException] if the animation is interrupted
     */
    suspend fun show() {
        val targetValue = when (presentationStyle) {
            is PresentationStyle.Fullscreen -> CupertinoSheetValue.Expanded
            is PresentationStyle.Modal -> if (presentationStyle.detents.size == 1)
                CupertinoSheetValue.Expanded
            else swipeableState.anchors.keys.firstOrNull { it is CupertinoSheetValue.PartiallyExpanded }
                ?: CupertinoSheetValue.Expanded
        }
        animateTo(targetValue)
    }

    /**
     * Hide the bottom sheet with animation and suspend until it is fully hidden or animation has
     * been cancelled.
     * @throws [CancellationException] if the animation is interrupted
     */
    suspend fun hide() {
        animateTo(CupertinoSheetValue.Hidden)
    }

    /**
     * Animate to a [targetValue].
     * If the [targetValue] is not in the set of anchors, the [currentValue] will be updated to the
     * [targetValue] without updating the offset.
     *
     * @throws CancellationException if the interaction interrupted by another interaction like a
     * gesture interaction or another programmatic interaction like a [animateTo] or [snapTo] call.
     *
     * @param targetValue The target value of the animation
     */
    internal suspend fun animateTo(
        targetValue: CupertinoSheetValue,
        velocity: Float = swipeableState.lastVelocity
    ) {
        swipeableState.animateTo(targetValue, velocity)
    }

    /**
     * Snap to a [targetValue] without any animation.
     *
     * @throws CancellationException if the interaction interrupted by another interaction like a
     * gesture interaction or another programmatic interaction like a [animateTo] or [snapTo] call.
     *
     * @param targetValue The target value of the animation
     */
    internal suspend fun snapTo(targetValue: CupertinoSheetValue) {
        swipeableState.snapTo(targetValue)
    }

    /**
     * Attempt to snap synchronously. Snapping can happen synchronously when there is no other swipe
     * transaction like a drag or an animation is progress. If there is another interaction in
     * progress, the suspending [snapTo] overload needs to be used.
     *
     * @return true if the synchronous snap was successful, or false if we couldn't snap synchronous
     */
    internal fun trySnapTo(targetValue: CupertinoSheetValue) = swipeableState.trySnapTo(targetValue)

    /**
     * Find the closest anchor taking into account the velocity and settle at it with an animation.
     */
    internal suspend fun settle(velocity: Float) {
        swipeableState.settle(velocity)
    }

    internal var swipeableState = SwipeableV2State(
        initialValue = initialValue,
        animationSpec = cupertinoTween(),
        confirmValueChange = confirmValueChange,
        positionalThreshold = { .5f * it }
    )

    internal val offset: Float? get() = swipeableState.offset

    companion object {
        /**
         * The default [Saver] implementation for [CupertinoSheetState].
         */
        fun Saver(
            presentationStyle: PresentationStyle = PresentationStyle.Modal(),
            confirmValueChange: (CupertinoSheetValue) -> Boolean,
        ) = Saver<CupertinoSheetState, String>(
            save = { Json.encodeToString(it.swipeableState.currentValue) },
            restore = { savedValue ->
                CupertinoSheetState(
                    presentationStyle = presentationStyle,
                    initialValue = Json.decodeFromString(savedValue),
                    confirmValueChange = confirmValueChange,
                )
            }
        )
    }
}
@Composable
fun rememberCupertinoSheetState(
    confirmValueChange: (CupertinoSheetValue) -> Boolean = { true },
    presentationStyle: PresentationStyle = PresentationStyle.Modal(),
    isBackgroundInteractive: Boolean = true,
    initialValue: CupertinoSheetValue = CupertinoSheetValue.Hidden,
): CupertinoSheetState {
    return rememberSaveable(
        confirmValueChange, initialValue,
        saver = CupertinoSheetState.Saver(
            presentationStyle = presentationStyle,
            confirmValueChange = confirmValueChange
        )
    ) {
        CupertinoSheetState(
            initialValue = initialValue,
            confirmValueChange = confirmValueChange,
            presentationStyle = presentationStyle
        )
    }
}

internal fun ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
    sheetState: CupertinoSheetState,
    orientation: Orientation,
    onFling: (velocity: Float) -> Unit
): NestedScrollConnection = object : NestedScrollConnection {

    private val enabled : Boolean
        get() = sheetState.presentationStyle.let {
            it is PresentationStyle.Modal && it.contentInteraction == PresentationContentInteraction.Resize
        }

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
        if (!enabled)
            return Offset.Zero
        val delta = available.toFloat()
        return if (delta < 0 && source == NestedScrollSource.Drag) {
            sheetState.swipeableState.dispatchRawDelta(delta).toOffset()
        } else {
            Offset.Zero
        }
    }

    override fun onPostScroll(
        consumed: Offset,
        available: Offset,
        source: NestedScrollSource
    ): Offset {
        if (!enabled)
            return Offset.Zero

        return if (source == NestedScrollSource.Drag) {
            sheetState.swipeableState.dispatchRawDelta(available.toFloat()).toOffset()
        } else {
            Offset.Zero
        }
    }

    override suspend fun onPreFling(available: Velocity): Velocity {

        if (!enabled)
            return Velocity.Zero

        val toFling = available.toFloat()
        val currentOffset = sheetState.requireOffset()
        return if (toFling < 0 && currentOffset > sheetState.swipeableState.minOffset) {
            onFling(toFling)
            // since we go to the anchor with tween settling, consume all for the best UX
            available
        } else {
            Velocity.Zero
        }
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        if (!enabled)
            return Velocity.Zero

        onFling(available.toFloat())
        return available
    }

    private fun Float.toOffset(): Offset = Offset(
        x = if (orientation == Orientation.Horizontal) this else 0f,
        y = if (orientation == Orientation.Vertical) this else 0f
    )

    @JvmName("velocityToFloat")
    private fun Velocity.toFloat() = if (orientation == Orientation.Horizontal) x else y

    @JvmName("offsetToFloat")
    private fun Offset.toFloat(): Float = if (orientation == Orientation.Horizontal) x else y
}

internal val CupertinoSheetState.isBackgroundInteractive: Boolean
    get() = targetValue == CupertinoSheetValue.Hidden ||
            (presentationStyle is PresentationStyle.Modal &&
                    presentationStyle.isBackgroundInteractive(targetValue))

internal object CupertinoBottomSheetTokens {
    internal val MaxOverflow = 5.dp
}

internal val DragHandleHeight = 5.dp
internal val DragHandleWidth = 38.dp
internal val DragHandlePadding = 4.dp