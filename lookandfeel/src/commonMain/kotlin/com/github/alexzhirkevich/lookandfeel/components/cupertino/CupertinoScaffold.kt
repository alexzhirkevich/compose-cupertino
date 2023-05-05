@file: Suppress("INVISIBLE_MEMBER")

package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.offset
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FixedThreshold
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.TopBarType
import com.github.alexzhirkevich.lookandfeel.util.safeContent

@OptIn(ExperimentalMaterialApi::class)
@Composable
@ExperimentalMaterial3Api
fun CupertinoScaffold(
    modifier: Modifier,
    topBarType: TopBarType,
    topBar: @Composable () -> Unit,
    bottomBar: @Composable () -> Unit,
    snackbarHost: @Composable () -> Unit,
    floatingActionButton: @Composable () -> Unit,
    floatingActionButtonPosition: FabPosition,
    containerColor: Color,
    contentColor: Color,
    contentWindowInsets: WindowInsets,
    content: @Composable (PaddingValues, @Composable (ScrollableState?) -> Unit) -> Unit
) {

    val inlineTopBar by rememberUpdatedState(topBarType != TopBarType.Large)

    androidx.compose.material3.Scaffold(
        modifier = modifier,
        topBar = {
            AnimatedVisibility(
                visible = inlineTopBar,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Column {
                    topBar()
                    Divider()
                }
            }
        },
        bottomBar = bottomBar,
        snackbarHost = snackbarHost,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = floatingActionButtonPosition,
        containerColor = containerColor,
        contentColor = contentColor,
        contentWindowInsets = contentWindowInsets
    ) {

        val pull = rememberPullRefreshState(
            refreshing = false,
            onRefresh = {},
            refreshThreshold = 120.dp
        )

        Box(Modifier
            .pullRefresh(pull)
            .graphicsLayer {
                translationY = pull.position
            }) {
            content(it) {

            }
        }
    }
}