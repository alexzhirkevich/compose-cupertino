package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.rememberSplineBasedDecay
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoLargeTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoLargeTopAppBarColors
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoScrollBehavior
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.ScrollOverflowState
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel.Cupertino
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import com.github.alexzhirkevich.lookandfeel.util.statusBars

/**
 * @see TopAppBar
 *
 * @param isTransparent [[Cupertino]] set container opacity to zero and hide divider
 * (default behavior of divider, can be changed with [withDivider] argument of cupertino).
 * Typical use case is when [ScrollableState.canScrollForward] is false.
 * Or if your scrollable container has padding you can set
 * [ScrollState.maxValue] - [ScrollState.value] < padding
 * */
@ExperimentalMaterial3Api
@Composable
fun AdaptiveTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.smallTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
    isTransparent: () -> Boolean = { false },
){
    when(currentLookAndFeel){

        LookAndFeel.Cupertino -> CupertinoTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            isTransparent = isTransparent
        )

        else -> TopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior
        )
    }
}


@ExperimentalMaterial3Api
@Composable
fun AdaptiveCenterAlignedTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets  = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
    isTransparent: () -> Boolean = { false },
){
    when(LocalPlatformConfiguration.current?.lookAndFeel){

        LookAndFeel.Cupertino -> CupertinoTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            isTransparent = isTransparent,
        )

        else -> CenterAlignedTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior
        )
    }
}

/**
 * @see LargeTopAppBar
 *
 * @param isTransparent [[Cupertino]] set container opacity to zero and hide divider
 * (default behavior of divider, can be changed with [withDivider] argument of cupertino).
 * Typical use case is when [ScrollableState.canScrollForward] is false.
 * Or if your scrollable container has padding you can set
 * [ScrollState.maxValue] - [ScrollState.value] < padding
 * @param scrollOverflowState State of the adaptive content scroll overflow.
 * */
@ExperimentalMaterial3Api
@Composable
fun AdaptiveMediumTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scrollOverflowState: ScrollOverflowState?=null,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.adaptiveMediumTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,
    isTransparent: () -> Boolean = { false },
){
    when(LocalPlatformConfiguration.current?.lookAndFeel){

        LookAndFeel.Cupertino -> CupertinoLargeTopAppBar(
            title = title,
            scrollOverflowState = scrollOverflowState,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior,
            isTransparent = isTransparent,
        )

        else -> LargeTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior
        )
    }
}

/**
 * @see [NavigationBar]
 *
 * @param isTransparent [[Cupertino]] set container opacity to zero and hide divider
 * (default behavior of divider, can be changed with [withDivider] argument of cupertino).
 * Typical use case is when [ScrollableState.canScrollForward] is false.
 * Or if your scrollable container has padding you can set
 * [ScrollState.maxValue] - [ScrollState.value] < padding
 * [ScrollState.maxValue] - [ScrollState.value] < padding
 * */
@ExperimentalMaterial3Api
@Composable
fun AdaptiveLargeTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scrollOverflowState: ScrollOverflowState?=null,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.adaptiveLargeTopAppBarColors(),
    isTransparent : () -> Boolean = { false },
    scrollBehavior: TopAppBarScrollBehavior? = null
){
    when(LocalPlatformConfiguration.current?.lookAndFeel){

        LookAndFeel.Cupertino -> CupertinoLargeTopAppBar(
            title = title,
            isTransparent = isTransparent,
            scrollOverflowState = scrollOverflowState,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior
        )

        else -> LargeTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior
        )
    }
}


@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.adaptiveExitUntilCollapsedTopBarScrollBehavior(
    key : String?=null,
    state: TopAppBarState = com.github.alexzhirkevich.lookandfeel.util.rememberTopAppBarState(key = key),
    canScroll: () -> Boolean = { true },
    snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
    flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay()
) : TopAppBarScrollBehavior {
    return when (currentLookAndFeel) {
        LookAndFeel.Cupertino -> cupertinoScrollBehavior(
            key = key,
            state = state,
            canScroll = canScroll,
            snapAnimationSpec = snapAnimationSpec,
            flingAnimationSpec = flingAnimationSpec
        )

        else -> exitUntilCollapsedScrollBehavior(
            state = state,
            canScroll = canScroll,
            snapAnimationSpec = snapAnimationSpec,
            flingAnimationSpec = flingAnimationSpec
        )
    }
}

@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.adaptiveMediumTopAppBarColors(
    containerColor : Color = AdaptiveTheme.colorScheme.surface
) : TopAppBarColors {
    return when (currentLookAndFeel) {
        LookAndFeel.Cupertino -> cupertinoLargeTopAppBarColors(
            containerColor = containerColor
        )

        else -> mediumTopAppBarColors(
            containerColor = containerColor
        )
    }
}

@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.adaptiveLargeTopAppBarColors(
    containerColor : Color = AdaptiveTheme.colorScheme.surface,
) : TopAppBarColors {
    return when (currentLookAndFeel) {
        LookAndFeel.Cupertino -> cupertinoLargeTopAppBarColors(
            containerColor = containerColor
        )

        else -> largeTopAppBarColors(
            containerColor = containerColor
        )
    }
}