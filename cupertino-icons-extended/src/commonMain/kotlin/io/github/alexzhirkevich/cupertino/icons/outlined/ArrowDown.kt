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

public val CupertinoIcons.Outlined.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 17.7656.dp, defaultHeight =
                22.1367.dp, viewportWidth = 17.7656f, viewportHeight = 22.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8828f, 0.0f)
                curveTo(8.2734f, 0.0f, 7.8398f, 0.4219f, 7.8398f, 1.0313f)
                lineTo(7.8398f, 16.4648f)
                lineTo(7.957f, 19.957f)
                lineTo(8.6133f, 19.7227f)
                lineTo(4.418f, 15.1172f)
                lineTo(1.7461f, 12.4922f)
                curveTo(1.5703f, 12.3047f, 1.2891f, 12.2109f, 1.0078f, 12.2109f)
                curveTo(0.4219f, 12.2109f, 0.0f, 12.6562f, 0.0f, 13.2305f)
                curveTo(0.0f, 13.5117f, 0.1055f, 13.7578f, 0.3281f, 13.9922f)
                lineTo(8.0977f, 21.7852f)
                curveTo(8.3203f, 22.0195f, 8.5898f, 22.1367f, 8.8828f, 22.1367f)
                curveTo(9.1758f, 22.1367f, 9.4453f, 22.0195f, 9.668f, 21.7852f)
                lineTo(17.4492f, 13.9922f)
                curveTo(17.6719f, 13.7578f, 17.7656f, 13.5117f, 17.7656f, 13.2305f)
                curveTo(17.7656f, 12.6562f, 17.3438f, 12.2109f, 16.7578f, 12.2109f)
                curveTo(16.4766f, 12.2109f, 16.207f, 12.3047f, 16.0195f, 12.4922f)
                lineTo(13.3477f, 15.1172f)
                lineTo(9.1406f, 19.7227f)
                lineTo(9.8086f, 19.957f)
                lineTo(9.9258f, 16.4648f)
                lineTo(9.9258f, 1.0313f)
                curveTo(9.9258f, 0.4219f, 9.4922f, 0.0f, 8.8828f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
