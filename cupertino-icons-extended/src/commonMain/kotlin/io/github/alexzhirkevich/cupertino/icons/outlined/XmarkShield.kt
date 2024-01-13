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

public val CupertinoIcons.Outlined.XmarkShield: ImageVector
    get() {
        if (_xmarkShield != null) {
            return _xmarkShield!!
        }
        _xmarkShield = Builder(name = "XmarkShield", defaultWidth = 19.4766.dp, defaultHeight =
                24.293.dp, viewportWidth = 19.4766f, viewportHeight = 24.293f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7383f, 24.293f)
                curveTo(9.9258f, 24.293f, 10.2305f, 24.2227f, 10.5234f, 24.0586f)
                curveTo(17.1914f, 20.3203f, 19.4766f, 18.7383f, 19.4766f, 14.4609f)
                lineTo(19.4766f, 5.4961f)
                curveTo(19.4766f, 4.2656f, 18.9492f, 3.8789f, 17.9531f, 3.457f)
                curveTo(16.5703f, 2.8828f, 12.1055f, 1.2773f, 10.7227f, 0.7969f)
                curveTo(10.4062f, 0.6914f, 10.0664f, 0.6211f, 9.7383f, 0.6211f)
                curveTo(9.4102f, 0.6211f, 9.0703f, 0.7148f, 8.7656f, 0.7969f)
                curveTo(7.3828f, 1.1953f, 2.9063f, 2.8945f, 1.5234f, 3.457f)
                curveTo(0.5391f, 3.8672f, 0.0f, 4.2656f, 0.0f, 5.4961f)
                lineTo(0.0f, 14.4609f)
                curveTo(0.0f, 18.7383f, 2.2969f, 20.3086f, 8.9531f, 24.0586f)
                curveTo(9.2578f, 24.2227f, 9.5508f, 24.293f, 9.7383f, 24.293f)
                close()
                moveTo(9.7383f, 22.1719f)
                curveTo(9.5508f, 22.1719f, 9.3633f, 22.1016f, 9.0117f, 21.8906f)
                curveTo(3.5977f, 18.6094f, 1.8633f, 17.6484f, 1.8633f, 14.0273f)
                lineTo(1.8633f, 5.8594f)
                curveTo(1.8633f, 5.4609f, 1.9336f, 5.3086f, 2.2617f, 5.1797f)
                curveTo(4.043f, 4.4766f, 7.5f, 3.3164f, 9.2695f, 2.6133f)
                curveTo(9.457f, 2.5313f, 9.6094f, 2.5078f, 9.7383f, 2.5078f)
                curveTo(9.8672f, 2.5078f, 10.0195f, 2.543f, 10.207f, 2.6133f)
                curveTo(11.9766f, 3.3164f, 15.4102f, 4.5586f, 17.2266f, 5.1797f)
                curveTo(17.543f, 5.2969f, 17.6133f, 5.4609f, 17.6133f, 5.8594f)
                lineTo(17.6133f, 14.0273f)
                curveTo(17.6133f, 17.6484f, 15.8789f, 18.5977f, 10.4648f, 21.8906f)
                curveTo(10.125f, 22.1016f, 9.9258f, 22.1719f, 9.7383f, 22.1719f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7422f, 16.8516f)
                curveTo(6.0117f, 16.8516f, 6.2461f, 16.7461f, 6.4219f, 16.5586f)
                lineTo(9.7383f, 13.2305f)
                lineTo(13.0781f, 16.5586f)
                curveTo(13.2539f, 16.7344f, 13.4766f, 16.8516f, 13.7461f, 16.8516f)
                curveTo(14.2734f, 16.8516f, 14.6836f, 16.418f, 14.6836f, 15.9023f)
                curveTo(14.6836f, 15.6328f, 14.5898f, 15.4219f, 14.4023f, 15.2344f)
                lineTo(11.0742f, 11.9062f)
                lineTo(14.4141f, 8.5547f)
                curveTo(14.6133f, 8.3555f, 14.6953f, 8.1563f, 14.6953f, 7.8984f)
                curveTo(14.6953f, 7.3828f, 14.2852f, 6.9609f, 13.7578f, 6.9609f)
                curveTo(13.5117f, 6.9609f, 13.3125f, 7.0547f, 13.1133f, 7.2539f)
                lineTo(9.7383f, 10.5938f)
                lineTo(6.3984f, 7.2656f)
                curveTo(6.2227f, 7.0781f, 6.0117f, 6.9844f, 5.7422f, 6.9844f)
                curveTo(5.2266f, 6.9844f, 4.8047f, 7.3945f, 4.8047f, 7.9102f)
                curveTo(4.8047f, 8.168f, 4.9102f, 8.3906f, 5.0859f, 8.5664f)
                lineTo(8.4141f, 11.9062f)
                lineTo(5.0859f, 15.2461f)
                curveTo(4.9102f, 15.4219f, 4.8047f, 15.6445f, 4.8047f, 15.9023f)
                curveTo(4.8047f, 16.418f, 5.2266f, 16.8516f, 5.7422f, 16.8516f)
                close()
            }
        }
        .build()
        return _xmarkShield!!
    }

private var _xmarkShield: ImageVector? = null
