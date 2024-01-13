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

public val CupertinoIcons.Outlined.BookCircle: ImageVector
    get() {
        if (_bookCircle != null) {
            return _bookCircle!!
        }
        _bookCircle = Builder(name = "BookCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7305f, 6.9258f)
                curveTo(7.5117f, 6.9258f, 6.2344f, 7.4883f, 5.6836f, 8.4492f)
                curveTo(5.6133f, 8.5664f, 5.6133f, 8.6367f, 5.6133f, 8.8359f)
                lineTo(5.6133f, 16.6172f)
                curveTo(5.6133f, 16.8516f, 5.7773f, 17.0156f, 6.0352f, 17.0156f)
                curveTo(6.1758f, 17.0156f, 6.3047f, 16.9688f, 6.4102f, 16.875f)
                curveTo(7.0781f, 16.3008f, 7.9805f, 15.9727f, 8.9297f, 15.9727f)
                curveTo(9.7383f, 15.9727f, 10.5117f, 16.2422f, 11.1562f, 16.7695f)
                curveTo(11.2266f, 16.8281f, 11.2734f, 16.8633f, 11.3438f, 16.8633f)
                curveTo(11.4609f, 16.8633f, 11.5664f, 16.7578f, 11.5664f, 16.6289f)
                lineTo(11.5664f, 8.4727f)
                curveTo(11.5664f, 8.3438f, 11.5547f, 8.3203f, 11.4492f, 8.1563f)
                curveTo(10.9102f, 7.3945f, 9.8789f, 6.9258f, 8.7305f, 6.9258f)
                close()
                moveTo(15.1641f, 6.9258f)
                curveTo(14.0156f, 6.9258f, 12.9961f, 7.3945f, 12.4453f, 8.1563f)
                curveTo(12.3398f, 8.3203f, 12.3398f, 8.3438f, 12.3398f, 8.4727f)
                lineTo(12.3398f, 16.6289f)
                curveTo(12.3398f, 16.7578f, 12.4336f, 16.8633f, 12.5508f, 16.8633f)
                curveTo(12.6211f, 16.8633f, 12.6797f, 16.8281f, 12.7383f, 16.7695f)
                curveTo(13.3828f, 16.2422f, 14.168f, 15.9727f, 14.9648f, 15.9727f)
                curveTo(15.9258f, 15.9727f, 16.8281f, 16.3008f, 17.4961f, 16.875f)
                curveTo(17.6016f, 16.9688f, 17.7188f, 17.0156f, 17.8594f, 17.0156f)
                curveTo(18.1172f, 17.0156f, 18.293f, 16.8516f, 18.293f, 16.6172f)
                lineTo(18.293f, 8.8359f)
                curveTo(18.293f, 8.6367f, 18.2812f, 8.5547f, 18.2109f, 8.4492f)
                curveTo(17.6602f, 7.4883f, 16.3828f, 6.9258f, 15.1641f, 6.9258f)
                close()
            }
        }
        .build()
        return _bookCircle!!
    }

private var _bookCircle: ImageVector? = null
