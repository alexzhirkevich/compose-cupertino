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

public val CupertinoIcons.Filled.XmarkIcloud: ImageVector
    get() {
        if (_xmarkIcloud != null) {
            return _xmarkIcloud!!
        }
        _xmarkIcloud = Builder(name = "XmarkIcloud", defaultWidth = 29.4609.dp, defaultHeight =
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
                moveTo(12.3164f, 15.3633f)
                curveTo(11.9414f, 15.7266f, 11.4141f, 15.6562f, 11.0625f, 15.3281f)
                curveTo(10.7227f, 15.0117f, 10.6758f, 14.4727f, 11.0391f, 14.0977f)
                lineTo(13.4414f, 11.6719f)
                lineTo(11.0391f, 9.2461f)
                curveTo(10.6758f, 8.8711f, 10.7461f, 8.3555f, 11.0742f, 8.0039f)
                curveTo(11.3906f, 7.6641f, 11.9414f, 7.6172f, 12.3164f, 7.9805f)
                lineTo(14.7305f, 10.3828f)
                lineTo(17.1445f, 7.9805f)
                curveTo(17.5312f, 7.6055f, 18.0586f, 7.6875f, 18.3984f, 8.0039f)
                curveTo(18.75f, 8.332f, 18.7969f, 8.8711f, 18.4336f, 9.2461f)
                lineTo(16.0195f, 11.6719f)
                lineTo(18.4336f, 14.0977f)
                curveTo(18.7969f, 14.4727f, 18.7148f, 14.9883f, 18.3984f, 15.3398f)
                curveTo(18.0703f, 15.6797f, 17.5312f, 15.7266f, 17.1445f, 15.3633f)
                lineTo(14.7305f, 12.9609f)
                close()
            }
        }
        .build()
        return _xmarkIcloud!!
    }

private var _xmarkIcloud: ImageVector? = null
