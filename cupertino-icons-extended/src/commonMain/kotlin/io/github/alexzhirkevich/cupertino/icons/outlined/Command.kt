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

public val CupertinoIcons.Outlined.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 22.1367.dp, defaultHeight = 22.1602.dp,
                viewportWidth = 22.1367f, viewportHeight = 22.1602f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5391f, 8.3438f)
                lineTo(6.5391f, 13.8164f)
                lineTo(4.1836f, 13.8164f)
                curveTo(1.875f, 13.8164f, 0.0f, 15.6328f, 0.0f, 17.9531f)
                curveTo(0.0f, 20.2734f, 1.875f, 22.1484f, 4.1836f, 22.1484f)
                curveTo(6.4922f, 22.1484f, 8.3672f, 20.2734f, 8.3672f, 17.9531f)
                lineTo(8.3672f, 15.6094f)
                lineTo(13.7695f, 15.6094f)
                lineTo(13.7695f, 17.9531f)
                curveTo(13.7695f, 20.2734f, 15.6445f, 22.1484f, 17.9531f, 22.1484f)
                curveTo(20.2617f, 22.1484f, 22.1367f, 20.2734f, 22.1367f, 17.9531f)
                curveTo(22.1367f, 15.6328f, 20.2617f, 13.8164f, 17.9531f, 13.8164f)
                lineTo(15.5977f, 13.8164f)
                lineTo(15.5977f, 8.3438f)
                lineTo(17.9531f, 8.3438f)
                curveTo(20.2617f, 8.3438f, 22.1367f, 6.5273f, 22.1367f, 4.207f)
                curveTo(22.1367f, 1.8867f, 20.2617f, 0.0f, 17.9531f, 0.0f)
                curveTo(15.6445f, 0.0f, 13.7695f, 1.8867f, 13.7695f, 4.207f)
                lineTo(13.7695f, 6.5508f)
                lineTo(8.3672f, 6.5508f)
                lineTo(8.3672f, 4.207f)
                curveTo(8.3672f, 1.8867f, 6.4922f, 0.0f, 4.1836f, 0.0f)
                curveTo(1.875f, 0.0f, 0.0f, 1.8867f, 0.0f, 4.207f)
                curveTo(0.0f, 6.5273f, 1.875f, 8.3438f, 4.1836f, 8.3438f)
                close()
                moveTo(4.1836f, 6.5742f)
                curveTo(2.8945f, 6.5742f, 1.8281f, 5.5078f, 1.8281f, 4.207f)
                curveTo(1.8281f, 2.9063f, 2.8945f, 1.8281f, 4.1836f, 1.8281f)
                curveTo(5.4727f, 1.8281f, 6.5391f, 2.9063f, 6.5391f, 4.207f)
                lineTo(6.5391f, 6.5742f)
                close()
                moveTo(17.9531f, 6.5742f)
                lineTo(15.5977f, 6.5742f)
                lineTo(15.5977f, 4.207f)
                curveTo(15.5977f, 2.9063f, 16.6641f, 1.8281f, 17.9531f, 1.8281f)
                curveTo(19.2422f, 1.8281f, 20.3086f, 2.9063f, 20.3086f, 4.207f)
                curveTo(20.3086f, 5.5078f, 19.2422f, 6.5742f, 17.9531f, 6.5742f)
                close()
                moveTo(8.3672f, 13.8398f)
                lineTo(8.3672f, 8.3203f)
                lineTo(13.7695f, 8.3203f)
                lineTo(13.7695f, 13.8398f)
                close()
                moveTo(4.1836f, 15.5742f)
                lineTo(6.5391f, 15.5742f)
                lineTo(6.5391f, 17.9414f)
                curveTo(6.5391f, 19.2422f, 5.4727f, 20.3086f, 4.1836f, 20.3086f)
                curveTo(2.8945f, 20.3086f, 1.8281f, 19.2422f, 1.8281f, 17.9414f)
                curveTo(1.8281f, 16.6406f, 2.8945f, 15.5742f, 4.1836f, 15.5742f)
                close()
                moveTo(17.9531f, 15.5742f)
                curveTo(19.2422f, 15.5742f, 20.3086f, 16.6406f, 20.3086f, 17.9414f)
                curveTo(20.3086f, 19.2422f, 19.2422f, 20.3086f, 17.9531f, 20.3086f)
                curveTo(16.6641f, 20.3086f, 15.5977f, 19.2422f, 15.5977f, 17.9414f)
                lineTo(15.5977f, 15.5742f)
                close()
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
