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

public val CupertinoIcons.Outlined.Eyebrow: ImageVector
    get() {
        if (_eyebrow != null) {
            return _eyebrow!!
        }
        _eyebrow = Builder(name = "Eyebrow", defaultWidth = 24.2418.dp, defaultHeight = 20.8242.dp,
                viewportWidth = 24.2418f, viewportHeight = 20.8242f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7396f, 14.4141f)
                curveTo(22.6888f, 13.3945f, 21.2825f, 11.9648f, 20.181f, 13.0547f)
                curveTo(18.6341f, 14.5898f, 15.9974f, 15.5391f, 13.0911f, 15.5391f)
                curveTo(9.9036f, 15.5391f, 6.8685f, 14.8008f, 3.9622f, 13.2188f)
                curveTo(2.638f, 12.4922f, 1.6536f, 14.3789f, 3.0247f, 15.1055f)
                curveTo(6.1771f, 16.7812f, 9.6106f, 17.625f, 13.0911f, 17.625f)
                curveTo(16.6653f, 17.625f, 19.8294f, 16.4531f, 21.7396f, 14.4141f)
                close()
                moveTo(5.1458f, 15.8555f)
                curveTo(4.8763f, 16.3711f, 4.2786f, 17.3438f, 3.9153f, 17.7305f)
                curveTo(3.095f, 18.5859f, 4.2903f, 19.6406f, 5.1106f, 18.75f)
                curveTo(5.8489f, 17.9414f, 6.4349f, 16.6992f, 6.6575f, 16.3242f)
                close()
                moveTo(9.2356f, 16.793f)
                curveTo(9.013f, 17.8359f, 8.6614f, 18.9961f, 8.4622f, 19.4531f)
                curveTo(7.9817f, 20.5547f, 9.47f, 21.1289f, 9.9388f, 20.0039f)
                curveTo(10.3489f, 18.9727f, 10.6302f, 17.4492f, 10.6888f, 17.0156f)
                close()
                moveTo(13.4896f, 17.0508f)
                curveTo(13.6419f, 18.1172f, 13.5833f, 19.3359f, 13.5481f, 19.8398f)
                curveTo(13.4896f, 21.0352f, 15.095f, 21.0586f, 15.1185f, 19.8516f)
                curveTo(15.1536f, 18.7383f, 15.013f, 17.2031f, 14.931f, 16.7695f)
                close()
                moveTo(17.4739f, 16.2891f)
                curveTo(18.0716f, 17.4727f, 18.2591f, 18.7148f, 18.3646f, 19.2188f)
                curveTo(18.5755f, 20.4023f, 20.1458f, 19.875f, 19.888f, 18.832f)
                curveTo(19.5716f, 17.5195f, 19.1731f, 16.1602f, 18.7278f, 15.5039f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4856f, 9.5742f)
                curveTo(4.7005f, 9.5742f, 12.1653f, 4.207f, 15.7981f, 4.207f)
                curveTo(17.0755f, 4.207f, 18.2005f, 4.7227f, 19.3841f, 5.8008f)
                lineTo(22.3255f, 8.5078f)
                curveTo(23.2981f, 9.3984f, 24.681f, 8.3438f, 24.1067f, 7.3477f)
                curveTo(23.5911f, 6.5039f, 22.806f, 5.332f, 21.0716f, 3.4102f)
                curveTo(19.1966f, 1.3242f, 17.4856f, 0.0f, 14.8021f, 0.0f)
                curveTo(11.3216f, 0.0f, 6.0247f, 2.0156f, 1.1028f, 4.6289f)
                curveTo(-0.9948f, 5.7422f, 0.1419f, 9.5742f, 2.4856f, 9.5742f)
                close()
            }
        }
        .build()
        return _eyebrow!!
    }

private var _eyebrow: ImageVector? = null
