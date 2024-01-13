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

public val CupertinoIcons.Filled.XmarkCircle: ImageVector
    get() {
        if (_xmarkCircle != null) {
            return _xmarkCircle!!
        }
        _xmarkCircle = Builder(name = "XmarkCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(8.0156f, 16.875f)
                curveTo(7.4766f, 16.875f, 7.0547f, 16.4414f, 7.0547f, 15.9023f)
                curveTo(7.0547f, 15.6445f, 7.1484f, 15.3984f, 7.3359f, 15.2227f)
                lineTo(10.582f, 11.9648f)
                lineTo(7.3359f, 8.7188f)
                curveTo(7.1484f, 8.5313f, 7.0547f, 8.2969f, 7.0547f, 8.0391f)
                curveTo(7.0547f, 7.4883f, 7.4766f, 7.0781f, 8.0156f, 7.0781f)
                curveTo(8.2852f, 7.0781f, 8.4961f, 7.1719f, 8.6836f, 7.3477f)
                lineTo(11.9531f, 10.6055f)
                lineTo(15.2461f, 7.3359f)
                curveTo(15.4453f, 7.1367f, 15.6562f, 7.0547f, 15.9141f, 7.0547f)
                curveTo(16.4531f, 7.0547f, 16.8867f, 7.4766f, 16.8867f, 8.0156f)
                curveTo(16.8867f, 8.2852f, 16.8047f, 8.4961f, 16.5938f, 8.707f)
                lineTo(13.3359f, 11.9648f)
                lineTo(16.582f, 15.2109f)
                curveTo(16.7812f, 15.3867f, 16.875f, 15.6328f, 16.875f, 15.9023f)
                curveTo(16.875f, 16.4414f, 16.4414f, 16.875f, 15.8906f, 16.875f)
                curveTo(15.6211f, 16.875f, 15.375f, 16.7812f, 15.1992f, 16.5938f)
                lineTo(11.9531f, 13.3359f)
                lineTo(8.7188f, 16.5938f)
                curveTo(8.5313f, 16.7812f, 8.2852f, 16.875f, 8.0156f, 16.875f)
                close()
            }
        }
        .build()
        return _xmarkCircle!!
    }

private var _xmarkCircle: ImageVector? = null
