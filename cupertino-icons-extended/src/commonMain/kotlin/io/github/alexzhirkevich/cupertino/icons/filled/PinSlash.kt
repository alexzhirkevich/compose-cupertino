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

public val CupertinoIcons.Filled.PinSlash: ImageVector
    get() {
        if (_pinSlash != null) {
            return _pinSlash!!
        }
        _pinSlash = Builder(name = "PinSlash", defaultWidth = 22.9878.dp, defaultHeight = 28.043.dp,
                viewportWidth = 22.9878f, viewportHeight = 28.043f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8565f, 17.6367f)
                curveTo(2.8565f, 18.6328f, 3.5244f, 19.2891f, 4.5791f, 19.2891f)
                lineTo(10.9189f, 19.2891f)
                lineTo(10.9189f, 24.7617f)
                curveTo(10.9189f, 26.5547f, 11.6689f, 28.043f, 11.9619f, 28.043f)
                curveTo(12.2432f, 28.043f, 12.9932f, 26.5547f, 12.9932f, 24.7617f)
                lineTo(12.9932f, 19.4531f)
                lineTo(13.6729f, 19.4531f)
                lineTo(6.4541f, 12.2109f)
                curveTo(4.1924f, 13.5352f, 2.8565f, 15.6211f, 2.8565f, 17.6367f)
                close()
                moveTo(5.7158f, 0.7266f)
                curveTo(4.8838f, 0.7266f, 4.3447f, 1.2539f, 4.3447f, 1.9688f)
                curveTo(4.3447f, 2.3086f, 4.4736f, 2.6953f, 4.7783f, 3.0938f)
                curveTo(5.376f, 3.8906f, 6.794f, 5.0039f, 8.5166f, 5.9766f)
                lineTo(8.4111f, 7.5117f)
                lineTo(20.0713f, 19.1602f)
                curveTo(20.6924f, 18.9141f, 21.0557f, 18.375f, 21.0557f, 17.6367f)
                curveTo(21.0557f, 15.1641f, 19.0752f, 12.5508f, 15.7822f, 11.3555f)
                lineTo(15.3955f, 5.9766f)
                curveTo(17.1064f, 5.0039f, 18.501f, 3.9141f, 19.1104f, 3.1289f)
                curveTo(19.4268f, 2.7188f, 19.5791f, 2.3203f, 19.5791f, 1.9688f)
                curveTo(19.5791f, 1.2539f, 19.0283f, 0.7266f, 18.208f, 0.7266f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2549f, 3.9609f)
                lineTo(21.4424f, 25.125f)
                curveTo(21.8057f, 25.4766f, 22.3799f, 25.4766f, 22.7197f, 25.125f)
                curveTo(23.0713f, 24.7734f, 23.083f, 24.1992f, 22.7197f, 23.8477f)
                lineTo(1.5439f, 2.6836f)
                curveTo(1.1924f, 2.332f, 0.6064f, 2.3203f, 0.2549f, 2.6836f)
                curveTo(-0.085f, 3.0234f, -0.085f, 3.6094f, 0.2549f, 3.9609f)
                close()
            }
        }
        .build()
        return _pinSlash!!
    }

private var _pinSlash: ImageVector? = null
