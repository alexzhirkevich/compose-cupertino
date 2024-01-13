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

public val CupertinoIcons.Filled.WalletPass: ImageVector
    get() {
        if (_walletPass != null) {
            return _walletPass!!
        }
        _walletPass = Builder(name = "WalletPass", defaultWidth = 19.7109.dp, defaultHeight =
                25.1367.dp, viewportWidth = 19.7109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6328f, 25.125f)
                lineTo(16.0781f, 25.125f)
                curveTo(18.4922f, 25.125f, 19.7109f, 23.8945f, 19.7109f, 21.457f)
                lineTo(19.7109f, 3.6797f)
                curveTo(19.7109f, 1.2305f, 18.5039f, 0.0f, 16.0781f, 0.0f)
                lineTo(13.1016f, 0.0f)
                curveTo(12.7031f, 0.0f, 12.4336f, 0.2813f, 12.4336f, 0.7031f)
                curveTo(12.4336f, 0.7617f, 12.4336f, 0.8203f, 12.4336f, 0.8672f)
                curveTo(12.4336f, 2.3906f, 11.4023f, 3.3047f, 9.8555f, 3.3047f)
                curveTo(8.3086f, 3.3047f, 7.2773f, 2.3906f, 7.2773f, 0.8672f)
                curveTo(7.2773f, 0.8203f, 7.2773f, 0.7617f, 7.2773f, 0.7031f)
                curveTo(7.2773f, 0.2813f, 7.0078f, 0.0f, 6.6094f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.207f, 0.0f, 0.0f, 1.2305f, 0.0f, 3.6797f)
                lineTo(0.0f, 21.457f)
                curveTo(0.0f, 23.8945f, 1.2188f, 25.125f, 3.6328f, 25.125f)
                close()
                moveTo(5.4141f, 8.7305f)
                curveTo(4.9922f, 8.7305f, 4.6875f, 8.4141f, 4.6875f, 7.9922f)
                curveTo(4.6875f, 7.5938f, 4.9922f, 7.2773f, 5.4141f, 7.2773f)
                lineTo(14.3086f, 7.2773f)
                curveTo(14.7188f, 7.2773f, 15.0234f, 7.5938f, 15.0234f, 7.9922f)
                curveTo(15.0234f, 8.4141f, 14.7188f, 8.7305f, 14.3086f, 8.7305f)
                close()
                moveTo(5.4141f, 12.8906f)
                curveTo(4.9922f, 12.8906f, 4.6875f, 12.5742f, 4.6875f, 12.1758f)
                curveTo(4.6875f, 11.7656f, 4.9922f, 11.4492f, 5.4141f, 11.4492f)
                lineTo(9.6211f, 11.4492f)
                curveTo(10.043f, 11.4492f, 10.3477f, 11.7656f, 10.3477f, 12.1758f)
                curveTo(10.3477f, 12.5742f, 10.043f, 12.8906f, 9.6211f, 12.8906f)
                close()
            }
        }
        .build()
        return _walletPass!!
    }

private var _walletPass: ImageVector? = null
