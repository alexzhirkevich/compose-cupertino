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

public val CupertinoIcons.Outlined.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.8525.dp, defaultHeight = 25.1045.dp,
                viewportWidth = 24.8525f, viewportHeight = 25.1045f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5728f, 7.6245f)
                lineTo(11.0142f, 9.2065f)
                curveTo(12.561f, 9.3355f, 13.5688f, 9.7925f, 14.3306f, 10.5542f)
                curveTo(16.3813f, 12.605f, 16.3696f, 15.5112f, 14.3423f, 17.5386f)
                lineTo(10.5103f, 21.3589f)
                curveTo(8.4712f, 23.398f, 5.5884f, 23.4097f, 3.5376f, 21.3706f)
                curveTo(1.4868f, 19.3081f, 1.4985f, 16.4253f, 3.5376f, 14.3862f)
                lineTo(5.8345f, 12.0894f)
                curveTo(5.5064f, 11.3511f, 5.4243f, 10.4722f, 5.5532f, 9.7105f)
                lineTo(2.1079f, 13.144f)
                curveTo(-0.6929f, 15.9565f, -0.7163f, 19.9409f, 2.1196f, 22.7769f)
                curveTo(4.9673f, 25.6245f, 8.9517f, 25.6011f, 11.7524f, 22.8003f)
                lineTo(15.7603f, 18.7808f)
                curveTo(18.5728f, 15.9683f, 18.5962f, 11.9839f, 15.7485f, 9.148f)
                curveTo(15.0103f, 8.4097f, 14.0728f, 7.8823f, 12.5728f, 7.6245f)
                close()
                moveTo(12.2798f, 17.2808f)
                lineTo(13.8384f, 15.6987f)
                curveTo(12.2915f, 15.5815f, 11.2837f, 15.1128f, 10.522f, 14.3511f)
                curveTo(8.4712f, 12.3003f, 8.4829f, 9.394f, 10.5103f, 7.3667f)
                lineTo(14.3306f, 3.5464f)
                curveTo(16.3813f, 1.5073f, 19.2642f, 1.4956f, 21.3149f, 3.5464f)
                curveTo(23.3657f, 5.5972f, 23.3423f, 8.4917f, 21.3149f, 10.519f)
                lineTo(19.0181f, 12.8159f)
                curveTo(19.3462f, 13.5659f, 19.4165f, 14.4331f, 19.2993f, 15.1948f)
                lineTo(22.7446f, 11.7612f)
                curveTo(25.5454f, 8.9487f, 25.5688f, 4.9761f, 22.7329f, 2.1284f)
                curveTo(19.8853f, -0.7192f, 15.9009f, -0.6958f, 13.0884f, 2.1167f)
                lineTo(9.0923f, 6.1245f)
                curveTo(6.2798f, 8.937f, 6.2564f, 12.9214f, 9.104f, 15.7573f)
                curveTo(9.8423f, 16.4956f, 10.7798f, 17.023f, 12.2798f, 17.2808f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
