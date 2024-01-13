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

public val CupertinoIcons.Outlined.Burst: ImageVector
    get() {
        if (_burst != null) {
            return _burst!!
        }
        _burst = Builder(name = "Burst", defaultWidth = 30.375.dp, defaultHeight = 28.793.dp,
                viewportWidth = 30.375f, viewportHeight = 28.793f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.332f, 15.4336f)
                curveTo(30.0352f, 15.0938f, 30.375f, 14.6133f, 30.375f, 14.1211f)
                curveTo(30.375f, 13.6406f, 30.0352f, 13.1953f, 29.332f, 12.9492f)
                lineTo(23.625f, 10.9805f)
                lineTo(26.0742f, 5.9766f)
                curveTo(26.1914f, 5.7188f, 26.25f, 5.4609f, 26.25f, 5.2266f)
                curveTo(26.25f, 4.5469f, 25.7344f, 4.043f, 25.0547f, 4.043f)
                curveTo(24.8203f, 4.043f, 24.5742f, 4.0898f, 24.3164f, 4.2188f)
                lineTo(19.1367f, 6.75f)
                lineTo(16.4414f, 0.9727f)
                curveTo(16.1484f, 0.3281f, 15.668f, 0.0f, 15.1875f, 0.0f)
                curveTo(14.707f, 0.0f, 14.2383f, 0.3281f, 13.9336f, 0.9727f)
                lineTo(11.25f, 6.75f)
                lineTo(6.0586f, 4.2188f)
                curveTo(5.8008f, 4.0898f, 5.5547f, 4.043f, 5.3203f, 4.043f)
                curveTo(4.6406f, 4.043f, 4.125f, 4.5469f, 4.125f, 5.2266f)
                curveTo(4.125f, 5.4609f, 4.1836f, 5.7188f, 4.3125f, 5.9766f)
                lineTo(6.75f, 10.9805f)
                lineTo(1.043f, 12.9492f)
                curveTo(0.3516f, 13.1836f, 0.0f, 13.6523f, 0.0f, 14.1328f)
                curveTo(0.0f, 14.6133f, 0.3516f, 15.0938f, 1.043f, 15.4336f)
                lineTo(6.5156f, 18.0586f)
                lineTo(3.5625f, 24.3164f)
                curveTo(3.4219f, 24.5977f, 3.3633f, 24.8672f, 3.3633f, 25.1133f)
                curveTo(3.3633f, 25.7227f, 3.7734f, 26.1562f, 4.3477f, 26.1562f)
                curveTo(4.5938f, 26.1562f, 4.8633f, 26.0742f, 5.1445f, 25.9102f)
                lineTo(12.1406f, 21.7734f)
                lineTo(14.0625f, 27.7031f)
                curveTo(14.2734f, 28.3594f, 14.7305f, 28.6992f, 15.1875f, 28.6992f)
                curveTo(15.6562f, 28.6992f, 16.1016f, 28.3594f, 16.3125f, 27.7031f)
                lineTo(18.2461f, 21.7734f)
                lineTo(25.2305f, 25.9102f)
                curveTo(25.5117f, 26.0742f, 25.7812f, 26.1445f, 26.0273f, 26.1445f)
                curveTo(26.5898f, 26.1445f, 27.0234f, 25.7344f, 27.0234f, 25.125f)
                curveTo(27.0234f, 24.8789f, 26.9531f, 24.5977f, 26.8125f, 24.3164f)
                lineTo(23.8594f, 18.0586f)
                close()
                moveTo(27.8672f, 14.1445f)
                lineTo(27.8672f, 14.2266f)
                lineTo(21.8672f, 16.8516f)
                curveTo(21.6445f, 16.9453f, 21.5273f, 17.0977f, 21.5273f, 17.2852f)
                curveTo(21.5273f, 17.3555f, 21.5625f, 17.4492f, 21.6094f, 17.5312f)
                lineTo(24.6914f, 23.7539f)
                lineTo(24.6328f, 23.8242f)
                lineTo(17.7305f, 19.4648f)
                curveTo(17.625f, 19.4062f, 17.5195f, 19.3594f, 17.4258f, 19.3594f)
                curveTo(17.2383f, 19.3594f, 17.0859f, 19.5f, 17.0273f, 19.7344f)
                lineTo(15.2227f, 25.8047f)
                lineTo(15.1523f, 25.8047f)
                lineTo(13.3594f, 19.7344f)
                curveTo(13.2891f, 19.5f, 13.1367f, 19.3594f, 12.9492f, 19.3594f)
                curveTo(12.8555f, 19.3594f, 12.75f, 19.4062f, 12.6445f, 19.4648f)
                lineTo(5.7539f, 23.8242f)
                lineTo(5.6836f, 23.7539f)
                lineTo(8.7656f, 17.5312f)
                curveTo(8.8242f, 17.4492f, 8.8477f, 17.3555f, 8.8477f, 17.2852f)
                curveTo(8.8477f, 17.0977f, 8.7305f, 16.9453f, 8.5195f, 16.8516f)
                lineTo(2.5078f, 14.2266f)
                lineTo(2.5078f, 14.1445f)
                lineTo(8.7422f, 12.2227f)
                curveTo(8.9766f, 12.1523f, 9.1055f, 12.0f, 9.1055f, 11.8125f)
                curveTo(9.1055f, 11.7188f, 9.082f, 11.625f, 9.0234f, 11.5312f)
                lineTo(6.2227f, 6.1875f)
                lineTo(6.2813f, 6.1289f)
                lineTo(11.6719f, 8.9648f)
                curveTo(11.7656f, 9.0234f, 11.8594f, 9.0469f, 11.9531f, 9.0469f)
                curveTo(12.1289f, 9.0469f, 12.2695f, 8.9414f, 12.3516f, 8.7305f)
                lineTo(15.1523f, 2.4609f)
                lineTo(15.2227f, 2.4609f)
                lineTo(18.0234f, 8.7305f)
                curveTo(18.1055f, 8.9414f, 18.2461f, 9.0469f, 18.4219f, 9.0469f)
                curveTo(18.5156f, 9.0469f, 18.6094f, 9.0234f, 18.7148f, 8.9648f)
                lineTo(24.0938f, 6.1289f)
                lineTo(24.1523f, 6.1875f)
                lineTo(21.3516f, 11.5312f)
                curveTo(21.293f, 11.625f, 21.2695f, 11.7188f, 21.2695f, 11.8125f)
                curveTo(21.2695f, 12.0f, 21.3984f, 12.1523f, 21.6328f, 12.2227f)
                close()
            }
        }
        .build()
        return _burst!!
    }

private var _burst: ImageVector? = null
