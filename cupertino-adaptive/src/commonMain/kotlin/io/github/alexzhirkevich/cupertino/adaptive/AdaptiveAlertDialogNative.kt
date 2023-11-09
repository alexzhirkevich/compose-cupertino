/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.window.DialogProperties
import io.github.alexzhirkevich.cupertino.AlertActionStyle
import io.github.alexzhirkevich.cupertino.AlertDialogButtonsScope
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialog
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialogNative
import io.github.alexzhirkevich.cupertino.CupertinoDialogsDefaults
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.NativeAlertDialogButtonsScope
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.SystemGray7


@ExperimentalAdaptiveApi
@Composable
fun AdaptiveAlertDialogNative(
    onDismissRequest: () -> Unit,
    title: String,
    message: String,
    properties: DialogProperties = DialogProperties(),
    adaptation : @Composable AdaptationScope<CupertinoAlertAdaptationNative, MaterialAlertAdaptationNative>.() -> Unit = {},
    buttons: NativeAlertDialogButtonsScope.() -> Unit
) {
    AdaptiveWidget(
        adaptationScope = remember { AlertDialogAdaptationScopeNative() },
        adaptation = adaptation,
        cupertino = {
            CupertinoAlertDialogNative(
                onDismissRequest = onDismissRequest,
                title = title,
                message = message,
                containerColor = it?.containerColor.takeOrElse {
                    CupertinoColors.SystemGray7
                },
                shape = it?.shape ?: CupertinoDialogsDefaults.shape,
                properties = properties,
                buttonsOrientation = it?.buttonsOrientation
                    ?: CupertinoDialogsDefaults.buttonOrientation,
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

                    m?.confirmButton?.invoke(
                        style = btn.style,
                        enabled = btn.enabled,
                        onClick = btn.onClick,
                        title = btn.title
                    )
                },
                dismissButton = scope.buttons
                    .fastFirstOrNull { it.style == AlertActionStyle.Cancel }
                    ?.let {
                        {
                            m?.confirmButton?.invoke(
                                style = it.style,
                                enabled = it.enabled,
                                onClick = it.onClick,
                                title = it.title
                            )
                        }
                    },
                shape = m?.shape ?: AlertDialogDefaults.shape,
                title = m?.title?.let { { it(title) } },
                text = m?.text?.let { { it(message) } },
                containerColor = m?.containerColor.takeOrElse {
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
    var buttonsOrientation: Orientation
)


@Stable
private class AlertDialogAdaptationScopeNative :
    AdaptationScope<CupertinoAlertAdaptationNative, MaterialAlertAdaptationNative>() {

    override var material by mutableStateOf<MaterialAlertAdaptationNative?>(null)
        private set

    override var cupertino by mutableStateOf<CupertinoAlertAdaptationNative?>(null)
        private set

    @Composable
    override fun material(block: @Composable MaterialAlertAdaptationNative.() -> Unit) {
        material = MaterialAlertAdaptationNative(
            containerColor = AlertDialogDefaults.containerColor,
            shape = AlertDialogDefaults.shape
        ).apply { block() }
    }

    @Composable
    override fun cupertino(block: @Composable CupertinoAlertAdaptationNative.() -> Unit) {
        cupertino = CupertinoAlertAdaptationNative(
            containerColor = CupertinoDialogsDefaults.containerColor,
            shape = CupertinoDialogsDefaults.shape,
            buttonsOrientation = CupertinoDialogsDefaults.buttonOrientation
        ).apply { block() }
    }
}

private class AdaptiveAlertDialogButtonDataNative(
    val onClick: () -> Unit,
    val style: AlertActionStyle,
    val enabled: Boolean,
    val title: String
)

private class AdaptiveAlertDialogButtonScopeNative() : NativeAlertDialogButtonsScope {

    val buttons = mutableListOf<AdaptiveAlertDialogButtonDataNative>()

    override fun button(
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

