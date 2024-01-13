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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 26.0977.dp, defaultHeight =
                25.0195.dp, viewportWidth = 26.0977f, viewportHeight = 25.0195f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6211f, 22.7109f)
                lineTo(22.4766f, 22.7109f)
                curveTo(24.9023f, 22.7109f, 26.0977f, 21.5273f, 26.0977f, 19.1367f)
                lineTo(26.0977f, 7.7344f)
                curveTo(26.0977f, 5.332f, 24.9023f, 4.1602f, 22.4766f, 4.1602f)
                lineTo(3.6211f, 4.1602f)
                curveTo(1.207f, 4.1602f, 0.0f, 5.332f, 0.0f, 7.7344f)
                lineTo(0.0f, 19.1367f)
                curveTo(0.0f, 21.5273f, 1.207f, 22.7109f, 3.6211f, 22.7109f)
                close()
                moveTo(3.6445f, 20.8359f)
                curveTo(2.4961f, 20.8359f, 1.8867f, 20.2383f, 1.8867f, 19.043f)
                lineTo(1.8867f, 7.8281f)
                curveTo(1.8867f, 6.6211f, 2.4961f, 6.0352f, 3.6445f, 6.0352f)
                lineTo(22.4531f, 6.0352f)
                curveTo(23.6016f, 6.0352f, 24.2109f, 6.6211f, 24.2109f, 7.8281f)
                lineTo(24.2109f, 19.043f)
                curveTo(24.2109f, 20.2383f, 23.6016f, 20.8359f, 22.4531f, 20.8359f)
                close()
                moveTo(0.9727f, 10.9688f)
                curveTo(4.6055f, 12.2109f, 8.707f, 12.8438f, 13.0547f, 12.8438f)
                curveTo(17.3906f, 12.8438f, 21.4922f, 12.2109f, 25.125f, 10.9688f)
                lineTo(25.125f, 8.9648f)
                curveTo(21.5742f, 10.3359f, 17.4844f, 11.0273f, 13.0547f, 11.0273f)
                curveTo(8.6133f, 11.0273f, 4.5234f, 10.3359f, 0.9727f, 8.9648f)
                close()
                moveTo(11.2266f, 14.9531f)
                lineTo(14.8711f, 14.9531f)
                curveTo(15.7031f, 14.9531f, 16.1719f, 14.4961f, 16.1719f, 13.6758f)
                lineTo(16.1719f, 11.8828f)
                lineTo(9.9375f, 11.8828f)
                lineTo(9.9375f, 13.6758f)
                curveTo(9.9375f, 14.4961f, 10.4062f, 14.9531f, 11.2266f, 14.9531f)
                close()
                moveTo(7.1133f, 5.1797f)
                lineTo(8.9297f, 5.1797f)
                lineTo(8.9297f, 3.1055f)
                curveTo(8.9297f, 2.2148f, 9.4453f, 1.7109f, 10.3594f, 1.7109f)
                lineTo(15.7383f, 1.7109f)
                curveTo(16.6523f, 1.7109f, 17.1797f, 2.2148f, 17.1797f, 3.1055f)
                lineTo(17.1797f, 5.1563f)
                lineTo(18.9961f, 5.1563f)
                lineTo(18.9961f, 3.2344f)
                curveTo(18.9961f, 1.0313f, 17.8359f, 0.0f, 15.7148f, 0.0f)
                lineTo(10.3828f, 0.0f)
                curveTo(8.3906f, 0.0f, 7.1133f, 1.0313f, 7.1133f, 3.2344f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
