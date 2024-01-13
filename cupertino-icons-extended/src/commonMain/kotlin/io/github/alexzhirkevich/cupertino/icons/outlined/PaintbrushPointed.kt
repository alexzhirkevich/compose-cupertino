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

public val CupertinoIcons.Outlined.PaintbrushPointed: ImageVector
    get() {
        if (_paintbrushPointed != null) {
            return _paintbrushPointed!!
        }
        _paintbrushPointed = Builder(name = "PaintbrushPointed", defaultWidth = 25.799.dp,
                defaultHeight = 24.2071.dp, viewportWidth = 25.799f, viewportHeight =
                24.2071f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3614f, 21.3907f)
                curveTo(2.5411f, 24.3321f, 7.1114f, 25.1289f, 9.9473f, 23.0196f)
                curveTo(12.3731f, 21.2266f, 12.8888f, 18.4024f, 11.0958f, 16.0352f)
                curveTo(9.42f, 13.7852f, 6.9356f, 13.2344f, 4.9903f, 14.6992f)
                curveTo(3.1622f, 16.0703f, 3.8067f, 18.0391f, 2.7872f, 18.8008f)
                curveTo(1.8966f, 19.4688f, 1.0645f, 19.0938f, 0.42f, 19.586f)
                curveTo(-0.0487f, 19.961f, -0.2011f, 20.6407f, 0.3614f, 21.3907f)
                close()
                moveTo(2.752f, 21.2032f)
                curveTo(2.5997f, 21.0391f, 2.6114f, 20.875f, 2.7169f, 20.7696f)
                curveTo(2.8809f, 20.6172f, 3.5372f, 20.5703f, 4.0411f, 20.0664f)
                curveTo(5.1778f, 18.9414f, 4.7911f, 17.2891f, 6.1036f, 16.2696f)
                curveTo(7.1934f, 15.4024f, 8.7052f, 15.7188f, 9.7247f, 17.0313f)
                curveTo(10.8731f, 18.5196f, 10.4747f, 20.336f, 8.8927f, 21.5547f)
                curveTo(7.1231f, 22.9492f, 4.3927f, 22.9375f, 2.752f, 21.2032f)
                close()
                moveTo(11.8224f, 18.6016f)
                curveTo(13.088f, 18.461f, 14.1544f, 17.8282f, 15.3497f, 16.6328f)
                curveTo(19.1114f, 12.8828f, 24.8536f, 4.4805f, 25.3575f, 3.7774f)
                curveTo(26.8341f, 1.7266f, 24.3028f, -0.7812f, 22.2403f, 0.6602f)
                curveTo(21.5489f, 1.1524f, 13.1349f, 6.8828f, 9.3848f, 10.668f)
                curveTo(8.213f, 11.8516f, 7.5684f, 12.9063f, 7.4161f, 14.1485f)
                lineTo(9.2559f, 14.6524f)
                curveTo(9.2794f, 13.7969f, 9.7364f, 12.9649f, 10.7091f, 12.0039f)
                curveTo(14.4239f, 8.336f, 22.6388f, 2.6992f, 23.1427f, 2.3242f)
                curveTo(23.5411f, 2.0313f, 23.9864f, 2.4532f, 23.6817f, 2.8867f)
                curveTo(23.377f, 3.3321f, 17.67f, 11.6524f, 14.0138f, 15.3086f)
                curveTo(13.0528f, 16.2696f, 12.3145f, 16.6563f, 11.5059f, 16.75f)
                close()
                moveTo(13.8966f, 15.6602f)
                lineTo(15.3966f, 15.2735f)
                curveTo(15.2325f, 13.0352f, 13.0411f, 10.8086f, 10.838f, 10.6211f)
                lineTo(10.3341f, 12.1211f)
                curveTo(11.8341f, 12.086f, 13.8966f, 14.1485f, 13.8966f, 15.6602f)
                close()
            }
        }
        .build()
        return _paintbrushPointed!!
    }

private var _paintbrushPointed: ImageVector? = null
