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

@OptIn(ExperimentalCupertinoApi::class)
@Composable
actual fun CupertinoAlertDialogNative(
    onDismissRequest : () -> Unit,
    title: String?,
    message: String?,
    containerColor : Color,
    shape: Shape,
    properties: DialogProperties,
    buttonsOrientation: Orientation,
    buttons : NativeAlertDialogActionsScope.() -> Unit
) {
    CupertinoAlertDialog(
        onDismissRequest = onDismissRequest,
        properties = properties,
        title = { CupertinoText(title.orEmpty()) },
        message = { CupertinoText(message.orEmpty()) },
        containerColor = containerColor,
        shape = shape,
        buttonsOrientation = buttonsOrientation,
        buttons = { fromNative(buttons) }
    )
}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
actual fun CupertinoActionSheetNative(
    visible : Boolean,
    onDismissRequest : () -> Unit,
    title : String?,
    message : String?,
    containerColor : Color,
    secondaryContainerColor : Color,
    properties: DialogProperties,
    buttons : NativeAlertDialogActionsScope.() -> Unit
) = CupertinoActionSheet(
    visible = visible,
    onDismissRequest = onDismissRequest,
    properties = properties,
    title = { CupertinoText(title.orEmpty()) },
    message = { CupertinoText(message.orEmpty()) },
    containerColor = containerColor,
    secondaryContainerColor = secondaryContainerColor,
    buttons = { fromNative(buttons) }
)