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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.LightMin: ImageVector
    get() {
        if (_lightMin != null) {
            return _lightMin!!
        }
        _lightMin = Builder(name = "LightMin", defaultWidth = 27.9492.dp, defaultHeight =
                16.0664.dp, viewportWidth = 27.9492f, viewportHeight = 16.0664f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 16.0664f)
                curveTo(2.3438f, 16.0664f, 3.0352f, 15.3867f, 3.0352f, 14.5547f)
                curveTo(3.0352f, 13.7344f, 2.3438f, 13.0547f, 1.5f, 13.0547f)
                curveTo(0.6797f, 13.0547f, 0.0f, 13.7344f, 0.0f, 14.5547f)
                curveTo(0.0f, 15.375f, 0.6797f, 16.0664f, 1.5f, 16.0664f)
                close()
                moveTo(4.6875f, 7.5352f)
                curveTo(5.5195f, 7.5352f, 6.1992f, 6.8555f, 6.1992f, 6.0352f)
                curveTo(6.1992f, 5.2031f, 5.5195f, 4.5234f, 4.6875f, 4.5234f)
                curveTo(3.8672f, 4.5234f, 3.1758f, 5.2031f, 3.1758f, 6.0352f)
                curveTo(3.1758f, 6.8555f, 3.8672f, 7.5352f, 4.6875f, 7.5352f)
                close()
                moveTo(13.9688f, 3.5039f)
                curveTo(14.7891f, 3.5039f, 15.4805f, 2.8125f, 15.4805f, 1.9805f)
                curveTo(15.4805f, 1.1602f, 14.7891f, 0.4805f, 13.9688f, 0.4805f)
                curveTo(13.1602f, 0.4805f, 12.4688f, 1.1602f, 12.4688f, 1.9805f)
                curveTo(12.4688f, 2.8125f, 13.1602f, 3.5039f, 13.9688f, 3.5039f)
                close()
                moveTo(23.2969f, 7.5352f)
                curveTo(24.1172f, 7.5352f, 24.7969f, 6.8555f, 24.7969f, 6.0352f)
                curveTo(24.7969f, 5.2031f, 24.1172f, 4.5234f, 23.2969f, 4.5234f)
                curveTo(22.4648f, 4.5234f, 21.7852f, 5.2031f, 21.7852f, 6.0352f)
                curveTo(21.7852f, 6.8555f, 22.4648f, 7.5352f, 23.2969f, 7.5352f)
                close()
                moveTo(26.4492f, 16.0664f)
                curveTo(27.2695f, 16.0664f, 27.9492f, 15.375f, 27.9492f, 14.5547f)
                curveTo(27.9492f, 13.7227f, 27.2695f, 13.043f, 26.4492f, 13.043f)
                curveTo(25.5938f, 13.043f, 24.9141f, 13.7227f, 24.9141f, 14.5547f)
                curveTo(24.9141f, 15.375f, 25.5938f, 16.0664f, 26.4492f, 16.0664f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2344f, 15.6914f)
                lineTo(18.6211f, 15.6914f)
                curveTo(19.1836f, 15.6914f, 19.6641f, 15.2109f, 19.6641f, 14.6602f)
                curveTo(19.6641f, 14.0859f, 19.1836f, 13.6172f, 18.6211f, 13.6172f)
                lineTo(9.2344f, 13.6172f)
                curveTo(8.6602f, 13.6172f, 8.1797f, 14.0977f, 8.1797f, 14.6602f)
                curveTo(8.1797f, 15.2109f, 8.6719f, 15.6914f, 9.2344f, 15.6914f)
                close()
            }
        }
        .build()
        return _lightMin!!
    }

private var _lightMin: ImageVector? = null
