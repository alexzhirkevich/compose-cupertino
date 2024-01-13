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

public val CupertinoIcons.Outlined.PlayDisplay: ImageVector
    get() {
        if (_playDisplay != null) {
            return _playDisplay!!
        }
        _playDisplay = Builder(name = "PlayDisplay", defaultWidth = 27.9375.dp, defaultHeight =
                24.4336.dp, viewportWidth = 27.9375f, viewportHeight = 24.4336f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6953f, 20.2734f)
                lineTo(25.2305f, 20.2734f)
                curveTo(26.918f, 20.2734f, 27.9375f, 19.2539f, 27.9375f, 17.5664f)
                lineTo(27.9375f, 3.5156f)
                curveTo(27.9375f, 1.8281f, 26.918f, 0.8203f, 25.2305f, 0.8203f)
                lineTo(2.6953f, 0.8203f)
                curveTo(1.0195f, 0.8203f, 0.0f, 1.8281f, 0.0f, 3.5156f)
                lineTo(0.0f, 17.5664f)
                curveTo(0.0f, 19.2539f, 1.0195f, 20.2734f, 2.6953f, 20.2734f)
                close()
                moveTo(2.7305f, 18.3867f)
                curveTo(2.2148f, 18.3867f, 1.8867f, 18.0586f, 1.8867f, 17.543f)
                lineTo(1.8867f, 3.5508f)
                curveTo(1.8867f, 3.0234f, 2.2148f, 2.707f, 2.7305f, 2.707f)
                lineTo(25.207f, 2.707f)
                curveTo(25.7227f, 2.707f, 26.0508f, 3.0234f, 26.0508f, 3.5508f)
                lineTo(26.0508f, 17.543f)
                curveTo(26.0508f, 18.0586f, 25.7227f, 18.3867f, 25.207f, 18.3867f)
                close()
                moveTo(10.2656f, 23.0625f)
                lineTo(17.6719f, 23.0625f)
                lineTo(17.6719f, 20.1211f)
                lineTo(10.2656f, 20.1211f)
                close()
                moveTo(10.1953f, 24.4336f)
                lineTo(17.7422f, 24.4336f)
                curveTo(18.2578f, 24.4336f, 18.6797f, 24.0117f, 18.6797f, 23.4844f)
                curveTo(18.6797f, 22.957f, 18.2578f, 22.5352f, 17.7422f, 22.5352f)
                lineTo(10.1953f, 22.5352f)
                curveTo(9.6797f, 22.5352f, 9.2461f, 22.957f, 9.2461f, 23.4844f)
                curveTo(9.2461f, 24.0117f, 9.6797f, 24.4336f, 10.1953f, 24.4336f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0625f, 14.2852f)
                curveTo(11.0625f, 14.7773f, 11.5664f, 14.9531f, 11.9648f, 14.7305f)
                lineTo(18.2461f, 11.0273f)
                curveTo(18.6328f, 10.793f, 18.6211f, 10.2891f, 18.2344f, 10.0664f)
                lineTo(11.9648f, 6.375f)
                curveTo(11.5664f, 6.1406f, 11.0625f, 6.3164f, 11.0625f, 6.8086f)
                close()
            }
        }
        .build()
        return _playDisplay!!
    }

private var _playDisplay: ImageVector? = null
