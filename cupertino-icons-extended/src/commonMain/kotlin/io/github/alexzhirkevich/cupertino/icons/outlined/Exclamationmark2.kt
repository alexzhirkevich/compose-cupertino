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

public val CupertinoIcons.Outlined.Exclamationmark2: ImageVector
    get() {
        if (_exclamationmark2 != null) {
            return _exclamationmark2!!
        }
        _exclamationmark2 = Builder(name = "Exclamationmark2", defaultWidth = 11.9883.dp,
                defaultHeight = 22.4414.dp, viewportWidth = 11.9883f, viewportHeight =
                22.4414f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6758f, 15.9844f)
                curveTo(2.2969f, 15.9844f, 2.7188f, 15.5742f, 2.7305f, 14.9414f)
                lineTo(2.8359f, 1.2891f)
                curveTo(2.8359f, 1.2891f, 2.8359f, 1.2891f, 2.8359f, 1.2891f)
                curveTo(2.8359f, 0.6211f, 2.2969f, 0.1641f, 1.6641f, 0.1641f)
                curveTo(1.0313f, 0.1641f, 0.4922f, 0.6211f, 0.4922f, 1.2891f)
                curveTo(0.4922f, 1.2891f, 0.4922f, 1.2891f, 0.4922f, 1.2891f)
                lineTo(0.6211f, 14.9414f)
                curveTo(0.6328f, 15.5742f, 1.0547f, 15.9844f, 1.6758f, 15.9844f)
                close()
                moveTo(1.6641f, 22.4414f)
                curveTo(2.5898f, 22.4414f, 3.3281f, 21.6914f, 3.3281f, 20.7773f)
                curveTo(3.3281f, 19.8516f, 2.5898f, 19.1133f, 1.6641f, 19.1133f)
                curveTo(0.75f, 19.1133f, 0.0f, 19.8516f, 0.0f, 20.7773f)
                curveTo(0.0f, 21.6914f, 0.75f, 22.4414f, 1.6641f, 22.4414f)
                close()
                moveTo(10.3242f, 15.9844f)
                curveTo(10.9453f, 15.9844f, 11.3672f, 15.5742f, 11.3789f, 14.9414f)
                lineTo(11.4844f, 1.2891f)
                curveTo(11.4844f, 1.2891f, 11.4844f, 1.2891f, 11.4844f, 1.2891f)
                curveTo(11.4844f, 0.6211f, 10.9453f, 0.1641f, 10.3125f, 0.1641f)
                curveTo(9.6914f, 0.1641f, 9.1406f, 0.6211f, 9.1406f, 1.2891f)
                curveTo(9.1406f, 1.2891f, 9.1406f, 1.2891f, 9.1406f, 1.2891f)
                lineTo(9.2695f, 14.9414f)
                curveTo(9.2813f, 15.5742f, 9.7148f, 15.9844f, 10.3242f, 15.9844f)
                close()
                moveTo(10.3125f, 22.4414f)
                curveTo(11.25f, 22.4414f, 11.9883f, 21.6914f, 11.9883f, 20.7773f)
                curveTo(11.9883f, 19.8516f, 11.25f, 19.1133f, 10.3125f, 19.1133f)
                curveTo(9.3984f, 19.1133f, 8.6484f, 19.8516f, 8.6484f, 20.7773f)
                curveTo(8.6484f, 21.6914f, 9.3984f, 22.4414f, 10.3125f, 22.4414f)
                close()
            }
        }
        .build()
        return _exclamationmark2!!
    }

private var _exclamationmark2: ImageVector? = null
