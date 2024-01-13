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

public val CupertinoIcons.Filled.DocOnDoc: ImageVector
    get() {
        if (_docOnDoc != null) {
            return _docOnDoc!!
        }
        _docOnDoc = Builder(name = "DocOnDoc", defaultWidth = 23.9648.dp, defaultHeight =
                29.5195.dp, viewportWidth = 23.9648f, viewportHeight = 29.5195f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.875f, 23.6367f)
                lineTo(20.332f, 23.6367f)
                curveTo(22.7344f, 23.6367f, 23.9648f, 22.3945f, 23.9648f, 19.957f)
                lineTo(23.9648f, 8.8359f)
                lineTo(17.4844f, 8.8359f)
                curveTo(16.2539f, 8.8359f, 15.5625f, 8.1445f, 15.5625f, 6.9258f)
                lineTo(15.5625f, 0.0f)
                lineTo(9.3164f, 0.0f)
                curveTo(6.9375f, 0.0f, 5.6836f, 1.2422f, 5.6836f, 3.5859f)
                lineTo(5.6836f, 4.2539f)
                lineTo(7.3828f, 4.2539f)
                curveTo(9.0234f, 4.2539f, 10.3477f, 4.6289f, 11.6602f, 5.9414f)
                lineTo(18.3164f, 12.5859f)
                curveTo(19.6289f, 13.9102f, 19.875f, 15.2695f, 19.875f, 16.8633f)
                close()
                moveTo(17.707f, 7.3711f)
                lineTo(23.8242f, 7.3711f)
                curveTo(23.7656f, 6.9961f, 23.5078f, 6.668f, 23.0977f, 6.2578f)
                lineTo(18.1406f, 1.207f)
                curveTo(17.7422f, 0.7852f, 17.4023f, 0.5273f, 17.0391f, 0.4805f)
                lineTo(17.0508f, 6.6914f)
                curveTo(17.0508f, 7.1719f, 17.2266f, 7.3711f, 17.707f, 7.3711f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6328f, 29.4844f)
                lineTo(14.6484f, 29.4844f)
                curveTo(17.0742f, 29.4844f, 18.2812f, 28.2422f, 18.2812f, 25.8047f)
                lineTo(18.2812f, 16.5469f)
                lineTo(10.1016f, 16.5469f)
                curveTo(8.5898f, 16.5469f, 7.8867f, 15.832f, 7.8867f, 14.332f)
                lineTo(7.8867f, 5.8477f)
                lineTo(3.6328f, 5.8477f)
                curveTo(1.2188f, 5.8477f, 0.0f, 7.0781f, 0.0f, 9.5273f)
                lineTo(0.0f, 25.8047f)
                curveTo(0.0f, 28.2539f, 1.207f, 29.4844f, 3.6328f, 29.4844f)
                close()
                moveTo(10.0898f, 14.9414f)
                lineTo(18.0703f, 14.9414f)
                curveTo(17.9531f, 14.4844f, 17.6836f, 14.0625f, 17.1562f, 13.5234f)
                lineTo(10.8984f, 7.1484f)
                curveTo(10.3828f, 6.6211f, 9.9375f, 6.2695f, 9.4805f, 6.1406f)
                lineTo(9.4805f, 14.3438f)
                curveTo(9.4805f, 14.7422f, 9.6914f, 14.9414f, 10.0898f, 14.9414f)
                close()
            }
        }
        .build()
        return _docOnDoc!!
    }

private var _docOnDoc: ImageVector? = null
