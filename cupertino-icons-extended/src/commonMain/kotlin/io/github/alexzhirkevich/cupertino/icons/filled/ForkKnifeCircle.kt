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

public val CupertinoIcons.Filled.ForkKnifeCircle: ImageVector
    get() {
        if (_forkKnifeCircle != null) {
            return _forkKnifeCircle!!
        }
        _forkKnifeCircle = Builder(name = "ForkKnifeCircle", defaultWidth = 23.9062.dp,
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
                moveTo(9.3398f, 19.8633f)
                curveTo(8.7773f, 19.8633f, 8.4141f, 19.5586f, 8.4258f, 18.9961f)
                lineTo(8.5664f, 11.332f)
                curveTo(8.5664f, 11.0977f, 8.4609f, 10.9102f, 8.25f, 10.8164f)
                curveTo(7.3359f, 10.4297f, 6.9492f, 10.0195f, 7.0078f, 8.8125f)
                lineTo(7.1953f, 4.6289f)
                curveTo(7.207f, 4.3242f, 7.3828f, 4.1484f, 7.6523f, 4.1484f)
                curveTo(7.9336f, 4.1484f, 8.0977f, 4.3359f, 8.0977f, 4.6406f)
                lineTo(8.0391f, 8.7305f)
                curveTo(8.0391f, 8.9531f, 8.2031f, 9.1172f, 8.4141f, 9.1172f)
                curveTo(8.6602f, 9.1172f, 8.8125f, 8.9531f, 8.8125f, 8.7422f)
                lineTo(8.8828f, 4.5352f)
                curveTo(8.8828f, 4.2305f, 9.0703f, 4.0664f, 9.3398f, 4.0664f)
                curveTo(9.6094f, 4.0664f, 9.8086f, 4.2305f, 9.8086f, 4.5352f)
                lineTo(9.8555f, 8.7422f)
                curveTo(9.8555f, 8.9531f, 10.0195f, 9.1172f, 10.2539f, 9.1172f)
                curveTo(10.4883f, 9.1172f, 10.6523f, 8.9531f, 10.6523f, 8.7305f)
                lineTo(10.5938f, 4.6406f)
                curveTo(10.5938f, 4.3359f, 10.7578f, 4.1484f, 11.0273f, 4.1484f)
                curveTo(11.3086f, 4.1484f, 11.4609f, 4.3242f, 11.4844f, 4.6289f)
                lineTo(11.6836f, 8.8125f)
                curveTo(11.7422f, 10.0195f, 11.3438f, 10.4297f, 10.4414f, 10.8164f)
                curveTo(10.2305f, 10.9102f, 10.1367f, 11.0977f, 10.1367f, 11.332f)
                lineTo(10.2539f, 18.9961f)
                curveTo(10.2773f, 19.5586f, 9.9141f, 19.8633f, 9.3398f, 19.8633f)
                close()
                moveTo(14.2266f, 14.0625f)
                curveTo(14.2383f, 13.8047f, 14.1211f, 13.6172f, 13.875f, 13.4531f)
                lineTo(13.4883f, 13.1719f)
                curveTo(13.1484f, 12.9258f, 12.9609f, 12.5977f, 12.9609f, 12.1172f)
                lineTo(12.9609f, 11.6602f)
                curveTo(12.9609f, 8.9414f, 13.6875f, 6.0586f, 14.7891f, 4.5234f)
                curveTo(15.0f, 4.207f, 15.1875f, 4.0664f, 15.4336f, 4.0664f)
                curveTo(15.6797f, 4.0664f, 15.9258f, 4.2188f, 15.9258f, 4.5703f)
                lineTo(15.9258f, 19.0312f)
                curveTo(15.9258f, 19.582f, 15.5742f, 19.8633f, 14.9883f, 19.8633f)
                curveTo(14.4375f, 19.8633f, 14.0625f, 19.5586f, 14.0742f, 18.9609f)
                close()
            }
        }
        .build()
        return _forkKnifeCircle!!
    }

private var _forkKnifeCircle: ImageVector? = null
