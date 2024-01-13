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


import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Draw content within the provided [area]s blurred in a 'glassmorphism' style.
 *
 * When running on Android 12 devicees (and newer), usage of this API renders the corresponding composable
 * into a separate graphics layer. On older Android platforms, a translucent scrim will be drawn
 * instead.
 *
 * @param area The areas of the content which should have the blur effect applied to.
 * @param backgroundColor Background color of the content. Typically you would provide
 * `MaterialTheme.colorScheme.surface` or similar.
 * @param tint Color to tint the blurred content. Should be translucent, otherwise you will not see
 * the blurred content.
 * @param blurRadius Radius of the blur.
 */
@Composable
fun Modifier.haze(
    vararg area: Rect,
    backgroundColor: Color,
    tint: Color = HazeDefaults.tint(backgroundColor),
    blurRadius: Dp = HazeDefaults.blurRadius,
): Modifier = this then HazeNodeElement(
    areas = area.toList(),
    tint = tint,
    backgroundColor = backgroundColor,
    blurRadius = blurRadius,
    density = LocalDensity.current
)

/**
 * Default values for the [haze] modifiers.
 */
@Immutable
object HazeDefaults {
    /**
     * Default blur radius. Larger values produce a stronger blur effect.
     */
    val blurRadius: Dp = 20.dp

    /**
     * Default alpha used for the tint color. Used by the [tint] function.
     */
    val tintAlpha: Float = 0.7f

    /**
     * Default builder for the 'tint' color. Transforms the provided [color].
     */
    fun tint(color: Color): Color = color.copy(alpha = tintAlpha)
}

internal data class HazeNodeElement(
    val areas: List<Rect>,
    val backgroundColor: Color,
    val tint: Color,
    val blurRadius: Dp,
    val density: Density
) : ModifierNodeElement<HazeNode>() {
    override fun create(): HazeNode {
        return HazeNode(
            areas = areas,
            backgroundColor = backgroundColor,
            tint = tint,
            blurRadius = blurRadius,
            density = density
        )
    }

    override fun update(node: HazeNode) {
        node.update(
            areas = areas,
            backgroundColor = backgroundColor,
            tint = tint,
            blurRadius = blurRadius,
        )
    }

    override fun InspectorInfo.inspectableProperties() {
        name = "haze"
        properties["areas"] = areas
        properties["backgroundColor"] = backgroundColor
        properties["tint"] = tint
        properties["blurRadius"] = blurRadius
    }
}

internal expect class HazeNode(
    areas: List<Rect>,
    backgroundColor: Color,
    tint: Color,
    blurRadius: Dp,
    density: Density
) : Modifier.Node {
    fun update(
        areas: List<Rect>,
        backgroundColor: Color,
        tint: Color,
        blurRadius: Dp,
    )
}