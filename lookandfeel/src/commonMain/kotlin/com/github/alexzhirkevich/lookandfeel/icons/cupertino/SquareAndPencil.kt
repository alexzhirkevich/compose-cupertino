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


public val SFSymbols.SquareAndPencil: ImageVector
    get() {
        if (_squareandpencil != null) {
            return _squareandpencil!!
        }
        _squareandpencil = Builder(name = "Squareandpencil", defaultWidth = 19.3213.dp,
                defaultHeight = 20.6396.dp, viewportWidth = 19.3213f, viewportHeight =
                20.6396f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(19.3213f)
                verticalLineToRelative(20.6396f)
                horizontalLineToRelative(-19.3213f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.85f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0664f, 19.2895f)
                lineTo(14.5312f, 19.2895f)
                curveTo(16.2891f, 19.2895f, 17.3047f, 18.2739f, 17.3047f, 16.2622f)
                lineTo(17.3047f, 5.8227f)
                lineTo(15.7324f, 7.395f)
                lineTo(15.7324f, 16.184f)
                curveTo(15.7324f, 17.1997f, 15.1855f, 17.7172f, 14.5117f, 17.7172f)
                lineTo(3.0957f, 17.7172f)
                curveTo(2.1191f, 17.7172f, 1.5723f, 17.1997f, 1.5723f, 16.184f)
                lineTo(1.5723f, 5.1f)
                curveTo(1.5723f, 4.0844f, 2.1191f, 3.5571f, 3.0957f, 3.5571f)
                lineTo(11.9922f, 3.5571f)
                lineTo(13.5645f, 1.9848f)
                lineTo(3.0664f, 1.9848f)
                curveTo(1.0352f, 1.9848f, 0.0f, 3.0004f, 0.0f, 5.0122f)
                lineTo(0.0f, 16.2622f)
                curveTo(0.0f, 18.2836f, 1.0352f, 19.2895f, 3.0664f, 19.2895f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.85f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.6211f, 12.9614f)
                lineTo(8.5254f, 12.1313f)
                lineTo(17.6465f, 3.02f)
                lineTo(16.3086f, 1.7016f)
                lineTo(7.1973f, 10.8129f)
                lineTo(6.3184f, 12.6489f)
                curveTo(6.2402f, 12.8149f, 6.4356f, 13.0395f, 6.6211f, 12.9614f)
                close()
                moveTo(18.3691f, 2.3071f)
                lineTo(19.0723f, 1.5844f)
                curveTo(19.4043f, 1.2329f, 19.4043f, 0.7641f, 19.0723f, 0.4418f)
                lineTo(18.8477f, 0.2075f)
                curveTo(18.5449f, -0.0953f, 18.0664f, -0.0562f, 17.7441f, 0.2563f)
                lineTo(17.0312f, 0.9594f)
                close()
            }
        }
        .build()
        return _squareandpencil!!
    }

private var _squareandpencil: ImageVector? = null
