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

public val CupertinoIcons.Outlined.ForkKnifeCircle: ImageVector
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
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4688f, 19.6289f)
                curveTo(10.0195f, 19.6289f, 10.3711f, 19.3242f, 10.3594f, 18.7852f)
                lineTo(10.2305f, 11.3555f)
                curveTo(10.2305f, 11.1211f, 10.3242f, 10.9453f, 10.5352f, 10.8516f)
                curveTo(11.4023f, 10.4766f, 11.8008f, 10.0781f, 11.7305f, 8.9063f)
                lineTo(11.543f, 4.8516f)
                curveTo(11.5312f, 4.5586f, 11.3672f, 4.3828f, 11.0977f, 4.3828f)
                curveTo(10.8398f, 4.3828f, 10.6758f, 4.5703f, 10.6758f, 4.8633f)
                lineTo(10.7344f, 8.8242f)
                curveTo(10.7344f, 9.0469f, 10.5703f, 9.1992f, 10.3594f, 9.1992f)
                curveTo(10.125f, 9.1992f, 9.9609f, 9.0469f, 9.9609f, 8.8359f)
                lineTo(9.9141f, 4.7578f)
                curveTo(9.9141f, 4.4648f, 9.7266f, 4.3008f, 9.4688f, 4.3008f)
                curveTo(9.1992f, 4.3008f, 9.0234f, 4.4648f, 9.0234f, 4.7578f)
                lineTo(8.9531f, 8.8359f)
                curveTo(8.9531f, 9.0469f, 8.8008f, 9.1992f, 8.5781f, 9.1992f)
                curveTo(8.3672f, 9.1992f, 8.2031f, 9.0469f, 8.2031f, 8.8242f)
                lineTo(8.2617f, 4.8633f)
                curveTo(8.2617f, 4.5703f, 8.0977f, 4.3828f, 7.8398f, 4.3828f)
                curveTo(7.5703f, 4.3828f, 7.3945f, 4.5586f, 7.3828f, 4.8516f)
                lineTo(7.207f, 8.9063f)
                curveTo(7.1602f, 10.0781f, 7.5352f, 10.4766f, 8.4141f, 10.8516f)
                curveTo(8.6133f, 10.9453f, 8.707f, 11.1211f, 8.707f, 11.3555f)
                lineTo(8.5781f, 18.7852f)
                curveTo(8.5664f, 19.3242f, 8.918f, 19.6289f, 9.4688f, 19.6289f)
                close()
                moveTo(14.0625f, 14.0039f)
                lineTo(13.9102f, 18.75f)
                curveTo(13.8867f, 19.3242f, 14.25f, 19.6289f, 14.7891f, 19.6289f)
                curveTo(15.3633f, 19.6289f, 15.7031f, 19.3477f, 15.7031f, 18.8203f)
                lineTo(15.7031f, 4.793f)
                curveTo(15.7031f, 4.4531f, 15.457f, 4.3008f, 15.2344f, 4.3008f)
                curveTo(14.9766f, 4.3008f, 14.8125f, 4.4414f, 14.6016f, 4.7461f)
                curveTo(13.5352f, 6.2344f, 12.832f, 9.0352f, 12.832f, 11.6719f)
                lineTo(12.832f, 12.1172f)
                curveTo(12.832f, 12.5859f, 13.0078f, 12.9023f, 13.3359f, 13.1367f)
                lineTo(13.7227f, 13.4062f)
                curveTo(13.957f, 13.5703f, 14.0625f, 13.7461f, 14.0625f, 14.0039f)
                close()
            }
        }
        .build()
        return _forkKnifeCircle!!
    }

private var _forkKnifeCircle: ImageVector? = null
