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

public val CupertinoIcons.Filled.CameraCircle: ImageVector
    get() {
        if (_cameraCircle != null) {
            return _cameraCircle!!
        }
        _cameraCircle = Builder(name = "CameraCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(6.5625f, 17.4375f)
                curveTo(5.2852f, 17.4375f, 4.6406f, 16.8047f, 4.6406f, 15.5508f)
                lineTo(4.6406f, 9.1641f)
                curveTo(4.6406f, 7.8867f, 5.2852f, 7.2656f, 6.5625f, 7.2656f)
                lineTo(8.0859f, 7.2656f)
                curveTo(8.5547f, 7.2656f, 8.6953f, 7.1484f, 8.9648f, 6.8672f)
                lineTo(9.4688f, 6.3164f)
                curveTo(9.7734f, 5.9766f, 10.0898f, 5.8008f, 10.7109f, 5.8008f)
                lineTo(13.1484f, 5.8008f)
                curveTo(13.7812f, 5.8008f, 14.0977f, 5.9766f, 14.3906f, 6.3164f)
                lineTo(14.8828f, 6.8672f)
                curveTo(15.1523f, 7.1719f, 15.3164f, 7.2656f, 15.7852f, 7.2656f)
                lineTo(17.3438f, 7.2656f)
                curveTo(18.6094f, 7.2656f, 19.2656f, 7.8867f, 19.2656f, 9.1641f)
                lineTo(19.2656f, 15.5508f)
                curveTo(19.2656f, 16.8047f, 18.6094f, 17.4375f, 17.3438f, 17.4375f)
                close()
                moveTo(11.9648f, 15.9141f)
                curveTo(13.9688f, 15.9141f, 15.5742f, 14.3555f, 15.5742f, 12.293f)
                curveTo(15.5742f, 10.2891f, 13.9688f, 8.6719f, 11.9648f, 8.6719f)
                curveTo(9.9609f, 8.6719f, 8.3438f, 10.2891f, 8.3438f, 12.293f)
                curveTo(8.3438f, 14.3203f, 9.9609f, 15.9141f, 11.9648f, 15.9141f)
                close()
                moveTo(11.9531f, 14.8711f)
                curveTo(10.5352f, 14.8711f, 9.375f, 13.7227f, 9.375f, 12.293f)
                curveTo(9.375f, 10.8633f, 10.5352f, 9.7148f, 11.9531f, 9.7148f)
                curveTo(13.3711f, 9.7148f, 14.5312f, 10.875f, 14.5312f, 12.293f)
                curveTo(14.5312f, 13.7227f, 13.3711f, 14.8711f, 11.9531f, 14.8711f)
                close()
                moveTo(16.793f, 10.5586f)
                curveTo(17.2383f, 10.5586f, 17.6133f, 10.1953f, 17.6016f, 9.7383f)
                curveTo(17.6016f, 9.2813f, 17.2383f, 8.918f, 16.793f, 8.918f)
                curveTo(16.3359f, 8.918f, 15.9609f, 9.2813f, 15.9609f, 9.7383f)
                curveTo(15.9609f, 10.1953f, 16.3359f, 10.5586f, 16.793f, 10.5586f)
                close()
            }
        }
        .build()
        return _cameraCircle!!
    }

private var _cameraCircle: ImageVector? = null
