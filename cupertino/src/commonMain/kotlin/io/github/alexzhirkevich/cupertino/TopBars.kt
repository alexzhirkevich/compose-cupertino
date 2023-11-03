package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlin.math.max
import kotlin.math.roundToInt

@Composable
fun ScrollableState.isTopBarTransparent() : Boolean {
    return !canScrollBackward
}

@Composable
fun LazyListState.isTopBarTransparent(topPadding : Dp = 0.dp) : Boolean {

    val topPaddingPx = LocalDensity.current.run {
        remember(topPadding) {
            topPadding.toPx()
        }
    }

    return remember {
        derivedStateOf {
            !canScrollBackward || firstVisibleItemIndex == 0 &&
                    firstVisibleItemScrollOffset < topPaddingPx
        }
    }.value
}


@NonRestartableComposable
@Composable
fun CupertinoTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
    isTransparent: Boolean = false,
) = InlineTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        isTransparent = isTransparent,
        withDivider = !isTransparent,
    )


//@Composable
//fun CupertinoLargeTopAppBar(
//    title: @Composable () -> Unit,
//    modifier: Modifier = Modifier,
//    navigationIcon: @Composable () -> Unit = {},
//    actions: @Composable RowScope.() -> Unit = {},
//    windowInsets: WindowInsets = WindowInsets.statusBars,
//    colors: TopAppBarColors = TopAppBarDefaults.largeTopAppBarColors(),
//    scrollBehavior: TopAppBarScrollBehavior? = null,
//    scrollOverflowState : ScrollOverflowState? = null,
//    isTransparent : () -> Boolean = { false },
//    withDivider : Boolean = !isTransparent()
//) {
//
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

@Stable
class TopAppBarColors internal constructor(
    private val containerColor: Color,
    private val scrolledContainerColor: Color,
    internal val navigationIconContentColor: Color,
    internal val titleContentColor: Color,
    internal val actionIconContentColor: Color,
) {

    /**
     * Represents the container color used for the top app bar.
     *
     * A [colorTransitionFraction] provides a percentage value that can be used to generate a color.
     * Usually, an app bar implementation will pass in a [colorTransitionFraction] read from
     * the [TopAppBarState.collapsedFraction] or the [TopAppBarState.overlappedFraction].
     *
     * @param colorTransitionFraction a `0.0` to `1.0` value that represents a color transition
     * percentage
     */
    @Composable
    internal fun containerColor(): Color = containerColor


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is TopAppBarColors) return false

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

@Composable
private fun InlineTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier,
    navigationIcon: @Composable () -> Unit,
    actions: @Composable RowScope.() -> Unit,
    windowInsets: WindowInsets,
    colors: TopAppBarColors,
    isTransparent: Boolean,
    withDivider: Boolean = !isTransparent
) {


    val opacityState = LocalAppBarOpacityState.current
    DisposableEffect(isTransparent, opacityState) {
        opacityState?.isTopBarTransparent?.value = isTransparent
        onDispose {
            opacityState?.isTopBarTransparent?.value = true
        }
    }



    Column {
        TopAppBarLayout(
            modifier = modifier
                .background(colors.containerColor())
                .windowInsetsPadding(windowInsets),
            heightPx = LocalDensity.current.run { CupertinoTopAppBarDefaults.height.toPx() },
            navigationIconContentColor = colors.navigationIconContentColor,
            titleContentColor = colors.titleContentColor,
            actionIconContentColor = colors.actionIconContentColor,
//            navigationIconContentColor = CupertinoTheme.colorScheme.accent,
//            titleContentColor = LocalTextStyle.current.color,
//            actionIconContentColor = CupertinoTheme.colorScheme.accent,
            title = title,
            titleTextStyle = CupertinoTheme.typography.headline,
            titleAlpha = 1f,
            titleVerticalArrangement = Arrangement.Bottom,
            titleHorizontalArrangement = Arrangement.Center,
            titleBottomPadding = LocalDensity.current.run { 16.dp.roundToPx() },
            hideTitleSemantics = false,
            navigationIcon = navigationIcon,
            actions = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End,
                    content = actions
                )
            }
        )
        if (withDivider){
            Separator()
        }
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
                    .padding(start = TopAppBarHorizontalPadding)
            ) {
                CompositionLocalProvider(
                    LocalContentColor provides navigationIconContentColor,
                    content = navigationIcon
                )
            }
            Box(
                Modifier
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
                Modifier
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

        val layoutHeight = heightPx.roundToInt()

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

object CupertinoTopAppBarDefaults {
    val height = 44.dp

    @Composable
    fun containerColor() = CupertinoTheme.colorScheme.secondarySystemGroupedBackground

}

/*@VisibleForTesting*/
internal val TopTitleAlphaEasing = CubicBezierEasing(.8f, 0f, .8f, .15f)

private val TopAppBarHorizontalPadding = 4.dp

// A title inset when the App-Bar is a Medium or Large one. Also used to size a spacer when the
// navigation icon is missing.
private val TopAppBarTitleInset = 16.dp - TopAppBarHorizontalPadding


object TopAppBarDefaults {

//    /**
//     * Creates a [TopAppBarColors] for small [TopAppBar]. The default implementation animates
//     * between the provided colors according to the Material Design specification.
//     *
//     * @param containerColor the container color
//     * @param scrolledContainerColor the container color when content is scrolled behind it
//     * @param navigationIconContentColor the content color used for the navigation icon
//     * @param titleContentColor the content color used for the title
//     * @param actionIconContentColor the content color used for actions
//     * @return the resulting [TopAppBarColors] used for the top app bar
//     */
//    @Composable
//    fun topAppBarColors(
//        containerColor: Color = TopAppBarSmallTokens.ContainerColor.toColor(),
//        scrolledContainerColor: Color = MaterialTheme.colorScheme.applyTonalElevation(
//            backgroundColor = containerColor,
//            elevation = TopAppBarSmallTokens.OnScrollContainerElevation
//        ),
//        navigationIconContentColor: Color = TopAppBarSmallTokens.LeadingIconColor.toColor(),
//        titleContentColor: Color = TopAppBarSmallTokens.HeadlineColor.toColor(),
//        actionIconContentColor: Color = TopAppBarSmallTokens.TrailingIconColor.toColor(),
//    ): TopAppBarColors =
//        TopAppBarColors(
//            containerColor,
//            scrolledContainerColor,
//            navigationIconContentColor,
//            titleContentColor,
//            actionIconContentColor
//        )

//    /**
//     * Creates a [TopAppBarColors] for small [TopAppBar]s. The default implementation animates
//     * between the provided colors according to the Material Design specification.
//     *
//     * @param containerColor the container color
//     * @param scrolledContainerColor the container color when content is scrolled behind it
//     * @param navigationIconContentColor the content color used for the navigation icon
//     * @param titleContentColor the content color used for the title
//     * @param actionIconContentColor the content color used for actions
//     * @return the resulting [TopAppBarColors] used for the top app bar
//     * @deprecated use [topAppBarColors] instead
//     */
//    @Deprecated(
//        message = "Use topAppBarColors instead.",
//        replaceWith = ReplaceWith(
//            "topAppBarColors(containerColor, scrolledContainerColor, " +
//                    "navigationIconContentColor, titleContentColor, actionIconContentColor)"
//        ),
//        level = DeprecationLevel.WARNING
//    )
//    @Composable
//    fun smallTopAppBarColors(
//        containerColor: Color = TopAppBarSmallTokens.ContainerColor.toColor(),
//        scrolledContainerColor: Color = MaterialTheme.colorScheme.applyTonalElevation(
//            backgroundColor = containerColor,
//            elevation = TopAppBarSmallTokens.OnScrollContainerElevation
//        ),
//        navigationIconContentColor: Color = TopAppBarSmallTokens.LeadingIconColor.toColor(),
//        titleContentColor: Color = TopAppBarSmallTokens.HeadlineColor.toColor(),
//        actionIconContentColor: Color = TopAppBarSmallTokens.TrailingIconColor.toColor(),
//    ): TopAppBarColors =
//        topAppBarColors(
//            containerColor,
//            scrolledContainerColor,
//            navigationIconContentColor,
//            titleContentColor,
//            actionIconContentColor
//        )

    /**
     * Default insets to be used and consumed by the top app bars
     */
    val windowInsets: WindowInsets
        @Composable
        get() = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top)

    /**
     * Creates a [TopAppBarColors] for [CenterAlignedTopAppBar]s. The default implementation
     * animates between the provided colors according to the Material Design specification.
     *
     * @param containerColor the container color
     * @param scrolledContainerColor the container color when content is scrolled behind it
     * @param navigationIconContentColor the content color used for the navigation icon
     * @param titleContentColor the content color used for the title
     * @param actionIconContentColor the content color used for actions
     * @return the resulting [TopAppBarColors] used for the top app bar
     */
    @Composable
    fun centerAlignedTopAppBarColors(
        containerColor: Color = LocalAppBarsColor.current
            .takeIf { it.isSpecified }
            ?: CupertinoTopAppBarDefaults.containerColor(),
        scrolledContainerColor: Color = Color.Transparent,
        navigationIconContentColor: Color = CupertinoTheme.colorScheme.accent,
        titleContentColor: Color = CupertinoTheme.colorScheme.label,
        actionIconContentColor: Color = CupertinoTheme.colorScheme.accent,
    ): TopAppBarColors =
        TopAppBarColors(
            containerColor,
            scrolledContainerColor,
            navigationIconContentColor,
            titleContentColor,
            actionIconContentColor
        )
//
//    /**
//     * Creates a [TopAppBarColors] for [MediumTopAppBar]s. The default implementation interpolates
//     * between the provided colors as the top app bar scrolls according to the Material Design
//     * specification.
//     *
//     * @param containerColor the container color
//     * @param scrolledContainerColor the container color when content is scrolled behind it
//     * @param navigationIconContentColor the content color used for the navigation icon
//     * @param titleContentColor the content color used for the title
//     * @param actionIconContentColor the content color used for actions
//     * @return the resulting [TopAppBarColors] used for the top app bar
//     */
//    @Composable
//    fun mediumTopAppBarColors(
//        containerColor: Color = TopAppBarMediumTokens.ContainerColor.toColor(),
//        scrolledContainerColor: Color = MaterialTheme.colorScheme.applyTonalElevation(
//            backgroundColor = containerColor,
//            elevation = TopAppBarSmallTokens.OnScrollContainerElevation
//        ),
//        navigationIconContentColor: Color = TopAppBarMediumTokens.LeadingIconColor.toColor(),
//        titleContentColor: Color = TopAppBarMediumTokens.HeadlineColor.toColor(),
//        actionIconContentColor: Color = TopAppBarMediumTokens.TrailingIconColor.toColor(),
//    ): TopAppBarColors =
//        TopAppBarColors(
//            containerColor,
//            scrolledContainerColor,
//            navigationIconContentColor,
//            titleContentColor,
//            actionIconContentColor
//        )
//
//    /**
//     * Creates a [TopAppBarColors] for [LargeTopAppBar]s. The default implementation interpolates
//     * between the provided colors as the top app bar scrolls according to the Material Design
//     * specification.
//     *
//     * @param containerColor the container color
//     * @param scrolledContainerColor the container color when content is scrolled behind it
//     * @param navigationIconContentColor the content color used for the navigation icon
//     * @param titleContentColor the content color used for the title
//     * @param actionIconContentColor the content color used for actions
//     * @return the resulting [TopAppBarColors] used for the top app bar
//     */
//    @Composable
//    fun largeTopAppBarColors(
//        containerColor: Color = TopAppBarLargeTokens.ContainerColor.toColor(),
//        scrolledContainerColor: Color = MaterialTheme.colorScheme.applyTonalElevation(
//            backgroundColor = containerColor,
//            elevation = TopAppBarSmallTokens.OnScrollContainerElevation
//        ),
//        navigationIconContentColor: Color = TopAppBarLargeTokens.LeadingIconColor.toColor(),
//        titleContentColor: Color = TopAppBarLargeTokens.HeadlineColor.toColor(),
//        actionIconContentColor: Color = TopAppBarLargeTokens.TrailingIconColor.toColor(),
//    ): TopAppBarColors =
//        TopAppBarColors(
//            containerColor,
//            scrolledContainerColor,
//            navigationIconContentColor,
//            titleContentColor,
//            actionIconContentColor
//        )
//
//    /**
//     * Returns a pinned [TopAppBarScrollBehavior] that tracks nested-scroll callbacks and
//     * updates its [TopAppBarState.contentOffset] accordingly.
//     *
//     * @param state the state object to be used to control or observe the top app bar's scroll
//     * state. See [rememberTopAppBarState] for a state that is remembered across compositions.
//     * @param canScroll a callback used to determine whether scroll events are to be handled by this
//     * pinned [TopAppBarScrollBehavior]
//     */
//    @Composable
//    fun pinnedScrollBehavior(
//        state: TopAppBarState = rememberTopAppBarState(),
//        canScroll: () -> Boolean = { true }
//    ): TopAppBarScrollBehavior = PinnedScrollBehavior(state = state, canScroll = canScroll)
//
//    /**
//     * Returns a [TopAppBarScrollBehavior]. A top app bar that is set up with this
//     * [TopAppBarScrollBehavior] will immediately collapse when the content is pulled up, and will
//     * immediately appear when the content is pulled down.
//     *
//     * @param state the state object to be used to control or observe the top app bar's scroll
//     * state. See [rememberTopAppBarState] for a state that is remembered across compositions.
//     * @param canScroll a callback used to determine whether scroll events are to be
//     * handled by this [EnterAlwaysScrollBehavior]
//     * @param snapAnimationSpec an optional [AnimationSpec] that defines how the top app bar snaps
//     * to either fully collapsed or fully extended state when a fling or a drag scrolled it into an
//     * intermediate position
//     * @param flingAnimationSpec an optional [DecayAnimationSpec] that defined how to fling the top
//     * app bar when the user flings the app bar itself, or the content below it
//     */
//    //    @Composable
//    fun enterAlwaysScrollBehavior(
//        state: TopAppBarState = rememberTopAppBarState(),
//        canScroll: () -> Boolean = { true },
//        snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
//        flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay()
//    ): TopAppBarScrollBehavior =
//        EnterAlwaysScrollBehavior(
//            state = state,
//            snapAnimationSpec = snapAnimationSpec,
//            flingAnimationSpec = flingAnimationSpec,
//            canScroll = canScroll
//        )
//
//    /**
//     * Returns a [TopAppBarScrollBehavior] that adjusts its properties to affect the colors and
//     * height of the top app bar.
//     *
//     * A top app bar that is set up with this [TopAppBarScrollBehavior] will immediately collapse
//     * when the nested content is pulled up, and will expand back the collapsed area when the
//     * content is  pulled all the way down.
//     *
//     * @param state the state object to be used to control or observe the top app bar's scroll
//     * state. See [rememberTopAppBarState] for a state that is remembered across compositions.
//     * @param canScroll a callback used to determine whether scroll events are to be
//     * handled by this [ExitUntilCollapsedScrollBehavior]
//     * @param snapAnimationSpec an optional [AnimationSpec] that defines how the top app bar snaps
//     * to either fully collapsed or fully extended state when a fling or a drag scrolled it into an
//     * intermediate position
//     * @param flingAnimationSpec an optional [DecayAnimationSpec] that defined how to fling the top
//     * app bar when the user flings the app bar itself, or the content below it
//     */
//    @Composable
//    fun exitUntilCollapsedScrollBehavior(
//        state: TopAppBarState = rememberTopAppBarState(),
//        canScroll: () -> Boolean = { true },
//        snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
//        flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay()
//    ): TopAppBarScrollBehavior =
//        ExitUntilCollapsedScrollBehavior(
//            state = state,
//            snapAnimationSpec = snapAnimationSpec,
//            flingAnimationSpec = flingAnimationSpec,
//            canScroll = canScroll
//        )
}