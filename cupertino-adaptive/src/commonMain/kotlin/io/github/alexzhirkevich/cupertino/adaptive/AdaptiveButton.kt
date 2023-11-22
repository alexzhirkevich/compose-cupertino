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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import io.github.alexzhirkevich.cupertino.CupertinoButton
import io.github.alexzhirkevich.cupertino.CupertinoButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults
import io.github.alexzhirkevich.cupertino.CupertinoButtonSize
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@ExperimentalAdaptiveApi
@Composable
fun AdaptiveButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation: AdaptationScope<CupertinoButtonAdaptation, MaterialButtonAdaptation>.() -> Unit = {},
    content: @Composable() (RowScope.() -> Unit)
) {
    AdaptiveWidget(
        adaptation = remember {
            ButtonAdaptation(isText = false)
        },
        adaptationScope = adaptation,
        material = {
            Button(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                border = border,
                interactionSource = interactionSource,
                content = content,
                contentPadding = it.contentPadding,
                shape =  it.shape,
                colors = it.colors,
                elevation = it.elevation
            )
        },
        cupertino = {
            CupertinoButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                border = border,
                interactionSource = interactionSource,
                content = content,
                contentPadding = it.contentPadding,
                shape =  it.shape,
                colors = it.colors
            )
        }
    )
}

@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation: AdaptationScope<CupertinoButtonAdaptation, MaterialButtonAdaptation>.() -> Unit = {},
    content: @Composable() (RowScope.() -> Unit)
) {
    AdaptiveWidget(
        adaptation = remember {
            ButtonAdaptation(isText = true)
        },
        adaptationScope = adaptation,
        material = {
            TextButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                border = border,
                interactionSource = interactionSource,
                content = content,
                contentPadding = it.contentPadding,
                shape =  it.shape,
                colors = it.colors,
                elevation = it.elevation
            )
        },
        cupertino = {
            CupertinoButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                border = border,
                interactionSource = interactionSource,
                content = content,
                contentPadding = it.contentPadding,
                shape =  it.shape,
                colors = it.colors
            )
        }
    )
}


class CupertinoButtonAdaptation(
    var colors : CupertinoButtonColors,
    var size: CupertinoButtonSize,
    var shape: Shape,
    var contentPadding: PaddingValues
)

class MaterialButtonAdaptation(
    var colors : ButtonColors,
    var elevation: ButtonElevation?,
    var shape: Shape,
    var contentPadding: PaddingValues
)

private class ButtonAdaptation(
    private val isText : Boolean
) : Adaptation<CupertinoButtonAdaptation, MaterialButtonAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoButtonAdaptation {
        val colors = if (isText)
            CupertinoButtonDefaults.plainButtonColors()
        else
            CupertinoButtonDefaults.filledButtonColors()

        val shape = CupertinoTheme.shapes

        return remember(colors,shape) {

            val size = CupertinoButtonSize.Medium

            CupertinoButtonAdaptation(
                colors = colors,
                size = size,
                shape = size.shape(shape),
                contentPadding = CupertinoButtonDefaults.ButtonContentPadding
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialButtonAdaptation {
        val colors = if (isText) {
            ButtonDefaults.textButtonColors()
        } else ButtonDefaults.buttonColors()

        val elevation = ButtonDefaults.buttonElevation()
        val shape = ButtonDefaults.shape

        return remember(colors, elevation, elevation, shape) {
            MaterialButtonAdaptation(
                colors = colors,
                elevation = elevation,
                shape = shape,
                contentPadding = ButtonDefaults.ContentPadding
            )
        }
    }
}