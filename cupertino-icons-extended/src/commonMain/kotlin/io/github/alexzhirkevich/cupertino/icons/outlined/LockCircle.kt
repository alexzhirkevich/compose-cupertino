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

public val CupertinoIcons.Outlined.LockCircle: ImageVector
    get() {
        if (_lockCircle != null) {
            return _lockCircle!!
        }
        _lockCircle = Builder(name = "LockCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(7.7109f, 16.5703f)
                curveTo(7.7109f, 17.4492f, 8.0977f, 17.8594f, 8.9063f, 17.8594f)
                lineTo(14.9766f, 17.8594f)
                curveTo(15.7852f, 17.8594f, 16.1719f, 17.4492f, 16.1719f, 16.5703f)
                lineTo(16.1719f, 11.9062f)
                curveTo(16.1719f, 11.0859f, 15.832f, 10.6875f, 15.1406f, 10.6406f)
                lineTo(15.1406f, 9.2461f)
                curveTo(15.1406f, 7.0898f, 13.8516f, 5.6484f, 11.9414f, 5.6484f)
                curveTo(10.0312f, 5.6484f, 8.7422f, 7.0898f, 8.7422f, 9.2461f)
                lineTo(8.7422f, 10.6406f)
                curveTo(8.0508f, 10.6875f, 7.7109f, 11.0859f, 7.7109f, 11.9062f)
                close()
                moveTo(9.9609f, 10.6289f)
                lineTo(9.9609f, 9.1172f)
                curveTo(9.9609f, 7.7461f, 10.7578f, 6.832f, 11.9414f, 6.832f)
                curveTo(13.125f, 6.832f, 13.9219f, 7.7461f, 13.9219f, 9.1172f)
                lineTo(13.9219f, 10.6289f)
                close()
            }
        }
        .build()
        return _lockCircle!!
    }

private var _lockCircle: ImageVector? = null
