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

public val CupertinoIcons.Filled.HandWave: ImageVector
    get() {
        if (_handWave != null) {
            return _handWave!!
        }
        _handWave = Builder(name = "HandWave", defaultWidth = 22.238.dp, defaultHeight = 22.248.dp,
                viewportWidth = 22.238f, viewportHeight = 22.248f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1416f, 19.5557f)
                curveTo(11.7979f, 23.2002f, 16.3564f, 22.9658f, 19.6377f, 19.6963f)
                curveTo(22.2744f, 17.0479f, 22.8018f, 14.3057f, 21.6885f, 11.001f)
                curveTo(21.0908f, 9.1494f, 20.1064f, 7.1924f, 18.9111f, 4.9541f)
                curveTo(18.4307f, 4.04f, 17.8564f, 2.8447f, 17.458f, 2.458f)
                curveTo(17.0127f, 2.0127f, 16.3916f, 2.0361f, 15.9229f, 2.5049f)
                curveTo(15.3955f, 3.0322f, 15.4189f, 3.665f, 15.8174f, 4.8486f)
                lineTo(17.083f, 8.4111f)
                curveTo(17.2354f, 8.7861f, 17.2119f, 9.0205f, 17.0713f, 9.1611f)
                curveTo(16.9072f, 9.3252f, 16.6846f, 9.3486f, 16.3799f, 9.0557f)
                lineTo(7.708f, 0.3604f)
                curveTo(7.2158f, -0.1201f, 6.4072f, -0.1201f, 5.9268f, 0.3604f)
                curveTo(5.4346f, 0.8525f, 5.4346f, 1.6494f, 5.9268f, 2.1416f)
                lineTo(12.1377f, 8.3525f)
                curveTo(11.833f, 8.4932f, 11.5166f, 8.6807f, 11.2002f, 8.8916f)
                lineTo(3.9932f, 1.6846f)
                curveTo(3.5127f, 1.1924f, 2.7041f, 1.1924f, 2.2119f, 1.6846f)
                curveTo(1.7314f, 2.1768f, 1.7314f, 2.9736f, 2.2119f, 3.4658f)
                lineTo(9.3252f, 10.5791f)
                curveTo(9.0908f, 10.8604f, 8.8682f, 11.165f, 8.6572f, 11.4697f)
                lineTo(2.1416f, 4.9424f)
                curveTo(1.6494f, 4.4502f, 0.8525f, 4.4502f, 0.3604f, 4.9424f)
                curveTo(-0.1201f, 5.4346f, -0.1201f, 6.2315f, 0.3604f, 6.7236f)
                lineTo(7.4502f, 13.8018f)
                curveTo(7.2979f, 14.2002f, 7.2041f, 14.5986f, 7.1221f, 14.9736f)
                lineTo(2.2002f, 10.0518f)
                curveTo(1.7197f, 9.5596f, 0.9111f, 9.5596f, 0.4189f, 10.0518f)
                curveTo(-0.0615f, 10.5439f, -0.0615f, 11.3408f, 0.4189f, 11.833f)
                close()
            }
        }
        .build()
        return _handWave!!
    }

private var _handWave: ImageVector? = null
