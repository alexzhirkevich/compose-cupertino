package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun CupertinoColorPickerButton(
    color: Color,
    onClick: () -> Unit
) {
    TODO("Not implemented")

}

/**
 * Compose color picker dialog in iOS style.
 *
 * To use UIKit color picker on iOS (14+) use [CupertinoColorPickerNative].
 * This picker will be used for other platforms and iOS < 14
 * */
@Composable
fun CupertinoColorPicker(
    color: Color,
    onColorChanged : (Color) -> Unit,
    onDismissRequest : () -> Unit,
    supportOpacity : Boolean = true
) {
    TODO("Not implemented")
}

/**
 * Native iOS color picker sheet. Available for iOS 14+
 *
 * On other platforms and iOS < 14 [CupertinoColorPicker] will be used
 * */
@Composable
fun CupertinoColorPickerNative(
    color: Color,
    onColorChanged : (Color) -> Unit,
    onDismissRequest : () -> Unit,
    supportOpacity : Boolean = true
) {
    TODO("Not implemented")

}