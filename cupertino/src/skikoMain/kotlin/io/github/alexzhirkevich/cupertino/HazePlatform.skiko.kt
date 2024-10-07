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

// Copyright 2023, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RenderEffect
import androidx.compose.ui.graphics.asComposeRenderEffect
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode
import androidx.compose.ui.node.LayoutModifierNode
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import org.jetbrains.skia.FilterTileMode
import org.jetbrains.skia.ImageFilter
import org.jetbrains.skia.RuntimeEffect
import org.jetbrains.skia.RuntimeShaderBuilder

/**
 * Heavily influenced by
 * https://www.pushing-pixels.org/2022/04/09/shader-based-render-effects-in-compose-desktop-with-skia.html
 */
private const val SHADER_SKSL = """
  uniform shader content;
  uniform shader blur;

  uniform vec4 rectangle;
  uniform vec4 color;
  uniform float colorShift;

  // https://www.iquilezles.org/www/articles/distfunctions2d/distfunctions2d.htm
  float boxSDF(vec2 position, vec2 box) {
      vec2 q = abs(position) - box;
      return length(max(q,0.0)) + min(max(q.x,q.y),0.0);
  }

  vec4 main(vec2 coord) {
  
    vec2 shiftRect = (rectangle.zw - rectangle.xy) / 2.0;
    vec2 shiftCoord = coord - rectangle.xy;
    float distanceToClosestEdge = boxSDF(shiftCoord - shiftRect, shiftRect);

    vec4 c = content.eval(coord);
    if (distanceToClosestEdge > 0.0) {
      return c;
    }

    vec4 b = blur.eval(coord);
    
    return b  + ((color - b) * colorShift);
  }
"""

private val RUNTIME_SHADER by lazy { RuntimeEffect.makeForShader(SHADER_SKSL) }

internal actual class HazeNode actual constructor(
    private var areas: List<Rect>,
    private var backgroundColor: Color,
    private var tint: Color,
    private var blurRadius: Dp,
    private val density: Density
) : Modifier.Node(), LayoutModifierNode, CompositionLocalConsumerModifierNode {

    private var blurFilter: ImageFilter? = null

    override fun onAttach() {
        super.onAttach()
        blurFilter = createBlurImageFilter(blurRadius)
    }

    actual fun update(
        areas: List<Rect>,
        backgroundColor: Color,
        tint: Color,
        blurRadius: Dp,
    ) {
        this.areas = areas
        this.backgroundColor = backgroundColor
        this.tint = tint
        blurFilter = createBlurImageFilter(blurRadius)
    }

    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints,
    ): MeasureResult {
        val placeable = measurable.measure(constraints)
        return layout(placeable.width, placeable.height) {
            placeable.placeWithLayer(x = 0, y = 0) {
                renderEffect = createBlurRenderEffect()
            }
        }
    }

    private fun createBlurImageFilter(blurRadius: Dp): ImageFilter {
        val blurRadiusPx = with(density) {
            blurRadius.toPx()
        }
        val sigma = BlurEffect.convertRadiusToSigma(blurRadiusPx)
        return ImageFilter.makeBlur(
            sigmaX = sigma,
            sigmaY = sigma,
            mode = FilterTileMode.DECAL,
        )
    }

    private fun createBlurRenderEffect(): RenderEffect? {
        return areas.asSequence()
            .filterNot { it.isEmpty }
            .map { area ->
                val compositeShaderBuilder = RuntimeShaderBuilder(RUNTIME_SHADER).apply {
                    uniform("rectangle", area.left, area.top, area.right, area.bottom)
                    uniform("color", tint.red, tint.green, tint.blue, 1f)
                    uniform("colorShift", tint.alpha)
                }

                ImageFilter.makeRuntimeShader(
                    runtimeShaderBuilder = compositeShaderBuilder,
                    shaderNames = arrayOf("content", "blur"),
                    inputs = arrayOf(null, blurFilter),
                )
            }
            .toList()
            .flatten()?.asComposeRenderEffect()
    }
}

private fun Collection<ImageFilter>.flatten(): ImageFilter? = when {
    isEmpty() -> null
    size == 1 -> first()
    else -> ImageFilter.makeMerge(toTypedArray(), null)
}