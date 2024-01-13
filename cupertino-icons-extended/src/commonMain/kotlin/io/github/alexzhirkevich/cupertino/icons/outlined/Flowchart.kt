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

public val CupertinoIcons.Outlined.Flowchart: ImageVector
    get() {
        if (_flowchart != null) {
            return _flowchart!!
        }
        _flowchart = Builder(name = "Flowchart", defaultWidth = 25.1953.dp, defaultHeight =
                27.7559.dp, viewportWidth = 25.1953f, viewportHeight = 27.7559f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8008f, 9.8525f)
                lineTo(22.3945f, 9.8525f)
                curveTo(24.1523f, 9.8525f, 25.1953f, 8.8213f, 25.1953f, 7.0986f)
                lineTo(25.1953f, 3.1377f)
                curveTo(25.1953f, 1.415f, 24.1523f, 0.3838f, 22.3945f, 0.3838f)
                lineTo(2.8008f, 0.3838f)
                curveTo(1.043f, 0.3838f, 0.0f, 1.415f, 0.0f, 3.1377f)
                lineTo(0.0f, 7.0986f)
                curveTo(0.0f, 8.8213f, 1.043f, 9.8525f, 2.8008f, 9.8525f)
                close()
                moveTo(2.8359f, 8.083f)
                curveTo(2.168f, 8.083f, 1.7695f, 7.6729f, 1.7695f, 6.9932f)
                lineTo(1.7695f, 3.2315f)
                curveTo(1.7695f, 2.5635f, 2.168f, 2.1533f, 2.8359f, 2.1533f)
                lineTo(22.3594f, 2.1533f)
                curveTo(23.0273f, 2.1533f, 23.4258f, 2.5635f, 23.4258f, 3.2315f)
                lineTo(23.4258f, 6.9932f)
                curveTo(23.4258f, 7.6729f, 23.0273f, 8.083f, 22.3594f, 8.083f)
                close()
                moveTo(11.7539f, 12.6416f)
                lineTo(13.4648f, 12.6416f)
                lineTo(13.4648f, 8.9385f)
                lineTo(11.7539f, 8.9385f)
                close()
                moveTo(2.8008f, 21.0088f)
                lineTo(22.3945f, 21.0088f)
                curveTo(24.1523f, 21.0088f, 25.1953f, 19.9775f, 25.1953f, 18.2549f)
                lineTo(25.1953f, 14.2939f)
                curveTo(25.1953f, 12.5713f, 24.1523f, 11.54f, 22.3945f, 11.54f)
                lineTo(2.8008f, 11.54f)
                curveTo(1.043f, 11.54f, 0.0f, 12.5713f, 0.0f, 14.2939f)
                lineTo(0.0f, 18.2549f)
                curveTo(0.0f, 19.9775f, 1.043f, 21.0088f, 2.8008f, 21.0088f)
                close()
                moveTo(2.8359f, 19.2393f)
                curveTo(2.168f, 19.2393f, 1.7695f, 18.8291f, 1.7695f, 18.1611f)
                lineTo(1.7695f, 14.3994f)
                curveTo(1.7695f, 13.7197f, 2.168f, 13.3096f, 2.8359f, 13.3096f)
                lineTo(22.3594f, 13.3096f)
                curveTo(23.0273f, 13.3096f, 23.4258f, 13.7197f, 23.4258f, 14.3994f)
                lineTo(23.4258f, 18.1611f)
                curveTo(23.4258f, 18.8291f, 23.0273f, 19.2393f, 22.3594f, 19.2393f)
                close()
                moveTo(11.7422f, 23.458f)
                lineTo(13.4648f, 23.458f)
                lineTo(13.4648f, 19.7666f)
                lineTo(11.7422f, 19.7666f)
                close()
                moveTo(11.9766f, 27.4307f)
                curveTo(12.3281f, 27.8643f, 12.9141f, 27.8643f, 13.2656f, 27.4307f)
                lineTo(15.9492f, 24.1143f)
                curveTo(16.4648f, 23.4697f, 16.1484f, 22.626f, 15.3164f, 22.626f)
                lineTo(9.9141f, 22.626f)
                curveTo(9.0586f, 22.626f, 8.7305f, 23.458f, 9.2695f, 24.1143f)
                close()
            }
        }
        .build()
        return _flowchart!!
    }

private var _flowchart: ImageVector? = null
