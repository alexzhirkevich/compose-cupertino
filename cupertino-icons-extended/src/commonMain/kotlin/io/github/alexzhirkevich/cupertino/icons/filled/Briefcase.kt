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

public val CupertinoIcons.Filled.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 26.0977.dp, defaultHeight =
                25.0195.dp, viewportWidth = 26.0977f, viewportHeight = 25.0195f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0547f, 11.0859f)
                curveTo(17.6016f, 11.0859f, 21.7969f, 10.4648f, 26.0977f, 8.6836f)
                lineTo(26.0977f, 7.7344f)
                curveTo(26.0977f, 5.332f, 24.9023f, 4.1602f, 22.4766f, 4.1602f)
                lineTo(18.9961f, 4.1602f)
                lineTo(18.9961f, 3.2344f)
                curveTo(18.9961f, 1.0313f, 17.8359f, 0.0f, 15.7148f, 0.0f)
                lineTo(10.3828f, 0.0f)
                curveTo(8.3906f, 0.0f, 7.1133f, 1.0313f, 7.1133f, 3.2344f)
                lineTo(7.1133f, 4.1602f)
                lineTo(3.6211f, 4.1602f)
                curveTo(1.207f, 4.1602f, 0.0f, 5.332f, 0.0f, 7.7344f)
                lineTo(0.0f, 8.6836f)
                curveTo(4.3008f, 10.4648f, 8.4961f, 11.0859f, 13.0547f, 11.0859f)
                close()
                moveTo(8.9297f, 4.1602f)
                lineTo(8.9297f, 3.1055f)
                curveTo(8.9297f, 2.2148f, 9.4453f, 1.7109f, 10.3594f, 1.7109f)
                lineTo(15.7383f, 1.7109f)
                curveTo(16.6523f, 1.7109f, 17.1797f, 2.2148f, 17.1797f, 3.1055f)
                lineTo(17.1797f, 4.1602f)
                close()
                moveTo(3.6211f, 22.7109f)
                lineTo(22.4766f, 22.7109f)
                curveTo(24.9023f, 22.7109f, 26.0977f, 21.5273f, 26.0977f, 19.1367f)
                lineTo(26.0977f, 10.6055f)
                curveTo(22.6758f, 11.8359f, 19.4297f, 12.4688f, 16.1719f, 12.6914f)
                lineTo(16.1719f, 13.6406f)
                curveTo(16.1719f, 14.4609f, 15.7031f, 14.918f, 14.8711f, 14.918f)
                lineTo(11.2266f, 14.918f)
                curveTo(10.4062f, 14.918f, 9.9375f, 14.4609f, 9.9375f, 13.6406f)
                lineTo(9.9375f, 12.6914f)
                curveTo(6.668f, 12.4688f, 3.4219f, 11.8359f, 0.0f, 10.6055f)
                lineTo(0.0f, 19.1367f)
                curveTo(0.0f, 21.5273f, 1.207f, 22.7109f, 3.6211f, 22.7109f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
