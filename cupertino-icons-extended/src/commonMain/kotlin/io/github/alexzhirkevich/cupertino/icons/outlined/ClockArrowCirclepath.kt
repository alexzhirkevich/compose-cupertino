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

public val CupertinoIcons.Outlined.ClockArrowCirclepath: ImageVector
    get() {
        if (_clockArrowCirclepath != null) {
            return _clockArrowCirclepath!!
        }
        _clockArrowCirclepath = Builder(name = "ClockArrowCirclepath", defaultWidth = 26.1813.dp,
                defaultHeight = 23.918.dp, viewportWidth = 26.1813f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2281f, 23.9062f)
                curveTo(20.7555f, 23.9062f, 26.1813f, 18.4805f, 26.1813f, 11.9531f)
                curveTo(26.1813f, 5.4141f, 20.7555f, 0.0f, 14.2281f, 0.0f)
                curveTo(7.6891f, 0.0f, 2.275f, 5.4023f, 2.275f, 11.9414f)
                lineTo(4.2672f, 11.9414f)
                curveTo(4.2672f, 6.4102f, 8.6969f, 2.0039f, 14.2281f, 2.0039f)
                curveTo(19.7594f, 2.0039f, 24.1891f, 6.4219f, 24.1891f, 11.9531f)
                curveTo(24.1891f, 17.4844f, 19.7594f, 21.9375f, 14.2281f, 21.9141f)
                curveTo(10.8883f, 21.9023f, 7.9586f, 20.2852f, 6.1656f, 17.7891f)
                curveTo(5.8024f, 17.3086f, 5.2516f, 17.1562f, 4.7594f, 17.4492f)
                curveTo(4.2906f, 17.7422f, 4.1617f, 18.3867f, 4.5602f, 18.9023f)
                curveTo(6.7867f, 21.8906f, 10.2789f, 23.9062f, 14.2281f, 23.9062f)
                close()
                moveTo(0.8336f, 9.6914f)
                curveTo(-0.0101f, 9.6914f, -0.2211f, 10.2656f, 0.236f, 10.9219f)
                lineTo(2.861f, 14.6484f)
                curveTo(3.2477f, 15.1875f, 3.8102f, 15.1758f, 4.1852f, 14.6484f)
                lineTo(6.8102f, 10.9102f)
                curveTo(7.2555f, 10.2656f, 7.0445f, 9.6914f, 6.2125f, 9.6914f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7828f, 5.0859f)
                curveTo(13.2672f, 5.0859f, 12.8453f, 5.4961f, 12.8453f, 6.0117f)
                lineTo(12.8453f, 12.5508f)
                curveTo(12.8453f, 12.8203f, 12.9274f, 13.0547f, 13.1266f, 13.3125f)
                lineTo(16.0211f, 17.1328f)
                curveTo(16.4078f, 17.6367f, 16.9469f, 17.7188f, 17.4274f, 17.3906f)
                curveTo(17.861f, 17.0859f, 17.8961f, 16.5352f, 17.5445f, 16.0547f)
                lineTo(13.6422f, 10.793f)
                lineTo(14.7086f, 14.0742f)
                lineTo(14.7086f, 6.0117f)
                curveTo(14.7086f, 5.4961f, 14.2985f, 5.0859f, 13.7828f, 5.0859f)
                close()
            }
        }
        .build()
        return _clockArrowCirclepath!!
    }

private var _clockArrowCirclepath: ImageVector? = null
