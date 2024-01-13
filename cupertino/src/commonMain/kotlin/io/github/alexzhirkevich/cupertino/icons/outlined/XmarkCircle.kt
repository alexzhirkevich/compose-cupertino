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

public val CupertinoIcons.Outlined.XmarkCircle: ImageVector
    get() {
        if (_xmarkCircle != null) {
            return _xmarkCircle!!
        }
        _xmarkCircle = Builder(name = "XmarkCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9453f, 16.9102f)
                curveTo(8.2148f, 16.9102f, 8.4492f, 16.8047f, 8.625f, 16.6172f)
                lineTo(11.9414f, 13.2891f)
                lineTo(15.2812f, 16.6172f)
                curveTo(15.457f, 16.793f, 15.6797f, 16.9102f, 15.9492f, 16.9102f)
                curveTo(16.4648f, 16.9102f, 16.8867f, 16.4883f, 16.8867f, 15.9609f)
                curveTo(16.8867f, 15.6914f, 16.793f, 15.4805f, 16.6055f, 15.293f)
                lineTo(13.2773f, 11.9648f)
                lineTo(16.6172f, 8.6133f)
                curveTo(16.8164f, 8.4141f, 16.8984f, 8.2148f, 16.8984f, 7.957f)
                curveTo(16.8984f, 7.4414f, 16.4766f, 7.0195f, 15.9609f, 7.0195f)
                curveTo(15.7148f, 7.0195f, 15.5156f, 7.1133f, 15.3164f, 7.3125f)
                lineTo(11.9414f, 10.6523f)
                lineTo(8.6016f, 7.3242f)
                curveTo(8.4258f, 7.1367f, 8.2148f, 7.043f, 7.9453f, 7.043f)
                curveTo(7.4297f, 7.043f, 7.0078f, 7.4531f, 7.0078f, 7.9688f)
                curveTo(7.0078f, 8.2266f, 7.1133f, 8.4492f, 7.2891f, 8.625f)
                lineTo(10.6172f, 11.9648f)
                lineTo(7.2891f, 15.3047f)
                curveTo(7.1133f, 15.4805f, 7.0078f, 15.7031f, 7.0078f, 15.9609f)
                curveTo(7.0078f, 16.4883f, 7.4297f, 16.9102f, 7.9453f, 16.9102f)
                close()
            }
        }
        .build()
        return _xmarkCircle!!
    }

private var _xmarkCircle: ImageVector? = null
