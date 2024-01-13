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

public val CupertinoIcons.Outlined.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 21.0435.dp, defaultHeight = 22.0725.dp,
                viewportWidth = 21.0435f, viewportHeight = 22.0725f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2313f, 16.046f)
                lineTo(5.075f, 19.878f)
                curveTo(6.5985f, 21.4015f, 8.5204f, 21.4132f, 10.0086f, 19.9249f)
                lineTo(20.3211f, 9.6007f)
                curveTo(21.3055f, 8.6163f, 21.2703f, 7.2687f, 20.2977f, 6.2843f)
                lineTo(14.743f, 0.7413f)
                curveTo(13.7586f, -0.2313f, 12.411f, -0.2548f, 11.4149f, 0.7179f)
                lineTo(1.0907f, 11.0187f)
                curveTo(-0.3976f, 12.5069f, -0.3742f, 14.4405f, 1.2313f, 16.046f)
                close()
                moveTo(2.4852f, 14.7921f)
                curveTo(1.6532f, 13.9601f, 1.618f, 12.9874f, 2.4149f, 12.2023f)
                lineTo(12.6102f, 2.0304f)
                curveTo(12.8914f, 1.7726f, 13.2313f, 1.7491f, 13.5008f, 2.0069f)
                lineTo(19.0321f, 7.5265f)
                curveTo(19.3016f, 7.7843f, 19.2664f, 8.1476f, 18.9969f, 8.4171f)
                lineTo(8.825f, 18.6007f)
                curveTo(8.0399f, 19.3976f, 7.1024f, 19.3976f, 6.3055f, 18.6007f)
                close()
                moveTo(2.825f, 10.4679f)
                lineTo(10.5594f, 18.1788f)
                lineTo(11.6493f, 17.089f)
                lineTo(3.9266f, 9.378f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
