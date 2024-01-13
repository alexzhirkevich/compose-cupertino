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

public val CupertinoIcons.Outlined.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 23.3555.dp, defaultHeight =
                21.5977.dp, viewportWidth = 23.3555f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(19.6875f, 21.5977f)
                curveTo(22.1367f, 21.5977f, 23.3555f, 20.3789f, 23.3555f, 17.9648f)
                lineTo(23.3555f, 3.6563f)
                curveTo(23.3555f, 1.2422f, 22.1367f, 0.0234f, 19.6875f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(3.5039f, 19.7109f)
                curveTo(2.4609f, 19.7109f, 1.8867f, 19.1602f, 1.8867f, 18.0703f)
                lineTo(1.8867f, 7.0195f)
                curveTo(1.8867f, 5.9414f, 2.4609f, 5.3789f, 3.5039f, 5.3789f)
                lineTo(19.8398f, 5.3789f)
                curveTo(20.8828f, 5.3789f, 21.4688f, 5.9414f, 21.4688f, 7.0195f)
                lineTo(21.4688f, 18.0703f)
                curveTo(21.4688f, 19.1602f, 20.8828f, 19.7109f, 19.8398f, 19.7109f)
                close()
                moveTo(9.3984f, 9.5859f)
                lineTo(10.0898f, 9.5859f)
                curveTo(10.5f, 9.5859f, 10.6289f, 9.4688f, 10.6289f, 9.0586f)
                lineTo(10.6289f, 8.3672f)
                curveTo(10.6289f, 7.957f, 10.5f, 7.8281f, 10.0898f, 7.8281f)
                lineTo(9.3984f, 7.8281f)
                curveTo(8.9883f, 7.8281f, 8.8477f, 7.957f, 8.8477f, 8.3672f)
                lineTo(8.8477f, 9.0586f)
                curveTo(8.8477f, 9.4688f, 8.9883f, 9.5859f, 9.3984f, 9.5859f)
                close()
                moveTo(13.2891f, 9.5859f)
                lineTo(13.9805f, 9.5859f)
                curveTo(14.3906f, 9.5859f, 14.5312f, 9.4688f, 14.5312f, 9.0586f)
                lineTo(14.5312f, 8.3672f)
                curveTo(14.5312f, 7.957f, 14.3906f, 7.8281f, 13.9805f, 7.8281f)
                lineTo(13.2891f, 7.8281f)
                curveTo(12.8789f, 7.8281f, 12.7383f, 7.957f, 12.7383f, 8.3672f)
                lineTo(12.7383f, 9.0586f)
                curveTo(12.7383f, 9.4688f, 12.8789f, 9.5859f, 13.2891f, 9.5859f)
                close()
                moveTo(17.1797f, 9.5859f)
                lineTo(17.8711f, 9.5859f)
                curveTo(18.2812f, 9.5859f, 18.4219f, 9.4688f, 18.4219f, 9.0586f)
                lineTo(18.4219f, 8.3672f)
                curveTo(18.4219f, 7.957f, 18.2812f, 7.8281f, 17.8711f, 7.8281f)
                lineTo(17.1797f, 7.8281f)
                curveTo(16.7695f, 7.8281f, 16.6406f, 7.957f, 16.6406f, 8.3672f)
                lineTo(16.6406f, 9.0586f)
                curveTo(16.6406f, 9.4688f, 16.7695f, 9.5859f, 17.1797f, 9.5859f)
                close()
                moveTo(5.5078f, 13.418f)
                lineTo(6.1875f, 13.418f)
                curveTo(6.6094f, 13.418f, 6.7383f, 13.3008f, 6.7383f, 12.8906f)
                lineTo(6.7383f, 12.1992f)
                curveTo(6.7383f, 11.7891f, 6.6094f, 11.6719f, 6.1875f, 11.6719f)
                lineTo(5.5078f, 11.6719f)
                curveTo(5.0859f, 11.6719f, 4.957f, 11.7891f, 4.957f, 12.1992f)
                lineTo(4.957f, 12.8906f)
                curveTo(4.957f, 13.3008f, 5.0859f, 13.418f, 5.5078f, 13.418f)
                close()
                moveTo(9.3984f, 13.418f)
                lineTo(10.0898f, 13.418f)
                curveTo(10.5f, 13.418f, 10.6289f, 13.3008f, 10.6289f, 12.8906f)
                lineTo(10.6289f, 12.1992f)
                curveTo(10.6289f, 11.7891f, 10.5f, 11.6719f, 10.0898f, 11.6719f)
                lineTo(9.3984f, 11.6719f)
                curveTo(8.9883f, 11.6719f, 8.8477f, 11.7891f, 8.8477f, 12.1992f)
                lineTo(8.8477f, 12.8906f)
                curveTo(8.8477f, 13.3008f, 8.9883f, 13.418f, 9.3984f, 13.418f)
                close()
                moveTo(13.2891f, 13.418f)
                lineTo(13.9805f, 13.418f)
                curveTo(14.3906f, 13.418f, 14.5312f, 13.3008f, 14.5312f, 12.8906f)
                lineTo(14.5312f, 12.1992f)
                curveTo(14.5312f, 11.7891f, 14.3906f, 11.6719f, 13.9805f, 11.6719f)
                lineTo(13.2891f, 11.6719f)
                curveTo(12.8789f, 11.6719f, 12.7383f, 11.7891f, 12.7383f, 12.1992f)
                lineTo(12.7383f, 12.8906f)
                curveTo(12.7383f, 13.3008f, 12.8789f, 13.418f, 13.2891f, 13.418f)
                close()
                moveTo(17.1797f, 13.418f)
                lineTo(17.8711f, 13.418f)
                curveTo(18.2812f, 13.418f, 18.4219f, 13.3008f, 18.4219f, 12.8906f)
                lineTo(18.4219f, 12.1992f)
                curveTo(18.4219f, 11.7891f, 18.2812f, 11.6719f, 17.8711f, 11.6719f)
                lineTo(17.1797f, 11.6719f)
                curveTo(16.7695f, 11.6719f, 16.6406f, 11.7891f, 16.6406f, 12.1992f)
                lineTo(16.6406f, 12.8906f)
                curveTo(16.6406f, 13.3008f, 16.7695f, 13.418f, 17.1797f, 13.418f)
                close()
                moveTo(5.5078f, 17.2617f)
                lineTo(6.1875f, 17.2617f)
                curveTo(6.6094f, 17.2617f, 6.7383f, 17.1328f, 6.7383f, 16.7227f)
                lineTo(6.7383f, 16.0312f)
                curveTo(6.7383f, 15.6211f, 6.6094f, 15.5039f, 6.1875f, 15.5039f)
                lineTo(5.5078f, 15.5039f)
                curveTo(5.0859f, 15.5039f, 4.957f, 15.6211f, 4.957f, 16.0312f)
                lineTo(4.957f, 16.7227f)
                curveTo(4.957f, 17.1328f, 5.0859f, 17.2617f, 5.5078f, 17.2617f)
                close()
                moveTo(9.3984f, 17.2617f)
                lineTo(10.0898f, 17.2617f)
                curveTo(10.5f, 17.2617f, 10.6289f, 17.1328f, 10.6289f, 16.7227f)
                lineTo(10.6289f, 16.0312f)
                curveTo(10.6289f, 15.6211f, 10.5f, 15.5039f, 10.0898f, 15.5039f)
                lineTo(9.3984f, 15.5039f)
                curveTo(8.9883f, 15.5039f, 8.8477f, 15.6211f, 8.8477f, 16.0312f)
                lineTo(8.8477f, 16.7227f)
                curveTo(8.8477f, 17.1328f, 8.9883f, 17.2617f, 9.3984f, 17.2617f)
                close()
                moveTo(13.2891f, 17.2617f)
                lineTo(13.9805f, 17.2617f)
                curveTo(14.3906f, 17.2617f, 14.5312f, 17.1328f, 14.5312f, 16.7227f)
                lineTo(14.5312f, 16.0312f)
                curveTo(14.5312f, 15.6211f, 14.3906f, 15.5039f, 13.9805f, 15.5039f)
                lineTo(13.2891f, 15.5039f)
                curveTo(12.8789f, 15.5039f, 12.7383f, 15.6211f, 12.7383f, 16.0312f)
                lineTo(12.7383f, 16.7227f)
                curveTo(12.7383f, 17.1328f, 12.8789f, 17.2617f, 13.2891f, 17.2617f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
