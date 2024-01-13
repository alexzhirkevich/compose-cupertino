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

public val CupertinoIcons.Outlined.Capslock: ImageVector
    get() {
        if (_capslock != null) {
            return _capslock!!
        }
        _capslock = Builder(name = "Capslock", defaultWidth = 24.6328.dp, defaultHeight =
                24.8555.dp, viewportWidth = 24.6328f, viewportHeight = 24.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6953f, 17.332f)
                lineTo(15.9375f, 17.332f)
                curveTo(17.5781f, 17.332f, 18.4453f, 16.3711f, 18.4453f, 14.8242f)
                lineTo(18.4453f, 12.8203f)
                lineTo(22.8867f, 12.8203f)
                curveTo(23.8594f, 12.8203f, 24.6328f, 12.2461f, 24.6328f, 11.3438f)
                curveTo(24.6328f, 10.793f, 24.3516f, 10.3594f, 23.8242f, 9.9023f)
                lineTo(13.7695f, 1.0313f)
                curveTo(13.2773f, 0.6094f, 12.8438f, 0.3281f, 12.3164f, 0.3281f)
                curveTo(11.7891f, 0.3281f, 11.3555f, 0.6094f, 10.8633f, 1.0313f)
                lineTo(0.8086f, 9.9141f)
                curveTo(0.2578f, 10.3945f, 0.0f, 10.793f, 0.0f, 11.3438f)
                curveTo(0.0f, 12.2461f, 0.7734f, 12.8203f, 1.7461f, 12.8203f)
                lineTo(6.1875f, 12.8203f)
                lineTo(6.1875f, 14.8242f)
                curveTo(6.1875f, 16.3711f, 7.0547f, 17.332f, 8.6953f, 17.332f)
                close()
                moveTo(8.8828f, 15.5625f)
                curveTo(8.4492f, 15.5625f, 8.1445f, 15.2695f, 8.1445f, 14.8242f)
                lineTo(8.1445f, 11.4492f)
                curveTo(8.1445f, 11.168f, 8.0391f, 11.0508f, 7.7461f, 11.0508f)
                lineTo(2.6484f, 11.0508f)
                curveTo(2.5664f, 11.0508f, 2.5195f, 11.0156f, 2.5195f, 10.957f)
                curveTo(2.5195f, 10.9102f, 2.543f, 10.8633f, 2.5898f, 10.8164f)
                lineTo(12.0703f, 2.5898f)
                curveTo(12.1641f, 2.4961f, 12.2344f, 2.4609f, 12.3164f, 2.4609f)
                curveTo(12.3984f, 2.4609f, 12.4688f, 2.4961f, 12.5625f, 2.5898f)
                lineTo(22.043f, 10.8164f)
                curveTo(22.0898f, 10.8633f, 22.1133f, 10.9102f, 22.1133f, 10.957f)
                curveTo(22.1133f, 11.0156f, 22.0664f, 11.0508f, 21.9844f, 11.0508f)
                lineTo(16.8867f, 11.0508f)
                curveTo(16.6055f, 11.0508f, 16.4883f, 11.168f, 16.4883f, 11.4492f)
                lineTo(16.4883f, 14.8242f)
                curveTo(16.4883f, 15.2578f, 16.1719f, 15.5625f, 15.75f, 15.5625f)
                close()
                moveTo(8.1914f, 24.8555f)
                lineTo(16.3359f, 24.8555f)
                curveTo(17.6953f, 24.8555f, 18.4688f, 24.1055f, 18.4688f, 22.7461f)
                lineTo(18.4688f, 21.0703f)
                curveTo(18.4688f, 19.6992f, 17.6953f, 18.9258f, 16.3359f, 18.9258f)
                lineTo(8.1914f, 18.9258f)
                curveTo(6.8438f, 18.9258f, 6.0703f, 19.7109f, 6.0703f, 21.0703f)
                lineTo(6.0703f, 22.7461f)
                curveTo(6.0703f, 24.0938f, 6.8438f, 24.8555f, 8.1914f, 24.8555f)
                close()
                moveTo(8.4609f, 23.2031f)
                curveTo(8.0508f, 23.2031f, 7.8398f, 22.9922f, 7.8398f, 22.582f)
                lineTo(7.8398f, 21.2344f)
                curveTo(7.8398f, 20.8242f, 8.0508f, 20.5781f, 8.4609f, 20.5781f)
                lineTo(16.0664f, 20.5781f)
                curveTo(16.4766f, 20.5781f, 16.6992f, 20.8242f, 16.6992f, 21.2344f)
                lineTo(16.6992f, 22.582f)
                curveTo(16.6992f, 22.9922f, 16.4766f, 23.2031f, 16.0664f, 23.2031f)
                close()
            }
        }
        .build()
        return _capslock!!
    }

private var _capslock: ImageVector? = null
