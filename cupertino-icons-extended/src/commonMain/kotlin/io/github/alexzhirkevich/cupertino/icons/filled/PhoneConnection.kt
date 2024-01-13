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

public val CupertinoIcons.Filled.PhoneConnection: ImageVector
    get() {
        if (_phoneConnection != null) {
            return _phoneConnection!!
        }
        _phoneConnection = Builder(name = "PhoneConnection", defaultWidth = 24.1436.dp,
                defaultHeight = 25.5645.dp, viewportWidth = 24.1436f, viewportHeight =
                25.5645f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9414f, 18.085f)
                curveTo(9.3281f, 21.4717f, 13.4531f, 24.085f, 16.8164f, 24.085f)
                curveTo(18.3281f, 24.085f, 19.6523f, 23.5576f, 20.7188f, 22.3857f)
                curveTo(21.3398f, 21.6943f, 21.7266f, 20.8857f, 21.7266f, 20.0889f)
                curveTo(21.7266f, 19.5029f, 21.5039f, 18.9404f, 20.9414f, 18.542f)
                lineTo(17.3555f, 15.9873f)
                curveTo(16.8047f, 15.6123f, 16.3477f, 15.4248f, 15.9258f, 15.4248f)
                curveTo(15.3867f, 15.4248f, 14.918f, 15.7295f, 14.3789f, 16.2568f)
                lineTo(13.5469f, 17.0771f)
                curveTo(13.418f, 17.2061f, 13.2539f, 17.2646f, 13.1016f, 17.2646f)
                curveTo(12.9141f, 17.2646f, 12.75f, 17.1943f, 12.6211f, 17.1357f)
                curveTo(11.9062f, 16.749f, 10.6641f, 15.6826f, 9.5039f, 14.5342f)
                curveTo(8.3555f, 13.3857f, 7.2891f, 12.1436f, 6.9141f, 11.417f)
                curveTo(6.8438f, 11.2881f, 6.7852f, 11.124f, 6.7852f, 10.9482f)
                curveTo(6.7852f, 10.7959f, 6.832f, 10.6436f, 6.9609f, 10.5146f)
                lineTo(7.7813f, 9.6592f)
                curveTo(8.3086f, 9.1201f, 8.6133f, 8.6514f, 8.6133f, 8.1123f)
                curveTo(8.6133f, 7.6904f, 8.4258f, 7.2334f, 8.0391f, 6.6826f)
                lineTo(5.5195f, 3.1318f)
                curveTo(5.1094f, 2.5693f, 4.5352f, 2.3232f, 3.9023f, 2.3232f)
                curveTo(3.1289f, 2.3232f, 2.3203f, 2.6748f, 1.6406f, 3.3428f)
                curveTo(0.5039f, 4.4326f, 0.0f, 5.7803f, 0.0f, 7.2685f)
                curveTo(0.0f, 10.6318f, 2.5664f, 14.71f, 5.9414f, 18.085f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.1318f)
                curveTo(12.6328f, 12.7646f, 13.6406f, 12.7646f, 14.2734f, 12.1318f)
                curveTo(14.9062f, 11.499f, 14.9062f, 10.4912f, 14.2734f, 9.8818f)
                curveTo(13.6406f, 9.2373f, 12.6328f, 9.2373f, 12.0f, 9.8584f)
                curveTo(11.3789f, 10.4912f, 11.3789f, 11.499f, 12.0f, 12.1318f)
                close()
                moveTo(13.1602f, 5.6396f)
                curveTo(12.7852f, 6.0029f, 12.7852f, 6.6123f, 13.1602f, 6.9756f)
                lineTo(17.1562f, 10.9834f)
                curveTo(17.5195f, 11.3467f, 18.1289f, 11.3467f, 18.4922f, 10.9834f)
                curveTo(18.8555f, 10.6201f, 18.8555f, 10.0107f, 18.4922f, 9.6475f)
                lineTo(14.4844f, 5.6396f)
                curveTo(14.1211f, 5.2764f, 13.5234f, 5.2764f, 13.1602f, 5.6396f)
                close()
                moveTo(17.3789f, 6.7764f)
                curveTo(18.0117f, 7.374f, 19.0195f, 7.3857f, 19.6406f, 6.7529f)
                curveTo(20.2617f, 6.1318f, 20.2617f, 5.124f, 19.6406f, 4.5029f)
                curveTo(19.0195f, 3.8701f, 18.0f, 3.8701f, 17.3789f, 4.4912f)
                curveTo(16.7461f, 5.124f, 16.7461f, 6.1201f, 17.3789f, 6.7764f)
                close()
                moveTo(18.5391f, 0.2725f)
                curveTo(18.1758f, 0.6357f, 18.1758f, 1.2334f, 18.5391f, 1.6084f)
                lineTo(22.5352f, 5.6045f)
                curveTo(22.8984f, 5.9795f, 23.5078f, 5.9795f, 23.8711f, 5.6045f)
                curveTo(24.2344f, 5.2412f, 24.2344f, 4.6435f, 23.8711f, 4.2803f)
                lineTo(19.875f, 0.2725f)
                curveTo(19.5f, -0.0908f, 18.8906f, -0.0908f, 18.5391f, 0.2725f)
                close()
            }
        }
        .build()
        return _phoneConnection!!
    }

private var _phoneConnection: ImageVector? = null
