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

package io.github.alexzhirkevich.cupertino.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.Scope: ImageVector
    get() {
        if (_scope != null) {
            return _scope!!
        }
        _scope = Builder(name = "Scope", defaultWidth = 28.5.dp, defaultHeight = 28.5117.dp,
                viewportWidth = 28.5f, viewportHeight = 28.5117f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 25.3477f)
                curveTo(20.3438f, 25.3477f, 25.3125f, 20.3672f, 25.3125f, 14.2617f)
                curveTo(25.3125f, 8.1563f, 20.3438f, 3.1758f, 14.25f, 3.1758f)
                curveTo(8.1563f, 3.1758f, 3.1875f, 8.1563f, 3.1875f, 14.2617f)
                curveTo(3.1875f, 20.3672f, 8.1563f, 25.3477f, 14.25f, 25.3477f)
                close()
                moveTo(14.25f, 23.4375f)
                curveTo(9.1641f, 23.4375f, 5.1563f, 19.3945f, 5.1563f, 14.2617f)
                curveTo(5.1563f, 9.1289f, 9.1641f, 5.0859f, 14.25f, 5.0859f)
                curveTo(19.3359f, 5.0859f, 23.3438f, 9.1289f, 23.3438f, 14.2617f)
                curveTo(23.3438f, 19.3945f, 19.3359f, 23.4375f, 14.25f, 23.4375f)
                close()
                moveTo(14.25f, 28.5117f)
                curveTo(14.7188f, 28.5117f, 15.082f, 28.1367f, 15.082f, 27.668f)
                lineTo(15.082f, 19.7344f)
                curveTo(15.082f, 19.2656f, 14.7188f, 18.9023f, 14.25f, 18.9023f)
                curveTo(13.7812f, 18.9023f, 13.4062f, 19.2656f, 13.4062f, 19.7344f)
                lineTo(13.4062f, 27.668f)
                curveTo(13.4062f, 28.1367f, 13.7812f, 28.5117f, 14.25f, 28.5117f)
                close()
                moveTo(0.8438f, 15.1055f)
                lineTo(8.7773f, 15.1055f)
                curveTo(9.2461f, 15.1055f, 9.6211f, 14.7305f, 9.6211f, 14.2617f)
                curveTo(9.6211f, 13.793f, 9.2461f, 13.4297f, 8.7773f, 13.4297f)
                lineTo(0.8438f, 13.4297f)
                curveTo(0.375f, 13.4297f, 0.0f, 13.793f, 0.0f, 14.2617f)
                curveTo(0.0f, 14.7305f, 0.375f, 15.1055f, 0.8438f, 15.1055f)
                close()
                moveTo(14.25f, 9.6328f)
                curveTo(14.7188f, 9.6328f, 15.082f, 9.2578f, 15.082f, 8.7891f)
                lineTo(15.082f, 0.8555f)
                curveTo(15.082f, 0.3867f, 14.7188f, 0.0117f, 14.25f, 0.0117f)
                curveTo(13.7812f, 0.0117f, 13.4062f, 0.3867f, 13.4062f, 0.8555f)
                lineTo(13.4062f, 8.7891f)
                curveTo(13.4062f, 9.2578f, 13.7812f, 9.6328f, 14.25f, 9.6328f)
                close()
                moveTo(19.7227f, 15.1055f)
                lineTo(27.6562f, 15.1055f)
                curveTo(28.125f, 15.1055f, 28.5f, 14.7305f, 28.5f, 14.2617f)
                curveTo(28.5f, 13.793f, 28.125f, 13.4297f, 27.6562f, 13.4297f)
                lineTo(19.7227f, 13.4297f)
                curveTo(19.2539f, 13.4297f, 18.8789f, 13.793f, 18.8789f, 14.2617f)
                curveTo(18.8789f, 14.7305f, 19.2539f, 15.1055f, 19.7227f, 15.1055f)
                close()
            }
        }
        .build()
        return _scope!!
    }

private var _scope: ImageVector? = null
