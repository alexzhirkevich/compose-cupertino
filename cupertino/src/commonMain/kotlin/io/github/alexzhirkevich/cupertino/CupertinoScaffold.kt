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
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastMap
import androidx.compose.ui.util.fastMapNotNull
import androidx.compose.ui.util.fastMaxOfOrNull
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

/**
 * Scaffold implements the basic cupertino and material design visual layout structure.
 *
 * This component provides API to put together several cupertino components to construct your
 * screen, by ensuring proper layout strategy for them and collecting necessary data so these
 * components will work together correctly.
 *
 * @param modifier the [Modifier] to be applied to this scaffold
 * @param topBar top app bar of the screen, typically a [CupertinoTopAppBar]
 * @param bottomBar bottom bar of the screen, typically a [CupertinoTopAppBar]
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
 * @param appBarsBlurAlpha app bars opacity level. Default lvl is similar to iOS one and
 * supports [Accessibility.isReduceTransparencyEnabled]
 * @param appBarsBlurAlpha app bars blur radius. Default radius is similar to iOS one and
 * supports [Accessibility.isReduceTransparencyEnabled]
 * @param content content of the screen. The lambda receives a [PaddingValues] that should be
 * applied to the content root via [Modifier.padding] and [Modifier.consumeWindowInsets] to
 * properly offset top and bottom bars. If using [Modifier.verticalScroll] or lazy lists,
 * apply this modifier to the child of the scroll, and not on the scrollable container itself.
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    containerColor: Color = CupertinoScaffoldDefaults.containerColor,
    contentColor: Color = CupertinoScaffoldDefaults.contentColor,
    contentWindowInsets: WindowInsets = CupertinoScaffoldDefaults.contentWindowInsets,
    appBarsBlurAlpha: Float = CupertinoScaffoldDefaults.AppBarsBlurAlpha,
    appBarsBlurRadius: Dp = CupertinoScaffoldDefaults.AppBarsBlurRadius,
    hasNavigationTitle: Boolean = false,
    content: @Composable (PaddingValues) -> Unit
) {

    val scaffoldCoordinates = remember {
        mutableStateOf<LayoutCoordinates?>(null)
    }
    val topBarHeight = remember {
        mutableStateOf(0f)
    }

    CupertinoSurface(
        modifier = modifier.onGloballyPositioned {
            scaffoldCoordinates.value = it
        },
        color = containerColor,
        contentColor = contentColor
    ) {

        val appbarState = remember { AppBarsState() }

        CompositionLocalProvider(
            LocalNavigationTitleVisible provides rememberSaveable {
                mutableStateOf(
                    hasNavigationTitle
                )
            },
            LocalScaffoldCoordinates provides scaffoldCoordinates,
            LocalTopBarHeight provides topBarHeight,
            LocalScaffoldInsets provides contentWindowInsets
        ) {
            ScaffoldLayout(
                topBarHeightLocal = topBarHeight,
                fabPosition = floatingActionButtonPosition,
                topBar = {
                    CompositionLocalProvider(
                        LocalContainerColor provides Color.Transparent,
                        LocalAppBarsState provides appbarState,
                        content = topBar
                    )
                },
                bottomBar = {
                    CompositionLocalProvider(
                        LocalContainerColor provides Color.Transparent,
                        LocalAppBarsState provides appbarState,
                        content = bottomBar
                    )
                },
                content = content,
                snackbar = snackbarHost,
                contentWindowInsets = contentWindowInsets,
                fab = floatingActionButton,
                appBarsAlpha = appBarsBlurAlpha,
                appBarsBlurRadius = appBarsBlurRadius,
                appBarsState = appbarState
            )
        }
    }
}


@Composable
private fun ScaffoldLayout(
    appBarsState: AppBarsState,
    topBarHeightLocal: MutableState<Float>,
    fabPosition: FabPosition,
    topBar: @Composable () -> Unit,
    content: @Composable (PaddingValues) -> Unit,
    snackbar: @Composable () -> Unit,
    fab: @Composable () -> Unit,
    contentWindowInsets: WindowInsets,
    appBarsAlpha: Float,
    appBarsBlurRadius: Dp,
    bottomBar: @Composable () -> Unit
) {
    SubcomposeLayout { constraints ->
        val layoutWidth = constraints.maxWidth
        val layoutHeight = constraints.maxHeight

        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        layout(layoutWidth, layoutHeight) {
            val topBarPlaceables = subcompose(ScaffoldLayoutContent.TopBar, topBar).fastMap {
                it.measure(looseConstraints)
            }

            val topBarHeight = topBarPlaceables.fastMaxOfOrNull { it.height } ?: 0
            topBarHeightLocal.value = topBarHeight.toFloat()
            val snackbarPlaceables = subcompose(ScaffoldLayoutContent.Snackbar, snackbar).fastMap {
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

            val snackbarHeight = snackbarPlaceables.fastMaxOfOrNull { it.height } ?: 0
            val snackbarWidth = snackbarPlaceables.fastMaxOfOrNull { it.width } ?: 0

            val fabPlaceables =
                subcompose(ScaffoldLayoutContent.Fab, fab).fastMapNotNull { measurable ->
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
                val fabWidth = fabPlaceables.fastMaxOfOrNull { it.width } ?: 0
                val fabHeight = fabPlaceables.fastMaxOfOrNull { it.height } ?: 0
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
            }.fastMap { it.measure(looseConstraints) }

            val bottomBarHeight = bottomBarPlaceables.fastMaxOfOrNull { it.height }
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

                val isTopBarTransparent =
                    appBarsState.isTopBarTransparent.value

                val isBottomBarTransparent =
                    appBarsState.isBottomBarTransparent.value

                val topBarColor = appBarsState.topBarColor.value.takeIf {
                    it.isSpecified
                }

                val bottomBarColor = appBarsState.bottomBarColor.value.takeIf {
                    it.isSpecified
                }

                val topColor = if (topBarColor != null) {
                    if (isTopBarTransparent) topBarColor.copy(alpha = 0f)
                    else topBarColor.copy(alpha = appBarsAlpha)

                } else null

                val bottomColor = if (bottomBarColor != null) {
                    if (isBottomBarTransparent)
                        bottomBarColor.copy(alpha = 0f)
                    else bottomBarColor.copy(alpha = appBarsAlpha)
                } else null

                val topModifier = if (
                    appBarsAlpha < Float.MIN_VALUE ||
                    isTopBarTransparent ||
                    topBarColor == null ||
                    topColor == null
                ) Modifier
                else Modifier.haze(
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

                val bottomModifier = if (
                    appBarsAlpha < Float.MIN_VALUE ||
                    isBottomBarTransparent ||
                    bottomBarColor == null ||
                    bottomColor == null
                ) Modifier
                else Modifier.haze(
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
            }.fastMap { it.measure(looseConstraints) }

            // Placing to control drawing order to match default elevation of each placeable

            bodyContentPlaceables.fastForEach {
                it.place(0, 0)
            }
            topBarPlaceables.fastForEach {
                it.place(0, 0)
            }
            snackbarPlaceables.fastForEach {
                it.place(
                    (layoutWidth - snackbarWidth) / 2 +
                            contentWindowInsets.getLeft(this@SubcomposeLayout, layoutDirection),
                    layoutHeight - snackbarOffsetFromBottom
                )
            }
            // The bottom bar is always at the bottom of the layout
            bottomBarPlaceables.fastForEach {
                it.place(0, layoutHeight - (bottomBarHeight ?: 0))
            }
            // Explicitly not using placeRelative here as `leftOffset` already accounts for RTL
            fabPlacement?.let { placement ->
                fabPlaceables.fastForEach {
                    it.place(placement.left, layoutHeight - fabOffsetFromBottom!!)
                }
            }
        }
    }
}

/**
 * Object containing various default values for [CupertinoScaffold] component.
 */
@Immutable
object CupertinoScaffoldDefaults {

    val AppBarsBlurAlpha = if (Accessibility.isReduceTransparencyEnabled)
        .85f else .5f

    val AppBarsBlurRadius = if (Accessibility.isReduceTransparencyEnabled)
        50.dp else 40.dp

    /**
     * Default insets to be used and consumed by the scaffold content slot
     */
    val contentWindowInsets: WindowInsets
        @Composable
        get() = WindowInsets.systemBars

    val containerColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.systemBackground

    val contentColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.label
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

internal val LocalScaffoldInsets = compositionLocalOf<WindowInsets?> {
    null
}

internal val LocalScaffoldCoordinates = compositionLocalOf<State<LayoutCoordinates?>> {
    mutableStateOf(null)
}

internal val LocalTopBarHeight = compositionLocalOf<State<Float?>> {
    mutableStateOf(null)
}

// FAB spacing above the bottom bar / bottom of the Scaffold
private val FabSpacing = 16.dp

private enum class ScaffoldLayoutContent { TopBar, MainContent, Snackbar, Fab, BottomBar }

internal class AppBarsState(
    val isTopBarTransparent: MutableState<Boolean> = mutableStateOf(true),
    val isBottomBarTransparent: MutableState<Boolean> = mutableStateOf(true),
    val topBarColor: MutableState<Color> = mutableStateOf(Color.Unspecified),
    val bottomBarColor: MutableState<Color> = mutableStateOf(Color.Unspecified)
)

internal val LocalAppBarsState = compositionLocalOf<AppBarsState?> {
    null
}

val LocalContainerColor = compositionLocalOf {
    Color.Unspecified
}

internal val LocalAppBarsBlurAlpha = compositionLocalOf {
    CupertinoScaffoldDefaults.AppBarsBlurAlpha
}

internal val LocalAppBarsBlurRadius = compositionLocalOf {
    CupertinoScaffoldDefaults.AppBarsBlurRadius

}