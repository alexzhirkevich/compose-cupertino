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

public val CupertinoIcons.Outlined.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 26.9843.dp, defaultHeight = 19.4883.dp,
                viewportWidth = 26.9843f, viewportHeight = 19.4883f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4901f, 19.4883f)
                curveTo(13.7479f, 19.4883f, 13.9705f, 19.3711f, 14.4276f, 18.9258f)
                lineTo(17.2869f, 16.1836f)
                curveTo(17.4627f, 16.0078f, 17.5096f, 15.75f, 17.3455f, 15.5391f)
                curveTo(16.5838f, 14.5547f, 15.1424f, 13.6992f, 13.4901f, 13.6992f)
                curveTo(11.7908f, 13.6992f, 10.3494f, 14.5898f, 9.5877f, 15.6094f)
                curveTo(9.4705f, 15.7969f, 9.5174f, 16.0078f, 9.7049f, 16.1836f)
                lineTo(12.5526f, 18.9258f)
                curveTo(13.0096f, 19.3594f, 13.2323f, 19.4883f, 13.4901f, 19.4883f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6346f, 13.1133f)
                curveTo(6.8924f, 13.3594f, 7.2088f, 13.3242f, 7.4432f, 13.0664f)
                curveTo(8.8494f, 11.5078f, 11.1463f, 10.3711f, 13.4901f, 10.3828f)
                curveTo(15.8573f, 10.3711f, 18.1541f, 11.543f, 19.5838f, 13.1016f)
                curveTo(19.7948f, 13.3477f, 20.0877f, 13.3359f, 20.3455f, 13.1016f)
                lineTo(22.1619f, 11.2969f)
                curveTo(22.3494f, 11.1094f, 22.3729f, 10.8516f, 22.1971f, 10.6406f)
                curveTo(20.4276f, 8.4727f, 17.1463f, 6.8438f, 13.4901f, 6.8438f)
                curveTo(9.8338f, 6.8438f, 6.5526f, 8.4727f, 4.783f, 10.6406f)
                curveTo(4.6073f, 10.8516f, 4.619f, 11.0859f, 4.8182f, 11.2969f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7713f, 8.2148f)
                curveTo(2.0057f, 8.4375f, 2.3338f, 8.4375f, 2.5565f, 8.2031f)
                curveTo(5.4393f, 5.1445f, 9.2362f, 3.5273f, 13.4901f, 3.5273f)
                curveTo(17.7674f, 3.5273f, 21.5877f, 5.1563f, 24.4471f, 8.2148f)
                curveTo(24.658f, 8.4258f, 24.9744f, 8.4141f, 25.2088f, 8.1914f)
                lineTo(26.826f, 6.5742f)
                curveTo(27.0369f, 6.3633f, 27.0252f, 6.1055f, 26.8612f, 5.9063f)
                curveTo(24.1073f, 2.5078f, 18.9276f, 0.0117f, 13.4901f, 0.0117f)
                curveTo(8.0643f, 0.0117f, 2.8612f, 2.5078f, 0.119f, 5.9063f)
                curveTo(-0.0451f, 6.1055f, -0.0451f, 6.3633f, 0.1541f, 6.5742f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
