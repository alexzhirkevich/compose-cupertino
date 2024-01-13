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

public val CupertinoIcons.Outlined.Paragraphsign: ImageVector
    get() {
        if (_paragraphsign != null) {
            return _paragraphsign!!
        }
        _paragraphsign = Builder(name = "Paragraphsign", defaultWidth = 18.1055.dp, defaultHeight =
                22.1367.dp, viewportWidth = 18.1055f, viewportHeight = 22.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.1289f)
                curveTo(0.0f, 9.6563f, 2.4844f, 11.9883f, 6.2578f, 11.9883f)
                lineTo(8.1563f, 11.9883f)
                lineTo(8.1563f, 21.0586f)
                curveTo(8.1563f, 21.7148f, 8.5664f, 22.1367f, 9.2344f, 22.1367f)
                curveTo(9.8906f, 22.1367f, 10.3242f, 21.7148f, 10.3242f, 21.0586f)
                lineTo(10.3242f, 2.4492f)
                lineTo(12.8672f, 2.4492f)
                lineTo(12.8672f, 21.0586f)
                curveTo(12.8672f, 21.7148f, 13.2773f, 22.1367f, 13.9336f, 22.1367f)
                curveTo(14.6016f, 22.1367f, 15.0352f, 21.7148f, 15.0352f, 21.0586f)
                lineTo(15.0352f, 2.4492f)
                lineTo(17.0156f, 2.4492f)
                curveTo(17.6836f, 2.4492f, 18.1055f, 2.0039f, 18.1055f, 1.3477f)
                curveTo(18.1055f, 0.6914f, 17.6836f, 0.2813f, 17.0156f, 0.2813f)
                lineTo(6.1992f, 0.2813f)
                curveTo(2.4609f, 0.2813f, 0.0f, 2.6016f, 0.0f, 6.1289f)
                close()
            }
        }
        .build()
        return _paragraphsign!!
    }

private var _paragraphsign: ImageVector? = null
