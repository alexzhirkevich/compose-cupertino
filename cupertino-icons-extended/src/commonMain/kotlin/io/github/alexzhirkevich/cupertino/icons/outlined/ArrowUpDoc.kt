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

public val CupertinoIcons.Outlined.ArrowUpDoc: ImageVector
    get() {
        if (_arrowUpDoc != null) {
            return _arrowUpDoc!!
        }
        _arrowUpDoc = Builder(name = "ArrowUpDoc", defaultWidth = 19.7109.dp, defaultHeight =
                25.1367.dp, viewportWidth = 19.7109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6328f, 25.125f)
                lineTo(16.0781f, 25.125f)
                curveTo(18.5039f, 25.125f, 19.7109f, 23.8945f, 19.7109f, 21.457f)
                lineTo(19.7109f, 10.8164f)
                curveTo(19.7109f, 9.3047f, 19.5352f, 8.6484f, 18.5977f, 7.6875f)
                lineTo(12.1406f, 1.1133f)
                curveTo(11.25f, 0.1992f, 10.5117f, 0.0f, 9.1992f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.2188f, 0.0f, 0.0f, 1.2422f, 0.0f, 3.6797f)
                lineTo(0.0f, 21.457f)
                curveTo(0.0f, 23.9062f, 1.207f, 25.125f, 3.6328f, 25.125f)
                close()
                moveTo(3.7148f, 23.2383f)
                curveTo(2.5078f, 23.2383f, 1.8867f, 22.5938f, 1.8867f, 21.4219f)
                lineTo(1.8867f, 3.7148f)
                curveTo(1.8867f, 2.5547f, 2.5078f, 1.8867f, 3.7266f, 1.8867f)
                lineTo(8.9414f, 1.8867f)
                lineTo(8.9414f, 8.6953f)
                curveTo(8.9414f, 10.1719f, 9.6797f, 10.8984f, 11.1445f, 10.8984f)
                lineTo(17.8242f, 10.8984f)
                lineTo(17.8242f, 21.4219f)
                curveTo(17.8242f, 22.5938f, 17.2031f, 23.2383f, 15.9844f, 23.2383f)
                close()
                moveTo(11.3555f, 9.1289f)
                curveTo(10.8867f, 9.1289f, 10.7109f, 8.9414f, 10.7109f, 8.4727f)
                lineTo(10.7109f, 2.25f)
                lineTo(17.4609f, 9.1289f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7461f, 20.8828f)
                lineTo(10.7461f, 16.6289f)
                lineTo(10.6758f, 14.7188f)
                lineTo(11.6719f, 15.75f)
                lineTo(12.7266f, 16.8281f)
                curveTo(12.8906f, 17.0039f, 13.125f, 17.0977f, 13.3594f, 17.0977f)
                curveTo(13.8281f, 17.0977f, 14.1797f, 16.7578f, 14.1797f, 16.2891f)
                curveTo(14.1797f, 16.0195f, 14.0742f, 15.8203f, 13.8867f, 15.6562f)
                lineTo(10.5117f, 12.5508f)
                curveTo(10.2656f, 12.3281f, 10.0781f, 12.2461f, 9.8555f, 12.2461f)
                curveTo(9.6328f, 12.2461f, 9.4453f, 12.3281f, 9.1992f, 12.5508f)
                lineTo(5.8242f, 15.6562f)
                curveTo(5.6367f, 15.8203f, 5.5313f, 16.0195f, 5.5313f, 16.2891f)
                curveTo(5.5313f, 16.7578f, 5.8711f, 17.0977f, 6.3516f, 17.0977f)
                curveTo(6.5742f, 17.0977f, 6.8203f, 17.0039f, 6.9844f, 16.8281f)
                lineTo(8.0391f, 15.75f)
                lineTo(9.0352f, 14.7188f)
                lineTo(8.9648f, 16.6289f)
                lineTo(8.9648f, 20.8828f)
                curveTo(8.9648f, 21.3633f, 9.375f, 21.75f, 9.8555f, 21.75f)
                curveTo(10.3359f, 21.75f, 10.7461f, 21.3633f, 10.7461f, 20.8828f)
                close()
            }
        }
        .build()
        return _arrowUpDoc!!
    }

private var _arrowUpDoc: ImageVector? = null
