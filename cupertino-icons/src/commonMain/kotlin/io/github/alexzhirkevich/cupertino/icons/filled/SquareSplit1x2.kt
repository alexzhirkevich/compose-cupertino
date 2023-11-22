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

public val CupertinoIcons.Filled.SquareSplit1x2: ImageVector
    get() {
        if (_squareSplit1x2 != null) {
            return _squareSplit1x2!!
        }
        _squareSplit1x2 = Builder(name = "SquareSplit1x2", defaultWidth = 21.5742.dp, defaultHeight
                = 21.5977.dp, viewportWidth = 21.5742f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5742f, 9.8672f)
                lineTo(21.5742f, 11.7539f)
                lineTo(0.0f, 11.7539f)
                lineTo(0.0f, 9.8672f)
                close()
                moveTo(0.0f, 3.6914f)
                lineTo(0.0f, 17.918f)
                curveTo(0.0f, 20.3672f, 1.2188f, 21.5977f, 3.6328f, 21.5977f)
                lineTo(17.9414f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3672f, 21.5742f, 17.918f)
                lineTo(21.5742f, 3.6914f)
                curveTo(21.5742f, 1.2539f, 20.3672f, 0.0234f, 17.9414f, 0.0234f)
                lineTo(3.6328f, 0.0234f)
                curveTo(1.207f, 0.0234f, 0.0f, 1.2539f, 0.0f, 3.6914f)
                close()
            }
        }
        .build()
        return _squareSplit1x2!!
    }

private var _squareSplit1x2: ImageVector? = null
