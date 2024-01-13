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

public val CupertinoIcons.Outlined.Eurosign: ImageVector
    get() {
        if (_eurosign != null) {
            return _eurosign!!
        }
        _eurosign = Builder(name = "Eurosign", defaultWidth = 20.1914.dp, defaultHeight =
                21.4102.dp, viewportWidth = 20.1914f, viewportHeight = 21.4102f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 21.3984f)
                curveTo(15.668f, 21.3984f, 18.8438f, 19.793f, 20.0156f, 16.5234f)
                curveTo(20.1328f, 16.2188f, 20.1797f, 15.9023f, 20.1797f, 15.6562f)
                curveTo(20.1797f, 15.0469f, 19.793f, 14.6484f, 19.1836f, 14.6484f)
                curveTo(18.6445f, 14.6484f, 18.3047f, 14.9531f, 18.0586f, 15.5859f)
                curveTo(17.1445f, 18.1523f, 14.8359f, 19.3242f, 11.9648f, 19.3242f)
                curveTo(7.8047f, 19.3242f, 4.8398f, 15.9609f, 4.8398f, 10.6641f)
                curveTo(4.8398f, 5.4492f, 7.8047f, 2.0859f, 11.9531f, 2.0859f)
                curveTo(14.8125f, 2.0859f, 17.1094f, 3.6094f, 18.0352f, 6.1641f)
                curveTo(18.2695f, 6.7852f, 18.6328f, 7.1016f, 19.1836f, 7.1016f)
                curveTo(19.7812f, 7.1016f, 20.1914f, 6.6914f, 20.1914f, 6.082f)
                curveTo(20.1914f, 5.8359f, 20.1445f, 5.5195f, 20.0156f, 5.2148f)
                curveTo(18.8906f, 2.0977f, 15.9727f, 0.0f, 11.9531f, 0.0f)
                curveTo(6.4102f, 0.0f, 2.5664f, 4.1719f, 2.5664f, 10.6641f)
                curveTo(2.5664f, 17.2266f, 6.3867f, 21.3984f, 11.9531f, 21.3984f)
                close()
                moveTo(0.75f, 9.3633f)
                lineTo(13.418f, 9.3633f)
                curveTo(13.8633f, 9.3633f, 14.1797f, 9.0234f, 14.1797f, 8.6016f)
                curveTo(14.1797f, 8.1445f, 13.8633f, 7.8281f, 13.418f, 7.8281f)
                lineTo(0.75f, 7.8281f)
                curveTo(0.3164f, 7.8281f, 0.0f, 8.1445f, 0.0f, 8.6016f)
                curveTo(0.0f, 9.0234f, 0.3281f, 9.3633f, 0.75f, 9.3633f)
                close()
                moveTo(0.75f, 13.5703f)
                lineTo(13.418f, 13.5703f)
                curveTo(13.8633f, 13.5703f, 14.1797f, 13.2305f, 14.1797f, 12.8086f)
                curveTo(14.1797f, 12.3516f, 13.8633f, 12.0352f, 13.418f, 12.0352f)
                lineTo(0.75f, 12.0352f)
                curveTo(0.3281f, 12.0352f, 0.0f, 12.3516f, 0.0f, 12.8086f)
                curveTo(0.0f, 13.2305f, 0.3164f, 13.5703f, 0.75f, 13.5703f)
                close()
            }
        }
        .build()
        return _eurosign!!
    }

private var _eurosign: ImageVector? = null
