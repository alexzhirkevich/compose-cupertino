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

public val CupertinoIcons.Outlined.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) {
            return _appleLogo!!
        }
        _appleLogo = Builder(name = "AppleLogo", defaultWidth = 18.8672.dp, defaultHeight =
                24.4805.dp, viewportWidth = 18.8672f, viewportHeight = 24.4805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.6758f, 5.6016f)
                curveTo(11.9297f, 5.6016f, 10.5f, 6.668f, 9.5859f, 6.668f)
                curveTo(8.6133f, 6.668f, 7.3477f, 5.6719f, 5.8242f, 5.6719f)
                curveTo(2.9297f, 5.6719f, 0.0f, 8.0625f, 0.0f, 12.5625f)
                curveTo(0.0f, 15.375f, 1.0781f, 18.3398f, 2.4258f, 20.25f)
                curveTo(3.5742f, 21.8672f, 4.582f, 23.1914f, 6.0352f, 23.1914f)
                curveTo(7.4648f, 23.1914f, 8.0977f, 22.2422f, 9.8789f, 22.2422f)
                curveTo(11.6836f, 22.2422f, 12.0938f, 23.168f, 13.6758f, 23.168f)
                curveTo(15.2461f, 23.168f, 16.2891f, 21.7266f, 17.2852f, 20.3086f)
                curveTo(18.3867f, 18.6797f, 18.8555f, 17.0977f, 18.8672f, 17.0156f)
                curveTo(18.7734f, 16.9922f, 15.7734f, 15.7617f, 15.7734f, 12.3281f)
                curveTo(15.7734f, 9.3516f, 18.1289f, 8.0156f, 18.2695f, 7.9102f)
                curveTo(16.7109f, 5.6719f, 14.332f, 5.6016f, 13.6758f, 5.6016f)
                close()
                moveTo(12.8555f, 3.7031f)
                curveTo(13.5703f, 2.8359f, 14.0742f, 1.6523f, 14.0742f, 0.457f)
                curveTo(14.0742f, 0.293f, 14.0625f, 0.1289f, 14.0391f, 0.0f)
                curveTo(12.8672f, 0.0469f, 11.4609f, 0.7734f, 10.6289f, 1.7578f)
                curveTo(9.9609f, 2.5078f, 9.3516f, 3.7031f, 9.3516f, 4.8984f)
                curveTo(9.3516f, 5.0859f, 9.3867f, 5.2617f, 9.3984f, 5.3203f)
                curveTo(9.4688f, 5.332f, 9.5859f, 5.3555f, 9.7148f, 5.3555f)
                curveTo(10.7578f, 5.3555f, 12.0703f, 4.6523f, 12.8555f, 3.7031f)
                close()
            }
        }
        .build()
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
