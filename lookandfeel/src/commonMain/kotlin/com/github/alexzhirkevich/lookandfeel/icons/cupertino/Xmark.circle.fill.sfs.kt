package com.github.alexzhirkevich.lookandfeel.icons.cupertino

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SFSymbols.XmarkCircleFill: ImageVector
    get() {
        if (_xmark != null) {
            return _xmark!!
        }
        _xmark = Builder(name = "Xmark", defaultWidth = 19.9219.dp, defaultHeight = 19.9316.dp,
                viewportWidth = 19.9219f, viewportHeight = 19.9316f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(19.9219f)
                verticalLineToRelative(19.9316f)
                horizontalLineToRelative(-19.9219f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.85f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.9609f, 19.9219f)
                curveTo(15.4102f, 19.9219f, 19.9219f, 15.4004f, 19.9219f, 9.9609f)
                curveTo(19.9219f, 4.5117f, 15.4004f, 0.0f, 9.9512f, 0.0f)
                curveTo(4.5117f, 0.0f, 0.0f, 4.5117f, 0.0f, 9.9609f)
                curveTo(0.0f, 15.4004f, 4.5215f, 19.9219f, 9.9609f, 19.9219f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1e1e1e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6797f, 14.0625f)
                curveTo(6.2305f, 14.0625f, 5.8789f, 13.7012f, 5.8789f, 13.252f)
                curveTo(5.8789f, 13.0371f, 5.957f, 12.832f, 6.1133f, 12.6855f)
                lineTo(8.8184f, 9.9707f)
                lineTo(6.1133f, 7.2656f)
                curveTo(5.957f, 7.1094f, 5.8789f, 6.9141f, 5.8789f, 6.6992f)
                curveTo(5.8789f, 6.2402f, 6.2305f, 5.8984f, 6.6797f, 5.8984f)
                curveTo(6.9043f, 5.8984f, 7.0801f, 5.9766f, 7.2363f, 6.1231f)
                lineTo(9.9609f, 8.8379f)
                lineTo(12.7051f, 6.1133f)
                curveTo(12.8711f, 5.9473f, 13.0469f, 5.8789f, 13.2617f, 5.8789f)
                curveTo(13.7109f, 5.8789f, 14.0723f, 6.2305f, 14.0723f, 6.6797f)
                curveTo(14.0723f, 6.9043f, 14.0039f, 7.0801f, 13.8281f, 7.2559f)
                lineTo(11.1133f, 9.9707f)
                lineTo(13.8184f, 12.6758f)
                curveTo(13.9844f, 12.8223f, 14.0625f, 13.0273f, 14.0625f, 13.252f)
                curveTo(14.0625f, 13.7012f, 13.7012f, 14.0625f, 13.2422f, 14.0625f)
                curveTo(13.0176f, 14.0625f, 12.8125f, 13.9844f, 12.666f, 13.8281f)
                lineTo(9.9609f, 11.1133f)
                lineTo(7.2656f, 13.8281f)
                curveTo(7.1094f, 13.9844f, 6.9043f, 14.0625f, 6.6797f, 14.0625f)
                close()
            }
        }
        .build()
        return _xmark!!
    }

private var _xmark: ImageVector? = null
