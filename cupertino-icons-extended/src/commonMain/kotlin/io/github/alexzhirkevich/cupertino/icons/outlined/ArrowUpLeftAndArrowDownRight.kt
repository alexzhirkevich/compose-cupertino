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

public val CupertinoIcons.Outlined.ArrowUpLeftAndArrowDownRight: ImageVector
    get() {
        if (_arrowUpLeftAndArrowDownRight != null) {
            return _arrowUpLeftAndArrowDownRight!!
        }
        _arrowUpLeftAndArrowDownRight = Builder(name = "ArrowUpLeftAndArrowDownRight", defaultWidth
                = 22.3359.dp, defaultHeight = 22.3711.dp, viewportWidth = 22.3359f, viewportHeight =
                22.3711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0781f, 9.4805f)
                curveTo(1.6992f, 9.4805f, 2.1445f, 9.0117f, 2.1445f, 8.3906f)
                lineTo(2.1445f, 7.4063f)
                lineTo(1.9102f, 3.3164f)
                lineTo(4.9922f, 6.5625f)
                lineTo(8.6016f, 10.1953f)
                curveTo(8.8008f, 10.4062f, 9.0586f, 10.5f, 9.3398f, 10.5f)
                curveTo(10.0078f, 10.5f, 10.5f, 10.0664f, 10.5f, 9.4102f)
                curveTo(10.5f, 9.0938f, 10.3945f, 8.8125f, 10.1836f, 8.6016f)
                lineTo(6.5625f, 4.9922f)
                lineTo(3.3164f, 1.9102f)
                lineTo(7.418f, 2.1445f)
                lineTo(8.3906f, 2.1445f)
                curveTo(9.0117f, 2.1445f, 9.4922f, 1.7109f, 9.4922f, 1.0781f)
                curveTo(9.4922f, 0.4453f, 9.0234f, 0.0f, 8.3906f, 0.0f)
                lineTo(1.8867f, 0.0f)
                curveTo(0.6914f, 0.0f, 0.0f, 0.6914f, 0.0f, 1.8867f)
                lineTo(0.0f, 8.3906f)
                curveTo(0.0f, 9.0f, 0.457f, 9.4805f, 1.0781f, 9.4805f)
                close()
                moveTo(13.9336f, 22.3594f)
                lineTo(20.4375f, 22.3594f)
                curveTo(21.6328f, 22.3594f, 22.3359f, 21.668f, 22.3359f, 20.4727f)
                lineTo(22.3359f, 13.9688f)
                curveTo(22.3359f, 13.3594f, 21.8789f, 12.8789f, 21.2461f, 12.8789f)
                curveTo(20.6367f, 12.8789f, 20.1797f, 13.3477f, 20.1797f, 13.9688f)
                lineTo(20.1797f, 14.9531f)
                lineTo(20.4258f, 19.043f)
                lineTo(17.332f, 15.7969f)
                lineTo(13.7344f, 12.1641f)
                curveTo(13.5352f, 11.9531f, 13.2656f, 11.8594f, 12.9844f, 11.8594f)
                curveTo(12.3281f, 11.8594f, 11.8242f, 12.293f, 11.8242f, 12.9492f)
                curveTo(11.8242f, 13.2656f, 11.9414f, 13.5469f, 12.1523f, 13.7578f)
                lineTo(15.7617f, 17.3672f)
                lineTo(19.0195f, 20.4492f)
                lineTo(14.918f, 20.2148f)
                lineTo(13.9336f, 20.2148f)
                curveTo(13.3125f, 20.2148f, 12.832f, 20.6484f, 12.832f, 21.2812f)
                curveTo(12.832f, 21.9141f, 13.3125f, 22.3594f, 13.9336f, 22.3594f)
                close()
            }
        }
        .build()
        return _arrowUpLeftAndArrowDownRight!!
    }

private var _arrowUpLeftAndArrowDownRight: ImageVector? = null
