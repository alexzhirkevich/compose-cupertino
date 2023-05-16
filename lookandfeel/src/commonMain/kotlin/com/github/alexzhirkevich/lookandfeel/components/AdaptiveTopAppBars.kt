package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoLargeTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoLargeTopAppBarColors
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoScrollBehavior
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import com.github.alexzhirkevich.lookandfeel.util.statusBars


@ExperimentalMaterial3Api
@Composable
fun AdaptiveTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.smallTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
){
    when(currentLookAndFeel){

        LookAndFeel.Cupertino -> CupertinoTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors
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
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
){
    when(LocalPlatformConfiguration.current?.lookAndFeel){

        LookAndFeel.Cupertino -> CupertinoTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors
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

@ExperimentalMaterial3Api
@Composable
fun TopAppBarDefaults.adaptiveLargeTopBarScrollBehavior(key : String?=null) : TopAppBarScrollBehavior?{
    return when(currentLookAndFeel){
        LookAndFeel.Cupertino -> cupertinoScrollBehavior(key)
        else -> exitUntilCollapsedScrollBehavior()
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

/**
 * @see LargeTopAppBar
 *
 * @param scrollableState State of the scrollable content that is connected with [scrollBehavior].nestedScrollConnection
 * Helps to adjust native look and feel
 * */
@ExperimentalMaterial3Api
@Composable
fun AdaptiveMediumTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scrollableState: ScrollableState?=null,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.adaptiveMediumTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
){
    when(LocalPlatformConfiguration.current?.lookAndFeel){

        LookAndFeel.Cupertino -> CupertinoLargeTopAppBar(
            title = title,
            scrollableState = scrollableState,
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

/**
 * @see LargeTopAppBar
 *
 * @param scrollableState State of the scrollable content that is connected with [scrollBehavior].nestedScrollConnection
 * Helps to adjust native look and feel
 * */
@ExperimentalMaterial3Api
@Composable
fun AdaptiveLargeTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scrollableState: ScrollableState?=null,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = WindowInsets.statusBars,
    colors: TopAppBarColors = TopAppBarDefaults.adaptiveLargeTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
){
    when(LocalPlatformConfiguration.current?.lookAndFeel){

        LookAndFeel.Cupertino -> CupertinoLargeTopAppBar(
            title = title,
            scrollableState = scrollableState,
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