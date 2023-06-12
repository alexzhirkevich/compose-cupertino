@file:OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterialApi::class
)

package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BackdropScaffoldDefaults
import androidx.compose.material.BackdropScaffoldState
import androidx.compose.material.BackdropValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FractionalThreshold
import androidx.compose.material.LocalContentColor
import androidx.compose.material.ResistanceConfig
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.SwipeableDefaults
import androidx.compose.material.rememberBackdropScaffoldState
import androidx.compose.material.swipeable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
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
import com.github.alexzhirkevich.lookandfeel.components.applyPlatformBackdropScaffoldStyle
import com.github.alexzhirkevich.lookandfeel.util.statusBars
import kotlin.math.roundToInt

fun BackdropScaffoldDefaults.cupertinoAnimationSpec() =
    spring<Float>(stiffness = Spring.StiffnessMediumLow)

@ExperimentalMaterialApi
@Composable
fun CupertinoBackdropScaffold(
    appBar: @Composable () -> Unit,
    backLayerContent: @Composable () -> Unit,
    frontLayerContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scaffoldState: BackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed),
    gesturesEnabled: Boolean = true,
    backLayerBackgroundColor: Color = androidx.compose.material.MaterialTheme.colors.primary,
    backLayerContentColor: Color = androidx.compose.material.contentColorFor(
        backLayerBackgroundColor
    ),
    frontLayerShape: Shape = BackdropScaffoldDefaults.frontLayerShape,
    frontLayerElevation: Dp = BackdropScaffoldDefaults.FrontLayerElevation,
    frontLayerBackgroundColor: Color = androidx.compose.material.MaterialTheme.colors.surface,
    frontLayerContentColor: Color = androidx.compose.material.contentColorFor(
        frontLayerBackgroundColor
    ),
    frontLayerScrimColor: Color = Color.Black.copy(alpha = 1/3f),
    snackbarHost: @Composable (SnackbarHostState) -> Unit = { SnackbarHost(it) }
) {

    applyPlatformBackdropScaffoldStyle(scaffoldState)
    val density = LocalDensity.current

    BoxWithConstraints(
        modifier = modifier
    ) {

        val statusBars = WindowInsets.statusBars
        val height = remember(constraints.maxHeight, statusBars) {
            (constraints.maxHeight - statusBars.getTop(density)) -
                    density.run { 6.dp.toPx() }
        }

        val actualProgress = {
            1f - scaffoldState.offset.value / height
        }


        Scaffold(
            modifier = Modifier
                .background(Color.Black)
                .drawWithContent {
                    drawContent()
                    drawRect(
                        color = frontLayerScrimColor,
                        alpha = actualProgress()
                    )
                }
                .graphicsLayer {
                    scaleX = 1 - actualProgress() / 10
                    scaleY = scaleX
                    if (actualProgress() > 0) {
                        shape = frontLayerShape
                        clip = true
                    }
                },
            topBar = appBar,
            backgroundColor = backLayerBackgroundColor,
            contentColor = backLayerContentColor,
            snackbarHost = snackbarHost
        ) {
            Box(Modifier.padding(it)) {
                backLayerContent()
            }
        }


        val anchors = remember(height) {
            mutableMapOf(
                0f to BackdropValue.Concealed,
                height to BackdropValue.Revealed
            )
        }

        Box(Modifier
            .width(density.run { constraints.maxWidth.toDp() })
            .height(density.run { height.toDp() })
            .align(Alignment.BottomCenter)
            .offset {
                IntOffset(0, scaffoldState.offset.value.roundToInt())
            }
            .shadow(
                elevation = frontLayerElevation,
                shape = frontLayerShape,
                clip = true
            )
            .background(frontLayerBackgroundColor)
            .swipeable(
                state = scaffoldState,
                anchors = anchors,
                thresholds = { from, _ ->
                    FractionalThreshold(
                        fraction = if (from == BackdropValue.Concealed) .35f else .65f
                    )
                },
                orientation = Orientation.Vertical,
                enabled = gesturesEnabled,
                reverseDirection = false,
                resistance = ResistanceConfig(
                    basis = height,
                    factorAtMin = SwipeableDefaults.StiffResistanceFactor,
                    factorAtMax = SwipeableDefaults.StandardResistanceFactor
                )
            )
        ) {

            CompositionLocalProvider(LocalContentColor provides frontLayerContentColor) {
                frontLayerContent()
            }
        }
    }
}
