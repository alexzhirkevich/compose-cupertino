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

public val CupertinoIcons.Outlined.PlusApp: ImageVector
    get() {
        if (_plusApp != null) {
            return _plusApp!!
        }
        _plusApp = Builder(name = "PlusApp", defaultWidth = 21.6094.dp, defaultHeight = 21.5273.dp,
                viewportWidth = 21.6094f, viewportHeight = 21.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2383f, 1.4063f)
                curveTo(19.043f, 0.2109f, 17.3555f, 0.0234f, 15.3516f, 0.0234f)
                lineTo(6.2227f, 0.0234f)
                curveTo(4.2539f, 0.0234f, 2.5664f, 0.2109f, 1.3711f, 1.4063f)
                curveTo(0.1758f, 2.6016f, 0.0f, 4.2773f, 0.0f, 6.2344f)
                lineTo(0.0f, 15.2812f)
                curveTo(0.0f, 17.2852f, 0.1758f, 18.9492f, 1.3711f, 20.1445f)
                curveTo(2.5664f, 21.3398f, 4.2539f, 21.5273f, 6.2461f, 21.5273f)
                lineTo(15.3516f, 21.5273f)
                curveTo(17.3555f, 21.5273f, 19.043f, 21.3398f, 20.2383f, 20.1445f)
                curveTo(21.4336f, 18.9492f, 21.6094f, 17.2852f, 21.6094f, 15.2812f)
                lineTo(21.6094f, 6.2695f)
                curveTo(21.6094f, 4.2656f, 21.4336f, 2.5898f, 20.2383f, 1.4063f)
                close()
                moveTo(19.7227f, 5.9414f)
                lineTo(19.7227f, 15.5977f)
                curveTo(19.7227f, 16.8164f, 19.5703f, 18.0586f, 18.8555f, 18.7734f)
                curveTo(18.1523f, 19.4766f, 16.8867f, 19.6406f, 15.6797f, 19.6406f)
                lineTo(5.9297f, 19.6406f)
                curveTo(4.7227f, 19.6406f, 3.457f, 19.4766f, 2.7422f, 18.7734f)
                curveTo(2.0391f, 18.0586f, 1.8867f, 16.8164f, 1.8867f, 15.5977f)
                lineTo(1.8867f, 5.9766f)
                curveTo(1.8867f, 4.7461f, 2.0391f, 3.4805f, 2.7422f, 2.7773f)
                curveTo(3.457f, 2.0625f, 4.7344f, 1.9102f, 5.9648f, 1.9102f)
                lineTo(15.6797f, 1.9102f)
                curveTo(16.8867f, 1.9102f, 18.1523f, 2.0742f, 18.8555f, 2.7773f)
                curveTo(19.5703f, 3.4922f, 19.7227f, 4.7344f, 19.7227f, 5.9414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3789f, 10.7578f)
                curveTo(5.3789f, 11.332f, 5.7891f, 11.7188f, 6.3867f, 11.7188f)
                lineTo(9.832f, 11.7188f)
                lineTo(9.832f, 15.1758f)
                curveTo(9.832f, 15.7617f, 10.2188f, 16.1719f, 10.793f, 16.1719f)
                curveTo(11.3789f, 16.1719f, 11.7891f, 15.7734f, 11.7891f, 15.1758f)
                lineTo(11.7891f, 11.7188f)
                lineTo(15.2461f, 11.7188f)
                curveTo(15.832f, 11.7188f, 16.2422f, 11.332f, 16.2422f, 10.7578f)
                curveTo(16.2422f, 10.1719f, 15.832f, 9.7617f, 15.2461f, 9.7617f)
                lineTo(11.7891f, 9.7617f)
                lineTo(11.7891f, 6.3164f)
                curveTo(11.7891f, 5.7188f, 11.3789f, 5.3086f, 10.793f, 5.3086f)
                curveTo(10.2188f, 5.3086f, 9.832f, 5.7188f, 9.832f, 6.3164f)
                lineTo(9.832f, 9.7617f)
                lineTo(6.3867f, 9.7617f)
                curveTo(5.7773f, 9.7617f, 5.3789f, 10.1719f, 5.3789f, 10.7578f)
                close()
            }
        }
        .build()
        return _plusApp!!
    }

private var _plusApp: ImageVector? = null
