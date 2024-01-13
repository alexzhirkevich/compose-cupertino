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

public val CupertinoIcons.Outlined.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 15.668.dp, defaultHeight = 29.3555.dp,
                viewportWidth = 15.668f, viewportHeight = 29.3555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0195f, 28.875f)
                curveTo(7.5117f, 29.2852f, 8.1797f, 29.3438f, 8.6484f, 28.8867f)
                lineTo(12.2695f, 25.2656f)
                curveTo(12.7266f, 24.7969f, 12.7031f, 24.0938f, 12.2578f, 23.6367f)
                lineTo(10.4414f, 21.832f)
                lineTo(13.0898f, 19.1953f)
                curveTo(13.5469f, 18.75f, 13.5234f, 18.0352f, 13.0781f, 17.5664f)
                lineTo(10.6289f, 15.1055f)
                curveTo(13.8516f, 13.5586f, 15.668f, 10.9336f, 15.668f, 7.8164f)
                curveTo(15.668f, 3.4922f, 12.1641f, 0.0f, 7.8398f, 0.0f)
                curveTo(3.4805f, 0.0f, 0.0f, 3.4688f, 0.0f, 7.8164f)
                curveTo(0.0f, 10.957f, 1.8047f, 13.7461f, 4.6523f, 15.0f)
                lineTo(4.6523f, 26.0625f)
                curveTo(4.6523f, 26.4492f, 4.7695f, 26.8945f, 5.1094f, 27.1992f)
                close()
                moveTo(7.8398f, 27.0234f)
                lineTo(6.5391f, 25.7344f)
                lineTo(6.5391f, 13.6406f)
                curveTo(3.7852f, 13.0195f, 1.875f, 10.6406f, 1.875f, 7.8164f)
                curveTo(1.875f, 4.5352f, 4.5352f, 1.8867f, 7.8398f, 1.8867f)
                curveTo(11.1328f, 1.8867f, 13.7812f, 4.5352f, 13.7812f, 7.8164f)
                curveTo(13.7812f, 10.6172f, 11.8594f, 13.0195f, 8.918f, 13.7227f)
                lineTo(8.918f, 16.0898f)
                lineTo(11.2148f, 18.3984f)
                lineTo(8.7305f, 20.8477f)
                lineTo(8.7305f, 22.793f)
                lineTo(10.3945f, 24.4336f)
                close()
                moveTo(7.8398f, 7.9219f)
                curveTo(9.0117f, 7.9219f, 9.9609f, 6.9727f, 9.9609f, 5.7891f)
                curveTo(9.9609f, 4.6172f, 9.0117f, 3.668f, 7.8398f, 3.668f)
                curveTo(6.6445f, 3.668f, 5.707f, 4.6055f, 5.707f, 5.7891f)
                curveTo(5.707f, 6.9727f, 6.6563f, 7.9219f, 7.8398f, 7.9219f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
