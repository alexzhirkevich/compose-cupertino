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

public val CupertinoIcons.Outlined.WalletPass: ImageVector
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
                lineTo(12.5977f, 0.0f)
                curveTo(12.1992f, 0.0f, 11.9414f, 0.2813f, 11.9414f, 0.7031f)
                curveTo(11.9414f, 1.9219f, 11.0977f, 2.7773f, 9.8555f, 2.7773f)
                curveTo(8.6133f, 2.7773f, 7.7578f, 1.9219f, 7.7578f, 0.7031f)
                curveTo(7.7578f, 0.2813f, 7.5f, 0.0f, 7.1016f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.207f, 0.0f, 0.0f, 1.2305f, 0.0f, 3.6797f)
                lineTo(0.0f, 21.457f)
                curveTo(0.0f, 23.8945f, 1.2188f, 25.125f, 3.6328f, 25.125f)
                close()
                moveTo(3.7266f, 23.2383f)
                curveTo(2.5078f, 23.2383f, 1.8867f, 22.582f, 1.8867f, 21.4219f)
                lineTo(1.8867f, 3.7148f)
                curveTo(1.8867f, 2.543f, 2.5078f, 1.8867f, 3.7266f, 1.8867f)
                lineTo(7.0664f, 1.8867f)
                lineTo(5.9766f, 1.2188f)
                curveTo(6.1875f, 3.2695f, 7.7109f, 4.6055f, 9.8555f, 4.6055f)
                curveTo(12.0f, 4.6055f, 13.5234f, 3.2695f, 13.7461f, 1.2188f)
                lineTo(12.6445f, 1.8867f)
                lineTo(15.9844f, 1.8867f)
                curveTo(17.2031f, 1.8867f, 17.8242f, 2.543f, 17.8242f, 3.7148f)
                lineTo(17.8242f, 21.4219f)
                curveTo(17.8242f, 22.582f, 17.2031f, 23.2383f, 15.9844f, 23.2383f)
                close()
                moveTo(5.4141f, 8.7305f)
                lineTo(14.3086f, 8.7305f)
                curveTo(14.7188f, 8.7305f, 15.0234f, 8.4141f, 15.0234f, 7.9922f)
                curveTo(15.0234f, 7.5938f, 14.7188f, 7.2773f, 14.3086f, 7.2773f)
                lineTo(5.4141f, 7.2773f)
                curveTo(4.9922f, 7.2773f, 4.6875f, 7.5938f, 4.6875f, 7.9922f)
                curveTo(4.6875f, 8.4141f, 4.9922f, 8.7305f, 5.4141f, 8.7305f)
                close()
                moveTo(5.4141f, 12.8906f)
                lineTo(9.6211f, 12.8906f)
                curveTo(10.043f, 12.8906f, 10.3477f, 12.5742f, 10.3477f, 12.1758f)
                curveTo(10.3477f, 11.7656f, 10.043f, 11.4492f, 9.6211f, 11.4492f)
                lineTo(5.4141f, 11.4492f)
                curveTo(4.9922f, 11.4492f, 4.6875f, 11.7656f, 4.6875f, 12.1758f)
                curveTo(4.6875f, 12.5742f, 4.9922f, 12.8906f, 5.4141f, 12.8906f)
                close()
            }
        }
        .build()
        return _walletPass!!
    }

private var _walletPass: ImageVector? = null
