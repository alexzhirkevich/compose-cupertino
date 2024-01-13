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

public val CupertinoIcons.Outlined.Rays: ImageVector
    get() {
        if (_rays != null) {
            return _rays!!
        }
        _rays = Builder(name = "Rays", defaultWidth = 25.4414.dp, defaultHeight = 25.5352.dp,
                viewportWidth = 25.4414f, viewportHeight = 25.5352f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7461f, 1.0195f)
                curveTo(13.7461f, 0.4688f, 13.2773f, 0.0f, 12.7148f, 0.0f)
                curveTo(12.1641f, 0.0f, 11.6953f, 0.4688f, 11.6953f, 1.0195f)
                lineTo(11.6953f, 4.6289f)
                curveTo(11.6953f, 5.1914f, 12.1641f, 5.6602f, 12.7148f, 5.6602f)
                curveTo(13.2773f, 5.6602f, 13.7461f, 5.1914f, 13.7461f, 4.6289f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6836f, 6.3164f)
                curveTo(17.2852f, 6.7031f, 17.2852f, 7.3594f, 17.6836f, 7.7578f)
                curveTo(18.0703f, 8.1445f, 18.7383f, 8.1445f, 19.1367f, 7.7578f)
                lineTo(21.6797f, 5.2031f)
                curveTo(22.0781f, 4.8047f, 22.0781f, 4.1484f, 21.6797f, 3.75f)
                curveTo(21.293f, 3.3633f, 20.6367f, 3.3633f, 20.25f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.4102f, 13.7344f)
                curveTo(24.9727f, 13.7344f, 25.4414f, 13.2656f, 25.4414f, 12.7148f)
                curveTo(25.4414f, 12.1641f, 24.9727f, 11.6953f, 24.4102f, 11.6953f)
                lineTo(20.8008f, 11.6953f)
                curveTo(20.25f, 11.6953f, 19.7812f, 12.1641f, 19.7812f, 12.7148f)
                curveTo(19.7812f, 13.2656f, 20.25f, 13.7344f, 20.8008f, 13.7344f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1367f, 17.6719f)
                curveTo(18.7383f, 17.2852f, 18.0703f, 17.2852f, 17.6836f, 17.6719f)
                curveTo(17.2852f, 18.0703f, 17.2852f, 18.7266f, 17.6836f, 19.1133f)
                lineTo(20.25f, 21.6797f)
                curveTo(20.6367f, 22.0664f, 21.293f, 22.0547f, 21.6797f, 21.6797f)
                curveTo(22.0781f, 21.293f, 22.0781f, 20.625f, 21.6797f, 20.2266f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7461f, 20.8008f)
                curveTo(13.7461f, 20.2383f, 13.2773f, 19.7695f, 12.7148f, 19.7695f)
                curveTo(12.1641f, 19.7695f, 11.6953f, 20.2383f, 11.6953f, 20.8008f)
                lineTo(11.6953f, 24.4102f)
                curveTo(11.6953f, 24.9609f, 12.1641f, 25.4297f, 12.7148f, 25.4297f)
                curveTo(13.2773f, 25.4297f, 13.7461f, 24.9609f, 13.7461f, 24.4102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 20.2266f)
                curveTo(3.3633f, 20.6133f, 3.3633f, 21.2812f, 3.7383f, 21.668f)
                curveTo(4.125f, 22.0547f, 4.793f, 22.0664f, 5.1914f, 21.6797f)
                lineTo(7.7461f, 19.125f)
                curveTo(8.1328f, 18.7383f, 8.1328f, 18.082f, 7.7461f, 17.6953f)
                curveTo(7.3711f, 17.2969f, 6.6914f, 17.2969f, 6.3047f, 17.6953f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0195f, 11.6953f)
                curveTo(0.4688f, 11.6953f, 0.0f, 12.1641f, 0.0f, 12.7148f)
                curveTo(0.0f, 13.2656f, 0.4688f, 13.7344f, 1.0195f, 13.7344f)
                lineTo(4.6523f, 13.7344f)
                curveTo(5.2031f, 13.7344f, 5.6719f, 13.2656f, 5.6719f, 12.7148f)
                curveTo(5.6719f, 12.1641f, 5.2031f, 11.6953f, 4.6523f, 11.6953f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1875f, 7.6406f)
                curveTo(6.5742f, 8.0273f, 7.2305f, 8.0273f, 7.6289f, 7.6406f)
                curveTo(8.0156f, 7.2422f, 8.0156f, 6.5859f, 7.6289f, 6.1992f)
                lineTo(5.0859f, 3.6445f)
                curveTo(4.6992f, 3.2578f, 4.043f, 3.2461f, 3.6445f, 3.6328f)
                curveTo(3.2578f, 4.0195f, 3.2578f, 4.6758f, 3.6445f, 5.0742f)
                close()
            }
        }
        .build()
        return _rays!!
    }

private var _rays: ImageVector? = null
