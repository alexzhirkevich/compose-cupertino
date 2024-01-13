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

public val CupertinoIcons.Outlined.QuestionmarkCircle: ImageVector
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
                moveTo(11.707f, 14.3789f)
                curveTo(12.293f, 14.3789f, 12.6562f, 14.0039f, 12.6562f, 13.5469f)
                curveTo(12.6562f, 13.5f, 12.6562f, 13.4414f, 12.6562f, 13.4062f)
                curveTo(12.6562f, 12.75f, 13.0312f, 12.3281f, 13.8516f, 11.7891f)
                curveTo(14.9883f, 11.0391f, 15.7969f, 10.3594f, 15.7969f, 8.9531f)
                curveTo(15.7969f, 7.0078f, 14.0625f, 5.9531f, 12.0703f, 5.9531f)
                curveTo(10.0547f, 5.9531f, 8.7305f, 6.9141f, 8.4141f, 7.9922f)
                curveTo(8.3555f, 8.1797f, 8.3203f, 8.3672f, 8.3203f, 8.5664f)
                curveTo(8.3203f, 9.0938f, 8.7305f, 9.375f, 9.1172f, 9.375f)
                curveTo(9.5156f, 9.375f, 9.7734f, 9.1875f, 9.9844f, 8.9063f)
                lineTo(10.1953f, 8.625f)
                curveTo(10.6055f, 7.9453f, 11.2148f, 7.5469f, 12.0f, 7.5469f)
                curveTo(13.0664f, 7.5469f, 13.7578f, 8.1563f, 13.7578f, 9.0469f)
                curveTo(13.7578f, 9.8438f, 13.2656f, 10.2305f, 12.2461f, 10.9453f)
                curveTo(11.4023f, 11.5312f, 10.7695f, 12.1523f, 10.7695f, 13.3008f)
                curveTo(10.7695f, 13.3477f, 10.7695f, 13.4062f, 10.7695f, 13.4531f)
                curveTo(10.7695f, 14.0625f, 11.1094f, 14.3789f, 11.707f, 14.3789f)
                close()
                moveTo(11.6836f, 17.8711f)
                curveTo(12.3633f, 17.8711f, 12.9492f, 17.332f, 12.9492f, 16.6523f)
                curveTo(12.9492f, 15.9727f, 12.375f, 15.4336f, 11.6836f, 15.4336f)
                curveTo(10.9922f, 15.4336f, 10.418f, 15.9844f, 10.418f, 16.6523f)
                curveTo(10.418f, 17.3203f, 11.0039f, 17.8711f, 11.6836f, 17.8711f)
                close()
            }
        }
        .build()
        return _questionmarkCircle!!
    }

private var _questionmarkCircle: ImageVector? = null
