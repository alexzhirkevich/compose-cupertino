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

public val CupertinoIcons.Outlined.NoteText: ImageVector
    get() {
        if (_noteText != null) {
            return _noteText!!
        }
        _noteText = Builder(name = "NoteText", defaultWidth = 23.3555.dp, defaultHeight =
                21.5977.dp, viewportWidth = 23.3555f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(19.6875f, 21.5977f)
                curveTo(22.1367f, 21.5977f, 23.3555f, 20.3789f, 23.3555f, 17.9648f)
                lineTo(23.3555f, 3.6563f)
                curveTo(23.3555f, 1.2422f, 22.1367f, 0.0234f, 19.6875f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(3.5039f, 19.7109f)
                curveTo(2.4609f, 19.7109f, 1.8867f, 19.1602f, 1.8867f, 18.0703f)
                lineTo(1.8867f, 7.0195f)
                curveTo(1.8867f, 5.9414f, 2.4609f, 5.3789f, 3.5039f, 5.3789f)
                lineTo(19.8398f, 5.3789f)
                curveTo(20.8828f, 5.3789f, 21.4688f, 5.9414f, 21.4688f, 7.0195f)
                lineTo(21.4688f, 18.0703f)
                curveTo(21.4688f, 19.1602f, 20.8828f, 19.7109f, 19.8398f, 19.7109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.543f, 9.7383f)
                lineTo(17.8477f, 9.7383f)
                curveTo(18.2578f, 9.7383f, 18.5742f, 9.4102f, 18.5742f, 9.0f)
                curveTo(18.5742f, 8.6016f, 18.2578f, 8.2969f, 17.8477f, 8.2969f)
                lineTo(5.543f, 8.2969f)
                curveTo(5.1094f, 8.2969f, 4.8047f, 8.6016f, 4.8047f, 9.0f)
                curveTo(4.8047f, 9.4102f, 5.1094f, 9.7383f, 5.543f, 9.7383f)
                close()
                moveTo(5.543f, 13.2656f)
                lineTo(17.8477f, 13.2656f)
                curveTo(18.2578f, 13.2656f, 18.5742f, 12.9609f, 18.5742f, 12.5625f)
                curveTo(18.5742f, 12.1406f, 18.2578f, 11.8242f, 17.8477f, 11.8242f)
                lineTo(5.543f, 11.8242f)
                curveTo(5.1094f, 11.8242f, 4.8047f, 12.1406f, 4.8047f, 12.5625f)
                curveTo(4.8047f, 12.9609f, 5.1094f, 13.2656f, 5.543f, 13.2656f)
                close()
                moveTo(5.543f, 16.793f)
                lineTo(13.3594f, 16.793f)
                curveTo(13.7695f, 16.793f, 14.0859f, 16.4883f, 14.0859f, 16.0898f)
                curveTo(14.0859f, 15.6797f, 13.7695f, 15.3516f, 13.3594f, 15.3516f)
                lineTo(5.543f, 15.3516f)
                curveTo(5.1094f, 15.3516f, 4.8047f, 15.6797f, 4.8047f, 16.0898f)
                curveTo(4.8047f, 16.4883f, 5.1094f, 16.793f, 5.543f, 16.793f)
                close()
            }
        }
        .build()
        return _noteText!!
    }

private var _noteText: ImageVector? = null
