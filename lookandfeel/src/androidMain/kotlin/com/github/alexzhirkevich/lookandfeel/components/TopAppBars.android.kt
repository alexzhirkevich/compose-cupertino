package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Suppress("nothing_to_inline")
@ExperimentalMaterial3Api
@Composable
actual inline fun AdaptiveTopAppBar(
    noinline title: @Composable () -> Unit,
    modifier: Modifier,
    noinline navigationIcon: @Composable () -> Unit,
    noinline actions: @Composable RowScope.() -> Unit,
    windowInsets: WindowInsets,
    colors: TopAppBarColors,
    scrollBehavior: TopAppBarScrollBehavior?
) {
    androidx.compose.material3.TopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors
    )
}

@Suppress("nothing_to_inline")
@ExperimentalMaterial3Api
@Composable
actual inline fun AdaptiveCenterAlignedTopAppBar(
    noinline title: @Composable () -> Unit,
    modifier: Modifier,
    noinline navigationIcon: @Composable () -> Unit,
    noinline actions: @Composable RowScope.() -> Unit,
    windowInsets: WindowInsets,
    colors: TopAppBarColors,
    scrollBehavior: TopAppBarScrollBehavior?
) {
    androidx.compose.material3.CenterAlignedTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@Suppress("nothing_to_inline")
@ExperimentalMaterial3Api
@Composable
actual inline fun AdaptiveLargeTopAppBar(
    noinline title: @Composable () -> Unit,
    modifier: Modifier,
    noinline navigationIcon: @Composable () -> Unit,
    noinline actions: @Composable RowScope.() -> Unit,
    windowInsets: WindowInsets,
    colors: TopAppBarColors,
    scrollBehavior: TopAppBarScrollBehavior?
) {
    androidx.compose.material3.LargeTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}