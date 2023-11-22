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

public val CupertinoIcons.Filled.RecordCircle: ImageVector
    get() {
        if (_recordCircle != null) {
            return _recordCircle!!
        }
        _recordCircle = Builder(name = "RecordCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9766f, 16.6758f)
                curveTo(9.3516f, 16.6758f, 7.2305f, 14.5547f, 7.2305f, 11.9297f)
                curveTo(7.2305f, 9.3164f, 9.3516f, 7.207f, 11.9766f, 7.207f)
                curveTo(14.5898f, 7.207f, 16.7109f, 9.3164f, 16.7109f, 11.9297f)
                curveTo(16.7109f, 14.5547f, 14.5898f, 16.6758f, 11.9766f, 16.6758f)
                close()
            }
        }
        .build()
        return _recordCircle!!
    }

private var _recordCircle: ImageVector? = null
