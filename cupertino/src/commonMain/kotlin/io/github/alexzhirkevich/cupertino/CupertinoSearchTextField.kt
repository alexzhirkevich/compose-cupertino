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

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.MagnifyingGlass
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionTokens
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.isDark


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

    return remember {
        CupertinoSearchTextFieldState(
            initiallyExpanded = initiallyExpanded,
            collapse = collapse,
            blockScrollWhenSearchIsFocusedAndEmpty = blockScrollWhenFocusedAndEmpty,
//            topAppBarScrollBehavior = topAppBarScrollBehavior,
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
 * @param onTextLayout Callback that is executed when a new text layout is calculated. A
 * [TextLayoutResult] object that callback provides contains paragraph information, size of the
 * text, baselines and other details. The callback can be used to add additional decoration or
 * functionality to the text. For example, to draw a cursor or selection around the text.
 * @param interactionSource the [MutableInteractionSource] representing the stream of
 * [Interaction]s for this TextField. You can create and pass in your own remembered
 * [MutableInteractionSource] if you want to observe [Interaction]s and customize the
 * appearance / behavior of this TextField in different [Interaction]s.
 * @param cursorBrush [Brush] to paint cursor with. If [SolidColor] with [Color.Unspecified]
 * provided, there will be no cursor drawn
 * as icon, placeholder, helper messages or similar, and automatically increase the hit target area
 * of the text field. To allow you to control the placement of the inner text field relative to your
 * decorations, the text field implementation will pass in a framework-controlled composable
 * parameter "innerTextField" to the decorationBox lambda you provide. You must call
 * innerTextField exactly once.
 */
@OptIn(ExperimentalComposeUiApi::class)
@Composable
@ExperimentalCupertinoApi
fun CupertinoSearchTextField(
    value : String,
    onValueChange : (String) -> Unit,
    state : CupertinoSearchTextFieldState = rememberCupertinoSearchTextFieldState(),
    colors: CupertinoSearchTextFieldColors = CupertinoSearchTextFieldDefaults.colors(),
    modifier: Modifier = Modifier,
    paddingValues : PaddingValues = CupertinoSearchTextFieldDefaults.PaddingValues,
    enabled : Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = CupertinoTheme.typography.body,
    keyboardOptions: KeyboardOptions = remember {
        KeyboardOptions(imeAction = ImeAction.Search)
    },
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    cursorBrush: Brush = SolidColor(CupertinoTheme.colorScheme.accent),
    placeholder : @Composable () -> Unit = {
        CupertinoText("Search")
    },
    cancelButton : (@Composable () -> Unit)? = CupertinoSearchTextFieldDefaults
        .cancelButton(onValueChange = onValueChange),
    leadingIcon : @Composable () -> Unit = CupertinoSearchTextFieldDefaults.leadingIcon(),
    trailingIcon: @Composable () -> Unit = {},
) {
    val focused by interactionSource.collectIsFocusedAsState()

    LaunchedEffect(focused){
        state.setFocused(focused)
    }

    var cancelButtonSize by remember { mutableStateOf(0) }

    val focusManager = LocalFocusManager.current

    val cancelButtonSizeAnimated by animateIntAsState(
        cancelButtonSize,
        animationSpec =  spring(
            stiffness = Spring.StiffnessMediumLow,
        )
    )

    val density = LocalDensity.current
    val heightDp by remember {
        derivedStateOf {
            with(density){state.maxHeightPx.toDp() * (1f -state.progress) }
        }
    }

    val kb = LocalSoftwareKeyboardController.current
    // free focus when text field starts collapsing
    LaunchedEffect(state.progress > Float.MIN_VALUE){
        if (state.progress > Float.MIN_VALUE){
            cancelButtonSize = 0
            kb?.hide()
            focusManager.clearFocus(true)
        }
    }


    Box(
        modifier = modifier
            .height(heightDp + paddingValues.calculateBottomPadding() + paddingValues.calculateTopPadding())
            .padding(paddingValues)

    ) {
        val progressIsZero by remember {
            derivedStateOf {
                state.progress == 0f
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = LocalDensity.current.run {
                    cancelButtonSizeAnimated.toDp()
                })
                .clip(CupertinoSearchTextFieldDefaults.Shape)
                .background(colors.containerColor(enabled))
                .padding(horizontal = CupertinoSearchTextFieldTokens.HorizontalSpacing)
                .graphicsLayer {
                    alpha = ((1f - state.progress)/.25f).coerceIn(0f,1f)
                },
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement
                    .spacedBy(CupertinoSearchTextFieldTokens.HorizontalSpacing),
                modifier = Modifier
                    .graphicsLayer {
                        alpha = (1f - state.progress * 4).coerceIn(0f, 1f)
                    }
                    .fillMaxSize()
            ) {
                CompositionLocalProvider(
                    LocalContentColor provides colors.leadingIconColor
                ) {
                    leadingIcon()
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {

                    LaunchedEffect(state.isFocused, value) {
                        state.canScroll = !state.isFocused || value.isNotEmpty()
                    }

                    BasicTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .focusable(),
                        value = value,
                        onValueChange = onValueChange,
                        enabled = enabled,
                        readOnly = readOnly,
                        textStyle = textStyle.copy(
                            color = colors.textColor(enabled)
                        ),
                        keyboardOptions = keyboardOptions,
                        keyboardActions = keyboardActions,
                        singleLine = true,
                        maxLines = 1,
                        minLines = 1,
                        visualTransformation = visualTransformation,
                        onTextLayout = onTextLayout,
                        interactionSource = interactionSource,
                        cursorBrush = cursorBrush,
                    )
                    if (value.isEmpty()) {
                        CompositionLocalProvider(
                            LocalContentColor provides colors.placeholderColor
                        ) {
                            ProvideTextStyle(textStyle) {
                                Box(Modifier.align(Alignment.CenterStart)) {
                                    placeholder()
                                }
                            }
                        }
                    }
                }
                CompositionLocalProvider(
                    LocalContentColor provides colors.trailingIconColor
                ) {
                    trailingIcon()
                }
            }
        }

        val isLtr = LocalLayoutDirection.current == LayoutDirection.Ltr

        if (cancelButton != null) {
            AnimatedVisibility(
                visible = focused && progressIsZero,
                enter = slideInHorizontally { if (isLtr) it else -it } + fadeIn(),
                exit = slideOutHorizontally { if (isLtr) it else -it } + fadeOut(),
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .onSizeChanged {
                        cancelButtonSize = it.width
                    }
            ) {
                if (focused) {
                    CompositionLocalProvider(LocalContentColor provides colors.cancelButtonColor) {
                        cancelButton()
                    }
                }
            }
        }
    }
}

@Stable
@Immutable
class CupertinoSearchTextFieldColors internal constructor(
    private val containerColor : Color,
    private val disabledContainerColor : Color,
    val placeholderColor : Color,
    private val textColor: Color,
    private val disabledTextColor: Color,
    val leadingIconColor : Color,
    val trailingIconColor : Color,
    val cancelButtonColor : Color
){
    @Composable
    fun containerColor(enabled: Boolean) : Color {
        return if (enabled) containerColor else disabledContainerColor
    }

    @Composable
    fun textColor(enabled: Boolean) : Color {
        return if (enabled)
            textColor
        else disabledTextColor
    }
}

object CupertinoSearchTextFieldDefaults {

    val PaddingValues = PaddingValues(
        horizontal = CupertinoSectionTokens.HorizontalPadding,
        vertical = CupertinoSectionTokens.VerticalPadding,
    )

    @Composable
    fun leadingIcon(
        imageVector: ImageVector = CupertinoIcons.Outlined.MagnifyingGlass,
        rotateWithLayoutDirection: Boolean = true,
    ): @Composable () -> Unit = {

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
    @Composable
    fun cancelButton(
        onValueChange: (String) -> Unit,
        colors: CupertinoButtonColors = CupertinoButtonDefaults.borderlessButtonColors(),
        content: @Composable RowScope.() -> Unit = { CupertinoText("Cancel") },
    ): @Composable () -> Unit = {

        val focusManager = LocalFocusManager.current

        CupertinoButton(
            modifier = Modifier.padding(start = 4.dp),
            colors = colors,
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
        containerColor: Color = if (isDark())
            CupertinoTheme.colorScheme.tertiarySystemFill
        else CupertinoTheme.colorScheme.quaternarySystemFill,
        disabledContainerColor: Color = containerColor,
        placeholderColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        textColor: Color = CupertinoTheme.colorScheme.label,
        disabledTextColor: Color = textColor,
        leadingIconColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        trailingIconColor: Color = CupertinoTheme.colorScheme.secondaryLabel,
        cancelButtonColor: Color = CupertinoTheme.colorScheme.accent
    ): CupertinoSearchTextFieldColors = CupertinoSearchTextFieldColors(
        containerColor = containerColor,
        placeholderColor = placeholderColor,
        textColor = textColor,
        disabledTextColor = disabledTextColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        disabledContainerColor = disabledContainerColor,
        cancelButtonColor = cancelButtonColor
    )

    val Shape: Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoSectionDefaults.shape(SectionStyle.InsetGrouped)
}

internal object CupertinoSearchTextFieldTokens {
    val MaxHeight = 36.dp

    val LeadingIconSize = 16.dp

    val HorizontalSpacing = 8 .dp
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
            collapsedBy <= maxHeightPx / 2


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