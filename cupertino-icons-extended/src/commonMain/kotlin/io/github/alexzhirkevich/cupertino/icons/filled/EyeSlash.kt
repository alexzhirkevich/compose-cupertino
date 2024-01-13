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

public val CupertinoIcons.Filled.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 31.7695.dp, defaultHeight =
                21.9375.dp, viewportWidth = 31.7695f, viewportHeight = 21.9375f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8906f, 20.9355f)
                curveTo(18.0586f, 20.9355f, 20.0742f, 20.5371f, 21.8438f, 19.8809f)
                lineTo(18.7734f, 16.8105f)
                curveTo(17.9062f, 17.2559f, 16.9219f, 17.502f, 15.8906f, 17.502f)
                curveTo(12.2344f, 17.502f, 9.3398f, 14.5371f, 9.3281f, 10.9746f)
                curveTo(9.3281f, 9.9199f, 9.5742f, 8.9238f, 10.0078f, 8.0449f)
                lineTo(6.0f, 4.0137f)
                curveTo(2.3086f, 6.3223f, 0.0f, 9.5684f, 0.0f, 10.9746f)
                curveTo(0.0f, 13.3418f, 6.6211f, 20.9355f, 15.8906f, 20.9355f)
                close()
                moveTo(26.1094f, 17.7363f)
                curveTo(29.5312f, 15.4746f, 31.7695f, 12.3691f, 31.7695f, 10.9746f)
                curveTo(31.7695f, 8.5957f, 25.2656f, 1.0137f, 15.8906f, 1.0137f)
                curveTo(13.8984f, 1.0137f, 12.0234f, 1.3535f, 10.3242f, 1.916f)
                lineTo(13.3711f, 4.9629f)
                curveTo(14.1445f, 4.6348f, 14.9883f, 4.4473f, 15.8906f, 4.4473f)
                curveTo(19.5117f, 4.4473f, 22.4414f, 7.3184f, 22.4414f, 10.9746f)
                curveTo(22.4414f, 11.8652f, 22.2422f, 12.7207f, 21.8906f, 13.4707f)
                close()
                moveTo(12.1523f, 10.7051f)
                curveTo(12.1523f, 12.7676f, 13.8516f, 14.4316f, 15.9023f, 14.4316f)
                curveTo(16.0664f, 14.4316f, 16.2188f, 14.4199f, 16.3828f, 14.4082f)
                lineTo(12.1758f, 10.2012f)
                curveTo(12.1641f, 10.3652f, 12.1523f, 10.541f, 12.1523f, 10.7051f)
                close()
                moveTo(19.6172f, 10.7285f)
                curveTo(19.6172f, 8.6777f, 17.9648f, 7.0137f, 15.8906f, 7.0137f)
                curveTo(15.7383f, 7.0137f, 15.5859f, 7.0254f, 15.4453f, 7.0371f)
                lineTo(19.5938f, 11.1855f)
                curveTo(19.6055f, 11.0449f, 19.6172f, 10.8809f, 19.6172f, 10.7285f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.0078f, 21.123f)
                curveTo(25.3594f, 21.4863f, 25.9219f, 21.5098f, 26.2852f, 21.123f)
                curveTo(26.6719f, 20.7363f, 26.6367f, 20.209f, 26.2852f, 19.8457f)
                lineTo(6.6914f, 0.2637f)
                curveTo(6.3398f, -0.0879f, 5.7656f, -0.0879f, 5.4023f, 0.2637f)
                curveTo(5.0625f, 0.6035f, 5.0625f, 1.2012f, 5.4023f, 1.541f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
