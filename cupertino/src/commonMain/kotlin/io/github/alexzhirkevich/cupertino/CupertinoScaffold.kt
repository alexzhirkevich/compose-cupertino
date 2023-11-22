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

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

/**
 * Scaffold implements the basic cupertino and material design visual layout structure.
 *
 * This component provides API to put together several cupertino components to construct your
 * screen, by ensuring proper layout strategy for them and collecting necessary data so these
 * components will work together correctly.
 *
 * @param modifier the [Modifier] to be applied to this scaffold
 * @param topBar top app bar of the screen, typically a [SmallTopAppBar]
 * @param bottomBar bottom bar of the screen, typically a [NavigationBar]
 * @param snackbarHost component to host Snackbars
 * @param floatingActionButton Main action button of the screen, typically a FloatingActionButton
 * @param floatingActionButtonPosition position of the FAB on the screen. See [FabPosition].
 * @param containerColor the color used for the background of this scaffold. Use [Color.Transparent]
 * to have no color.
 * @param contentColor the preferred color for content inside this scaffold
 * @param contentWindowInsets window insets to be passed to [content] slot via [PaddingValues]
 * params. Scaffold will take the insets into account from the top/bottom only if the [topBar]/
 * [bottomBar] are not present, as the scaffold expect [topBar]/[bottomBar] to handle insets
 * instead
 * @param appBarsAlpha app bars opacity level. Default lvl is similar to iOS one and
 * supports [Accessibility.isReduceTransparencyEnabled]
 * @param appBarsAlpha app bars blur radius. Default radius is similar to iOS one and
 * supports [Accessibility.isReduceTransparencyEnabled]
 * @param content content of the screen. The lambda receives a [PaddingValues] that should be
 * applied to the content root via [Modifier.padding] and [Modifier.consumeWindowInsets] to
 * properly offset top and bottom bars. If using [Modifier.verticalScroll] or lazy lists,
 * apply this modifier to the child of the scroll, and not on the scrollable container itself.
 */
@Composable
fun CupertinoScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    containerColor: Color = CupertinoTheme.colorScheme.systemBackground,
    contentColor: Color = CupertinoTheme.colorScheme.label,
    contentWindowInsets: WindowInsets = CupertinoScaffoldDefaults.contentWindowInsets,
    appBarsAlpha : Float = CupertinoScaffoldDefaults.AppBarsAlpha,
    appBarsBlurRadius : Dp = CupertinoScaffoldDefaults.AppBarsBlurRadius,
    content: @Composable (PaddingValues) -> Unit
) {
    Surface(
        modifier = modifier,
        color = containerColor,
        contentColor = contentColor
    ) {
        CompositionLocalProvider(
            LocalAppBarsState provides remember { AppBarsState(

            ) },
        ) {
            ScaffoldLayout(
                fabPosition = floatingActionButtonPosition,
                topBar = {
                    CompositionLocalProvider(
                        LocalContainerColor provides Color.Transparent,
                        content = topBar
                    )
                },
                bottomBar = {
                    CompositionLocalProvider(
                        LocalContainerColor provides Color.Transparent,
                        content = bottomBar
                    )
                },
                content = content,
                snackbar = snackbarHost,
                contentWindowInsets = contentWindowInsets,
                fab = floatingActionButton,
                appBarsAlpha = appBarsAlpha,
                appBarsBlurRadius = appBarsBlurRadius
            )
        }
    }
}

/**
 * Layout for a [Scaffold]'s content.
 *
 * @param fabPosition [FabPosition] for the FAB (if present)
 * @param topBar the content to place at the top of the [Scaffold], typically a [SmallTopAppBar]
 * @param content the main 'body' of the [Scaffold]
 * @param snackbar the [Snackbar] displayed on top of the [content]
 * @param fab the [FloatingActionButton] displayed on top of the [content], below the [snackbar]
 * and above the [bottomBar]
 * @param bottomBar the content to place at the bottom of the [Scaffold], on top of the
 * [content], typically a [NavigationBar].
 */
@Composable
private fun ScaffoldLayout(
    fabPosition: FabPosition,
    topBar: @Composable () -> Unit,
    content: @Composable (PaddingValues) -> Unit,
    snackbar: @Composable () -> Unit,
    fab: @Composable () -> Unit,
    contentWindowInsets: WindowInsets,
    appBarsAlpha : Float,
    appBarsBlurRadius : Dp,
    bottomBar: @Composable () -> Unit
) {
    SubcomposeLayout { constraints ->
        val layoutWidth = constraints.maxWidth
        val layoutHeight = constraints.maxHeight

        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        layout(layoutWidth, layoutHeight) {
            val topBarPlaceables = subcompose(ScaffoldLayoutContent.TopBar, topBar).map {
                it.measure(looseConstraints)
            }

            val topBarHeight = topBarPlaceables.maxByOrNull { it.height }?.height ?: 0

            val snackbarPlaceables = subcompose(ScaffoldLayoutContent.Snackbar, snackbar).map {
                // respect only bottom and horizontal for snackbar and fab
                val leftInset = contentWindowInsets
                    .getLeft(this@SubcomposeLayout, layoutDirection)
                val rightInset = contentWindowInsets
                    .getRight(this@SubcomposeLayout, layoutDirection)
                val bottomInset = contentWindowInsets.getBottom(this@SubcomposeLayout)
                // offset the snackbar constraints by the insets values
                it.measure(
                    looseConstraints.offset(
                        -leftInset - rightInset,
                        -bottomInset
                    )
                )
            }

            val snackbarHeight = snackbarPlaceables.maxByOrNull { it.height }?.height ?: 0
            val snackbarWidth = snackbarPlaceables.maxByOrNull { it.width }?.width ?: 0

            val fabPlaceables =
                subcompose(ScaffoldLayoutContent.Fab, fab).mapNotNull { measurable ->
                    // respect only bottom and horizontal for snackbar and fab
                    val leftInset =
                        contentWindowInsets.getLeft(this@SubcomposeLayout, layoutDirection)
                    val rightInset =
                        contentWindowInsets.getRight(this@SubcomposeLayout, layoutDirection)
                    val bottomInset = contentWindowInsets.getBottom(this@SubcomposeLayout)
                    measurable.measure(
                        looseConstraints.offset(
                            -leftInset - rightInset,
                            -bottomInset
                        )
                    ).takeIf { it.height != 0 && it.width != 0 }
                }

            val fabPlacement = if (fabPlaceables.isNotEmpty()) {
                val fabWidth = fabPlaceables.maxByOrNull { it.width }!!.width
                val fabHeight = fabPlaceables.maxByOrNull { it.height }!!.height
                // FAB distance from the left of the layout, taking into account LTR / RTL
                val fabLeftOffset = if (fabPosition == FabPosition.End) {
                    if (layoutDirection == LayoutDirection.Ltr) {
                        layoutWidth - FabSpacing.roundToPx() - fabWidth
                    } else {
                        FabSpacing.roundToPx()
                    }
                } else {
                    (layoutWidth - fabWidth) / 2
                }

                FabPlacement(
                    left = fabLeftOffset,
                    width = fabWidth,
                    height = fabHeight
                )
            } else {
                null
            }

            val bottomBarPlaceables = subcompose(ScaffoldLayoutContent.BottomBar) {
                CompositionLocalProvider(
                    LocalFabPlacement provides fabPlacement,
                    content = bottomBar
                )
            }.map { it.measure(looseConstraints) }

            val bottomBarHeight = bottomBarPlaceables.maxByOrNull { it.height }?.height
            val fabOffsetFromBottom = fabPlacement?.let {
                if (bottomBarHeight == null) {
                    it.height + FabSpacing.roundToPx() +
                            contentWindowInsets.getBottom(this@SubcomposeLayout)
                } else {
                    // Total height is the bottom bar height + the FAB height + the padding
                    // between the FAB and bottom bar
                    bottomBarHeight + it.height + FabSpacing.roundToPx()
                }
            }

            val snackbarOffsetFromBottom = if (snackbarHeight != 0) {
                snackbarHeight +
                        (fabOffsetFromBottom ?: bottomBarHeight
                        ?: contentWindowInsets.getBottom(this@SubcomposeLayout))
            } else {
                0
            }

            val bodyContentPlaceables = subcompose(ScaffoldLayoutContent.MainContent) {
                val insets = contentWindowInsets.asPaddingValues(this@SubcomposeLayout)
                val innerPadding = PaddingValues(
                    top =
                    if (topBarPlaceables.isEmpty()) {
                        insets.calculateTopPadding()
                    } else {
                        topBarHeight.toDp()
                    },
                    bottom =
                    if (bottomBarPlaceables.isEmpty() || bottomBarHeight == null) {
                        insets.calculateBottomPadding()
                    } else {
                        bottomBarHeight.toDp()
                    },
                    start = insets.calculateStartPadding((this@SubcomposeLayout).layoutDirection),
                    end = insets.calculateEndPadding((this@SubcomposeLayout).layoutDirection)
                )

                val isTopBarTransparent = LocalAppBarsState.current?.isTopBarTransparent?.value ?: true

                val isBottomBarTransparent = LocalAppBarsState.current?.isBottomBarTransparent?.value ?: true

                val topBarColor = LocalAppBarsState.current?.topBarColor?.value?.takeIf {
                    it.isSpecified
                }// ?: CupertinoTheme.colorScheme.secondarySystemGroupedBackground

                val bottomBarColor = LocalAppBarsState.current?.bottomBarColor?.value?.takeIf {
                    it.isSpecified
                } //?: CupertinoTheme.colorScheme.secondarySystemGroupedBackground

                val topColor = if (topBarColor != null) {
                    if (isTopBarTransparent) topBarColor.copy(alpha = 0f)
                        else topBarColor.copy(alpha = appBarsAlpha)

                } else null

                val bottomColor = if (bottomBarColor != null) {
                    if (isBottomBarTransparent)
                        bottomBarColor.copy(alpha = 0f)
                    else bottomBarColor.copy(alpha = appBarsAlpha)
                } else null

                val topModifier = if (isTopBarTransparent || topBarColor == null || topColor == null)
                    Modifier else Modifier.haze(
                    Rect(
                        left = 0f,
                        top = 0f,
                        right = layoutWidth.toFloat(),
                        bottom = topBarHeight.toFloat()
                    ),
                    backgroundColor = topBarColor,
                    tint = topColor,
                    blurRadius = appBarsBlurRadius
                )

                val bottomModifier = if (isBottomBarTransparent || bottomBarColor == null || bottomColor == null)
                    Modifier else Modifier.haze(
                    Rect(
                        left = 0f,
                        top = layoutHeight - (bottomBarHeight ?: 0f).toFloat(),
                        right = layoutWidth.toFloat(),
                        bottom = layoutHeight.toFloat()
                    ),
                    backgroundColor = bottomBarColor,
                    tint = bottomColor,
                    blurRadius = appBarsBlurRadius,
                )

                Box(
                    modifier = topModifier
                        .then(bottomModifier)
                ) {
                    content(innerPadding)
                }
            }.map { it.measure(looseConstraints) }

            // Placing to control drawing order to match default elevation of each placeable

            bodyContentPlaceables.forEach {
                it.place(0, 0)
            }
            topBarPlaceables.forEach {
                it.place(0, 0)
            }
            snackbarPlaceables.forEach {
                it.place(
                    (layoutWidth - snackbarWidth) / 2 +
                            contentWindowInsets.getLeft(this@SubcomposeLayout, layoutDirection),
                    layoutHeight - snackbarOffsetFromBottom
                )
            }
            // The bottom bar is always at the bottom of the layout
            bottomBarPlaceables.forEach {
                it.place(0, layoutHeight - (bottomBarHeight ?: 0))
            }
            // Explicitly not using placeRelative here as `leftOffset` already accounts for RTL
            fabPlacement?.let { placement ->
                fabPlaceables.forEach {
                    it.place(placement.left, layoutHeight - fabOffsetFromBottom!!)
                }
            }
        }
    }
}

/**
 * Object containing various default values for [Scaffold] component.
 */
object CupertinoScaffoldDefaults {
    /**
     * Default insets to be used and consumed by the scaffold content slot
     */
    val contentWindowInsets: WindowInsets
        @Composable
        get() = WindowInsets.systemBars


    val AppBarsAlpha = if (Accessibility.isReduceTransparencyEnabled)
        .85f else .5f

    val AppBarsBlurRadius = if (Accessibility.isReduceTransparencyEnabled)
        50.dp else 40.dp
}

/**
 * The possible positions for a [FloatingActionButton] attached to a [Scaffold].
 */
@kotlin.jvm.JvmInline
value class FabPosition internal constructor(@Suppress("unused") private val value: Int) {
    companion object {
        /**
         * Position FAB at the bottom of the screen in the center, above the [NavigationBar] (if it
         * exists)
         */
        val Center = FabPosition(0)

        /**
         * Position FAB at the bottom of the screen at the end, above the [NavigationBar] (if it
         * exists)
         */
        val End = FabPosition(1)
    }

    override fun toString(): String {
        return when (this) {
            Center -> "FabPosition.Center"
            else -> "FabPosition.End"
        }
    }
}

/**
 * Placement information for a [FloatingActionButton] inside a [Scaffold].
 *
 * @property left the FAB's offset from the left edge of the bottom bar, already adjusted for RTL
 * support
 * @property width the width of the FAB
 * @property height the height of the FAB
 */
@Immutable
internal class FabPlacement(
    val left: Int,
    val width: Int,
    val height: Int
)


/**
 * CompositionLocal containing a [FabPlacement] that is used to calculate the FAB bottom offset.
 */
internal val LocalFabPlacement = staticCompositionLocalOf<FabPlacement?> { null }

// FAB spacing above the bottom bar / bottom of the Scaffold
private val FabSpacing = 16.dp

private enum class ScaffoldLayoutContent { TopBar, MainContent, Snackbar, Fab, BottomBar }

internal class AppBarsState(
    val isTopBarTransparent : MutableState<Boolean> = mutableStateOf(true),
    val isBottomBarTransparent : MutableState<Boolean> = mutableStateOf(true),
    val topBarColor : MutableState<Color> = mutableStateOf(Color.Unspecified),
    val bottomBarColor : MutableState<Color> = mutableStateOf(Color.Unspecified)
)

internal val LocalAppBarsState = compositionLocalOf<AppBarsState?> {
    null
}

internal val LocalContainerColor = compositionLocalOf {
    Color.Unspecified
}