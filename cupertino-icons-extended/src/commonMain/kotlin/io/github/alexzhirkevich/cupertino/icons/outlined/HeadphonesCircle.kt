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

public val CupertinoIcons.Outlined.HeadphonesCircle: ImageVector
    get() {
        if (_headphonesCircle != null) {
            return _headphonesCircle!!
        }
        _headphonesCircle = Builder(name = "HeadphonesCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
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
                moveTo(5.6133f, 11.9297f)
                curveTo(5.6133f, 14.1328f, 6.1406f, 15.832f, 7.043f, 17.3906f)
                curveTo(7.2773f, 17.7773f, 7.7227f, 17.8945f, 8.1328f, 17.6719f)
                curveTo(8.5078f, 17.4727f, 8.625f, 17.0039f, 8.4141f, 16.582f)
                curveTo(7.6406f, 15.1641f, 7.1953f, 13.8398f, 7.1953f, 11.9297f)
                curveTo(7.1953f, 8.7891f, 9.0938f, 6.7148f, 11.9531f, 6.7148f)
                curveTo(14.8242f, 6.7148f, 16.7461f, 8.8008f, 16.7461f, 11.9297f)
                curveTo(16.7461f, 13.8281f, 16.3008f, 15.1758f, 15.5039f, 16.582f)
                curveTo(15.2812f, 16.9922f, 15.4102f, 17.4609f, 15.7852f, 17.6719f)
                curveTo(16.1836f, 17.8945f, 16.6406f, 17.7773f, 16.875f, 17.3906f)
                curveTo(17.7891f, 15.7852f, 18.3281f, 14.0977f, 18.3281f, 11.9297f)
                curveTo(18.3281f, 7.8633f, 15.7617f, 5.1328f, 11.9531f, 5.1328f)
                curveTo(8.1563f, 5.1328f, 5.6133f, 7.8516f, 5.6133f, 11.9297f)
                close()
                moveTo(7.6875f, 17.1328f)
                curveTo(7.9102f, 17.9062f, 8.6016f, 18.293f, 9.3633f, 18.0469f)
                curveTo(10.1484f, 17.8359f, 10.5234f, 17.1562f, 10.2891f, 16.3828f)
                lineTo(9.4453f, 13.4883f)
                curveTo(9.2109f, 12.7031f, 8.543f, 12.3281f, 7.7695f, 12.5625f)
                curveTo(6.9961f, 12.7734f, 6.6094f, 13.4531f, 6.8438f, 14.2148f)
                close()
                moveTo(16.2188f, 17.1328f)
                lineTo(17.0625f, 14.2148f)
                curveTo(17.2969f, 13.4414f, 16.9219f, 12.7734f, 16.1367f, 12.5625f)
                curveTo(15.375f, 12.3281f, 14.707f, 12.7031f, 14.4727f, 13.4883f)
                lineTo(13.6172f, 16.3945f)
                curveTo(13.3945f, 17.1797f, 13.7578f, 17.8359f, 14.543f, 18.0469f)
                curveTo(15.3164f, 18.2812f, 15.9961f, 17.9062f, 16.2188f, 17.1328f)
                close()
            }
        }
        .build()
        return _headphonesCircle!!
    }

private var _headphonesCircle: ImageVector? = null
