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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

internal val LocalSeparatorColor = compositionLocalOf {
    Color.Unspecified
}

@Composable
@Deprecated(
    replaceWith = ReplaceWith(
        "CupertinoHorizontalDivider(modifier,thickness,color)",
        "io.github.alexzhirkevich.cupertino.CupertinoHorizontalDivider"
    ),
    message = "Use CupertinoHorizontalDivider instead")
fun CupertinoDivider(
    modifier: Modifier = Modifier,
    thickness : Dp = CupertinoDividerDefaults.Thickness,
    color : Color = CupertinoDividerDefaults.color
) = CupertinoHorizontalDivider(modifier, thickness, color)

@Composable
fun CupertinoHorizontalDivider(
    modifier: Modifier = Modifier,
    thickness : Dp = CupertinoDividerDefaults.Thickness,
    color : Color = CupertinoDividerDefaults.color
) {

    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }
    Spacer(
        modifier
            .fillMaxWidth()
            .height(targetThickness)
            .background(color = color)
    )
}

@Composable
fun CupertinoVerticalDivider(
    modifier: Modifier = Modifier,
    thickness : Dp = CupertinoDividerDefaults.Thickness,
    color : Color = CupertinoDividerDefaults.color
) {
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }

    Spacer(
        modifier
            .fillMaxHeight()
            .width(targetThickness)
            .background(color = color)
    )
}

@Stable
object CupertinoDividerDefaults {
    val Thickness = Dp.Hairline
    val color : Color
        @Composable
        @ReadOnlyComposable
        get() = LocalSeparatorColor.current.takeOrElse {
            CupertinoTheme.colorScheme.opaqueSeparator
        }
    }