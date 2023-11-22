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

public val CupertinoIcons.Outlined.PhotoStack: ImageVector
    get() {
        if (_photoStack != null) {
            return _photoStack!!
        }
        _photoStack = Builder(name = "PhotoStack", defaultWidth = 24.5508.dp, defaultHeight =
                25.9805.dp, viewportWidth = 24.5508f, viewportHeight = 25.9805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8438f, 25.6172f)
                lineTo(20.7305f, 25.6172f)
                curveTo(22.9336f, 25.6172f, 24.0938f, 24.4922f, 24.0938f, 22.2891f)
                lineTo(24.0938f, 21.4805f)
                lineTo(18.2461f, 15.9492f)
                curveTo(17.7539f, 15.4922f, 17.1445f, 15.2695f, 16.5352f, 15.2695f)
                curveTo(15.9141f, 15.2695f, 15.3633f, 15.4688f, 14.8359f, 15.9375f)
                lineTo(9.7383f, 20.4375f)
                lineTo(7.6992f, 18.6211f)
                curveTo(7.2188f, 18.1875f, 6.7148f, 17.9648f, 6.1758f, 17.9648f)
                curveTo(5.6719f, 17.9648f, 5.2031f, 18.1992f, 4.7227f, 18.6094f)
                lineTo(0.4688f, 22.2891f)
                curveTo(0.4688f, 24.4922f, 1.6406f, 25.6172f, 3.8438f, 25.6172f)
                close()
                moveTo(8.8242f, 16.2305f)
                curveTo(10.3008f, 16.2305f, 11.5078f, 15.0f, 11.5078f, 13.5352f)
                curveTo(11.5078f, 12.0703f, 10.3008f, 10.8633f, 8.8242f, 10.8633f)
                curveTo(7.3477f, 10.8633f, 6.1523f, 12.0703f, 6.1523f, 13.5352f)
                curveTo(6.1523f, 15.0f, 7.3477f, 16.2305f, 8.8242f, 16.2305f)
                close()
                moveTo(3.6797f, 25.9453f)
                lineTo(20.8711f, 25.9453f)
                curveTo(23.3086f, 25.9453f, 24.5508f, 24.7266f, 24.5508f, 22.3125f)
                lineTo(24.5508f, 10.2773f)
                curveTo(24.5508f, 7.8633f, 23.3086f, 6.6445f, 20.8711f, 6.6445f)
                lineTo(3.6797f, 6.6445f)
                curveTo(1.2188f, 6.6445f, 0.0f, 7.8633f, 0.0f, 10.2773f)
                lineTo(0.0f, 22.3125f)
                curveTo(0.0f, 24.7266f, 1.2188f, 25.9453f, 3.6797f, 25.9453f)
                close()
                moveTo(3.7031f, 24.0586f)
                curveTo(2.5313f, 24.0586f, 1.8867f, 23.4258f, 1.8867f, 22.207f)
                lineTo(1.8867f, 10.3828f)
                curveTo(1.8867f, 9.1641f, 2.5313f, 8.5313f, 3.7031f, 8.5313f)
                lineTo(20.8359f, 8.5313f)
                curveTo(21.9961f, 8.5313f, 22.6641f, 9.1641f, 22.6641f, 10.3828f)
                lineTo(22.6641f, 22.207f)
                curveTo(22.6641f, 23.4258f, 21.9961f, 24.0586f, 20.8359f, 24.0586f)
                close()
                moveTo(2.4727f, 4.7578f)
                lineTo(22.0898f, 4.7578f)
                curveTo(21.9141f, 3.6914f, 21.4102f, 3.1055f, 20.2383f, 3.1055f)
                lineTo(4.3242f, 3.1055f)
                curveTo(3.1523f, 3.1055f, 2.6484f, 3.6914f, 2.4727f, 4.7578f)
                close()
                moveTo(4.8867f, 1.5117f)
                lineTo(19.6758f, 1.5117f)
                curveTo(19.6055f, 0.5156f, 19.043f, 0.0f, 17.9531f, 0.0f)
                lineTo(6.5977f, 0.0f)
                curveTo(5.5195f, 0.0f, 4.957f, 0.5156f, 4.8867f, 1.5117f)
                close()
            }
        }
        .build()
        return _photoStack!!
    }

private var _photoStack: ImageVector? = null
