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

public val CupertinoIcons.Filled.PhoneCircle: ImageVector
    get() {
        if (_phoneCircle != null) {
            return _phoneCircle!!
        }
        _phoneCircle = Builder(name = "PhoneCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(9.0234f, 14.7891f)
                curveTo(6.1992f, 11.9766f, 4.4063f, 8.3906f, 6.5273f, 6.2578f)
                curveTo(6.5742f, 6.2109f, 6.6211f, 6.1641f, 6.6914f, 6.1172f)
                curveTo(7.5f, 5.5195f, 8.25f, 5.3789f, 8.7422f, 6.0938f)
                lineTo(10.2305f, 8.1914f)
                curveTo(10.7344f, 8.9063f, 10.6289f, 9.3398f, 10.0664f, 9.9141f)
                lineTo(9.5977f, 10.418f)
                curveTo(9.4453f, 10.582f, 9.5039f, 10.793f, 9.5742f, 10.9336f)
                curveTo(9.8203f, 11.3438f, 10.4062f, 12.0703f, 11.0742f, 12.7383f)
                curveTo(11.7539f, 13.418f, 12.457f, 13.9805f, 12.8789f, 14.2383f)
                curveTo(13.043f, 14.332f, 13.2891f, 14.3555f, 13.418f, 14.2148f)
                lineTo(13.8984f, 13.7461f)
                curveTo(14.4375f, 13.207f, 14.9062f, 13.0898f, 15.6211f, 13.582f)
                curveTo(16.5938f, 14.2734f, 17.1914f, 14.6836f, 17.7539f, 15.0938f)
                curveTo(18.457f, 15.6211f, 18.3047f, 16.4414f, 17.7656f, 17.0508f)
                curveTo(17.6953f, 17.1328f, 17.6367f, 17.2148f, 17.5547f, 17.2969f)
                curveTo(15.4336f, 19.418f, 11.8359f, 17.625f, 9.0234f, 14.7891f)
                close()
            }
        }
        .build()
        return _phoneCircle!!
    }

private var _phoneCircle: ImageVector? = null
