package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.StarSlash: ImageVector
    get() {
        if (_starSlash != null) {
            return _starSlash!!
        }
        _starSlash = Builder(name = "StarSlash", defaultWidth = 26.0251.dp, defaultHeight =
                26.543.dp, viewportWidth = 26.0251f, viewportHeight = 26.543f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1261f, 6.2578f)
                lineTo(19.2082f, 15.3164f)
                lineTo(25.1378f, 11.0508f)
                curveTo(25.8644f, 10.5352f, 26.1574f, 9.9961f, 25.9699f, 9.4102f)
                curveTo(25.7824f, 8.8477f, 25.2316f, 8.5664f, 24.3293f, 8.5781f)
                lineTo(16.6535f, 8.625f)
                lineTo(14.3214f, 1.3008f)
                curveTo(14.0402f, 0.4336f, 13.6183f, 0.0f, 13.0089f, 0.0f)
                curveTo(12.4113f, 0.0f, 11.9894f, 0.4336f, 11.7082f, 1.3008f)
                close()
                moveTo(5.9308f, 8.6016f)
                lineTo(1.7004f, 8.5781f)
                curveTo(0.798f, 8.5664f, 0.2472f, 8.8477f, 0.0597f, 9.4102f)
                curveTo(-0.1395f, 9.9961f, 0.1652f, 10.5352f, 0.8918f, 11.0508f)
                lineTo(7.1496f, 15.5508f)
                lineTo(4.7003f, 22.8398f)
                curveTo(4.4074f, 23.6953f, 4.5128f, 24.293f, 4.9933f, 24.6562f)
                curveTo(5.4738f, 25.0312f, 6.0832f, 24.9023f, 6.8097f, 24.375f)
                lineTo(13.0089f, 19.8164f)
                lineTo(19.2199f, 24.375f)
                curveTo(19.9464f, 24.9023f, 20.5441f, 25.0312f, 21.0363f, 24.6562f)
                curveTo(21.2121f, 24.5273f, 21.3293f, 24.3633f, 21.2707f, 23.8828f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.1457f, 23.7773f)
                curveTo(23.4972f, 24.1289f, 24.0832f, 24.1289f, 24.423f, 23.7773f)
                curveTo(24.7628f, 23.4141f, 24.7746f, 22.8516f, 24.423f, 22.5f)
                lineTo(5.4503f, 3.5859f)
                curveTo(5.0988f, 3.2344f, 4.5128f, 3.2227f, 4.1613f, 3.5859f)
                curveTo(3.8214f, 3.9258f, 3.8214f, 4.5117f, 4.1613f, 4.8633f)
                close()
            }
        }
        .build()
        return _starSlash!!
    }

private var _starSlash: ImageVector? = null
