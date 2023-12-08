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

public val CupertinoIcons.Outlined.ChecklistUnchecked: ImageVector
    get() {
        if (_checklistUnchecked != null) {
            return _checklistUnchecked!!
        }
        _checklistUnchecked = Builder(name = "ChecklistUnchecked", defaultWidth = 26.2734.dp,
                defaultHeight = 23.707.dp, viewportWidth = 26.2734f, viewportHeight =
                23.707f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.6055f, 5.9883f)
                lineTo(25.3711f, 5.9883f)
                curveTo(25.8633f, 5.9883f, 26.2734f, 5.6016f, 26.2734f, 5.0977f)
                curveTo(26.2734f, 4.6055f, 25.8633f, 4.2188f, 25.3711f, 4.2188f)
                lineTo(13.6055f, 4.2188f)
                curveTo(13.1133f, 4.2188f, 12.7148f, 4.6055f, 12.7148f, 5.0977f)
                curveTo(12.7148f, 5.6016f, 13.1133f, 5.9883f, 13.6055f, 5.9883f)
                close()
                moveTo(13.6055f, 19.5352f)
                lineTo(25.3711f, 19.5352f)
                curveTo(25.8633f, 19.5352f, 26.2734f, 19.1484f, 26.2734f, 18.6562f)
                curveTo(26.2734f, 18.1523f, 25.8633f, 17.7656f, 25.3711f, 17.7656f)
                lineTo(13.6055f, 17.7656f)
                curveTo(13.1133f, 17.7656f, 12.7148f, 18.1523f, 12.7148f, 18.6562f)
                curveTo(12.7148f, 19.1484f, 13.1133f, 19.5352f, 13.6055f, 19.5352f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0508f, 10.1484f)
                curveTo(7.8047f, 10.1484f, 10.1016f, 7.8398f, 10.1016f, 5.0859f)
                curveTo(10.1016f, 2.3203f, 7.8047f, 0.0352f, 5.0508f, 0.0352f)
                curveTo(2.2852f, 0.0352f, 0.0f, 2.3203f, 0.0f, 5.0859f)
                curveTo(0.0f, 7.8398f, 2.2969f, 10.1484f, 5.0508f, 10.1484f)
                close()
                moveTo(5.0508f, 8.4375f)
                curveTo(3.2344f, 8.4375f, 1.7109f, 6.9023f, 1.7109f, 5.0859f)
                curveTo(1.7109f, 3.2695f, 3.2461f, 1.7344f, 5.0508f, 1.7344f)
                curveTo(6.8555f, 1.7344f, 8.3906f, 3.2813f, 8.3906f, 5.0859f)
                curveTo(8.3906f, 6.9023f, 6.8555f, 8.4375f, 5.0508f, 8.4375f)
                close()
                moveTo(5.0508f, 23.707f)
                curveTo(7.8047f, 23.707f, 10.1016f, 21.4102f, 10.1016f, 18.6562f)
                curveTo(10.1016f, 15.8789f, 7.8047f, 13.5938f, 5.0508f, 13.5938f)
                curveTo(2.2852f, 13.5938f, 0.0f, 15.8906f, 0.0f, 18.6562f)
                curveTo(0.0f, 21.4102f, 2.2969f, 23.707f, 5.0508f, 23.707f)
                close()
                moveTo(5.0508f, 21.9961f)
                curveTo(3.2344f, 21.9961f, 1.7109f, 20.4609f, 1.7109f, 18.6562f)
                curveTo(1.7109f, 16.8398f, 3.2461f, 15.3047f, 5.0508f, 15.3047f)
                curveTo(6.8555f, 15.3047f, 8.3906f, 16.8398f, 8.3906f, 18.6562f)
                curveTo(8.3906f, 20.4609f, 6.8555f, 21.9961f, 5.0508f, 21.9961f)
                close()
            }
        }
        .build()
        return _checklistUnchecked!!
    }

private var _checklistUnchecked: ImageVector? = null
