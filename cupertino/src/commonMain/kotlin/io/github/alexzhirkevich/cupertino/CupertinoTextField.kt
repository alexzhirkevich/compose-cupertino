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

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.LocalTextStyle
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.systemRed

@Composable
fun CupertinoTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    contentAlignment: Alignment.Vertical = Alignment.CenterVertically,
    colors: CupertinoTextFieldColors = CupertinoTextFieldDefaults.colors()
) {
    // If color is not provided via the text style, use content color as a default
    val textColor = textStyle.color.takeOrElse {
        colors.textColor(enabled, isError, interactionSource).value
    }
    val mergedTextStyle = textStyle.merge(TextStyle(color = textColor))

    CompositionLocalProvider(
        LocalTextSelectionColors provides colors.selectionColors
    ) {

        var layoutResult by remember {
            mutableStateOf<TextLayoutResult?>(null)
        }

        BasicTextField(
            value = value,
            modifier = Modifier
                .defaultMinSize(
                    minWidth = CupertinoTextFieldDefaults.MinWidth,
                    minHeight = CupertinoTextFieldDefaults.MinHeight
                ),
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            cursorBrush = SolidColor(colors.cursorColor(isError).value),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            onTextLayout = {
                layoutResult = it
            },
            decorationBox = {
                CupertinoTextFieldDefaults.DecorationBox(
                    modifier = modifier,
                    valueIsEmpty = value.isEmpty(),
                    innerTextField = it,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    contentAlignment = contentAlignment,
                    isError = isError,
                    placeholder = placeholder,
                    leadingIcon = leadingIcon,
                    textLayoutResult = layoutResult,
                    trailingIcon = trailingIcon,
                )
            }
        )
    }
}

@Composable
fun CupertinoTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    contentAlignment: Alignment.Vertical = Alignment.CenterVertically,
    colors: CupertinoTextFieldColors = CupertinoTextFieldDefaults.colors()
) {
    // If color is not provided via the text style, use content color as a default
    val textColor = textStyle.color.takeOrElse {
        colors.textColor(enabled, isError, interactionSource).value
    }
    val mergedTextStyle = textStyle.merge(TextStyle(color = textColor))

    CompositionLocalProvider(
        LocalTextSelectionColors provides colors.selectionColors
    ) {
        var layoutResult by remember {
            mutableStateOf<TextLayoutResult?>(null)
        }

        BasicTextField(
            value = value,
            modifier = Modifier
                .defaultMinSize(
                    minWidth = CupertinoTextFieldDefaults.MinWidth,
                    minHeight = CupertinoTextFieldDefaults.MinHeight
                ),
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            cursorBrush = SolidColor(colors.cursorColor(isError).value),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            onTextLayout = {
                layoutResult = it
            },
            decorationBox = {
                CupertinoTextFieldDefaults.DecorationBox(
                    modifier = modifier,
                    valueIsEmpty = value.text.isEmpty(),
                    innerTextField = it,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    contentAlignment = contentAlignment,
                    isError = isError,
                    placeholder = placeholder,
                    leadingIcon = leadingIcon,
                    textLayoutResult = layoutResult,
                    trailingIcon = trailingIcon,
                )
            }
        )
    }
}

@Composable
fun CupertinoBorderedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = CupertinoBorderedTextFieldDefaults.shape,
    strokeWidth: Dp = CupertinoBorderedTextFieldDefaults.StrokeWidth,
    paddingValues: PaddingValues = CupertinoBorderedTextFieldDefaults.PaddingValues,
    contentAlignment: Alignment.Vertical = Alignment.CenterVertically,
    colors: CupertinoTextFieldColors = CupertinoBorderedTextFieldDefaults.colors()
) {
    Border(
        modifier = modifier,
        strokeWidth = strokeWidth,
        enabled = enabled,
        isError = isError,
        interactionSource = interactionSource,
        colors = colors,
        shape = shape,
        paddingValues = paddingValues
    ) {
        CupertinoTextField(
            modifier = Modifier,
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = textStyle,
            placeholder = placeholder,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            isError = isError,
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            interactionSource = interactionSource,
            contentAlignment = contentAlignment,
            colors = colors
        )
    }
}

@Composable
fun CupertinoBorderedTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = CupertinoBorderedTextFieldDefaults.shape,
    strokeWidth: Dp = CupertinoBorderedTextFieldDefaults.StrokeWidth,
    paddingValues: PaddingValues = CupertinoBorderedTextFieldDefaults.PaddingValues,
    contentAlignment: Alignment.Vertical = Alignment.CenterVertically,
    colors: CupertinoTextFieldColors = CupertinoBorderedTextFieldDefaults.colors()
) {
    Border(
        modifier = modifier,
        strokeWidth = strokeWidth,
        enabled = enabled,
        isError = isError,
        interactionSource = interactionSource,
        colors = colors,
        shape = shape,
        paddingValues = paddingValues
    ) {
        CupertinoTextField(
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = textStyle,
            placeholder = placeholder,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            isError = isError,
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            interactionSource = interactionSource,
            contentAlignment = contentAlignment,
            colors = colors
        )
    }
}

@Immutable
class CupertinoTextFieldColors internal constructor(
    private val focusedTextColor: Color,
    private val unfocusedTextColor: Color,
    private val disabledTextColor: Color,
    private val errorTextColor: Color,
    private val focusedContainerColor: Color,
    private val unfocusedContainerColor: Color,
    private val disabledContainerColor: Color,
    private val errorContainerColor: Color,
    private val cursorColor: Color,
    private val errorCursorColor: Color,
    private val textSelectionColors: TextSelectionColors,
    private val focusedIndicatorColor: Color,
    private val unfocusedIndicatorColor: Color,
    private val disabledIndicatorColor: Color,
    private val errorIndicatorColor: Color,
    private val focusedLeadingIconColor: Color,
    private val unfocusedLeadingIconColor: Color,
    private val disabledLeadingIconColor: Color,
    private val errorLeadingIconColor: Color,
    private val focusedTrailingIconColor: Color,
    private val unfocusedTrailingIconColor: Color,
    private val disabledTrailingIconColor: Color,
    private val errorTrailingIconColor: Color,
    private val focusedPlaceholderColor: Color,
    private val unfocusedPlaceholderColor: Color,
    private val disabledPlaceholderColor: Color,
    private val errorPlaceholderColor: Color
) {
    /**
     * Represents the color used for the leading icon of this text field.
     *
     * @param enabled whether the text field is enabled
     * @param isError whether the text field's current value is in error
     * @param interactionSource the [InteractionSource] of this text field. Helps to determine if
     * the text field is in focus or not
     */
    @Composable
    internal fun leadingIconColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        return rememberUpdatedState(
            when {
                !enabled -> disabledLeadingIconColor
                isError -> errorLeadingIconColor
                focused -> focusedLeadingIconColor
                else -> unfocusedLeadingIconColor
            }
        )
    }

    /**
     * Represents the color used for the trailing icon of this text field.
     *
     * @param enabled whether the text field is enabled
     * @param isError whether the text field's current value is in error
     * @param interactionSource the [InteractionSource] of this text field. Helps to determine if
     * the text field is in focus or not
     */
    @Composable
    internal fun trailingIconColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        return rememberUpdatedState(
            when {
                !enabled -> disabledTrailingIconColor
                isError -> errorTrailingIconColor
                focused -> focusedTrailingIconColor
                else -> unfocusedTrailingIconColor
            }
        )
    }

    /**
     * Represents the color used for the border indicator of this text field.
     *
     * @param enabled whether the text field is enabled
     * @param isError whether the text field's current value is in error
     * @param interactionSource the [InteractionSource] of this text field. Helps to determine if
     * the text field is in focus or not
     */
    @Composable
    internal fun indicatorColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledIndicatorColor
            isError -> errorIndicatorColor
            focused -> focusedIndicatorColor
            else -> unfocusedIndicatorColor
        }
        return rememberUpdatedState(targetValue)
    }

    /**
     * Represents the container color for this text field.
     *
     * @param enabled whether the text field is enabled
     * @param isError whether the text field's current value is in error
     * @param interactionSource the [InteractionSource] of this text field. Helps to determine if
     * the text field is in focus or not
     */
    @Composable
    internal fun containerColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledContainerColor
            isError -> errorContainerColor
            focused -> focusedContainerColor
            else -> unfocusedContainerColor
        }
        return rememberUpdatedState(targetValue)
    }

    /**
     * Represents the color used for the placeholder of this text field.
     *
     * @param enabled whether the text field is enabled
     * @param isError whether the text field's current value is in error
     * @param interactionSource the [InteractionSource] of this text field. Helps to determine if
     * the text field is in focus or not
     */
    @Composable
    internal fun placeholderColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledPlaceholderColor
            isError -> errorPlaceholderColor
            focused -> focusedPlaceholderColor
            else -> unfocusedPlaceholderColor
        }
        return rememberUpdatedState(targetValue)
    }

    /**
     * Represents the color used for the input field of this text field.
     *
     * @param enabled whether the text field is enabled
     * @param isError whether the text field's current value is in error
     * @param interactionSource the [InteractionSource] of this text field. Helps to determine if
     * the text field is in focus or not
     */
    @Composable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledTextColor
            isError -> errorTextColor
            focused -> focusedTextColor
            else -> unfocusedTextColor
        }
        return rememberUpdatedState(targetValue)
    }

    /**
     * Represents the color used for the cursor of this text field.
     *
     * @param isError whether the text field's current value is in error
     */
    @Composable
    internal fun cursorColor(isError: Boolean): State<Color> {
        return rememberUpdatedState(if (isError) errorCursorColor else cursorColor)
    }

    /**
     * Represents the colors used for text selection in this text field.
     */
    internal val selectionColors: TextSelectionColors
        @Composable get() = textSelectionColors

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CupertinoTextFieldColors) return false

        if (focusedTextColor != other.focusedTextColor) return false
        if (unfocusedTextColor != other.unfocusedTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (errorTextColor != other.errorTextColor) return false
        if (focusedContainerColor != other.focusedContainerColor) return false
        if (unfocusedContainerColor != other.unfocusedContainerColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (errorContainerColor != other.errorContainerColor) return false
        if (cursorColor != other.cursorColor) return false
        if (errorCursorColor != other.errorCursorColor) return false
        if (textSelectionColors != other.textSelectionColors) return false
        if (focusedIndicatorColor != other.focusedIndicatorColor) return false
        if (unfocusedIndicatorColor != other.unfocusedIndicatorColor) return false
        if (disabledIndicatorColor != other.disabledIndicatorColor) return false
        if (errorIndicatorColor != other.errorIndicatorColor) return false
        if (focusedLeadingIconColor != other.focusedLeadingIconColor) return false
        if (unfocusedLeadingIconColor != other.unfocusedLeadingIconColor) return false
        if (disabledLeadingIconColor != other.disabledLeadingIconColor) return false
        if (errorLeadingIconColor != other.errorLeadingIconColor) return false
        if (focusedTrailingIconColor != other.focusedTrailingIconColor) return false
        if (unfocusedTrailingIconColor != other.unfocusedTrailingIconColor) return false
        if (disabledTrailingIconColor != other.disabledTrailingIconColor) return false
        if (errorTrailingIconColor != other.errorTrailingIconColor) return false
        if (focusedPlaceholderColor != other.focusedPlaceholderColor) return false
        if (unfocusedPlaceholderColor != other.unfocusedPlaceholderColor) return false
        if (disabledPlaceholderColor != other.disabledPlaceholderColor) return false
        if (errorPlaceholderColor != other.errorPlaceholderColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = focusedTextColor.hashCode()
        result = 31 * result + unfocusedTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + focusedContainerColor.hashCode()
        result = 31 * result + unfocusedContainerColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + errorContainerColor.hashCode()
        result = 31 * result + cursorColor.hashCode()
        result = 31 * result + errorCursorColor.hashCode()
        result = 31 * result + textSelectionColors.hashCode()
        result = 31 * result + focusedIndicatorColor.hashCode()
        result = 31 * result + unfocusedIndicatorColor.hashCode()
        result = 31 * result + disabledIndicatorColor.hashCode()
        result = 31 * result + errorIndicatorColor.hashCode()
        result = 31 * result + focusedLeadingIconColor.hashCode()
        result = 31 * result + unfocusedLeadingIconColor.hashCode()
        result = 31 * result + disabledLeadingIconColor.hashCode()
        result = 31 * result + errorLeadingIconColor.hashCode()
        result = 31 * result + focusedTrailingIconColor.hashCode()
        result = 31 * result + unfocusedTrailingIconColor.hashCode()
        result = 31 * result + disabledTrailingIconColor.hashCode()
        result = 31 * result + errorTrailingIconColor.hashCode()
        result = 31 * result + focusedPlaceholderColor.hashCode()
        result = 31 * result + unfocusedPlaceholderColor.hashCode()
        result = 31 * result + disabledPlaceholderColor.hashCode()
        result = 31 * result + errorPlaceholderColor.hashCode()

        return result
    }
}

@Immutable
object CupertinoBorderedTextFieldDefaults {


    val StrokeWidth : Dp = 1.dp

    /** Default shape for an [CupertinoTextField]. */
    val shape: Shape
        @ReadOnlyComposable
        @Composable
        get() = CupertinoTheme.shapes.small

    val PaddingValues = PaddingValues(horizontal = 8.dp, vertical = 4.dp)

    /**
     * Creates a [CupertinoTextFieldColors] that represents the default input text, container, and content
     * colors (including label, placeholder, icons, etc.) used in an [CupertinoTextField].
     *
     * @param focusedTextColor the color used for the input text of this text field when focused
     * @param unfocusedTextColor the color used for the input text of this text field when not
     * focused
     * @param disabledTextColor the color used for the input text of this text field when disabled
     * @param errorTextColor the color used for the input text of this text field when in error
     * state
     * @param focusedContainerColor the container color for this text field when focused
     * @param unfocusedContainerColor the container color for this text field when not focused
     * @param disabledContainerColor the container color for this text field when disabled
     * @param errorContainerColor the container color for this text field when in error state
     * @param cursorColor the cursor color for this text field
     * @param errorCursorColor the cursor color for this text field when in error state
     * @param selectionColors the colors used when the input text of this text field is selected
     * @param focusedBorderColor the border color for this text field when focused
     * @param unfocusedBorderColor the border color for this text field when not focused
     * @param disabledBorderColor the border color for this text field when disabled
     * @param errorBorderColor the border color for this text field when in error state
     * @param focusedLeadingIconColor the leading icon color for this text field when focused
     * @param unfocusedLeadingIconColor the leading icon color for this text field when not focused
     * @param disabledLeadingIconColor the leading icon color for this text field when disabled
     * @param errorLeadingIconColor the leading icon color for this text field when in error state
     * @param focusedTrailingIconColor the trailing icon color for this text field when focused
     * @param unfocusedTrailingIconColor the trailing icon color for this text field when not focused
     * @param disabledTrailingIconColor the trailing icon color for this text field when disabled
     * @param errorTrailingIconColor the trailing icon color for this text field when in error state
     * @param focusedPlaceholderColor the placeholder color for this text field when focused
     * @param unfocusedPlaceholderColor the placeholder color for this text field when not focused
     * @param disabledPlaceholderColor the placeholder color for this text field when disabled
     * @param errorPlaceholderColor the placeholder color for this text field when in error state
     */
    @Composable
    fun colors(
        focusedTextColor: Color = CupertinoTheme.colorScheme.label,
        unfocusedTextColor: Color = CupertinoTheme.colorScheme.label,
        disabledTextColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        errorTextColor: Color = CupertinoColors.systemRed,
        focusedContainerColor: Color = Color.Transparent,
        unfocusedContainerColor: Color = focusedContainerColor,
        disabledContainerColor: Color = unfocusedContainerColor,
        errorContainerColor: Color = disabledContainerColor,
        cursorColor: Color = CupertinoTheme.colorScheme.accent,
        errorCursorColor: Color = errorTextColor,
        selectionColors: TextSelectionColors =
            TextSelectionColors(cursorColor, cursorColor.copy(alpha = .25f)),
        focusedBorderColor: Color = CupertinoTheme.colorScheme.quaternaryLabel,
        unfocusedBorderColor: Color = focusedBorderColor,
        disabledBorderColor: Color = focusedBorderColor,
        errorBorderColor: Color = errorTextColor,
        focusedLeadingIconColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        unfocusedLeadingIconColor: Color = focusedLeadingIconColor,
        disabledLeadingIconColor: Color = focusedLeadingIconColor,
        errorLeadingIconColor: Color = focusedLeadingIconColor,
        focusedTrailingIconColor: Color = focusedLeadingIconColor,
        unfocusedTrailingIconColor: Color = focusedTrailingIconColor,
        disabledTrailingIconColor: Color = focusedTrailingIconColor,
        errorTrailingIconColor: Color = focusedTrailingIconColor,
        focusedPlaceholderColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        unfocusedPlaceholderColor: Color = focusedPlaceholderColor,
        disabledPlaceholderColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        errorPlaceholderColor: Color = focusedPlaceholderColor,
    ): CupertinoTextFieldColors =
        CupertinoTextFieldColors(
            focusedTextColor = focusedTextColor,
            unfocusedTextColor = unfocusedTextColor,
            disabledTextColor = disabledTextColor,
            errorTextColor = errorTextColor,
            focusedContainerColor = focusedContainerColor,
            unfocusedContainerColor = unfocusedContainerColor,
            disabledContainerColor = disabledContainerColor,
            errorContainerColor = errorContainerColor,
            cursorColor = cursorColor,
            errorCursorColor = errorCursorColor,
            textSelectionColors = selectionColors,
            focusedIndicatorColor = focusedBorderColor,
            unfocusedIndicatorColor = unfocusedBorderColor,
            disabledIndicatorColor = disabledBorderColor,
            errorIndicatorColor = errorBorderColor,
            focusedLeadingIconColor = focusedLeadingIconColor,
            unfocusedLeadingIconColor = unfocusedLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,
            focusedTrailingIconColor = focusedTrailingIconColor,
            unfocusedTrailingIconColor = unfocusedTrailingIconColor,
            disabledTrailingIconColor = disabledTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            unfocusedPlaceholderColor = unfocusedPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
        )

}

@Immutable
object CupertinoTextFieldDefaults  {

    /**
     * The default min width applied to an [CupertinoTextField].
     * Note that you can override it by applying Modifier.heightIn directly on a text field.
     */
    val MinHeight = 26.dp

    /**
     * The default min width applied to an [CupertinoTextField].
     * Note that you can override it by applying Modifier.widthIn directly on a text field.
     */
    val MinWidth = 280.dp

    /**
     * The default thickness of the border in [CupertinoTextField] in unfocused state.
     */
    val UnfocusedBorderThickness = 1.dp

    /**
     * The default thickness of the border in [CupertinoTextField] in focused state.
     */
    val FocusedBorderThickness = 2.dp


    /**
     * Creates a [CupertinoTextFieldColors] that represents the default input text, container, and content
     * colors (including label, placeholder, icons, etc.) used in an [CupertinoTextField].
     *
     * @param focusedTextColor the color used for the input text of this text field when focused
     * @param unfocusedTextColor the color used for the input text of this text field when not
     * focused
     * @param disabledTextColor the color used for the input text of this text field when disabled
     * @param errorTextColor the color used for the input text of this text field when in error
     * state
     * @param focusedContainerColor the container color for this text field when focused
     * @param unfocusedContainerColor the container color for this text field when not focused
     * @param disabledContainerColor the container color for this text field when disabled
     * @param errorContainerColor the container color for this text field when in error state
     * @param cursorColor the cursor color for this text field
     * @param errorCursorColor the cursor color for this text field when in error state
     * @param selectionColors the colors used when the input text of this text field is selected
     * @param focusedBorderColor the border color for this text field when focused
     * @param unfocusedBorderColor the border color for this text field when not focused
     * @param disabledBorderColor the border color for this text field when disabled
     * @param errorBorderColor the border color for this text field when in error state
     * @param focusedLeadingIconColor the leading icon color for this text field when focused
     * @param unfocusedLeadingIconColor the leading icon color for this text field when not focused
     * @param disabledLeadingIconColor the leading icon color for this text field when disabled
     * @param errorLeadingIconColor the leading icon color for this text field when in error state
     * @param focusedTrailingIconColor the trailing icon color for this text field when focused
     * @param unfocusedTrailingIconColor the trailing icon color for this text field when not focused
     * @param disabledTrailingIconColor the trailing icon color for this text field when disabled
     * @param errorTrailingIconColor the trailing icon color for this text field when in error state
     * @param focusedPlaceholderColor the placeholder color for this text field when focused
     * @param unfocusedPlaceholderColor the placeholder color for this text field when not focused
     * @param disabledPlaceholderColor the placeholder color for this text field when disabled
     * @param errorPlaceholderColor the placeholder color for this text field when in error state
     */
    @Composable
    fun colors(
        focusedTextColor: Color = CupertinoTheme.colorScheme.label,
        unfocusedTextColor: Color = CupertinoTheme.colorScheme.label,
        disabledTextColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        errorTextColor: Color = CupertinoColors.systemRed,
        focusedContainerColor: Color = Color.Transparent,
        unfocusedContainerColor: Color = Color.Transparent,
        disabledContainerColor: Color = Color.Transparent,
        errorContainerColor: Color = Color.Transparent,
        cursorColor: Color = CupertinoTheme.colorScheme.accent,
        errorCursorColor: Color = CupertinoColors.systemRed,
        selectionColors: TextSelectionColors =
            TextSelectionColors(cursorColor, cursorColor.copy(alpha = .25f)),
        focusedBorderColor: Color = Color.Transparent,
        unfocusedBorderColor: Color = Color.Transparent,
        disabledBorderColor: Color = Color.Transparent,
        errorBorderColor: Color = Color.Transparent,
        focusedLeadingIconColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        unfocusedLeadingIconColor: Color = focusedLeadingIconColor,
        disabledLeadingIconColor: Color = focusedLeadingIconColor,
        errorLeadingIconColor: Color = focusedLeadingIconColor,
        focusedTrailingIconColor: Color = focusedLeadingIconColor,
        unfocusedTrailingIconColor: Color = focusedTrailingIconColor,
        disabledTrailingIconColor: Color = focusedTrailingIconColor,
        errorTrailingIconColor: Color = focusedTrailingIconColor,
        focusedPlaceholderColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        unfocusedPlaceholderColor: Color = focusedPlaceholderColor,
        disabledPlaceholderColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        errorPlaceholderColor: Color = focusedPlaceholderColor,
    ): CupertinoTextFieldColors =
        CupertinoTextFieldColors(
            focusedTextColor = focusedTextColor,
            unfocusedTextColor = unfocusedTextColor,
            disabledTextColor = disabledTextColor,
            errorTextColor = errorTextColor,
            focusedContainerColor = focusedContainerColor,
            unfocusedContainerColor = unfocusedContainerColor,
            disabledContainerColor = disabledContainerColor,
            errorContainerColor = errorContainerColor,
            cursorColor = cursorColor,
            errorCursorColor = errorCursorColor,
            textSelectionColors = selectionColors,
            focusedIndicatorColor = focusedBorderColor,
            unfocusedIndicatorColor = unfocusedBorderColor,
            disabledIndicatorColor = disabledBorderColor,
            errorIndicatorColor = errorBorderColor,
            focusedLeadingIconColor = focusedLeadingIconColor,
            unfocusedLeadingIconColor = unfocusedLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,
            focusedTrailingIconColor = focusedTrailingIconColor,
            unfocusedTrailingIconColor = unfocusedTrailingIconColor,
            disabledTrailingIconColor = disabledTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            unfocusedPlaceholderColor = unfocusedPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
        )

    @Composable
    fun DecorationBox(
        valueIsEmpty: Boolean,
        innerTextField: @Composable () -> Unit,
        enabled: Boolean,
        contentAlignment: Alignment.Vertical,
        interactionSource: InteractionSource,
        textLayoutResult: TextLayoutResult?,
        isError: Boolean = false,
        modifier: Modifier = Modifier,
        placeholder: @Composable (() -> Unit)? = null,
        leadingIcon: @Composable (() -> Unit)? = null,
        trailingIcon: @Composable (() -> Unit)? = null,
        colors: CupertinoTextFieldColors = colors()
    ) {
        val alignment = if (textLayoutResult != null && textLayoutResult.lineCount > 1)
            contentAlignment else Alignment.CenterVertically

        Row(
            modifier = modifier,
            verticalAlignment = alignment,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Box(Modifier.padding(IconsPadding)) {

                CompositionLocalProvider(
                    LocalContentColor provides colors.leadingIconColor(
                        enabled = enabled,
                        isError = isError,
                        interactionSource = interactionSource
                    ).value
                ) {
                    leadingIcon?.invoke()
                }
            }

            Box(Modifier.weight(1f)) {
                innerTextField()
                if (valueIsEmpty && placeholder != null) {
                    CompositionLocalProvider(
                        LocalContentColor provides colors.placeholderColor(
                            enabled = enabled,
                            isError = isError,
                            interactionSource = interactionSource
                        ).value
                    ) {
                        placeholder()
                    }
                }
            }

            Box(Modifier.padding(IconsPadding)) {
                CompositionLocalProvider(
                    LocalContentColor provides colors.trailingIconColor(
                        enabled = enabled,
                        isError = isError,
                        interactionSource = interactionSource
                    ).value
                ) {
                    trailingIcon?.invoke()
                }
            }
        }
    }
}

@Composable
private fun Border(
    modifier: Modifier,
    strokeWidth: Dp,
    enabled : Boolean,
    isError: Boolean,
    interactionSource: MutableInteractionSource,
    colors: CupertinoTextFieldColors,
    shape: Shape,
    paddingValues: PaddingValues,
    textField : @Composable () -> Unit
) {
    Box(
        modifier
            .clip(shape)
            .border(strokeWidth, colors.indicatorColor(enabled, isError, interactionSource).value, shape)
            .background(colors.containerColor(enabled, isError, interactionSource).value)
            .padding(paddingValues)
    ){
        textField()
    }
}

@Composable
private fun animateBorderStrokeAsState(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
    colors: CupertinoTextFieldColors,
    focusedBorderThickness: Dp,
    unfocusedBorderThickness: Dp
): State<BorderStroke> {
    val focused by interactionSource.collectIsFocusedAsState()
    val indicatorColor = colors.indicatorColor(enabled, isError, interactionSource)
    val targetThickness = if (focused) focusedBorderThickness else unfocusedBorderThickness
    val animatedThickness = if (enabled) {
        animateDpAsState(targetThickness, tween(durationMillis = AnimationDuration))
    } else {
        rememberUpdatedState(unfocusedBorderThickness)
    }
    return rememberUpdatedState(
        BorderStroke(animatedThickness.value, SolidColor(indicatorColor.value))
    )
}

private val IconsPadding = PaddingValues(vertical = 2.dp)
private val AnimationDuration = 200