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

public val CupertinoIcons.Filled.WebCamera: ImageVector
    get() {
        if (_webCamera != null) {
            return _webCamera!!
        }
        _webCamera = Builder(name = "WebCamera", defaultWidth = 18.832.dp, defaultHeight =
                23.6367.dp, viewportWidth = 18.832f, viewportHeight = 23.6367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4219f, 18.8555f)
                curveTo(14.6133f, 18.8555f, 18.832f, 14.6367f, 18.832f, 9.4219f)
                curveTo(18.832f, 4.2188f, 14.6133f, 0.0f, 9.4219f, 0.0f)
                curveTo(4.2188f, 0.0f, 0.0f, 4.2188f, 0.0f, 9.4219f)
                curveTo(0.0f, 14.6367f, 4.2188f, 18.8555f, 9.4219f, 18.8555f)
                close()
                moveTo(8.4844f, 22.6758f)
                lineTo(10.3711f, 22.6758f)
                lineTo(10.3711f, 17.9883f)
                lineTo(8.4844f, 17.9883f)
                close()
                moveTo(5.3203f, 23.6133f)
                lineTo(13.5234f, 23.6133f)
                curveTo(14.0391f, 23.6133f, 14.4609f, 23.1914f, 14.4609f, 22.6758f)
                curveTo(14.4609f, 22.1602f, 14.0391f, 21.7266f, 13.5234f, 21.7266f)
                lineTo(5.332f, 21.7266f)
                curveTo(4.8164f, 21.7266f, 4.3828f, 22.1602f, 4.3828f, 22.6758f)
                curveTo(4.3828f, 23.1914f, 4.8047f, 23.6133f, 5.3203f, 23.6133f)
                close()
                moveTo(9.4219f, 15.0703f)
                curveTo(6.2813f, 15.0703f, 3.7852f, 12.5742f, 3.7852f, 9.4219f)
                curveTo(3.7852f, 6.2813f, 6.2813f, 3.7852f, 9.4219f, 3.7852f)
                curveTo(12.5742f, 3.7852f, 15.0469f, 6.2813f, 15.0469f, 9.4219f)
                curveTo(15.0469f, 12.5742f, 12.5742f, 15.0703f, 9.4219f, 15.0703f)
                close()
                moveTo(9.4219f, 12.0469f)
                curveTo(10.8867f, 12.0469f, 12.0352f, 10.8867f, 12.0352f, 9.4219f)
                curveTo(12.0352f, 7.957f, 10.8867f, 6.7969f, 9.4219f, 6.7969f)
                curveTo(7.957f, 6.7969f, 6.7969f, 7.957f, 6.7969f, 9.4219f)
                curveTo(6.7969f, 10.8867f, 7.957f, 12.0469f, 9.4219f, 12.0469f)
                close()
            }
        }
        .build()
        return _webCamera!!
    }

private var _webCamera: ImageVector? = null
