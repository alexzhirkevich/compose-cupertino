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

public val CupertinoIcons.Outlined.Rublesign: ImageVector
    get() {
        if (_rublesign != null) {
            return _rublesign!!
        }
        _rublesign = Builder(name = "Rublesign", defaultWidth = 16.3711.dp, defaultHeight =
                21.8555.dp, viewportWidth = 16.3711f, viewportHeight = 21.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.7266f)
                curveTo(0.0f, 13.1484f, 0.3398f, 13.4883f, 0.7617f, 13.4883f)
                lineTo(3.1875f, 13.4883f)
                lineTo(3.1875f, 20.7305f)
                curveTo(3.1875f, 21.3516f, 3.6797f, 21.8555f, 4.3008f, 21.8555f)
                curveTo(4.9219f, 21.8555f, 5.4258f, 21.3516f, 5.4258f, 20.7305f)
                lineTo(5.4258f, 13.4883f)
                lineTo(9.7383f, 13.4883f)
                curveTo(13.793f, 13.4883f, 16.3711f, 10.793f, 16.3711f, 7.0313f)
                curveTo(16.3711f, 3.2813f, 13.8164f, 0.5508f, 9.7617f, 0.5508f)
                lineTo(4.3008f, 0.5508f)
                curveTo(3.6211f, 0.5508f, 3.1875f, 1.0078f, 3.1875f, 1.7109f)
                lineTo(3.1875f, 11.9648f)
                lineTo(0.7617f, 11.9648f)
                curveTo(0.3398f, 11.9648f, 0.0f, 12.3047f, 0.0f, 12.7266f)
                close()
                moveTo(5.4258f, 11.543f)
                lineTo(5.4258f, 2.543f)
                lineTo(9.2109f, 2.543f)
                curveTo(12.4336f, 2.543f, 14.0742f, 4.2773f, 14.0742f, 7.0313f)
                curveTo(14.0742f, 9.7969f, 12.4102f, 11.543f, 9.2109f, 11.543f)
                close()
                moveTo(0.0f, 17.2617f)
                curveTo(0.0f, 17.6836f, 0.3398f, 18.0352f, 0.7617f, 18.0352f)
                lineTo(11.1211f, 18.0352f)
                curveTo(11.543f, 18.0352f, 11.8828f, 17.6836f, 11.8828f, 17.2617f)
                curveTo(11.8828f, 16.8516f, 11.543f, 16.5f, 11.1211f, 16.5f)
                lineTo(0.7617f, 16.5f)
                curveTo(0.3398f, 16.5f, 0.0f, 16.8516f, 0.0f, 17.2617f)
                close()
            }
        }
        .build()
        return _rublesign!!
    }

private var _rublesign: ImageVector? = null
