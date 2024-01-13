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

public val CupertinoIcons.Outlined.DeleteRight: ImageVector
    get() {
        if (_deleteRight != null) {
            return _deleteRight!!
        }
        _deleteRight = Builder(name = "DeleteRight", defaultWidth = 25.3945.dp, defaultHeight =
                21.5977.dp, viewportWidth = 25.3945f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(13.8516f, 21.5859f)
                curveTo(15.2227f, 21.5859f, 16.4062f, 21.1641f, 17.3672f, 20.1562f)
                lineTo(24.2812f, 13.0195f)
                curveTo(25.0547f, 12.2344f, 25.3945f, 11.5195f, 25.3945f, 10.793f)
                curveTo(25.3945f, 10.0547f, 25.0547f, 9.3516f, 24.2812f, 8.5664f)
                lineTo(17.3789f, 1.3945f)
                curveTo(16.418f, 0.375f, 15.2344f, 0.0234f, 13.8633f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2422f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2422f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(3.7148f, 19.7109f)
                curveTo(2.543f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.543f, 1.9102f, 3.7148f, 1.9102f)
                lineTo(13.8984f, 1.9102f)
                curveTo(14.7773f, 1.9102f, 15.3633f, 2.0625f, 15.9609f, 2.6836f)
                lineTo(22.8164f, 9.7969f)
                curveTo(23.2031f, 10.207f, 23.3438f, 10.4883f, 23.3438f, 10.793f)
                curveTo(23.3438f, 11.0859f, 23.2148f, 11.3672f, 22.8164f, 11.7773f)
                lineTo(15.9492f, 18.8672f)
                curveTo(15.3398f, 19.5f, 14.7773f, 19.7109f, 13.8867f, 19.7109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5625f, 15.7617f)
                curveTo(6.832f, 15.7617f, 7.0664f, 15.6562f, 7.2422f, 15.4688f)
                lineTo(10.5586f, 12.1289f)
                lineTo(13.8984f, 15.4688f)
                curveTo(14.0742f, 15.6445f, 14.2969f, 15.7617f, 14.5664f, 15.7617f)
                curveTo(15.0938f, 15.7617f, 15.5039f, 15.3281f, 15.5039f, 14.8125f)
                curveTo(15.5039f, 14.543f, 15.4102f, 14.3203f, 15.2227f, 14.1445f)
                lineTo(11.8945f, 10.8164f)
                lineTo(15.2344f, 7.4648f)
                curveTo(15.4336f, 7.2656f, 15.5156f, 7.0664f, 15.5156f, 6.8086f)
                curveTo(15.5156f, 6.2813f, 15.1055f, 5.8711f, 14.5781f, 5.8711f)
                curveTo(14.332f, 5.8711f, 14.1328f, 5.9531f, 13.9336f, 6.1523f)
                lineTo(10.5586f, 9.5039f)
                lineTo(7.2188f, 6.1641f)
                curveTo(7.043f, 5.9766f, 6.832f, 5.8945f, 6.5625f, 5.8945f)
                curveTo(6.0469f, 5.8945f, 5.625f, 6.293f, 5.625f, 6.8203f)
                curveTo(5.625f, 7.0781f, 5.7305f, 7.3008f, 5.9063f, 7.4766f)
                lineTo(9.2344f, 10.8164f)
                lineTo(5.9063f, 14.1562f)
                curveTo(5.7305f, 14.3203f, 5.625f, 14.5547f, 5.625f, 14.8125f)
                curveTo(5.625f, 15.3281f, 6.0469f, 15.7617f, 6.5625f, 15.7617f)
                close()
            }
        }
        .build()
        return _deleteRight!!
    }

private var _deleteRight: ImageVector? = null
