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

public val CupertinoIcons.Filled.SpeakerMinus: ImageVector
    get() {
        if (_speakerMinus != null) {
            return _speakerMinus!!
        }
        _speakerMinus = Builder(name = "SpeakerMinus", defaultWidth = 28.9922.dp, defaultHeight =
                20.6836.dp, viewportWidth = 28.9922f, viewportHeight = 20.6836f).apply {
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
                moveTo(18.6914f, 11.3203f)
                lineTo(27.8789f, 11.3203f)
                curveTo(28.5352f, 11.3203f, 28.9922f, 10.9688f, 28.9922f, 10.3477f)
                curveTo(28.9922f, 9.7148f, 28.5703f, 9.3516f, 27.8789f, 9.3516f)
                lineTo(18.6914f, 9.3516f)
                curveTo(18.0117f, 9.3516f, 17.5664f, 9.7148f, 17.5664f, 10.3477f)
                curveTo(17.5664f, 10.9688f, 18.0352f, 11.3203f, 18.6914f, 11.3203f)
                close()
            }
        }
        .build()
        return _speakerMinus!!
    }

private var _speakerMinus: ImageVector? = null
