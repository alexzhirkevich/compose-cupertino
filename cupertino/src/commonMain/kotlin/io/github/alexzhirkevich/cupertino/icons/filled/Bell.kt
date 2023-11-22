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

public val CupertinoIcons.Filled.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 22.1133.dp, defaultHeight = 24.668.dp,
                viewportWidth = 22.1133f, viewportHeight = 24.668f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7695f, 19.9688f)
                lineTo(20.3438f, 19.9688f)
                curveTo(21.4453f, 19.9688f, 22.1133f, 19.4062f, 22.1133f, 18.5508f)
                curveTo(22.1133f, 17.3789f, 20.918f, 16.3242f, 19.9102f, 15.2812f)
                curveTo(19.1367f, 14.4727f, 18.9258f, 12.8086f, 18.832f, 11.4609f)
                curveTo(18.75f, 6.9609f, 17.5547f, 3.8672f, 14.4375f, 2.7422f)
                curveTo(13.9922f, 1.207f, 12.7852f, 0.0f, 11.0508f, 0.0f)
                curveTo(9.3281f, 0.0f, 8.1094f, 1.207f, 7.6758f, 2.7422f)
                curveTo(4.5586f, 3.8672f, 3.3633f, 6.9609f, 3.2813f, 11.4609f)
                curveTo(3.1875f, 12.8086f, 2.9766f, 14.4727f, 2.2031f, 15.2812f)
                curveTo(1.1836f, 16.3242f, 0.0f, 17.3789f, 0.0f, 18.5508f)
                curveTo(0.0f, 19.4062f, 0.6563f, 19.9688f, 1.7695f, 19.9688f)
                close()
                moveTo(11.0508f, 24.668f)
                curveTo(13.043f, 24.668f, 14.4961f, 23.2148f, 14.6484f, 21.5742f)
                lineTo(7.4648f, 21.5742f)
                curveTo(7.6172f, 23.2148f, 9.0703f, 24.668f, 11.0508f, 24.668f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
