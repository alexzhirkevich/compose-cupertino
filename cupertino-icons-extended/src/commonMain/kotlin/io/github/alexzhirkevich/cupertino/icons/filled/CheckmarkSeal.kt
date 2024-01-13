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

public val CupertinoIcons.Filled.CheckmarkSeal: ImageVector
    get() {
        if (_checkmarkSeal != null) {
            return _checkmarkSeal!!
        }
        _checkmarkSeal = Builder(name = "CheckmarkSeal", defaultWidth = 26.6221.dp, defaultHeight =
                26.6338.dp, viewportWidth = 26.6221f, viewportHeight = 26.6338f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9985f, 19.0298f)
                curveTo(11.6001f, 19.0298f, 11.272f, 18.8774f, 10.9673f, 18.4673f)
                lineTo(8.0259f, 14.8579f)
                curveTo(7.8501f, 14.6235f, 7.7446f, 14.354f, 7.7446f, 14.0962f)
                curveTo(7.7446f, 13.5571f, 8.1548f, 13.1235f, 8.6938f, 13.1235f)
                curveTo(9.022f, 13.1235f, 9.2798f, 13.2407f, 9.5728f, 13.6274f)
                lineTo(11.9517f, 16.6978f)
                lineTo(16.9556f, 8.6587f)
                curveTo(17.1782f, 8.2954f, 17.4829f, 8.1196f, 17.7993f, 8.1196f)
                curveTo(18.3032f, 8.1196f, 18.7837f, 8.4712f, 18.7837f, 9.0103f)
                curveTo(18.7837f, 9.2798f, 18.6314f, 9.5493f, 18.4907f, 9.7837f)
                lineTo(12.9829f, 18.4673f)
                curveTo(12.7368f, 18.8423f, 12.397f, 19.0298f, 11.9985f, 19.0298f)
                close()
                moveTo(6.2095f, 23.4712f)
                lineTo(8.7524f, 23.4712f)
                curveTo(8.9868f, 23.4712f, 9.1626f, 23.5415f, 9.3384f, 23.7173f)
                lineTo(11.1431f, 25.5103f)
                curveTo(12.6196f, 26.9985f, 13.9907f, 26.9868f, 15.4673f, 25.5103f)
                lineTo(17.272f, 23.7173f)
                curveTo(17.4595f, 23.5415f, 17.6235f, 23.4712f, 17.8696f, 23.4712f)
                lineTo(20.4009f, 23.4712f)
                curveTo(22.4985f, 23.4712f, 23.4712f, 22.5103f, 23.4712f, 20.4009f)
                lineTo(23.4712f, 17.8696f)
                curveTo(23.4712f, 17.6235f, 23.5415f, 17.4595f, 23.7173f, 17.272f)
                lineTo(25.5103f, 15.4673f)
                curveTo(26.9985f, 13.9907f, 26.9868f, 12.6196f, 25.5103f, 11.1431f)
                lineTo(23.7173f, 9.3384f)
                curveTo(23.5415f, 9.1626f, 23.4712f, 8.9868f, 23.4712f, 8.7524f)
                lineTo(23.4712f, 6.2095f)
                curveTo(23.4712f, 4.1235f, 22.5103f, 3.1392f, 20.4009f, 3.1392f)
                lineTo(17.8696f, 3.1392f)
                curveTo(17.6235f, 3.1392f, 17.4595f, 3.0806f, 17.272f, 2.9048f)
                lineTo(15.4673f, 1.1118f)
                curveTo(13.9907f, -0.3765f, 12.6196f, -0.3647f, 11.1431f, 1.1118f)
                lineTo(9.3384f, 2.9048f)
                curveTo(9.1626f, 3.0806f, 8.9868f, 3.1392f, 8.7524f, 3.1392f)
                lineTo(6.2095f, 3.1392f)
                curveTo(4.1118f, 3.1392f, 3.1392f, 4.1001f, 3.1392f, 6.2095f)
                lineTo(3.1392f, 8.7524f)
                curveTo(3.1392f, 8.9868f, 3.0806f, 9.1626f, 2.9048f, 9.3384f)
                lineTo(1.1118f, 11.1431f)
                curveTo(-0.3765f, 12.6196f, -0.3647f, 13.9907f, 1.1118f, 15.4673f)
                lineTo(2.9048f, 17.272f)
                curveTo(3.0806f, 17.4595f, 3.1392f, 17.6235f, 3.1392f, 17.8696f)
                lineTo(3.1392f, 20.4009f)
                curveTo(3.1392f, 22.4985f, 4.1118f, 23.4712f, 6.2095f, 23.4712f)
                close()
            }
        }
        .build()
        return _checkmarkSeal!!
    }

private var _checkmarkSeal: ImageVector? = null
