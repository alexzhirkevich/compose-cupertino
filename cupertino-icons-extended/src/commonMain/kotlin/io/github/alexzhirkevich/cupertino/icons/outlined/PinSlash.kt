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

public val CupertinoIcons.Outlined.PinSlash: ImageVector
    get() {
        if (_pinSlash != null) {
            return _pinSlash!!
        }
        _pinSlash = Builder(name = "PinSlash", defaultWidth = 22.9878.dp, defaultHeight = 28.043.dp,
                viewportWidth = 22.9878f, viewportHeight = 28.043f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8565f, 17.6367f)
                curveTo(2.8565f, 18.6328f, 3.5244f, 19.2891f, 4.5791f, 19.2891f)
                lineTo(10.9189f, 19.2891f)
                lineTo(10.9189f, 24.7617f)
                curveTo(10.9189f, 26.5547f, 11.6689f, 28.043f, 11.9619f, 28.043f)
                curveTo(12.2432f, 28.043f, 12.9932f, 26.5547f, 12.9932f, 24.7617f)
                lineTo(12.9932f, 19.4297f)
                lineTo(13.6611f, 19.4297f)
                lineTo(11.751f, 17.5195f)
                lineTo(5.0479f, 17.5195f)
                curveTo(4.7783f, 17.5195f, 4.6611f, 17.3672f, 4.708f, 17.0508f)
                curveTo(4.8486f, 15.7383f, 5.9502f, 14.3438f, 7.6846f, 13.4531f)
                lineTo(6.4541f, 12.2227f)
                curveTo(4.2393f, 13.5234f, 2.8565f, 15.5742f, 2.8565f, 17.6367f)
                close()
                moveTo(4.3447f, 1.9688f)
                curveTo(4.3447f, 2.3086f, 4.4854f, 2.707f, 4.79f, 3.1055f)
                curveTo(5.3877f, 3.9023f, 6.8057f, 5.0039f, 8.2822f, 5.9766f)
                lineTo(8.1885f, 7.2656f)
                lineTo(9.9228f, 9.0f)
                lineTo(10.1572f, 5.1094f)
                curveTo(10.1689f, 4.9453f, 10.1455f, 4.8867f, 10.0283f, 4.8281f)
                curveTo(8.2705f, 3.9258f, 6.9111f, 2.8594f, 6.8174f, 2.625f)
                curveTo(6.7236f, 2.4727f, 6.8174f, 2.3789f, 6.9463f, 2.3789f)
                lineTo(16.9658f, 2.3789f)
                curveTo(17.0947f, 2.3789f, 17.1885f, 2.4727f, 17.0947f, 2.625f)
                curveTo(17.001f, 2.8594f, 15.6416f, 3.9258f, 13.8838f, 4.8281f)
                curveTo(13.7783f, 4.8867f, 13.7432f, 4.9453f, 13.7666f, 5.1094f)
                lineTo(14.1182f, 10.9219f)
                curveTo(13.4268f, 10.7812f, 12.7119f, 10.7109f, 11.9619f, 10.7109f)
                lineTo(11.6455f, 10.7109f)
                lineTo(13.4619f, 12.5508f)
                curveTo(16.708f, 12.8789f, 19.0869f, 15.5273f, 19.0869f, 17.4023f)
                curveTo(19.0869f, 17.4609f, 19.0869f, 17.5195f, 19.0869f, 17.5781f)
                lineTo(20.3525f, 19.0312f)
                curveTo(20.7393f, 18.7969f, 21.0557f, 18.3164f, 21.0557f, 17.6367f)
                curveTo(21.0557f, 15.1641f, 19.0752f, 12.668f, 16.0166f, 11.4727f)
                lineTo(15.6299f, 5.9766f)
                curveTo(17.1182f, 5.0039f, 18.5244f, 3.9023f, 19.1221f, 3.1055f)
                curveTo(19.4385f, 2.707f, 19.5791f, 2.3086f, 19.5791f, 1.9688f)
                curveTo(19.5791f, 1.2539f, 19.0283f, 0.7266f, 18.208f, 0.7266f)
                lineTo(5.7158f, 0.7266f)
                curveTo(4.8838f, 0.7266f, 4.3447f, 1.2539f, 4.3447f, 1.9688f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2549f, 3.9609f)
                lineTo(21.4424f, 25.125f)
                curveTo(21.8057f, 25.4766f, 22.3799f, 25.4766f, 22.7197f, 25.125f)
                curveTo(23.0713f, 24.7734f, 23.083f, 24.1992f, 22.7197f, 23.8477f)
                lineTo(1.5439f, 2.6836f)
                curveTo(1.1924f, 2.332f, 0.6064f, 2.3203f, 0.2549f, 2.6836f)
                curveTo(-0.085f, 3.0234f, -0.085f, 3.6094f, 0.2549f, 3.9609f)
                close()
            }
        }
        .build()
        return _pinSlash!!
    }

private var _pinSlash: ImageVector? = null
