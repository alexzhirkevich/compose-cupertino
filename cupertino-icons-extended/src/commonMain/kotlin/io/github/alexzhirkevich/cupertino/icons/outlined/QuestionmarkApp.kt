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

public val CupertinoIcons.Outlined.QuestionmarkApp: ImageVector
    get() {
        if (_questionmarkApp != null) {
            return _questionmarkApp!!
        }
        _questionmarkApp = Builder(name = "QuestionmarkApp", defaultWidth = 21.6094.dp,
                defaultHeight = 21.5273.dp, viewportWidth = 21.6094f, viewportHeight =
                21.5273f).apply {
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
                moveTo(10.582f, 13.1836f)
                curveTo(11.168f, 13.1836f, 11.5195f, 12.8086f, 11.5195f, 12.3516f)
                curveTo(11.5195f, 12.3047f, 11.5195f, 12.2461f, 11.5195f, 12.2109f)
                curveTo(11.5195f, 11.5547f, 11.9062f, 11.1328f, 12.7148f, 10.5938f)
                curveTo(13.8516f, 9.8438f, 14.6602f, 9.1641f, 14.6602f, 7.7578f)
                curveTo(14.6602f, 5.8125f, 12.9375f, 4.7578f, 10.9453f, 4.7578f)
                curveTo(8.9297f, 4.7578f, 7.6055f, 5.7188f, 7.2773f, 6.7969f)
                curveTo(7.2188f, 6.9844f, 7.1836f, 7.1719f, 7.1836f, 7.3711f)
                curveTo(7.1836f, 7.8984f, 7.5938f, 8.1797f, 7.9922f, 8.1797f)
                curveTo(8.3906f, 8.1797f, 8.6367f, 7.9922f, 8.8477f, 7.7109f)
                lineTo(9.0586f, 7.4297f)
                curveTo(9.4688f, 6.75f, 10.0898f, 6.3516f, 10.8633f, 6.3516f)
                curveTo(11.9297f, 6.3516f, 12.6328f, 6.9609f, 12.6328f, 7.8516f)
                curveTo(12.6328f, 8.6484f, 12.1289f, 9.0352f, 11.1094f, 9.75f)
                curveTo(10.2656f, 10.3359f, 9.6445f, 10.957f, 9.6445f, 12.1055f)
                curveTo(9.6445f, 12.1523f, 9.6445f, 12.2109f, 9.6445f, 12.2578f)
                curveTo(9.6445f, 12.8672f, 9.9727f, 13.1836f, 10.582f, 13.1836f)
                close()
                moveTo(10.5469f, 16.6758f)
                curveTo(11.2266f, 16.6758f, 11.8125f, 16.1367f, 11.8125f, 15.457f)
                curveTo(11.8125f, 14.7773f, 11.2383f, 14.2383f, 10.5469f, 14.2383f)
                curveTo(9.8555f, 14.2383f, 9.2813f, 14.7891f, 9.2813f, 15.457f)
                curveTo(9.2813f, 16.125f, 9.8672f, 16.6758f, 10.5469f, 16.6758f)
                close()
            }
        }
        .build()
        return _questionmarkApp!!
    }

private var _questionmarkApp: ImageVector? = null
