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

public val CupertinoIcons.Outlined.DeleteLeft: ImageVector
    get() {
        if (_deleteLeft != null) {
            return _deleteLeft!!
        }
        _deleteLeft = Builder(name = "DeleteLeft", defaultWidth = 25.3945.dp, defaultHeight =
                21.5977.dp, viewportWidth = 25.3945f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7148f, 21.5977f)
                curveTo(24.1641f, 21.5977f, 25.3945f, 20.3906f, 25.3945f, 17.9648f)
                lineTo(25.3945f, 3.6563f)
                curveTo(25.3945f, 1.2305f, 24.1641f, 0.0234f, 21.7148f, 0.0234f)
                lineTo(11.5312f, 0.0234f)
                curveTo(10.1602f, 0.0234f, 8.9766f, 0.375f, 8.0156f, 1.3945f)
                lineTo(1.1133f, 8.5664f)
                curveTo(0.3516f, 9.3516f, 0.0f, 10.0547f, 0.0f, 10.793f)
                curveTo(0.0f, 11.5195f, 0.3398f, 12.2344f, 1.1133f, 13.0195f)
                lineTo(8.0273f, 20.1562f)
                curveTo(9.0f, 21.1641f, 10.1719f, 21.5859f, 11.543f, 21.5859f)
                close()
                moveTo(21.6914f, 19.7109f)
                lineTo(11.5078f, 19.7109f)
                curveTo(10.6172f, 19.7109f, 10.0664f, 19.5f, 9.4453f, 18.8672f)
                lineTo(2.5781f, 11.7773f)
                curveTo(2.1797f, 11.3672f, 2.0625f, 11.0859f, 2.0625f, 10.793f)
                curveTo(2.0625f, 10.4883f, 2.1914f, 10.207f, 2.5781f, 9.7969f)
                lineTo(9.4336f, 2.6836f)
                curveTo(10.043f, 2.0625f, 10.6172f, 1.9102f, 11.4961f, 1.9102f)
                lineTo(21.6914f, 1.9102f)
                curveTo(22.8633f, 1.9102f, 23.5078f, 2.5313f, 23.5078f, 3.75f)
                lineTo(23.5078f, 17.8711f)
                curveTo(23.5078f, 19.0898f, 22.8633f, 19.7109f, 21.6914f, 19.7109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8516f, 15.7617f)
                curveTo(11.1094f, 15.7617f, 11.3438f, 15.6562f, 11.5195f, 15.4688f)
                lineTo(14.8477f, 12.1289f)
                lineTo(18.1758f, 15.4688f)
                curveTo(18.3516f, 15.6445f, 18.5859f, 15.7617f, 18.8555f, 15.7617f)
                curveTo(19.3711f, 15.7617f, 19.793f, 15.3281f, 19.793f, 14.8125f)
                curveTo(19.793f, 14.543f, 19.6875f, 14.3203f, 19.5117f, 14.1445f)
                lineTo(16.1836f, 10.8164f)
                lineTo(19.5234f, 7.4648f)
                curveTo(19.7109f, 7.2656f, 19.8047f, 7.0664f, 19.8047f, 6.8086f)
                curveTo(19.8047f, 6.2813f, 19.3828f, 5.8711f, 18.8672f, 5.8711f)
                curveTo(18.6211f, 5.8711f, 18.4102f, 5.9531f, 18.2109f, 6.1523f)
                lineTo(14.8477f, 9.5039f)
                lineTo(11.4961f, 6.1641f)
                curveTo(11.3203f, 5.9766f, 11.1094f, 5.8945f, 10.8516f, 5.8945f)
                curveTo(10.3359f, 5.8945f, 9.9141f, 6.293f, 9.9141f, 6.8203f)
                curveTo(9.9141f, 7.0781f, 10.0078f, 7.3008f, 10.1953f, 7.4766f)
                lineTo(13.5234f, 10.8164f)
                lineTo(10.1953f, 14.1562f)
                curveTo(10.0078f, 14.3203f, 9.9141f, 14.5547f, 9.9141f, 14.8125f)
                curveTo(9.9141f, 15.3281f, 10.3359f, 15.7617f, 10.8516f, 15.7617f)
                close()
            }
        }
        .build()
        return _deleteLeft!!
    }

private var _deleteLeft: ImageVector? = null
