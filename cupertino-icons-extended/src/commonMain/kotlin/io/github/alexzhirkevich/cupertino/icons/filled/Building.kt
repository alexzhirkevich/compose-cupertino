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

public val CupertinoIcons.Filled.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 17.8594.dp, defaultHeight =
                24.9961.dp, viewportWidth = 17.8594f, viewportHeight = 24.9961f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 22.8633f)
                curveTo(0.0f, 24.1641f, 0.75f, 24.9961f, 1.9453f, 24.9961f)
                lineTo(15.9141f, 24.9961f)
                curveTo(17.1094f, 24.9961f, 17.8594f, 24.1641f, 17.8594f, 22.8633f)
                lineTo(17.8594f, 2.1445f)
                curveTo(17.8594f, 0.8438f, 17.1094f, 0.0117f, 15.9141f, 0.0117f)
                lineTo(1.9453f, 0.0117f)
                curveTo(0.75f, 0.0117f, 0.0f, 0.8438f, 0.0f, 2.1445f)
                close()
                moveTo(4.875f, 23.1094f)
                lineTo(4.875f, 19.3008f)
                curveTo(4.875f, 18.7617f, 5.2266f, 18.4102f, 5.7656f, 18.4102f)
                lineTo(12.1992f, 18.4102f)
                curveTo(12.7383f, 18.4102f, 13.0898f, 18.7617f, 13.0898f, 19.3008f)
                lineTo(13.0898f, 23.1094f)
                close()
                moveTo(4.4883f, 6.3047f)
                lineTo(4.4883f, 4.0313f)
                curveTo(4.4883f, 3.7383f, 4.6758f, 3.5273f, 4.9688f, 3.5273f)
                lineTo(7.3125f, 3.5273f)
                curveTo(7.6055f, 3.5273f, 7.8164f, 3.7383f, 7.8164f, 4.0313f)
                lineTo(7.8164f, 6.3047f)
                curveTo(7.8164f, 6.6094f, 7.6055f, 6.8086f, 7.3125f, 6.8086f)
                lineTo(4.9688f, 6.8086f)
                curveTo(4.6758f, 6.8086f, 4.4883f, 6.6094f, 4.4883f, 6.3047f)
                close()
                moveTo(10.1484f, 6.3047f)
                lineTo(10.1484f, 4.0313f)
                curveTo(10.1484f, 3.7383f, 10.3359f, 3.5273f, 10.6406f, 3.5273f)
                lineTo(12.9727f, 3.5273f)
                curveTo(13.2656f, 3.5273f, 13.4766f, 3.7383f, 13.4766f, 4.0313f)
                lineTo(13.4766f, 6.3047f)
                curveTo(13.4766f, 6.6094f, 13.2656f, 6.8086f, 12.9727f, 6.8086f)
                lineTo(10.6406f, 6.8086f)
                curveTo(10.3359f, 6.8086f, 10.1484f, 6.6094f, 10.1484f, 6.3047f)
                close()
                moveTo(4.4883f, 11.0859f)
                lineTo(4.4883f, 8.8125f)
                curveTo(4.4883f, 8.5195f, 4.6758f, 8.3086f, 4.9688f, 8.3086f)
                lineTo(7.3125f, 8.3086f)
                curveTo(7.6055f, 8.3086f, 7.8164f, 8.5195f, 7.8164f, 8.8125f)
                lineTo(7.8164f, 11.0859f)
                curveTo(7.8164f, 11.3906f, 7.6055f, 11.5898f, 7.3125f, 11.5898f)
                lineTo(4.9688f, 11.5898f)
                curveTo(4.6758f, 11.5898f, 4.4883f, 11.3906f, 4.4883f, 11.0859f)
                close()
                moveTo(10.1484f, 11.0859f)
                lineTo(10.1484f, 8.8125f)
                curveTo(10.1484f, 8.5195f, 10.3359f, 8.3086f, 10.6406f, 8.3086f)
                lineTo(12.9727f, 8.3086f)
                curveTo(13.2656f, 8.3086f, 13.4766f, 8.5195f, 13.4766f, 8.8125f)
                lineTo(13.4766f, 11.0859f)
                curveTo(13.4766f, 11.3906f, 13.2656f, 11.5898f, 12.9727f, 11.5898f)
                lineTo(10.6406f, 11.5898f)
                curveTo(10.3359f, 11.5898f, 10.1484f, 11.3906f, 10.1484f, 11.0859f)
                close()
                moveTo(4.4883f, 15.8672f)
                lineTo(4.4883f, 13.5938f)
                curveTo(4.4883f, 13.2891f, 4.6758f, 13.0898f, 4.9688f, 13.0898f)
                lineTo(7.3125f, 13.0898f)
                curveTo(7.6055f, 13.0898f, 7.8164f, 13.2891f, 7.8164f, 13.5938f)
                lineTo(7.8164f, 15.8672f)
                curveTo(7.8164f, 16.1602f, 7.6055f, 16.3711f, 7.3125f, 16.3711f)
                lineTo(4.9688f, 16.3711f)
                curveTo(4.6758f, 16.3711f, 4.4883f, 16.1602f, 4.4883f, 15.8672f)
                close()
                moveTo(10.1484f, 15.8672f)
                lineTo(10.1484f, 13.5938f)
                curveTo(10.1484f, 13.2891f, 10.3359f, 13.0898f, 10.6406f, 13.0898f)
                lineTo(12.9727f, 13.0898f)
                curveTo(13.2656f, 13.0898f, 13.4766f, 13.2891f, 13.4766f, 13.5938f)
                lineTo(13.4766f, 15.8672f)
                curveTo(13.4766f, 16.1602f, 13.2656f, 16.3711f, 12.9727f, 16.3711f)
                lineTo(10.6406f, 16.3711f)
                curveTo(10.3359f, 16.3711f, 10.1484f, 16.1602f, 10.1484f, 15.8672f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
