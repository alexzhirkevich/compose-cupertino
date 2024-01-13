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

public val CupertinoIcons.Filled.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) {
            return _paintbrush!!
        }
        _paintbrush = Builder(name = "Paintbrush", defaultWidth = 24.7417.dp, defaultHeight =
                28.0089.dp, viewportWidth = 24.7417f, viewportHeight = 28.0089f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3917f, 26.4322f)
                curveTo(3.2199f, 28.272f, 5.587f, 28.2955f, 7.3917f, 26.4908f)
                curveTo(8.8331f, 25.0494f, 10.2277f, 21.7916f, 11.2941f, 20.1627f)
                lineTo(14.13f, 23.0103f)
                curveTo(14.9972f, 23.8892f, 16.0519f, 23.8892f, 16.8722f, 23.0455f)
                lineTo(17.88f, 22.0377f)
                curveTo(18.7355f, 21.1705f, 18.7238f, 20.1861f, 17.8449f, 19.3072f)
                lineTo(8.5285f, 9.9791f)
                curveTo(7.6378f, 9.1002f, 6.6417f, 9.0885f, 5.7863f, 9.9439f)
                lineTo(4.7785f, 10.9517f)
                curveTo(3.9347f, 11.7955f, 3.9347f, 12.815f, 4.8136f, 13.6939f)
                lineTo(7.6495f, 16.5299f)
                curveTo(6.0324f, 17.5963f, 2.7863f, 18.9908f, 1.3331f, 20.4322f)
                curveTo(-0.4598f, 22.2369f, -0.4481f, 24.6158f, 1.3917f, 26.4322f)
                close()
                moveTo(4.5206f, 24.9088f)
                curveTo(3.712f, 24.9088f, 3.0675f, 24.2525f, 3.0675f, 23.4556f)
                curveTo(3.0675f, 22.6588f, 3.712f, 22.0142f, 4.5206f, 22.0142f)
                curveTo(5.3175f, 22.0142f, 5.962f, 22.6588f, 5.962f, 23.4556f)
                curveTo(5.962f, 24.2525f, 5.3175f, 24.9088f, 4.5206f, 24.9088f)
                close()
                moveTo(19.2394f, 18.7681f)
                lineTo(23.7863f, 14.2213f)
                curveTo(25.087f, 12.9205f, 25.0519f, 11.3736f, 23.7277f, 10.0259f)
                lineTo(23.13f, 9.4166f)
                curveTo(21.9113f, 10.9986f, 18.4308f, 12.8502f, 17.7628f, 12.1822f)
                curveTo(17.6574f, 12.0767f, 17.6456f, 11.8658f, 17.798f, 11.7017f)
                curveTo(19.2159f, 10.2838f, 20.1417f, 8.901f, 20.3527f, 6.6509f)
                lineTo(14.3292f, 0.6158f)
                curveTo(13.2159f, -0.4975f, 11.2824f, -0.1342f, 10.755f, 1.9752f)
                curveTo(10.0167f, 4.9752f, 9.3488f, 6.7213f, 8.6222f, 8.1627f)
                close()
            }
        }
        .build()
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
