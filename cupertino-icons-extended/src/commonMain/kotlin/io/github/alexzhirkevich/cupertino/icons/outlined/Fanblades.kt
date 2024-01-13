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

public val CupertinoIcons.Outlined.Fanblades: ImageVector
    get() {
        if (_fanblades != null) {
            return _fanblades!!
        }
        _fanblades = Builder(name = "Fanblades", defaultWidth = 25.207.dp, defaultHeight =
                25.2305.dp, viewportWidth = 25.207f, viewportHeight = 25.2305f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5977f, 17.0508f)
                curveTo(15.0469f, 17.0508f, 17.0508f, 15.0586f, 17.0508f, 12.6094f)
                curveTo(17.0508f, 10.1602f, 15.0469f, 8.1563f, 12.5977f, 8.1563f)
                curveTo(10.1484f, 8.1563f, 8.1563f, 10.1602f, 8.1563f, 12.6094f)
                curveTo(8.1563f, 15.0586f, 10.1484f, 17.0508f, 12.5977f, 17.0508f)
                close()
                moveTo(12.5977f, 15.2461f)
                curveTo(11.1445f, 15.2461f, 9.9609f, 14.0625f, 9.9609f, 12.6094f)
                curveTo(9.9609f, 11.1562f, 11.1445f, 9.9609f, 12.5977f, 9.9609f)
                curveTo(14.0508f, 9.9609f, 15.2461f, 11.1562f, 15.2461f, 12.6094f)
                curveTo(15.2461f, 14.0625f, 14.0508f, 15.2461f, 12.5977f, 15.2461f)
                close()
                moveTo(12.5977f, 14.2734f)
                curveTo(13.5352f, 14.2734f, 14.2734f, 13.5352f, 14.2734f, 12.6094f)
                curveTo(14.2734f, 11.6836f, 13.5234f, 10.9219f, 12.5977f, 10.9219f)
                curveTo(11.6602f, 10.9219f, 10.9219f, 11.6602f, 10.9219f, 12.6094f)
                curveTo(10.9219f, 13.5469f, 11.6602f, 14.2734f, 12.5977f, 14.2734f)
                close()
                moveTo(11.7539f, 9.0117f)
                lineTo(11.7539f, 3.3516f)
                curveTo(11.7539f, 1.1953f, 10.5938f, 0.0f, 8.5078f, 0.0f)
                curveTo(4.7578f, 0.0117f, 0.8438f, 3.3984f, 0.8438f, 6.7148f)
                curveTo(0.8438f, 9.7383f, 3.6563f, 11.4258f, 8.5313f, 13.0312f)
                lineTo(9.2813f, 11.332f)
                curveTo(4.9805f, 9.9023f, 2.6367f, 8.8008f, 2.6367f, 6.7148f)
                curveTo(2.6367f, 4.3711f, 5.7422f, 1.793f, 8.5078f, 1.793f)
                curveTo(9.5977f, 1.793f, 9.9609f, 2.1914f, 9.9609f, 3.3516f)
                lineTo(9.9609f, 9.5273f)
                close()
                moveTo(16.1953f, 11.7539f)
                lineTo(21.8672f, 11.7539f)
                curveTo(24.0234f, 11.7539f, 25.207f, 10.6055f, 25.207f, 8.5195f)
                curveTo(25.207f, 4.7695f, 21.8086f, 0.8438f, 18.4922f, 0.8438f)
                curveTo(15.4688f, 0.8438f, 13.7812f, 3.668f, 12.1758f, 8.5547f)
                lineTo(13.875f, 9.3047f)
                curveTo(15.3047f, 5.0039f, 16.4062f, 2.6367f, 18.4922f, 2.6367f)
                curveTo(20.8359f, 2.6367f, 23.4141f, 5.7539f, 23.4141f, 8.5195f)
                curveTo(23.4141f, 9.6094f, 23.0273f, 9.9609f, 21.8672f, 9.9609f)
                lineTo(15.6797f, 9.9609f)
                close()
                moveTo(13.4531f, 16.207f)
                lineTo(13.4531f, 21.8789f)
                curveTo(13.4531f, 24.0352f, 14.6016f, 25.2188f, 16.6875f, 25.2188f)
                curveTo(20.4492f, 25.2188f, 24.3633f, 21.8203f, 24.3633f, 18.5039f)
                curveTo(24.3633f, 15.4805f, 21.5391f, 13.793f, 16.6641f, 12.1875f)
                lineTo(15.9141f, 13.8867f)
                curveTo(20.2148f, 15.3164f, 22.5703f, 16.418f, 22.5703f, 18.5039f)
                curveTo(22.5703f, 20.8477f, 19.4648f, 23.4258f, 16.6875f, 23.4141f)
                curveTo(15.5977f, 23.4141f, 15.2461f, 23.0391f, 15.2461f, 21.8789f)
                lineTo(15.2461f, 15.6914f)
                close()
                moveTo(9.0f, 13.4531f)
                lineTo(3.3281f, 13.4531f)
                curveTo(1.1836f, 13.4531f, 0.0f, 14.6133f, 0.0f, 16.6992f)
                curveTo(0.0f, 20.4609f, 3.3867f, 24.375f, 6.7031f, 24.375f)
                curveTo(9.7266f, 24.375f, 11.4141f, 21.5508f, 13.0195f, 16.6758f)
                lineTo(11.3203f, 15.9258f)
                curveTo(9.8906f, 20.2266f, 8.7891f, 22.5703f, 6.7031f, 22.5703f)
                curveTo(4.3594f, 22.5703f, 1.793f, 19.4766f, 1.793f, 16.6992f)
                curveTo(1.793f, 15.6094f, 2.168f, 15.2461f, 3.3281f, 15.2461f)
                lineTo(9.5156f, 15.2461f)
                close()
            }
        }
        .build()
        return _fanblades!!
    }

private var _fanblades: ImageVector? = null
