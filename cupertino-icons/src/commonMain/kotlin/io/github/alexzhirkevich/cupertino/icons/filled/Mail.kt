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

public val CupertinoIcons.Filled.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 27.6328.dp, defaultHeight = 21.5742.dp,
                viewportWidth = 27.6328f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5664f, 7.1016f)
                curveTo(5.0977f, 7.1016f, 4.7578f, 6.7266f, 4.7578f, 6.2695f)
                curveTo(4.7578f, 5.8125f, 5.0977f, 5.4609f, 5.5664f, 5.4609f)
                lineTo(13.125f, 5.4609f)
                curveTo(13.582f, 5.4609f, 13.9453f, 5.8125f, 13.9453f, 6.2695f)
                curveTo(13.9453f, 6.7266f, 13.582f, 7.1016f, 13.125f, 7.1016f)
                close()
                moveTo(5.5664f, 10.2305f)
                curveTo(5.0977f, 10.2305f, 4.7578f, 9.8672f, 4.7578f, 9.4102f)
                curveTo(4.7578f, 8.9531f, 5.0977f, 8.5898f, 5.5664f, 8.5898f)
                lineTo(11.0977f, 8.5898f)
                curveTo(11.5547f, 8.5898f, 11.918f, 8.9531f, 11.918f, 9.4102f)
                curveTo(11.918f, 9.8672f, 11.5547f, 10.2305f, 11.0977f, 10.2305f)
                close()
                moveTo(20.0742f, 10.5469f)
                curveTo(18.5273f, 10.5469f, 17.2617f, 9.293f, 17.2617f, 7.7344f)
                curveTo(17.2617f, 6.1758f, 18.5273f, 4.9219f, 20.0742f, 4.9219f)
                curveTo(21.6211f, 4.9219f, 22.875f, 6.1758f, 22.875f, 7.7344f)
                curveTo(22.875f, 9.293f, 21.6211f, 10.5469f, 20.0742f, 10.5469f)
                close()
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
