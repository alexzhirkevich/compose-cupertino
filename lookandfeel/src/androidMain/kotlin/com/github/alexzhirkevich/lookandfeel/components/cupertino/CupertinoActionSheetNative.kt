package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable

@Composable
@NonRestartableComposable
actual fun CupertinoActionSheetNative(
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    buttons: CupertinoNativeAlertDialogButtonsScope.() -> Unit
) {
    CupertinoActionSheet(
        onDismissRequest = onDismissRequest,
        title = title?.let { { Text(it) } },
        message = message?.let { { Text(it) } },
        buttons = {
            fromNative(buttons)
        }
    )
}
