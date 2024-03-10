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
import io.github.alexzhirkevich.cupertino.AlertDialogActionsScope
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialog
import io.github.alexzhirkevich.cupertino.CupertinoDialogsDefaults
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.systemGray7


@ExperimentalAdaptiveApi
@OptIn(ExperimentalCupertinoApi::class)
@Composable
fun AdaptiveAlertDialog(
    onDismissRequest: () -> Unit,
    title: @Composable () -> Unit,
    message: (@Composable () -> Unit)? = null,
    properties: DialogProperties = DialogProperties(),
    adaptation : AdaptationScope<CupertinoAlertAdaptation, MaterialAlertAdaptation>.() -> Unit = {},
    buttons: AlertDialogActionsScope.() -> Unit
) {
    AdaptiveWidget(
        adaptation = remember { AlertDialogAdaptation() },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoAlertDialog(
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

            val scope = AdaptiveAlertDialogButtonScopeImpl().apply(buttons)

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
                            m.dismissButton.invoke(
                                it.style,
                                it.enabled,
                                it.onClick,
                                it.title
                            )
                        }
                    },
                shape = m.shape,
                title = title,
                text = message,
                containerColor = m.containerColor.takeOrElse {
                      AlertDialogDefaults.containerColor
                },
                properties = properties
            )
        }
    )
}

@Stable
class MaterialAlertAdaptation internal constructor(

    confirmButton: @Composable (
        style : AlertActionStyle,
        enabled : Boolean,
        onClick : () -> Unit,
        title: @Composable () -> Unit
    ) -> Unit = { _, enabled, onClick, t ->
        Button(
            enabled = enabled,
            onClick = onClick,
        ) {
            t()
        }
    },

    dismissButton: @Composable (
        style : AlertActionStyle,
        enabled : Boolean,
        onClick : () -> Unit,
        title: @Composable () -> Unit
    ) -> Unit = { _, enabled, onClick, title ->
        TextButton(
            enabled = enabled,
            onClick = onClick,
        ){
            title()
        }
    },

    containerColor: Color,
    shape : Shape
){
    var confirmButton: @Composable (
        style : AlertActionStyle,
        enabled : Boolean,
        onClick : () -> Unit,
        title: @Composable () -> Unit
    ) -> Unit by mutableStateOf(confirmButton)

    var dismissButton: @Composable (
        style : AlertActionStyle,
        enabled : Boolean,
        onClick : () -> Unit,
        title: @Composable () -> Unit
    ) -> Unit by mutableStateOf(dismissButton)

    var containerColor: Color by mutableStateOf(containerColor)
    var shape : Shape by mutableStateOf(shape)
}

@Stable
class CupertinoAlertAdaptation internal constructor(
    containerColor: Color,
    shape : Shape,
    buttonsOrientation: Orientation = CupertinoDialogsDefaults.ButtonOrientation
){
    var containerColor: Color by mutableStateOf(containerColor)
    var shape : Shape by mutableStateOf(shape)
    var buttonsOrientation: Orientation by mutableStateOf(buttonsOrientation)
}


@ExperimentalAdaptiveApi
@Stable
private class AlertDialogAdaptation :
    Adaptation<CupertinoAlertAdaptation, MaterialAlertAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoAlertAdaptation {

        val shape = CupertinoDialogsDefaults.Shape
        val containerColor = CupertinoDialogsDefaults.ContainerColor

        return remember(shape, containerColor) {
            CupertinoAlertAdaptation(
                containerColor = containerColor,
                shape = shape,
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialAlertAdaptation {
        val shape = AlertDialogDefaults.shape
        val containerColor = AlertDialogDefaults.containerColor

        return remember(shape, containerColor) {
            MaterialAlertAdaptation(
                containerColor = containerColor,
                shape = shape,
            )
        }
    }
}

private class AdaptiveAlertDialogButtonData(
    val onClick: () -> Unit,
    val style: AlertActionStyle,
    val enabled: Boolean,
    val title: @Composable () -> Unit
)

private class AdaptiveAlertDialogButtonScopeImpl : AlertDialogActionsScope {

    val buttons = mutableListOf<AdaptiveAlertDialogButtonData>()

    override fun action(
        onClick: () -> Unit,
        style: AlertActionStyle,
        enabled: Boolean,
        title: @Composable () -> Unit
    ) {
        buttons += AdaptiveAlertDialogButtonData(
            onClick = onClick,
            style = style,
            enabled = enabled,
            title = title
        )
    }
}