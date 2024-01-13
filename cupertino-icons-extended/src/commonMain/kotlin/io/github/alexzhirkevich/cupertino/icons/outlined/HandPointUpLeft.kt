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

public val CupertinoIcons.Outlined.HandPointUpLeft: ImageVector
    get() {
        if (_handPointUpLeft != null) {
            return _handPointUpLeft!!
        }
        _handPointUpLeft = Builder(name = "HandPointUpLeft", defaultWidth = 20.4681.dp,
                defaultHeight = 22.8855.dp, viewportWidth = 20.4681f, viewportHeight =
                22.8855f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0083f, 22.2884f)
                curveTo(19.6607f, 20.6009f, 21.6411f, 16.3353f, 19.7661f, 11.1791f)
                lineTo(18.8989f, 8.7767f)
                curveTo(17.9732f, 6.2338f, 16.2271f, 5.1908f, 14.1763f, 5.9056f)
                curveTo(13.6255f, 5.1908f, 12.7817f, 4.9447f, 11.8677f, 5.2728f)
                curveTo(11.5278f, 5.4017f, 11.2349f, 5.5775f, 10.9536f, 5.7884f)
                curveTo(10.356f, 5.015f, 9.4302f, 4.7338f, 8.4692f, 5.0736f)
                curveTo(8.2114f, 5.1673f, 7.9653f, 5.308f, 7.731f, 5.472f)
                lineTo(6.395f, 1.8158f)
                curveTo(5.8911f, 0.4213f, 4.6255f, -0.1647f, 3.3247f, 0.3041f)
                curveTo(2.0122f, 0.7845f, 1.4263f, 2.0384f, 1.9302f, 3.433f)
                lineTo(5.27f, 12.6205f)
                curveTo(5.2935f, 12.6791f, 5.2818f, 12.7259f, 5.2231f, 12.7494f)
                curveTo(5.188f, 12.7728f, 5.1411f, 12.7494f, 5.106f, 12.7142f)
                lineTo(3.7349f, 11.2142f)
                curveTo(3.0552f, 10.4877f, 2.2349f, 10.265f, 1.4497f, 10.5463f)
                curveTo(0.3833f, 10.9447f, -0.3081f, 11.9642f, 0.1372f, 13.1713f)
                curveTo(0.2427f, 13.5111f, 0.4771f, 13.9213f, 0.7466f, 14.2611f)
                lineTo(4.6724f, 19.0072f)
                curveTo(7.6372f, 22.5931f, 11.1177f, 23.7064f, 15.0083f, 22.2884f)
                close()
                moveTo(14.5044f, 20.7533f)
                curveTo(11.4341f, 21.8783f, 8.5513f, 21.3041f, 5.8443f, 18.0345f)
                lineTo(1.9185f, 13.3119f)
                curveTo(1.8013f, 13.1713f, 1.7192f, 13.0424f, 1.6489f, 12.8431f)
                curveTo(1.5083f, 12.4681f, 1.6724f, 12.0345f, 2.1177f, 11.8705f)
                curveTo(2.4927f, 11.7416f, 2.7857f, 11.8822f, 3.0903f, 12.1986f)
                lineTo(5.8091f, 14.9994f)
                curveTo(6.2544f, 15.4681f, 6.6528f, 15.515f, 7.0396f, 15.3744f)
                curveTo(7.5083f, 15.2103f, 7.6958f, 14.7181f, 7.5083f, 14.2142f)
                lineTo(3.3599f, 2.8002f)
                curveTo(3.1841f, 2.3314f, 3.395f, 1.8861f, 3.8403f, 1.722f)
                curveTo(4.2974f, 1.558f, 4.7193f, 1.7806f, 4.895f, 2.2494f)
                lineTo(7.8599f, 10.3939f)
                curveTo(8.0005f, 10.7806f, 8.4341f, 10.9564f, 8.8208f, 10.8158f)
                curveTo(9.1958f, 10.6752f, 9.395f, 10.265f, 9.2661f, 9.89f)
                lineTo(8.188f, 6.9486f)
                curveTo(8.3521f, 6.7963f, 8.5747f, 6.6439f, 8.7974f, 6.5619f)
                curveTo(9.3482f, 6.3627f, 9.8052f, 6.6088f, 10.0161f, 7.183f)
                lineTo(10.9536f, 9.7494f)
                curveTo(11.0942f, 10.1478f, 11.5278f, 10.3002f, 11.9028f, 10.1595f)
                curveTo(12.2661f, 10.0306f, 12.5005f, 9.6439f, 12.3482f, 9.2338f)
                lineTo(11.5864f, 7.1478f)
                curveTo(11.7505f, 6.9955f, 11.9732f, 6.8431f, 12.1958f, 6.7611f)
                curveTo(12.7466f, 6.5619f, 13.2036f, 6.808f, 13.4146f, 7.3822f)
                lineTo(14.0357f, 9.0931f)
                curveTo(14.188f, 9.5033f, 14.6216f, 9.6556f, 14.9966f, 9.515f)
                curveTo(15.3599f, 9.3861f, 15.5825f, 8.9877f, 15.4419f, 8.5892f)
                lineTo(14.9732f, 7.3236f)
                curveTo(15.9575f, 6.972f, 16.8833f, 7.7689f, 17.5161f, 9.5267f)
                lineTo(18.2544f, 11.5306f)
                curveTo(19.8599f, 15.9603f, 18.4067f, 19.3353f, 14.5044f, 20.7533f)
                close()
            }
        }
        .build()
        return _handPointUpLeft!!
    }

private var _handPointUpLeft: ImageVector? = null
