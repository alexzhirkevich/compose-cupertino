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

package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 23.8711.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.8711f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8906f, 6.0938f)
                curveTo(16.9336f, 4.1953f, 17.2852f, 2.4375f, 16.6523f, 0.9961f)
                curveTo(15.1875f, 0.3633f, 13.582f, 0.0f, 11.9062f, 0.0f)
                curveTo(8.4961f, 0.0f, 5.3789f, 1.4883f, 3.2109f, 3.8438f)
                curveTo(7.418f, 2.1914f, 13.043f, 3.8555f, 15.8906f, 6.0938f)
                close()
                moveTo(11.1328f, 11.7891f)
                curveTo(12.7266f, 10.3359f, 14.0625f, 8.8711f, 15.0586f, 7.4297f)
                curveTo(11.8359f, 4.875f, 5.1328f, 3.1875f, 1.3008f, 6.5273f)
                curveTo(0.5625f, 7.8984f, 0.1055f, 9.4453f, 0.0f, 11.0977f)
                curveTo(2.8008f, 9.2109f, 7.4297f, 10.2422f, 11.1328f, 11.7891f)
                close()
                moveTo(3.8555f, 11.5547f)
                curveTo(2.2266f, 11.5078f, 0.8438f, 11.9062f, 0.0f, 12.9375f)
                curveTo(0.4102f, 17.8125f, 3.8555f, 21.9258f, 8.4141f, 23.332f)
                curveTo(6.2344f, 20.8008f, 3.9492f, 16.3594f, 3.8555f, 11.5547f)
                close()
                moveTo(10.6172f, 13.2422f)
                curveTo(8.8945f, 12.5039f, 7.0664f, 11.9297f, 5.3906f, 11.7188f)
                curveTo(5.6133f, 17.9531f, 9.6328f, 23.2148f, 11.5664f, 23.9062f)
                curveTo(13.1367f, 23.9297f, 14.5781f, 23.6836f, 15.8555f, 23.2148f)
                curveTo(12.9727f, 21.5039f, 10.7812f, 16.8867f, 10.6172f, 13.2422f)
                close()
                moveTo(17.8477f, 22.3008f)
                curveTo(21.4219f, 20.2266f, 23.8711f, 16.3359f, 23.8711f, 11.9531f)
                curveTo(23.8711f, 10.5352f, 23.6016f, 9.1641f, 23.1328f, 7.8984f)
                curveTo(22.3594f, 11.0625f, 19.9453f, 15.6797f, 14.4961f, 19.8398f)
                curveTo(15.4805f, 21.2461f, 16.6641f, 22.207f, 17.8477f, 22.3008f)
                close()
                moveTo(13.6992f, 18.5273f)
                curveTo(20.5898f, 13.1367f, 22.2773f, 7.2539f, 21.9375f, 5.4844f)
                curveTo(21.0f, 4.0664f, 19.7812f, 2.8477f, 18.3516f, 1.9219f)
                curveTo(18.7852f, 5.3438f, 15.9258f, 9.5156f, 12.1289f, 12.9375f)
                curveTo(12.1992f, 14.8125f, 12.7969f, 16.8281f, 13.6992f, 18.5273f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
