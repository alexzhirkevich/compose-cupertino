@file:Suppress("INVISIBLE_MEMBER","INVISIBLE_REFERENCE")
@file:OptIn(ExperimentalMaterial3Api::class)

package com.github.alexzhirkevich.lookandfeel.components.cupertino

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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.TopAppBarState
import androidx.compose.material3.toColor
import androidx.compose.material3.tokens.FilledTextFieldTokens
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSectionDefaults
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.ScrollOverflowState
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.topBarScrollEnabled
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.Magnifyingglass
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.SFSymbols
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.XmarkCircleFill
import com.github.alexzhirkevich.lookandfeel.theme.AppleColors
import com.github.alexzhirkevich.lookandfeel.util.LocalizedStrings
import com.github.alexzhirkevich.lookandfeel.util.isDark
import com.github.alexzhirkevich.lookandfeel.util.localized
import kotlin.math.abs

@ExperimentalMaterial3Api
@Composable
fun TextFieldDefaults.cupertinoTextFieldColors(
    textColor : Color =  FilledTextFieldTokens.InputColor.toColor(),
    disabledTextColor: Color = FilledTextFieldTokens.DisabledInputColor.toColor()
        .copy(alpha = FilledTextFieldTokens.DisabledInputOpacity),
    containerColor: Color = AppleColors.gray(isDark).copy(alpha = .25f),
) : TextFieldColors {
    return textFieldColors(
        textColor = textColor,
        disabledTextColor = disabledTextColor,
        containerColor = containerColor,
    )
}


@Composable
fun rememberCupertinoSearchTextFieldState(
    initiallyExpanded: Boolean = true,
    topAppBarScrollBehavior: TopAppBarScrollBehavior? = null,
    scrollableState: ScrollableState? = null,
    overflowState: ScrollOverflowState? = null
) : CupertinoSearchTextFieldState {
    val density = LocalDensity.current
    return remember {
        CupertinoSearchTextFieldStateImpl(
            initiallyExpanded = initiallyExpanded,
            topAppBarState = topAppBarScrollBehavior?.state,
            scrollableState = scrollableState,
            overflowState = overflowState
        ).apply {
            maxHeight = density.run { 38.dp.toPx() }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun CupertinoSearchTextField(
    value : String,
    onValueChange : (String) -> Unit,
    state : CupertinoSearchTextFieldState = rememberCupertinoSearchTextFieldState(),
    modifier: Modifier = Modifier,
    enabled : Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    keyboardOptions: KeyboardOptions = remember {
        KeyboardOptions(imeAction = ImeAction.Search)
    },
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    cursorBrush: Brush = SolidColor(Color.Black),
    placeholder : @Composable () -> Unit = {
        Text(LocalizedStrings.Search.localized())
    },
    cancelButtonTitle : (@Composable () -> Unit)? = {
        Text(
            LocalizedStrings.Cancel.localized(),
            color = MaterialTheme.colorScheme.primary
        )
    },
    leadingIcon : @Composable () -> Unit = {
        Icon(
            imageVector = SFSymbols.Magnifyingglass,
            contentDescription = null
        )
    },
    trailingIcon: @Composable () -> Unit = {
        if (value.isNotEmpty()) {
            Icon(
                imageVector = SFSymbols.XmarkCircleFill,
                contentDescription = LocalizedStrings.Cancel.localized(),
                modifier = Modifier
                    .clip(CircleShape)
                    .focusable(false)
                    .clickable {
                        onValueChange("")
                    },
                tint = AppleColors.gray(isDark)
            )
        }
    },
    colors : TextFieldColors = TextFieldDefaults.cupertinoTextFieldColors()
) {

    val focused by interactionSource.collectIsFocusedAsState()
    val focusRequester = remember { FocusRequester() }
    var cancelButtonSize by remember { mutableStateOf(0) }
    val cancelButtonSizeAnimated by animateIntAsState(
        cancelButtonSize,
        animationSpec =  spring(
            stiffness = Spring.StiffnessMediumLow,
        )
    )

    val density = LocalDensity.current
    val heightDp by remember {
        derivedStateOf {
            with(density){state.maxHeight.toDp() * (1f -state.progress) }
        }
    }

    Box(modifier
        .padding(
            start = CupertinoSectionDefaults.paddingValues
                .calculateStartPadding(LocalLayoutDirection.current),
            end = CupertinoSectionDefaults.paddingValues
                .calculateEndPadding(LocalLayoutDirection.current),
        )){
        val progressIsZero by remember {
            derivedStateOf {
                state.progress == 0f
            }
        }
        Box(
            modifier = Modifier
                .height(heightDp)
                .fillMaxWidth()
                .padding(end = LocalDensity.current.run {
                    cancelButtonSizeAnimated.toDp()
                })
                .clip(MaterialTheme.shapes.small)
                .focusRequester(focusRequester)
                .background(colors.containerColor().value)
                .padding(horizontal = 8.dp)
        ) {

            AnimatedVisibility(
                modifier = Modifier.align(Alignment.CenterStart),
                visible = progressIsZero,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    leadingIcon()
                    Box(
                        Modifier
                            .weight(1f)
                    ) {
                        BasicTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = value,
                            onValueChange = onValueChange,
                            enabled = enabled,
                            readOnly = readOnly,
                            textStyle = textStyle.copy(color = colors.textColor(enabled).value),
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
                            ProvideTextStyle(
                                textStyle.copy(color = colors.textColor(enabled).value),
                            ) {
                                Box(Modifier.align(Alignment.CenterStart)) {
                                    placeholder()
                                }
                            }
                        }
                    }
                    trailingIcon()
                }
            }
        }

        if (cancelButtonTitle != null) {
            AnimatedVisibility(
                visible = focused && progressIsZero,
                enter = slideInHorizontally { it } + fadeIn(),
                exit = slideOutHorizontally { it } + fadeOut(),
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .onSizeChanged {
                        cancelButtonSize = it.width
                    }
            ) {
                if (focused) {
                    CupertinoButton(
                        modifier = Modifier
                            .focusable(false)
                            .padding(start = 8.dp),
                        onClick = {
                            focusRequester.freeFocus()
                            onValueChange("")
                        }) {
                        cancelButtonTitle()
                    }
                }
            }
        }
    }
}

abstract class CupertinoSearchTextFieldState {

    /**
     * Nested scroll connection that should be applied to scrollable container or it's host.
     * */
    abstract val nestedScrollConnection : NestedScrollConnection

    /**
     * Progress of the text field collapse.
     * 0 if it is expanded and 1 if it is collapsed
     * */
    abstract val progress : Float

    abstract val maxHeight : Float
    internal abstract fun onScroll(available: Float): Float
    internal abstract suspend fun onRelease(): Velocity
}

private class CupertinoSearchTextFieldStateImpl(
    initiallyExpanded : Boolean,
    topAppBarState: TopAppBarState?,
    scrollableState: ScrollableState?,
    overflowState: ScrollOverflowState?
) : CupertinoSearchTextFieldState() {

    override val nestedScrollConnection: NestedScrollConnection =
        CupertinoSearchTextFieldNestedScroll(
            state = this,
            topAppBarState = topAppBarState,
            scrollableState = scrollableState,
            overflowState = overflowState
        )

    override var maxHeight by mutableStateOf(0f)

    private var collapsedBy by mutableStateOf(0f)

    override var progress by mutableStateOf(if (initiallyExpanded) 0f else 1f)

    override fun onScroll(available: Float): Float {
        val oldCollapsed = collapsedBy
        collapsedBy = (oldCollapsed - available).coerceIn(0f, maxHeight)
        progress = if (maxHeight == 0f) 0f else collapsedBy / maxHeight

        return oldCollapsed - collapsedBy
    }

    override suspend fun onRelease(): Velocity {

        val willBeExpanded = collapsedBy <= maxHeight / 2
        animate(progress, if (willBeExpanded) 0f else 1f) { v, _ ->
            progress = v
        }

        collapsedBy = if (willBeExpanded) 0f else maxHeight

        return Velocity.Zero
    }

}


private class CupertinoSearchTextFieldNestedScroll(
    private val state: CupertinoSearchTextFieldState,
    private val topAppBarState: TopAppBarState?,
    private val scrollableState: ScrollableState?,
    private val overflowState: ScrollOverflowState?
) : NestedScrollConnection {

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {

        // search should expand after top bar
        if (available.y > 0 && topAppBarState != null && abs(topAppBarState.collapsedFraction) > 0.001){
            return Offset.Zero
        }

        // search should collapse after overflow finished
        if (available.y < 0 && overflowState?.topBarScrollEnabled == false){
            return Offset.Zero
        }

        // search should collapse after scrollable container reached top
        if (available.y < 0 && scrollableState?.canScrollBackward == true){
            return Offset.Zero
        }
        return Offset(0f, state.onScroll(available.y))
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        return state.onRelease()
    }
}