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

public val CupertinoIcons.Outlined.ExclamationmarkIcloud: ImageVector
    get() {
        if (_exclamationmarkIcloud != null) {
            return _exclamationmarkIcloud!!
        }
        _exclamationmarkIcloud = Builder(name = "ExclamationmarkIcloud", defaultWidth = 29.4609.dp,
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
                moveTo(23.1562f, 18.4805f)
                lineTo(7.0195f, 18.4805f)
                curveTo(4.0664f, 18.4805f, 1.8867f, 16.418f, 1.8867f, 14.0273f)
                curveTo(1.8867f, 11.6836f, 3.3047f, 9.8203f, 5.7891f, 9.8203f)
                curveTo(5.9531f, 9.8203f, 6.0117f, 9.7383f, 6.0117f, 9.5859f)
                curveTo(6.0117f, 5.9766f, 8.6133f, 4.9102f, 11.0156f, 5.6953f)
                curveTo(11.1562f, 5.7422f, 11.2383f, 5.707f, 11.3086f, 5.5781f)
                curveTo(12.4453f, 3.5508f, 14.1914f, 1.8867f, 17.2266f, 1.8867f)
                curveTo(21.0703f, 1.8867f, 23.7305f, 4.9336f, 23.9297f, 8.4141f)
                curveTo(23.9648f, 8.9531f, 23.9297f, 9.5859f, 23.8828f, 10.1367f)
                curveTo(23.8711f, 10.2891f, 23.9297f, 10.3711f, 24.0703f, 10.4062f)
                curveTo(26.2031f, 10.875f, 27.5742f, 12.4336f, 27.5742f, 14.5547f)
                curveTo(27.5742f, 16.7344f, 25.6523f, 18.4805f, 23.1562f, 18.4805f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7422f, 12.3984f)
                curveTo(15.3047f, 12.3984f, 15.6211f, 12.0703f, 15.6445f, 11.4609f)
                lineTo(15.8086f, 7.1602f)
                curveTo(15.832f, 6.5156f, 15.3516f, 6.0703f, 14.7305f, 6.0703f)
                curveTo(14.0977f, 6.0703f, 13.6406f, 6.5039f, 13.6641f, 7.1484f)
                lineTo(13.8281f, 11.4609f)
                curveTo(13.8516f, 12.0586f, 14.1562f, 12.3984f, 14.7422f, 12.3984f)
                close()
                moveTo(14.7305f, 16.1367f)
                curveTo(15.4102f, 16.1367f, 15.9961f, 15.5977f, 15.9961f, 14.918f)
                curveTo(15.9961f, 14.2383f, 15.4219f, 13.6992f, 14.7305f, 13.6992f)
                curveTo(14.0391f, 13.6992f, 13.4648f, 14.25f, 13.4648f, 14.918f)
                curveTo(13.4648f, 15.5859f, 14.0508f, 16.1367f, 14.7305f, 16.1367f)
                close()
            }
        }
        .build()
        return _exclamationmarkIcloud!!
    }

private var _exclamationmarkIcloud: ImageVector? = null
