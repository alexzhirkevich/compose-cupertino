/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.window.DialogProperties
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.systemGray7

/**
 * Native analog for the compose [CupertinoAlertDialog].
 *
 * @param onDismissRequest called when dialog is already dismissed. Must not be ignored
 * @param title alert dialog title
 * @param message alert dialog message
 * @param containerColor not used in native dialog
 * @param shape not used in native dialog
 * @param properties not used. To enable dismissOnClickOutside behavior
 * add an action with [AlertActionStyle.Cancel] that would receive a cancel callback.
 * @param buttonsOrientation not used. iOS automatically picks most suitable layout
 * based on buttons width and count
 * @param buttons actions builder block
 * */
@Composable
expect fun CupertinoAlertDialogNative(
    onDismissRequest : () -> Unit,
    title: String?,
    message: String? = null,
    containerColor : Color = CupertinoColors.systemGray7,
    shape: Shape = CupertinoDialogsDefaults.Shape,
    properties: DialogProperties = DialogProperties(),
    buttonsOrientation: Orientation = Orientation.Horizontal,
    buttons : NativeAlertDialogActionsScope.() -> Unit
)


/**
 * Native analog for the compose [CupertinoActionSheet].
 *
 * @param onDismissRequest called when dialog is already dismissed. Must not be ignored
 * @param title alert dialog title
 * @param message alert dialog message
 * @param containerColor not used in native dialog
 * @param secondaryContainerColor not used in native dialog
 * @param properties not used. To enable dismissOnClickOutside behavior
 * add an action with [AlertActionStyle.Cancel] that would receive a cancel callback.
 * @param buttons actions builder block
 * */
@Composable
expect fun CupertinoActionSheetNative(
    visible : Boolean,
    onDismissRequest : () -> Unit,
    title : String? = null,
    message : String? = null,
    containerColor : Color = CupertinoColors.systemGray7,
    secondaryContainerColor : Color = CupertinoTheme.colorScheme.tertiarySystemBackground,
    properties: DialogProperties = DialogProperties(),
    buttons : NativeAlertDialogActionsScope.() -> Unit
)


interface NativeAlertDialogActionsScope {

    /**
     * Alert controller button
     * */
    fun action(
        onClick : () -> Unit,
        style : AlertActionStyle = AlertActionStyle.Default,
        enabled : Boolean = true,
        title : String
    )
}

/**
 * Alert controller button with default style
 * */
fun NativeAlertDialogActionsScope.default(
    onClick : () -> Unit,
    enabled : Boolean = true,
    title : String
) = action(
    onClick = onClick,
    style = AlertActionStyle.Default,
    enabled = enabled,
    title = title
)

/**
 * Alert controller button with destructive style
 * */
fun NativeAlertDialogActionsScope.destructive(
    onClick : () -> Unit,
    enabled : Boolean = true,
    title : String
) = action(
    onClick = onClick,
    style = AlertActionStyle.Destructive,
    enabled = enabled,
    title = title
)

/**
 * Alert controller button with cancel style
 * */
fun NativeAlertDialogActionsScope.cancel(
    onClick : () -> Unit,
    enabled : Boolean = true,
    title : String
) = action(
    onClick = onClick,
    style = AlertActionStyle.Cancel,
    enabled = enabled,
    title = title
)




internal class CupertinoAlertDialogButtonNative(
    val onClick: () -> Unit,
    val style: AlertActionStyle,
    val enabled : Boolean,
    val title: String
)


internal fun AlertDialogActionsScope.fromNative(
    native : NativeAlertDialogActionsScope.() -> Unit
) {

    val buttons = mutableListOf<CupertinoAlertDialogButtonNative>()

    object : NativeAlertDialogActionsScope {
        override fun action(
            onClick: () -> Unit,
            style: AlertActionStyle,
            enabled : Boolean,
            title: String
        ) {
            buttons.add(
                CupertinoAlertDialogButtonNative(
                    onClick = onClick,
                    style = style,
                    title = title,
                    enabled = enabled
                )
            )
        }
    }.apply(native)

    buttons.forEach {
        action(
            onClick = it.onClick,
            style = it.style,
            enabled = it.enabled
        ) {
            CupertinoText(it.title)
        }
    }
}