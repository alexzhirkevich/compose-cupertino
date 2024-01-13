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

public val CupertinoIcons.Outlined.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 22.2812.dp, defaultHeight = 26.8945.dp,
                viewportWidth = 22.2812f, viewportHeight = 26.8945f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8608f, 15.6211f)
                lineTo(6.1147f, 14.3203f)
                lineTo(1.9428f, 6.1289f)
                lineTo(3.8296f, 3.2344f)
                lineTo(8.7749f, 12.9844f)
                lineTo(10.6968f, 12.668f)
                lineTo(4.9663f, 1.9922f)
                lineTo(17.3061f, 1.9922f)
                lineTo(11.5757f, 12.668f)
                lineTo(13.4975f, 12.9844f)
                lineTo(18.4428f, 3.2344f)
                lineTo(20.3413f, 6.1289f)
                lineTo(16.1577f, 14.3203f)
                lineTo(17.4116f, 15.6211f)
                lineTo(22.1225f, 6.7734f)
                curveTo(22.3452f, 6.3867f, 22.3335f, 5.9414f, 22.0874f, 5.5781f)
                lineTo(18.9116f, 0.7148f)
                curveTo(18.6655f, 0.375f, 18.3725f, 0.2227f, 17.9155f, 0.2227f)
                lineTo(4.3686f, 0.2227f)
                curveTo(3.8999f, 0.2227f, 3.6069f, 0.375f, 3.3725f, 0.7148f)
                lineTo(0.185f, 5.5781f)
                curveTo(-0.0493f, 5.9414f, -0.0611f, 6.3867f, 0.1499f, 6.7734f)
                close()
                moveTo(6.7944f, 7.3711f)
                lineTo(15.4897f, 7.3711f)
                lineTo(15.4897f, 5.6016f)
                lineTo(6.7944f, 5.6016f)
                close()
                moveTo(11.1421f, 26.8945f)
                curveTo(15.3843f, 26.8945f, 18.8178f, 23.4609f, 18.8178f, 19.2188f)
                curveTo(18.8178f, 14.9648f, 15.3843f, 11.5312f, 11.1421f, 11.5312f)
                curveTo(6.8882f, 11.5312f, 3.4546f, 14.9648f, 3.4546f, 19.2188f)
                curveTo(3.4546f, 23.4609f, 6.8882f, 26.8945f, 11.1421f, 26.8945f)
                close()
                moveTo(11.1421f, 25.125f)
                curveTo(7.8725f, 25.125f, 5.2241f, 22.4883f, 5.2241f, 19.2188f)
                curveTo(5.2241f, 15.9492f, 7.8608f, 13.3008f, 11.1421f, 13.3008f)
                curveTo(14.3999f, 13.3008f, 17.0483f, 15.9375f, 17.0483f, 19.2188f)
                curveTo(17.0483f, 22.4766f, 14.4116f, 25.125f, 11.1421f, 25.125f)
                close()
                moveTo(9.0796f, 22.9219f)
                lineTo(11.1538f, 21.4102f)
                lineTo(13.2046f, 22.9219f)
                curveTo(13.6499f, 23.2383f, 14.0952f, 22.9102f, 13.9311f, 22.418f)
                lineTo(13.0991f, 19.9688f)
                lineTo(15.1968f, 18.4688f)
                curveTo(15.5835f, 18.1992f, 15.478f, 17.6367f, 14.9272f, 17.6367f)
                lineTo(12.3608f, 17.6602f)
                lineTo(11.5757f, 15.1992f)
                curveTo(11.4233f, 14.707f, 10.8608f, 14.707f, 10.7085f, 15.1992f)
                lineTo(9.9233f, 17.6602f)
                lineTo(7.3569f, 17.6367f)
                curveTo(6.8179f, 17.6367f, 6.6889f, 18.1875f, 7.0991f, 18.4805f)
                lineTo(9.1967f, 19.9688f)
                lineTo(8.3647f, 22.418f)
                curveTo(8.2007f, 22.9102f, 8.646f, 23.2383f, 9.0796f, 22.9219f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
