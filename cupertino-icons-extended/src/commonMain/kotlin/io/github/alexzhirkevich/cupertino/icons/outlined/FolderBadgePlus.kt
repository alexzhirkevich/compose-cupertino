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

public val CupertinoIcons.Outlined.FolderBadgePlus: ImageVector
    get() {
        if (_folderBadgePlus != null) {
            return _folderBadgePlus!!
        }
        _folderBadgePlus = Builder(name = "FolderBadgePlus", defaultWidth = 31.5117.dp,
                defaultHeight = 22.3477.dp, viewportWidth = 31.5117f, viewportHeight =
                22.3477f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.8203f)
                lineTo(23.2852f, 21.8203f)
                curveTo(25.3828f, 21.8203f, 26.6133f, 20.6016f, 26.6133f, 18.1875f)
                lineTo(26.6133f, 13.4531f)
                curveTo(26.1445f, 13.5352f, 25.3359f, 13.5469f, 24.7266f, 13.4531f)
                lineTo(24.7266f, 18.1055f)
                curveTo(24.7266f, 19.3125f, 24.0586f, 19.9336f, 22.8984f, 19.9336f)
                lineTo(3.7031f, 19.9336f)
                curveTo(2.5313f, 19.9336f, 1.8867f, 19.3125f, 1.8867f, 18.0938f)
                lineTo(1.8867f, 4.0078f)
                curveTo(1.8867f, 2.8477f, 2.4961f, 2.25f, 3.6211f, 2.25f)
                lineTo(6.0938f, 2.25f)
                curveTo(6.8672f, 2.25f, 7.3359f, 2.4492f, 7.9336f, 2.9531f)
                lineTo(8.6484f, 3.5508f)
                curveTo(9.4102f, 4.1836f, 10.0312f, 4.4063f, 11.1914f, 4.4063f)
                lineTo(18.1406f, 4.4063f)
                curveTo(18.2812f, 3.7383f, 18.4453f, 3.1758f, 18.7734f, 2.5195f)
                lineTo(11.6836f, 2.5195f)
                curveTo(10.8867f, 2.5195f, 10.4062f, 2.332f, 9.8203f, 1.8281f)
                lineTo(9.1055f, 1.2422f)
                curveTo(8.332f, 0.5859f, 7.7344f, 0.375f, 6.5742f, 0.375f)
                lineTo(3.2344f, 0.375f)
                curveTo(1.1836f, 0.375f, 0.0f, 1.5469f, 0.0f, 3.9023f)
                lineTo(0.0f, 18.1875f)
                curveTo(0.0f, 20.6133f, 1.2305f, 21.8203f, 3.6797f, 21.8203f)
                close()
                moveTo(1.1484f, 8.6953f)
                lineTo(18.4688f, 8.6953f)
                curveTo(18.2578f, 8.1328f, 18.1055f, 7.5352f, 18.0469f, 6.9258f)
                lineTo(1.1484f, 6.9258f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.5586f, 11.9062f)
                curveTo(28.7812f, 11.9062f, 31.5117f, 9.2109f, 31.5117f, 5.9531f)
                curveTo(31.5117f, 2.6953f, 28.8164f, 0.0f, 25.5586f, 0.0f)
                curveTo(22.2891f, 0.0f, 19.6055f, 2.6953f, 19.6055f, 5.9531f)
                curveTo(19.6055f, 9.2344f, 22.2891f, 11.9062f, 25.5586f, 11.9062f)
                close()
                moveTo(25.5586f, 9.6914f)
                curveTo(25.1133f, 9.6914f, 24.832f, 9.3984f, 24.832f, 8.9648f)
                lineTo(24.832f, 6.6797f)
                lineTo(22.5469f, 6.6797f)
                curveTo(22.1133f, 6.6797f, 21.832f, 6.3984f, 21.832f, 5.9531f)
                curveTo(21.832f, 5.5195f, 22.1133f, 5.2383f, 22.5469f, 5.2383f)
                lineTo(24.832f, 5.2383f)
                lineTo(24.832f, 2.9531f)
                curveTo(24.832f, 2.5195f, 25.1133f, 2.2383f, 25.5586f, 2.2383f)
                curveTo(25.9922f, 2.2383f, 26.2734f, 2.5195f, 26.2734f, 2.9531f)
                lineTo(26.2734f, 5.2383f)
                lineTo(28.5586f, 5.2383f)
                curveTo(28.9922f, 5.2383f, 29.2852f, 5.5195f, 29.2852f, 5.9531f)
                curveTo(29.2852f, 6.3984f, 28.9922f, 6.6797f, 28.5586f, 6.6797f)
                lineTo(26.2734f, 6.6797f)
                lineTo(26.2734f, 8.9648f)
                curveTo(26.2734f, 9.3984f, 25.9922f, 9.6914f, 25.5586f, 9.6914f)
                close()
            }
        }
        .build()
        return _folderBadgePlus!!
    }

private var _folderBadgePlus: ImageVector? = null
