
package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.collapse
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.dismiss
import androidx.compose.ui.semantics.expand
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertinoTween
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.launch
import kotlin.jvm.JvmName

/**
 * State of the [CupertinoBottomSheetScaffold]
 *
 * @param initialValue initial position of the scaffold sheet
 * @param partialExpandFraction From 0f to 1f. Portion of the sheet height that is available
 * in partially expanded state
 * @param skipPartiallyExpanded disable [CupertinoSheetValue.PartiallyExpanded] sheet state
 * @param collapseOnClickOutside collapse sheet when user clicked outside the sheet.
 * Works only in [CupertinoSheetValue.PartiallyExpanded]
 * @param disableOutsideInteractions disable interactions outside the sheet until is fully collapsed
 *
 * - [collapseOnClickOutside] and [disableOutsideInteractions] parameters both disable interactions
 * outside the sheet and make scrim color be applied in partially expanded state
 * */
@Composable
fun rememberCupertinoBottomSheetScaffoldState(
    initialValue: CupertinoSheetValue = CupertinoSheetValue.Collapsed,
    confirmValueChange: (CupertinoSheetValue) -> Boolean = { true },
    partialExpandFraction: Float = .5f,
    skipPartiallyExpanded: Boolean = false,
    collapseOnClickOutside : Boolean = false,
    disableOutsideInteractions : Boolean = false,
) = rememberSaveable(
    saver = CupertinoBottomSheetScaffoldState.Saver(
        skipPartiallyExpanded = skipPartiallyExpanded,
        partialExpandFraction = partialExpandFraction,
        collapseOnClickOutside = collapseOnClickOutside,
        disableOutsideInteractions = disableOutsideInteractions,
        confirmValueChange = confirmValueChange
    )
) {
    CupertinoBottomSheetScaffoldState(
        initialValue = initialValue,
        skipPartiallyExpanded = skipPartiallyExpanded,
        partialExpandFraction = partialExpandFraction,
        collapseOnClickOutside = collapseOnClickOutside,
        disableOutsideInteractions = disableOutsideInteractions,
        confirmValueChange = confirmValueChange
    )
}

@Composable
fun CupertinoBottomSheetScaffold(
    sheetContent: @Composable() (PaddingValues) -> Unit,
    modifier: Modifier = Modifier,
    scaffoldState: CupertinoBottomSheetScaffoldState = rememberCupertinoBottomSheetScaffoldState(),
    colors: CupertinoBottomSheetScaffoldColors = CupertinoBottomSheetScaffoldDefaults.colors(),
    sheetShape: Shape = CupertinoBottomSheetScaffoldDefaults.sheetShape,
    sheetShadowElevation: Dp = CupertinoBottomSheetScaffoldDefaults.sheetShadowElevation,
    sheetDragHandle: @Composable() (() -> Unit)? = { CupertinoBottomSheetScaffoldDefaults.DragHandle() },
    sheetSwipeEnabled: Boolean = true,
    topBar: @Composable() (() -> Unit)? = null,
    sheetTopBar: @Composable() (() -> Unit)? = null,
    bottomBar: @Composable() (() -> Unit)? = null,
    snackbarHost: @Composable () -> Unit = { },
    appBarsAlpha : Float = CupertinoScaffoldDefaults.AppBarsAlpha,
    appBarsBlurRadius : Dp = CupertinoScaffoldDefaults.AppBarsBlurRadius,
    content: @Composable (PaddingValues) -> Unit
) {

    val density = LocalDensity.current


    BoxWithConstraints {

        val statusBars = WindowInsets.statusBars

        val height = constraints.maxHeight.toFloat()

        val topPadding = remember(statusBars, density) {
            density.run {
                maxOf(statusBars.getTop(this) + 10.dp.toPx(), 54.dp.toPx())
            }
        }

        val sheetHeight = height - topPadding

        val actualProgress by remember {
            derivedStateOf {
                if (scaffoldState.swipeableState.targetValue == CupertinoSheetValue.Collapsed &&
                    scaffoldState.swipeableState.currentValue == CupertinoSheetValue.Collapsed
                ) 0f
                else
                    1f - scaffoldState.swipeableState.offset.value / sheetHeight
            }
        }

        val coroutineScope = rememberCoroutineScope()

        var scaffoldSize by remember {
            mutableStateOf(DpSize.Zero)
        }

        val partialFraction = scaffoldState.partialExpandFraction.coerceIn(0f, 1f)

        Box {
            CupertinoScaffold(
                modifier = modifier
                    .onSizeChanged {
                        density.run {
                            scaffoldSize = it.toSize().toDpSize()
                        }
                    }
                    .background(colors.scaledScaffoldBackgroundColor)
                    .graphicsLayer {

                        val (sub, div) = if (scaffoldState.skipPartiallyExpanded)
                            0f to SCALE_MULTIPLIER else
                            partialFraction to SCALE_MULTIPLIER * (1f - partialFraction)

                        val p = actualProgress.coerceIn(0f, 1f)

                        if (p > sub) {
                            scaleX = 1 - (p - sub) / div
                            scaleY = scaleX
                            translationY = (1f - scaleX) * topPadding * 2.25f
                            if (p > 0) {
                                shape = sheetShape
                                clip = true
                            }
                        }
                    }
                    .drawWithContent {
                        drawContent()

                        val alpha = if (scaffoldState.skipPartiallyExpanded ||
                            scaffoldState.disableOutsideInteractions ||
                            scaffoldState.collapseOnClickOutside
                        ) actualProgress.coerceIn(0f, 1f)
                        else ((actualProgress - partialFraction) / partialFraction).coerceIn(0f, 1f)

                        drawRect(
                            color = colors.scrimColor,
                            alpha = alpha
                        )
                    },
                appBarsAlpha = appBarsAlpha,
                appBarsBlurRadius = appBarsBlurRadius,
                topBar = { topBar?.invoke() },
                bottomBar = { bottomBar?.invoke() },
                containerColor = colors.containerColor,
                contentColor = colors.contentColor,
                snackbarHost = snackbarHost,
                content = content
            )

            val sheetValue = scaffoldState.swipeableState.currentValue
            val sheetTarget = scaffoldState.swipeableState.currentValue

            if ((scaffoldState.disableOutsideInteractions || scaffoldState.collapseOnClickOutside) &&
                (sheetValue != CupertinoSheetValue.Collapsed ||
                sheetTarget != CupertinoSheetValue.Collapsed)
            ) {

                Spacer(
                    modifier = Modifier
                        .size(scaffoldSize)
                        .pointerInput(sheetValue, scaffoldState) {
                            if (scaffoldState.collapseOnClickOutside &&
                                sheetValue == CupertinoSheetValue.PartiallyExpanded
                            ) {
                                detectTapGestures {
                                    coroutineScope.launch {
                                        scaffoldState.collapse()
                                    }
                                }
                            }
                        }
                )
            }
        }

        val anchors = remember(height) {
            buildMap {
                put(sheetHeight, CupertinoSheetValue.Collapsed)
                if (!scaffoldState.skipPartiallyExpanded) {
                    put((1f - partialFraction) * sheetHeight, CupertinoSheetValue.PartiallyExpanded)
                }
                put(0f, CupertinoSheetValue.Expanded)
            }
        }

        val sheetHeightDp = remember(density, sheetHeight) {
            density.run { sheetHeight.toDp() }
        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(sheetHeightDp + MaxSheetOverflow)
                .align(Alignment.BottomCenter)
                .offset {
                    val offset = scaffoldState.swipeableState.offset.value

                    val overflow = offset.coerceAtMost(0f)

                    val y = (offset.coerceAtLeast(0f) +
                            (overflow/SheetOverflowRubberBandFraction).coerceAtLeast(-MaxSheetOverflow.toPx()))
                        .toInt()


                    IntOffset(0, y + MaxSheetOverflow.roundToPx())
                }
                .nestedScroll(
                    remember(scaffoldState.swipeableState) {
                        ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
                            swipeableState = scaffoldState.swipeableState,
                            orientation = Orientation.Vertical,
                            onFling = {
                                scaffoldState.swipeableState.performFling(it)
                            }
                        )
                    }
                )
                .swipeable(
                    state = scaffoldState.swipeableState,
                    anchors = anchors,
                    thresholds = { _, _ ->
                        FractionalThreshold(
                            fraction = .5f
                        )
                    },
                    orientation = Orientation.Vertical,
                    enabled = sheetSwipeEnabled,
//                    resistance = ResistanceConfig(
//                        basis = sheetHeight,
//                        factorAtMin = SwipeableDefaults.StiffResistanceFactor,
//                        factorAtMax = SwipeableDefaults.StandardResistanceFactor
//                    )
                ),
            shape = sheetShape,
            shadowElevation = sheetShadowElevation,
            color = colors.sheetContainerColor,
            contentColor = colors.sheetContentColor,
            content = {
                CompositionLocalProvider(
                    LocalTopAppBarInsets provides { TopAppBarInsets }
                ) {
                    CupertinoScaffold(
                        appBarsAlpha = appBarsAlpha,
                        appBarsBlurRadius = appBarsBlurRadius,
                        containerColor = colors.sheetContainerColor,
                        contentColor = colors.sheetContentColor,
                        topBar = { sheetTopBar?.invoke() },
                        contentWindowInsets = CupertinoScaffoldDefaults.contentWindowInsets.union(
                            WindowInsets(bottom = MaxSheetOverflow)
                        ),
                        content = sheetContent
                    )
                }
                if (sheetDragHandle != null) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .semantics(mergeDescendants = true) {
                                with(scaffoldState) {
                                    dismiss("Dismiss") {
                                        if (confirmValueChange(CupertinoSheetValue.Collapsed)) {
                                            coroutineScope.launch {
                                                collapse()
                                            }
                                        }
                                        true
                                    }
                                    if (currentValue == CupertinoSheetValue.PartiallyExpanded) {
                                        expand("Expand") {
                                            if (confirmValueChange(CupertinoSheetValue.Expanded)) {
                                                coroutineScope.launch { expand() }
                                            }
                                            true
                                        }
                                    } else if (!skipPartiallyExpanded) {
                                        collapse("Collapse") {
                                            if (
                                                confirmValueChange(
                                                    CupertinoSheetValue.PartiallyExpanded
                                                )
                                            ) {
                                                coroutineScope.launch { partialExpand() }
                                            }
                                            true
                                        }
                                    }
                                }
                            },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        sheetDragHandle()
                    }
                }
            }
        )
    }
}

enum class CupertinoSheetValue {
    Expanded, PartiallyExpanded, Collapsed
}


class CupertinoBottomSheetScaffoldState(
    initialValue : CupertinoSheetValue,
    val skipPartiallyExpanded : Boolean,
    val partialExpandFraction : Float,
    val collapseOnClickOutside : Boolean,
    val disableOutsideInteractions : Boolean,
    val confirmValueChange : (CupertinoSheetValue) -> Boolean,
) {
    internal val swipeableState = SwipeableState(
        initialValue = initialValue,
        animationSpec = cupertinoTween()
    )

    suspend fun expand() {
        swipeableState.animateTo(CupertinoSheetValue.Expanded)
    }

    val currentValue  : CupertinoSheetValue
        get() = swipeableState.currentValue


    val targetValue : CupertinoSheetValue
        get() = swipeableState.targetValue

    /**
     * Animate the bottom sheet and suspend until it is partially expanded or animation has been
     * cancelled.
     * @throws [CancellationException] if the animation is interrupted
     * @throws [IllegalStateException] if [skipPartiallyExpanded] is set to true
     */
    suspend fun partialExpand() {
        check(!skipPartiallyExpanded) {
            "Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set" +
                    " skipPartiallyExpanded to false to use this function."
        }
        swipeableState.animateTo(CupertinoSheetValue.PartiallyExpanded)
    }

    suspend fun collapse(){
        swipeableState.animateTo(CupertinoSheetValue.Collapsed)
    }

    companion object {
        fun Saver(
            skipPartiallyExpanded : Boolean,
            partialExpandFraction : Float,
            collapseOnClickOutside : Boolean,
            disableOutsideInteractions : Boolean,
            confirmValueChange: (CupertinoSheetValue) -> Boolean
        ) : Saver<CupertinoBottomSheetScaffoldState, *> = Saver(
            save = {
                it.swipeableState.currentValue
            },
            restore = {
                CupertinoBottomSheetScaffoldState(
                    initialValue = it,
                    skipPartiallyExpanded = skipPartiallyExpanded,
                    partialExpandFraction = partialExpandFraction,
                    collapseOnClickOutside = collapseOnClickOutside,
                    disableOutsideInteractions = disableOutsideInteractions,
                    confirmValueChange = confirmValueChange
                )
            }
        )
    }
}

@Immutable
class CupertinoBottomSheetScaffoldColors internal constructor(
    internal val sheetContainerColor: Color,
    internal val sheetContentColor: Color,
    internal val containerColor: Color,
    internal val contentColor: Color,
    internal val scrimColor : Color,
    internal val scaledScaffoldBackgroundColor : Color
)

object CupertinoBottomSheetScaffoldDefaults {

    val sheetShape: Shape
        @Composable get() = CupertinoTheme.shapes.large.copy(
            bottomStart = CornerSize(0),
            bottomEnd = CornerSize(0)
        )

    val sheetShadowElevation: Dp = 4.dp

    @Composable
    fun DragHandle(
        modifier: Modifier = Modifier,
        width: Dp = DragHandleWidth,
        height: Dp = DragHandleHeight,
        shape: Shape = CircleShape,
        color: Color = CupertinoTheme.colorScheme.opaqueSeparator
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

    @Composable
    fun colors(
        sheetContainerColor: Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
        sheetContentColor: Color = CupertinoTheme.colorScheme.label,
        containerColor: Color = CupertinoTheme.colorScheme.systemBackground,
        contentColor: Color = CupertinoTheme.colorScheme.label,
        scrimColor : Color = CupertinoTheme.colorScheme.separator,
        scaledScaffoldBackgroundColor : Color = Color.Black
    ) : CupertinoBottomSheetScaffoldColors = CupertinoBottomSheetScaffoldColors(
        sheetContainerColor = sheetContainerColor,
        sheetContentColor = sheetContentColor,
        containerColor = containerColor,
        contentColor = contentColor,
        scrimColor = scrimColor,
        scaledScaffoldBackgroundColor = scaledScaffoldBackgroundColor
    )
}



internal fun ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
    swipeableState: SwipeableState<*>,
    orientation: Orientation,
    onFling: suspend (velocity: Float) -> Unit
): NestedScrollConnection = object : NestedScrollConnection {

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
        val delta = available.toFloat()
        println("[PRESCROLL] delta $delta, source $source")
        return if (delta < 0 && source == NestedScrollSource.Drag) {
            swipeableState.performDrag(delta).toOffset()
        } else {
            Offset.Zero
        }
    }

    override fun onPostScroll(
        consumed: Offset,
        available: Offset,
        source: NestedScrollSource
    ): Offset {
        println("[POSTSCROLL] available ${available.toFloat()},consumed ${consumed.toFloat()} source $source")

        return if (source == NestedScrollSource.Drag) {
            swipeableState.performDrag(available.toFloat()).toOffset()
        } else {
            Offset.Zero
        }
    }

    override suspend fun onPreFling(available: Velocity): Velocity {
        val toFling = available.toFloat()
        val currentOffset = swipeableState.offset.value

        println("[PREFLING] available $toFling")

        return if (toFling < 0 && currentOffset > swipeableState.minBound) {
            onFling(toFling)
            // since we go to the anchor with tween settling, consume all for the best UX
            available
        } else {
            Velocity.Zero
        }
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        onFling(available.toFloat())
        println("[POSTFLING] available ${available.toFloat()}")

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

private val DragHandleHeight = 5.dp
private val DragHandleWidth = 38.dp
private val DragHandlePadding = 4.dp
private val TopAppBarInsets = WindowInsets(
    left = 0.dp,
    top = DragHandleHeight,
    right = 0.dp,
    bottom = DragHandleHeight
)

private const val SCALE_MULTIPLIER = 11f
private val MaxSheetOverflow = 5.dp
private val SheetOverflowRubberBandFraction = 2f