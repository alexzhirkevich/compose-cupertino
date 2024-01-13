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

public val CupertinoIcons.Filled.SpeakerPlus: ImageVector
    get() {
        if (_speakerPlus != null) {
            return _speakerPlus!!
        }
        _speakerPlus = Builder(name = "SpeakerPlus", defaultWidth = 28.5586.dp, defaultHeight =
                20.6836.dp, viewportWidth = 28.5586f, viewportHeight = 20.6836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6328f, 20.6836f)
                curveTo(13.4062f, 20.6836f, 13.957f, 20.1328f, 13.957f, 19.3711f)
                lineTo(13.957f, 1.3945f)
                curveTo(13.957f, 0.6328f, 13.4062f, 0.0117f, 12.6094f, 0.0117f)
                curveTo(12.0586f, 0.0117f, 11.6836f, 0.2461f, 11.0977f, 0.8203f)
                lineTo(6.0938f, 5.5078f)
                curveTo(6.0234f, 5.5781f, 5.918f, 5.6133f, 5.8008f, 5.6133f)
                lineTo(2.4492f, 5.6133f)
                curveTo(0.8555f, 5.6133f, 0.0f, 6.4922f, 0.0f, 8.1797f)
                lineTo(0.0f, 12.5391f)
                curveTo(0.0f, 14.2383f, 0.8555f, 15.1055f, 2.4492f, 15.1055f)
                lineTo(5.8008f, 15.1055f)
                curveTo(5.918f, 15.1055f, 6.0234f, 15.1406f, 6.0938f, 15.2109f)
                lineTo(11.0977f, 19.9453f)
                curveTo(11.625f, 20.4609f, 12.082f, 20.6836f, 12.6328f, 20.6836f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6953f, 10.3359f)
                curveTo(17.6953f, 10.9102f, 18.1055f, 11.2969f, 18.7031f, 11.2969f)
                lineTo(22.1484f, 11.2969f)
                lineTo(22.1484f, 14.7539f)
                curveTo(22.1484f, 15.3398f, 22.5469f, 15.75f, 23.1211f, 15.75f)
                curveTo(23.707f, 15.75f, 24.1172f, 15.3516f, 24.1172f, 14.7539f)
                lineTo(24.1172f, 11.2969f)
                lineTo(27.5742f, 11.2969f)
                curveTo(28.1602f, 11.2969f, 28.5586f, 10.9102f, 28.5586f, 10.3359f)
                curveTo(28.5586f, 9.75f, 28.1602f, 9.3398f, 27.5742f, 9.3398f)
                lineTo(24.1172f, 9.3398f)
                lineTo(24.1172f, 5.8945f)
                curveTo(24.1172f, 5.2969f, 23.707f, 4.8867f, 23.1211f, 4.8867f)
                curveTo(22.5469f, 4.8867f, 22.1484f, 5.2969f, 22.1484f, 5.8945f)
                lineTo(22.1484f, 9.3398f)
                lineTo(18.7031f, 9.3398f)
                curveTo(18.1055f, 9.3398f, 17.6953f, 9.75f, 17.6953f, 10.3359f)
                close()
            }
        }
        .build()
        return _speakerPlus!!
    }

private var _speakerPlus: ImageVector? = null
