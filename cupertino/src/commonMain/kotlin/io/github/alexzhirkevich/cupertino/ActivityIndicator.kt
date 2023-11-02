package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.gray

/**
 * @param modifier indicator modifier
 * @param color color of the indicator
 * @param count number of paths of the activity indicator
 * @param animationSpec infinite repeatable animation spec
 * @param minAlpha opacity of the most translucent item
 * */
@Composable
fun CupertinoActivityIndicator(
    modifier: Modifier = Modifier,
    color: Color = CupertinoColors.gray,
    size: Dp = CupertinoActivityIndicatorDefaults.Radius * 2,
    count: Int = CupertinoActivityIndicatorDefaults.PathCount,
    animationSpec: InfiniteRepeatableSpec<Float> = infiniteRepeatable(
        animation = tween(
            durationMillis = CupertinoActivityIndicatorDefaults.DurationMillis,
            easing = LinearEasing,
        ),
        repeatMode = RepeatMode.Restart,
    ),
    minAlpha: Float = CupertinoActivityIndicatorDefaults.MinAlpha
) {
    val animatedPathCount = (count / 2).coerceIn(1, count)

    val coefficient = 360f / count

    val infiniteTransition = rememberInfiniteTransition()
    val angle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = count.toFloat(),
        animationSpec = animationSpec,
    )

    Canvas(
        modifier = modifier
            .progressSemantics()
            .size(size),
    ) {

        val canvasSize = this.size

        var canvasWidth = canvasSize.width
        var canvasHeight = canvasSize.height

        if (canvasHeight < canvasWidth) {
            canvasWidth = canvasHeight
        } else {
            canvasHeight = canvasWidth
        }

        val itemWidth = canvasWidth / 3f
        val itemHeight = canvasHeight / count

        val cornerRadius = itemWidth.coerceAtMost(itemHeight) / 2

        val horizontalOffset = (canvasSize.width - canvasSize.height).coerceAtLeast(0f) / 2
        val verticalOffset = (canvasSize.height - canvasSize.width).coerceAtLeast(0f) / 2

        val topLeftOffset = Offset(
            x = horizontalOffset + canvasWidth - itemWidth,
            y = verticalOffset + (canvasHeight - itemHeight) / 2,
        )

        val itemSize = Size(itemWidth, itemHeight)

        for (i in 0..360 step 360 / count) {
            rotate(i.toFloat()) {
                drawRoundRect(
                    color = color.copy(alpha = minAlpha.coerceIn(0f,1f)),
                    topLeft = topLeftOffset,
                    size = itemSize,
                    cornerRadius = CornerRadius(cornerRadius, cornerRadius),
                )
            }
        }

        for (i in 0..animatedPathCount) {
            rotate((angle.toInt() + i) * coefficient) {
                drawRoundRect(
                    color = color.copy(
                        alpha = (1f / (count / 2) * i).coerceIn(0f, 1f),
                    ),
                    topLeft = topLeftOffset,
                    size = itemSize,
                    cornerRadius = CornerRadius(cornerRadius, cornerRadius),
                )
            }
        }
    }
}

object CupertinoActivityIndicatorDefaults {

    val MinAlpha : Float = 0.1f

    val Radius : Dp  get() = Size/2 - Width

    val PathCount  : Int = 9

    val DurationMillis  : Int = 1000


    internal val Width = 4.0.dp

    internal val Size = 38.0.dp
}
