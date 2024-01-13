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

public val CupertinoIcons.Outlined.ArrowCounterclockwise: ImageVector
    get() {
        if (_arrowCounterclockwise != null) {
            return _arrowCounterclockwise!!
        }
        _arrowCounterclockwise = Builder(name = "ArrowCounterclockwise", defaultWidth = 20.707.dp,
                defaultHeight = 28.043.dp, viewportWidth = 20.707f, viewportHeight =
                28.043f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.8594f)
                curveTo(0.0f, 20.6133f, 4.6172f, 25.2305f, 10.3594f, 25.2305f)
                curveTo(16.1016f, 25.2305f, 20.707f, 20.6133f, 20.707f, 14.8594f)
                curveTo(20.707f, 9.1172f, 16.1016f, 4.5117f, 10.3594f, 4.5117f)
                curveTo(9.6328f, 4.5117f, 8.9414f, 4.5938f, 8.332f, 4.7109f)
                lineTo(11.4492f, 1.6289f)
                curveTo(11.625f, 1.4414f, 11.707f, 1.207f, 11.707f, 0.9609f)
                curveTo(11.707f, 0.4219f, 11.3086f, 0.0f, 10.793f, 0.0f)
                curveTo(10.5f, 0.0f, 10.2656f, 0.0938f, 10.1016f, 0.2813f)
                lineTo(5.2734f, 5.1797f)
                curveTo(5.0859f, 5.3672f, 4.9805f, 5.625f, 4.9805f, 5.8828f)
                curveTo(4.9805f, 6.1523f, 5.0742f, 6.3867f, 5.2734f, 6.5859f)
                lineTo(10.1016f, 11.4375f)
                curveTo(10.2773f, 11.6133f, 10.5f, 11.707f, 10.7812f, 11.707f)
                curveTo(11.3086f, 11.707f, 11.707f, 11.3086f, 11.707f, 10.7695f)
                curveTo(11.707f, 10.5234f, 11.625f, 10.2891f, 11.4375f, 10.1016f)
                lineTo(7.9453f, 6.6328f)
                curveTo(8.625f, 6.4688f, 9.457f, 6.3984f, 10.3594f, 6.3984f)
                curveTo(15.0586f, 6.3984f, 18.8203f, 10.1602f, 18.8203f, 14.8594f)
                curveTo(18.8203f, 19.5703f, 15.0586f, 23.3438f, 10.3594f, 23.3438f)
                curveTo(5.6602f, 23.3438f, 1.8867f, 19.5703f, 1.8867f, 14.8594f)
                curveTo(1.8867f, 14.2969f, 1.5352f, 13.8867f, 0.9727f, 13.8867f)
                curveTo(0.3984f, 13.8867f, 0.0f, 14.2969f, 0.0f, 14.8594f)
                close()
            }
        }
        .build()
        return _arrowCounterclockwise!!
    }

private var _arrowCounterclockwise: ImageVector? = null
