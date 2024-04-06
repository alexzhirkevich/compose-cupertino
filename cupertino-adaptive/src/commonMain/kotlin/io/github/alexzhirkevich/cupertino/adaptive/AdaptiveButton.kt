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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import io.github.alexzhirkevich.cupertino.CupertinoButton
import io.github.alexzhirkevich.cupertino.CupertinoButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.filledButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.plainButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.tintedButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonSize
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

/**
 * Adaptive button that takes [Button] or borderedProminent [CupertinoButton] appearance
 * */
@OptIn(ExperimentalCupertinoApi::class)
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
            ButtonAdaptation(type = ButtonType.Filled)
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
                size = it.size,
                contentPadding = it.contentPadding ?: it.size.contentPadding,
                shape =  it.shape ?: it.size.shape(CupertinoTheme.shapes),
                colors = it.colors
            )
        }
    )
}

/**
 * Adaptive button that takes [TextButton] or borderless [CupertinoButton] appearance
 * */
@OptIn(ExperimentalCupertinoApi::class)
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
            ButtonAdaptation(type = ButtonType.Text)
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
                size = it.size,
                contentPadding = it.contentPadding ?: it.size.contentPadding,
                shape =  it.shape ?: it.size.shape(CupertinoTheme.shapes),
                colors = it.colors
            )
        }
    )
}

/**
 * Adaptive button that takes [FilledTonalButton] or bordered [CupertinoButton] appearance
 * */
@OptIn(ExperimentalCupertinoApi::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTonalButton(
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
            ButtonAdaptation(type = ButtonType.Tonal)
        },
        adaptationScope = adaptation,
        material = {
            FilledTonalButton(
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
                size = it.size,
                contentPadding = it.contentPadding ?: it.size.contentPadding,
                shape =  it.shape ?: it.size.shape(CupertinoTheme.shapes),
                colors = it.colors
            )
        }
    )
}


@Stable
class CupertinoButtonAdaptation internal constructor(
    colors : CupertinoButtonColors,
) {
    var colors : CupertinoButtonColors by mutableStateOf(colors)
    var size: CupertinoButtonSize by mutableStateOf(CupertinoButtonSize.Regular)
    var shape: Shape? by mutableStateOf(null)
    var contentPadding: PaddingValues? by mutableStateOf(null)
}

@Stable
class MaterialButtonAdaptation internal constructor(
    colors : ButtonColors,
    elevation: ButtonElevation?,
    shape: Shape,
    contentPadding: PaddingValues
) {
    var colors: ButtonColors by mutableStateOf(colors)
    var elevation: ButtonElevation? by mutableStateOf(elevation)
    var shape: Shape by mutableStateOf(shape)
    var contentPadding: PaddingValues by mutableStateOf(contentPadding)
}

private enum class ButtonType {
    Filled, Text, Tonal
}

@ExperimentalAdaptiveApi
private class ButtonAdaptation(
    private val type: ButtonType
) : Adaptation<CupertinoButtonAdaptation, MaterialButtonAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoButtonAdaptation {

        val colors = when (type) {
            ButtonType.Filled -> filledButtonColors(
            )

            ButtonType.Text -> plainButtonColors(
            )

            ButtonType.Tonal -> tintedButtonColors()
        }

        return remember(colors) {
            CupertinoButtonAdaptation(
                colors = colors,
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialButtonAdaptation {
        val colors = when(type) {
            ButtonType.Filled -> ButtonDefaults.buttonColors()
            ButtonType.Text -> ButtonDefaults.textButtonColors()
            ButtonType.Tonal -> ButtonDefaults.filledTonalButtonColors()
        }

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