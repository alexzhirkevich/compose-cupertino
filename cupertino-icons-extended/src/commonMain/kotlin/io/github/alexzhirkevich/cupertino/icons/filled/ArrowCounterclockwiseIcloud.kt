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

public val CupertinoIcons.Filled.ArrowCounterclockwiseIcloud: ImageVector
    get() {
        if (_arrowCounterclockwiseIcloud != null) {
            return _arrowCounterclockwiseIcloud!!
        }
        _arrowCounterclockwiseIcloud = Builder(name = "ArrowCounterclockwiseIcloud", defaultWidth =
                29.4609.dp, defaultHeight = 22.2773.dp, viewportWidth = 29.4609f, viewportHeight =
                22.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.1562f, 20.3672f)
                curveTo(26.6953f, 20.3672f, 29.4609f, 17.7773f, 29.4609f, 14.5547f)
                curveTo(29.4609f, 12.0938f, 28.043f, 9.9609f, 25.7578f, 9.0f)
                curveTo(25.7812f, 3.7734f, 22.0195f, 0.0f, 17.2266f, 0.0f)
                curveTo(14.0508f, 0.0f, 11.7891f, 1.6992f, 10.3828f, 3.75f)
                curveTo(7.5f, 2.9063f, 4.3594f, 5.0977f, 4.3008f, 8.3789f)
                curveTo(1.6523f, 8.8008f, 0.0f, 11.168f, 0.0f, 14.0273f)
                curveTo(0.0f, 17.4727f, 3.0117f, 20.3672f, 7.0195f, 20.3672f)
                close()
                moveTo(19.8516f, 11.6367f)
                curveTo(19.8516f, 14.3789f, 17.6836f, 16.5586f, 14.9766f, 16.5586f)
                curveTo(12.2812f, 16.5586f, 10.1133f, 14.3789f, 10.1133f, 11.6719f)
                curveTo(10.1133f, 11.2734f, 10.4531f, 10.9336f, 10.8633f, 10.9336f)
                curveTo(11.2852f, 10.9336f, 11.625f, 11.2734f, 11.625f, 11.6719f)
                curveTo(11.625f, 13.5469f, 13.1133f, 15.0586f, 14.9766f, 15.0586f)
                curveTo(16.8516f, 15.0586f, 18.3398f, 13.5469f, 18.3398f, 11.6719f)
                curveTo(18.3398f, 9.8203f, 16.8516f, 8.3203f, 14.9766f, 8.3203f)
                curveTo(14.8477f, 8.3203f, 14.707f, 8.332f, 14.6016f, 8.3555f)
                lineTo(15.6445f, 9.3867f)
                curveTo(15.7734f, 9.5156f, 15.8555f, 9.6914f, 15.8555f, 9.8789f)
                curveTo(15.8555f, 10.2773f, 15.5508f, 10.582f, 15.1641f, 10.582f)
                curveTo(14.9883f, 10.582f, 14.8008f, 10.5f, 14.6836f, 10.3828f)
                lineTo(12.5742f, 8.2734f)
                curveTo(12.3047f, 8.0039f, 12.3047f, 7.5117f, 12.5742f, 7.2539f)
                lineTo(14.6602f, 5.1211f)
                curveTo(14.7773f, 4.9805f, 14.9766f, 4.8984f, 15.1641f, 4.8984f)
                curveTo(15.5508f, 4.8984f, 15.8555f, 5.2266f, 15.8555f, 5.6133f)
                curveTo(15.8555f, 5.7891f, 15.7734f, 5.9883f, 15.6562f, 6.1055f)
                lineTo(14.918f, 6.8906f)
                curveTo(14.9883f, 6.8789f, 15.0938f, 6.8672f, 15.1875f, 6.8672f)
                curveTo(17.6484f, 6.8672f, 19.8516f, 8.9531f, 19.8516f, 11.6367f)
                close()
            }
        }
        .build()
        return _arrowCounterclockwiseIcloud!!
    }

private var _arrowCounterclockwiseIcloud: ImageVector? = null
