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

package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.Mount: ImageVector
    get() {
        if (_mount != null) {
            return _mount!!
        }
        _mount = Builder(name = "Mount", defaultWidth = 21.9023.dp, defaultHeight = 27.457.dp,
                viewportWidth = 21.9023f, viewportHeight = 27.457f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0352f, 8.6016f)
                curveTo(0.0352f, 9.2695f, 0.5039f, 9.9023f, 1.4297f, 9.9023f)
                lineTo(20.4844f, 9.9023f)
                curveTo(21.4219f, 9.9023f, 21.8789f, 9.2695f, 21.8789f, 8.6016f)
                curveTo(21.8789f, 8.1563f, 21.6797f, 7.6875f, 21.2227f, 7.3477f)
                lineTo(12.4102f, 0.5625f)
                curveTo(11.918f, 0.1875f, 11.4492f, 0.0f, 10.957f, 0.0f)
                curveTo(10.4648f, 0.0f, 9.9961f, 0.1875f, 9.5039f, 0.5625f)
                lineTo(0.6914f, 7.3477f)
                curveTo(0.2461f, 7.6875f, 0.0352f, 8.1563f, 0.0352f, 8.6016f)
                close()
                moveTo(0.0117f, 13.7227f)
                curveTo(0.0117f, 14.332f, 0.4336f, 14.7422f, 1.0664f, 14.7422f)
                lineTo(20.8477f, 14.7422f)
                curveTo(21.4805f, 14.7422f, 21.9023f, 14.332f, 21.9023f, 13.7227f)
                curveTo(21.9023f, 13.1133f, 21.4805f, 12.6914f, 20.8477f, 12.6914f)
                lineTo(1.0664f, 12.6914f)
                curveTo(0.4336f, 12.6914f, 0.0117f, 13.1133f, 0.0117f, 13.7227f)
                close()
                moveTo(0.0f, 18.8438f)
                curveTo(0.0f, 19.2891f, 0.1992f, 19.7578f, 0.6563f, 20.0977f)
                lineTo(9.4688f, 26.8828f)
                curveTo(9.9609f, 27.2578f, 10.4297f, 27.4453f, 10.9219f, 27.4453f)
                curveTo(11.4141f, 27.4453f, 11.8828f, 27.2578f, 12.375f, 26.8828f)
                lineTo(21.1875f, 20.0977f)
                curveTo(21.6445f, 19.7578f, 21.8438f, 19.2891f, 21.8438f, 18.8438f)
                curveTo(21.8438f, 18.1641f, 21.3867f, 17.5312f, 20.4492f, 17.5312f)
                lineTo(1.3945f, 17.5312f)
                curveTo(0.4688f, 17.5312f, 0.0f, 18.1641f, 0.0f, 18.8438f)
                close()
            }
        }
        .build()
        return _mount!!
    }

private var _mount: ImageVector? = null
