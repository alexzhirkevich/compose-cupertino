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

public val CupertinoIcons.Outlined.WaveformPathEcg: ImageVector
    get() {
        if (_waveformPathEcg != null) {
            return _waveformPathEcg!!
        }
        _waveformPathEcg = Builder(name = "WaveformPathEcg", defaultWidth = 23.4727.dp,
                defaultHeight = 25.2451.dp, viewportWidth = 23.4727f, viewportHeight =
                25.2451f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.8438f, 14.8901f)
                lineTo(6.0352f, 14.8901f)
                curveTo(6.5625f, 14.8901f, 6.8789f, 14.6558f, 6.9961f, 14.187f)
                lineTo(9.2578f, 3.7808f)
                lineTo(8.3672f, 3.7808f)
                lineTo(11.8359f, 24.6167f)
                curveTo(11.9766f, 25.4605f, 13.2773f, 25.4487f, 13.4414f, 24.6167f)
                lineTo(16.8047f, 8.8315f)
                lineTo(16.0664f, 8.8198f)
                lineTo(17.1211f, 14.0933f)
                curveTo(17.2266f, 14.6323f, 17.5312f, 14.8901f, 18.082f, 14.8901f)
                lineTo(22.6289f, 14.8901f)
                curveTo(23.0977f, 14.8901f, 23.4727f, 14.5269f, 23.4727f, 14.0698f)
                curveTo(23.4727f, 13.6011f, 23.1094f, 13.2378f, 22.6289f, 13.2378f)
                lineTo(17.0977f, 13.2378f)
                lineTo(18.7852f, 14.6089f)
                lineTo(17.1328f, 7.273f)
                curveTo(16.957f, 6.4644f, 15.75f, 6.4644f, 15.5508f, 7.3081f)
                lineTo(12.1289f, 22.6011f)
                lineTo(12.9609f, 22.6011f)
                lineTo(9.5273f, 1.7769f)
                curveTo(9.3984f, 0.9566f, 8.2031f, 0.9331f, 8.0156f, 1.7769f)
                lineTo(5.2383f, 14.6089f)
                lineTo(6.9258f, 13.2378f)
                lineTo(0.8438f, 13.2378f)
                curveTo(0.3633f, 13.2378f, 0.0f, 13.6128f, 0.0f, 14.0698f)
                curveTo(0.0f, 14.5269f, 0.3633f, 14.8901f, 0.8438f, 14.8901f)
                close()
            }
        }
        .build()
        return _waveformPathEcg!!
    }

private var _waveformPathEcg: ImageVector? = null
