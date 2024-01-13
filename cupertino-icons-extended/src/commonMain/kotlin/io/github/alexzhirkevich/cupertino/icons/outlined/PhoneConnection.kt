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

public val CupertinoIcons.Outlined.PhoneConnection: ImageVector
    get() {
        if (_phoneConnection != null) {
            return _phoneConnection!!
        }
        _phoneConnection = Builder(name = "PhoneConnection", defaultWidth = 24.8936.dp,
                defaultHeight = 26.7832.dp, viewportWidth = 24.8936f, viewportHeight =
                26.7832f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0391f, 24.8818f)
                curveTo(19.0781f, 24.8818f, 20.4258f, 24.3311f, 21.6211f, 22.9951f)
                curveTo(21.7148f, 22.9014f, 21.7969f, 22.7959f, 21.8906f, 22.7021f)
                curveTo(22.5938f, 21.917f, 22.9219f, 21.1436f, 22.9219f, 20.4053f)
                curveTo(22.9219f, 19.5615f, 22.4297f, 18.7764f, 21.3867f, 18.0498f)
                lineTo(17.9766f, 15.6826f)
                curveTo(16.9219f, 14.9561f, 15.6914f, 14.874f, 14.707f, 15.8467f)
                lineTo(13.8047f, 16.749f)
                curveTo(13.5352f, 17.0186f, 13.3008f, 17.0303f, 13.0312f, 16.8662f)
                curveTo(12.4102f, 16.4678f, 11.1328f, 15.3545f, 10.2656f, 14.4873f)
                curveTo(9.3516f, 13.585f, 8.4609f, 12.5771f, 8.0039f, 11.8389f)
                curveTo(7.8398f, 11.5693f, 7.8633f, 11.3467f, 8.1328f, 11.0771f)
                lineTo(9.0234f, 10.1748f)
                curveTo(10.0078f, 9.1904f, 9.9258f, 7.9482f, 9.1992f, 6.9053f)
                lineTo(6.8203f, 3.4951f)
                curveTo(6.1055f, 2.4522f, 5.3203f, 1.9717f, 4.4766f, 1.96f)
                curveTo(3.7383f, 1.9482f, 2.9648f, 2.2881f, 2.1797f, 2.9912f)
                curveTo(2.0742f, 3.085f, 1.9805f, 3.167f, 1.875f, 3.249f)
                curveTo(0.5508f, 4.4443f, 0.0f, 5.792f, 0.0f, 7.8193f)
                curveTo(0.0f, 11.1709f, 2.0625f, 15.249f, 5.8477f, 19.0342f)
                curveTo(9.6094f, 22.7959f, 13.6992f, 24.8818f, 17.0391f, 24.8818f)
                close()
                moveTo(17.0508f, 23.0771f)
                curveTo(14.0625f, 23.1357f, 10.2305f, 20.8389f, 7.1953f, 17.8154f)
                curveTo(4.1367f, 14.7686f, 1.7344f, 10.8076f, 1.793f, 7.8193f)
                curveTo(1.8164f, 6.5303f, 2.2617f, 5.417f, 3.1875f, 4.6201f)
                curveTo(3.2578f, 4.5498f, 3.3281f, 4.4912f, 3.4102f, 4.4326f)
                curveTo(3.75f, 4.1279f, 4.1367f, 3.9639f, 4.4648f, 3.9639f)
                curveTo(4.8164f, 3.9639f, 5.1211f, 4.0928f, 5.3438f, 4.4443f)
                lineTo(7.6172f, 7.8545f)
                curveTo(7.8633f, 8.2178f, 7.8867f, 8.6279f, 7.5234f, 8.9912f)
                lineTo(6.4922f, 10.0225f)
                curveTo(5.6719f, 10.8311f, 5.7422f, 11.8154f, 6.3281f, 12.6006f)
                curveTo(6.9961f, 13.5029f, 8.1563f, 14.8154f, 9.0469f, 15.7061f)
                curveTo(9.9492f, 16.6084f, 11.3672f, 17.874f, 12.2695f, 18.5537f)
                curveTo(13.0547f, 19.1396f, 14.0508f, 19.1982f, 14.8594f, 18.3896f)
                lineTo(15.8906f, 17.3584f)
                curveTo(16.2539f, 16.9951f, 16.6523f, 17.0186f, 17.0156f, 17.2529f)
                lineTo(20.4258f, 19.5264f)
                curveTo(20.7773f, 19.7607f, 20.918f, 20.0537f, 20.918f, 20.4053f)
                curveTo(20.918f, 20.7451f, 20.7539f, 21.1201f, 20.4375f, 21.4717f)
                curveTo(20.3789f, 21.5537f, 20.332f, 21.6123f, 20.2617f, 21.6943f)
                curveTo(19.4531f, 22.6084f, 18.3398f, 23.0537f, 17.0508f, 23.0771f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 12.1318f)
                curveTo(13.3828f, 12.7646f, 14.3906f, 12.7646f, 15.0234f, 12.1318f)
                curveTo(15.6445f, 11.499f, 15.6445f, 10.4912f, 15.0234f, 9.8818f)
                curveTo(14.3906f, 9.2373f, 13.3828f, 9.2373f, 12.75f, 9.8584f)
                curveTo(12.1172f, 10.4912f, 12.1172f, 11.499f, 12.75f, 12.1318f)
                close()
                moveTo(13.9102f, 5.6396f)
                curveTo(13.5352f, 6.0029f, 13.5352f, 6.6123f, 13.9102f, 6.9756f)
                lineTo(17.9062f, 10.9834f)
                curveTo(18.2695f, 11.3467f, 18.8789f, 11.3467f, 19.2422f, 10.9834f)
                curveTo(19.6055f, 10.6201f, 19.6055f, 10.0107f, 19.2422f, 9.6475f)
                lineTo(15.2344f, 5.6396f)
                curveTo(14.8711f, 5.2764f, 14.2617f, 5.2764f, 13.9102f, 5.6396f)
                close()
                moveTo(18.1289f, 6.7764f)
                curveTo(18.7617f, 7.374f, 19.7695f, 7.3857f, 20.3906f, 6.7529f)
                curveTo(21.0117f, 6.1318f, 21.0117f, 5.124f, 20.3906f, 4.5029f)
                curveTo(19.7695f, 3.8701f, 18.75f, 3.8701f, 18.1289f, 4.4912f)
                curveTo(17.4961f, 5.124f, 17.4961f, 6.1201f, 18.1289f, 6.7764f)
                close()
                moveTo(19.2891f, 0.2725f)
                curveTo(18.9258f, 0.6357f, 18.9258f, 1.2334f, 19.2891f, 1.6084f)
                lineTo(23.2734f, 5.6045f)
                curveTo(23.6484f, 5.9795f, 24.2578f, 5.9795f, 24.6211f, 5.6045f)
                curveTo(24.9844f, 5.2412f, 24.9844f, 4.6435f, 24.6211f, 4.2803f)
                lineTo(20.625f, 0.2725f)
                curveTo(20.25f, -0.0908f, 19.6406f, -0.0908f, 19.2891f, 0.2725f)
                close()
            }
        }
        .build()
        return _phoneConnection!!
    }

private var _phoneConnection: ImageVector? = null
