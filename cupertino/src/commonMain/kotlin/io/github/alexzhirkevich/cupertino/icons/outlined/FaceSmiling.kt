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

public val CupertinoIcons.Outlined.FaceSmiling: ImageVector
    get() {
        if (_faceSmiling != null) {
            return _faceSmiling!!
        }
        _faceSmiling = Builder(name = "FaceSmiling", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(11.9414f, 17.8242f)
                curveTo(14.3906f, 17.8242f, 16.0312f, 16.1953f, 16.0312f, 15.4219f)
                curveTo(16.0312f, 15.1406f, 15.7617f, 15.0117f, 15.5156f, 15.1289f)
                curveTo(14.6602f, 15.5977f, 13.6406f, 16.125f, 11.9414f, 16.125f)
                curveTo(10.2422f, 16.125f, 9.2227f, 15.5859f, 8.3789f, 15.1289f)
                curveTo(8.1211f, 15.0117f, 7.8516f, 15.1406f, 7.8516f, 15.4219f)
                curveTo(7.8516f, 16.1953f, 9.4922f, 17.8242f, 11.9414f, 17.8242f)
                close()
                moveTo(8.4727f, 10.9102f)
                curveTo(9.2109f, 10.9102f, 9.8672f, 10.2422f, 9.8672f, 9.3047f)
                curveTo(9.8672f, 8.3555f, 9.2227f, 7.6875f, 8.4727f, 7.6875f)
                curveTo(7.7344f, 7.6875f, 7.0898f, 8.3555f, 7.0898f, 9.3047f)
                curveTo(7.0898f, 10.2422f, 7.7344f, 10.9102f, 8.4727f, 10.9102f)
                close()
                moveTo(15.4219f, 10.9102f)
                curveTo(16.1602f, 10.9102f, 16.8164f, 10.2422f, 16.8164f, 9.3047f)
                curveTo(16.8164f, 8.3555f, 16.1719f, 7.6875f, 15.4219f, 7.6875f)
                curveTo(14.6836f, 7.6875f, 14.0391f, 8.3555f, 14.0391f, 9.3047f)
                curveTo(14.0391f, 10.2422f, 14.6836f, 10.9102f, 15.4219f, 10.9102f)
                close()
            }
        }
        .build()
        return _faceSmiling!!
    }

private var _faceSmiling: ImageVector? = null
