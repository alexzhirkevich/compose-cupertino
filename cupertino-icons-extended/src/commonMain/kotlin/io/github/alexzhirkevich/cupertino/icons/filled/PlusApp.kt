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

public val CupertinoIcons.Filled.PlusApp: ImageVector
    get() {
        if (_plusApp != null) {
            return _plusApp!!
        }
        _plusApp = Builder(name = "PlusApp", defaultWidth = 21.3281.dp, defaultHeight = 21.3398.dp,
                viewportWidth = 21.3281f, viewportHeight = 21.3398f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.957f, 1.3828f)
                curveTo(18.7617f, 0.1875f, 17.0742f, 0.0f, 15.0703f, 0.0f)
                lineTo(6.2227f, 0.0f)
                curveTo(4.2539f, 0.0f, 2.5664f, 0.1875f, 1.3711f, 1.3828f)
                curveTo(0.1758f, 2.5781f, 0.0f, 4.2539f, 0.0f, 6.2109f)
                lineTo(0.0f, 15.0703f)
                curveTo(0.0f, 17.0742f, 0.1758f, 18.7383f, 1.3711f, 19.9336f)
                curveTo(2.5664f, 21.1289f, 4.2539f, 21.3164f, 6.2461f, 21.3164f)
                lineTo(15.0703f, 21.3164f)
                curveTo(17.0742f, 21.3164f, 18.7617f, 21.1289f, 19.957f, 19.9336f)
                curveTo(21.1523f, 18.7383f, 21.3281f, 17.0742f, 21.3281f, 15.0703f)
                lineTo(21.3281f, 6.2461f)
                curveTo(21.3281f, 4.2422f, 21.1523f, 2.5664f, 19.957f, 1.3828f)
                close()
                moveTo(4.9453f, 10.6758f)
                curveTo(4.9453f, 10.0664f, 5.3672f, 9.6445f, 5.9883f, 9.6445f)
                lineTo(9.6563f, 9.6445f)
                lineTo(9.6563f, 5.9766f)
                curveTo(9.6563f, 5.3672f, 10.0547f, 4.9336f, 10.6523f, 4.9336f)
                curveTo(11.2617f, 4.9336f, 11.6836f, 5.3672f, 11.6836f, 5.9766f)
                lineTo(11.6836f, 9.6445f)
                lineTo(15.3633f, 9.6445f)
                curveTo(15.9609f, 9.6445f, 16.3945f, 10.0664f, 16.3945f, 10.6758f)
                curveTo(16.3945f, 11.2734f, 15.9609f, 11.6719f, 15.3633f, 11.6719f)
                lineTo(11.6836f, 11.6719f)
                lineTo(11.6836f, 15.3516f)
                curveTo(11.6836f, 15.9609f, 11.2617f, 16.3828f, 10.6523f, 16.3828f)
                curveTo(10.0547f, 16.3828f, 9.6563f, 15.9492f, 9.6563f, 15.3516f)
                lineTo(9.6563f, 11.6719f)
                lineTo(5.9883f, 11.6719f)
                curveTo(5.3789f, 11.6719f, 4.9453f, 11.2734f, 4.9453f, 10.6758f)
                close()
            }
        }
        .build()
        return _plusApp!!
    }

private var _plusApp: ImageVector? = null
