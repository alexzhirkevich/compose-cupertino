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

public val CupertinoIcons.Outlined.Burn: ImageVector
    get() {
        if (_burn != null) {
            return _burn!!
        }
        _burn = Builder(name = "Burn", defaultWidth = 23.9062.dp, defaultHeight = 23.918.dp,
                viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                close()
                moveTo(2.0039f, 11.9531f)
                lineTo(11.9297f, 11.9531f)
                lineTo(6.9609f, 3.3164f)
                curveTo(8.4141f, 2.4609f, 10.125f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(13.7578f, 1.9922f, 15.4688f, 2.4609f, 16.9219f, 3.3164f)
                lineTo(11.9297f, 11.9531f)
                lineTo(21.9141f, 11.9531f)
                curveTo(21.9258f, 15.668f, 19.9219f, 18.8906f, 16.9336f, 20.5898f)
                lineTo(11.9297f, 11.9531f)
                lineTo(6.9609f, 20.5781f)
                curveTo(3.9844f, 18.8672f, 2.0039f, 15.6562f, 2.0039f, 11.9531f)
                close()
            }
        }
        .build()
        return _burn!!
    }

private var _burn: ImageVector? = null
