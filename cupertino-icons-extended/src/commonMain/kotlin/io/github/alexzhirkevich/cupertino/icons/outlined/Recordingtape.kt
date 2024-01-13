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

public val CupertinoIcons.Outlined.Recordingtape: ImageVector
    get() {
        if (_recordingtape != null) {
            return _recordingtape!!
        }
        _recordingtape = Builder(name = "Recordingtape", defaultWidth = 34.8398.dp, defaultHeight =
                15.293.dp, viewportWidth = 34.8398f, viewportHeight = 15.293f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.6406f)
                curveTo(0.0f, 11.8594f, 3.4219f, 15.2812f, 7.6406f, 15.2812f)
                lineTo(27.1992f, 15.2812f)
                curveTo(31.4297f, 15.2812f, 34.8398f, 11.8594f, 34.8398f, 7.6406f)
                curveTo(34.8398f, 3.4102f, 31.4297f, 0.0f, 27.1992f, 0.0f)
                curveTo(22.9805f, 0.0f, 19.5586f, 3.4219f, 19.5586f, 7.6406f)
                curveTo(19.5586f, 9.9023f, 20.5664f, 11.9297f, 22.1953f, 13.2773f)
                lineTo(12.6445f, 13.2773f)
                curveTo(14.2734f, 11.9297f, 15.2812f, 9.9023f, 15.2812f, 7.6406f)
                curveTo(15.2812f, 3.4102f, 11.8594f, 0.0f, 7.6406f, 0.0f)
                curveTo(3.4102f, 0.0f, 0.0f, 3.4219f, 0.0f, 7.6406f)
                close()
                moveTo(2.0039f, 7.6289f)
                curveTo(2.0039f, 4.5234f, 4.5352f, 1.9922f, 7.6523f, 1.9922f)
                curveTo(10.7578f, 1.9922f, 13.2773f, 4.5234f, 13.2773f, 7.6289f)
                curveTo(13.2773f, 10.7461f, 10.7578f, 13.2773f, 7.6523f, 13.2773f)
                curveTo(4.5352f, 13.2773f, 2.0039f, 10.7461f, 2.0039f, 7.6289f)
                close()
                moveTo(21.5625f, 7.6289f)
                curveTo(21.5625f, 4.5234f, 24.082f, 1.9922f, 27.1875f, 1.9922f)
                curveTo(30.3047f, 1.9922f, 32.8359f, 4.5234f, 32.8359f, 7.6289f)
                curveTo(32.8359f, 10.7461f, 30.3047f, 13.2773f, 27.1875f, 13.2773f)
                curveTo(24.082f, 13.2773f, 21.5625f, 10.7461f, 21.5625f, 7.6289f)
                close()
            }
        }
        .build()
        return _recordingtape!!
    }

private var _recordingtape: ImageVector? = null
