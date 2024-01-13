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

public val CupertinoIcons.Outlined.Homepodmini: ImageVector
    get() {
        if (_homepodmini != null) {
            return _homepodmini!!
        }
        _homepodmini = Builder(name = "Homepodmini", defaultWidth = 23.0742.dp, defaultHeight =
                21.2227.dp, viewportWidth = 23.0742f, viewportHeight = 21.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.543f, 21.2227f)
                curveTo(15.7969f, 21.2227f, 17.5898f, 20.6836f, 19.2891f, 19.1016f)
                curveTo(21.6797f, 16.9219f, 23.0742f, 13.7695f, 23.0742f, 10.418f)
                curveTo(23.0742f, 7.7109f, 22.1719f, 5.1328f, 20.4844f, 3.2461f)
                curveTo(20.0273f, 2.6602f, 19.2539f, 2.5547f, 18.5977f, 2.9648f)
                curveTo(17.1562f, 4.0195f, 15.2227f, 4.7344f, 11.543f, 4.7344f)
                curveTo(7.8516f, 4.7344f, 5.918f, 4.0195f, 4.4883f, 2.9648f)
                curveTo(3.832f, 2.5547f, 3.0469f, 2.6602f, 2.5898f, 3.2461f)
                curveTo(0.9141f, 5.1328f, 0.0f, 7.7109f, 0.0f, 10.418f)
                curveTo(0.0f, 13.7695f, 1.3945f, 16.9219f, 3.7852f, 19.1016f)
                curveTo(5.4844f, 20.6836f, 7.2773f, 21.2227f, 11.543f, 21.2227f)
                close()
                moveTo(11.543f, 19.3359f)
                curveTo(7.8164f, 19.3359f, 6.3984f, 18.9609f, 5.0625f, 17.7188f)
                curveTo(3.0352f, 15.8555f, 1.8867f, 13.2188f, 1.8867f, 10.418f)
                curveTo(1.8867f, 8.1914f, 2.6133f, 6.0586f, 4.1367f, 4.3359f)
                lineTo(3.2813f, 4.5586f)
                curveTo(5.168f, 6.0117f, 8.1563f, 6.6211f, 11.543f, 6.6211f)
                curveTo(14.918f, 6.6211f, 17.9062f, 6.0117f, 19.793f, 4.5586f)
                lineTo(18.9375f, 4.3359f)
                curveTo(20.4609f, 6.0586f, 21.1875f, 8.1914f, 21.1875f, 10.418f)
                curveTo(21.1875f, 13.2188f, 20.0391f, 15.8555f, 18.0117f, 17.7188f)
                curveTo(16.6875f, 18.9609f, 15.2578f, 19.3359f, 11.543f, 19.3359f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.543f, 3.1406f)
                curveTo(14.8008f, 3.1406f, 17.0742f, 2.4844f, 17.0742f, 1.6406f)
                curveTo(17.0742f, 0.7852f, 14.8008f, 0.1523f, 11.543f, 0.1523f)
                curveTo(8.2734f, 0.1523f, 6.0f, 0.7852f, 6.0f, 1.6406f)
                curveTo(6.0f, 2.4844f, 8.2734f, 3.1406f, 11.543f, 3.1406f)
                close()
            }
        }
        .build()
        return _homepodmini!!
    }

private var _homepodmini: ImageVector? = null
