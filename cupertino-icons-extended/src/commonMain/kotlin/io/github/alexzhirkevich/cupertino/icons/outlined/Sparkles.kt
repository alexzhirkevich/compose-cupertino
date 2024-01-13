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

public val CupertinoIcons.Outlined.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 21.6797.dp, defaultHeight =
                28.8867.dp, viewportWidth = 21.6797f, viewportHeight = 28.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.457f, 26.7305f)
                curveTo(12.7617f, 26.7305f, 12.9844f, 26.5078f, 13.043f, 26.1914f)
                curveTo(13.875f, 19.7812f, 14.7773f, 18.7969f, 21.1289f, 18.0938f)
                curveTo(21.457f, 18.0586f, 21.6797f, 17.8242f, 21.6797f, 17.5078f)
                curveTo(21.6797f, 17.2031f, 21.457f, 16.9688f, 21.1289f, 16.9336f)
                curveTo(14.7773f, 16.2305f, 13.875f, 15.2461f, 13.043f, 8.8242f)
                curveTo(12.9844f, 8.5078f, 12.7617f, 8.2969f, 12.457f, 8.2969f)
                curveTo(12.1523f, 8.2969f, 11.9297f, 8.5078f, 11.8828f, 8.8242f)
                curveTo(11.0508f, 15.2461f, 10.1367f, 16.2305f, 3.7969f, 16.9336f)
                curveTo(3.457f, 16.9688f, 3.2344f, 17.2031f, 3.2344f, 17.5078f)
                curveTo(3.2344f, 17.8242f, 3.457f, 18.0586f, 3.7969f, 18.0938f)
                curveTo(10.125f, 18.9258f, 11.0039f, 19.7812f, 11.8828f, 26.1914f)
                curveTo(11.9297f, 26.5078f, 12.1523f, 26.7305f, 12.457f, 26.7305f)
                close()
                moveTo(4.5117f, 13.7695f)
                curveTo(4.7344f, 13.7695f, 4.8867f, 13.6172f, 4.9102f, 13.4062f)
                curveTo(5.332f, 10.2773f, 5.4375f, 10.2773f, 8.6719f, 9.6563f)
                curveTo(8.8711f, 9.6211f, 9.0234f, 9.4805f, 9.0234f, 9.2578f)
                curveTo(9.0234f, 9.0469f, 8.8711f, 8.8945f, 8.6719f, 8.8711f)
                curveTo(5.4375f, 8.4141f, 5.3203f, 8.3086f, 4.9102f, 5.1328f)
                curveTo(4.8867f, 4.9102f, 4.7344f, 4.7578f, 4.5117f, 4.7578f)
                curveTo(4.3008f, 4.7578f, 4.1484f, 4.9102f, 4.1133f, 5.1445f)
                curveTo(3.7383f, 8.2734f, 3.5625f, 8.2617f, 0.3516f, 8.8711f)
                curveTo(0.1523f, 8.9063f, 0.0f, 9.0469f, 0.0f, 9.2578f)
                curveTo(0.0f, 9.4922f, 0.1523f, 9.6211f, 0.3984f, 9.6563f)
                curveTo(3.5859f, 10.1719f, 3.7383f, 10.2539f, 4.1133f, 13.3828f)
                curveTo(4.1484f, 13.6172f, 4.3008f, 13.7695f, 4.5117f, 13.7695f)
                close()
                moveTo(10.1836f, 5.707f)
                curveTo(10.3359f, 5.707f, 10.418f, 5.6133f, 10.4414f, 5.4727f)
                curveTo(10.793f, 3.5742f, 10.7578f, 3.4805f, 12.7969f, 3.1172f)
                curveTo(12.9375f, 3.082f, 13.0312f, 3.0f, 13.0312f, 2.8477f)
                curveTo(13.0312f, 2.707f, 12.9375f, 2.6133f, 12.7969f, 2.5898f)
                curveTo(10.7578f, 2.2266f, 10.793f, 2.1328f, 10.4414f, 0.2344f)
                curveTo(10.418f, 0.0938f, 10.3359f, 0.0f, 10.1836f, 0.0f)
                curveTo(10.0312f, 0.0f, 9.9492f, 0.0938f, 9.9258f, 0.2344f)
                curveTo(9.5742f, 2.1328f, 9.6094f, 2.2266f, 7.5703f, 2.5898f)
                curveTo(7.418f, 2.6133f, 7.3359f, 2.707f, 7.3359f, 2.8477f)
                curveTo(7.3359f, 3.0f, 7.418f, 3.082f, 7.5703f, 3.1172f)
                curveTo(9.6094f, 3.4805f, 9.5742f, 3.5742f, 9.9258f, 5.4727f)
                curveTo(9.9492f, 5.6133f, 10.0312f, 5.707f, 10.1836f, 5.707f)
                close()
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
