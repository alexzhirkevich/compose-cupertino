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

public val CupertinoIcons.Outlined.KeyIcloud: ImageVector
    get() {
        if (_keyIcloud != null) {
            return _keyIcloud!!
        }
        _keyIcloud = Builder(name = "KeyIcloud", defaultWidth = 29.4609.dp, defaultHeight =
                22.2773.dp, viewportWidth = 29.4609f, viewportHeight = 22.2773f).apply {
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
                moveTo(8.2969f, 11.543f)
                curveTo(8.2969f, 13.4766f, 9.8555f, 15.0234f, 11.7773f, 15.0234f)
                curveTo(13.2773f, 15.0234f, 14.5195f, 14.0859f, 15.1992f, 12.3984f)
                lineTo(16.6758f, 13.8516f)
                curveTo(16.793f, 13.9688f, 16.9688f, 13.9805f, 17.0625f, 13.875f)
                lineTo(18.5273f, 12.3867f)
                lineTo(19.5938f, 13.4648f)
                curveTo(19.6992f, 13.582f, 19.875f, 13.582f, 19.9922f, 13.4648f)
                lineTo(21.7148f, 11.7305f)
                curveTo(21.8203f, 11.625f, 21.8086f, 11.4492f, 21.7148f, 11.3555f)
                lineTo(20.8008f, 10.4414f)
                curveTo(20.6836f, 10.3242f, 20.5781f, 10.2891f, 20.4492f, 10.2891f)
                lineTo(15.0586f, 10.2891f)
                curveTo(14.5312f, 8.918f, 13.2422f, 8.0508f, 11.7773f, 8.0508f)
                curveTo(9.8555f, 8.0508f, 8.2969f, 9.5977f, 8.2969f, 11.543f)
                close()
                moveTo(9.9727f, 11.5312f)
                curveTo(9.9727f, 10.9336f, 10.4531f, 10.4648f, 11.0508f, 10.4648f)
                curveTo(11.6602f, 10.4648f, 12.1289f, 10.9453f, 12.1289f, 11.5312f)
                curveTo(12.1289f, 12.1172f, 11.6602f, 12.5977f, 11.0508f, 12.5977f)
                curveTo(10.4531f, 12.5977f, 9.9727f, 12.1172f, 9.9727f, 11.5312f)
                close()
            }
        }
        .build()
        return _keyIcloud!!
    }

private var _keyIcloud: ImageVector? = null
