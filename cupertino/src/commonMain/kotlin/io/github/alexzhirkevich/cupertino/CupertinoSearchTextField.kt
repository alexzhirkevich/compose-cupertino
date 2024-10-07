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

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animate
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.LocalTextStyle
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults.plainButtonColors
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.MagnifyingGlass
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionTokens
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.isDark
import io.github.alexzhirkevich.cupertino.theme.systemRed
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged


/**
 * State of the [CupertinoSearchTextField]
 *
 * @param initiallyExpanded is search field is expanded after composition
 * @param scrollableState state of the scrollable container below the text field
 * @param collapse controls if search field should be collapsed on scroll.
 * Native behavior (default) prevents collapsing when search is focused
 * @param blockScrollWhenFocusedAndEmpty when search field is focused and search is empty
 * [scrollableState] will be blocked (native behavior)
 * */
@Composable
fun rememberCupertinoSearchTextFieldState(
    initiallyExpanded: Boolean = true,
    scrollableState: ScrollableState? = null,
    collapse : (CupertinoSearchTextFieldState) -> Boolean = { !it.isFocused },
    blockScrollWhenFocusedAndEmpty : Boolean = true,
) : CupertinoSearchTextFieldState {

    val density = LocalDensity.current


    val updatedCollapse by rememberUpdatedState(collapse)

    return remember(scrollableState, blockScrollWhenFocusedAndEmpty) {
        CupertinoSearchTextFieldState(
            initiallyExpanded = initiallyExpanded,
            collapse = {
                updatedCollapse(it)
            },
            blockScrollWhenSearchIsFocusedAndEmpty = blockScrollWhenFocusedAndEmpty,
            scrollableState = scrollableState,
        ).apply {
            maxHeightPx = density.run { CupertinoSearchTextFieldTokens.MaxHeight.toPx() }
        }
    }
}

/**
 * Single line search text field like the UIKit/SwiftUI one. Supports slide-in Cancel button and collapsing
 * via nested scroll connection.
 *
 * Whenever the user edits the text, [onValueChange] is called with the most up to date state
 * represented by [String] with which developer is expected to update their state.
 *
 * Unlike [TextFieldValue] overload, this composable does not let the developer to control
 * selection, cursor and text composition information. Please check [TextFieldValue] and
 * corresponding [BasicTextField] overload for more information.
 *
 * @param value the input [String] text to be shown in the text field
 * @param onValueChange the callback that is triggered when the input service updates the text. An
 * updated text comes as a parameter of the callback
 * @param modifier optional [Modifier] for this text field.
 * @param enabled controls the enabled state of the [BasicTextField]. When `false`, the text
 * field will be neither editable nor focusable, the input of the text field will not be selectable
 * @param readOnly controls the editable state of the [BasicTextField]. When `true`, the text
 * field can not be modified, however, a user can focus it and copy text from it. Read-only text
 * fields are usually used to display pre-filled forms that user can not edit
 * @param textStyle Style configuration that applies at character level such as color, font etc.
 * @param keyboardOptions software keyboard options that contains configuration such as
 * [KeyboardType] and [ImeAction].
 * @param keyboardActions when the input service emits an IME action, the corresponding callback
 * is called. Note that this IME action may be different from what you specified in
 * [KeyboardOptions.imeAction].
 * @param visualTransformation The visual transformation filter for changing the visual
 * representation of the input. By default no visual transformation is applied.
 * @param interactionSource the [MutableInteractionSource] representing the stream of
 * [Interaction]s for this TextField. You can create and pass in your own remembered
 * [MutableInteractionSource] if you want to observe [Interaction]s and customize the
 * appearance / behavior of this TextField in different [Interaction]s.
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSearchTextField(
    value: String,
    onValueChange: (String) -> Unit,
    state: CupertinoSearchTextFieldState = rememberCupertinoSearchTextFieldState(),
    colors: CupertinoTextFieldColors = CupertinoSearchTextFieldDefaults.colors(),
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = CupertinoSearchTextFieldDefaults.PaddingValues,
    shape: Shape = CupertinoSearchTextFieldDefaults.shape,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    keyboardOptions: KeyboardOptions = remember {
        KeyboardOptions(imeAction = ImeAction.Search)
    },
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: @Composable () -> Unit = {
        CupertinoText("Search")
    },
    cancelButton: @Composable() (() -> Unit)? = {
        CupertinoSearchTextFieldDefaults
            .cancelButton(
                onValueChange = onValueChange,
                interactionSource = interactionSource
            )
    },
    leadingIcon: @Composable () -> Unit = {
        CupertinoSearchTextFieldDefaults.leadingIcon()
    },
    trailingIcon: @Composable () -> Unit = {},
) {

    val focusManager = LocalFocusManager.current

    val density = LocalDensity.current


    val heightDp by remember(state) {
        derivedStateOf {
            val fraction = (1f - state.progress * (1 + state.paddingToHeight)).coerceIn(0f,1f)
            with(density) { state.maxHeightPx.toDp() * fraction }
        }
    }

    val layoutDirection = LocalLayoutDirection.current

    val padding by remember(state, paddingValues, layoutDirection) {
        derivedStateOf {
            val fraction = if (state.progress <  1 - state.paddingToHeight)
                1f
            else (1f - (state.progress - (1 - state.paddingToHeight)) / (1 - state.paddingToHeight)).coerceIn(0f,1f)

            paddingValues.copy(
                layoutDirection = layoutDirection,
                top = paddingValues.calculateTopPadding() * fraction,
                bottom = paddingValues.calculateBottomPadding() * fraction
            )
        }
    }

    val focused by interactionSource.collectIsFocusedAsState()

    // free focus when text field starts collapsing
    LaunchedEffect(state) {
        snapshotFlow {
            state.progress > Float.MIN_VALUE
        }.distinctUntilChanged().collect {
            if (it) {
                focusManager.clearFocus(true)
            }
        }
    }

    LaunchedEffect(state.isFocused, value) {
        state.canScroll = !state.isFocused || value.isNotEmpty()
    }

    LaunchedEffect(state, interactionSource) {
        snapshotFlow { focused }.collectLatest {
            state.setFocused(it)
        }
    }

    LaunchedEffect(paddingValues, state.maxHeightPx,density) {
        density.run {
            val v = (paddingValues.calculateBottomPadding() + paddingValues.calculateTopPadding())
                    .toPx() / state.maxHeightPx

            if (v >= .95f)
                state.paddingToHeight = 0f
            else state.paddingToHeight = v
        }
    }

    val totalHeight by remember {
        derivedStateOf {
            heightDp +
                    padding.calculateBottomPadding() +
                    padding.calculateTopPadding()
        }
    }
    Row(
        modifier = modifier
            .height(totalHeight)
            .padding(paddingValues),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val alpha = Modifier.graphicsLayer {
            alpha = ((1f - state.progress * 4 / (1 - state.paddingToHeight) ) ).coerceIn(0f, 1f)
        }

        CupertinoBorderedTextField(
            modifier = Modifier
                .weight(1f)
                .focusable(),
            value = value,
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            colors = colors,
            textStyle = textStyle,
            shape = shape,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = true,
            maxLines = 1,
            minLines = 1,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            trailingIcon = {
                Box(alpha) {
                    trailingIcon()
                }
            },
            leadingIcon = {
                Box(alpha) {
                    leadingIcon()
                }
            },
            placeholder = {
                Box(alpha) {
                    placeholder()
                }
            },
        )


        if (cancelButton != null) {
            CompositionLocalProvider(
                LocalContentColor provides colors.cursorColor(false).value
            ) {
                CancelButton(
                    state = state,
                    content = cancelButton
                )
            }
        }
    }
}

@Composable
private fun RowScope.CancelButton(
    state: CupertinoSearchTextFieldState,
    content: @Composable () -> Unit
) {
    val progressIsZero by remember {
        derivedStateOf {
            state.progress == 0f
        }
    }

    AnimatedVisibility(
        visible = state.isFocused && progressIsZero,
        enter = fadeIn() +
                expandHorizontally(expandFrom = Alignment.Start, clip = false),
        exit = fadeOut() +
                shrinkHorizontally(shrinkTowards = Alignment.Start, clip = false)
    ) {

        content()
    }
}

@Immutable
object CupertinoSearchTextFieldDefaults {

    val shape: Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.shapes.medium

    val PaddingValues = PaddingValues(
        horizontal = CupertinoSectionTokens.HorizontalPadding
    )

    @Composable
    fun leadingIcon(
        imageVector: ImageVector = CupertinoIcons.Outlined.MagnifyingGlass,
        rotateWithLayoutDirection: Boolean = true,
    ) {

        val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

        CupertinoIcon(
            modifier = Modifier
                .size(CupertinoSearchTextFieldTokens.LeadingIconSize)
                .graphicsLayer {
                    rotationY = if (isRtl && rotateWithLayoutDirection)
                        180f else 0f
                },
            imageVector = imageVector,
            contentDescription = null
        )
    }

    /**
     * Default plain cancel button that clears input and hides keyboard on click
     * */
    @OptIn(ExperimentalCupertinoApi::class)
    @Composable
    fun cancelButton(
        onValueChange: (String) -> Unit,
        colors: CupertinoButtonColors = plainButtonColors(),
        interactionSource: MutableInteractionSource,
        content: @Composable RowScope.() -> Unit = { CupertinoText("Cancel") },
    ) {

        val focusManager = LocalFocusManager.current

        CupertinoButton(
            modifier = Modifier.padding(start = 4.dp),
            colors = colors,
            interactionSource = interactionSource,
            contentPadding = PaddingValues(6.dp, 4.dp, 0.dp, 4.dp),
            onClick = {
                onValueChange("")
                focusManager.clearFocus(true)
            },
            content = content
        )
    }

    @Composable
    @ReadOnlyComposable
    fun colors(
        focusedTextColor: Color = CupertinoTheme.colorScheme.label,
        unfocusedTextColor: Color = CupertinoTheme.colorScheme.label,
        disabledTextColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        errorTextColor: Color = CupertinoColors.systemRed,
        focusedContainerColor: Color = if (isDark())
            CupertinoTheme.colorScheme.tertiarySystemFill
        else CupertinoTheme.colorScheme.quaternarySystemFill,
        unfocusedContainerColor: Color = focusedContainerColor,
        disabledContainerColor: Color = unfocusedContainerColor,
        errorContainerColor: Color = disabledContainerColor,
        cursorColor: Color = CupertinoTheme.colorScheme.accent,
        errorCursorColor: Color = errorTextColor,
        selectionColors: TextSelectionColors =
            TextSelectionColors(cursorColor, cursorColor.copy(alpha = .25f)),
        focusedBorderColor: Color = Color.Transparent,
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
    ): CupertinoTextFieldColors = CupertinoTextFieldColors(
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

internal object CupertinoSearchTextFieldTokens {
    val MaxHeight = 36.dp

    val LeadingIconSize = 16.dp
}

class CupertinoSearchTextFieldState internal constructor(
    initiallyExpanded : Boolean,
    blockScrollWhenSearchIsFocusedAndEmpty : Boolean,
    private val collapse: (CupertinoSearchTextFieldState) -> Boolean,
    private val scrollableState: ScrollableState?,
)  {

    /**
     * Nested scroll connection that should be applied to scrollable container or it's host.
     * Allows to collapse the text field during scrolling
     * */
    val nestedScrollConnection: NestedScrollConnection =
        CupertinoSearchTextFieldNestedScroll(
            state = this,
            scrollableState = scrollableState,
            blockScrollWhenSearchIsFocusedAndEmpty = blockScrollWhenSearchIsFocusedAndEmpty
        )

    /**
     * Progress of the text field collapse.
     * 0 - expanded, 1 if collapsed
     * */
    var progress by mutableStateOf(if (initiallyExpanded) 0f else 1f)
        private set

    /**
     * Text field focus state
     * */
    var isFocused: Boolean by mutableStateOf(false)
        private set



    internal var canScroll: Boolean by mutableStateOf(true)

    internal var maxHeightPx by mutableStateOf(0f)

    internal var paddingToHeight by mutableStateOf(0f)

    private var collapsedBy by mutableStateOf(0f)


    internal fun setFocused(focused: Boolean) {
        this.isFocused = focused
    }

    internal fun onScroll(available: Float): Float {

        val oldCollapsed = collapsedBy

        val newCollapsedBy = (oldCollapsed - available).coerceIn(0f, maxHeightPx)

        if (collapse(this) || newCollapsedBy < oldCollapsed) {
            collapsedBy = newCollapsedBy
            progress = if (maxHeightPx == 0f) 0f else collapsedBy / maxHeightPx

            return oldCollapsed - collapsedBy
        }
        return 0f
    }


    internal suspend fun onRelease(): Velocity {

        // text field can't be collapsed if scrollable state can't be scrolled
        val willBeExpanded = scrollableState
            ?.let { !it.canScrollForward && !it.canScrollBackward } == true ||
            collapsedBy / (1 - paddingToHeight) <= maxHeightPx * .75


        animate(progress, if (willBeExpanded) 0f else 1f) { v, _ ->
            progress = v
        }

        collapsedBy = if (willBeExpanded) 0f else maxHeightPx

        return Velocity.Zero
    }
}


private class CupertinoSearchTextFieldNestedScroll(
    private val state: CupertinoSearchTextFieldState,
    private val blockScrollWhenSearchIsFocusedAndEmpty : Boolean,
    private val scrollableState: ScrollableState?,
) : NestedScrollConnection {

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {

        //  consume all scroll when scroll is blocked
        if (blockScrollWhenSearchIsFocusedAndEmpty && !state.canScroll){
            return available
        }

        // search should collapse after scrollable container reached top
        if (available.y > 0 && scrollableState?.canScrollBackward == true){
            return Offset.Zero
        }
        return Offset(0f, state.onScroll(available.y))
    }

    override fun onPostScroll(
        consumed: Offset,
        available: Offset,
        source: NestedScrollSource
    ): Offset = super.onPostScroll(consumed, available, source) +
            onPreScroll(available, source)

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        return state.onRelease()
    }
}
