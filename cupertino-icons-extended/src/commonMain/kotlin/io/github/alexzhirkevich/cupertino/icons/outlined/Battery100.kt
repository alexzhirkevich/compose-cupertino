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

public val CupertinoIcons.Outlined.Battery100: ImageVector
    get() {
        if (_battery100 != null) {
            return _battery100!!
        }
        _battery100 = Builder(name = "Battery100", defaultWidth = 34.6875.dp, defaultHeight =
                15.8555.dp, viewportWidth = 34.6875f, viewportHeight = 15.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(34.6875f)
                verticalLineToRelative(15.8555f)
                horizontalLineToRelative(-34.6875f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2461f, 15.8555f)
                lineTo(24.668f, 15.8555f)
                curveTo(26.6719f, 15.8555f, 28.3594f, 15.668f, 29.5547f, 14.4727f)
                curveTo(30.75f, 13.2773f, 30.9258f, 11.6133f, 30.9258f, 9.6094f)
                lineTo(30.9258f, 6.2461f)
                curveTo(30.9258f, 4.2422f, 30.75f, 2.5781f, 29.5547f, 1.3828f)
                curveTo(28.3594f, 0.1875f, 26.6719f, 0.0f, 24.668f, 0.0f)
                lineTo(6.2227f, 0.0f)
                curveTo(4.2539f, 0.0f, 2.5664f, 0.1875f, 1.3711f, 1.3828f)
                curveTo(0.1758f, 2.5781f, 0.0f, 4.2539f, 0.0f, 6.2109f)
                lineTo(0.0f, 9.6094f)
                curveTo(0.0f, 11.6133f, 0.1758f, 13.2773f, 1.3711f, 14.4727f)
                curveTo(2.5664f, 15.668f, 4.2539f, 15.8555f, 6.2461f, 15.8555f)
                close()
                moveTo(5.9297f, 13.9688f)
                curveTo(4.7227f, 13.9688f, 3.457f, 13.8047f, 2.7422f, 13.1016f)
                curveTo(2.0391f, 12.3867f, 1.8867f, 11.1328f, 1.8867f, 9.9258f)
                lineTo(1.8867f, 5.9531f)
                curveTo(1.8867f, 4.7227f, 2.0391f, 3.4688f, 2.7422f, 2.7539f)
                curveTo(3.457f, 2.0391f, 4.7344f, 1.8867f, 5.9648f, 1.8867f)
                lineTo(24.9961f, 1.8867f)
                curveTo(26.2031f, 1.8867f, 27.4688f, 2.0508f, 28.1719f, 2.7539f)
                curveTo(28.8867f, 3.4688f, 29.0391f, 4.7109f, 29.0391f, 5.918f)
                lineTo(29.0391f, 9.9258f)
                curveTo(29.0391f, 11.1328f, 28.8867f, 12.3867f, 28.1719f, 13.1016f)
                curveTo(27.4688f, 13.8047f, 26.2031f, 13.9688f, 24.9961f, 13.9688f)
                close()
                moveTo(32.5195f, 10.957f)
                curveTo(33.4453f, 10.8984f, 34.6875f, 9.7148f, 34.6875f, 7.9219f)
                curveTo(34.6875f, 6.1406f, 33.4453f, 4.957f, 32.5195f, 4.8984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3086f, 12.6094f)
                lineTo(25.6289f, 12.6094f)
                curveTo(26.4258f, 12.6094f, 26.8945f, 12.4922f, 27.2227f, 12.1641f)
                curveTo(27.5508f, 11.8359f, 27.6797f, 11.3672f, 27.6797f, 10.5586f)
                lineTo(27.6797f, 5.2969f)
                curveTo(27.6797f, 4.4883f, 27.5508f, 4.0195f, 27.2227f, 3.6914f)
                curveTo(26.8945f, 3.3633f, 26.4258f, 3.2461f, 25.6289f, 3.2461f)
                lineTo(5.3438f, 3.2461f)
                curveTo(4.5117f, 3.2461f, 4.0313f, 3.3633f, 3.7148f, 3.6914f)
                curveTo(3.3867f, 4.0195f, 3.2578f, 4.5f, 3.2578f, 5.3203f)
                lineTo(3.2578f, 10.5586f)
                curveTo(3.2578f, 11.3672f, 3.3867f, 11.8359f, 3.7148f, 12.1641f)
                curveTo(4.043f, 12.4922f, 4.5117f, 12.6094f, 5.3086f, 12.6094f)
                close()
            }
        }
        .build()
        return _battery100!!
    }

private var _battery100: ImageVector? = null
