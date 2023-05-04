package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoScaffold
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.PlatformTheme

/**
 * Helps to apply native look and feel for top bar.
 * */
enum class TopBarType {

    /**
     * iOS: uses inline style
     * */
    Small,

    /**
     * iOS: uses inline style
     * */
    CenterAligned,

    /**
     * iOs: appears as large. Scrolls with content and then transforms to inline
     * */
    Large,

    /**
     * Uses default material3 style for all platforms
     * */
    Unspecified
}

/**
 * @see Scaffold
 *
 * @param topBarType helps to add native look and feel for top bar.
 */
@ExperimentalMaterial3Api
@Composable
fun AdaptiveScaffold(
    modifier: Modifier = Modifier,
    topBarType: TopBarType = TopBarType.Unspecified,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    containerColor: Color = MaterialTheme.colorScheme.background,
    contentColor: Color = contentColorFor(containerColor),
    contentWindowInsets: WindowInsets = ScaffoldDefaults.contentWindowInsets,
    content: @Composable (PaddingValues, @Composable (ScrollableState?) -> Unit) -> Unit
){
    when(LocalPlatformConfiguration.current?.theme){
        PlatformTheme.Cupertino -> CupertinoScaffold(
            modifier = modifier,
            topBarType = topBarType,
            topBar = topBar,
            bottomBar = bottomBar,
            snackbarHost = snackbarHost,
            floatingActionButton = floatingActionButton,
            floatingActionButtonPosition = floatingActionButtonPosition,
            containerColor = containerColor,
            contentColor = contentColor,
            contentWindowInsets = contentWindowInsets,
            content = content
        )

        else -> Scaffold(
            modifier = modifier,
            topBar = topBar,
            bottomBar = bottomBar,
            snackbarHost = snackbarHost,
            floatingActionButton = floatingActionButton,
            floatingActionButtonPosition = floatingActionButtonPosition,
            containerColor = containerColor,
            contentColor = contentColor,
            contentWindowInsets = contentWindowInsets,
            content = { content(it){} }
        )
    }
}