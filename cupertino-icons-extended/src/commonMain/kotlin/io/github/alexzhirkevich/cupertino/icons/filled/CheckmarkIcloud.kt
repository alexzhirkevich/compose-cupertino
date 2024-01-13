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

package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.CheckmarkIcloud: ImageVector
    get() {
        if (_checkmarkIcloud != null) {
            return _checkmarkIcloud!!
        }
        _checkmarkIcloud = Builder(name = "CheckmarkIcloud", defaultWidth = 29.4609.dp,
                defaultHeight = 22.2773.dp, viewportWidth = 29.4609f, viewportHeight =
                22.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.1562f, 20.3672f)
                curveTo(26.6953f, 20.3672f, 29.4609f, 17.7773f, 29.4609f, 14.5547f)
                curveTo(29.4609f, 12.0938f, 28.043f, 9.9609f, 25.7578f, 9.0f)
                curveTo(25.7812f, 3.7734f, 22.0195f, 0.0f, 17.2266f, 0.0f)
                curveTo(14.0508f, 0.0f, 11.7891f, 1.6992f, 10.3828f, 3.75f)
                curveTo(7.5f, 2.9063f, 4.3594f, 5.0977f, 4.3008f, 8.3789f)
                curveTo(1.6523f, 8.8008f, 0.0f, 11.168f, 0.0f, 14.0273f)
                curveTo(0.0f, 17.4727f, 3.0117f, 20.3672f, 7.0195f, 20.3672f)
                close()
                moveTo(13.8984f, 15.7617f)
                curveTo(13.5117f, 15.7617f, 13.1953f, 15.5977f, 12.9141f, 15.2344f)
                lineTo(10.2891f, 11.9297f)
                curveTo(10.1133f, 11.6953f, 10.0195f, 11.4609f, 10.0195f, 11.2148f)
                curveTo(10.0195f, 10.6641f, 10.4414f, 10.2422f, 10.9688f, 10.2422f)
                curveTo(11.3203f, 10.2422f, 11.6133f, 10.4062f, 11.8359f, 10.7109f)
                lineTo(13.8516f, 13.3477f)
                lineTo(17.8594f, 6.6563f)
                curveTo(18.0469f, 6.3281f, 18.3633f, 6.1289f, 18.6914f, 6.1289f)
                curveTo(19.2422f, 6.1289f, 19.6875f, 6.5156f, 19.6875f, 7.0313f)
                curveTo(19.6875f, 7.3008f, 19.5352f, 7.5703f, 19.418f, 7.7578f)
                lineTo(14.8359f, 15.2227f)
                curveTo(14.6133f, 15.5742f, 14.2852f, 15.7617f, 13.8984f, 15.7617f)
                close()
            }
        }
        .build()
        return _checkmarkIcloud!!
    }

private var _checkmarkIcloud: ImageVector? = null
