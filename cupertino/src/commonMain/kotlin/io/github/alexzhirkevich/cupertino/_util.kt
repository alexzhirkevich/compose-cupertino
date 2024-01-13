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

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection

@Composable
@ReadOnlyComposable
internal fun PaddingValues.copy(
    top : Dp = calculateTopPadding(),
    start: Dp = calculateStartPadding(LocalLayoutDirection.current),
    bottom : Dp = calculateBottomPadding(),
    end: Dp = calculateEndPadding(LocalLayoutDirection.current)
) : PaddingValues = PaddingValues(
    top = top,
    start = start,
    end = end,
    bottom = bottom
)

@ReadOnlyComposable
internal fun PaddingValues.copy(
    layoutDirection: LayoutDirection,
    top : Dp = calculateTopPadding(),
    start: Dp = calculateStartPadding(layoutDirection),
    bottom : Dp = calculateBottomPadding(),
    end: Dp = calculateEndPadding(layoutDirection)
) : PaddingValues = PaddingValues(
    top = top,
    start = start,
    end = end,
    bottom = bottom
)

