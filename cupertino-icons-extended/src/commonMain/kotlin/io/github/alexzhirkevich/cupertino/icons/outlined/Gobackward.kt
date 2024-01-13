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

public val CupertinoIcons.Outlined.Gobackward: ImageVector
    get() {
        if (_gobackward != null) {
            return _gobackward!!
        }
        _gobackward = Builder(name = "Gobackward", defaultWidth = 23.9062.dp, defaultHeight =
                28.4626.dp, viewportWidth = 23.9062f, viewportHeight = 28.4626f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.2254f)
                curveTo(0.0f, 20.7645f, 5.4258f, 26.1785f, 11.9531f, 26.1785f)
                curveTo(18.4922f, 26.1785f, 23.9062f, 20.7645f, 23.9062f, 14.2254f)
                curveTo(23.9062f, 8.4598f, 19.6992f, 3.5731f, 14.2148f, 2.495f)
                lineTo(14.2148f, 0.8309f)
                curveTo(14.2148f, -0.0011f, 13.6406f, -0.2238f, 13.0078f, 0.2332f)
                lineTo(9.2695f, 2.8465f)
                curveTo(8.7305f, 3.2215f, 8.7188f, 3.784f, 9.2695f, 4.1707f)
                lineTo(12.9961f, 6.7957f)
                curveTo(13.6406f, 7.2645f, 14.2148f, 7.0418f, 14.2148f, 6.1981f)
                lineTo(14.2148f, 4.534f)
                curveTo(18.6445f, 5.5418f, 21.9023f, 9.4793f, 21.9023f, 14.2254f)
                curveTo(21.9023f, 19.7567f, 17.4844f, 24.1864f, 11.9531f, 24.1864f)
                curveTo(6.4219f, 24.1864f, 1.9805f, 19.7567f, 1.9922f, 14.2254f)
                curveTo(2.0039f, 10.8973f, 3.6211f, 7.9559f, 6.1172f, 6.1746f)
                curveTo(6.5977f, 5.8113f, 6.75f, 5.2606f, 6.457f, 4.7684f)
                curveTo(6.1641f, 4.2879f, 5.5195f, 4.159f, 5.0039f, 4.5574f)
                curveTo(1.9922f, 6.7488f, 0.0f, 10.2879f, 0.0f, 14.2254f)
                close()
            }
        }
        .build()
        return _gobackward!!
    }

private var _gobackward: ImageVector? = null
