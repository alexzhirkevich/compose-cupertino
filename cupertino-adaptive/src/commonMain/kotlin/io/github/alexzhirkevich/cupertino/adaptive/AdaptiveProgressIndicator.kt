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
import androidx.compose.runtime.remember
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

class MaterialCircularProgressIndicatorAdaptation(
    var color: Color,
    var trackColor: Color,
    var strokeWidth: Dp = ProgressIndicatorDefaults.CircularStrokeWidth,
    var strokeCap: StrokeCap = ProgressIndicatorDefaults.CircularIndeterminateStrokeCap,
)

class CupertinoCircularProgressIndicatorAdaptation(
    var color : Color,
    var progress : Float = 1f,
    var size : Dp = CupertinoActivityIndicatorDefaults.MinSize,
    var count: Int = CupertinoActivityIndicatorDefaults.PathCount,
    var innerRadius : Float = 1/3f,
    var strokeWidth : Dp = Dp.Unspecified,
    var animationSpec: InfiniteRepeatableSpec<Float> = infiniteRepeatable(
        animation = tween(
            durationMillis = CupertinoActivityIndicatorDefaults.DurationMillis,
            easing = LinearEasing,
        ),
        repeatMode = RepeatMode.Restart,
    ),
    var minAlpha: Float = CupertinoActivityIndicatorDefaults.MinAlpha
)

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
        val trackColor = ProgressIndicatorDefaults.circularTrackColor

        return remember(color, trackColor) {
            MaterialCircularProgressIndicatorAdaptation(
                color = color,
                trackColor = trackColor
            )
        }
    }
}
