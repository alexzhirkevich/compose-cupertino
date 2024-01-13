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

public val CupertinoIcons.Outlined.TrashSlash: ImageVector
    get() {
        if (_trashSlash != null) {
            return _trashSlash!!
        }
        _trashSlash = Builder(name = "TrashSlash", defaultWidth = 22.6861.dp, defaultHeight =
                28.1836.dp, viewportWidth = 22.6861f, viewportHeight = 28.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8369f, 18.375f)
                lineTo(20.4111f, 6.293f)
                lineTo(21.8174f, 6.293f)
                curveTo(22.2979f, 6.293f, 22.6846f, 5.8828f, 22.6846f, 5.4023f)
                curveTo(22.6846f, 4.9219f, 22.2979f, 4.5234f, 21.8174f, 4.5234f)
                lineTo(16.4619f, 4.5234f)
                lineTo(16.4619f, 2.7656f)
                curveTo(16.4619f, 1.0781f, 15.3252f, 0.0f, 13.5205f, 0.0f)
                lineTo(9.1377f, 0.0f)
                curveTo(7.333f, 0.0f, 6.208f, 1.0781f, 6.208f, 2.7656f)
                lineTo(6.208f, 4.2773f)
                lineTo(5.751f, 4.2773f)
                lineTo(7.7666f, 6.293f)
                lineTo(18.5361f, 6.293f)
                lineTo(18.0557f, 16.5938f)
                close()
                moveTo(8.083f, 4.5234f)
                lineTo(8.083f, 2.8828f)
                curveTo(8.083f, 2.2148f, 8.5635f, 1.7461f, 9.2783f, 1.7461f)
                lineTo(13.3916f, 1.7461f)
                curveTo(14.1064f, 1.7461f, 14.5986f, 2.2148f, 14.5986f, 2.8828f)
                lineTo(14.5986f, 4.5234f)
                close()
                moveTo(5.9736f, 26.0977f)
                lineTo(16.7197f, 26.0977f)
                curveTo(17.9736f, 26.0977f, 18.8643f, 25.4883f, 19.2979f, 24.5273f)
                lineTo(19.3096f, 24.2695f)
                lineTo(17.7744f, 22.7344f)
                lineTo(17.7627f, 23.1211f)
                curveTo(17.751f, 23.8008f, 17.2354f, 24.3281f, 16.5322f, 24.3281f)
                lineTo(6.1377f, 24.3281f)
                curveTo(5.4697f, 24.3281f, 4.9658f, 23.8242f, 4.9307f, 23.1328f)
                lineTo(4.251f, 9.1992f)
                lineTo(2.3291f, 7.2773f)
                lineTo(3.0908f, 23.3438f)
                curveTo(3.1728f, 25.0195f, 4.2744f, 26.0977f, 5.9736f, 26.0977f)
                close()
                moveTo(12.1025f, 10.6289f)
                lineTo(12.1025f, 9.1055f)
                curveTo(12.1025f, 8.6953f, 11.7861f, 8.4141f, 11.3408f, 8.4141f)
                curveTo(11.1299f, 8.4141f, 10.9072f, 8.4961f, 10.7666f, 8.6602f)
                lineTo(10.7666f, 9.293f)
                close()
                moveTo(15.7588f, 14.2852f)
                lineTo(15.9111f, 9.1055f)
                curveTo(15.9229f, 8.6953f, 15.6182f, 8.4141f, 15.1729f, 8.4141f)
                curveTo(14.7627f, 8.4141f, 14.458f, 8.6836f, 14.4463f, 9.1055f)
                lineTo(14.3408f, 12.8672f)
                close()
                moveTo(7.8721f, 22.3242f)
                curveTo(8.3174f, 22.3242f, 8.6103f, 22.043f, 8.5986f, 21.6328f)
                lineTo(8.3525f, 13.3242f)
                lineTo(6.8643f, 11.8242f)
                lineTo(7.1338f, 21.6328f)
                curveTo(7.1455f, 22.0547f, 7.4385f, 22.3242f, 7.8721f, 22.3242f)
                close()
                moveTo(11.3408f, 22.3242f)
                curveTo(11.7861f, 22.3242f, 12.1025f, 22.043f, 12.1025f, 21.6328f)
                lineTo(12.1025f, 17.0625f)
                lineTo(10.5908f, 15.5625f)
                lineTo(10.5908f, 21.6328f)
                curveTo(10.5908f, 22.0547f, 10.8955f, 22.3242f, 11.3408f, 22.3242f)
                close()
                moveTo(14.8213f, 22.3242f)
                curveTo(15.2432f, 22.3242f, 15.5361f, 22.0547f, 15.5479f, 21.6328f)
                lineTo(15.583f, 20.5547f)
                lineTo(14.165f, 19.1367f)
                lineTo(14.0947f, 21.6328f)
                curveTo(14.083f, 22.043f, 14.376f, 22.3242f, 14.8213f, 22.3242f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1494f, 24.1758f)
                curveTo(21.501f, 24.5273f, 22.0752f, 24.5273f, 22.4268f, 24.1758f)
                curveTo(22.7666f, 23.8125f, 22.7783f, 23.25f, 22.4268f, 22.8984f)
                lineTo(1.5439f, 2.0039f)
                curveTo(1.1924f, 1.6523f, 0.6064f, 1.6523f, 0.2549f, 2.0039f)
                curveTo(-0.085f, 2.3438f, -0.085f, 2.9414f, 0.2549f, 3.2813f)
                close()
            }
        }
        .build()
        return _trashSlash!!
    }

private var _trashSlash: ImageVector? = null
