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

public val CupertinoIcons.Outlined.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 32.0273.dp, defaultHeight =
                21.9375.dp, viewportWidth = 32.0273f, viewportHeight = 21.9375f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0195f, 21.0176f)
                curveTo(18.1992f, 21.0176f, 20.1914f, 20.6309f, 22.0078f, 20.0098f)
                lineTo(20.4727f, 18.4746f)
                curveTo(19.0781f, 18.9082f, 17.6016f, 19.166f, 16.0195f, 19.166f)
                curveTo(8.2969f, 19.166f, 2.0508f, 12.627f, 2.0508f, 10.9746f)
                curveTo(2.0508f, 10.1543f, 4.2188f, 7.4238f, 7.6758f, 5.3496f)
                lineTo(6.2227f, 3.8965f)
                curveTo(2.3203f, 6.3106f, 0.0f, 9.5566f, 0.0f, 10.9746f)
                curveTo(0.0f, 13.3652f, 6.668f, 21.0176f, 16.0195f, 21.0176f)
                close()
                moveTo(16.0195f, 0.9316f)
                curveTo(13.9805f, 0.9316f, 12.1289f, 1.2832f, 10.4062f, 1.8574f)
                lineTo(11.9531f, 3.3926f)
                curveTo(13.2422f, 3.0059f, 14.5664f, 2.7832f, 16.0195f, 2.7832f)
                curveTo(23.7305f, 2.7832f, 29.9766f, 9.5801f, 29.9766f, 10.9746f)
                curveTo(29.9766f, 11.9238f, 27.9258f, 14.4785f, 24.6797f, 16.4707f)
                lineTo(26.1211f, 17.9121f)
                curveTo(29.8242f, 15.5098f, 32.0273f, 12.3574f, 32.0273f, 10.9746f)
                curveTo(32.0273f, 8.5723f, 25.4883f, 0.9316f, 16.0195f, 0.9316f)
                close()
                moveTo(16.0195f, 17.5371f)
                curveTo(17.0508f, 17.5371f, 18.0234f, 17.2793f, 18.8906f, 16.8574f)
                lineTo(10.1016f, 8.0684f)
                curveTo(9.668f, 8.9355f, 9.4219f, 9.9199f, 9.4219f, 10.9746f)
                curveTo(9.4336f, 14.5488f, 12.3516f, 17.5371f, 16.0195f, 17.5371f)
                close()
                moveTo(22.0312f, 13.541f)
                curveTo(22.3945f, 12.7559f, 22.5938f, 11.877f, 22.5938f, 10.9746f)
                curveTo(22.5938f, 7.3066f, 19.6641f, 4.4121f, 16.0195f, 4.4121f)
                curveTo(15.0938f, 4.4121f, 14.2266f, 4.6113f, 13.4414f, 4.9512f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.1367f, 21.123f)
                curveTo(25.4883f, 21.4863f, 26.0508f, 21.5098f, 26.4141f, 21.123f)
                curveTo(26.8008f, 20.7363f, 26.7656f, 20.209f, 26.4141f, 19.8457f)
                lineTo(6.8203f, 0.2637f)
                curveTo(6.4688f, -0.0879f, 5.8945f, -0.0879f, 5.5313f, 0.2637f)
                curveTo(5.1914f, 0.6035f, 5.1914f, 1.2012f, 5.5313f, 1.541f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
