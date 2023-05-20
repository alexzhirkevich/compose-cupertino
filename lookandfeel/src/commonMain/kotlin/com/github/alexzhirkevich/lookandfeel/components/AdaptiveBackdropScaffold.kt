//@file:OptIn(ExperimentalMaterialApi::class)

@file:OptIn(ExperimentalMaterialApi::class)

package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.material.BackdropScaffold
import androidx.compose.material.BackdropScaffoldDefaults
import androidx.compose.material.BackdropScaffoldState
import androidx.compose.material.BackdropValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.SwipeableDefaults
import androidx.compose.material.rememberBackdropScaffoldState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoBackdropScaffold
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoAnimationSpec
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

@Composable
fun BackdropScaffoldDefaults.adaptiveAnimationSpec() =
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> BackdropScaffoldDefaults.cupertinoAnimationSpec()
        else -> SwipeableDefaults.AnimationSpec
    }
@Composable
fun BackdropScaffoldDefaults.adaptiveScrimColor() =
    when(currentLookAndFeel){
        LookAndFeel.Cupertino -> Color.Black.copy(alpha = 1/3f)
        else -> BackdropScaffoldDefaults.frontLayerScrimColor
    }


/**
 * Backdrop scaffold with default paramemeters translated to Material3
 *
 * For Cupertino look and feel front layer displays as modal view controller.
 * [peekHeight], [headerHeight], [stickyFrontLayer],[persistentAppBar] have no effect on this look and feel.
 *
 * @see BackdropScaffold
 * */
@Composable
@ExperimentalMaterialApi
fun AdaptiveBackdropScaffold(
    appBar: @Composable () -> Unit,
    backLayerContent: @Composable () -> Unit,
    frontLayerContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scaffoldState: BackdropScaffoldState = rememberBackdropScaffoldState(
        initialValue = BackdropValue.Concealed,
        animationSpec = BackdropScaffoldDefaults.adaptiveAnimationSpec()
    ),
    gesturesEnabled: Boolean = true,
    peekHeight: Dp = BackdropScaffoldDefaults.PeekHeight,
    headerHeight: Dp = BackdropScaffoldDefaults.HeaderHeight,
    persistentAppBar: Boolean = true,
    stickyFrontLayer: Boolean = true,
    backLayerBackgroundColor: Color = MaterialTheme.colorScheme.background,
    backLayerContentColor: Color = contentColorFor(backLayerBackgroundColor),
    frontLayerShape: Shape = MaterialTheme.shapes.large,
    frontLayerElevation: Dp = BackdropScaffoldDefaults.FrontLayerElevation,
    frontLayerBackgroundColor: Color = MaterialTheme.colorScheme.surface,
    frontLayerContentColor: Color = contentColorFor(frontLayerBackgroundColor),
    frontLayerScrimColor: Color = BackdropScaffoldDefaults.adaptiveScrimColor(),
    snackbarHost: @Composable (SnackbarHostState) -> Unit = { SnackbarHost(it) }
) {

    when (currentLookAndFeel) {
        LookAndFeel.Cupertino ->
            CupertinoBackdropScaffold(
                appBar = appBar,
                backLayerContent = backLayerContent,
                frontLayerContent = frontLayerContent,
                modifier = modifier,
                scaffoldState = scaffoldState,
                gesturesEnabled = gesturesEnabled,
                backLayerBackgroundColor = backLayerBackgroundColor,
                backLayerContentColor = backLayerContentColor,
                frontLayerShape = frontLayerShape,
                frontLayerElevation = frontLayerElevation,
                frontLayerBackgroundColor = frontLayerBackgroundColor,
                frontLayerContentColor = frontLayerContentColor,
                frontLayerScrimColor = frontLayerScrimColor,
                snackbarHost = snackbarHost
            )


        else -> BackdropScaffold(
            appBar = appBar,
            backLayerContent = backLayerContent,
            frontLayerContent = frontLayerContent,
            modifier = modifier,
            scaffoldState = scaffoldState,
            gesturesEnabled = gesturesEnabled,
            peekHeight = peekHeight,
            headerHeight = headerHeight,
            persistentAppBar = persistentAppBar,
            stickyFrontLayer = stickyFrontLayer,
            backLayerBackgroundColor = backLayerBackgroundColor,
            backLayerContentColor = backLayerContentColor,
            frontLayerShape = frontLayerShape,
            frontLayerElevation = frontLayerElevation,
            frontLayerBackgroundColor = frontLayerBackgroundColor,
            frontLayerContentColor = frontLayerContentColor,
            frontLayerScrimColor = frontLayerScrimColor,
            snackbarHost = snackbarHost
        )
    }
}


@Composable
internal expect fun applyPlatformBackdropScaffoldStyle(state: BackdropScaffoldState)
