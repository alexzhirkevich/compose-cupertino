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

public val CupertinoIcons.Filled.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 30.0586.dp, defaultHeight = 24.4102.dp,
                viewportWidth = 30.0586f, viewportHeight = 24.4102f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0156f, 18.75f)
                lineTo(5.3672f, 20.1562f)
                curveTo(5.8125f, 21.9844f, 6.7852f, 22.9219f, 8.7188f, 22.9219f)
                lineTo(21.3398f, 22.9219f)
                curveTo(23.2852f, 22.9219f, 24.2461f, 22.0078f, 24.7031f, 20.1562f)
                lineTo(25.0547f, 18.75f)
                close()
                moveTo(4.6289f, 17.1445f)
                lineTo(25.4531f, 17.1445f)
                lineTo(27.6562f, 8.1211f)
                lineTo(26.6953f, 7.5703f)
                lineTo(21.293f, 11.5078f)
                curveTo(20.8945f, 11.7891f, 20.625f, 11.6836f, 20.4023f, 11.3672f)
                lineTo(15.3164f, 3.6797f)
                lineTo(14.7539f, 3.6563f)
                lineTo(9.6211f, 11.4023f)
                curveTo(9.4219f, 11.707f, 9.1875f, 11.8008f, 8.7891f, 11.5195f)
                lineTo(3.4922f, 7.6523f)
                lineTo(2.3672f, 7.9453f)
                close()
                moveTo(2.8008f, 10.4648f)
                curveTo(4.3477f, 10.4648f, 5.5898f, 9.2109f, 5.5898f, 7.6523f)
                curveTo(5.5898f, 6.1289f, 4.3477f, 4.8633f, 2.8008f, 4.8633f)
                curveTo(1.2539f, 4.8633f, 0.0f, 6.1172f, 0.0f, 7.6523f)
                curveTo(0.0f, 9.2109f, 1.2656f, 10.4648f, 2.8008f, 10.4648f)
                close()
                moveTo(15.0352f, 5.5898f)
                curveTo(16.5703f, 5.5898f, 17.8242f, 4.3359f, 17.8242f, 2.7891f)
                curveTo(17.8242f, 1.2656f, 16.5703f, 0.0f, 15.0352f, 0.0f)
                curveTo(13.4766f, 0.0f, 12.2344f, 1.2539f, 12.2344f, 2.7891f)
                curveTo(12.2344f, 4.3359f, 13.4883f, 5.5898f, 15.0352f, 5.5898f)
                close()
                moveTo(27.2578f, 10.4648f)
                curveTo(28.793f, 10.4648f, 30.0586f, 9.2109f, 30.0586f, 7.6523f)
                curveTo(30.0586f, 6.1172f, 28.8047f, 4.8633f, 27.2578f, 4.8633f)
                curveTo(25.7227f, 4.8633f, 24.4688f, 6.1289f, 24.4688f, 7.6523f)
                curveTo(24.4688f, 9.2109f, 25.7227f, 10.4648f, 27.2578f, 10.4648f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
