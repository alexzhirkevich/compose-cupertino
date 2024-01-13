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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.FigureWalk: ImageVector
    get() {
        if (_figureWalk != null) {
            return _figureWalk!!
        }
        _figureWalk = Builder(name = "FigureWalk", defaultWidth = 15.7895.dp, defaultHeight =
                26.3789.dp, viewportWidth = 15.7895f, viewportHeight = 26.3789f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9613f, 25.2891f)
                lineTo(5.4887f, 21.0938f)
                curveTo(5.8285f, 20.6836f, 5.8871f, 20.5898f, 6.0277f, 20.1562f)
                lineTo(6.2856f, 19.3594f)
                lineTo(4.3988f, 16.9922f)
                lineTo(3.8246f, 19.6406f)
                lineTo(0.3441f, 23.7656f)
                curveTo(-0.7574f, 25.0898f, 1.059f, 26.3789f, 1.9613f, 25.2891f)
                close()
                moveTo(10.5395f, 24.9375f)
                curveTo(11.266f, 26.4023f, 13.4223f, 25.5f, 12.6371f, 23.9062f)
                lineTo(10.2465f, 19.0664f)
                curveTo(10.059f, 18.7031f, 9.8129f, 18.3047f, 9.5902f, 17.9883f)
                lineTo(8.0785f, 15.8438f)
                lineTo(8.184f, 15.5273f)
                curveTo(8.5824f, 14.3086f, 8.7348f, 13.582f, 8.8285f, 12.375f)
                lineTo(9.0629f, 8.9883f)
                curveTo(9.1801f, 7.3828f, 8.2309f, 6.1641f, 6.5785f, 6.1641f)
                curveTo(5.3481f, 6.1641f, 4.5043f, 6.7852f, 3.3676f, 7.8984f)
                lineTo(1.5746f, 9.668f)
                curveTo(0.9887f, 10.2422f, 0.8012f, 10.7109f, 0.7426f, 11.4727f)
                lineTo(0.5316f, 14.2383f)
                curveTo(0.4731f, 14.9414f, 0.8598f, 15.4336f, 1.5043f, 15.457f)
                curveTo(2.1606f, 15.5039f, 2.559f, 15.1172f, 2.6176f, 14.3672f)
                lineTo(2.8871f, 11.332f)
                lineTo(3.7426f, 10.5586f)
                curveTo(4.059f, 10.2773f, 4.4574f, 10.4648f, 4.4457f, 10.7812f)
                lineTo(4.2582f, 13.3477f)
                curveTo(4.1527f, 14.6484f, 4.4574f, 15.2695f, 5.3481f, 16.3828f)
                lineTo(7.727f, 19.3594f)
                curveTo(7.9613f, 19.6641f, 7.9848f, 19.7812f, 8.0902f, 19.9688f)
                close()
                moveTo(14.6176f, 10.7344f)
                lineTo(11.9106f, 10.7344f)
                lineTo(10.2113f, 8.8477f)
                lineTo(10.0121f, 11.6719f)
                lineTo(10.6918f, 12.3516f)
                curveTo(11.0668f, 12.7266f, 11.3949f, 12.8438f, 12.0981f, 12.8438f)
                lineTo(14.6176f, 12.8438f)
                curveTo(15.3207f, 12.8438f, 15.7895f, 12.4453f, 15.7895f, 11.7891f)
                curveTo(15.7895f, 11.1562f, 15.309f, 10.7344f, 14.6176f, 10.7344f)
                close()
                moveTo(7.891f, 5.1094f)
                curveTo(9.2973f, 5.1094f, 10.434f, 3.9609f, 10.434f, 2.5547f)
                curveTo(10.434f, 1.1367f, 9.2973f, 0.0f, 7.891f, 0.0f)
                curveTo(6.4731f, 0.0f, 5.3363f, 1.1367f, 5.3363f, 2.5547f)
                curveTo(5.3363f, 3.9609f, 6.4731f, 5.1094f, 7.891f, 5.1094f)
                close()
            }
        }
        .build()
        return _figureWalk!!
    }

private var _figureWalk: ImageVector? = null
