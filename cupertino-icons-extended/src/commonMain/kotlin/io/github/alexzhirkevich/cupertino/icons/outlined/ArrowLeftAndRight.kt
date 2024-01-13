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

public val CupertinoIcons.Outlined.ArrowLeftAndRight: ImageVector
    get() {
        if (_arrowLeftAndRight != null) {
            return _arrowLeftAndRight!!
        }
        _arrowLeftAndRight = Builder(name = "ArrowLeftAndRight", defaultWidth = 23.0859.dp,
                defaultHeight = 14.4961.dp, viewportWidth = 23.0859f, viewportHeight =
                14.4961f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.2422f)
                curveTo(0.0f, 7.5234f, 0.1172f, 7.793f, 0.3516f, 8.0156f)
                lineTo(6.6094f, 14.1562f)
                curveTo(6.8086f, 14.3555f, 7.1133f, 14.4727f, 7.3711f, 14.4727f)
                curveTo(7.9922f, 14.4727f, 8.4023f, 14.0508f, 8.4023f, 13.4414f)
                curveTo(8.4023f, 13.1367f, 8.3086f, 12.9141f, 8.1211f, 12.7266f)
                lineTo(5.3672f, 10.0664f)
                lineTo(3.1758f, 8.168f)
                lineTo(5.8945f, 8.2852f)
                lineTo(17.1797f, 8.2852f)
                lineTo(19.8984f, 8.168f)
                lineTo(17.707f, 10.0664f)
                lineTo(14.9648f, 12.7266f)
                curveTo(14.7773f, 12.9141f, 14.6836f, 13.1367f, 14.6836f, 13.4414f)
                curveTo(14.6836f, 14.0508f, 15.0938f, 14.4727f, 15.7148f, 14.4727f)
                curveTo(15.9727f, 14.4727f, 16.2773f, 14.3555f, 16.4766f, 14.1562f)
                lineTo(22.7344f, 8.0156f)
                curveTo(22.9688f, 7.793f, 23.0859f, 7.5234f, 23.0859f, 7.2422f)
                curveTo(23.0859f, 6.9492f, 22.9688f, 6.6797f, 22.7344f, 6.457f)
                lineTo(16.4766f, 0.3164f)
                curveTo(16.2773f, 0.1172f, 15.9727f, 0.0f, 15.7148f, 0.0f)
                curveTo(15.0938f, 0.0f, 14.6836f, 0.4219f, 14.6836f, 1.0313f)
                curveTo(14.6836f, 1.3359f, 14.7773f, 1.5586f, 14.9648f, 1.7461f)
                lineTo(17.707f, 4.418f)
                lineTo(19.8984f, 6.3047f)
                lineTo(17.1797f, 6.1875f)
                lineTo(5.8945f, 6.1875f)
                lineTo(3.1758f, 6.3047f)
                lineTo(5.3672f, 4.418f)
                lineTo(8.1211f, 1.7461f)
                curveTo(8.3086f, 1.5586f, 8.4023f, 1.3359f, 8.4023f, 1.0313f)
                curveTo(8.4023f, 0.4219f, 7.9922f, 0.0f, 7.3711f, 0.0f)
                curveTo(7.1133f, 0.0f, 6.8086f, 0.1172f, 6.6094f, 0.3164f)
                lineTo(0.3516f, 6.457f)
                curveTo(0.1172f, 6.6797f, 0.0f, 6.9492f, 0.0f, 7.2422f)
                close()
            }
        }
        .build()
        return _arrowLeftAndRight!!
    }

private var _arrowLeftAndRight: ImageVector? = null
