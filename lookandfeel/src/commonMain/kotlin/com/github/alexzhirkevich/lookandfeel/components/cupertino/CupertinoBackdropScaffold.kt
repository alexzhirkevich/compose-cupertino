@file:OptIn(ExperimentalMaterialApi::class)

package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.core.animate
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material.BackdropScaffoldDefaults
import androidx.compose.material.BackdropValue
import androidx.compose.material.DismissValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FractionalThreshold
import androidx.compose.material.LocalContentColor
import androidx.compose.material.ResistanceConfig
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.SwipeableDefaults
import androidx.compose.material.rememberDismissState
import androidx.compose.material.swipeable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveBackdropScaffoldState
import com.github.alexzhirkevich.lookandfeel.components.applyPlatformBackdropScaffoldStyle
import com.github.alexzhirkevich.lookandfeel.util.statusBars
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@ExperimentalMaterialApi
@Composable
fun CupertinoBackdropScaffold(
    appBar: @Composable () -> Unit,
    backLayerContent: @Composable () -> Unit,
    frontLayerContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scaffoldState: CupertinoBackdropScaffoldState = rememberCupertinoBackdropScaffoldState(BackdropValue.Concealed),
    gesturesEnabled: Boolean = true,
    peekHeight: Dp = BackdropScaffoldDefaults.PeekHeight,
    headerHeight: Dp = BackdropScaffoldDefaults.HeaderHeight,
    persistentAppBar: Boolean = true,
    stickyFrontLayer: Boolean = true,
    backLayerBackgroundColor: Color = MaterialTheme.colorScheme.primary,
    backLayerContentColor: Color = contentColorFor(
        backLayerBackgroundColor
    ),
    frontLayerShape: Shape = MaterialTheme.shapes.large,
    frontLayerElevation: Dp = BackdropScaffoldDefaults.FrontLayerElevation,
    frontLayerBackgroundColor: Color = MaterialTheme.colorScheme.surface,
    frontLayerContentColor: Color = contentColorFor(
        frontLayerBackgroundColor
    ),
    frontLayerScrimColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.60f),
    snackbarHost: @Composable (SnackbarHostState) -> Unit = { SnackbarHost(it) }
) {

    applyPlatformBackdropScaffoldStyle(scaffoldState)

    BoxWithConstraints(
        modifier = modifier
    ) {
        val frontVisible by remember {
            derivedStateOf {
                scaffoldState.progress > 0f
            }
        }

        Scaffold(
            modifier = Modifier
                .background(Color.Black)
                .drawWithContent {
                    drawContent()
                    drawRect(
                        color = frontLayerScrimColor,
                        alpha = scaffoldState.progress
                    )
                }
                .graphicsLayer {
                    scaleX = 1f - scaffoldState.progress / 10
                    scaleY = scaleX
                    if (frontVisible) {
                        shape = frontLayerShape
                        clip = true
                    }
                },
            topBar = appBar,
            snackbarHost = snackbarHost
        ) {
            CompositionLocalProvider(LocalContentColor provides backLayerContentColor) {
                backLayerContent()
            }
        }


        if (frontVisible) {

            with(LocalDensity.current) {
                val statusBars = WindowInsets.statusBars

                val height = remember(constraints.maxHeight, statusBars) {
                    (constraints.maxHeight - statusBars.getTop(this)).toDp() - 8.dp
                }

                val scope = rememberCoroutineScope()

                val dismissState = rememberDismissState {
                    if (it == DismissValue.DismissedToEnd){
                        scope.launch {
                            scaffoldState.conceal()
                        }
                    }
                    if (it == DismissValue.Default){
                        scope.launch {
                            scaffoldState.reveal()
                        }
                    }
                    true
                }

                LaunchedEffect(dismissState.progress.fraction) {
                    if (dismissState.progress.fraction != 1f)
                        scaffoldState.progress = 1f - dismissState.progress.fraction
                }

                val anchors = mutableMapOf(
                    0f to DismissValue.Default,
                    height.toPx() to DismissValue.DismissedToEnd
                )

                Box(Modifier
                    .width(constraints.maxWidth.toDp())
                    .height(height)
                    .align(Alignment.BottomCenter)
                    .offset {
                        IntOffset(
                            0,
                            (height.toPx() * (1f - scaffoldState.progress)).roundToInt()
                        )
                    }
                    .shadow(
                        elevation = frontLayerElevation,
                        shape = frontLayerShape,
                        clip = true
                    )
                    .background(frontLayerBackgroundColor)
                    .swipeable(
                        state = dismissState,
                        anchors = anchors,
                        thresholds = { _, _ -> FractionalThreshold(.5f) },
                        orientation = Orientation.Vertical,
                        enabled = gesturesEnabled,
                        reverseDirection = false,
                        resistance = ResistanceConfig(
                            basis = height.toPx(),
                            factorAtMin = SwipeableDefaults.StiffResistanceFactor,
                            factorAtMax = SwipeableDefaults.StandardResistanceFactor
                        )
                    )
                ) {
                    Column {
                        if (persistentAppBar) {
                            appBar()
                        }
                        CompositionLocalProvider(LocalContentColor provides frontLayerContentColor) {
                            frontLayerContent()
                        }
                    }
                }
            }
        }
    }
}

class CupertinoBackdropScaffoldState(
    internal val initiallyVisible: Boolean
) : AdaptiveBackdropScaffoldState {

    internal var progress by mutableStateOf(if (initiallyVisible) 1f else 0f)
    
    override val isRevealed: Boolean
        get() = progress == 1f
    override val isConcealed: Boolean
        get() = progress == 0f

    override suspend fun reveal() {
        animate(
            initialValue = progress,
            targetValue = 1f,
            animationSpec =  if (progress == 0f) tween() else spring()
        ){ v, _ ->
            progress = v
        }
    }

    override suspend fun conceal() {
        animate(
            initialValue = progress,
            targetValue = 0f,
            animationSpec = if (progress == 1f) tween() else spring()
        ){ v, _ ->
            progress = v
        }
    }

    companion object {
        fun Saver(): Saver<CupertinoBackdropScaffoldState, *> = Saver(
            save = { it.isRevealed },
            restore = {
                CupertinoBackdropScaffoldState(
                    initiallyVisible = it
                )
            }
        )
    }
}

@Composable
fun rememberCupertinoBackdropScaffoldState(
    initialValue: BackdropValue,
) : CupertinoBackdropScaffoldState {

    return rememberSaveable(
        saver = CupertinoBackdropScaffoldState.Saver()
    ) {
        CupertinoBackdropScaffoldState(initialValue == BackdropValue.Revealed)
    }
}
