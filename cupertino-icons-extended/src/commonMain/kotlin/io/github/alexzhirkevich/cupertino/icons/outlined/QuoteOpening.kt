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

public val CupertinoIcons.Outlined.QuoteOpening: ImageVector
    get() {
        if (_quoteOpening != null) {
            return _quoteOpening!!
        }
        _quoteOpening = Builder(name = "QuoteOpening", defaultWidth = 25.793.dp, defaultHeight =
                16.2539.dp, viewportWidth = 25.793f, viewportHeight = 16.2539f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7188f, 10.6172f)
                curveTo(11.7188f, 7.5f, 9.4102f, 5.0156f, 6.4336f, 5.0156f)
                curveTo(5.0391f, 5.0156f, 3.7148f, 5.5664f, 2.7422f, 6.6445f)
                lineTo(2.4258f, 6.6445f)
                curveTo(3.1055f, 4.4297f, 5.168f, 2.5781f, 7.7344f, 1.8164f)
                curveTo(8.0977f, 1.6992f, 8.3672f, 1.5938f, 8.5313f, 1.4531f)
                curveTo(8.7188f, 1.3008f, 8.8242f, 1.1133f, 8.8242f, 0.8438f)
                curveTo(8.8242f, 0.3516f, 8.4492f, 0.0117f, 7.8984f, 0.0117f)
                curveTo(7.5352f, 0.0117f, 7.2539f, 0.082f, 6.75f, 0.2461f)
                curveTo(5.1328f, 0.7734f, 3.6797f, 1.6992f, 2.5547f, 2.8828f)
                curveTo(0.9727f, 4.5234f, 0.0f, 6.7148f, 0.0f, 9.3164f)
                curveTo(0.0f, 13.7109f, 2.7891f, 16.2539f, 6.0586f, 16.2539f)
                curveTo(9.2813f, 16.2539f, 11.7188f, 13.793f, 11.7188f, 10.6172f)
                close()
                moveTo(25.793f, 10.6172f)
                curveTo(25.793f, 7.5f, 23.4727f, 5.0156f, 20.5078f, 5.0156f)
                curveTo(19.1133f, 5.0156f, 17.7773f, 5.5664f, 16.8164f, 6.6445f)
                lineTo(16.5f, 6.6445f)
                curveTo(17.1797f, 4.4297f, 19.2422f, 2.5781f, 21.7969f, 1.8164f)
                curveTo(22.1602f, 1.6992f, 22.4414f, 1.5938f, 22.6055f, 1.4531f)
                curveTo(22.793f, 1.3008f, 22.8867f, 1.1133f, 22.8867f, 0.8438f)
                curveTo(22.8867f, 0.3516f, 22.5234f, 0.0117f, 21.9727f, 0.0117f)
                curveTo(21.5977f, 0.0117f, 21.3281f, 0.082f, 20.8125f, 0.2461f)
                curveTo(19.207f, 0.7734f, 17.7422f, 1.6992f, 16.6172f, 2.8828f)
                curveTo(15.0469f, 4.5234f, 14.0742f, 6.7148f, 14.0742f, 9.3164f)
                curveTo(14.0742f, 13.7109f, 16.8633f, 16.2539f, 20.1328f, 16.2539f)
                curveTo(23.3555f, 16.2539f, 25.793f, 13.793f, 25.793f, 10.6172f)
                close()
            }
        }
        .build()
        return _quoteOpening!!
    }

private var _quoteOpening: ImageVector? = null
