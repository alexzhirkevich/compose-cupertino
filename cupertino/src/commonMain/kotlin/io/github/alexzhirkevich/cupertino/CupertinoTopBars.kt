/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino

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
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
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
fun cupertinoTranslucentTopBarColor(color: Color, isTransparent: Boolean) : Color {

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
 * @param colors [CupertinoTopAppBarColors] that will be used to resolve the colors used for this top app
 * bar in different states. See [CupertinoTopAppBarDefaults.topAppBarColors].
 * @param isTransparent top bar is usually transparent if scroll container reached or almost reached top.
 * [ScrollableState.isTopBarTransparent] and [LazyListState.isTopBarTransparent] can be used to track it
 * @param isTranslucent works only inside [CupertinoScaffold]. Blurred content behind top bar will be
 * visible if top bar is translucent. Simulates iOS app bars material.
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = LocalTopAppBarInsets.current(),
    colors: CupertinoTopAppBarColors = CupertinoTopAppBarDefaults.topAppBarColors(),
    isTransparent: Boolean = false,
    isTranslucent : Boolean = true
) = InlineTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        isTransparent = isTransparent,
        isTranslucent = isTranslucent,
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

internal val LocalTopAppBarInsets = compositionLocalOf<@Composable () -> WindowInsets> {
    @Composable {
        CupertinoTopAppBarDefaults.windowInsets
    }
}

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
    withDivider: Boolean = !isTransparent
) {

    val containerColor = if (isTranslucent)
        cupertinoTranslucentTopBarColor(colors.containerColor(), isTransparent)
    else
        colors.containerColor()

    Column {
        TopAppBarLayout(
            modifier = modifier
                .background(if (isTransparent) Color.Transparent else containerColor)
                .windowInsetsPadding(windowInsets),
            heightPx = LocalDensity.current.run { TopAppBarHeight.toPx() },
            navigationIconContentColor = colors.navigationIconContentColor,
            titleContentColor = colors.titleContentColor,
            actionIconContentColor = colors.actionIconContentColor,
//            navigationIconContentColor = CupertinoTheme.colorScheme.accent,
//            titleContentColor = LocalTextStyle.current.color,
//            actionIconContentColor = CupertinoTheme.colorScheme.accent,
            title = title,
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
                    content = actions
                )
            }
        )
        if (withDivider){
            CupertinoDivider()
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


object CupertinoTopAppBarDefaults {

    /**
     * Default insets to be used and consumed by the top app bars
     */
    val windowInsets: WindowInsets
        @Composable
//        @ReadOnlyComposable
        get() = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top)

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