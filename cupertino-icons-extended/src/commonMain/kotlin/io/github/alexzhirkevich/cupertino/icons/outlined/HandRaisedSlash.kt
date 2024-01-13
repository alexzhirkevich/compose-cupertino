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

public val CupertinoIcons.Outlined.HandRaisedSlash: ImageVector
    get() {
        if (_handRaisedSlash != null) {
            return _handRaisedSlash!!
        }
        _handRaisedSlash = Builder(name = "HandRaisedSlash", defaultWidth = 23.3408.dp,
                defaultHeight = 26.8711.dp, viewportWidth = 23.3408f, viewportHeight =
                26.8711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4893f, 25.5117f)
                curveTo(14.4229f, 25.5117f, 16.1104f, 25.0078f, 17.4814f, 24.0117f)
                lineTo(16.3213f, 22.8633f)
                curveTo(15.1963f, 23.5547f, 13.8955f, 23.8828f, 12.4307f, 23.8828f)
                curveTo(8.2822f, 23.8828f, 5.751f, 21.2227f, 5.751f, 16.5117f)
                lineTo(5.751f, 12.3164f)
                lineTo(4.2041f, 10.7695f)
                lineTo(4.2041f, 16.6992f)
                curveTo(4.2041f, 22.1836f, 7.5322f, 25.5117f, 12.4893f, 25.5117f)
                close()
                moveTo(19.2275f, 19.3594f)
                lineTo(20.376f, 20.5078f)
                curveTo(20.6221f, 20.0039f, 20.8682f, 19.4648f, 21.0674f, 18.8789f)
                lineTo(23.1299f, 13.0781f)
                curveTo(23.2705f, 12.6914f, 23.3408f, 12.3164f, 23.3408f, 11.9531f)
                curveTo(23.3291f, 10.793f, 22.5088f, 9.8438f, 21.1494f, 9.8438f)
                curveTo(20.376f, 9.8438f, 19.6729f, 10.3242f, 19.2744f, 11.25f)
                lineTo(18.5127f, 13.1133f)
                curveTo(18.4893f, 13.1719f, 18.4541f, 13.1953f, 18.4072f, 13.1953f)
                curveTo(18.3486f, 13.1953f, 18.3252f, 13.1602f, 18.3252f, 13.0898f)
                lineTo(18.3252f, 3.6914f)
                curveTo(18.3252f, 2.332f, 17.4697f, 1.4648f, 16.1572f, 1.4648f)
                curveTo(15.6768f, 1.4648f, 15.2432f, 1.6289f, 14.915f, 1.9453f)
                curveTo(14.7627f, 0.7383f, 13.9893f, 0.0f, 12.8291f, 0.0f)
                curveTo(11.6924f, 0.0f, 10.8955f, 0.7617f, 10.7197f, 1.9219f)
                curveTo(10.4268f, 1.6172f, 10.0049f, 1.4648f, 9.583f, 1.4648f)
                curveTo(8.3643f, 1.4648f, 7.5557f, 2.3203f, 7.5557f, 3.6094f)
                lineTo(7.5557f, 4.9219f)
                curveTo(7.2393f, 4.582f, 6.7588f, 4.4063f, 6.2666f, 4.4063f)
                curveTo(5.6924f, 4.4063f, 5.2119f, 4.6523f, 4.9307f, 5.0625f)
                lineTo(6.1963f, 6.3281f)
                lineTo(6.1963f, 6.2461f)
                curveTo(6.2315f, 6.0586f, 6.3486f, 5.9414f, 6.5596f, 5.9414f)
                curveTo(7.04f, 5.9414f, 7.3916f, 6.293f, 7.3916f, 6.7969f)
                lineTo(7.3916f, 7.5234f)
                lineTo(8.8799f, 9.0234f)
                lineTo(8.8799f, 3.8203f)
                curveTo(8.8799f, 3.3281f, 9.1963f, 2.9766f, 9.6768f, 2.9766f)
                curveTo(10.1689f, 2.9766f, 10.5088f, 3.3281f, 10.5088f, 3.8203f)
                lineTo(10.5088f, 10.6406f)
                lineTo(11.9971f, 12.1289f)
                lineTo(11.9971f, 2.3789f)
                curveTo(11.9971f, 1.875f, 12.3369f, 1.5117f, 12.8291f, 1.5117f)
                curveTo(13.2979f, 1.5117f, 13.6377f, 1.875f, 13.6377f, 2.3789f)
                lineTo(13.6377f, 12.1875f)
                curveTo(13.6377f, 12.5977f, 13.9658f, 12.9023f, 14.376f, 12.9023f)
                curveTo(14.7744f, 12.9023f, 15.126f, 12.5977f, 15.126f, 12.1875f)
                lineTo(15.126f, 3.8203f)
                curveTo(15.126f, 3.3281f, 15.4658f, 2.9766f, 15.9463f, 2.9766f)
                curveTo(16.4268f, 2.9766f, 16.7666f, 3.3281f, 16.7666f, 3.8203f)
                lineTo(16.7666f, 15.3633f)
                curveTo(16.7666f, 15.8906f, 17.1064f, 16.2891f, 17.5986f, 16.2891f)
                curveTo(18.0205f, 16.2891f, 18.3721f, 16.1016f, 18.6416f, 15.5156f)
                lineTo(20.2939f, 11.8359f)
                curveTo(20.5283f, 11.2852f, 20.9385f, 11.0625f, 21.3721f, 11.2148f)
                curveTo(21.8291f, 11.3555f, 21.9814f, 11.8242f, 21.7705f, 12.4219f)
                lineTo(19.6377f, 18.3867f)
                curveTo(19.5088f, 18.7266f, 19.3799f, 19.0547f, 19.2275f, 19.3594f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0908f, 25.6875f)
                curveTo(21.4307f, 26.0273f, 22.0283f, 26.0391f, 22.3682f, 25.6875f)
                curveTo(22.708f, 25.3242f, 22.7197f, 24.7617f, 22.3682f, 24.4102f)
                lineTo(1.5439f, 3.5977f)
                curveTo(1.1924f, 3.2461f, 0.6182f, 3.2461f, 0.2549f, 3.5977f)
                curveTo(-0.085f, 3.9492f, -0.085f, 4.5352f, 0.2549f, 4.875f)
                close()
            }
        }
        .build()
        return _handRaisedSlash!!
    }

private var _handRaisedSlash: ImageVector? = null
