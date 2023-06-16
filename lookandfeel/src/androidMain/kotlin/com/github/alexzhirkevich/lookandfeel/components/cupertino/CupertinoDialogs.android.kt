package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.unit.Dp
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme

@Composable
@NonRestartableComposable
actual fun CupertinoActionSheetNative(
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    containerColor : Color,
    buttons: CupertinoNativeAlertDialogButtonsScope.() -> Unit
) {
    CupertinoActionSheet(
        onDismissRequest = onDismissRequest,
        title = title?.let { { Text(it) } },
        message = message?.let { { Text(it) } },
        containerColor = containerColor,
        buttons = {
            fromNative(buttons)
        }
    )
}

@Composable
@NonRestartableComposable
actual fun CupertinoAlertDialogNative(
    onDismissRequest : () -> Unit,
    title: String?,
    message: String?,
    containerColor : Color,
    buttonsOrientation: Orientation,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
){
    CupertinoAlertDialog(
        onDismissRequest = onDismissRequest,
        title = { Text(title.orEmpty()) },
        message = { Text(message.orEmpty()) },
        containerColor = if (containerColor.isSpecified)
            containerColor else AdaptiveTheme.colorScheme.tertiaryContainer,
        buttons = {
            fromNative(buttons)
        },
    )
}


@OptIn(ExperimentalAnimationApi::class)
@Composable
@NonRestartableComposable
actual fun CupertinoSheetNative(
    onDismissRequest: () -> Unit,
    containerColor: Color,
    shape: Shape,
    elevation : Dp,
    gesturesEnabled : Boolean,
    content: @Composable () -> Unit
) = CupertinoSheet(
    onDismissRequest = onDismissRequest,
    containerColor = containerColor,
    shape = shape,
    elevation = elevation,
    gesturesEnabled = gesturesEnabled,
    content = content
)
