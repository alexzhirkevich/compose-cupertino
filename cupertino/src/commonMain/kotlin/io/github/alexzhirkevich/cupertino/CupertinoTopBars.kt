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

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.LocalTextStyle
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Return true if container can't scroll backward
 * */
inline val ScrollableState.isTopBarTransparent : Boolean
    get() = !canScrollBackward


/**
 * Return true if container scroll offset is smaller than [topPadding]
 * */
@Composable
@ExperimentalCupertinoApi
fun LazyListState.isTopBarTransparent(topPadding : Dp = 0.dp) : Boolean {

    val topPaddingPx = LocalDensity.current.run {
        remember(topPadding) {
            topPadding.toPx()
        }
    }

    layoutInfo.visibleItemsInfo.first().offset
    return remember {
        derivedStateOf {
            !canScrollBackward || firstVisibleItemIndex == 0 &&
                    firstVisibleItemScrollOffset < topPaddingPx
        }
    }.value
}


/**
 * Top app bar itself does not produce cupertino thin material glass effect.
 * This effect works only inside [CupertinoScaffold], [CupertinoBottomSheetScaffold], [CupertinoBottomSheetContent].
 * Use this function to achieve this effect with custom top app bar.
 * It will communicate with scaffold and return either [Color.Transparent] if color was
 * successfully applied to scaffold (and top bar itself should be transparent) or passed color
 * if scaffold wasn't found.
 *
 * @param color top bar container color. Alpha is controlled by the [CupertinoScaffold]
 * @param isTransparent if top bar currently should be transparent. See [CupertinoTopAppBar]
 * for use cases example.
 * */
@Composable
@ExperimentalCupertinoApi
fun cupertinoTranslucentTopBarColor(color: Color, isTranslucent: Boolean, isTransparent: Boolean) : Color {

    if (!isTranslucent)
        return color

    val appBarsState = LocalAppBarsState.current ?: return color

    DisposableEffect(appBarsState, color) {
        appBarsState.topBarColor.value = color
        onDispose {
            appBarsState.topBarColor.value = Color.Unspecified
        }
    }

    DisposableEffect(isTransparent, appBarsState) {
        appBarsState.isTopBarTransparent.value = isTransparent
        onDispose {
            appBarsState.isTopBarTransparent.value = true
        }
    }
    return Color.Transparent
}

/**
 * Top app bar with center aligned title
 *
 * @param title the title to be displayed at the center of the top app bar.
 * @param modifier the [Modifier] to be applied to this top app bar.
 * @param navigationIcon the navigation icon displayed at the start of the top app bar. This should
 * typically be an [CupertinoIconButton].
 * @param actions the actions displayed at the end of the top app bar. This should typically be
 * [CupertinoIconButton]s. The default layout here is a [Row], so icons inside will be placed horizontally.
 * @param windowInsets a window insets that app bar will respect.
 * @param isTransparent top bar is usually transparent if scroll container reached or almost reached top.
 * [ScrollableState.isTopBarTransparent] and [LazyListState.isTopBarTransparent] can be used to track it
 * @param isTranslucent works only inside [CupertinoScaffold]. Blurred content behind top bar will be
 * visible if top bar is translucent. Simulates iOS app bars material.
 * @param divider bottom divider when [isTransparent] is false.
 * @param colors [CupertinoTopAppBarColors] that will be used to resolve the colors used for this top app
 * bar in different states. See [CupertinoTopAppBarDefaults.topAppBarColors].
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = LocalTopAppBarInsets.current ?: CupertinoTopAppBarDefaults.windowInsets,
    isTransparent : Boolean = false,
    isTranslucent : Boolean = LocalAppBarsState.current != null,
    divider: @Composable () -> Unit = {
        if (!isTransparent) {
            CupertinoTopAppBarDefaults.divider()
        }
    },
    colors: CupertinoTopAppBarColors = CupertinoTopAppBarDefaults.topAppBarColors(),
){
    val navTitleVisible by LocalNavigationTitleVisible.current
    val transparent = isTransparent || navTitleVisible

    InlineTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        isTransparent = transparent,
        isTranslucent = isTranslucent,
        divider = divider,
    )
}

internal val LocalNavigationTitleVisible = compositionLocalOf {
    mutableStateOf(false)
}

private class ClipShape(
    private val offsetDifference : Float
) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Rectangle(
            Rect(
                top = offsetDifference.coerceAtMost(size.height),
                left = 0f,
                right = size.width,
                bottom = size.height
            )
        )
    }

}

private const val NavTitleMaxFontScale = 1.1f
private val NavTitleMaxFontScaleDistance = 150.dp

/**
 * Navigation Title.
 *
 * Should be the first element in the first scrollable container inside
 * [CupertinoScaffold]/[CupertinoBottomSheetScaffold]/[CupertinoBottomSheetContent] body.
 * One container can have only one title.
 * Can behave unexpectedly when this precondition is violated.
 *
 * Navigation title will automatically manage [CupertinoTopAppBar] title visibility
 * and background transparency when usage precondition is fulfilled.
 *
 * @param modifier modifier of the title container
 * @param maxFontScale maximum font scale. Must be >= 1
 * @param maxFontScaleDistance distance of the scroll overflow at which [maxFontScale] is reached
 * @param paddingValues title padding values
 * @param content title content
 * */
@Composable
fun CupertinoNavigationTitle(
    modifier: Modifier = Modifier,
    maxFontScale : Float = NavTitleMaxFontScale,
    maxFontScaleDistance : Dp = NavTitleMaxFontScaleDistance,
    paddingValues: PaddingValues = CupertinoSectionDefaults.PaddingValues,
    content: @Composable () -> Unit
) {

    require(maxFontScale >= 1){
        "maxFontScale must be >= 1."
    }
    var visible by LocalNavigationTitleVisible.current

    val density = LocalDensity.current

    val scaffoldCoordinates by LocalScaffoldCoordinates.current

//    val top = (LocalScaffoldInsets.current ?: WindowInsets.statusBars).getTop(density)

    val topBarHeightPx = (LocalTopBarHeight.current.value ?: 0f)

    val topAppBarExists = topBarHeightPx > Float.MIN_VALUE
//    var size by remember {
//        mutableStateOf(0f)
//    }

//    val topBarHeightPx = remember(density) {
//        density.run {
//            TopAppBarHeight.toPx() + top
//        }
//    }

    val offsetDifference = remember {
        mutableStateOf(0f)
    }

// TODO: nav title snap
//
//    LaunchedEffect(scrollableState) {
//        snapshotFlow {
//            scrollableState?.isScrollInProgress == true
//        }.distinctUntilChanged().collect {
//            if (!it) {
//                val diff = offsetDifference.value
//
//                println(diff)
//
//                if (diff > size)
//                    return@collect
//                val scroll = if (diff < size / 2) {
//                   -diff
//                } else size - diff
//
//                try {
//                    scrollableState?.animateScrollBy(scroll)
//                } finally {
//                }
//            }
//        }
//    }

    val maxSizeIncreaseDistancePx = density.run { maxFontScaleDistance.toPx() }

    val insets = LocalScaffoldInsets.current?.getTop(density) ?: 0
    val fontIncrease by remember(maxSizeIncreaseDistancePx, maxFontScale) {
        derivedStateOf {
            val d = offsetDifference.value + topBarHeightPx - insets
            if (d >= 0) {
                1f
            } else {
                1f + (-d / maxSizeIncreaseDistancePx).coerceIn(0f, 1f) * (maxFontScale - 1)
            }
        }
    }

    val font = CupertinoTheme.typography.largeTitle
        .copy(fontWeight = FontWeight.Bold)


    Box(
        modifier
            .padding(paddingValues)
            .let {
                if (topAppBarExists)
                    it.clip(ClipShape(offsetDifference.value))
                else it
            }
            .onGloballyPositioned {

                val scaffoldTop =  (scaffoldCoordinates?.boundsInWindow()?.top ?: 0f)


                offsetDifference.value = (topBarHeightPx - it.boundsInWindow().top) + scaffoldTop

                visible = !topAppBarExists || offsetDifference.value < it.size.height
            }
    ) {
        CompositionLocalProvider(
            LocalTextStyle provides font.copy(fontSize = font.fontSize * fontIncrease)
        ) {
            content()
        }
    }
}


//@Composable
//fun CupertinoLargeTopAppBar(
//    title: @Composable () -> Unit,
//    modifier: Modifier = Modifier,
//    navigationIcon: @Composable () -> Unit = {},
//    actions: @Composable RowScope.() -> Unit = {},
//    windowInsets: WindowInsets = LocalTopAppBarInsets.current ?: WindowInsets.statusBars,
//    colors: CupertinoTopAppBarColors = CupertinoTopAppBarDefaults.topAppBarColors(),
//    scrollBehavior: TopAppBarScrollBehavior? = null,
//    isTransparent : () -> Boolean = { false },
//    withDivider : Boolean = !isTransparent()
//) {
//    val density = LocalDensity.current
//
//    val fontScale = remember {
//        derivedStateOf {
//            if (scrollOverflowState == null)
//                1f
//            else {
//                density.run {
//                    1 + (scrollOverflowState.position.coerceAtLeast(0f) / 1000.dp.toPx())
//                        .coerceAtMost(.15f)
//                }
//            }
//        }
//    }
//
//    val titleOffset = remember {
//        derivedStateOf {
//            scrollOverflowState?.position
//                ?.coerceAtLeast(0f) ?: 0f
//        }
//    }
//
//    TwoRowsTopAppBar(
//        modifier = modifier,
//        isTransparent = isTransparent,
//        title = title,
//        titleFontScale = fontScale,
//        titleOffset = titleOffset,
//        titleTextStyle = AdaptiveTheme.typography.titleLarge.copy(
//            fontWeight = FontWeight.Bold,
//            color = AdaptiveTheme.colorScheme.onBackground
//        ),
//        titleBottomPadding = 0.dp,
//        smallTitle = title,
//        smallTitleTextStyle = AdaptiveTheme.typography.bodyLarge.copy(
//            fontWeight = FontWeight.Bold,
//            color = AdaptiveTheme.colorScheme.onSurface
//        ),
//        navigationIcon = navigationIcon,
//        actions = actions,
//        windowInsets = windowInsets,
//        colors = colors,
//        maxHeight = CupertinoTopAppBarDefaults.height + 50.dp,
//        pinnedHeight = CupertinoTopAppBarDefaults.height,
//        scrollBehavior = scrollBehavior,
//        withDivider = withDivider,
//    )
//}

//@Composable
//private fun TwoRowsTopAppBar(
//    modifier: Modifier = Modifier,
//    title: @Composable () -> Unit,
//    titleTextStyle: TextStyle,
//    titleBottomPadding: Dp,
//    smallTitle: @Composable () -> Unit,
//    smallTitleTextStyle: TextStyle,
//    navigationIcon: @Composable () -> Unit,
//    actions: @Composable RowScope.() -> Unit,
//    windowInsets: WindowInsets,
//    colors: CupertinoTopAppBarColors,
//    maxHeight: Dp,
//    pinnedHeight: Dp,
//    scrollBehavior: TopAppBarScrollBehavior?
//) {
//    if (maxHeight <= pinnedHeight) {
//        throw IllegalArgumentException(
//            "A TwoRowsTopAppBar max height should be greater than its pinned height"
//        )
//    }
//    val pinnedHeightPx: Float
//    val maxHeightPx: Float
//    val titleBottomPaddingPx: Int
//    LocalDensity.current.run {
//        pinnedHeightPx = pinnedHeight.toPx()
//        maxHeightPx = maxHeight.toPx()
//        titleBottomPaddingPx = titleBottomPadding.roundToPx()
//    }
//
//    // Sets the app bar's height offset limit to hide just the bottom title area and keep top title
//    // visible when collapsed.
//    SideEffect {
//        if (scrollBehavior?.state?.heightOffsetLimit != pinnedHeightPx - maxHeightPx) {
//            scrollBehavior?.state?.heightOffsetLimit = pinnedHeightPx - maxHeightPx
//        }
//    }
//
//    // Obtain the container Color from the TopAppBarColors using the `collapsedFraction`, as the
//    // bottom part of this TwoRowsTopAppBar changes color at the same rate the app bar expands or
//    // collapse.
//    // This will potentially animate or interpolate a transition between the container color and the
//    // container's scrolled color according to the app bar's scroll state.
//    val colorTransitionFraction = scrollBehavior?.state?.collapsedFraction ?: 0f
//    val appBarContainerColor by rememberUpdatedState(colors.containerColor(colorTransitionFraction))
//
//    // Wrap the given actions in a Row.
//    val actionsRow = @Composable {
//        Row(
//            horizontalArrangement = Arrangement.End,
//            verticalAlignment = Alignment.CenterVertically,
//            content = actions
//        )
//    }
//    val topTitleAlpha = TopTitleAlphaEasing.transform(colorTransitionFraction)
//    val bottomTitleAlpha = 1f - colorTransitionFraction
//    // Hide the top row title semantics when its alpha value goes below 0.5 threshold.
//    // Hide the bottom row title semantics when the top title semantics are active.
//    val hideTopRowSemantics = colorTransitionFraction < 0.5f
//    val hideBottomRowSemantics = !hideTopRowSemantics
//
//
//    Surface(
//        modifier = modifier,
//        color = appBarContainerColor
//    ) {
//        Column {
//            TopAppBarLayout(
//                modifier = Modifier
//                    .windowInsetsPadding(windowInsets)
//                    // clip after padding so we don't show the title over the inset area
//                    .clipToBounds(),
//                heightPx = pinnedHeightPx,
//                navigationIconContentColor =
//                colors.navigationIconContentColor,
//                titleContentColor = colors.titleContentColor,
//                actionIconContentColor =
//                colors.actionIconContentColor,
//                title = smallTitle,
//                titleTextStyle = smallTitleTextStyle,
//                titleAlpha = topTitleAlpha,
//                titleVerticalArrangement = Arrangement.Center,
//                titleHorizontalArrangement = Arrangement.Start,
//                titleBottomPadding = 0,
//                hideTitleSemantics = hideTopRowSemantics,
//                navigationIcon = navigationIcon,
//                actions = actionsRow,
//            )
//            TopAppBarLayout(
//                modifier = Modifier
//                    // only apply the horizontal sides of the window insets padding, since the top
//                    // padding will always be applied by the layout above
//                    .windowInsetsPadding(windowInsets.only(WindowInsetsSides.Horizontal))
//                    .clipToBounds(),
//                heightPx = maxHeightPx - pinnedHeightPx + (scrollBehavior?.state?.heightOffset
//                    ?: 0f),
//                navigationIconContentColor =
//                colors.navigationIconContentColor,
//                titleContentColor = colors.titleContentColor,
//                actionIconContentColor =
//                colors.actionIconContentColor,
//                title = title,
//                titleTextStyle = titleTextStyle,
//                titleAlpha = bottomTitleAlpha,
//                titleVerticalArrangement = Arrangement.Bottom,
//                titleHorizontalArrangement = Arrangement.Start,
//                titleBottomPadding = titleBottomPaddingPx,
//                hideTitleSemantics = hideBottomRowSemantics,
//                navigationIcon = {},
//                actions = {}
//            )
//        }
//    }
//}

@Stable
class CupertinoTopAppBarColors internal constructor(
    private val containerColor: Color,
    private val scrolledContainerColor: Color,
    internal val navigationIconContentColor: Color,
    internal val titleContentColor: Color,
    internal val actionIconContentColor: Color,
) {

    @Composable
    internal fun containerColor(): Color = containerColor


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CupertinoTopAppBarColors) return false

        if (containerColor != other.containerColor) return false
        if (scrolledContainerColor != other.scrolledContainerColor) return false
        if (navigationIconContentColor != other.navigationIconContentColor) return false
        if (titleContentColor != other.titleContentColor) return false
        if (actionIconContentColor != other.actionIconContentColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + scrolledContainerColor.hashCode()
        result = 31 * result + navigationIconContentColor.hashCode()
        result = 31 * result + titleContentColor.hashCode()
        result = 31 * result + actionIconContentColor.hashCode()

        return result
    }
}

internal val LocalTopAppBarInsets = compositionLocalOf<WindowInsets?> {
    null
}

@ExperimentalCupertinoApi
@Composable
private fun InlineTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier,
    navigationIcon: @Composable () -> Unit,
    actions: @Composable RowScope.() -> Unit,
    windowInsets: WindowInsets,
    colors: CupertinoTopAppBarColors,
    isTransparent: Boolean,
    isTranslucent: Boolean,
    divider : @Composable () -> Unit
) {

    val containerColor = cupertinoTranslucentTopBarColor(
        color = colors.containerColor(),
        isTranslucent = isTranslucent,
        isTransparent = isTransparent
    )

    val navTitleVisible by LocalNavigationTitleVisible.current

    Column {
        TopAppBarLayout(
            modifier = modifier
                .background(if (isTransparent) Color.Transparent else containerColor)
                .windowInsetsPadding(windowInsets),
            heightPx = LocalDensity.current.run { TopAppBarHeight.toPx() },
            navigationIconContentColor = colors.navigationIconContentColor,
            titleContentColor = colors.titleContentColor,
            actionIconContentColor = colors.actionIconContentColor,
            title = {

                AnimatedVisibility(
                    visible = !navTitleVisible,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    title()
                }
            },
            titleTextStyle = CupertinoTheme.typography.headline,
            titleAlpha = 1f,
            titleVerticalArrangement = Arrangement.Center,
            titleHorizontalArrangement = Arrangement.Center,
            titleBottomPadding = LocalDensity.current.run { 16.dp.roundToPx() },
            hideTitleSemantics = false,
            navigationIcon = navigationIcon,
            actions = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    content = actions
                )
            }
        )
        divider()
    }
}

@Composable
private fun TopAppBarLayout(
    modifier: Modifier,
    heightPx: Float,
    navigationIconContentColor: Color,
    titleContentColor: Color,
    actionIconContentColor: Color,
    title: @Composable () -> Unit,
    titleTextStyle: TextStyle,
    titleAlpha: Float,
    titleVerticalArrangement: Arrangement.Vertical,
    titleHorizontalArrangement: Arrangement.Horizontal,
    titleBottomPadding: Int,
    hideTitleSemantics: Boolean,
    navigationIcon: @Composable () -> Unit,
    actions: @Composable () -> Unit,
) {
    Layout(
        {
            Box(
                Modifier
                    .layoutId("navigationIcon")
//                    .padding(start = TopAppBarHorizontalPadding)
            ) {
                CompositionLocalProvider(
                    LocalContentColor provides navigationIconContentColor,
                    content = navigationIcon
                )
            }
            Box(
                modifier = Modifier
                    .layoutId("title")
                    .padding(horizontal = TopAppBarHorizontalPadding)
                    .graphicsLayer { alpha = titleAlpha }
                    .then(if (hideTitleSemantics) Modifier.clearAndSetSemantics { } else Modifier)
            ) {
                ProvideTextStyle(value = titleTextStyle) {
                    CompositionLocalProvider(
                        LocalContentColor provides titleContentColor,
                        content = title
                    )
                }
            }
            Box(
                modifier = Modifier
                    .layoutId("actionIcons")
                    .padding(end = TopAppBarHorizontalPadding)
            ) {
                CompositionLocalProvider(
                    LocalContentColor provides actionIconContentColor,
                    content = actions
                )
            }
        },
        modifier = modifier
    ) { measurables, constraints ->
        val navigationIconPlaceable =
            measurables.first { it.layoutId == "navigationIcon" }
                .measure(constraints.copy(minWidth = 0))
        val actionIconsPlaceable =
            measurables.first { it.layoutId == "actionIcons" }
                .measure(constraints.copy(minWidth = 0))

        val maxTitleWidth = if (constraints.maxWidth == Constraints.Infinity) {
            constraints.maxWidth
        } else {
            (constraints.maxWidth - navigationIconPlaceable.width - actionIconsPlaceable.width)
                .coerceAtLeast(0)
        }

        val layoutHeight = heightPx.roundToInt()

        val titlePlaceable =
            measurables.first { it.layoutId == "title" }
                .measure(constraints.copy(minWidth = 0, maxWidth = maxTitleWidth))

        // Locate the title's baseline.
        val titleBaseline =
            if (titlePlaceable[LastBaseline] != AlignmentLine.Unspecified) {
                titlePlaceable[LastBaseline]
            } else {
                0
            }


        layout(constraints.maxWidth, layoutHeight) {
            // Navigation icon
            navigationIconPlaceable.placeRelative(
                x = 0,
                y = (layoutHeight - navigationIconPlaceable.height) / 2
            )

            // Title
            titlePlaceable.placeRelative(
                x = when (titleHorizontalArrangement) {
                    Arrangement.Center -> (constraints.maxWidth - titlePlaceable.width) / 2
                    Arrangement.End ->
                        constraints.maxWidth - titlePlaceable.width - actionIconsPlaceable.width
                    // Arrangement.Start.
                    // An TopAppBarTitleInset will make sure the title is offset in case the
                    // navigation icon is missing.
                    else -> max(TopAppBarTitleInset.roundToPx(), navigationIconPlaceable.width)
                },
                y = when (titleVerticalArrangement) {
                    Arrangement.Center -> (layoutHeight - titlePlaceable.height) / 2
                    // Apply bottom padding from the title's baseline only when the Arrangement is
                    // "Bottom".
                    Arrangement.Bottom ->
                        if (titleBottomPadding == 0) layoutHeight - titlePlaceable.height
                        else layoutHeight - titlePlaceable.height - max(
                            0,
                            titleBottomPadding - titlePlaceable.height + titleBaseline
                        )
                    // Arrangement.Top
                    else -> 0
                }
            )

            // Action icons
            actionIconsPlaceable.placeRelative(
                x = constraints.maxWidth - actionIconsPlaceable.width,
                y = (layoutHeight - actionIconsPlaceable.height) / 2
            )
        }
    }
}

//internal val TopTitleAlphaEasing = CubicBezierEasing(.8f, 0f, .8f, .15f)

private val TopAppBarHorizontalPadding = 4.dp
private val TopAppBarHeight = 44.dp


// A title inset when the App-Bar is a Medium or Large one. Also used to size a spacer when the
// navigation icon is missing.
private val TopAppBarTitleInset = 16.dp - TopAppBarHorizontalPadding

@Immutable
object CupertinoTopAppBarDefaults {

    /**
     * Default insets to be used and consumed by the top app bars
     */
    val windowInsets: WindowInsets
        @Composable
//        @ReadOnlyComposable
        get() = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top)


    @Composable
    fun divider() {
        CupertinoHorizontalDivider()
    }

    /**
     * Creates a [CupertinoTopAppBarColors] . The default implementation
     * animates between the provided colors according to the Material Design specification.
     *
     * Note: top app bar itself does not produce cupertino thin material glass effect.
     * This effect works only inside [CupertinoScaffold], [CupertinoBottomSheetScaffold], [CupertinoBottomSheetContent].
     * To achieve this effect with custom top app bar use [cupertinoTranslucentTopBarColor]
     * function that will communicate with scaffold and return either
     * [Color.Transparent] if color was successfully applied to scaffold (and top bar itself
     * should be transparent) or passed color if scaffold wasn't found.
     *
     * @param containerColor the container color
     * @param scrolledContainerColor the container color when content is scrolled behind it
     * @param navigationIconContentColor the content color used for the navigation icon
     * @param titleContentColor the content color used for the title
     * @param actionIconContentColor the content color used for actions
     * @return the resulting [CupertinoTopAppBarColors] used for the top app bar
     */
    @Composable
    @ReadOnlyComposable
    fun topAppBarColors(
        containerColor: Color = CupertinoTheme.colorScheme.tertiarySystemBackground,
        scrolledContainerColor: Color = Color.Transparent,
        navigationIconContentColor: Color = CupertinoTheme.colorScheme.accent,
        titleContentColor: Color = CupertinoTheme.colorScheme.label,
        actionIconContentColor: Color = CupertinoTheme.colorScheme.accent,
    ): CupertinoTopAppBarColors =
        CupertinoTopAppBarColors(
            containerColor,
            scrolledContainerColor,
            navigationIconContentColor,
            titleContentColor,
            actionIconContentColor
        )

}