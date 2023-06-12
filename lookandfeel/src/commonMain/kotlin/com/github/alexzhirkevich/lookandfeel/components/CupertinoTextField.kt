@file: Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")

package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.toColor
import androidx.compose.material3.tokens.OutlinedTextFieldTokens
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme


@ExperimentalMaterial3Api
@Composable
fun CupertinoOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = androidx.compose.material3.LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = AdaptiveTheme.shapes.medium,
    colors: androidx.compose.material3.TextFieldColors = TextFieldDefaults.cupertinoOutlinedTextFieldColors()
) {
    // If color is not provided via the text style, use content color as a default
    val textColor = textStyle.color.takeOrElse {
        colors.textColor(enabled).value
    }
    val mergedTextStyle = textStyle.merge(TextStyle(color = textColor))

    (BasicTextField(
        value = value,
        modifier = modifier
            .defaultMinSize(
                minWidth = TextFieldDefaults.MinWidth,
                minHeight = TextFieldDefaults.CupertinoMinHeight
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
        decorationBox = @Composable { innerTextField ->
            TextFieldDefaults.OutlinedTextFieldDecorationBox(
                value = value,
                visualTransformation = visualTransformation,
                innerTextField = innerTextField,
                placeholder = placeholder,
                label = null,
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
                supportingText = supportingText,
                singleLine = singleLine,
                enabled = enabled,
                isError = isError,
                interactionSource = interactionSource,
                colors = colors,
                container = {
                    Box(
                        Modifier
                            .border(
                                width = TextFieldDefaults.UnfocusedBorderThickness,
                                color = colors
                                    .indicatorColor(enabled, isError, interactionSource).value,
                                shape = shape
                            )
                            .background(color = colors.containerColor().value, shape = shape)
                    )
                }
            )
        }
    ))
}

@ExperimentalMaterial3Api
@Composable
fun CupertinoOutlinedTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = androidx.compose.material3.LocalTextStyle.current,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = AdaptiveTheme.shapes.medium,
    colors: androidx.compose.material3.TextFieldColors = TextFieldDefaults.cupertinoOutlinedTextFieldColors()
) {
// If color is not provided via the text style, use content color as a default
    val textColor = textStyle.color.takeOrElse {
        colors.textColor(enabled).value
    }
    val mergedTextStyle = textStyle.merge(TextStyle(color = textColor))

    (BasicTextField(
        value = value,
        modifier = modifier
            .defaultMinSize(
                minWidth = TextFieldDefaults.MinWidth,
                minHeight = TextFieldDefaults.CupertinoMinHeight
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
        decorationBox = @Composable { innerTextField ->
            TextFieldDefaults.OutlinedTextFieldDecorationBox(
                value = value.text,
                visualTransformation = visualTransformation,
                innerTextField = innerTextField,
                placeholder = placeholder,
                label = null,
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
                supportingText = supportingText,
                singleLine = singleLine,
                enabled = enabled,
                isError = isError,
                interactionSource = interactionSource,
                colors = colors,
                container = {
                    Box(
                        Modifier
                            .border(
                                width = TextFieldDefaults.UnfocusedBorderThickness,
                                color = colors.indicatorColor(enabled, isError, interactionSource).value,
                                shape = shape
                            )
                            .background(color = colors.containerColor().value, shape = shape))
                }
            )
        }
    ))
}

@ExperimentalMaterial3Api
val TextFieldDefaults.CupertinoMinHeight : Dp get() = 38.dp + 8.dp //vertical padding

@ExperimentalMaterial3Api
@Composable
fun TextFieldDefaults.cupertinoOutlinedTextFieldColors(
    textColor: Color = OutlinedTextFieldTokens.InputColor.toColor(),
    disabledTextColor: Color = OutlinedTextFieldTokens.DisabledInputColor.toColor()
        .copy(alpha = OutlinedTextFieldTokens.DisabledInputOpacity),
    containerColor: Color = Color.Transparent,
    cursorColor: Color = OutlinedTextFieldTokens.CaretColor.toColor(),
    errorCursorColor: Color = OutlinedTextFieldTokens.ErrorFocusCaretColor.toColor(),
    selectionColors: TextSelectionColors = LocalTextSelectionColors.current,
    focusedBorderColor: Color = OutlinedTextFieldTokens.OutlineColor.toColor(),
    unfocusedBorderColor: Color = OutlinedTextFieldTokens.OutlineColor.toColor(),
    disabledBorderColor: Color = OutlinedTextFieldTokens.DisabledOutlineColor.toColor()
        .copy(alpha = OutlinedTextFieldTokens.DisabledOutlineOpacity),
    errorBorderColor: Color = OutlinedTextFieldTokens.ErrorOutlineColor.toColor(),
    focusedLeadingIconColor: Color = OutlinedTextFieldTokens.FocusLeadingIconColor.toColor(),
    unfocusedLeadingIconColor: Color = OutlinedTextFieldTokens.LeadingIconColor.toColor(),
    disabledLeadingIconColor: Color = OutlinedTextFieldTokens.DisabledLeadingIconColor.toColor()
        .copy(alpha = OutlinedTextFieldTokens.DisabledLeadingIconOpacity),
    errorLeadingIconColor: Color = OutlinedTextFieldTokens.ErrorLeadingIconColor.toColor(),
    focusedTrailingIconColor: Color = OutlinedTextFieldTokens.FocusTrailingIconColor.toColor(),
    unfocusedTrailingIconColor: Color = OutlinedTextFieldTokens.TrailingIconColor.toColor(),
    disabledTrailingIconColor: Color = OutlinedTextFieldTokens.DisabledTrailingIconColor
        .toColor().copy(alpha = OutlinedTextFieldTokens.DisabledTrailingIconOpacity),
    errorTrailingIconColor: Color = OutlinedTextFieldTokens.ErrorTrailingIconColor.toColor(),
    focusedLabelColor: Color = OutlinedTextFieldTokens.FocusLabelColor.toColor(),
    unfocusedLabelColor: Color = OutlinedTextFieldTokens.LabelColor.toColor(),
    disabledLabelColor: Color = OutlinedTextFieldTokens.DisabledLabelColor.toColor()
        .copy(alpha = OutlinedTextFieldTokens.DisabledLabelOpacity),
    errorLabelColor: Color = OutlinedTextFieldTokens.ErrorLabelColor.toColor(),
    placeholderColor: Color = OutlinedTextFieldTokens.InputPlaceholderColor.toColor(),
    disabledPlaceholderColor: Color = OutlinedTextFieldTokens.DisabledInputColor.toColor()
        .copy(alpha = OutlinedTextFieldTokens.DisabledInputOpacity),
    focusedSupportingTextColor: Color = OutlinedTextFieldTokens.FocusSupportingColor.toColor(),
    unfocusedSupportingTextColor: Color = OutlinedTextFieldTokens.SupportingColor.toColor(),
    disabledSupportingTextColor: Color = OutlinedTextFieldTokens.DisabledSupportingColor
        .toColor().copy(alpha = OutlinedTextFieldTokens.DisabledSupportingOpacity),
    errorSupportingTextColor: Color = OutlinedTextFieldTokens.ErrorSupportingColor.toColor(),
) = outlinedTextFieldColors(
    textColor = textColor,
    disabledTextColor = disabledTextColor,
    containerColor = containerColor,
    cursorColor = cursorColor,
    errorCursorColor = errorCursorColor,
    selectionColors = selectionColors,
    focusedBorderColor = focusedBorderColor,
    unfocusedBorderColor = unfocusedBorderColor,
    disabledBorderColor = disabledBorderColor,
    errorBorderColor = errorBorderColor,
    focusedLeadingIconColor = focusedLeadingIconColor,
    unfocusedLeadingIconColor = unfocusedLeadingIconColor,
    disabledLeadingIconColor = disabledLeadingIconColor,
    errorLeadingIconColor = errorLeadingIconColor,
    focusedTrailingIconColor = focusedTrailingIconColor,
    unfocusedTrailingIconColor = unfocusedTrailingIconColor,
    disabledTrailingIconColor = disabledTrailingIconColor,
    errorTrailingIconColor = errorTrailingIconColor,
    focusedLabelColor = focusedLabelColor,
    unfocusedLabelColor = unfocusedLabelColor,
    disabledLabelColor = disabledLabelColor,
    errorLabelColor = errorLabelColor,
    placeholderColor = placeholderColor,
    disabledPlaceholderColor = disabledPlaceholderColor,
    focusedSupportingTextColor = focusedSupportingTextColor,
    unfocusedSupportingTextColor = unfocusedSupportingTextColor,
    disabledSupportingTextColor = disabledSupportingTextColor,
    errorSupportingTextColor = errorSupportingTextColor
)