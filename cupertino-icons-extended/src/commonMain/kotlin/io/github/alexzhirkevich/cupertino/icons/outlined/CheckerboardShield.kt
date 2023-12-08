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

public val CupertinoIcons.Outlined.CheckerboardShield: ImageVector
    get() {
        if (_checkerboardShield != null) {
            return _checkerboardShield!!
        }
        _checkerboardShield = Builder(name = "CheckerboardShield", defaultWidth = 19.4766.dp,
                defaultHeight = 24.293.dp, viewportWidth = 19.4766f, viewportHeight =
                24.293f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.4609f)
                curveTo(0.0f, 18.7383f, 2.2969f, 20.3086f, 8.9531f, 24.0586f)
                curveTo(9.2578f, 24.2227f, 9.5508f, 24.293f, 9.7383f, 24.293f)
                curveTo(9.9258f, 24.293f, 10.2305f, 24.2227f, 10.5234f, 24.0586f)
                curveTo(17.1914f, 20.3203f, 19.4766f, 18.7383f, 19.4766f, 14.4609f)
                lineTo(19.4766f, 5.4961f)
                curveTo(19.4766f, 4.2656f, 18.9492f, 3.8789f, 17.9531f, 3.457f)
                curveTo(16.5703f, 2.8828f, 12.1055f, 1.2773f, 10.7227f, 0.7969f)
                curveTo(10.4062f, 0.6914f, 10.0664f, 0.6211f, 9.7383f, 0.6211f)
                curveTo(9.4102f, 0.6211f, 9.0703f, 0.7148f, 8.7656f, 0.7969f)
                curveTo(7.3828f, 1.1953f, 2.9063f, 2.8945f, 1.5234f, 3.457f)
                curveTo(0.5391f, 3.8672f, 0.0f, 4.2656f, 0.0f, 5.4961f)
                close()
                moveTo(1.8633f, 14.0273f)
                lineTo(1.8633f, 12.1406f)
                lineTo(9.7383f, 12.1406f)
                lineTo(9.7383f, 2.5078f)
                curveTo(9.8672f, 2.5078f, 10.0195f, 2.543f, 10.207f, 2.6133f)
                curveTo(11.9766f, 3.3164f, 15.4102f, 4.5586f, 17.2266f, 5.1797f)
                curveTo(17.543f, 5.2969f, 17.6133f, 5.4609f, 17.6133f, 5.8594f)
                lineTo(17.6133f, 12.1406f)
                lineTo(9.7383f, 12.1406f)
                lineTo(9.7383f, 22.1719f)
                curveTo(9.5508f, 22.1719f, 9.3633f, 22.1016f, 9.0117f, 21.8906f)
                curveTo(3.5977f, 18.6094f, 1.8633f, 17.6484f, 1.8633f, 14.0273f)
                close()
            }
        }
        .build()
        return _checkerboardShield!!
    }

private var _checkerboardShield: ImageVector? = null
