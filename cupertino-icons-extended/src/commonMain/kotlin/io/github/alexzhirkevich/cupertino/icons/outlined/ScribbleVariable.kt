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

public val CupertinoIcons.Outlined.ScribbleVariable: ImageVector
    get() {
        if (_scribbleVariable != null) {
            return _scribbleVariable!!
        }
        _scribbleVariable = Builder(name = "ScribbleVariable", defaultWidth = 24.8565.dp,
                defaultHeight = 23.7473.dp, viewportWidth = 24.8565f, viewportHeight =
                23.7473f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5146f, 15.0787f)
                curveTo(1.124f, 15.6881f, 2.3544f, 15.8404f, 3.3036f, 14.985f)
                curveTo(3.62f, 14.7037f, 4.2763f, 14.0006f, 5.5302f, 12.7467f)
                curveTo(11.5185f, 6.6764f, 15.4677f, 2.692f, 16.3115f, 3.4537f)
                curveTo(16.9911f, 4.0514f, 14.9169f, 6.9811f, 12.9482f, 9.6998f)
                curveTo(9.2568f, 14.8443f, 6.3154f, 18.4068f, 8.495f, 20.5865f)
                curveTo(10.2411f, 22.3326f, 12.9599f, 20.5748f, 17.1435f, 16.9068f)
                curveTo(19.499f, 14.8326f, 21.2685f, 13.1568f, 21.7841f, 13.6842f)
                curveTo(22.1708f, 14.0592f, 21.5732f, 15.0553f, 20.6943f, 16.5787f)
                curveTo(19.5575f, 18.524f, 18.1396f, 20.61f, 19.499f, 21.9693f)
                curveTo(20.4365f, 22.8951f, 22.2529f, 22.4967f, 24.4911f, 20.3053f)
                curveTo(24.8896f, 19.9068f, 24.9833f, 19.4615f, 24.6669f, 19.1451f)
                curveTo(24.3622f, 18.8521f, 23.9404f, 18.899f, 23.624f, 19.192f)
                curveTo(21.995f, 20.7857f, 20.9286f, 21.2896f, 20.6591f, 21.0084f)
                curveTo(20.3427f, 20.7037f, 20.9169f, 19.6607f, 22.1122f, 17.5631f)
                curveTo(23.624f, 14.9146f, 24.4325f, 13.2506f, 23.1552f, 12.0084f)
                curveTo(21.4443f, 10.3443f, 19.4169f, 12.1256f, 15.6669f, 15.4185f)
                curveTo(12.1396f, 18.524f, 11.1083f, 19.0279f, 10.663f, 18.5943f)
                curveTo(10.0654f, 17.985f, 10.9794f, 16.9068f, 14.9286f, 11.3873f)
                curveTo(18.62f, 6.2193f, 20.7646f, 2.9967f, 18.7607f, 1.0631f)
                curveTo(16.0302f, -1.5971f, 12.5146f, 0.5006f, 2.8818f, 10.0279f)
                curveTo(1.6044f, 11.2935f, 0.9013f, 11.9615f, 0.62f, 12.2662f)
                curveTo(-0.2823f, 13.2623f, -0.0948f, 14.4693f, 0.5146f, 15.0787f)
                close()
            }
        }
        .build()
        return _scribbleVariable!!
    }

private var _scribbleVariable: ImageVector? = null
