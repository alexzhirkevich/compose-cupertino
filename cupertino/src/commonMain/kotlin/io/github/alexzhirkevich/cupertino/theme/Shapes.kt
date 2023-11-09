/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Stable
class Shapes(
    val extraSmall: CornerBasedShape = ShapeDefaults.ExtraSmall,
    val small: CornerBasedShape = ShapeDefaults.Small,
    val medium: CornerBasedShape = ShapeDefaults.Medium,
    val large: CornerBasedShape = ShapeDefaults.Large,
    val extraLarge: CornerBasedShape = ShapeDefaults.ExtraLarge,
)

internal val LocalShapes = staticCompositionLocalOf { Shapes() }

object ShapeDefaults {
    /** Extra small sized corner shape */
    val ExtraSmall: CornerBasedShape = ShapeTokens.CornerExtraSmall

    /** Small sized corner shape */
    val Small: CornerBasedShape = ShapeTokens.CornerSmall

    /** Medium sized corner shape */
    val Medium: CornerBasedShape = RoundedCornerShape(12.dp)

    /** Large sized corner shape */
    val Large: CornerBasedShape = ShapeTokens.CornerLarge

    /** Extra large sized corner shape */
    val ExtraLarge: CornerBasedShape = ShapeTokens.CornerExtraLarge
}

internal object ShapeTokens {
    val CornerExtraLarge = RoundedCornerShape(28.0.dp)
    val CornerExtraLargeTop =
        RoundedCornerShape(
            topStart = 28.0.dp,
            topEnd = 28.0.dp,
            bottomEnd = 0.0.dp,
            bottomStart = 0.0.dp
        )
    val CornerExtraSmall = RoundedCornerShape(4.0.dp)
    val CornerExtraSmallTop = RoundedCornerShape(
        topStart = 4.0.dp,
        topEnd = 4.0.dp,
        bottomEnd = 0.0.dp,
        bottomStart = 0.0.dp
    )
    val CornerFull = CircleShape
    val CornerLarge = RoundedCornerShape(16.0.dp)
    val CornerLargeEnd =
        RoundedCornerShape(
            topStart = 0.0.dp,
            topEnd = 16.0.dp,
            bottomEnd = 16.0.dp,
            bottomStart = 0.0.dp
        )
    val CornerLargeTop =
        RoundedCornerShape(
            topStart = 16.0.dp,
            topEnd = 16.0.dp,
            bottomEnd = 0.0.dp,
            bottomStart = 0.0.dp
        )
    val CornerMedium = RoundedCornerShape(12.0.dp)
    val CornerNone = RectangleShape
    val CornerSmall = RoundedCornerShape(8.0.dp)
}