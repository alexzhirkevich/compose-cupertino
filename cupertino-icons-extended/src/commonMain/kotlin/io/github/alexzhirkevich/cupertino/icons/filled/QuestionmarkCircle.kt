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

public val CupertinoIcons.Filled.QuestionmarkCircle: ImageVector
    get() {
        if (_questionmarkCircle != null) {
            return _questionmarkCircle!!
        }
        _questionmarkCircle = Builder(name = "QuestionmarkCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.707f, 14.4609f)
                curveTo(11.0859f, 14.4609f, 10.7344f, 14.1328f, 10.7344f, 13.5f)
                curveTo(10.7344f, 13.4531f, 10.7344f, 13.3945f, 10.7344f, 13.3477f)
                curveTo(10.7344f, 12.1523f, 11.3906f, 11.5195f, 12.2578f, 10.9102f)
                curveTo(13.3125f, 10.1719f, 13.8164f, 9.7734f, 13.8164f, 8.9531f)
                curveTo(13.8164f, 8.0391f, 13.1016f, 7.418f, 12.0117f, 7.418f)
                curveTo(11.2031f, 7.418f, 10.582f, 7.8164f, 10.1484f, 8.5195f)
                lineTo(9.9375f, 8.8125f)
                curveTo(9.7148f, 9.0938f, 9.4453f, 9.293f, 9.0352f, 9.293f)
                curveTo(8.6367f, 9.293f, 8.2031f, 9.0f, 8.2031f, 8.4609f)
                curveTo(8.2031f, 8.25f, 8.25f, 8.0508f, 8.3086f, 7.8633f)
                curveTo(8.6367f, 6.75f, 9.9961f, 5.7773f, 12.082f, 5.7773f)
                curveTo(14.1445f, 5.7773f, 15.9375f, 6.8438f, 15.9375f, 8.8594f)
                curveTo(15.9375f, 10.3125f, 15.0938f, 11.0156f, 13.9219f, 11.7891f)
                curveTo(13.0781f, 12.3398f, 12.6914f, 12.7734f, 12.6914f, 13.4531f)
                curveTo(12.6914f, 13.4883f, 12.6914f, 13.5469f, 12.6914f, 13.5938f)
                curveTo(12.6914f, 14.0742f, 12.3164f, 14.4609f, 11.707f, 14.4609f)
                close()
                moveTo(11.6836f, 18.0586f)
                curveTo(10.9805f, 18.0586f, 10.3711f, 17.4961f, 10.3711f, 16.8047f)
                curveTo(10.3711f, 16.1133f, 10.9688f, 15.5391f, 11.6836f, 15.5391f)
                curveTo(12.3984f, 15.5391f, 12.9961f, 16.1016f, 12.9961f, 16.8047f)
                curveTo(12.9961f, 17.5078f, 12.3867f, 18.0586f, 11.6836f, 18.0586f)
                close()
            }
        }
        .build()
        return _questionmarkCircle!!
    }

private var _questionmarkCircle: ImageVector? = null
