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

public val CupertinoIcons.Outlined.ChevronLeftForwardslashChevronRight: ImageVector
    get() {
        if (_chevronLeftForwardslashChevronRight != null) {
            return _chevronLeftForwardslashChevronRight!!
        }
        _chevronLeftForwardslashChevronRight = Builder(name = "ChevronLeftForwardslashChevronRight",
                defaultWidth = 32.8477.dp, defaultHeight = 22.1954.dp, viewportWidth = 32.8477f,
                viewportHeight = 22.1954f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.0919f)
                curveTo(0.0f, 11.42f, 0.1406f, 11.7364f, 0.4102f, 11.9708f)
                lineTo(8.2383f, 19.0372f)
                curveTo(8.7305f, 19.4825f, 9.3867f, 19.4825f, 9.7969f, 19.0255f)
                curveTo(10.207f, 18.5567f, 10.1367f, 17.9005f, 9.668f, 17.4786f)
                lineTo(2.625f, 11.0919f)
                lineTo(9.668f, 4.7051f)
                curveTo(10.1367f, 4.2833f, 10.207f, 3.6153f, 9.7969f, 3.1583f)
                curveTo(9.3867f, 2.7012f, 8.7305f, 2.7012f, 8.2383f, 3.1465f)
                lineTo(0.4102f, 10.2012f)
                curveTo(0.1406f, 10.4473f, 0.0f, 10.7637f, 0.0f, 11.0919f)
                close()
                moveTo(13.2188f, 22.1544f)
                curveTo(13.8398f, 22.3184f, 14.4023f, 21.9786f, 14.5898f, 21.3575f)
                lineTo(20.4258f, 1.3536f)
                curveTo(20.5898f, 0.7911f, 20.3203f, 0.2286f, 19.6992f, 0.0645f)
                curveTo(19.0898f, -0.0995f, 18.5625f, 0.1348f, 18.3516f, 0.8614f)
                lineTo(12.5508f, 20.7598f)
                curveTo(12.3633f, 21.3926f, 12.5625f, 21.9786f, 13.2188f, 22.1544f)
                close()
                moveTo(32.8477f, 11.0919f)
                curveTo(32.8477f, 10.7637f, 32.7188f, 10.4473f, 32.4492f, 10.2012f)
                lineTo(24.6211f, 3.1465f)
                curveTo(24.1172f, 2.7012f, 23.4727f, 2.7012f, 23.0625f, 3.1583f)
                curveTo(22.6523f, 3.6153f, 22.7109f, 4.2833f, 23.1797f, 4.7051f)
                lineTo(30.2344f, 11.0919f)
                lineTo(23.1797f, 17.4786f)
                curveTo(22.7109f, 17.9005f, 22.6523f, 18.5567f, 23.0625f, 19.0255f)
                curveTo(23.4727f, 19.4825f, 24.1172f, 19.4825f, 24.6211f, 19.0372f)
                lineTo(32.4492f, 11.9708f)
                curveTo(32.7188f, 11.7364f, 32.8477f, 11.42f, 32.8477f, 11.0919f)
                close()
            }
        }
        .build()
        return _chevronLeftForwardslashChevronRight!!
    }

private var _chevronLeftForwardslashChevronRight: ImageVector? = null
