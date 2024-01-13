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

public val CupertinoIcons.Outlined.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 5.9883f)
                curveTo(11.4492f, 5.9883f, 11.0742f, 6.3516f, 11.0742f, 6.8672f)
                lineTo(11.0742f, 12.7266f)
                lineTo(11.168f, 15.1992f)
                lineTo(9.9961f, 13.793f)
                lineTo(8.6016f, 12.3867f)
                curveTo(8.4375f, 12.2227f, 8.2266f, 12.1289f, 7.9805f, 12.1289f)
                curveTo(7.5f, 12.1289f, 7.1367f, 12.4922f, 7.1367f, 12.9727f)
                curveTo(7.1367f, 13.2188f, 7.207f, 13.4297f, 7.3594f, 13.582f)
                lineTo(11.2734f, 17.4727f)
                curveTo(11.5078f, 17.707f, 11.707f, 17.8125f, 11.9531f, 17.8125f)
                curveTo(12.2109f, 17.8125f, 12.4219f, 17.6953f, 12.6445f, 17.4727f)
                lineTo(16.5469f, 13.582f)
                curveTo(16.6992f, 13.4297f, 16.793f, 13.2188f, 16.793f, 12.9727f)
                curveTo(16.793f, 12.4922f, 16.418f, 12.1289f, 15.9375f, 12.1289f)
                curveTo(15.6797f, 12.1289f, 15.4688f, 12.2109f, 15.3164f, 12.3867f)
                lineTo(13.9336f, 13.793f)
                lineTo(12.7383f, 15.2109f)
                lineTo(12.832f, 12.7266f)
                lineTo(12.832f, 6.8672f)
                curveTo(12.832f, 6.3516f, 12.4688f, 5.9883f, 11.9531f, 5.9883f)
                close()
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
