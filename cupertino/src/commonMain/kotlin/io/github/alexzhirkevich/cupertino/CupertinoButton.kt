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

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.filledButtonColors
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.plainButtonColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.DefaultAlpha
import io.github.alexzhirkevich.cupertino.theme.Shapes
import io.github.alexzhirkevich.cupertino.theme.Typography

enum class CupertinoButtonSize(
    val shape: (Shapes) -> Shape,
    val textStyle: (Typography) -> TextStyle = { it.body },
    val contentPadding: PaddingValues
) {
    Small(
        shape = { CircleShape },
        textStyle = { it.subhead },
        contentPadding = PaddingValues(12.dp, 6.dp)
    ),
    Regular(
        shape = { it.small },
        textStyle = { it.body },
        contentPadding = PaddingValues(16.dp, 10.dp)
    ),
    Large(
        shape = { it.medium },
        textStyle = { it.body },
        contentPadding = PaddingValues(24.dp, 18.dp)
    ),
    ExtraLarge(
        shape = { CircleShape },
        textStyle = Large.textStyle,
        contentPadding = Large.contentPadding
    ),
}

@Composable
@ExperimentalCupertinoApi
fun CupertinoButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: CupertinoButtonSize = CupertinoButtonSize.Regular,
    colors: CupertinoButtonColors = filledButtonColors(),
    border: BorderStroke? = null,
    shape: Shape = size.shape(CupertinoTheme.shapes),
    contentPadding: PaddingValues = size.contentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {

    val pressed by interactionSource.collectIsPressedAsState()

    val animatedAlpha by animateFloatAsState(
        targetValue = if (pressed)
            CupertinoButtonTokens.PressedPlainButonAlpha
        else 1f
    )


    val indicationColor by rememberUpdatedState(colors.indicationColor)

    CupertinoSurface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        enabled = enabled,
        shape = shape,
        color = colors.containerColor(enabled).value,
        contentColor = colors.contentColor(enabled).value,
        border = border,
        interactionSource = interactionSource
    ) {
        ProvideTextStyle(value = size.textStyle(CupertinoTheme.typography)) {
            Row(
                Modifier
                    .defaultMinSize(24.dp, 24.dp)
                    .padding(contentPadding)
                    .graphicsLayer {
                        if (colors.isPlain && enabled) {
                            alpha = if (pressed)
                                CupertinoButtonTokens.PressedPlainButonAlpha
                            else animatedAlpha
                        }
                    },
                horizontalArrangement = Arrangement
                    .spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

@ExperimentalCupertinoApi
@Composable
fun CupertinoIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CupertinoButtonColors = plainButtonColors(),
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    CupertinoButton(
        onClick = onClick,
        modifier = modifier
            .size(CupertinoButtonTokens.IconButtonSize),
        enabled = enabled,
        colors = colors,
        size = CupertinoButtonSize.Regular,
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
    internal val indicationColor: Color,
    internal val isPlain: Boolean = false
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


@Immutable
object CupertinoButtonDefaults {

    /**
     * Tinted button with .bordered SwiftUI style with default gray tint
     * */
    @Composable
    @ReadOnlyComposable
    fun grayButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicationColor: Color = CupertinoColors.DefaultAlpha
    ): CupertinoButtonColors = CupertinoButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor,
    )

    /**
     * SwiftUI .borderless button
     * */
    @Composable
    @ReadOnlyComposable
    fun plainButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = Color.Transparent,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = Color.Transparent,
        indicationColor: Color = Color.Transparent
    ): CupertinoButtonColors = CupertinoButtonColors(
        isPlain = true,
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor
    )

    /**
     * Filled button with .borderedProminent SwiftUI style
     * */
    @Composable
    @ReadOnlyComposable
    fun filledButtonColors(
        contentColor: Color = Color.White,
        containerColor: Color = CupertinoTheme.colorScheme.accent,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicationColor: Color = contentColor.copy(alpha = .2f)
    ): CupertinoButtonColors = CupertinoButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor
    )

    /**
     * Tinted button with .bordered SwiftUI style and [contentColor] tint
     * */
    @Composable
    @ReadOnlyComposable
    fun tintedButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = contentColor.copy(alpha = CupertinoButtonTokens.BorderedButtonAlpha),
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicationColor: Color = contentColor.copy(alpha = .15f)
    ): CupertinoButtonColors = CupertinoButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor,
    )

    /**
     * Filled button with .borderedProminent SwiftUI style
     * */
    @Composable
    @ReadOnlyComposable
    @Deprecated(
        "Use filledButtonColors instead",
        replaceWith = ReplaceWith(
            "filledButtonColors(contentColor,containerColor,disabledContentColor,disabledContainerColor,indicationColor)",
            "io.github.alexzhirkevich.cupertino.filledButtonColors"
        )
    )
    fun borderedProminentButtonColors(
        contentColor: Color = Color.White,
        containerColor: Color = CupertinoTheme.colorScheme.accent,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicationColor: Color = contentColor.copy(alpha = .2f)
    ): CupertinoButtonColors = filledButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor
    )

    /**
     * Tinted button with .bordered SwiftUI style and [contentColor] tint
     * */
    @Deprecated(
        "Use tintedButtonColors instead",
        replaceWith = ReplaceWith(
            "tintedButtonColors(contentColor,containerColor,disabledContentColor,disabledContainerColor,indicationColor)",
            "io.github.alexzhirkevich.cupertino.tintedButtonColors"
        )
    )
    @Composable
    @ReadOnlyComposable
    fun borderedButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = contentColor.copy(alpha = CupertinoButtonTokens.BorderedButtonAlpha),
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicationColor: Color = contentColor.copy(alpha = .15f)
    ): CupertinoButtonColors = tintedButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor,
    )

    /**
     * SwiftUI .borderless button
     * */
    @Deprecated(
        "Use plainButtonColors instead",
        replaceWith = ReplaceWith(
            "plainButtonColors(contentColor,containerColor,disabledContentColor,disabledContainerColor,indicationColor)",
            "io.github.alexzhirkevich.cupertino.plainButtonColors"
        )
    )
    @Composable
    @ReadOnlyComposable
    fun borderlessButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = Color.Transparent,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = Color.Transparent,
        indicationColor: Color = Color.Transparent
    ): CupertinoButtonColors = plainButtonColors(
        contentColor = contentColor,
        containerColor = containerColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor
    )

    /**
     * Tinted button with .bordered SwiftUI with default tint
     * */
    @Deprecated(
        "Use grayButtonColors instead",
        replaceWith = ReplaceWith(
            "grayButtonColors(contentColor,containerColor,disabledContentColor,disabledContainerColor,indicationColor)",
            "io.github.alexzhirkevich.cupertino.grayButtonColors"
        )
    )
    @Composable
    @ReadOnlyComposable
    fun borderedGrayButtonColors(
        contentColor: Color = CupertinoTheme.colorScheme.accent,
        containerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        disabledContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        disabledContainerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicationColor: Color = CupertinoColors.DefaultAlpha
    ): CupertinoButtonColors = grayButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        indicationColor = indicationColor,
    )
}

internal object CupertinoButtonTokens {
    const val PressedPlainButonAlpha = .33f
    val IconButtonSize = 42.dp
    const val BorderedButtonAlpha = .2f
}

private val ZeroPadding = PaddingValues(0.dp)
