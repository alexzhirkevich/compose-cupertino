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

public val CupertinoIcons.Outlined.Mount: ImageVector
    get() {
        if (_mount != null) {
            return _mount!!
        }
        _mount = Builder(name = "Mount", defaultWidth = 22.5469.dp, defaultHeight = 27.416.dp,
                viewportWidth = 22.5469f, viewportHeight = 27.416f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7578f, 9.8818f)
                lineTo(20.7891f, 9.8818f)
                curveTo(22.4062f, 9.8818f, 22.5586f, 8.0772f, 21.5859f, 7.3506f)
                lineTo(12.9023f, 0.6943f)
                curveTo(11.6719f, -0.2314f, 10.875f, -0.2314f, 9.6445f, 0.6943f)
                lineTo(0.9609f, 7.3506f)
                curveTo(-0.0117f, 8.0772f, 0.1406f, 9.8818f, 1.7578f, 9.8818f)
                close()
                moveTo(3.6328f, 8.1357f)
                curveTo(3.3516f, 8.1357f, 3.2695f, 7.8076f, 3.4922f, 7.6318f)
                lineTo(10.5586f, 2.2178f)
                curveTo(10.9453f, 1.9248f, 11.6016f, 1.9365f, 11.9766f, 2.2178f)
                lineTo(19.0547f, 7.6318f)
                curveTo(19.2773f, 7.8076f, 19.1953f, 8.1357f, 18.9141f, 8.1357f)
                close()
                moveTo(0.9961f, 14.7217f)
                lineTo(21.5508f, 14.7217f)
                curveTo(22.0898f, 14.7217f, 22.5469f, 14.2529f, 22.5469f, 13.7021f)
                curveTo(22.5469f, 13.1514f, 22.0898f, 12.6709f, 21.5508f, 12.6709f)
                lineTo(0.9961f, 12.6709f)
                curveTo(0.457f, 12.6709f, 0.0f, 13.1514f, 0.0f, 13.7021f)
                curveTo(0.0f, 14.2529f, 0.457f, 14.7217f, 0.9961f, 14.7217f)
                close()
                moveTo(1.7578f, 17.5225f)
                curveTo(0.1406f, 17.5225f, -0.0117f, 19.3154f, 0.9609f, 20.0537f)
                lineTo(9.6445f, 26.71f)
                curveTo(10.875f, 27.6357f, 11.6719f, 27.6357f, 12.9023f, 26.71f)
                lineTo(21.5859f, 20.0537f)
                curveTo(22.5586f, 19.3154f, 22.4062f, 17.5225f, 20.7891f, 17.5225f)
                close()
                moveTo(3.6328f, 19.2686f)
                lineTo(18.9141f, 19.2686f)
                curveTo(19.1953f, 19.2686f, 19.2773f, 19.585f, 19.0547f, 19.7725f)
                lineTo(11.9766f, 25.1865f)
                curveTo(11.6016f, 25.4678f, 10.9453f, 25.4795f, 10.5586f, 25.1865f)
                lineTo(3.4922f, 19.7725f)
                curveTo(3.2695f, 19.585f, 3.3516f, 19.2686f, 3.6328f, 19.2686f)
                close()
            }
        }
        .build()
        return _mount!!
    }

private var _mount: ImageVector? = null
