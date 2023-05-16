package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.currentCompositeKeyHash
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.zIndex


/**
 * Container of the dialog. Already provided by all kinds of Application
 * */
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun DialogContainer(
    content : @Composable () -> Unit
) {

    val state = remember { DialogState() }

    CompositionLocalProvider(LocalDialogState provides state) {
        Box {
            Box {
                content()
            }

            if (state.contents.isNotEmpty()) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(0) {
                        detectTapGestures {
                            state.contents.lastOrNull()?.onDismissRequest?.invoke()
                        }
                    })
            }

            state.contents.drop(1).forEach { dialog ->
                key(dialog.key) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(dialog.shadow),
                        content = dialog.content
                    )
                }
            }

            AnimatedContent(
                modifier = Modifier
                    .fillMaxSize()
                    .zIndex(Float.MAX_VALUE),
                targetState = state.contents.lastOrNull(),
                transitionSpec = {

                    // Show enter animation only this dialog was not visible
                    val enter = if (initialState == null)
                        targetState?.enterTransition ?: EnterTransition.None
                    else EnterTransition.None

                    val exit = initialState?.exitTransition ?: ExitTransition.None

                    enter with exit
                }
            ) { target ->

                val animatedBackground by animateColorAsState(target?.shadow ?: Color.Transparent)
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(animatedBackground)

                ) {
                    target?.content?.invoke(this)
                }
            }
        }
    }
}


/**
 * Dialog foundation. Should be called inside [DialogContainer].
 * All kinds of Application already provide this container
 *
 * @param visible is current dialog visible
 * Multiple dialogs can be visible at the same time in appearance order
 * @param onDismissRequest called when dialog wants to be dismissed
 * @param enterTransition transition of the dialog [content]
 * @param exitTransition exit transition of the dialog [content]
 * @param shadow applied to content behind the dialog
 * @param content of the dialog
 * */
@ExperimentalAnimationApi
@Composable
fun Dialog(
    visible : Boolean,
    onDismissRequest: () -> Unit,
    enterTransition: EnterTransition = EnterTransition.None,
    exitTransition: ExitTransition = ExitTransition.None,
    shadow: Color = Color.Black.copy(alpha = .25f),
    content: @Composable BoxScope.() -> Unit
) {
    val dialogState = LocalDialogState.current

    val hash = currentCompositeKeyHash

    DisposableEffect(visible) {
        if (visible) {
            dialogState.contents += DialogContent(
                key = hash,
                enterTransition = enterTransition,
                exitTransition = exitTransition,
                onDismissRequest = onDismissRequest,
                shadow = shadow,
                content = content
            )
        } else {
            dialogState.contents.removeAll { it.key == hash }
        }

        onDispose {
            dialogState.contents.removeAll { it.key == hash }
        }
    }
}

private class DialogContent(
    val key : Int,
    val enterTransition: EnterTransition,
    val exitTransition: ExitTransition,
    val shadow: Color = Color.Black.copy(alpha = .25f),
    val onDismissRequest : () -> Unit,
    val content: @Composable BoxScope.() -> Unit
)

private class DialogState {

    var contents =  mutableStateListOf<DialogContent>()
}

private val LocalDialogState = staticCompositionLocalOf<DialogState> {
    error("Dialogs can be displayed only inside DialogContainer or any kind of Application.")
}