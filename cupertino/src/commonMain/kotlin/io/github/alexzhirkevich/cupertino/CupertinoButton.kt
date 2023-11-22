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

package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.section.SectionTokens
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.Shapes

enum class CupertinoButtonSize(
    val minHeight : Dp, val shape: (Shapes) -> CornerBasedShape,
) {
    Small(26.dp, { CircleShape }),
    Medium(38.dp, { RoundedCornerShape(18.dp) }),
    Large(46.dp, { it.medium })
}

@Composable
fun CupertinoButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: CupertinoButtonSize = CupertinoButtonSize.Medium,
    shape: Shape = size.shape(CupertinoTheme.shapes),
    colors: CupertinoButtonColors = CupertinoButtonDefaults.filledButtonColors(),
    border : BorderStroke? = null,
    contentPadding: PaddingValues = CupertinoButtonDefaults.ButtonContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {

    val pressed by interactionSource.collectIsPressedAsState()

    val animatedAlpha by animateFloatAsState(
        targetValue = if (pressed)
            CupertinoButtonTokens.PressedPlainButonAlpha
        else 1f
    )

    Surface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        enabled = enabled,
        shape = shape,
        color = colors.containerColor(enabled).value,
        contentColor = colors.contentColor(enabled).value,
        border = border,
        indication = if (colors.isPlain) null else LocalIndication.current,
        interactionSource = interactionSource
    ) {
        ProvideTextStyle(value = CupertinoTheme.typography.body) {
            Row(
                Modifier
                    .defaultMinSize(
                        minWidth = size.minHeight,
                        minHeight = size.minHeight
                    )
                    .padding(contentPadding)
                    .graphicsLayer {
                        if (colors.isPlain && enabled) {
                            alpha = if (pressed)
                                CupertinoButtonTokens.PressedPlainButonAlpha
                            else animatedAlpha
                        }
                    },
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

private val ZeroPadding = PaddingValues(0.dp)

@Composable
fun CupertinoIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CupertinoButtonColors = CupertinoButtonDefaults.plainButtonColors(),
    border : BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    CupertinoButton(
        onClick = onClick,
        modifier = modifier
            .size(CupertinoButtonSize.Medium.minHeight),
        enabled = enabled,
        colors = colors,
        size = CupertinoButtonSize.Medium,
        shape = CircleShape,
        border = border,
        interactionSource = interactionSource,
        contentPadding = if (colors.isPlain)
            ZeroPadding
        else PaddingValues(8.dp),
        content = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
    )
}


@Immutable
class CupertinoButtonColors internal constructor(
    private val containerColor: Color,
    private val contentColor: Color,
    private val disabledContainerColor: Color,
    private val disabledContentColor: Color,
    internal val isPlain : Boolean = false
) {
    /**
     * Represents the container color for this button, depending on [enabled].
     *
     * @param enabled whether the button is enabled
     */
    @Composable
    fun containerColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) containerColor else disabledContainerColor)
    }

    /**
     * Represents the content color for this button, depending on [enabled].
     *
     * @param enabled whether the button is enabled
     */
    @Composable
    fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CupertinoButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (contentColor != other.contentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledContentColor != other.disabledContentColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + contentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + disabledContentColor.hashCode()
        return result
    }
}

object CupertinoButtonDefaults {

    val ButtonContentPadding: PaddingValues = PaddingValues(
        horizontal = SectionTokens.HorizontalPadding,
        vertical = 5.dp
    )

    val ButtonContentPaddingSmall: PaddingValues = PaddingValues(6.dp, 4.dp)

    /**
     * SwiftUI .bordered button
     * */
    @Composable
    @ReadOnlyComposable
    fun grayButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
    ): CupertinoButtonColors = CupertinoButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    @ReadOnlyComposable
    fun tintedButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = contentColor
            .copy(alpha = .33f),
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
    ): CupertinoButtonColors = CupertinoButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * SwiftUI .borderedProminent button
     * */
    @Composable
    @ReadOnlyComposable
    fun filledButtonColors(
        contentColor: Color = Color.White,
        containerColor: Color = CupertinoTheme.colorScheme.accent,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
    ): CupertinoButtonColors = CupertinoButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * SwiftUI .borderless button
     * */
    @Composable
    @ReadOnlyComposable
    fun plainButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
    ): CupertinoButtonColors = CupertinoButtonColors(
        isPlain = true,
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )
}

internal object CupertinoButtonTokens {
    val PressedPlainButonAlpha = .33f
}
