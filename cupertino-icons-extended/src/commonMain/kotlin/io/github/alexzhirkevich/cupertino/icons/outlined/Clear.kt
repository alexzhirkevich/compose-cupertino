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

public val CupertinoIcons.Outlined.Clear: ImageVector
    get() {
        if (_clear != null) {
            return _clear!!
        }
        _clear = Builder(name = "Clear", defaultWidth = 21.5742.dp, defaultHeight = 21.5977.dp,
                viewportWidth = 21.5742f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(17.8945f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3789f, 21.5742f, 17.9648f)
                lineTo(21.5742f, 3.6563f)
                curveTo(21.5742f, 1.2422f, 20.3555f, 0.0234f, 17.8945f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(3.7031f, 19.7109f)
                curveTo(2.5313f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(17.8711f, 1.9102f)
                curveTo(19.0312f, 1.9102f, 19.6875f, 2.5313f, 19.6875f, 3.75f)
                lineTo(19.6875f, 17.8711f)
                curveTo(19.6875f, 19.0898f, 19.0312f, 19.7109f, 17.8711f, 19.7109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7969f, 15.75f)
                curveTo(7.0664f, 15.75f, 7.3008f, 15.6445f, 7.4766f, 15.457f)
                lineTo(10.793f, 12.1289f)
                lineTo(14.1328f, 15.457f)
                curveTo(14.3086f, 15.6328f, 14.5312f, 15.75f, 14.8008f, 15.75f)
                curveTo(15.3281f, 15.75f, 15.7383f, 15.3281f, 15.7383f, 14.8008f)
                curveTo(15.7383f, 14.5312f, 15.6445f, 14.3203f, 15.457f, 14.1328f)
                lineTo(12.1289f, 10.8047f)
                lineTo(15.4688f, 7.4531f)
                curveTo(15.668f, 7.2539f, 15.75f, 7.0547f, 15.75f, 6.7969f)
                curveTo(15.75f, 6.2813f, 15.3398f, 5.8594f, 14.8125f, 5.8594f)
                curveTo(14.5664f, 5.8594f, 14.3672f, 5.9531f, 14.168f, 6.1523f)
                lineTo(10.793f, 9.4922f)
                lineTo(7.4531f, 6.1641f)
                curveTo(7.2773f, 5.9766f, 7.0664f, 5.8828f, 6.7969f, 5.8828f)
                curveTo(6.2813f, 5.8828f, 5.8594f, 6.293f, 5.8594f, 6.8086f)
                curveTo(5.8594f, 7.0664f, 5.9648f, 7.2891f, 6.1406f, 7.4648f)
                lineTo(9.4688f, 10.8047f)
                lineTo(6.1406f, 14.1445f)
                curveTo(5.9648f, 14.3203f, 5.8594f, 14.543f, 5.8594f, 14.8008f)
                curveTo(5.8594f, 15.3281f, 6.2813f, 15.75f, 6.7969f, 15.75f)
                close()
            }
        }
        .build()
        return _clear!!
    }

private var _clear: ImageVector? = null
