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

public val CupertinoIcons.Filled.FolderBadgePlus: ImageVector
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
                lineTo(26.6133f, 13.4648f)
                curveTo(26.3086f, 13.5f, 26.0156f, 13.5117f, 25.7227f, 13.5117f)
                curveTo(22.4883f, 13.5117f, 19.6875f, 11.5898f, 18.5625f, 8.5781f)
                lineTo(0.0f, 8.5781f)
                lineTo(0.0f, 18.1875f)
                curveTo(0.0f, 20.6133f, 1.2305f, 21.8203f, 3.6797f, 21.8203f)
                close()
                moveTo(0.0f, 7.043f)
                lineTo(18.1875f, 7.043f)
                curveTo(18.1406f, 6.7383f, 18.0938f, 6.4219f, 18.0938f, 6.082f)
                curveTo(18.0938f, 4.8984f, 18.375f, 3.6211f, 18.9258f, 2.5195f)
                lineTo(11.6836f, 2.5195f)
                curveTo(10.8867f, 2.5195f, 10.4062f, 2.332f, 9.8203f, 1.8281f)
                lineTo(9.1055f, 1.2422f)
                curveTo(8.332f, 0.5859f, 7.7344f, 0.375f, 6.5742f, 0.375f)
                lineTo(3.2344f, 0.375f)
                curveTo(1.1836f, 0.375f, 0.0f, 1.5469f, 0.0f, 3.9023f)
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
