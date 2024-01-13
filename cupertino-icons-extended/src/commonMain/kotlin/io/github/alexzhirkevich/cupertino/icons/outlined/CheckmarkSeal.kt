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

public val CupertinoIcons.Outlined.CheckmarkSeal: ImageVector
    get() {
        if (_checkmarkSeal != null) {
            return _checkmarkSeal!!
        }
        _checkmarkSeal = Builder(name = "CheckmarkSeal", defaultWidth = 26.6104.dp, defaultHeight =
                26.7275.dp, viewportWidth = 26.6104f, viewportHeight = 26.7275f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2095f, 23.4712f)
                lineTo(8.7407f, 23.4712f)
                curveTo(8.9868f, 23.4712f, 9.1626f, 23.5415f, 9.3384f, 23.7173f)
                lineTo(11.1431f, 25.5103f)
                curveTo(12.6196f, 26.9985f, 13.9907f, 26.9868f, 15.4673f, 25.5103f)
                lineTo(17.272f, 23.7173f)
                curveTo(17.4478f, 23.5415f, 17.6235f, 23.4712f, 17.8696f, 23.4712f)
                lineTo(20.4009f, 23.4712f)
                curveTo(22.4985f, 23.4712f, 23.4712f, 22.5103f, 23.4712f, 20.4009f)
                lineTo(23.4712f, 17.8696f)
                curveTo(23.4712f, 17.6235f, 23.5415f, 17.4595f, 23.7173f, 17.272f)
                lineTo(25.4985f, 15.4673f)
                curveTo(26.9868f, 13.9907f, 26.9751f, 12.6314f, 25.4985f, 11.1431f)
                lineTo(23.7173f, 9.3384f)
                curveTo(23.5415f, 9.1626f, 23.4712f, 8.9868f, 23.4712f, 8.7524f)
                lineTo(23.4712f, 6.2095f)
                curveTo(23.4712f, 4.1235f, 22.5103f, 3.1392f, 20.4009f, 3.1392f)
                lineTo(17.8696f, 3.1392f)
                curveTo(17.6235f, 3.1392f, 17.4478f, 3.0806f, 17.272f, 2.9048f)
                lineTo(15.4673f, 1.1118f)
                curveTo(13.9907f, -0.3765f, 12.6196f, -0.3647f, 11.1431f, 1.1118f)
                lineTo(9.3384f, 2.9048f)
                curveTo(9.1626f, 3.0806f, 8.9868f, 3.1392f, 8.7407f, 3.1392f)
                lineTo(6.2095f, 3.1392f)
                curveTo(4.1118f, 3.1392f, 3.1392f, 4.1001f, 3.1392f, 6.2095f)
                lineTo(3.1392f, 8.7524f)
                curveTo(3.1392f, 8.9868f, 3.0806f, 9.1626f, 2.9048f, 9.3384f)
                lineTo(1.1118f, 11.1431f)
                curveTo(-0.3765f, 12.6314f, -0.3647f, 13.9907f, 1.1118f, 15.4673f)
                lineTo(2.9048f, 17.272f)
                curveTo(3.0806f, 17.4595f, 3.1392f, 17.6235f, 3.1392f, 17.8696f)
                lineTo(3.1392f, 20.4009f)
                curveTo(3.1392f, 22.4985f, 4.1118f, 23.4712f, 6.2095f, 23.4712f)
                close()
                moveTo(6.2095f, 21.6079f)
                curveTo(5.1665f, 21.6079f, 5.0024f, 21.4439f, 5.0024f, 20.4009f)
                lineTo(5.0024f, 17.2485f)
                curveTo(5.0024f, 16.897f, 4.897f, 16.6274f, 4.6392f, 16.3696f)
                lineTo(2.4243f, 14.1665f)
                curveTo(1.686f, 13.4165f, 1.686f, 13.2056f, 2.4243f, 12.4556f)
                lineTo(4.6392f, 10.2524f)
                curveTo(4.897f, 9.9946f, 5.0024f, 9.7251f, 5.0024f, 9.3618f)
                lineTo(5.0024f, 6.2095f)
                curveTo(5.0024f, 5.1548f, 5.1548f, 5.0024f, 6.2095f, 5.0024f)
                lineTo(9.3618f, 5.0024f)
                curveTo(9.7251f, 5.0024f, 9.9946f, 4.9087f, 10.2524f, 4.6392f)
                lineTo(12.4556f, 2.4243f)
                curveTo(13.2056f, 1.686f, 13.4165f, 1.686f, 14.1548f, 2.4243f)
                lineTo(16.3696f, 4.6392f)
                curveTo(16.6157f, 4.9087f, 16.897f, 5.0024f, 17.2485f, 5.0024f)
                lineTo(20.4009f, 5.0024f)
                curveTo(21.4439f, 5.0024f, 21.6079f, 5.1665f, 21.6079f, 6.2095f)
                lineTo(21.6079f, 9.3618f)
                curveTo(21.6079f, 9.7251f, 21.7251f, 9.9946f, 21.9829f, 10.2524f)
                lineTo(24.1978f, 12.4556f)
                curveTo(24.936f, 13.2056f, 24.936f, 13.4165f, 24.1978f, 14.1665f)
                lineTo(21.9829f, 16.3696f)
                curveTo(21.7251f, 16.6274f, 21.6079f, 16.897f, 21.6079f, 17.2485f)
                lineTo(21.6079f, 20.4009f)
                curveTo(21.6079f, 21.4439f, 21.4439f, 21.6079f, 20.4009f, 21.6079f)
                lineTo(17.2485f, 21.6079f)
                curveTo(16.897f, 21.6079f, 16.6157f, 21.7134f, 16.3696f, 21.9829f)
                lineTo(14.1548f, 24.1978f)
                curveTo(13.4165f, 24.936f, 13.2056f, 24.936f, 12.4556f, 24.1978f)
                lineTo(10.2524f, 21.9829f)
                curveTo(9.9946f, 21.7134f, 9.7251f, 21.6079f, 9.3618f, 21.6079f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0337f, 18.8657f)
                curveTo(12.4204f, 18.8657f, 12.7485f, 18.6782f, 12.9829f, 18.3267f)
                lineTo(18.3384f, 9.8892f)
                curveTo(18.4673f, 9.6665f, 18.6196f, 9.4087f, 18.6196f, 9.1392f)
                curveTo(18.6196f, 8.6235f, 18.1509f, 8.2837f, 17.6704f, 8.2837f)
                curveTo(17.3657f, 8.2837f, 17.0728f, 8.4595f, 16.8501f, 8.811f)
                lineTo(11.9868f, 16.6157f)
                lineTo(9.6782f, 13.6274f)
                curveTo(9.397f, 13.2524f, 9.1392f, 13.147f, 8.8228f, 13.147f)
                curveTo(8.3071f, 13.147f, 7.9087f, 13.5571f, 7.9087f, 14.0845f)
                curveTo(7.9087f, 14.3306f, 8.0142f, 14.5884f, 8.1782f, 14.811f)
                lineTo(11.0376f, 18.3267f)
                curveTo(11.3306f, 18.7134f, 11.647f, 18.8657f, 12.0337f, 18.8657f)
                close()
            }
        }
        .build()
        return _checkmarkSeal!!
    }

private var _checkmarkSeal: ImageVector? = null
