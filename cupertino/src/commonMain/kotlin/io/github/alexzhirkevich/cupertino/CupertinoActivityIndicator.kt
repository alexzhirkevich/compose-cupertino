/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isSpecified
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.Gray
import kotlin.math.roundToInt

/**
 *
 * iOS-like segmented circle progress indicator
 *
 * @param modifier indicator modifier
 * @param color color of the indicator
 * @param count number of paths of the activity indicator
 * @param innerRadius radius of the inner circle relative to indicator radius
 * @param animationSpec infinite repeatable animation spec
 * @param minAlpha opacity of the most translucent item
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoActivityIndicator(
    modifier: Modifier = Modifier,
    size : Dp = CupertinoActivityIndicatorDefaults.MinSize,
    color: Color = CupertinoColors.Gray,
    count: Int = CupertinoActivityIndicatorDefaults.PathCount,
    innerRadius : Float = 1/3f,
    strokeWidth : Dp = Dp.Unspecified,
    animationSpec: InfiniteRepeatableSpec<Float> = infiniteRepeatable(
        animation = tween(
            durationMillis = CupertinoActivityIndicatorDefaults.DurationMillis,
            easing = LinearEasing,
        ),
        repeatMode = RepeatMode.Restart,
    ),
    minAlpha: Float = CupertinoActivityIndicatorDefaults.MinAlpha
) {
    require(innerRadius in 0f..1f){
        "innerRaius should be from 0 to 1"
    }
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

        val itemWidth = canvasWidth  * (1 - innerRadius)/2
        val itemHeight = if (strokeWidth.isSpecified)
            strokeWidth.toPx() else canvasHeight / count

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


/**
 *
 * iOS-like segmented circle progress indicator
 *
 * @param modifier indicator modifier
 * @param color color of the indicator
 * @param count number of paths of the activity indicator
 * @param innerRadius radius of the inner circle relative to indicator radius
 * @param animationSpec infinite repeatable animation spec
 * @param minAlpha opacity of the most translucent item
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoActivityIndicator(
    modifier: Modifier = Modifier,
    progress : Float = 1f,
    size : Dp = CupertinoActivityIndicatorDefaults.MinSize,
    color: Color = CupertinoColors.Gray,
    count: Int = CupertinoActivityIndicatorDefaults.PathCount,
    innerRadius : Float = 1/3f,
    strokeWidth : Dp = Dp.Unspecified,
    animationSpec: InfiniteRepeatableSpec<Float> = infiniteRepeatable(
        animation = tween(
            durationMillis = CupertinoActivityIndicatorDefaults.DurationMillis,
            easing = LinearEasing,
        ),
        repeatMode = RepeatMode.Restart,
    ),
    minAlpha: Float = CupertinoActivityIndicatorDefaults.MinAlpha
) {
    require(innerRadius in 0f..1f) {
        "innerRadius must be from 0 to 1"
    }
    require(progress in 0f..1f) {
        "progress must be from 0 to 1"
    }
    require(count > 0) {
        "count must be > 0"
    }
    val animatedPathCount = (count / 2)

    val coefficient = 360f / count

    val infiniteTransition = rememberInfiniteTransition()

    val rotation by animateFloatAsState(
        targetValue = if (progress < 1f) StartRotation else EndRotation,
        animationSpec = FinalAnimationSpec
    )

    val angle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = count.toFloat(),
        animationSpec = animationSpec,
    )

    Canvas(
        modifier = modifier
            .graphicsLayer {
                rotationZ = if (progress == 1f ) rotation else StartRotation
            }
//            .rotate(-90f)
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

        val itemWidth = canvasWidth * (1 - innerRadius) / 2
        val itemHeight = if (strokeWidth.isSpecified)
            strokeWidth.toPx() else canvasHeight / count

        val cornerRadius = itemWidth.coerceAtMost(itemHeight) / 2

        val horizontalOffset = (canvasSize.width - canvasSize.height).coerceAtLeast(0f) / 2
        val verticalOffset = (canvasSize.height - canvasSize.width).coerceAtLeast(0f) / 2

        val topLeftOffset = Offset(
            x = horizontalOffset + canvasWidth - itemWidth,
            y = verticalOffset + (canvasHeight - itemHeight) / 2,
        )

        val itemSize = Size(itemWidth, itemHeight)


        for (i in (0..360 step 360 / count)
            .take(if (progress== 1f) count else (count * progress/2).toInt())
        ) {
            rotate(i.toFloat()) {
                drawRoundRect(
                    color = color.copy(alpha = minAlpha.coerceIn(0f, 1f)),
                    topLeft = topLeftOffset,
                    size = itemSize,
                    cornerRadius = CornerRadius(cornerRadius, cornerRadius),
                )
            }
        }


        if (progress == 1f) {
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
        } else {

            for (i in 0..(count * progress).roundToInt()) {

                rotate(i * coefficient) {
                    drawRoundRect(
                        color = color.copy(
                            alpha = when {
                                progress > (i+1) / count.toFloat() -> 1f
                                progress < i / count -> 0f
                                else -> if (i == 0) progress / (1f/count) else (progress - i.toFloat()/count)/ (1f/count)
                            }.coerceIn(0f,1f).takeIf { !it.isNaN() } ?: 0f,
                        ),
                        topLeft = topLeftOffset,
                        size = itemSize,
                        cornerRadius = CornerRadius(cornerRadius, cornerRadius),
                    )
                }
            }
        }
    }
}

@Immutable
object CupertinoActivityIndicatorDefaults {

    const val MinAlpha : Float = 0.1f

    val MinSize = 30.dp

    const val PathCount  : Int = 8

    const val DurationMillis : Int = 1000

    val color : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoColors.Gray
}

private const val StartRotation = -88f
private const val EndRotation = 180f
private val FinalAnimationSpec = cupertinoTween<Float>(durationMillis = 2000)