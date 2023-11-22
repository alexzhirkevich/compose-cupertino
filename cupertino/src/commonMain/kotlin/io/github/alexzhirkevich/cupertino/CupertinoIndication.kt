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

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationInstance
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import io.github.alexzhirkevich.LocalContentColor

/**
 * Cupertino click effect
 * */
@Composable
fun rememberCupertinoIndication() : Indication {
    return remember { CupertinoIndication() }
}

internal class CupertinoIndication : Indication {

    @Composable
    override fun rememberUpdatedInstance(interactionSource: InteractionSource): IndicationInstance {

        val pressed by interactionSource.collectIsPressedAsState()

        val color by rememberUpdatedState(LocalContentColor.current.copy(alpha = .1f))

        val animatedAlpha by animateFloatAsState(if (pressed) 1f else 0f)

        return remember {
            object : IndicationInstance{
                override fun ContentDrawScope.drawIndication() {
                    if (pressed) {
                        drawRect(color)
                    } else {
                        drawRect(color, alpha = animatedAlpha)
                    }
                    drawContent()
                }
            }
        }
    }
}
