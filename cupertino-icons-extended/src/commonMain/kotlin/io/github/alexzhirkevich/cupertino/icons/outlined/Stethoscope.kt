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

public val CupertinoIcons.Outlined.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 31.3594.dp, defaultHeight =
                25.7461.dp, viewportWidth = 31.3594f, viewportHeight = 25.7461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.1445f)
                curveTo(0.0f, 9.9375f, 4.3359f, 17.0391f, 8.4023f, 17.0391f)
                lineTo(8.9297f, 17.0391f)
                curveTo(12.9961f, 17.0391f, 17.332f, 9.9375f, 17.332f, 5.1445f)
                curveTo(17.332f, 2.5547f, 16.0547f, 1.2305f, 13.582f, 1.2305f)
                lineTo(12.3398f, 1.2305f)
                lineTo(12.3398f, 3.1172f)
                lineTo(13.6758f, 3.1172f)
                curveTo(14.8594f, 3.1172f, 15.4453f, 3.8203f, 15.4453f, 5.1211f)
                curveTo(15.4453f, 8.8359f, 12.0f, 15.1523f, 8.6602f, 15.1523f)
                curveTo(5.3203f, 15.1523f, 1.8867f, 8.8359f, 1.8867f, 5.1211f)
                curveTo(1.8867f, 3.8203f, 2.4727f, 3.1172f, 3.6445f, 3.1172f)
                lineTo(4.9805f, 3.1172f)
                lineTo(4.9805f, 1.2305f)
                lineTo(3.7383f, 1.2305f)
                curveTo(1.2773f, 1.2305f, 0.0f, 2.5547f, 0.0f, 5.1445f)
                close()
                moveTo(13.6523f, 25.7461f)
                curveTo(17.2148f, 25.7461f, 19.0664f, 22.9102f, 20.0508f, 17.1914f)
                curveTo(20.8008f, 12.9258f, 21.832f, 11.5898f, 23.543f, 11.5898f)
                curveTo(25.5117f, 11.5898f, 26.4609f, 13.582f, 26.6367f, 17.6602f)
                lineTo(28.5234f, 17.6602f)
                curveTo(28.1719f, 12.3633f, 26.707f, 9.7031f, 23.543f, 9.7031f)
                curveTo(20.6836f, 9.7031f, 19.1367f, 11.6484f, 18.1992f, 16.7695f)
                curveTo(17.3672f, 21.375f, 16.3242f, 23.8594f, 13.5352f, 23.8594f)
                curveTo(11.0039f, 23.8594f, 9.5742f, 21.1172f, 9.5859f, 16.2773f)
                lineTo(7.6992f, 16.2773f)
                curveTo(7.6875f, 22.3594f, 9.8438f, 25.7461f, 13.6523f, 25.7461f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5664f, 3.9258f)
                curveTo(6.5273f, 3.9258f, 7.3242f, 3.1289f, 7.3242f, 2.1563f)
                curveTo(7.3242f, 1.1836f, 6.5273f, 0.3867f, 5.5664f, 0.3867f)
                curveTo(4.5938f, 0.3867f, 3.7969f, 1.1836f, 3.7969f, 2.1563f)
                curveTo(3.7969f, 3.1289f, 4.5938f, 3.9258f, 5.5664f, 3.9258f)
                close()
                moveTo(11.7422f, 3.9258f)
                curveTo(12.7148f, 3.9258f, 13.5117f, 3.1289f, 13.5117f, 2.1563f)
                curveTo(13.5117f, 1.1836f, 12.7148f, 0.3867f, 11.7422f, 0.3867f)
                curveTo(10.7812f, 0.3867f, 9.9844f, 1.1836f, 9.9844f, 2.1563f)
                curveTo(9.9844f, 3.1289f, 10.7812f, 3.9258f, 11.7422f, 3.9258f)
                close()
                moveTo(27.6562f, 24.1875f)
                curveTo(29.6953f, 24.1875f, 31.3594f, 22.5352f, 31.3594f, 20.4727f)
                curveTo(31.3594f, 18.4336f, 29.6953f, 16.7812f, 27.6562f, 16.7695f)
                curveTo(25.6055f, 16.7578f, 23.9414f, 18.4336f, 23.9414f, 20.4727f)
                curveTo(23.9414f, 22.5352f, 25.6055f, 24.1875f, 27.6562f, 24.1875f)
                close()
                moveTo(27.6562f, 22.5352f)
                curveTo(26.5195f, 22.5352f, 25.582f, 21.6094f, 25.582f, 20.4727f)
                curveTo(25.582f, 19.3242f, 26.5195f, 18.4102f, 27.6562f, 18.4102f)
                curveTo(28.793f, 18.4102f, 29.7188f, 19.3242f, 29.7188f, 20.4727f)
                curveTo(29.7188f, 21.6094f, 28.793f, 22.5352f, 27.6562f, 22.5352f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
