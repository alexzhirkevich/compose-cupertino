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

public val CupertinoIcons.Outlined.Barcode: ImageVector
    get() {
        if (_barcode != null) {
            return _barcode!!
        }
        _barcode = Builder(name = "Barcode", defaultWidth = 22.7461.dp, defaultHeight = 18.082.dp,
                viewportWidth = 22.7461f, viewportHeight = 18.082f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.0f)
                lineTo(1.9102f, 18.0f)
                lineTo(1.9102f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(3.7617f, 18.0f)
                lineTo(4.8516f, 18.0f)
                lineTo(4.8516f, 0.0f)
                lineTo(3.7617f, 0.0f)
                close()
                moveTo(6.6797f, 18.0f)
                lineTo(9.7969f, 18.0f)
                lineTo(9.7969f, 0.0f)
                lineTo(6.6797f, 0.0f)
                close()
                moveTo(10.9336f, 18.0f)
                lineTo(12.9258f, 18.0f)
                lineTo(12.9258f, 0.0f)
                lineTo(10.9336f, 0.0f)
                close()
                moveTo(14.1094f, 18.0f)
                lineTo(17.2031f, 18.0f)
                lineTo(17.2031f, 0.0f)
                lineTo(14.1094f, 0.0f)
                close()
                moveTo(18.1523f, 18.0f)
                lineTo(20.5781f, 18.0f)
                lineTo(20.5781f, 0.0f)
                lineTo(18.1523f, 0.0f)
                close()
                moveTo(21.1758f, 18.0f)
                lineTo(22.7461f, 18.0f)
                lineTo(22.7461f, 0.0f)
                lineTo(21.1758f, 0.0f)
                close()
            }
        }
        .build()
        return _barcode!!
    }

private var _barcode: ImageVector? = null
