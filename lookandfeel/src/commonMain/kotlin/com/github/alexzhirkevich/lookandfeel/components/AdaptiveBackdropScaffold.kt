@file:OptIn(ExperimentalMaterialApi::class)

package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.material.BackdropScaffold
import androidx.compose.material.BackdropScaffoldDefaults
import androidx.compose.material.BackdropScaffoldState
import androidx.compose.material.BackdropValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.SwipeableDefaults
import androidx.compose.material.rememberBackdropScaffoldState
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoBackdropScaffold
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoBackdropScaffoldState
import com.github.alexzhirkevich.lookandfeel.components.cupertino.rememberCupertinoBackdropScaffoldState
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel


interface AdaptiveBackdropScaffoldState {

    val isRevealed : Boolean

    val isConcealed : Boolean

    suspend fun reveal()

    suspend fun conceal()
}

@Composable
fun rememberAdaptiveBackdropScaffoldState(
    initialValue: BackdropValue,
    animationSpec: AnimationSpec<Float> = SwipeableDefaults.AnimationSpec,
    confirmStateChange: (BackdropValue) -> Boolean = { true },
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() }
) : AdaptiveBackdropScaffoldState {

    return when(currentLookAndFeel) {
        LookAndFeel.Cupertino -> rememberCupertinoBackdropScaffoldState(
            initialValue = initialValue,
        )

        else -> {
            val state = rememberBackdropScaffoldState(
                initialValue,
                animationSpec,
                confirmStateChange,
                snackbarHostState
            )
            return remember(state) {
                AdaptiveBackdropScaffoldStateDelegate(state)
            }
        }
    }
}

/**
 * Backdrop scaffold with default paramemeters translated to Material3
 *
 * For Cupertino look and feel front layer displays as modal view controller.
 * [peekHeight], [stickyFrontLayer], [headerHeight] have no effect on this look and feel.
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
    scaffoldState: AdaptiveBackdropScaffoldState = rememberAdaptiveBackdropScaffoldState(BackdropValue.Concealed),
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
    frontLayerScrimColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.33f),
    snackbarHost: @Composable (SnackbarHostState) -> Unit = { SnackbarHost(it) }
){

    when (currentLookAndFeel){
        LookAndFeel.Cupertino -> {

            val state = scaffoldState as? CupertinoBackdropScaffoldState ?:
                throw IllegalArgumentException("scaffoldState for AdaptiveBackdropScaffold must be created using rememberAdaptiveBackdropScaffoldState")

            CupertinoBackdropScaffold(
                appBar = appBar,
                backLayerContent = backLayerContent,
                frontLayerContent = frontLayerContent,
                modifier = modifier,
                scaffoldState = state,
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

        else -> {
            val state = scaffoldState as? AdaptiveBackdropScaffoldStateDelegate ?:
                throw IllegalArgumentException("scaffoldState for AdaptiveBackdropScaffold must be created using rememberAdaptiveBackdropScaffoldState")

            BackdropScaffold(
                appBar = appBar,
                backLayerContent = backLayerContent,
                frontLayerContent = frontLayerContent,
                modifier = modifier,
                scaffoldState = state.backdropScaffoldState,
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
}


@Composable
internal expect fun applyPlatformBackdropScaffoldStyle(state: AdaptiveBackdropScaffoldState)

private class AdaptiveBackdropScaffoldStateDelegate(
    val backdropScaffoldState: BackdropScaffoldState
) : AdaptiveBackdropScaffoldState {
    override val isRevealed: Boolean by backdropScaffoldState::isRevealed
    override val isConcealed: Boolean by backdropScaffoldState::isConcealed

    override suspend fun reveal() = backdropScaffoldState.reveal()

    override suspend fun conceal() = backdropScaffoldState.conceal()
}