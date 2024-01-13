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

public val CupertinoIcons.Outlined.ArrowTriangleBranch: ImageVector
    get() {
        if (_arrowTriangleBranch != null) {
            return _arrowTriangleBranch!!
        }
        _arrowTriangleBranch = Builder(name = "ArrowTriangleBranch", defaultWidth = 21.5985.dp,
                defaultHeight = 22.2773.dp, viewportWidth = 21.5985f, viewportHeight =
                22.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8017f, 22.2773f)
                curveTo(11.4579f, 22.2773f, 11.8212f, 21.8438f, 11.8212f, 21.0352f)
                lineTo(11.8212f, 14.3086f)
                curveTo(11.8212f, 11.4961f, 14.9384f, 7.418f, 17.8212f, 5.5781f)
                lineTo(18.7587f, 4.9688f)
                curveTo(19.0868f, 4.7695f, 19.2626f, 4.4063f, 19.2626f, 4.0547f)
                curveTo(19.2626f, 3.4805f, 18.8642f, 3.082f, 18.2665f, 3.082f)
                curveTo(17.9736f, 3.082f, 17.6572f, 3.1875f, 17.3759f, 3.375f)
                lineTo(16.7548f, 3.7852f)
                curveTo(13.9072f, 5.6836f, 11.1767f, 9.2813f, 10.8134f, 11.0977f)
                lineTo(10.7783f, 11.0977f)
                curveTo(10.415f, 9.2695f, 7.6962f, 5.6836f, 4.8486f, 3.7852f)
                lineTo(4.2275f, 3.375f)
                curveTo(3.9345f, 3.1875f, 3.6298f, 3.082f, 3.3251f, 3.082f)
                curveTo(2.7275f, 3.082f, 2.3407f, 3.5156f, 2.3407f, 4.043f)
                curveTo(2.3407f, 4.3945f, 2.5165f, 4.7695f, 2.8447f, 4.9688f)
                lineTo(3.7822f, 5.5781f)
                curveTo(6.6533f, 7.418f, 9.7822f, 11.4961f, 9.7822f, 14.3086f)
                lineTo(9.7822f, 21.0352f)
                curveTo(9.7822f, 21.8438f, 10.1454f, 22.2773f, 10.8017f, 22.2773f)
                close()
                moveTo(2.7392f, 7.0078f)
                lineTo(6.0204f, 2.7539f)
                curveTo(6.5244f, 2.0977f, 6.2079f, 1.5703f, 5.4228f, 1.5352f)
                lineTo(0.8642f, 1.3359f)
                curveTo(0.2079f, 1.3008f, -0.1436f, 1.7344f, 0.0556f, 2.3789f)
                lineTo(1.4032f, 6.7266f)
                curveTo(1.6376f, 7.5f, 2.2236f, 7.6758f, 2.7392f, 7.0078f)
                close()
                moveTo(18.7236f, 6.9961f)
                curveTo(19.2158f, 7.6758f, 19.8134f, 7.5234f, 20.0595f, 6.7617f)
                lineTo(21.5361f, 2.4492f)
                curveTo(21.747f, 1.8164f, 21.4072f, 1.3711f, 20.7626f, 1.3828f)
                lineTo(16.1923f, 1.4531f)
                curveTo(15.4072f, 1.4648f, 15.079f, 1.9805f, 15.5595f, 2.6484f)
                close()
            }
        }
        .build()
        return _arrowTriangleBranch!!
    }

private var _arrowTriangleBranch: ImageVector? = null
