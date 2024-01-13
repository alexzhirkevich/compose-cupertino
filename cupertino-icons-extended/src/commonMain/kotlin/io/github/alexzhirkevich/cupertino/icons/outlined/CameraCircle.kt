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

public val CupertinoIcons.Outlined.CameraCircle: ImageVector
    get() {
        if (_cameraCircle != null) {
            return _cameraCircle!!
        }
        _cameraCircle = Builder(name = "CameraCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(6.7148f, 17.25f)
                lineTo(17.168f, 17.25f)
                curveTo(18.3984f, 17.25f, 19.0312f, 16.6406f, 19.0312f, 15.4219f)
                lineTo(19.0312f, 9.2227f)
                curveTo(19.0312f, 7.9922f, 18.3984f, 7.3828f, 17.168f, 7.3828f)
                lineTo(15.6562f, 7.3828f)
                curveTo(15.1992f, 7.3828f, 15.0469f, 7.2891f, 14.7773f, 6.9961f)
                lineTo(14.3086f, 6.457f)
                curveTo(14.0156f, 6.1406f, 13.7109f, 5.9648f, 13.1016f, 5.9648f)
                lineTo(10.7344f, 5.9648f)
                curveTo(10.1367f, 5.9648f, 9.832f, 6.1406f, 9.5273f, 6.457f)
                lineTo(9.0469f, 6.9961f)
                curveTo(8.7773f, 7.2773f, 8.6484f, 7.3828f, 8.1797f, 7.3828f)
                lineTo(6.7148f, 7.3828f)
                curveTo(5.4727f, 7.3828f, 4.8516f, 7.9922f, 4.8516f, 9.2227f)
                lineTo(4.8516f, 15.4219f)
                curveTo(4.8516f, 16.6406f, 5.4727f, 17.25f, 6.7148f, 17.25f)
                close()
                moveTo(11.9531f, 15.7734f)
                curveTo(10.0078f, 15.7734f, 8.4375f, 14.2148f, 8.4375f, 12.2578f)
                curveTo(8.4375f, 10.3125f, 10.0078f, 8.7539f, 11.9531f, 8.7539f)
                curveTo(13.8984f, 8.7539f, 15.457f, 10.3125f, 15.457f, 12.2578f)
                curveTo(15.457f, 14.25f, 13.8984f, 15.7734f, 11.9531f, 15.7734f)
                close()
                moveTo(11.9414f, 14.7656f)
                curveTo(13.3242f, 14.7656f, 14.4492f, 13.6523f, 14.4492f, 12.2578f)
                curveTo(14.4492f, 10.875f, 13.3242f, 9.7617f, 11.9414f, 9.7617f)
                curveTo(10.5586f, 9.7617f, 9.4336f, 10.875f, 9.4336f, 12.2578f)
                curveTo(9.4336f, 13.6523f, 10.5586f, 14.7656f, 11.9414f, 14.7656f)
                close()
                moveTo(16.6289f, 10.5703f)
                curveTo(16.1953f, 10.5703f, 15.832f, 10.2305f, 15.832f, 9.7734f)
                curveTo(15.832f, 9.3398f, 16.1953f, 8.9883f, 16.6289f, 8.9883f)
                curveTo(17.0625f, 8.9883f, 17.4141f, 9.3398f, 17.4141f, 9.7734f)
                curveTo(17.4258f, 10.2305f, 17.0625f, 10.5703f, 16.6289f, 10.5703f)
                close()
            }
        }
        .build()
        return _cameraCircle!!
    }

private var _cameraCircle: ImageVector? = null
