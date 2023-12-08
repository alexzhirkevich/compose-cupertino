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

package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationInstance
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor

/**
 * Cupertino click effect
 * */
@Composable
@ExperimentalCupertinoApi
fun rememberCupertinoIndication(
    color: @Composable () -> Color = { CupertinoIndication.DefaultColor }
) : Indication {

    val updatedColor by rememberUpdatedState(color)

    return remember { CupertinoIndication(color = { updatedColor() }) }
}

internal class CupertinoIndication(
    val color: @Composable () -> Color,
) : Indication {

    companion object {
        val DefaultColor : Color
            @Composable
            @ReadOnlyComposable
            get() = LocalContentColor.current.copy(alpha = DefaultAlpha)

        val DefaultAlpha = .1f
    }

    @Composable
    override fun rememberUpdatedInstance(interactionSource: InteractionSource): IndicationInstance {

        val pressed by interactionSource.collectIsPressedAsState()
        val hovered by interactionSource.collectIsHoveredAsState()

        val animatedAlpha by animateFloatAsState(if (pressed) 1f else 0f)

        val color by rememberUpdatedState(color())

        return remember {
            object : IndicationInstance {


                override fun ContentDrawScope.drawIndication() {

                    when {
                        pressed -> drawRect(
                            color = color,
                        )
//                        hovered && animatedAlpha < .5f -> drawRect(
//                            color = color,
//                            alpha = .5f,
//                        )
                        else -> drawRect(
                            color = color,
                            alpha = animatedAlpha,
                        )
                    }
                    drawContent()
                }
            }
        }
    }
}

