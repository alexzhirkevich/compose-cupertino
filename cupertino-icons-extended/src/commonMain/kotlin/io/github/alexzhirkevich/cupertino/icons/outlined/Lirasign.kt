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

public val CupertinoIcons.Outlined.Lirasign: ImageVector
    get() {
        if (_lirasign != null) {
            return _lirasign!!
        }
        _lirasign = Builder(name = "Lirasign", defaultWidth = 16.0078.dp, defaultHeight =
                21.3164.dp, viewportWidth = 16.0078f, viewportHeight = 21.3164f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0078f, 21.2695f)
                lineTo(14.9883f, 21.2695f)
                curveTo(15.5742f, 21.2695f, 16.0078f, 20.8828f, 16.0078f, 20.2969f)
                curveTo(16.0078f, 19.6992f, 15.5742f, 19.3359f, 14.9883f, 19.3359f)
                lineTo(3.7148f, 19.3359f)
                lineTo(3.7148f, 19.2773f)
                curveTo(5.3906f, 18.7148f, 6.6094f, 16.6641f, 6.6094f, 14.1211f)
                curveTo(6.6094f, 11.2031f, 5.3672f, 9.5273f, 5.3672f, 6.5625f)
                curveTo(5.3672f, 3.8438f, 7.2539f, 1.9922f, 10.5234f, 1.9922f)
                curveTo(12.5156f, 1.9922f, 13.418f, 2.5313f, 14.0625f, 2.5313f)
                curveTo(14.6602f, 2.5313f, 14.9414f, 2.1797f, 14.9414f, 1.6641f)
                curveTo(14.9414f, 1.1719f, 14.6484f, 0.832f, 13.9922f, 0.5625f)
                curveTo(12.9609f, 0.1523f, 11.7539f, 0.0f, 10.3477f, 0.0f)
                curveTo(5.8477f, 0.0f, 3.0703f, 2.625f, 3.0703f, 6.7266f)
                curveTo(3.0703f, 9.3633f, 4.4063f, 12.0234f, 4.4063f, 14.2148f)
                curveTo(4.4063f, 16.8633f, 2.8008f, 18.5977f, 0.9258f, 19.125f)
                curveTo(0.2813f, 19.3242f, 0.0f, 19.6641f, 0.0f, 20.2617f)
                curveTo(0.0f, 20.8477f, 0.4219f, 21.2695f, 1.0078f, 21.2695f)
                close()
                moveTo(0.1758f, 8.4727f)
                curveTo(0.1758f, 8.9531f, 0.5625f, 9.3281f, 1.0313f, 9.3281f)
                lineTo(12.457f, 9.3281f)
                curveTo(12.9258f, 9.3281f, 13.3125f, 8.9531f, 13.3125f, 8.4727f)
                curveTo(13.3125f, 7.9922f, 12.9258f, 7.6172f, 12.457f, 7.6172f)
                lineTo(1.0313f, 7.6172f)
                curveTo(0.5625f, 7.6172f, 0.1758f, 7.9922f, 0.1758f, 8.4727f)
                close()
                moveTo(0.1758f, 12.9375f)
                curveTo(0.1758f, 13.418f, 0.5625f, 13.793f, 1.0313f, 13.793f)
                lineTo(12.457f, 13.793f)
                curveTo(12.9258f, 13.793f, 13.3125f, 13.418f, 13.3125f, 12.9375f)
                curveTo(13.3125f, 12.457f, 12.9258f, 12.082f, 12.457f, 12.082f)
                lineTo(1.0313f, 12.082f)
                curveTo(0.5625f, 12.082f, 0.1758f, 12.457f, 0.1758f, 12.9375f)
                close()
            }
        }
        .build()
        return _lirasign!!
    }

private var _lirasign: ImageVector? = null
