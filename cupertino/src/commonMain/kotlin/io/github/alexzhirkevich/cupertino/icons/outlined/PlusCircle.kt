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

public val CupertinoIcons.Outlined.PlusCircle: ImageVector
    get() {
        if (_plusCircle != null) {
            return _plusCircle!!
        }
        _plusCircle = Builder(name = "PlusCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(23.9062f)
                verticalLineToRelative(23.918f)
                horizontalLineToRelative(-23.9062f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5156f, 11.9531f)
                curveTo(6.5156f, 12.5273f, 6.9141f, 12.9141f, 7.5117f, 12.9141f)
                lineTo(10.957f, 12.9141f)
                lineTo(10.957f, 16.3711f)
                curveTo(10.957f, 16.957f, 11.3555f, 17.3672f, 11.9297f, 17.3672f)
                curveTo(12.5156f, 17.3672f, 12.9258f, 16.9688f, 12.9258f, 16.3711f)
                lineTo(12.9258f, 12.9141f)
                lineTo(16.3828f, 12.9141f)
                curveTo(16.9688f, 12.9141f, 17.3789f, 12.5273f, 17.3789f, 11.9531f)
                curveTo(17.3789f, 11.3672f, 16.9688f, 10.957f, 16.3828f, 10.957f)
                lineTo(12.9258f, 10.957f)
                lineTo(12.9258f, 7.5117f)
                curveTo(12.9258f, 6.9141f, 12.5156f, 6.5039f, 11.9297f, 6.5039f)
                curveTo(11.3555f, 6.5039f, 10.957f, 6.9141f, 10.957f, 7.5117f)
                lineTo(10.957f, 10.957f)
                lineTo(7.5117f, 10.957f)
                curveTo(6.9141f, 10.957f, 6.5156f, 11.3672f, 6.5156f, 11.9531f)
                close()
            }
        }
        .build()
        return _plusCircle!!
    }

private var _plusCircle: ImageVector? = null
