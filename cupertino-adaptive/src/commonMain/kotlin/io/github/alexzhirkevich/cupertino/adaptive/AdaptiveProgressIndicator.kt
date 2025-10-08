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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.CupertinoActivityIndicator
import io.github.alexzhirkevich.cupertino.CupertinoActivityIndicatorDefaults
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

@OptIn(ExperimentalCupertinoApi::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveCircularProgressIndicator(
    modifier: Modifier = Modifier,
    adaptationScope: AdaptationScope<
        CupertinoCircularProgressIndicatorAdaptation,
        MaterialCircularProgressIndicatorAdaptation
    >.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptation = remember { ProgressIndicatorAdaptation() },
        adaptationScope = adaptationScope,
        material = {
            CircularProgressIndicator(
                modifier = modifier,
                color = it.color,
                strokeWidth = it.strokeWidth,
                trackColor = it.trackColor,
                strokeCap = it.strokeCap
            )
        },
        cupertino = {
            CupertinoActivityIndicator(
                modifier = modifier,
                progress = it.progress,
                size = it.size,
                color = it.color,
                count = it.count,
                innerRadius = it.innerRadius,
                strokeWidth = it.strokeWidth,
                animationSpec = it.animationSpec,
                minAlpha = it.minAlpha
            )
        }
    )
}

@Stable
class MaterialCircularProgressIndicatorAdaptation internal constructor(
    color: Color,
    trackColor: Color,
    strokeWidth: Dp = ProgressIndicatorDefaults.CircularStrokeWidth,
    strokeCap: StrokeCap = ProgressIndicatorDefaults.CircularIndeterminateStrokeCap,
) {
    var color: Color by mutableStateOf(color)
    var trackColor: Color by mutableStateOf(trackColor)
    var strokeWidth: Dp by mutableStateOf(strokeWidth)
    var strokeCap: StrokeCap by mutableStateOf(strokeCap)
}

@Stable
class CupertinoCircularProgressIndicatorAdaptation internal constructor(
    color : Color,
    progress : Float = 1f,
    size : Dp = CupertinoActivityIndicatorDefaults.MinSize,
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
    var color: Color by mutableStateOf(color)
    var progress: Float by mutableStateOf(progress)
    var size: Dp by mutableStateOf(size)
    var count: Int by mutableStateOf(count)
    var innerRadius: Float by mutableStateOf(innerRadius)
    var strokeWidth: Dp by mutableStateOf(strokeWidth)
    var animationSpec: InfiniteRepeatableSpec<Float> by mutableStateOf(animationSpec)
    var minAlpha: Float by mutableStateOf(minAlpha)
}

@OptIn(ExperimentalAdaptiveApi::class)
private class ProgressIndicatorAdaptation :
    Adaptation<CupertinoCircularProgressIndicatorAdaptation, MaterialCircularProgressIndicatorAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoCircularProgressIndicatorAdaptation {

        val color = CupertinoActivityIndicatorDefaults.color

        return remember(color) {
            CupertinoCircularProgressIndicatorAdaptation(
                color
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialCircularProgressIndicatorAdaptation {
        val color = ProgressIndicatorDefaults.circularColor
        val trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor

        return remember(color, trackColor) {
            MaterialCircularProgressIndicatorAdaptation(
                color = color,
                trackColor = trackColor
            )
        }
    }
}
