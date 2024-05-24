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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.window.DialogProperties
import io.github.alexzhirkevich.cupertino.AlertActionStyle
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialogNative
import io.github.alexzhirkevich.cupertino.CupertinoDialogsDefaults
import io.github.alexzhirkevich.cupertino.NativeAlertDialogActionsScope
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.systemGray7


@ExperimentalAdaptiveApi
@Composable
fun AdaptiveAlertDialogNative(
    onDismissRequest: () -> Unit,
    title: String,
    message: String,
    properties: DialogProperties = DialogProperties(),
    adaptation : AdaptationScope<CupertinoAlertAdaptationNative, MaterialAlertAdaptationNative>.() -> Unit = {},
    buttons: NativeAlertDialogActionsScope.() -> Unit
) {
    AdaptiveWidget(
        adaptation = remember { AlertDialogAdaptationNative() },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoAlertDialogNative(
                onDismissRequest = onDismissRequest,
                title = title,
                message = message,
                containerColor = it.containerColor.takeOrElse {
                    CupertinoColors.systemGray7
                },
                shape = it.shape,
                properties = properties,
                buttonsOrientation = it.buttonsOrientation,
                buttons = buttons
            )
        },
        material = { m ->

            val scope = remember(buttons) {
                AdaptiveAlertDialogButtonScopeNative().apply(buttons)
            }

            AlertDialog(
                onDismissRequest = onDismissRequest,
                confirmButton = {
                    val btn = scope.buttons
                        .fastFirstOrNull { it.style != AlertActionStyle.Cancel }
                        ?: return@AlertDialog

                    m.confirmButton.invoke(
                        btn.style,
                        btn.enabled,
                        btn.onClick,
                        btn.title
                    )
                },
                dismissButton = scope.buttons
                    .fastFirstOrNull { it.style == AlertActionStyle.Cancel }
                    ?.let {
                        {
                            m.confirmButton.invoke(
                                it.style,
                                it.enabled,
                                it.onClick,
                                it.title
                            )
                        }
                    },
                shape = m.shape,
                title = m.title.let { { it(title) } },
                text = m.text.let { { it(message) } },
                containerColor = m.containerColor.takeOrElse {
                    AlertDialogDefaults.containerColor
                },
                properties = properties
            )
        }
    )
}

class MaterialAlertAdaptationNative internal constructor(

    var confirmButton: @Composable (
        style : AlertActionStyle,
        enabled : Boolean,
        onClick : () -> Unit,
        title: String
    ) -> Unit = { _, enabled, onClick, t ->
        Button(
            enabled = enabled,
            onClick = onClick,
        ){
            Text(t)
        }
    },

    var dismissButton: @Composable (
        style : AlertActionStyle,
        enabled : Boolean,
        onClick : () -> Unit,
        title: String
    ) -> Unit = { _, enabled, onClick, t ->
        TextButton(
            enabled = enabled,
            onClick = onClick,
        ){
            Text(t)
        }
    },

    var title : @Composable (String) -> Unit = {
        Text(it)
    },
    var text : @Composable (String) -> Unit = {
        Text(it)
    },
    var containerColor: Color,
    var shape : Shape
)

class CupertinoAlertAdaptationNative internal constructor(
    var containerColor: Color,
    var shape : Shape,
    var buttonsOrientation: Orientation = CupertinoDialogsDefaults.ButtonOrientation
)


@ExperimentalAdaptiveApi
@Stable
private class AlertDialogAdaptationNative :
    Adaptation<CupertinoAlertAdaptationNative, MaterialAlertAdaptationNative>() {
    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoAlertAdaptationNative {
        val containerColor = CupertinoDialogsDefaults.ContainerColor
        val shape = CupertinoDialogsDefaults.Shape

        return remember(containerColor, shape) {
            CupertinoAlertAdaptationNative(
                containerColor = containerColor,
                shape = shape
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialAlertAdaptationNative {

        val containerColor = AlertDialogDefaults.containerColor
        val shape = AlertDialogDefaults.shape

        return remember(containerColor,shape) {
            MaterialAlertAdaptationNative(
                containerColor = containerColor,
                shape = shape
            )
        }
    }
}

private class AdaptiveAlertDialogButtonDataNative(
    val onClick: () -> Unit,
    val style: AlertActionStyle,
    val enabled: Boolean,
    val title: String
)

private class AdaptiveAlertDialogButtonScopeNative : NativeAlertDialogActionsScope {

    val buttons = mutableListOf<AdaptiveAlertDialogButtonDataNative>()

    override fun action(
        onClick: () -> Unit,
        style: AlertActionStyle,
        enabled: Boolean,
        title: String
    ) {
        buttons += AdaptiveAlertDialogButtonDataNative(
            onClick = onClick,
            style = style,
            enabled = enabled,
            title = title
        )
    }
}

