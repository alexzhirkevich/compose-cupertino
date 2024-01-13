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

public val CupertinoIcons.Filled.ArrowTriangle2CirclepathCircle: ImageVector
    get() {
        if (_arrowTriangle2CirclepathCircle != null) {
            return _arrowTriangle2CirclepathCircle!!
        }
        _arrowTriangle2CirclepathCircle = Builder(name = "ArrowTriangle2CirclepathCircle",
                defaultWidth = 23.9062.dp, defaultHeight = 23.918.dp, viewportWidth = 23.9062f,
                viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4922f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4258f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4258f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4922f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(12.0117f, 18.7031f)
                curveTo(8.5664f, 18.7031f, 5.8359f, 16.3945f, 5.25f, 13.0312f)
                lineTo(3.9727f, 13.0312f)
                curveTo(3.3984f, 13.0312f, 3.293f, 12.4922f, 3.5977f, 12.0586f)
                lineTo(5.5313f, 9.3281f)
                curveTo(5.8828f, 8.8594f, 6.4453f, 8.8828f, 6.7617f, 9.3281f)
                lineTo(8.7305f, 12.0586f)
                curveTo(9.0352f, 12.4922f, 8.918f, 13.0312f, 8.3438f, 13.0312f)
                lineTo(7.0781f, 13.0312f)
                curveTo(7.6172f, 15.1641f, 9.6094f, 16.7812f, 12.0117f, 16.7812f)
                curveTo(13.1836f, 16.7812f, 14.0508f, 16.418f, 14.918f, 15.75f)
                curveTo(15.3984f, 15.3867f, 15.9492f, 15.3164f, 16.3711f, 15.7734f)
                curveTo(16.8047f, 16.2188f, 16.6641f, 16.8516f, 16.0781f, 17.3086f)
                curveTo(15.0352f, 18.1758f, 13.5234f, 18.7031f, 12.0117f, 18.7031f)
                close()
                moveTo(11.9883f, 5.1563f)
                curveTo(15.4336f, 5.1563f, 18.1523f, 7.4648f, 18.75f, 10.8281f)
                lineTo(19.957f, 10.8281f)
                curveTo(20.5312f, 10.8281f, 20.6367f, 11.3672f, 20.332f, 11.8008f)
                lineTo(18.3984f, 14.5195f)
                curveTo(18.0469f, 15.0f, 17.4844f, 14.9648f, 17.1562f, 14.5195f)
                lineTo(15.1992f, 11.8008f)
                curveTo(14.8945f, 11.3672f, 15.0117f, 10.8281f, 15.5742f, 10.8281f)
                lineTo(16.9219f, 10.8281f)
                curveTo(16.3828f, 8.6836f, 14.3906f, 7.0664f, 11.9883f, 7.0664f)
                curveTo(10.8164f, 7.0664f, 9.9492f, 7.4414f, 9.082f, 8.1094f)
                curveTo(8.6016f, 8.4609f, 8.0391f, 8.543f, 7.6289f, 8.0859f)
                curveTo(7.207f, 7.6406f, 7.3359f, 7.0078f, 7.9219f, 6.5391f)
                curveTo(8.9648f, 5.6836f, 10.4766f, 5.1563f, 11.9883f, 5.1563f)
                close()
            }
        }
        .build()
        return _arrowTriangle2CirclepathCircle!!
    }

private var _arrowTriangle2CirclepathCircle: ImageVector? = null
