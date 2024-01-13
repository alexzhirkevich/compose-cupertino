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

public val CupertinoIcons.Outlined.SpeakerSlash: ImageVector
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
                lineTo(8.0801f, 16.5996f)
                curveTo(8.1855f, 16.5996f, 8.2793f, 16.6348f, 8.3613f, 16.7051f)
                lineTo(13.6465f, 21.4395f)
                curveTo(14.2207f, 21.9434f, 14.6426f, 22.1777f, 15.2051f, 22.1777f)
                curveTo(15.6621f, 22.1777f, 16.0371f, 21.9668f, 16.3066f, 21.5684f)
                lineTo(14.9473f, 20.2207f)
                lineTo(9.2871f, 15.1465f)
                curveTo(9.0527f, 14.9355f, 8.9121f, 14.8887f, 8.6074f, 14.8887f)
                lineTo(4.8106f, 14.8887f)
                curveTo(4.3652f, 14.8887f, 4.166f, 14.6895f, 4.166f, 14.2559f)
                lineTo(4.166f, 9.4277f)
                lineTo(2.7598f, 8.0215f)
                curveTo(2.4902f, 8.3965f, 2.3379f, 8.9238f, 2.3379f, 9.6152f)
                lineTo(2.3379f, 14.1035f)
                curveTo(2.3379f, 15.8027f, 3.1348f, 16.5996f, 4.7285f, 16.5996f)
                close()
                moveTo(16.5293f, 14.877f)
                lineTo(16.5293f, 2.8887f)
                curveTo(16.5293f, 2.127f, 15.9668f, 1.5059f, 15.1816f, 1.5059f)
                curveTo(14.6191f, 1.5059f, 14.2676f, 1.7637f, 13.6465f, 2.3145f)
                lineTo(8.5254f, 6.8613f)
                lineTo(9.7793f, 8.127f)
                lineTo(14.3496f, 3.9785f)
                curveTo(14.4082f, 3.9199f, 14.4785f, 3.8848f, 14.5488f, 3.8848f)
                curveTo(14.6309f, 3.8848f, 14.7012f, 3.9434f, 14.7012f, 4.0488f)
                lineTo(14.7012f, 13.0488f)
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
