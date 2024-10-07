/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */


package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.collapse
import androidx.compose.ui.semantics.expand
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.util.fastMap
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.Black
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.DefaultAlpha
import kotlinx.coroutines.launch
import kotlin.math.max
import kotlin.math.roundToInt

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
    windowInsets: WindowInsets = CupertinoScaffoldDefaults.contentWindowInsets,
    scaffoldState: CupertinoBottomSheetScaffoldState = rememberCupertinoBottomSheetScaffoldState(),
    colors: CupertinoBottomSheetScaffoldColors = CupertinoBottomSheetScaffoldDefaults.colors(),
    sheetShape: Shape = CupertinoBottomSheetDefaults.shape,
    sheetShadowElevation: Dp = CupertinoBottomSheetDefaults.ShadowElevation,
    sheetDragHandle: @Composable (() -> Unit)? = if (scaffoldState.bottomSheetState.hasPartiallyExpandedState)
        null else {
        { CupertinoBottomSheetDefaults.DragHandle() }
    },
    sheetSwipeEnabled: Boolean = true,
    topBar: @Composable (() -> Unit)? = null,
    bottomBar: @Composable (() -> Unit)? = null,
    appBarsBlurAlpha: Float = CupertinoScaffoldDefaults.AppBarsBlurAlpha,
    appBarsBlurRadius: Dp = CupertinoScaffoldDefaults.AppBarsBlurRadius,
    hasNavigationTitle: Boolean = false,
    content: @Composable (PaddingValues) -> Unit
) {
    BottomSheetScaffoldLayout(
        appBarsBlurAlpha = appBarsBlurAlpha,
        appBarsBlurRadius = appBarsBlurRadius,
        hasNavigationTitle = hasNavigationTitle,
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        body = content,
        sheetState = scaffoldState.bottomSheetState,
        bottomSheet = { layoutHeight ->
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
            ) {
                StandardBottomSheet(
                    state = scaffoldState.bottomSheetState,
                    peekHeight = 0.dp,
                    sheetSwipeEnabled = sheetSwipeEnabled,
                    layoutHeight = layoutHeight.toFloat(),
                    shape = sheetShape,
                    containerColor = colors.sheetContainerColor,
                    contentColor = colors.sheetContentColor,
                    shadowElevation = sheetShadowElevation,
                    dragHandle = sheetDragHandle,
                    content = sheetContent
                )
            }
        },
        sheetOffset = { scaffoldState.bottomSheetState.offset ?: 0f },
        colors = colors,
        sheetShape = sheetShape,
        contentWindowInsets = windowInsets
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
    internal val scrimColor: Color,
    internal val scaledScaffoldBackgroundColor: Color
)

@Immutable
object CupertinoBottomSheetScaffoldDefaults {

    @Composable
    fun colors(
        sheetContainerColor: Color = CupertinoBottomSheetDefaults.containerColor,
        sheetContentColor: Color = CupertinoBottomSheetDefaults.contentColor,
        containerColor: Color = CupertinoTheme.colorScheme.systemBackground,
        contentColor: Color = CupertinoTheme.colorScheme.label,
        scrimColor: Color = CupertinoColors.DefaultAlpha,
        scaledScaffoldBackgroundColor: Color = CupertinoColors.Black
    ): CupertinoBottomSheetScaffoldColors = CupertinoBottomSheetScaffoldColors(
        sheetContainerColor = sheetContainerColor,
        sheetContentColor = sheetContentColor,
        containerColor = containerColor,
        contentColor = contentColor,
        scrimColor = scrimColor,
        scaledScaffoldBackgroundColor = scaledScaffoldBackgroundColor
    )
}


@Composable
private fun StandardBottomSheet(
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

    val bottomPadding = remember(layoutHeight, sortedAnchors, density) {
        density.run {
            (layoutHeight - sortedAnchors.last()
                .calculate(density, layoutHeight)).coerceAtLeast(0f).toDp()
        }
    }

    CupertinoSurface(
        modifier = Modifier
            .widthIn(
                max = if (state.presentationStyle is PresentationStyle.Fullscreen)
                    Dp.Unspecified else BottomSheetMaxWidth
            )
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
                            sortedAnchors.dropLast(1).fastMap {
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

                    is CupertinoSheetValue.Expanded -> {

                        val height = sortedAnchors.lastOrNull()
                            ?.calculate(density, layoutHeight) ?: sheetSize.height.toFloat()
                        (sheetSize.height - height ).coerceAtLeast(0f)
                    }
                    is CupertinoSheetValue.Hidden -> layoutHeight

                    else -> null
                }
            },
        shape = shape,
        color = containerColor,
        shadowElevation = shadowElevation,
        contentColor = contentColor
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .padding(bottom = bottomPadding)
        ) {
            content()
            if (dragHandle != null) {
                Box(
                    Modifier
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

@ExperimentalCupertinoApi
@Composable
private fun BottomSheetScaffoldLayout(
    modifier: Modifier,
    sheetState: CupertinoSheetState,
    topBar: @Composable() (() -> Unit)?,
    bottomBar: @Composable() (() -> Unit)?,
    body: @Composable (innerPadding: PaddingValues) -> Unit,
    bottomSheet: @Composable (layoutHeight: Int) -> Unit,
    sheetOffset: () -> Float,
    sheetShape: Shape,
    contentWindowInsets: WindowInsets,
    colors: CupertinoBottomSheetScaffoldColors,
    appBarsBlurAlpha: Float = CupertinoScaffoldDefaults.AppBarsBlurAlpha,
    appBarsBlurRadius: Dp = CupertinoScaffoldDefaults.AppBarsBlurRadius,
    hasNavigationTitle: Boolean = false,
) {

    val density = LocalDensity.current

    val topPadding by remember {
        derivedStateOf {
            if (sheetState.presentationStyle is PresentationStyle.Fullscreen) {
                0.dp
            } else {
                density.run {
                    maxOf(
                        contentWindowInsets.getTop(this) + ScaffoldTopPadding.toPx(),
                        BottomSheetMinTopPadding.toPx()
                    ).toDp()
                }
            }
        }
    }

    var sheetHeight by remember {
        mutableStateOf(0)
    }

    var scaffoldSize by remember {
        mutableStateOf(DpSize.Zero)
    }

    fun actualProgress(): Float {
        return if (sheetState.targetValue is CupertinoSheetValue.Hidden &&
            sheetState.currentValue == CupertinoSheetValue.Hidden
        ) 0f else (1f - (sheetState.swipeableState.offset ?: 0f) / sheetHeight).coerceIn(0f, 1f)
    }

    val lastPartialExpand = remember(sheetState.swipeableState.anchors) {
        sheetState.swipeableState.anchors.entries.lastOrNull {
            it.key is CupertinoSheetValue.PartiallyExpanded
        }
    }

    val animatedAlpha by animateFloatAsState(
        if (sheetState.isBackgroundInteractive) 0f else 1f
    )

    val coroutineScope = rememberCoroutineScope()

    val hasLargeDetent by remember(sheetState) {
        derivedStateOf {
            (sheetState.presentationStyle as? PresentationStyle.Modal)?.detents?.any {
                it is PresentationDetent.Large
            } == true
        }
    }

    Box {
        CupertinoScaffold(
            modifier = Modifier
                .onSizeChanged {
                    density.run {
                        scaffoldSize = it.toSize().toDpSize()
                    }
                }
                .background(colors.scaledScaffoldBackgroundColor)
                .graphicsLayer {
                    if (hasLargeDetent && scaffoldSize.width <= BottomSheetMaxWidth) {


                        val (sub, div) = if (!sheetState.hasPartiallyExpandedState)
                            0f to ScaleMultiplier
                        else {
                            val sub =
                                (lastPartialExpand?.value?.div(sheetHeight))?.coerceIn(0f, 1f) ?: 0f

                            1f - sub to ScaleMultiplier * sub
                        }
                        val p = actualProgress()

                        if (p > sub) {
                            scaleX = 1 - (p - sub) / div
                            scaleY = scaleX
                            translationY = (1f - scaleX) * topPadding.toPx() * TranslationMultiplier
                            if (p > 0) {
                                shape = sheetShape
                                clip = true
                            }
                        }
                    }
                }
                .drawWithContent {
                    drawContent()
                    drawRect(
                        color = colors.scrimColor,
                        alpha = animatedAlpha,
                    )
                }.then(modifier),
            topBar = { topBar?.invoke() },
            bottomBar = { bottomBar?.invoke() },
            content = body,
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            contentWindowInsets = contentWindowInsets,
            appBarsBlurAlpha = appBarsBlurAlpha,
            appBarsBlurRadius = appBarsBlurRadius,
            hasNavigationTitle = hasNavigationTitle
        )

        if (!sheetState.isBackgroundInteractive) {
            Spacer(
                modifier = Modifier
                    .size(scaffoldSize)
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

        SubcomposeLayout(
            Modifier.padding(top = topPadding)
        ) { constraints ->
            val layoutWidth = constraints.maxWidth
            val layoutHeight = constraints.maxHeight
            val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

            val sheetPlaceable = subcompose(BottomSheetScaffoldLayoutSlot.Sheet) {
                bottomSheet(layoutHeight)
            }[0].measure(looseConstraints)
            val sheetOffsetY = sheetOffset().roundToInt()
            val sheetOffsetX = max(0, (layoutWidth - sheetPlaceable.width) / 2)
            sheetHeight = layoutHeight
            layout(layoutWidth, layoutHeight) {
                sheetPlaceable.placeRelative(sheetOffsetX, sheetOffsetY)
            }
        }
    }
}


private fun BottomSheetScaffoldAnchorChangeHandler(
    state: CupertinoSheetState,
    animateTo: (target: CupertinoSheetValue, velocity: Float) -> Unit,
    snapTo: (target: CupertinoSheetValue) -> Unit,
) = AnchorChangeHandler<CupertinoSheetValue> { previousTarget, previousAnchors, newAnchors ->

    val previousTargetOffset = previousAnchors[previousTarget]

    val newTarget = when (previousTarget) {
        is CupertinoSheetValue.PartiallyExpanded ->
            if (newAnchors.any { it.key == previousTarget })
                previousTarget else
                newAnchors.keys.firstOrNull { it is CupertinoSheetValue.PartiallyExpanded }
                    ?: CupertinoSheetValue.Expanded

        else -> previousTarget
    }

    if (newAnchors.containsKey(newTarget)) {
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
}

private enum class BottomSheetScaffoldLayoutSlot { Sheet }

private const val ScaleMultiplier = 11f
private const val TranslationMultiplier = 2.75f
private val BottomSheetMaxWidth = 640.dp
private val BottomSheetMinTopPadding = 10.dp
private val ScaffoldTopPadding = 10.dp

internal val SheetTopAppBarInsets = WindowInsets(
    left = 0.dp,
    top = DragHandleHeight,
    right = 0.dp,
    bottom = DragHandleHeight
)