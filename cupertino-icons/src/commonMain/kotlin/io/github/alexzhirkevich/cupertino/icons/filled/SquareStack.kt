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

public val CupertinoIcons.Filled.SquareStack: ImageVector
    get() {
        if (_squareStack != null) {
            return _squareStack!!
        }
        _squareStack = Builder(name = "SquareStack", defaultWidth = 20.5547.dp, defaultHeight =
                27.2227.dp, viewportWidth = 20.5547f, viewportHeight = 27.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 27.2227f)
                lineTo(17.2266f, 27.2227f)
                curveTo(19.3242f, 27.2227f, 20.5547f, 26.0039f, 20.5547f, 23.5898f)
                lineTo(20.5547f, 10.3008f)
                curveTo(20.5547f, 7.8867f, 19.3125f, 6.668f, 16.875f, 6.668f)
                lineTo(3.6797f, 6.668f)
                curveTo(1.2305f, 6.668f, 0.0f, 7.875f, 0.0f, 10.3008f)
                lineTo(0.0f, 23.5898f)
                curveTo(0.0f, 26.0039f, 1.2305f, 27.2227f, 3.6797f, 27.2227f)
                close()
                moveTo(2.5547f, 4.7813f)
                lineTo(17.9883f, 4.7813f)
                curveTo(17.8125f, 3.7148f, 17.3086f, 3.1289f, 16.1367f, 3.1289f)
                lineTo(4.4063f, 3.1289f)
                curveTo(3.2344f, 3.1289f, 2.7305f, 3.7148f, 2.5547f, 4.7813f)
                close()
                moveTo(4.5938f, 1.5352f)
                lineTo(15.9609f, 1.5352f)
                curveTo(15.8906f, 0.5391f, 15.3164f, 0.0234f, 14.2383f, 0.0234f)
                lineTo(6.3047f, 0.0234f)
                curveTo(5.2266f, 0.0234f, 4.6641f, 0.5391f, 4.5938f, 1.5352f)
                close()
            }
        }
        .build()
        return _squareStack!!
    }

private var _squareStack: ImageVector? = null
