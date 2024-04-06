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

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.CupertinoButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.filledButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.plainButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoIconButton

@ExperimentalAdaptiveApi
@Composable
fun AdaptiveIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation: AdaptationScope<CupertinoIconButtonAdaptation, MaterialIconButtonAdaptation>.() -> Unit = {},
    content: @Composable (() -> Unit)
) {
    AdaptiveWidget(
        adaptation = remember {
            IconButtonAdaptation(isFilled = false)
        },
        adaptationScope = adaptation,
        material = {
            IconButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                content = content,
                colors = it.colors,
            )
        },
        cupertino = {
            CupertinoIconButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                content = content,
                colors = it.colors
            )
        }
    )
}

@ExperimentalAdaptiveApi
@Composable
fun AdaptiveFilledIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation: AdaptationScope<CupertinoIconButtonAdaptation, MaterialIconButtonAdaptation>.() -> Unit = {},
    content: @Composable (() -> Unit)
) {
    AdaptiveWidget(
        adaptation = remember {
            IconButtonAdaptation(isFilled = true)
        },
        adaptationScope = adaptation,
        material = {
            FilledIconButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                content = content,
                colors = it.colors,
            )
        },
        cupertino = {
            CupertinoIconButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                content = content,
                colors = it.colors
            )
        }
    )
}

@Stable
class CupertinoIconButtonAdaptation internal constructor(
    colors : CupertinoButtonColors,
) {
    var colors : CupertinoButtonColors by mutableStateOf(colors)
}

@Stable
class MaterialIconButtonAdaptation internal constructor(
    colors : IconButtonColors
){
    var colors : IconButtonColors by mutableStateOf(colors)

}

@OptIn(ExperimentalAdaptiveApi::class)
private class IconButtonAdaptation(
    private val isFilled : Boolean
) : Adaptation<CupertinoIconButtonAdaptation, MaterialIconButtonAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoIconButtonAdaptation {
        val colors = if (isFilled)
            filledButtonColors(
            )
        else
            plainButtonColors(
            )

        return remember(colors) {
            CupertinoIconButtonAdaptation(
                colors = colors,
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialIconButtonAdaptation {
        val colors = if (isFilled) {
            IconButtonDefaults.filledIconButtonColors()
        } else IconButtonDefaults.iconButtonColors()

        return remember(colors) {
            MaterialIconButtonAdaptation(
                colors = colors,
            )
        }
    }
}