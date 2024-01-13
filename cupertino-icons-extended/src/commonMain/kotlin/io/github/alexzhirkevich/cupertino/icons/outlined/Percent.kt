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

public val CupertinoIcons.Outlined.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 21.4102.dp, defaultHeight = 22.4065.dp,
                viewportWidth = 21.4102f, viewportHeight = 22.4065f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0547f, 10.9279f)
                curveTo(6.5742f, 10.9279f, 8.0977f, 8.8537f, 8.0977f, 5.549f)
                curveTo(8.0977f, 2.2443f, 6.5625f, 0.2052f, 4.0547f, 0.2052f)
                curveTo(1.5352f, 0.2052f, 0.0f, 2.256f, 0.0f, 5.549f)
                curveTo(0.0f, 8.8654f, 1.5234f, 10.9279f, 4.0547f, 10.9279f)
                close()
                moveTo(4.0547f, 9.2872f)
                curveTo(2.6953f, 9.2872f, 1.8867f, 7.9162f, 1.8867f, 5.549f)
                curveTo(1.8867f, 3.2169f, 2.707f, 1.8341f, 4.0547f, 1.8341f)
                curveTo(5.4023f, 1.8341f, 6.2109f, 3.2052f, 6.2109f, 5.549f)
                curveTo(6.2109f, 7.9162f, 5.4141f, 9.2872f, 4.0547f, 9.2872f)
                close()
                moveTo(17.3672f, 22.2013f)
                curveTo(19.8867f, 22.2013f, 21.4102f, 20.1271f, 21.4102f, 16.8341f)
                curveTo(21.4102f, 13.5177f, 19.875f, 11.4787f, 17.3672f, 11.4787f)
                curveTo(14.8477f, 11.4787f, 13.3125f, 13.5294f, 13.3125f, 16.8341f)
                curveTo(13.3125f, 20.1388f, 14.8359f, 22.2013f, 17.3672f, 22.2013f)
                close()
                moveTo(17.3672f, 20.5724f)
                curveTo(16.0078f, 20.5724f, 15.1992f, 19.1896f, 15.1992f, 16.8341f)
                curveTo(15.1992f, 14.4904f, 16.0195f, 13.1193f, 17.3672f, 13.1193f)
                curveTo(18.7148f, 13.1193f, 19.5234f, 14.4787f, 19.5234f, 16.8341f)
                curveTo(19.5234f, 19.1896f, 18.7266f, 20.5724f, 17.3672f, 20.5724f)
                close()
                moveTo(3.2109f, 22.2482f)
                curveTo(3.6445f, 22.4943f, 4.2773f, 22.4591f, 4.6523f, 21.9201f)
                lineTo(18.4219f, 1.5646f)
                curveTo(18.832f, 0.9787f, 18.5859f, 0.381f, 18.1523f, 0.1232f)
                curveTo(17.7422f, -0.0995f, 17.168f, -0.0526f, 16.7578f, 0.5333f)
                lineTo(2.9883f, 20.8302f)
                curveTo(2.5664f, 21.4279f, 2.7773f, 21.9904f, 3.2109f, 22.2482f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
