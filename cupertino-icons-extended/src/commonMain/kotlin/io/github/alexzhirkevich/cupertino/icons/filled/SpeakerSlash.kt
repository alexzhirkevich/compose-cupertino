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

public val CupertinoIcons.Filled.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 21.8789.dp, defaultHeight =
                23.6719.dp, viewportWidth = 21.8789f, viewportHeight = 23.6719f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.7285f, 16.5996f)
                lineTo(8.0684f, 16.5996f)
                curveTo(8.1855f, 16.5996f, 8.2793f, 16.6348f, 8.3613f, 16.7051f)
                lineTo(13.4238f, 21.4395f)
                curveTo(13.9746f, 21.9551f, 14.4199f, 22.1777f, 14.959f, 22.1777f)
                curveTo(15.5684f, 22.1777f, 16.0254f, 21.873f, 16.2129f, 21.2051f)
                lineTo(2.8535f, 7.8574f)
                curveTo(2.5137f, 8.2441f, 2.3379f, 8.8301f, 2.3379f, 9.6152f)
                lineTo(2.3379f, 14.1035f)
                curveTo(2.3379f, 15.8027f, 3.1348f, 16.5996f, 4.7285f, 16.5996f)
                close()
                moveTo(16.2949f, 14.8887f)
                lineTo(16.2949f, 2.8887f)
                curveTo(16.2949f, 2.127f, 15.7441f, 1.5059f, 14.9473f, 1.5059f)
                curveTo(14.3965f, 1.5059f, 14.0332f, 1.752f, 13.4238f, 2.3145f)
                lineTo(8.7129f, 6.6856f)
                curveTo(8.6543f, 6.7324f, 8.584f, 6.7793f, 8.5137f, 6.7793f)
                lineTo(8.1621f, 6.7793f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3379f, 23.4082f)
                curveTo(20.6895f, 23.7598f, 21.2754f, 23.7598f, 21.6152f, 23.4082f)
                curveTo(21.9668f, 23.0449f, 21.9668f, 22.4824f, 21.6152f, 22.1309f)
                lineTo(1.5527f, 2.0684f)
                curveTo(1.2012f, 1.7168f, 0.6152f, 1.7168f, 0.2637f, 2.0684f)
                curveTo(-0.0879f, 2.4082f, -0.0879f, 3.0059f, 0.2637f, 3.3457f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
