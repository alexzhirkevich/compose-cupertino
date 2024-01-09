
package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.collapse
import androidx.compose.ui.semantics.expand
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.Black
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.coroutines.launch
import kotlin.math.max
import kotlin.math.roundToInt

@Composable
fun CupertinoBottomSheet(
    sheetState: CupertinoSheetState,
    sheetContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    windowInsets: WindowInsets = CupertinoScaffoldDefaults.ContentWindowInsets,
//    colors: CupertinoBottomSheetScaffoldColors = CupertinoBottomSheetScaffoldDefaults.colors(),
    contentColor: Color = LocalContentColor.current,
    containerColor: Color = LocalContainerColor.current,
    scrimColor: Color = CupertinoIndication.DefaultColor,
    shape: Shape = CupertinoBottomSheetDefaults.Shape,
    shadowElevation: Dp = CupertinoBottomSheetDefaults.ShadowElevation,
    dragHandle: @Composable (() -> Unit)? = if (sheetState.hasPartiallyExpandedState)
        null else {{ CupertinoBottomSheetDefaults.DragHandle() }},
    swipeEnabled: Boolean = true,
    content: @Composable () -> Unit
) {

    val coroutineScope = rememberCoroutineScope()

    val density = LocalDensity.current

    val topPadding by remember {
        derivedStateOf {
            if (sheetState.presentationStyle is PresentationStyle.Fullscreen) {
                0.dp
            } else {
                density.run {
                    maxOf(
                        windowInsets.getTop(this) + ScaffoldTopPadding.toPx(),
                        BottomSheetMinTopPadding.toPx()
                    ).toDp()
                }
            }
        }
    }

    val animatedAlpha by animateFloatAsState(
        if (sheetState.isBackgroundInteractive) 0f else 1f
    )

    val lastPartialExpand = remember(sheetState.swipeableState.anchors) {
        sheetState.swipeableState.anchors.entries.lastOrNull {
            it.key is CupertinoSheetValue.PartiallyExpanded
        }
    }
    Box(
        Modifier
            .fillMaxSize()

    ) {
        BoxWithConstraints(
            modifier = Modifier
                .background(Color.Black)
                .graphicsLayer {

                    fun actualProgress() : Float {
                        return if (sheetState.targetValue is CupertinoSheetValue.Hidden &&
                            sheetState.currentValue == CupertinoSheetValue.Hidden
                        ) 0f
                        else (1f - (sheetState.swipeableState.offset ?: 0f) / size.height).coerceIn(0f,1f)
                    }

                    if (sheetState.presentationStyle is PresentationStyle.Modal &&
                        size.width <= BottomSheetMaxWidth.toPx()) {

                        val (sub, div) = if (!sheetState.hasPartiallyExpandedState)
                            0f to ScaleMultiplier
                        else {
                            val sub = (lastPartialExpand?.value?.div(size.height))?.coerceIn(0f, 1f) ?: 0f

                            1f - sub to ScaleMultiplier * sub
                        }
                        val p = actualProgress()

                        if (p > sub) {
                            scaleX = 1 - (p - sub) / div
                            scaleY = scaleX
                            translationY = (1f - scaleX) * topPadding.toPx() * TranslationMultiplier
                            if (p > 0) {
                                this.shape = shape
                                clip = true
                            }
                        }
                    }
                }
                .drawWithContent {
                    drawContent()
                    drawRect(
                        color = scrimColor,
                        alpha = animatedAlpha,
                    )
                }.then(modifier),
        ) {
            content()

            val size = density.run {
                Size(constraints.maxWidth.toFloat(), constraints.maxHeight.toFloat())
                    .toDpSize()
            }
            if (!sheetState.isBackgroundInteractive) {
                Spacer(
                    modifier = Modifier
                        .size(size)
                        .pointerInput(sheetState) {
                            if ((sheetState.presentationStyle as? PresentationStyle.Modal)
                                    ?.dismissOnClickOutside == true
                            ) {
                                detectTapGestures {
                                    if (sheetState.confirmValueChange(CupertinoSheetValue.Hidden)) {
                                        coroutineScope.launch {
                                            sheetState.hide()
                                        }
                                    }
                                }
                            }
                        }
                )
            }
        }

        BoxWithConstraints(
            Modifier
                .padding(top = topPadding)
                .layout {m, constraints ->
                    val layoutWidth = constraints.maxWidth
                    val height = constraints.maxHeight
                    val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

                    val sheetPlaceable = m.measure(looseConstraints)
                    val sheetOffsetY = sheetState.offset?.roundToInt() ?: Int.MAX_VALUE
                    val sheetOffsetX = max(0, (layoutWidth - sheetPlaceable.width) / 2)
                    layout(layoutWidth, height) {
                        sheetPlaceable.placeRelative(sheetOffsetX, sheetOffsetY)
                    }
                }
        ){
            StandardBottomSheet(
                state = sheetState,
                peekHeight = 0.dp,
                sheetSwipeEnabled = swipeEnabled,
                layoutHeight = constraints.maxHeight.toFloat(),
                shape = shape,
                containerColor = containerColor,
                contentColor = contentColor,
                shadowElevation = shadowElevation,
                dragHandle = dragHandle,
                content = sheetContent
            )
        }
    }
}

/**
 * Standard bottom sheets co-exist with the screen’s main UI region and allow for simultaneously
 * viewing and interacting with both regions. They are commonly used to keep a feature or
 * secondary content visible on screen when content in main UI region is frequently scrolled or
 * panned.
 *
 * This component provides API to put together several components to construct your
 * screen, by ensuring proper layout strategy for them and collecting necessary data so these
 * components will work together correctly.
 *
 * @param sheetContent the content of the bottom sheet
 * @param modifier the [Modifier] to be applied to this scaffold
 * @param scaffoldState the state of the bottom sheet scaffold
 * @param colors color of the scaffold, sheet, scrim and background.
 * @param sheetShape the shape of the bottom sheet children
 * @param sheetShadowElevation the shadow elevation of the bottom sheet
 * @param sheetDragHandle optional visual marker to pull the scaffold's bottom sheet
 * @param sheetSwipeEnabled whether the sheet swiping is enabled and should react to the user's
 * input
 * @param topBar top app bar of the screen, typically a [CupertinoTopAppBar]
 * to have no color.
 * @param content content of the screen. The lambda receives a [PaddingValues] that should be
 * applied to the content root via [Modifier.padding] and [Modifier.consumeWindowInsets] to
 * properly offset top and bottom bars. If using [Modifier.verticalScroll], apply this modifier to
 * the child of the scroll, and not on the scroll itself.
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoBottomSheetScaffold(
    sheetContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    windowInsets: WindowInsets = CupertinoScaffoldDefaults.ContentWindowInsets,
    scaffoldState: CupertinoBottomSheetScaffoldState = rememberCupertinoBottomSheetScaffoldState(),
    colors: CupertinoBottomSheetScaffoldColors = CupertinoBottomSheetScaffoldDefaults.colors(),
    sheetShape: Shape = CupertinoBottomSheetDefaults.Shape,
    sheetShadowElevation: Dp = CupertinoBottomSheetDefaults.ShadowElevation,
    sheetDragHandle: @Composable (() -> Unit)? = if (scaffoldState.bottomSheetState.hasPartiallyExpandedState)
        null else {{ CupertinoBottomSheetDefaults.DragHandle() }},
    sheetSwipeEnabled: Boolean = true,
    topBar: @Composable (() -> Unit)? = null,
    bottomBar: @Composable (() -> Unit)? = null,
    appBarsBlurAlpha : Float = CupertinoScaffoldDefaults.AppBarsBlurAlpha,
    appBarsBlurRadius : Dp = CupertinoScaffoldDefaults.AppBarsBlurRadius,
    content: @Composable (PaddingValues) -> Unit
) {
    CupertinoBottomSheet(
        sheetState = scaffoldState.bottomSheetState,
        sheetContent = {
            CompositionLocalProvider(
                LocalTopAppBarInsets provides
                        when {
                            scaffoldState.bottomSheetState.presentationStyle is PresentationStyle.Modal -> {
                                CupertinoTopAppBarDefaults.windowInsets.only(WindowInsetsSides.Start + WindowInsetsSides.Start)
                                    .union(SheetTopAppBarInsets)
                            }

                            sheetDragHandle != null -> {
                                CupertinoTopAppBarDefaults.windowInsets.add(SheetTopAppBarInsets)
                            }

                            else -> {
                                CupertinoTopAppBarDefaults.windowInsets
                            }
                        },
                LocalContainerColor provides colors.sheetContainerColor,
                LocalContentColor provides colors.sheetContentColor,
                LocalAppBarsBlurAlpha provides appBarsBlurAlpha,
                LocalAppBarsBlurRadius provides appBarsBlurRadius,
            ){
                sheetContent()
            }
        },
        modifier = modifier,
        windowInsets = windowInsets,
        contentColor = colors.contentColor,
        containerColor = colors.containerColor,
        scrimColor = colors.scrimColor,
        shape = sheetShape,
        shadowElevation = sheetShadowElevation,
        dragHandle = sheetDragHandle,
        swipeEnabled = sheetSwipeEnabled,
        content = {
            CupertinoScaffold(
                modifier = modifier,
                topBar = { topBar?.invoke() },
                bottomBar = { bottomBar?.invoke() },
                content = content,
                containerColor = colors.containerColor,
                contentColor = colors.contentColor,
                contentWindowInsets = windowInsets,
                appBarsBlurAlpha = appBarsBlurAlpha,
                appBarsBlurRadius = appBarsBlurRadius
            )
        }
    )
}

/**
 * State of the [CupertinoBottomSheetScaffold] composable.
 *
 * @param bottomSheetState the state of the persistent bottom sheet
 */

@Stable
class CupertinoBottomSheetScaffoldState(
    val bottomSheetState: CupertinoSheetState,
)

/**
 * Create and [remember] a [CupertinoBottomSheetScaffoldState].
 *
 * @param bottomSheetState the state of the standard bottom sheet. See
 * [rememberCupertinoSheetState]
 */
@Composable
fun rememberCupertinoBottomSheetScaffoldState(
    bottomSheetState: CupertinoSheetState = rememberCupertinoSheetState(),
): CupertinoBottomSheetScaffoldState {
    return remember(bottomSheetState) {
        CupertinoBottomSheetScaffoldState(
            bottomSheetState = bottomSheetState,
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
//    internal val scaledScaffoldBackgroundColor : Color
)

@Immutable
object CupertinoBottomSheetScaffoldDefaults {

    @Composable
    fun colors(
        sheetContainerColor: Color = CupertinoBottomSheetDefaults.ContainerColor,
        sheetContentColor: Color = CupertinoBottomSheetDefaults.ContentColor,
        containerColor: Color = CupertinoTheme.colorScheme.systemBackground,
        contentColor: Color = CupertinoTheme.colorScheme.label,
        scrimColor : Color = CupertinoIndication.DefaultColor,
//        scaledScaffoldBackgroundColor : Color = CupertinoColors.Black
    ) : CupertinoBottomSheetScaffoldColors = CupertinoBottomSheetScaffoldColors(
        sheetContainerColor = sheetContainerColor,
        sheetContentColor = sheetContentColor,
        containerColor = containerColor,
        contentColor = contentColor,
        scrimColor = scrimColor,
//        scaledScaffoldBackgroundColor = scaledScaffoldBackgroundColor
    )
}



@Composable
private fun StandardBottomSheet(
    modifier: Modifier = Modifier,
    state: CupertinoSheetState,
    peekHeight: Dp,
    sheetSwipeEnabled: Boolean,
    layoutHeight: Float,
    shape: Shape,
    containerColor: Color,
    contentColor: Color,
    shadowElevation: Dp,
    dragHandle: @Composable (() -> Unit)?,
    content: @Composable (() -> Unit)
) {
    val scope = rememberCoroutineScope()
    val peekHeightPx = with(LocalDensity.current) { peekHeight.toPx() }
    val orientation = Orientation.Vertical
    val density = LocalDensity.current

    // Callback that is invoked when the anchors have changed.
    val anchorChangeHandler = remember(state, scope) {
        BottomSheetScaffoldAnchorChangeHandler(
            state = state,
            animateTo = { target, velocity ->
                scope.launch {
                    state.swipeableState.animateTo(
                        target, velocity = velocity
                    )
                }
            },
            snapTo = { target ->
                scope.launch { state.swipeableState.snapTo(target) }
            }
        )
    }

    val sortedAnchors = remember(state.presentationStyle, density, layoutHeight) {
        (state.presentationStyle as? PresentationStyle.Modal)?.detents?.sortedBy {
            it.calculate(density, layoutHeight)
        }.orEmpty().also {
            state.expandedDetent = it.lastOrNull()
        }
    }

    Surface(
        modifier = modifier
            .widthIn(max = BottomSheetMaxWidth)
            .fillMaxWidth()
            .requiredHeightIn(min = peekHeight)
            .nestedScroll(
                remember(state.swipeableState) {
                    ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
                        sheetState = state,
                        orientation = orientation,
                        onFling = { scope.launch { state.settle(it) } }
                    )
                }
            )
            .swipeableV2(
                state = state.swipeableState,
                orientation = orientation,
                enabled = sheetSwipeEnabled
            )
            .swipeAnchors(
                state.swipeableState,
                possibleValues = buildSet(2) {
                    add(CupertinoSheetValue.Hidden)
                    if (state.presentationStyle is PresentationStyle.Modal) {
                        addAll(
                            sortedAnchors.dropLast(1).map {
                                CupertinoSheetValue.PartiallyExpanded(it)
                            }
                        )
                    }
                    add(CupertinoSheetValue.Expanded)
                },
                anchorChangeHandler = anchorChangeHandler
            ) { value, sheetSize ->
                when (value) {
                    is CupertinoSheetValue.PartiallyExpanded -> if (!state.hasPartiallyExpandedState)
                        null
                    else sheetSize.height - value.detent.calculate(density, layoutHeight)

                    is CupertinoSheetValue.Expanded -> if (sheetSize.height == peekHeightPx.roundToInt()) {
                        null
                    } else {
                        max(0f, layoutHeight - sheetSize.height)
                    }

                    is CupertinoSheetValue.Hidden -> layoutHeight

                    else -> null
                }
            },
        shape = shape,
        color = containerColor,
        contentColor = contentColor,
        shadowElevation = shadowElevation,
    ) {
        Box(
            Modifier.fillMaxWidth()
        ) {
            content()
            if (dragHandle != null) {
                Box(Modifier
                    .align(Alignment.TopCenter)
                    .let {
                        if (state.presentationStyle == PresentationStyle.Fullscreen)
                            it.windowInsetsPadding(CupertinoTopAppBarDefaults.windowInsets)
                        else it
                    }
                    .semantics(mergeDescendants = true) {
                        with(state) {
                            if (swipeableState.anchors.size > 1 && sheetSwipeEnabled) {
                                if (currentValue !is CupertinoSheetValue.Expanded) {

                                    val states = state.swipeableState.anchors.keys
                                    val currentIdx = states.indexOf(currentValue)

                                    val next = if (currentIdx == states.size - 1)
                                        CupertinoSheetValue.Expanded
                                    else states.toList()[currentIdx + 1]

                                    if (swipeableState.confirmValueChange(next)) {
                                        expand("Expand") {
                                            scope.launch {
                                                if (next is CupertinoSheetValue.Expanded)
                                                    expand()
                                                if (next is CupertinoSheetValue.PartiallyExpanded)
                                                    partialExpand(next.detent)
                                            }; true
                                        }
                                    }
                                }
                                if (currentValue !is CupertinoSheetValue.Hidden) {

                                    val states = state.swipeableState.anchors.keys
                                    val currentIdx = states.indexOf(currentValue)

                                    val next = if (currentIdx == 0)
                                        CupertinoSheetValue.Hidden
                                    else states.toList()[currentIdx - 1]

                                    if (swipeableState.confirmValueChange(next)) {
                                        collapse("Collapse") {
                                            scope.launch {
                                                if (next is CupertinoSheetValue.Hidden)
                                                    hide()
                                                if (next is CupertinoSheetValue.PartiallyExpanded)
                                                    partialExpand(next.detent)
                                            }; true
                                        }
                                    }
                                }
                            }
                        }
                    },
                ) {
                    dragHandle()
                }
            }
        }
    }
}

private fun BottomSheetScaffoldAnchorChangeHandler(
    state: CupertinoSheetState,
    animateTo: (target: CupertinoSheetValue, velocity: Float) -> Unit,
    snapTo: (target: CupertinoSheetValue) -> Unit,
) = AnchorChangeHandler<CupertinoSheetValue> {
        previousTarget, previousAnchors, newAnchors ->

    val previousTargetOffset = previousAnchors[previousTarget]

    val newTarget = when (previousTarget) {
        is CupertinoSheetValue.PartiallyExpanded ->
            if (newAnchors.any { it.key == previousTarget })
                previousTarget else
                newAnchors.keys.firstOrNull { it is CupertinoSheetValue.PartiallyExpanded }
                    ?: CupertinoSheetValue.Expanded
        else -> previousTarget
    }

    val newTargetOffset = newAnchors.getValue(newTarget)
    if (newTargetOffset != previousTargetOffset) {
        if (state.swipeableState.isAnimationRunning) {
            // Re-target the animation to the new offset if it changed
            animateTo(newTarget, state.swipeableState.lastVelocity)
        } else {
            // Snap to the new offset value of the target if no animation was running
            snapTo(newTarget)
        }
    }
}

private enum class BottomSheetScaffoldLayoutSlot { Sheet }
private const val ScaleMultiplier = 11f
private const val TranslationMultiplier = 2.75f
private val BottomSheetMaxWidth = 640.dp
private val BottomSheetMinTopPadding = 60.dp
private val ScaffoldTopPadding = 10.dp

internal val SheetTopAppBarInsets = WindowInsets(
    left = 0.dp,
    top = DragHandleHeight,
    right = 0.dp,
    bottom = DragHandleHeight
)