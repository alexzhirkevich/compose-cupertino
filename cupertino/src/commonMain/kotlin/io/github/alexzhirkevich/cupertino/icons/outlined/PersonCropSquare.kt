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

public val CupertinoIcons.Outlined.PersonCropSquare: ImageVector
    get() {
        if (_personCropSquare != null) {
            return _personCropSquare!!
        }
        _personCropSquare = Builder(name = "PersonCropSquare", defaultWidth = 21.5742.dp,
                defaultHeight = 21.5977.dp, viewportWidth = 21.5742f, viewportHeight =
                21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(17.8945f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3789f, 21.5742f, 17.9648f)
                lineTo(21.5742f, 3.6563f)
                curveTo(21.5742f, 1.2422f, 20.3555f, 0.0234f, 17.8945f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(3.7031f, 19.7109f)
                curveTo(2.5313f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(17.8711f, 1.9102f)
                curveTo(19.0312f, 1.9102f, 19.6875f, 2.5313f, 19.6875f, 3.75f)
                lineTo(19.6875f, 17.8711f)
                curveTo(19.6875f, 19.0898f, 19.0312f, 19.7109f, 17.8711f, 19.7109f)
                close()
                moveTo(2.7305f, 20.4023f)
                lineTo(18.8672f, 20.4023f)
                curveTo(18.1758f, 17.1094f, 14.8711f, 14.7188f, 10.8047f, 14.7188f)
                curveTo(6.7266f, 14.7188f, 3.4219f, 17.1094f, 2.7305f, 20.4023f)
                close()
                moveTo(10.793f, 12.7617f)
                curveTo(13.0312f, 12.7852f, 14.8008f, 10.875f, 14.8008f, 8.3672f)
                curveTo(14.8008f, 6.0117f, 13.0312f, 4.0664f, 10.793f, 4.0664f)
                curveTo(8.5547f, 4.0664f, 6.7734f, 6.0117f, 6.7852f, 8.3672f)
                curveTo(6.7969f, 10.875f, 8.5547f, 12.7383f, 10.793f, 12.7617f)
                close()
            }
        }
        .build()
        return _personCropSquare!!
    }

private var _personCropSquare: ImageVector? = null
