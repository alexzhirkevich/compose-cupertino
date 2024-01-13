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

public val CupertinoIcons.Outlined.ArrowUpAndDown: ImageVector
    get() {
        if (_arrowUpAndDown != null) {
            return _arrowUpAndDown!!
        }
        _arrowUpAndDown = Builder(name = "ArrowUpAndDown", defaultWidth = 14.4727.dp, defaultHeight
                = 23.0742.dp, viewportWidth = 14.4727f, viewportHeight = 23.0742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2422f, 23.0742f)
                curveTo(7.5234f, 23.0742f, 7.793f, 22.9688f, 8.0273f, 22.7344f)
                lineTo(14.1562f, 16.4766f)
                curveTo(14.3555f, 16.2773f, 14.4727f, 15.9609f, 14.4727f, 15.7148f)
                curveTo(14.4727f, 15.082f, 14.0508f, 14.6719f, 13.4414f, 14.6719f)
                curveTo(13.1484f, 14.6719f, 12.9141f, 14.7773f, 12.7266f, 14.9648f)
                lineTo(10.0664f, 17.707f)
                lineTo(8.168f, 19.8984f)
                lineTo(8.2852f, 17.1797f)
                lineTo(8.2852f, 5.8945f)
                lineTo(8.168f, 3.1758f)
                lineTo(10.0664f, 5.3672f)
                lineTo(12.7266f, 8.1094f)
                curveTo(12.9141f, 8.2969f, 13.1484f, 8.4023f, 13.4414f, 8.4023f)
                curveTo(14.0508f, 8.4023f, 14.4727f, 7.9922f, 14.4727f, 7.3594f)
                curveTo(14.4727f, 7.1133f, 14.3555f, 6.7969f, 14.1562f, 6.5977f)
                lineTo(8.0273f, 0.3398f)
                curveTo(7.793f, 0.1055f, 7.5234f, 0.0f, 7.2422f, 0.0f)
                curveTo(6.9492f, 0.0f, 6.6797f, 0.1055f, 6.457f, 0.3398f)
                lineTo(0.3281f, 6.5977f)
                curveTo(0.1289f, 6.7969f, 0.0f, 7.1133f, 0.0f, 7.3594f)
                curveTo(0.0f, 7.9922f, 0.4219f, 8.4023f, 1.0313f, 8.4023f)
                curveTo(1.3359f, 8.4023f, 1.5703f, 8.2969f, 1.7461f, 8.1094f)
                lineTo(4.418f, 5.3672f)
                lineTo(6.3047f, 3.1758f)
                lineTo(6.1992f, 5.8945f)
                lineTo(6.1992f, 17.1797f)
                lineTo(6.3047f, 19.8984f)
                lineTo(4.418f, 17.707f)
                lineTo(1.7461f, 14.9648f)
                curveTo(1.5703f, 14.7773f, 1.3359f, 14.6719f, 1.0313f, 14.6719f)
                curveTo(0.4219f, 14.6719f, 0.0f, 15.082f, 0.0f, 15.7148f)
                curveTo(0.0f, 15.9609f, 0.1289f, 16.2773f, 0.3281f, 16.4766f)
                lineTo(6.457f, 22.7344f)
                curveTo(6.6797f, 22.9688f, 6.9492f, 23.0742f, 7.2422f, 23.0742f)
                close()
            }
        }
        .build()
        return _arrowUpAndDown!!
    }

private var _arrowUpAndDown: ImageVector? = null
