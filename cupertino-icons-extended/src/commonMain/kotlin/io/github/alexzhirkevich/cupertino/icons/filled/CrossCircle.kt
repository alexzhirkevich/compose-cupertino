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

public val CupertinoIcons.Filled.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(5.2734f, 13.2305f)
                lineTo(5.2734f, 10.6758f)
                curveTo(5.2734f, 9.9375f, 5.7773f, 9.4219f, 6.5156f, 9.4219f)
                lineTo(9.4219f, 9.4219f)
                lineTo(9.4219f, 6.5508f)
                curveTo(9.4219f, 5.7891f, 9.9258f, 5.2852f, 10.6641f, 5.2852f)
                lineTo(13.2188f, 5.2852f)
                curveTo(13.9688f, 5.2852f, 14.4609f, 5.7891f, 14.4609f, 6.5508f)
                lineTo(14.4609f, 9.4219f)
                lineTo(17.3672f, 9.4219f)
                curveTo(18.1172f, 9.4219f, 18.6211f, 9.9375f, 18.6211f, 10.6758f)
                lineTo(18.6211f, 13.2305f)
                curveTo(18.6211f, 13.9688f, 18.1172f, 14.4727f, 17.3672f, 14.4727f)
                lineTo(14.4609f, 14.4727f)
                lineTo(14.4609f, 17.3672f)
                curveTo(14.4609f, 18.1289f, 13.9688f, 18.6211f, 13.2188f, 18.6211f)
                lineTo(10.6641f, 18.6211f)
                curveTo(9.9258f, 18.6211f, 9.4219f, 18.1289f, 9.4219f, 17.3672f)
                lineTo(9.4219f, 14.4727f)
                lineTo(6.5156f, 14.4727f)
                curveTo(5.7891f, 14.4727f, 5.2734f, 13.9688f, 5.2734f, 13.2305f)
                close()
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
