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

public val CupertinoIcons.Filled.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 26.0977.dp, defaultHeight =
                25.0195.dp, viewportWidth = 26.0977f, viewportHeight = 25.0195f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9102f, 17.0742f)
                lineTo(7.4297f, 17.0742f)
                lineTo(7.4297f, 5.8711f)
                lineTo(4.9102f, 5.8711f)
                curveTo(1.7109f, 5.8711f, 0.0f, 7.5352f, 0.0f, 10.6172f)
                lineTo(0.0f, 12.3281f)
                curveTo(0.0f, 15.3984f, 1.7109f, 17.0742f, 4.9102f, 17.0742f)
                close()
                moveTo(9.0352f, 17.0859f)
                curveTo(12.3516f, 17.4492f, 16.5f, 18.4219f, 19.7227f, 20.0039f)
                curveTo(19.7227f, 19.8867f, 19.7227f, 19.7578f, 19.7227f, 19.6406f)
                lineTo(19.7227f, 3.3398f)
                curveTo(19.7227f, 3.1992f, 19.7227f, 3.082f, 19.7227f, 2.9414f)
                curveTo(16.4648f, 4.5352f, 12.0586f, 5.543f, 9.0352f, 5.8711f)
                close()
                moveTo(23.707f, 22.8633f)
                curveTo(25.1367f, 22.8633f, 26.0977f, 21.8906f, 26.0977f, 20.4844f)
                lineTo(26.0977f, 2.3906f)
                curveTo(26.0977f, 0.9727f, 25.1367f, 0.0f, 23.707f, 0.0f)
                curveTo(22.3008f, 0.0f, 21.3281f, 0.9727f, 21.3281f, 2.3906f)
                lineTo(21.3281f, 20.4844f)
                curveTo(21.3281f, 21.8906f, 22.3008f, 22.8633f, 23.707f, 22.8633f)
                close()
                moveTo(9.5742f, 25.0078f)
                curveTo(11.0273f, 25.0078f, 12.0938f, 23.9883f, 11.7188f, 22.1836f)
                lineTo(11.0625f, 19.0312f)
                curveTo(10.1719f, 18.8789f, 8.8477f, 18.7734f, 5.8828f, 18.6914f)
                curveTo(5.6719f, 18.6914f, 5.3086f, 18.668f, 4.9336f, 18.668f)
                lineTo(6.9023f, 22.9688f)
                curveTo(7.4883f, 24.2461f, 8.2148f, 25.0078f, 9.5742f, 25.0078f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
