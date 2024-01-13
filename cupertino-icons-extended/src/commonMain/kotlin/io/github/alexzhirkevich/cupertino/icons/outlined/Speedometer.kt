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

public val CupertinoIcons.Outlined.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.207f, 17.8242f)
                curveTo(7.8398f, 17.8242f, 8.3555f, 17.2969f, 8.3555f, 16.6641f)
                curveTo(8.3555f, 16.0312f, 7.8398f, 15.5156f, 7.207f, 15.5156f)
                curveTo(6.5742f, 15.5156f, 6.0586f, 16.0312f, 6.0586f, 16.6641f)
                curveTo(6.0586f, 17.2969f, 6.5742f, 17.8242f, 7.207f, 17.8242f)
                close()
                moveTo(5.1914f, 13.1016f)
                curveTo(5.8359f, 13.1016f, 6.3516f, 12.5859f, 6.3516f, 11.9531f)
                curveTo(6.3516f, 11.3203f, 5.8359f, 10.8047f, 5.1914f, 10.8047f)
                curveTo(4.5703f, 10.8047f, 4.043f, 11.3203f, 4.043f, 11.9531f)
                curveTo(4.043f, 12.5859f, 4.5703f, 13.1016f, 5.1914f, 13.1016f)
                close()
                moveTo(7.1836f, 8.3906f)
                curveTo(7.8164f, 8.3906f, 8.332f, 7.8633f, 8.332f, 7.2422f)
                curveTo(8.332f, 6.5977f, 7.8164f, 6.0938f, 7.1836f, 6.0938f)
                curveTo(6.5508f, 6.0938f, 6.0352f, 6.5977f, 6.0352f, 7.2422f)
                curveTo(6.0352f, 7.8633f, 6.5508f, 8.3906f, 7.1836f, 8.3906f)
                close()
                moveTo(11.9414f, 6.3281f)
                curveTo(12.5625f, 6.3281f, 13.0898f, 5.8008f, 13.0898f, 5.1797f)
                curveTo(13.0898f, 4.5352f, 12.5625f, 4.0195f, 11.9414f, 4.0195f)
                curveTo(11.3086f, 4.0195f, 10.793f, 4.5352f, 10.793f, 5.1797f)
                curveTo(10.793f, 5.8008f, 11.3086f, 6.3281f, 11.9414f, 6.3281f)
                close()
                moveTo(18.6914f, 13.1016f)
                curveTo(19.3125f, 13.1016f, 19.8398f, 12.5859f, 19.8398f, 11.9531f)
                curveTo(19.8398f, 11.3203f, 19.3125f, 10.8047f, 18.6914f, 10.8047f)
                curveTo(18.0469f, 10.8047f, 17.543f, 11.3203f, 17.543f, 11.9531f)
                curveTo(17.543f, 12.5859f, 18.0469f, 13.1016f, 18.6914f, 13.1016f)
                close()
                moveTo(16.6758f, 17.8242f)
                curveTo(17.3086f, 17.8242f, 17.8242f, 17.2969f, 17.8242f, 16.6641f)
                curveTo(17.8242f, 16.0312f, 17.3086f, 15.5156f, 16.6758f, 15.5156f)
                curveTo(16.043f, 15.5156f, 15.5273f, 16.0312f, 15.5273f, 16.6641f)
                curveTo(15.5273f, 17.2969f, 16.043f, 17.8242f, 16.6758f, 17.8242f)
                close()
                moveTo(10.0781f, 13.7578f)
                curveTo(11.0273f, 14.6836f, 12.3281f, 14.4727f, 13.1133f, 13.3711f)
                lineTo(17.6953f, 6.9727f)
                curveTo(18.1172f, 6.3867f, 17.4961f, 5.7773f, 16.9102f, 6.1875f)
                lineTo(10.4531f, 10.7109f)
                curveTo(9.3398f, 11.4844f, 9.1406f, 12.7969f, 10.0781f, 13.7578f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
