package com.github.alexzhirkevich.lookandfeel.icons.cupertino

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SFSymbols.SquareAndArrowDown: ImageVector
    get() {
        if (_squareandarrowdown != null) {
            return _squareandarrowdown!!
        }
        _squareandarrowdown = Builder(
            name = "Squareandarrowdown", defaultWidth = 17.334.dp,
            defaultHeight = 21.5723.dp, viewportWidth = 17.334f, viewportHeight =
            21.5723f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                fillAlpha = 0.0f,
                strokeAlpha
                = 0.0f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(17.334f)
                verticalLineToRelative(21.5723f)
                horizontalLineToRelative(-17.334f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.85f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0664f, 21.084f)
                lineTo(14.2676f, 21.084f)
                curveTo(16.3086f, 21.084f, 17.334f, 20.0684f, 17.334f, 18.0566f)
                lineTo(17.334f, 8.3105f)
                curveTo(17.334f, 6.2988f, 16.3086f, 5.2832f, 14.2676f, 5.2832f)
                lineTo(11.543f, 5.2832f)
                lineTo(11.543f, 6.8555f)
                lineTo(14.2383f, 6.8555f)
                curveTo(15.2051f, 6.8555f, 15.7617f, 7.3828f, 15.7617f, 8.3984f)
                lineTo(15.7617f, 17.9688f)
                curveTo(15.7617f, 18.9844f, 15.2051f, 19.5117f, 14.2383f, 19.5117f)
                lineTo(3.0859f, 19.5117f)
                curveTo(2.1094f, 19.5117f, 1.5723f, 18.9844f, 1.5723f, 17.9688f)
                lineTo(1.5723f, 8.3984f)
                curveTo(1.5723f, 7.3828f, 2.1094f, 6.8555f, 3.0859f, 6.8555f)
                lineTo(5.791f, 6.8555f)
                lineTo(5.791f, 5.2832f)
                lineTo(3.0664f, 5.2832f)
                curveTo(1.0254f, 5.2832f, 0.0f, 6.2988f, 0.0f, 8.3105f)
                lineTo(0.0f, 18.0566f)
                curveTo(0.0f, 20.0684f, 1.0254f, 21.084f, 3.0664f, 21.084f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.85f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.6621f, 14.6582f)
                curveTo(8.8672f, 14.6582f, 9.0332f, 14.5996f, 9.2285f, 14.4043f)
                lineTo(12.5293f, 11.2109f)
                curveTo(12.6758f, 11.0645f, 12.7637f, 10.9082f, 12.7637f, 10.7031f)
                curveTo(12.7637f, 10.3027f, 12.4512f, 10.0195f, 12.0508f, 10.0195f)
                curveTo(11.8555f, 10.0195f, 11.6602f, 10.0977f, 11.5234f, 10.2539f)
                lineTo(10.0391f, 11.8262f)
                lineTo(9.3848f, 12.5195f)
                lineTo(9.4434f, 11.0547f)
                lineTo(9.4434f, 0.7617f)
                curveTo(9.4434f, 0.3516f, 9.082f, 0.0f, 8.6621f, 0.0f)
                curveTo(8.2422f, 0.0f, 7.8906f, 0.3516f, 7.8906f, 0.7617f)
                lineTo(7.8906f, 11.0547f)
                lineTo(7.9492f, 12.5195f)
                lineTo(7.2852f, 11.8262f)
                lineTo(5.8106f, 10.2539f)
                curveTo(5.6738f, 10.0977f, 5.459f, 10.0195f, 5.2734f, 10.0195f)
                curveTo(4.8633f, 10.0195f, 4.5703f, 10.3027f, 4.5703f, 10.7031f)
                curveTo(4.5703f, 10.9082f, 4.6484f, 11.0645f, 4.7949f, 11.2109f)
                lineTo(8.0957f, 14.4043f)
                curveTo(8.3008f, 14.5996f, 8.4668f, 14.6582f, 8.6621f, 14.6582f)
                close()
            }
        }
            .build()
        return _squareandarrowdown!!
    }

private var _squareandarrowdown: ImageVector? = null
