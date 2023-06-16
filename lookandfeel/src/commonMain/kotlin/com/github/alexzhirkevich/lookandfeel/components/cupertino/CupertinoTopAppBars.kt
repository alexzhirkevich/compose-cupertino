@file:Suppress("INVISIBLE_MEMBER")
package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.rememberSplineBasedDecay
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
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
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.ScrollOverflowState
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.util.statusBars
import kotlin.math.max
import kotlin.math.roundToInt

@ExperimentalMaterial3Api
@Composable
@NonRestartableComposable
fun TopAppBarDefaults.cupertinoScrollBehavior(
    key : String?=null,
    state: TopAppBarState = com.github.alexzhirkevich.lookandfeel.util.rememberTopAppBarState(key = key),
    canScroll: () -> Boolean = { true },
    snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
    flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay()
): TopAppBarScrollBehavior = exitUntilCollapsedScrollBehavior(
    state = state,
    canScroll = canScroll,
    snapAnimationSpec = snapAnimationSpec,
    flingAnimationSpec = flingAnimationSpec
)

/**
 * @param containerColor color of the collapsed status bar container
 * */
@Composable
@NonRestartableComposable
@ExperimentalMaterial3Api
fun TopAppBarDefaults.cupertinoLargeTopAppBarColors(
    containerColor : Color = AdaptiveTheme.colorScheme.surface,
) = mediumTopAppBarColors(
    containerColor = containerColor.copy(alpha = 0f),
    scrolledContainerColor = containerColor,
)

@ExperimentalMaterial3Api
@NonRestartableComposable
@Composable
fun CupertinoTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
    isTransparent: () -> Boolean = { false },
    withDivider : Boolean = !isTransparent()
) = InlineTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        isTransparent = isTransparent,
        withDivider = withDivider,
    )


@ExperimentalMaterial3Api
@Composable
fun CupertinoLargeTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.cupertinoLargeTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
    scrollOverflowState : ScrollOverflowState? = null,
    isTransparent : () -> Boolean = { false },
    withDivider : Boolean = !isTransparent()
) {

    val density = LocalDensity.current

    val fontScale = remember {
        derivedStateOf {
            if (scrollOverflowState == null)
                1f
            else {
                density.run {
                    1 + (scrollOverflowState.position.coerceAtLeast(0f) / 1000.dp.toPx())
                        .coerceAtMost(.15f)
                }
            }
        }
    }

    val titleOffset = remember {
        derivedStateOf {
            scrollOverflowState?.position
                ?.coerceAtLeast(0f) ?: 0f
        }
    }

    TwoRowsTopAppBar(
        modifier = modifier,
        isTransparent = isTransparent,
        title = title,
        titleFontScale = fontScale,
        titleOffset = titleOffset,
        titleTextStyle = AdaptiveTheme.typography.titleLarge.copy(
            fontWeight = FontWeight.Bold,
            color = AdaptiveTheme.colorScheme.onBackground
        ),
        titleBottomPadding = 0.dp,
        smallTitle = title,
        smallTitleTextStyle = AdaptiveTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.Bold
        ),
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        maxHeight = CupertinoTopAppBarDefaults.height + 50.dp,
        pinnedHeight = CupertinoTopAppBarDefaults.height,
        scrollBehavior = scrollBehavior,
        withDivider = withDivider,
    )
}

@ExperimentalMaterial3Api
@Composable
private fun InlineTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier,
    navigationIcon: @Composable () -> Unit,
    actions: @Composable RowScope.() -> Unit,
    windowInsets: WindowInsets,
    colors: TopAppBarColors,
    isTransparent: () -> Boolean,
    withDivider: Boolean
) {

    val colorScheme = AdaptiveTheme.colorScheme
    val containerColor by remember{
        derivedStateOf {
            if (isTransparent()) Color.Transparent else /*colors.containerColor*/colorScheme.surface
        }
    }

    Column {
        TopAppBarLayout(
            modifier = modifier
                .background(containerColor)
                .windowInsetsPadding(windowInsets),
            heightPx = LocalDensity.current.run { CupertinoTopAppBarDefaults.height.toPx() },
//            navigationIconContentColor = colors.navigationIconContentColor,
//            titleContentColor = colors.titleContentColor,
//            actionIconContentColor = colors.actionIconContentColor,
            navigationIconContentColor = AdaptiveTheme.colorScheme.primary,
            titleContentColor = LocalTextStyle.current.color,
            actionIconContentColor = AdaptiveTheme.colorScheme.primary,
            title = title,
            titleTextStyle = AdaptiveTheme.typography.bodyLarge
                .copy(fontWeight = FontWeight.Bold),
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
            CupertinoDivider()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TwoRowsTopAppBar(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    titleFontScale : State<Float>,
    titleOffset : State<Float>,
    titleTextStyle: TextStyle,
    titleBottomPadding: Dp,
    smallTitle: @Composable () -> Unit,
    smallTitleTextStyle: TextStyle,
    navigationIcon: @Composable () -> Unit,
    actions: @Composable RowScope.() -> Unit,
    windowInsets: WindowInsets,
    colors: TopAppBarColors,
    maxHeight: Dp,
    pinnedHeight: Dp,
    scrollBehavior: TopAppBarScrollBehavior?,
    isTransparent: () -> Boolean,
    withDivider: Boolean,
) {
    if (maxHeight <= pinnedHeight) {
        throw IllegalArgumentException(
            "A TwoRowsTopAppBar max height should be greater than its pinned height"
        )
    }

    val pinnedHeightPx: Float
    val maxHeightPx: Float
    val titleBottomPaddingPx: Int
    LocalDensity.current.run {
        pinnedHeightPx = pinnedHeight.toPx()
        maxHeightPx =  maxHeight.toPx()
        titleBottomPaddingPx = titleBottomPadding.roundToPx()
    }

    // Sets the app bar's height offset limit to hide just the bottom title area and keep top title
    // visible when collapsed.

    SideEffect {
        if (scrollBehavior?.state?.heightOffsetLimit != pinnedHeightPx - maxHeightPx) {
            scrollBehavior?.state?.heightOffsetLimit = pinnedHeightPx - maxHeightPx
        }
    }

    val titleTransition by remember(scrollBehavior) {
        derivedStateOf {
            scrollBehavior?.state?.collapsedFraction?.let {
                (it - .5f).coerceAtLeast(0f) * 2
            } ?: 0f
        }
    }


    val transparentTransition by remember {
        derivedStateOf {
            if (isTransparent()) 0f else 1f
        }
    }

    // Wrap the given actions in a Row.
    val actionsRow = @Composable {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            content = actions
        )
    }
    val topTitleAlpha = remember {
        derivedStateOf {
            TopTitleAlphaEasing.transform(titleTransition)
                .coerceIn(0f, 1f)
        }
    }

    val bottomTitleAlpha = (1f - titleTransition).coerceIn(0f, 1f)
    // Hide the top row title semantics when its alpha value goes below 0.5 threshold.
    // Hide the bottom row title semantics when the top title semantics are active.
    val hideTopRowSemantics = titleTransition < 0.5f
    val hideBottomRowSemantics = !hideTopRowSemantics

    Column(modifier) {
        TopAppBarLayout(
            modifier = Modifier
                .background(colors.containerColor((titleTransition * transparentTransition).coerceIn(0f, 1f)))
                .windowInsetsPadding(windowInsets)
            // clip after padding so we don't show the title over the inset area
                .clipToBounds(),
            heightPx = pinnedHeightPx,
//                navigationIconContentColor = colors.navigationIconContentColor,
//                titleContentColor = colors.titleContentColor,
//                actionIconContentColor = colors.actionIconContentColor,
            navigationIconContentColor = AdaptiveTheme.colorScheme.primary,
            titleContentColor = LocalTextStyle.current.color,
            actionIconContentColor = AdaptiveTheme.colorScheme.primary,
            title = {
                Box(Modifier.graphicsLayer {
                    alpha = topTitleAlpha.value
                }) {
                    smallTitle()
                }
            },
            titleTextStyle = smallTitleTextStyle,
            titleAlpha = 1f,
            titleVerticalArrangement = Arrangement.Center,
            titleHorizontalArrangement = Arrangement.Center,
            titleBottomPadding = 0,
            hideTitleSemantics = hideTopRowSemantics,
            navigationIcon = navigationIcon,
            actions = actionsRow,
        )
        if (withDivider) {
            CupertinoDivider(
                modifier = Modifier
                    .graphicsLayer {
                        alpha = (titleTransition * transparentTransition).coerceIn(0f, 1f)
                    }
            )
        }
        TopAppBarLayout(
            modifier = Modifier
                .graphicsLayer {
                    translationY = titleOffset.value
                    scaleX = titleFontScale.value
                    scaleY = titleFontScale.value
                    transformOrigin = TransformOrigin(0f,1f)
                }
                .clipToBounds(),
            heightPx = maxHeightPx - pinnedHeightPx +
                    (scrollBehavior?.state?.heightOffset ?: 0f),
//                navigationIconContentColor = colors.navigationIconContentColor,
//                titleContentColor = colors.titleContentColor,
//                actionIconContentColor = colors.actionIconContentColor,
            navigationIconContentColor = AdaptiveTheme.colorScheme.primary,
            titleContentColor = LocalTextStyle.current.color,
            actionIconContentColor = AdaptiveTheme.colorScheme.primary,
            title = title,
            titleTextStyle = titleTextStyle,
            titleAlpha = bottomTitleAlpha,
            titleVerticalArrangement = Arrangement.Bottom,
            titleHorizontalArrangement = Arrangement.Start,
            titleBottomPadding = titleBottomPaddingPx,
            hideTitleSemantics = hideBottomRowSemantics,
            navigationIcon = {},
            actions = {}
        )
    }
}

/**
 * The base [Layout] for all top app bars. This function lays out a top app bar navigation icon
 * (leading icon), a title (header), and action icons (trailing icons). Note that the navigation and
 * the actions are optional.
 *
 * @param heightPx the total height this layout is capped to
 * @param navigationIconContentColor the content color that will be applied via a
 * [LocalContentColor] when composing the navigation icon
 * @param titleContentColor the color that will be applied via a [LocalContentColor] when composing
 * the title
 * @param actionIconContentColor the content color that will be applied via a [LocalContentColor]
 * when composing the action icons
 * @param title the top app bar title (header)
 * @param titleTextStyle the title's text style
 * @param modifier a [Modifier]
 * @param titleAlpha the title's alpha
 * @param titleVerticalArrangement the title's vertical arrangement
 * @param titleHorizontalArrangement the title's horizontal arrangement
 * @param titleBottomPadding the title's bottom padding
 * @param hideTitleSemantics hides the title node from the semantic tree. Apply this
 * boolean when this layout is part of a [TwoRowsTopAppBar] to hide the title's semantics
 * from accessibility services. This is needed to avoid having multiple titles visible to
 * accessibility services at the same time, when animating between collapsed / expanded states.
 * @param navigationIcon a navigation icon [Composable]
 * @param actions actions [Composable]
 */
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
}

/*@VisibleForTesting*/
internal val TopTitleAlphaEasing = CubicBezierEasing(.8f, 0f, .8f, .15f)

private val TopAppBarHorizontalPadding = 4.dp

// A title inset when the App-Bar is a Medium or Large one. Also used to size a spacer when the
// navigation icon is missing.
private val TopAppBarTitleInset = 16.dp - TopAppBarHorizontalPadding


