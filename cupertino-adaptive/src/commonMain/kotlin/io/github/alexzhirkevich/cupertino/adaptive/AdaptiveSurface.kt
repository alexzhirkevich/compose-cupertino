/*
 * Copyright (c) 2024. Compose Cupertino project and open source contributors.
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

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoSurface
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@ExperimentalAdaptiveApi
@Composable
fun AdaptiveSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color = Color.Unspecified,
    contentColor: Color = Color.Unspecified,
    shadowElevation : Dp = 0.dp,
    content: @Composable () -> Unit
) {
    AdaptiveWidget(
        material = {
            Surface(
                modifier = modifier,
                shape = shape,
                color = color.takeOrElse {
                    MaterialTheme.colorScheme.surface
                },
                contentColor = contentColor.takeOrElse {
                    MaterialTheme.colorScheme.onSurface
                },
                shadowElevation = shadowElevation,
                content = content
            )
        },
        cupertino = {
            CupertinoSurface(
                modifier = modifier,
                shape = shape,
                color = color.takeOrElse {
                    CupertinoTheme.colorScheme.systemBackground
                },
                contentColor = contentColor.takeOrElse {
                    LocalContentColor.current
                },
                shadowElevation = shadowElevation,
                content = content
            )
        }
    )
}
