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

public val CupertinoIcons.Outlined.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 24.0572.dp, defaultHeight = 20.8008.dp,
                viewportWidth = 24.0572f, viewportHeight = 20.8008f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0651f, 7.0547f)
                curveTo(2.7525f, 6.5156f, 4.4987f, 6.2344f, 6.1627f, 6.2344f)
                curveTo(8.319f, 6.2344f, 9.901f, 6.5859f, 11.9401f, 6.5859f)
                curveTo(14.0494f, 6.5859f, 15.3619f, 5.1563f, 15.3619f, 3.293f)
                curveTo(15.3619f, 1.3828f, 13.8971f, 0.0117f, 12.0924f, 0.0117f)
                curveTo(10.7565f, 0.0117f, 9.5846f, 0.8555f, 9.0924f, 1.9688f)
                curveTo(8.9049f, 2.3555f, 8.9752f, 2.8008f, 9.3854f, 3.0117f)
                curveTo(9.7604f, 3.1992f, 10.2174f, 3.082f, 10.4635f, 2.6133f)
                curveTo(10.7213f, 2.0156f, 11.3541f, 1.5469f, 12.0924f, 1.5469f)
                curveTo(13.0651f, 1.5469f, 13.8268f, 2.2266f, 13.8268f, 3.293f)
                curveTo(13.8268f, 4.3594f, 13.0885f, 5.0625f, 11.9401f, 5.0625f)
                curveTo(9.9947f, 5.0625f, 8.3893f, 4.7109f, 6.1627f, 4.7109f)
                curveTo(4.2526f, 4.7109f, 2.319f, 5.0508f, 0.5963f, 5.6016f)
                curveTo(0.1041f, 5.7422f, -0.0834f, 6.1641f, 0.0338f, 6.5625f)
                curveTo(0.151f, 6.9727f, 0.5377f, 7.207f, 1.0651f, 7.0547f)
                close()
                moveTo(19.3932f, 12.5391f)
                curveTo(22.1236f, 12.5391f, 24.0572f, 10.8047f, 24.0572f, 8.3789f)
                curveTo(24.0572f, 5.9883f, 22.2174f, 4.2539f, 19.9322f, 4.2539f)
                curveTo(17.8111f, 4.2539f, 16.2408f, 5.7305f, 15.9596f, 7.6641f)
                curveTo(15.8893f, 8.1563f, 16.1588f, 8.543f, 16.5807f, 8.6016f)
                curveTo(17.0143f, 8.6602f, 17.3893f, 8.3906f, 17.483f, 7.8398f)
                curveTo(17.6822f, 6.6094f, 18.7018f, 5.7773f, 19.9322f, 5.7773f)
                curveTo(21.3619f, 5.7773f, 22.5221f, 6.8438f, 22.5221f, 8.3789f)
                curveTo(22.5221f, 9.9375f, 21.2916f, 11.0156f, 19.3932f, 11.0156f)
                curveTo(15.819f, 11.0156f, 11.9635f, 8.9766f, 7.276f, 8.9766f)
                curveTo(4.8619f, 8.9766f, 2.6588f, 9.3633f, 0.5963f, 10.0898f)
                curveTo(0.1158f, 10.2656f, -0.0834f, 10.6758f, 0.0338f, 11.0742f)
                curveTo(0.151f, 11.4844f, 0.5494f, 11.7305f, 1.0651f, 11.5547f)
                curveTo(2.9752f, 10.8281f, 4.9674f, 10.5117f, 7.276f, 10.5117f)
                curveTo(11.9518f, 10.5117f, 15.444f, 12.5391f, 19.3932f, 12.5391f)
                close()
                moveTo(11.9518f, 20.8008f)
                curveTo(13.7565f, 20.8008f, 15.151f, 19.4648f, 15.151f, 17.5547f)
                curveTo(15.151f, 14.7891f, 12.3268f, 13.2422f, 7.1237f, 13.2422f)
                curveTo(4.944f, 13.2422f, 2.5885f, 13.6641f, 0.5963f, 14.3438f)
                curveTo(0.1158f, 14.5195f, -0.0834f, 14.9297f, 0.0338f, 15.3281f)
                curveTo(0.151f, 15.7383f, 0.5494f, 15.9844f, 1.0651f, 15.8086f)
                curveTo(2.9283f, 15.1406f, 5.0143f, 14.7773f, 7.1237f, 14.7773f)
                curveTo(11.3776f, 14.7773f, 13.6276f, 15.8438f, 13.6276f, 17.5547f)
                curveTo(13.6276f, 18.6211f, 12.8776f, 19.2773f, 11.9518f, 19.2773f)
                curveTo(11.026f, 19.2773f, 10.4635f, 18.6562f, 10.2994f, 17.6719f)
                curveTo(10.2291f, 17.2383f, 9.9127f, 16.875f, 9.4088f, 16.9102f)
                curveTo(8.8815f, 16.9453f, 8.6705f, 17.3906f, 8.7408f, 17.8711f)
                curveTo(8.9518f, 19.5f, 10.1588f, 20.8008f, 11.9518f, 20.8008f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
