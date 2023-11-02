package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.DialogProperties

@Composable
actual fun CupertinoAlertDialogNative(
    onDismissRequest : () -> Unit,
    title: String?,
    message: String?,
    containerColor : Color,
    properties: DialogProperties,
    buttonsOrientation: Orientation,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
) {
    CupertinoAlertDialog(
        onDismissRequest = onDismissRequest,
        properties = properties,
        title = { CupertinoText(title.orEmpty()) },
        message = { CupertinoText(message.orEmpty()) },
        containerColor = containerColor,
        buttonsOrientation = buttonsOrientation,
        buttons = { fromNative(buttons) }
    )
}

@Composable
actual fun CupertinoActionSheetNative(
    onDismissRequest : () -> Unit,
    title : String?,
    message : String?,
    containerColor : Color,
    secondaryContainerColor : Color,
    properties: DialogProperties,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
) = CupertinoActionSheet(
    onDismissRequest = onDismissRequest,
    properties = properties,
    title = { CupertinoText(title.orEmpty()) },
    message = { CupertinoText(message.orEmpty()) },
    containerColor = containerColor,
    secondaryContainerColor = secondaryContainerColor,
    buttons = { fromNative(buttons) }
)