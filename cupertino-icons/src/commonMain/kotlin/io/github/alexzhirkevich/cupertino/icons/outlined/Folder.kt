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

public val CupertinoIcons.Outlined.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 26.6133.dp, defaultHeight = 21.5977.dp,
                viewportWidth = 26.6133f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.4453f)
                lineTo(23.2852f, 21.4453f)
                curveTo(25.3828f, 21.4453f, 26.6133f, 20.2266f, 26.6133f, 17.8125f)
                lineTo(26.6133f, 5.7773f)
                curveTo(26.6133f, 3.3633f, 25.3711f, 2.1445f, 22.9336f, 2.1445f)
                lineTo(11.6836f, 2.1445f)
                curveTo(10.8867f, 2.1445f, 10.4062f, 1.957f, 9.8203f, 1.4531f)
                lineTo(9.1055f, 0.8672f)
                curveTo(8.332f, 0.2109f, 7.7344f, 0.0f, 6.5742f, 0.0f)
                lineTo(3.2344f, 0.0f)
                curveTo(1.1836f, 0.0f, 0.0f, 1.1719f, 0.0f, 3.5273f)
                lineTo(0.0f, 17.8125f)
                curveTo(0.0f, 20.2383f, 1.2305f, 21.4453f, 3.6797f, 21.4453f)
                close()
                moveTo(3.7031f, 19.5586f)
                curveTo(2.5313f, 19.5586f, 1.8867f, 18.9375f, 1.8867f, 17.7188f)
                lineTo(1.8867f, 3.6328f)
                curveTo(1.8867f, 2.4727f, 2.4961f, 1.875f, 3.6211f, 1.875f)
                lineTo(6.0938f, 1.875f)
                curveTo(6.8672f, 1.875f, 7.3359f, 2.0742f, 7.9336f, 2.5781f)
                lineTo(8.6484f, 3.1758f)
                curveTo(9.4102f, 3.8086f, 10.0312f, 4.0313f, 11.1914f, 4.0313f)
                lineTo(22.8984f, 4.0313f)
                curveTo(24.0586f, 4.0313f, 24.7266f, 4.6641f, 24.7266f, 5.8828f)
                lineTo(24.7266f, 17.7305f)
                curveTo(24.7266f, 18.9375f, 24.0586f, 19.5586f, 22.8984f, 19.5586f)
                close()
                moveTo(1.1484f, 8.3203f)
                lineTo(25.4531f, 8.3203f)
                lineTo(25.4531f, 6.5508f)
                lineTo(1.1484f, 6.5508f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
