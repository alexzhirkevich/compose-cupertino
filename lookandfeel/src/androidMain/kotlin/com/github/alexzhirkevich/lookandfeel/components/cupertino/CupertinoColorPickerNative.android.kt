@file:OptIn(ExperimentalAnimationApi::class)

package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.graphics.Color

@Composable
@NonRestartableComposable
actual fun CupertinoColorPickerDialogNative(
    color: Color,
    onColorChanged: (Color) -> Unit,
    onDismissRequest: () -> Unit,
    supportOpacity: Boolean
) {
    CupertinoColorPickerDialog(
        color = color,
        onColorChanged = onColorChanged,
        onDismissRequest = onDismissRequest,
        supportOpacity = supportOpacity,
        title = {}
    )
}