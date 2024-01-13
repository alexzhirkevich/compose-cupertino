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

public val CupertinoIcons.Outlined.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 25.875.dp, defaultHeight = 20.2148.dp,
                viewportWidth = 25.875f, viewportHeight = 20.2148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 20.2148f)
                lineTo(22.5469f, 20.2148f)
                curveTo(24.6562f, 20.2148f, 25.875f, 18.9961f, 25.875f, 16.582f)
                lineTo(25.875f, 3.6445f)
                curveTo(25.875f, 1.2422f, 24.6445f, 0.0234f, 22.1953f, 0.0234f)
                lineTo(3.3281f, 0.0234f)
                curveTo(1.2188f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6445f)
                lineTo(0.0f, 16.582f)
                curveTo(0.0f, 19.0078f, 1.2305f, 20.2148f, 3.6797f, 20.2148f)
                close()
                moveTo(3.6094f, 18.4219f)
                curveTo(2.4375f, 18.4219f, 1.793f, 17.8008f, 1.793f, 16.582f)
                lineTo(1.793f, 3.6445f)
                curveTo(1.793f, 2.4375f, 2.4375f, 1.8164f, 3.6094f, 1.8164f)
                lineTo(22.2656f, 1.8164f)
                curveTo(23.4141f, 1.8164f, 24.082f, 2.4375f, 24.082f, 3.6563f)
                lineTo(24.082f, 16.5938f)
                curveTo(24.082f, 17.8008f, 23.4141f, 18.4219f, 22.2656f, 18.4219f)
                close()
                moveTo(12.9609f, 13.2422f)
                curveTo(13.7812f, 13.2422f, 14.5781f, 12.9023f, 15.3984f, 12.0938f)
                lineTo(24.9141f, 2.7422f)
                lineTo(23.6953f, 1.5117f)
                lineTo(14.3789f, 10.7109f)
                curveTo(13.875f, 11.2148f, 13.418f, 11.4375f, 12.9609f, 11.4375f)
                curveTo(12.4922f, 11.4375f, 12.0352f, 11.2031f, 11.543f, 10.7109f)
                lineTo(2.1797f, 1.4648f)
                lineTo(0.9492f, 2.6953f)
                lineTo(10.5234f, 12.0938f)
                curveTo(11.3438f, 12.9023f, 12.1289f, 13.2422f, 12.9609f, 13.2422f)
                close()
                moveTo(23.5781f, 18.6797f)
                lineTo(24.7969f, 17.4492f)
                lineTo(17.2148f, 9.9609f)
                lineTo(15.9961f, 11.1797f)
                close()
                moveTo(1.1133f, 17.4609f)
                lineTo(2.332f, 18.6914f)
                lineTo(9.9258f, 11.1797f)
                lineTo(8.6953f, 9.9609f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
