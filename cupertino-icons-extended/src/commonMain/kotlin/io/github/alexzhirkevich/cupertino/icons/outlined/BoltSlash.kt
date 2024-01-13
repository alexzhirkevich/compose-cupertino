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

public val CupertinoIcons.Outlined.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 19.4912.dp, defaultHeight =
                26.3838.dp, viewportWidth = 19.4912f, viewportHeight = 26.3838f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4971f, 14.9321f)
                curveTo(1.4971f, 15.3892f, 1.8486f, 15.729f, 2.3408f, 15.729f)
                lineTo(8.9619f, 15.729f)
                lineTo(5.4697f, 24.8345f)
                curveTo(5.001f, 26.0415f, 6.29f, 26.6978f, 7.0518f, 25.7017f)
                lineTo(12.3369f, 18.9048f)
                lineTo(11.0244f, 17.5923f)
                lineTo(7.415f, 22.3735f)
                lineTo(7.7432f, 22.5493f)
                lineTo(10.2979f, 16.854f)
                lineTo(7.4033f, 13.9829f)
                lineTo(4.4268f, 13.9829f)
                lineTo(5.7158f, 12.2837f)
                lineTo(4.3447f, 10.9126f)
                lineTo(1.8018f, 14.1821f)
                curveTo(1.6025f, 14.44f, 1.4971f, 14.6743f, 1.4971f, 14.9321f)
                close()
                moveTo(7.1572f, 7.2915f)
                lineTo(8.4697f, 8.604f)
                lineTo(12.0791f, 3.8228f)
                lineTo(11.751f, 3.647f)
                lineTo(9.1963f, 9.3423f)
                lineTo(12.0674f, 12.2134f)
                lineTo(15.0674f, 12.2134f)
                lineTo(13.7783f, 13.9126f)
                lineTo(15.1494f, 15.2837f)
                lineTo(17.7041f, 12.0025f)
                curveTo(17.9033f, 11.7564f, 18.0088f, 11.522f, 18.0088f, 11.2525f)
                curveTo(18.0088f, 10.8071f, 17.6572f, 10.4673f, 17.165f, 10.4673f)
                lineTo(10.5439f, 10.4673f)
                lineTo(14.0361f, 1.3501f)
                curveTo(14.5049f, 0.1431f, 13.2158f, -0.5132f, 12.4541f, 0.4946f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9502f, 22.5728f)
                curveTo(18.3018f, 22.9243f, 18.8877f, 22.9243f, 19.2275f, 22.5728f)
                curveTo(19.5791f, 22.2329f, 19.5791f, 21.6587f, 19.2275f, 21.2954f)
                lineTo(1.5439f, 3.6118f)
                curveTo(1.1924f, 3.2603f, 0.5947f, 3.2603f, 0.2549f, 3.6118f)
                curveTo(-0.085f, 3.9517f, -0.085f, 4.5493f, 0.2549f, 4.8892f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
