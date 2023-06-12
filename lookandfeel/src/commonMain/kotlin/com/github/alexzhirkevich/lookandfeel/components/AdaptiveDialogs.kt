package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalContext
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.currentCompositeKeyHash
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.zIndex
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme


//@Composable
//private fun DialogContent(
//    allDialogContents : List<DialogContent>,
//    index : Int,
//) {
//
//    if (index<0)
//        return
//
//    val current = allDialogContents.getOrNull(index)
//
//    Box(current?.backContentModifier?.invoke() ?: Modifier) {
//        DialogContent(
//            allDialogContents,
//            index - 1,
//        )
//    }
//    if (current == null)
//        return
//    BoxWithConstraints(Modifier.fillMaxSize()) {
//        current.content(this, current.savedState)
//    }
//}

/**
 * Container of the dialog. Already provided by all kinds of Application
 *
 * @param content content that can display dialogs in this container
 * */
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun DialogContainer(
    content : @Composable () -> Unit
) {

    val state = remember { DialogState() }

    CompositionLocalProvider(
        LocalDialogState provides state
    ) {
//        Box(state.contents.firstOrNull()?.backContentModifier?.invoke() ?: Modifier) {
//            content()
//            DialogContent(
//                state.contents,
//                state.contents.lastIndex - 1,
//            )
//        }
        Box(
            modifier = state.contents.lastOrNull {
                it.backContentModifier != null
            }?.backContentModifier?.invoke() ?: Modifier
        ) {
            content()
        }
//
        if (state.contents.isNotEmpty()) {
            Box(modifier = Modifier
                .fillMaxSize()
                .pointerInput(0) {
                    detectTapGestures {
                        state.contents.lastOrNull()?.onDismissRequest?.invoke()
                    }
                })
        }
//
        state.contents.dropLast(1).forEach { dialog ->

            key(dialog.key) {
                CompositionLocalProvider(dialog.locals.invoke()) {
                    CompositionLocalProvider(LocalDialogContent provides dialog) {
                        BoxWithConstraints(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(dialog.shadow),
                            content = {
                                dialog.content(this, dialog.savedState)
                            }
                        )
                    }
                }
            }
        }
//
        val animatedBackground by animateColorAsState(
            state.contents.lastOrNull()?.shadow ?: Color.Transparent
        )

        AnimatedContent(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(Float.MAX_VALUE)
                .background(animatedBackground),
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

            CompositionLocalProvider(
                target?.locals?.invoke() ?: currentCompositionLocalContext,
            ) {
                CompositionLocalProvider(LocalDialogContent provides target) {
                    BoxWithConstraints(
                        Modifier
                            .fillMaxSize()
                    ) {
                        target?.content?.invoke(this, target.savedState)
                    }
                }
            }
        }
    }
}

/**
 * Dialog foundation. Should be called inside [DialogContainer].
 * All kinds of Application already provide this container
 *
 * Multiple dialogs can be visible at the same time in appearance order
 *
 * @param onDismissRequest called when dialog wants to be dismissed
 * @param enterTransition transition of the dialog [content]
 * @param exitTransition exit transition of the dialog [content]
 * @param shadow applied to content behind the dialog
 * @param content of the dialog
 * */
@ExperimentalAnimationApi
@Composable
fun Dialog(
    onDismissRequest: () -> Unit,
    enterTransition: EnterTransition = EnterTransition.None,
    exitTransition: ExitTransition = ExitTransition.None,
    shadow: Color = Color.Black.copy(alpha = .25f),
    backContentModifier: (@Composable () -> Modifier)? = null,
    content: @Composable BoxWithConstraintsScope.(MutableMap<String, Any?>) -> Unit,
) {
    val dialogState = LocalDialogState.current

    val hash = currentCompositeKeyHash

    val locals = @Composable { currentCompositionLocalContext }

    DisposableEffect(enterTransition, exitTransition, shadow) {
        val dialogContent = DialogContent(
            key = hash,
            enterTransition = enterTransition,
            exitTransition = exitTransition,
            onDismissRequest = onDismissRequest,
            shadow = shadow,
            backContentModifier = backContentModifier,
            content = content,
            locals = locals,
        )

        dialogState.contents += dialogContent

        onDispose {
            dialogState.contents -= dialogContent
        }
    }
}

/**
 * [Dialog] with [Alignment.BottomCenter] and sliding (by default) animation
 *
 * @param visible visibility flag
 * Multiple dialogs can be visible at the same time in appearance order
 * @param onDismissRequest called when dialog wants to be dismissed
 * @param enterTransition transition of the dialog [content]
 * @param exitTransition exit transition of the dialog [content]
 * @param shadow applied to content behind the dialog
 * @param content of the dialog
 * */
@ExperimentalAnimationApi
@NonRestartableComposable
@Composable
fun DialogSheet(
    onDismissRequest: () -> Unit,
    enterTransition: EnterTransition = remember { slideInVertically(spring(stiffness = Spring.StiffnessMediumLow)) { it } },
    exitTransition: ExitTransition = remember { slideOutVertically(spring(stiffness = Spring.StiffnessMediumLow)) { it } },
    shadow: Color = remember { Color.Black.copy(alpha = .25f) },
    backContentModifier: (@Composable () -> Modifier)? = { Modifier },
    content: @Composable (MutableMap<String,Any?>) -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        shadow = shadow,
        backContentModifier = backContentModifier,
        content = {
            Box(
                modifier = Modifier.align(Alignment.BottomCenter),
                content = { content(it) }
            )
        }
    )
}




/**
 * Platform date picker dialog. Does not respect look and feel.
 *
 * Multiple dialogs can be visible at the same time in appearance order
 * @param onDismissRequest called when dialog wants to be dismissed
 * @param value local date in seconds since 1970
 * @param onValueChanged selected date is changed
 * */
@ExperimentalAnimationApi
@Composable
expect fun DatePickerDialog(
    onDismissRequest: () -> Unit,
    value : Long,
    mode: DatePickerMode = DatePickerMode.DateTime,
    onValueChanged : (Long) -> Unit
)

enum class DatePickerMode {
    Time, Date, DateTime
}

/**
 * Platform date picker. Does not respect look and feel.
 *
 * @param value local date in seconds since 1970
 * @param onValueChanged selected date is changed
 * @param mode date picker type
 * @param containerColor background color
 * */
@Composable
expect fun DatePicker(
    value : Long,
    onValueChanged : (Long) -> Unit,
    modifier: Modifier = Modifier,
    mode: DatePickerMode = DatePickerMode.DateTime,
    containerColor : Color = AdaptiveTheme.colorScheme.surface
)



@Immutable
internal class DialogContent(
    val key : Int,
    val enterTransition: EnterTransition,
    val exitTransition: ExitTransition,
    val shadow: Color = Color.Black.copy(alpha = .25f),
    val onDismissRequest : () -> Unit,
    val backContentModifier: (@Composable () -> Modifier)?,
    val locals : @Composable () -> CompositionLocalContext,
    val savedState : MutableMap<String,Any?> = mutableMapOf(),
    val content: @Composable BoxWithConstraintsScope.(MutableMap<String,Any?>) -> Unit,
)

internal class DialogState {
    val contents =  mutableStateListOf<DialogContent>()
}

internal val LocalDialogContent = compositionLocalOf<DialogContent?> {
    null
}

internal val LocalDialogState = compositionLocalOf<DialogState> {
    error("Dialogs can be displayed only inside DialogContainer or any kind of Application.")
}