package io.github.alexzhirkevich.cupertino.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.XmarkIcloud: ImageVector
    get() {
        if (_xmarkIcloud != null) {
            return _xmarkIcloud!!
        }
        _xmarkIcloud = Builder(name = "XmarkIcloud", defaultWidth = 29.4609.dp, defaultHeight =
                22.2773.dp, viewportWidth = 29.4609f, viewportHeight = 22.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.1562f, 20.3672f)
                curveTo(26.6953f, 20.3672f, 29.4609f, 17.7773f, 29.4609f, 14.5547f)
                curveTo(29.4609f, 12.0938f, 28.043f, 9.9609f, 25.7578f, 9.0f)
                curveTo(25.7812f, 3.7734f, 22.0195f, 0.0f, 17.2266f, 0.0f)
                curveTo(14.0508f, 0.0f, 11.7891f, 1.6992f, 10.3828f, 3.75f)
                curveTo(7.5f, 2.9063f, 4.3594f, 5.0977f, 4.3008f, 8.3789f)
                curveTo(1.6523f, 8.8008f, 0.0f, 11.168f, 0.0f, 14.0273f)
                curveTo(0.0f, 17.4727f, 3.0117f, 20.3672f, 7.0195f, 20.3672f)
                close()
                moveTo(23.1562f, 18.4805f)
                lineTo(7.0195f, 18.4805f)
                curveTo(4.0664f, 18.4805f, 1.8867f, 16.418f, 1.8867f, 14.0273f)
                curveTo(1.8867f, 11.6836f, 3.3047f, 9.8203f, 5.7891f, 9.8203f)
                curveTo(5.9531f, 9.8203f, 6.0117f, 9.7383f, 6.0117f, 9.5859f)
                curveTo(6.0117f, 5.9766f, 8.6133f, 4.9102f, 11.0156f, 5.6953f)
                curveTo(11.1562f, 5.7422f, 11.2383f, 5.707f, 11.3086f, 5.5781f)
                curveTo(12.4453f, 3.5508f, 14.1914f, 1.8867f, 17.2266f, 1.8867f)
                curveTo(21.0703f, 1.8867f, 23.7305f, 4.9336f, 23.9297f, 8.4141f)
                curveTo(23.9648f, 8.9531f, 23.9297f, 9.5859f, 23.8828f, 10.1367f)
                curveTo(23.8711f, 10.2891f, 23.9297f, 10.3711f, 24.0703f, 10.4062f)
                curveTo(26.2031f, 10.875f, 27.5742f, 12.4336f, 27.5742f, 14.5547f)
                curveTo(27.5742f, 16.7344f, 25.6523f, 18.4805f, 23.1562f, 18.4805f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4805f, 15.0938f)
                lineTo(14.7305f, 12.8438f)
                lineTo(16.9805f, 15.0938f)
                curveTo(17.332f, 15.4336f, 17.8125f, 15.3633f, 18.1289f, 15.0703f)
                curveTo(18.4336f, 14.7656f, 18.5039f, 14.2734f, 18.1641f, 13.9336f)
                lineTo(15.9023f, 11.6719f)
                lineTo(18.1641f, 9.4102f)
                curveTo(18.5039f, 9.0703f, 18.4336f, 8.5898f, 18.1289f, 8.2734f)
                curveTo(17.8359f, 7.9688f, 17.332f, 7.8984f, 16.9805f, 8.25f)
                lineTo(14.7305f, 10.5f)
                lineTo(12.4805f, 8.25f)
                curveTo(12.1406f, 7.9102f, 11.6484f, 7.9805f, 11.3438f, 8.2734f)
                curveTo(11.0273f, 8.5781f, 10.9688f, 9.0703f, 11.3086f, 9.4102f)
                lineTo(13.5586f, 11.6719f)
                lineTo(11.3086f, 13.9336f)
                curveTo(10.9688f, 14.2734f, 11.0391f, 14.7539f, 11.332f, 15.0586f)
                curveTo(11.6367f, 15.375f, 12.1406f, 15.4336f, 12.4805f, 15.0938f)
                close()
            }
        }
        .build()
        return _xmarkIcloud!!
    }

private var _xmarkIcloud: ImageVector? = null
