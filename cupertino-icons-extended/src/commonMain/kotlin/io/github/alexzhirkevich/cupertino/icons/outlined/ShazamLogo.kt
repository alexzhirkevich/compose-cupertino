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

public val CupertinoIcons.Outlined.ShazamLogo: ImageVector
    get() {
        if (_shazamLogo != null) {
            return _shazamLogo!!
        }
        _shazamLogo = Builder(name = "ShazamLogo", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
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
                moveTo(11.0273f, 7.0313f)
                curveTo(11.5078f, 6.5508f, 11.5195f, 5.8242f, 11.0391f, 5.3555f)
                curveTo(10.5938f, 4.8867f, 9.8438f, 4.8516f, 9.3633f, 5.2969f)
                curveTo(9.3047f, 5.3906f, 7.5586f, 7.043f, 6.5859f, 8.1211f)
                curveTo(5.6953f, 9.082f, 5.2617f, 10.3242f, 5.3438f, 11.5898f)
                curveTo(5.4258f, 12.9141f, 6.0469f, 14.1328f, 7.0898f, 15.0234f)
                curveTo(7.9219f, 15.75f, 9.0234f, 16.1133f, 10.125f, 16.1133f)
                curveTo(11.2734f, 16.1133f, 12.3984f, 15.7383f, 13.2539f, 14.9414f)
                curveTo(13.875f, 14.4023f, 14.5781f, 13.6406f, 14.6016f, 13.6289f)
                curveTo(15.0469f, 13.1367f, 15.0117f, 12.3867f, 14.543f, 11.9531f)
                curveTo(14.0625f, 11.4844f, 13.3008f, 11.5195f, 12.8672f, 12.0117f)
                curveTo(12.8438f, 12.0117f, 12.2227f, 12.7148f, 11.6719f, 13.1953f)
                curveTo(10.7812f, 13.9805f, 9.3633f, 13.8516f, 8.625f, 13.2422f)
                curveTo(8.0859f, 12.75f, 7.7813f, 12.1289f, 7.7344f, 11.4609f)
                curveTo(7.6758f, 10.8164f, 7.9102f, 10.207f, 8.3438f, 9.7383f)
                curveTo(9.2461f, 8.707f, 11.0039f, 7.043f, 11.0273f, 7.0313f)
                close()
                moveTo(12.8672f, 17.1211f)
                curveTo(12.3867f, 17.6016f, 12.375f, 18.3398f, 12.8438f, 18.7969f)
                curveTo(13.3008f, 19.2773f, 14.0391f, 19.3125f, 14.5195f, 18.8672f)
                curveTo(14.6016f, 18.7734f, 16.3359f, 17.1094f, 17.3086f, 16.0312f)
                curveTo(18.1875f, 15.082f, 18.6211f, 13.8516f, 18.5508f, 12.5625f)
                curveTo(18.4688f, 11.25f, 17.8477f, 10.0195f, 16.8281f, 9.1406f)
                curveTo(15.9609f, 8.4023f, 14.8711f, 8.0508f, 13.7578f, 8.0508f)
                curveTo(12.6094f, 8.0508f, 11.5078f, 8.4258f, 10.6289f, 9.2109f)
                curveTo(10.0078f, 9.75f, 9.3047f, 10.5117f, 9.293f, 10.5352f)
                curveTo(8.8359f, 11.0391f, 8.8711f, 11.7891f, 9.3516f, 12.2109f)
                curveTo(9.832f, 12.668f, 10.5938f, 12.6445f, 11.0273f, 12.1641f)
                curveTo(11.0391f, 12.1406f, 11.6719f, 11.4258f, 12.2227f, 10.9688f)
                curveTo(13.1016f, 10.1719f, 14.5195f, 10.3242f, 15.2578f, 10.9219f)
                curveTo(15.7969f, 11.4141f, 16.1133f, 12.0234f, 16.1484f, 12.7148f)
                curveTo(16.2188f, 13.3477f, 15.9727f, 13.957f, 15.5391f, 14.4492f)
                curveTo(14.6484f, 15.457f, 12.8789f, 17.1094f, 12.8672f, 17.1211f)
                close()
            }
        }
        .build()
        return _shazamLogo!!
    }

private var _shazamLogo: ImageVector? = null
