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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Indication
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


@Composable
fun CupertinoSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color = CupertinoTheme.colorScheme.systemBackground,
    shadowElevation : Dp = 0.dp,
    contentColor: Color = LocalContentColor.current,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor,
        LocalContainerColor provides color
    ) {
        Box(
            modifier = modifier
                .graphicsLayer {
                    this.shape = shape
                    this.shadowElevation = shadowElevation.toPx()
                    this.clip = true
                }
                .background(color)
                .semantics(mergeDescendants = false) {
                    isTraversalGroup = true
                }
                .pointerInput(Unit) {},
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}


@Composable
fun CupertinoSurface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    color: Color = CupertinoTheme.colorScheme.systemBackground,
    contentColor: Color = LocalContentColor.current,
    border: BorderStroke? = null,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {

    Box(
        modifier = modifier
            .clip(shape)
            .background(color)
            .let {
                if (border != null)
                    it.border(border, shape)
                else it
            }
            .clickable(
                interactionSource = interactionSource,
                indication = indication,
                enabled = enabled,
                onClick = onClick
            ),
        propagateMinConstraints = true
    ) {
        CompositionLocalProvider(
            LocalContentColor provides contentColor,
            LocalContainerColor provides color,
            content = content
        )
    }
}

@Deprecated(
    "Use CupertinoSurface instead",
    replaceWith = ReplaceWith(
        "CupertinoSurface(modifier,shape,color,shadowElevation,contentColor,content)",
        "io.github.alexzhirkevich.cupertino.CupertinoSurface"
    )
)
@Composable
fun Surface(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color = CupertinoTheme.colorScheme.systemBackground,
    shadowElevation : Dp = 0.dp,
    contentColor: Color = LocalContentColor.current,
    content: @Composable () -> Unit
) = CupertinoSurface(
    modifier = modifier,
    shape = shape,
    color = color,
    shadowElevation = shadowElevation,
    contentColor = contentColor,
    content = content
)

@Deprecated(
    "Use CupertinoSurface instead",
    replaceWith = ReplaceWith(
        "CupertinoSurface(onClick,modifier,enabled,shape,color,contentColor,border,indication,interactionSource,content)",
        "io.github.alexzhirkevich.cupertino.CupertinoSurface"
    )
)
@Composable
fun Surface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    color: Color = CupertinoTheme.colorScheme.systemBackground,
    contentColor: Color = LocalContentColor.current,
    border: BorderStroke? = null,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) = CupertinoSurface(
    onClick = onClick,
    modifier = modifier,
    enabled = enabled,
    shape = shape,
    color = color,
    contentColor = contentColor,
    border = border,
    indication = indication,
    interactionSource = interactionSource,
    content = content
)