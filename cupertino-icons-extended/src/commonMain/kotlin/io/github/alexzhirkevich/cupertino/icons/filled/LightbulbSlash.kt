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

public val CupertinoIcons.Filled.LightbulbSlash: ImageVector
    get() {
        if (_lightbulbSlash != null) {
            return _lightbulbSlash!!
        }
        _lightbulbSlash = Builder(name = "LightbulbSlash", defaultWidth = 21.1392.dp, defaultHeight
                = 27.9961.dp, viewportWidth = 21.1392f, viewportHeight = 27.9961f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1138f, 0.0f)
                curveTo(8.5943f, 0.0f, 6.4029f, 1.043f, 4.9615f, 2.6836f)
                lineTo(16.7974f, 14.5195f)
                curveTo(17.8052f, 11.6484f, 18.9536f, 10.1602f, 18.9536f, 7.2188f)
                curveTo(18.9536f, 3.1758f, 15.4966f, 0.0f, 11.1138f, 0.0f)
                close()
                moveTo(7.4458f, 21.3398f)
                lineTo(14.77f, 21.3398f)
                curveTo(15.2271f, 21.3398f, 15.4614f, 21.0703f, 15.5083f, 20.6484f)
                curveTo(15.5318f, 20.3203f, 15.5786f, 20.0273f, 15.6138f, 19.7695f)
                lineTo(3.3208f, 7.4648f)
                curveTo(3.3091f, 7.8398f, 3.3208f, 8.2031f, 3.3677f, 8.5547f)
                curveTo(3.8013f, 12.0352f, 6.0396f, 13.6289f, 6.7075f, 20.6484f)
                curveTo(6.7544f, 21.0703f, 6.9888f, 21.3398f, 7.4458f, 21.3398f)
                close()
                moveTo(7.399f, 23.8711f)
                lineTo(14.8169f, 23.8711f)
                curveTo(15.2036f, 23.8711f, 15.5083f, 23.5664f, 15.5083f, 23.1797f)
                curveTo(15.5083f, 22.8047f, 15.2036f, 22.5f, 14.8169f, 22.5f)
                lineTo(7.399f, 22.5f)
                curveTo(7.0122f, 22.5f, 6.7193f, 22.8047f, 6.7193f, 23.1797f)
                curveTo(6.7193f, 23.5664f, 7.0122f, 23.8711f, 7.399f, 23.8711f)
                close()
                moveTo(11.1138f, 27.2695f)
                curveTo(12.9185f, 27.2695f, 14.4419f, 26.3789f, 14.5474f, 25.0312f)
                lineTo(7.6685f, 25.0312f)
                curveTo(7.7505f, 26.3789f, 9.2857f, 27.2695f, 11.1138f, 27.2695f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5982f, 21.7969f)
                curveTo(19.9614f, 22.1719f, 20.5239f, 22.1602f, 20.8755f, 21.7969f)
                curveTo(21.2271f, 21.4453f, 21.2271f, 20.8828f, 20.8755f, 20.5195f)
                lineTo(1.5396f, 1.1836f)
                curveTo(1.188f, 0.8203f, 0.6021f, 0.8438f, 0.2505f, 1.1836f)
                curveTo(-0.0893f, 1.5234f, -0.0776f, 2.1328f, 0.2505f, 2.4609f)
                close()
            }
        }
        .build()
        return _lightbulbSlash!!
    }

private var _lightbulbSlash: ImageVector? = null
