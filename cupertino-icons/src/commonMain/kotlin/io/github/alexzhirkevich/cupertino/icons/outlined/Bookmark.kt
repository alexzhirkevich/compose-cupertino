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

public val CupertinoIcons.Outlined.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 15.7969.dp, defaultHeight =
                25.1836.dp, viewportWidth = 15.7969f, viewportHeight = 25.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2422f, 25.1367f)
                curveTo(1.8164f, 25.1367f, 2.1563f, 24.8086f, 3.2109f, 23.7891f)
                lineTo(7.793f, 19.2773f)
                curveTo(7.8516f, 19.2188f, 7.957f, 19.2188f, 8.0039f, 19.2773f)
                lineTo(12.5859f, 23.7891f)
                curveTo(13.6406f, 24.8086f, 13.9805f, 25.1367f, 14.5547f, 25.1367f)
                curveTo(15.3398f, 25.1367f, 15.7969f, 24.6211f, 15.7969f, 23.707f)
                lineTo(15.7969f, 3.3633f)
                curveTo(15.7969f, 1.1367f, 14.6836f, 0.0f, 12.4805f, 0.0f)
                lineTo(3.3164f, 0.0f)
                curveTo(1.1133f, 0.0f, 0.0f, 1.1367f, 0.0f, 3.3633f)
                lineTo(0.0f, 23.707f)
                curveTo(0.0f, 24.6211f, 0.457f, 25.1367f, 1.2422f, 25.1367f)
                close()
                moveTo(2.2031f, 21.9727f)
                curveTo(2.0391f, 22.1367f, 1.8516f, 22.0898f, 1.8516f, 21.8555f)
                lineTo(1.8516f, 3.3867f)
                curveTo(1.8516f, 2.3789f, 2.3789f, 1.8516f, 3.4102f, 1.8516f)
                lineTo(12.3984f, 1.8516f)
                curveTo(13.418f, 1.8516f, 13.9453f, 2.3789f, 13.9453f, 3.3867f)
                lineTo(13.9453f, 21.8555f)
                curveTo(13.9453f, 22.0898f, 13.7695f, 22.1367f, 13.5938f, 21.9727f)
                lineTo(8.5195f, 17.0508f)
                curveTo(8.1445f, 16.6875f, 7.6523f, 16.6875f, 7.2773f, 17.0508f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
