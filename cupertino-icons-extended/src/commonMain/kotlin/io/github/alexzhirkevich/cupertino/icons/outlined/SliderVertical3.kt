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

public val CupertinoIcons.Outlined.SliderVertical3: ImageVector
    get() {
        if (_sliderVertical3 != null) {
            return _sliderVertical3!!
        }
        _sliderVertical3 = Builder(name = "SliderVertical3", defaultWidth = 21.4453.dp,
                defaultHeight = 21.7617.dp, viewportWidth = 21.4453f, viewportHeight =
                21.7617f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.6055f)
                curveTo(0.0f, 15.1523f, 1.2656f, 16.418f, 2.8125f, 16.418f)
                curveTo(4.3594f, 16.418f, 5.6367f, 15.1523f, 5.6367f, 13.6055f)
                curveTo(5.6367f, 12.0586f, 4.3594f, 10.793f, 2.8125f, 10.793f)
                curveTo(1.2656f, 10.793f, 0.0f, 12.0586f, 0.0f, 13.6055f)
                close()
                moveTo(1.4414f, 13.6055f)
                curveTo(1.4414f, 12.832f, 2.0508f, 12.2344f, 2.8242f, 12.2344f)
                curveTo(3.5977f, 12.2344f, 4.1953f, 12.832f, 4.1953f, 13.6055f)
                curveTo(4.1953f, 14.3789f, 3.5977f, 14.9766f, 2.8242f, 14.9766f)
                curveTo(2.0508f, 14.9766f, 1.4414f, 14.3789f, 1.4414f, 13.6055f)
                close()
                moveTo(2.8242f, 0.0f)
                curveTo(2.2969f, 0.0f, 1.875f, 0.4219f, 1.875f, 0.9492f)
                lineTo(1.875f, 11.7422f)
                lineTo(3.7617f, 11.7422f)
                lineTo(3.7617f, 0.9492f)
                curveTo(3.7617f, 0.4219f, 3.3516f, 0.0f, 2.8242f, 0.0f)
                close()
                moveTo(2.8242f, 20.625f)
                curveTo(3.3516f, 20.625f, 3.7617f, 20.2031f, 3.7617f, 19.7227f)
                lineTo(3.7617f, 15.6445f)
                lineTo(1.875f, 15.6445f)
                lineTo(1.875f, 19.7227f)
                curveTo(1.875f, 20.2031f, 2.2969f, 20.625f, 2.8242f, 20.625f)
                close()
                moveTo(7.8984f, 6.832f)
                curveTo(7.8984f, 8.3789f, 9.1758f, 9.6445f, 10.7227f, 9.6445f)
                curveTo(12.2695f, 9.6445f, 13.5352f, 8.3789f, 13.5352f, 6.832f)
                curveTo(13.5352f, 5.2852f, 12.2695f, 4.0195f, 10.7227f, 4.0195f)
                curveTo(9.1758f, 4.0195f, 7.8984f, 5.2852f, 7.8984f, 6.832f)
                close()
                moveTo(9.3516f, 6.832f)
                curveTo(9.3516f, 6.0703f, 9.9609f, 5.4609f, 10.7227f, 5.4609f)
                curveTo(11.4961f, 5.4609f, 12.0938f, 6.0703f, 12.0938f, 6.832f)
                curveTo(12.0938f, 7.6055f, 11.4961f, 8.2031f, 10.7227f, 8.2031f)
                curveTo(9.9609f, 8.2031f, 9.3516f, 7.6055f, 9.3516f, 6.832f)
                close()
                moveTo(10.7227f, 0.0f)
                curveTo(10.1953f, 0.0f, 9.7852f, 0.4219f, 9.7852f, 0.9023f)
                lineTo(9.7852f, 4.8164f)
                lineTo(11.6719f, 4.8164f)
                lineTo(11.6719f, 0.9023f)
                curveTo(11.6719f, 0.4219f, 11.25f, 0.0f, 10.7227f, 0.0f)
                close()
                moveTo(10.7227f, 20.625f)
                curveTo(11.25f, 20.625f, 11.6719f, 20.2031f, 11.6719f, 19.6758f)
                lineTo(11.6719f, 8.6953f)
                lineTo(9.7852f, 8.6953f)
                lineTo(9.7852f, 19.6758f)
                curveTo(9.7852f, 20.2031f, 10.1953f, 20.625f, 10.7227f, 20.625f)
                close()
                moveTo(15.8203f, 13.6055f)
                curveTo(15.8203f, 15.1523f, 17.0859f, 16.418f, 18.6328f, 16.418f)
                curveTo(20.1797f, 16.418f, 21.4453f, 15.1523f, 21.4453f, 13.6055f)
                curveTo(21.4453f, 12.0586f, 20.1797f, 10.793f, 18.6328f, 10.793f)
                curveTo(17.0859f, 10.793f, 15.8203f, 12.0586f, 15.8203f, 13.6055f)
                close()
                moveTo(17.2617f, 13.6055f)
                curveTo(17.2617f, 12.832f, 17.8711f, 12.2344f, 18.6328f, 12.2344f)
                curveTo(19.418f, 12.2344f, 20.0039f, 12.832f, 20.0039f, 13.6055f)
                curveTo(20.0039f, 14.3789f, 19.418f, 14.9766f, 18.6328f, 14.9766f)
                curveTo(17.8711f, 14.9766f, 17.2617f, 14.3789f, 17.2617f, 13.6055f)
                close()
                moveTo(18.6328f, 0.0f)
                curveTo(18.1055f, 0.0f, 17.6836f, 0.4219f, 17.6836f, 0.9492f)
                lineTo(17.6836f, 11.8008f)
                lineTo(19.5703f, 11.8008f)
                lineTo(19.5703f, 0.9492f)
                curveTo(19.5703f, 0.4219f, 19.1602f, 0.0f, 18.6328f, 0.0f)
                close()
                moveTo(18.6328f, 20.625f)
                curveTo(19.1602f, 20.625f, 19.5703f, 20.2031f, 19.5703f, 19.7227f)
                lineTo(19.5703f, 15.4805f)
                lineTo(17.6836f, 15.4805f)
                lineTo(17.6836f, 19.7227f)
                curveTo(17.6836f, 20.2031f, 18.1055f, 20.625f, 18.6328f, 20.625f)
                close()
            }
        }
        .build()
        return _sliderVertical3!!
    }

private var _sliderVertical3: ImageVector? = null
