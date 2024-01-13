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

public val CupertinoIcons.Outlined.MappinAndEllipse: ImageVector
    get() {
        if (_mappinAndEllipse != null) {
            return _mappinAndEllipse!!
        }
        _mappinAndEllipse = Builder(name = "MappinAndEllipse", defaultWidth = 22.2539.dp,
                defaultHeight = 25.7461.dp, viewportWidth = 22.2539f, viewportHeight =
                25.7461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1328f, 25.7344f)
                curveTo(18.1992f, 25.7344f, 22.2539f, 23.2969f, 22.2539f, 20.7188f)
                curveTo(22.2539f, 17.625f, 17.3438f, 15.7383f, 14.1211f, 15.7031f)
                lineTo(14.1211f, 17.4141f)
                curveTo(16.3828f, 17.4492f, 19.8867f, 18.6797f, 19.8867f, 20.4375f)
                curveTo(19.8867f, 22.4531f, 16.1719f, 23.8828f, 11.1328f, 23.8828f)
                curveTo(6.0703f, 23.8828f, 2.3789f, 22.4766f, 2.3789f, 20.4375f)
                curveTo(2.3789f, 18.6797f, 5.8711f, 17.4492f, 8.1328f, 17.4141f)
                lineTo(8.1328f, 15.7031f)
                curveTo(4.9102f, 15.7383f, 0.0f, 17.625f, 0.0f, 20.7188f)
                curveTo(0.0f, 23.2969f, 4.0664f, 25.7344f, 11.1328f, 25.7344f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7266f, 4.418f)
                curveTo(6.7266f, 6.4805f, 8.1211f, 8.2031f, 10.0312f, 8.6836f)
                lineTo(10.0312f, 16.1016f)
                curveTo(10.0312f, 19.5586f, 10.6523f, 21.4453f, 11.1211f, 21.4453f)
                curveTo(11.6016f, 21.4453f, 12.2109f, 19.5703f, 12.2109f, 16.1016f)
                lineTo(12.2109f, 8.6836f)
                curveTo(14.1211f, 8.2148f, 15.5273f, 6.4805f, 15.5273f, 4.418f)
                curveTo(15.5273f, 1.9922f, 13.5703f, 0.0f, 11.1211f, 0.0f)
                curveTo(8.6836f, 0.0f, 6.7266f, 1.9922f, 6.7266f, 4.418f)
                close()
                moveTo(9.8672f, 4.6641f)
                curveTo(9.0703f, 4.6641f, 8.3672f, 3.9609f, 8.3672f, 3.1406f)
                curveTo(8.3672f, 2.332f, 9.0703f, 1.6406f, 9.8672f, 1.6406f)
                curveTo(10.6992f, 1.6406f, 11.3789f, 2.332f, 11.3789f, 3.1406f)
                curveTo(11.3789f, 3.9609f, 10.6992f, 4.6641f, 9.8672f, 4.6641f)
                close()
            }
        }
        .build()
        return _mappinAndEllipse!!
    }

private var _mappinAndEllipse: ImageVector? = null
