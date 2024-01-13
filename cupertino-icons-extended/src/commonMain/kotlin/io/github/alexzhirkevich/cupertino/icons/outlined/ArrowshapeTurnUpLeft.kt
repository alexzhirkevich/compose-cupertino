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

public val CupertinoIcons.Outlined.ArrowshapeTurnUpLeft: ImageVector
    get() {
        if (_arrowshapeTurnUpLeft != null) {
            return _arrowshapeTurnUpLeft!!
        }
        _arrowshapeTurnUpLeft = Builder(name = "ArrowshapeTurnUpLeft", defaultWidth = 25.2656.dp,
                defaultHeight = 21.5039.dp, viewportWidth = 25.2656f, viewportHeight =
                21.5039f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4492f, 21.4922f)
                curveTo(12.2461f, 21.4922f, 12.8203f, 20.9062f, 12.8203f, 20.1211f)
                lineTo(12.8203f, 15.6445f)
                lineTo(13.1602f, 15.6445f)
                curveTo(17.707f, 15.6445f, 20.5664f, 16.793f, 22.6172f, 20.625f)
                curveTo(23.0273f, 21.375f, 23.5664f, 21.4922f, 24.0586f, 21.4922f)
                curveTo(24.6797f, 21.4922f, 25.2656f, 20.9297f, 25.2656f, 19.9219f)
                curveTo(25.2656f, 11.2617f, 21.5977f, 5.8594f, 13.1602f, 5.8594f)
                lineTo(12.8203f, 5.8594f)
                lineTo(12.8203f, 1.4297f)
                curveTo(12.8203f, 0.6445f, 12.2461f, 0.0f, 11.4258f, 0.0f)
                curveTo(10.8516f, 0.0f, 10.4648f, 0.2461f, 9.8438f, 0.832f)
                lineTo(0.5977f, 9.4805f)
                curveTo(0.1406f, 9.9141f, 0.0f, 10.3477f, 0.0f, 10.7461f)
                curveTo(0.0f, 11.1328f, 0.1523f, 11.5781f, 0.5977f, 12.0f)
                lineTo(9.8438f, 20.7305f)
                curveTo(10.4062f, 21.2578f, 10.875f, 21.4922f, 11.4492f, 21.4922f)
                close()
                moveTo(10.7812f, 18.9727f)
                curveTo(10.7109f, 18.9727f, 10.6406f, 18.9375f, 10.582f, 18.8672f)
                lineTo(2.2266f, 10.9688f)
                curveTo(2.1328f, 10.875f, 2.0977f, 10.8164f, 2.0977f, 10.7461f)
                curveTo(2.0977f, 10.6758f, 2.1328f, 10.6055f, 2.2266f, 10.5234f)
                lineTo(10.5703f, 2.5195f)
                curveTo(10.6289f, 2.4727f, 10.6992f, 2.4258f, 10.7695f, 2.4258f)
                curveTo(10.875f, 2.4258f, 10.9336f, 2.4961f, 10.9336f, 2.5898f)
                lineTo(10.9336f, 7.2422f)
                curveTo(10.9336f, 7.5117f, 11.0625f, 7.6289f, 11.332f, 7.6289f)
                lineTo(12.9023f, 7.6289f)
                curveTo(20.9414f, 7.6289f, 23.3672f, 13.207f, 23.6016f, 18.7383f)
                curveTo(23.6016f, 18.832f, 23.5664f, 18.8672f, 23.5078f, 18.8672f)
                curveTo(23.4609f, 18.8672f, 23.4375f, 18.832f, 23.4023f, 18.75f)
                curveTo(22.0195f, 15.8086f, 18.4688f, 13.875f, 12.9023f, 13.875f)
                lineTo(11.332f, 13.875f)
                curveTo(11.0625f, 13.875f, 10.9336f, 13.9922f, 10.9336f, 14.2617f)
                lineTo(10.9336f, 18.7969f)
                curveTo(10.9336f, 18.9023f, 10.875f, 18.9727f, 10.7812f, 18.9727f)
                close()
            }
        }
        .build()
        return _arrowshapeTurnUpLeft!!
    }

private var _arrowshapeTurnUpLeft: ImageVector? = null
