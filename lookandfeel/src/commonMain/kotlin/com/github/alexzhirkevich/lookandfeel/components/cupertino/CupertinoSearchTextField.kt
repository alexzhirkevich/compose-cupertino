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
import androidx.compose.foundation.MutatePriority
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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSectionDefaults
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.CupertinoScrollOverflowState
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
    topAppBarScrollBehavior: TopAppBarScrollBehavior? = null,
    scrollableState: ScrollableState? = null,
    overflowState: CupertinoScrollOverflowState? = null
) : CupertinoSearchTextFieldState {
    val density = LocalDensity.current
    return remember {
        CupertinoSearchTextFieldState(
            topAppBarState = topAppBarScrollBehavior?.state,
            scrollableState = scrollableState,
            overflowState = overflowState
        ).apply {
            height= density.run {38.dp.toPx()}
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
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = true,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
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
//            tint = AppleColors.gray(isDark),
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
            with(density){state.height.toDp() * (1f -state.progress) }
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
//                .padding(
//                    top = CupertinoSectionDefaults.paddingValues.calculateTopPadding(),
//                    bottom = CupertinoSectionDefaults.paddingValues.calculateTopPadding(),
//                )
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
                            singleLine = singleLine,
                            maxLines = maxLines,
                            minLines = minLines,
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

class CupertinoSearchTextFieldState(
    topAppBarState: TopAppBarState?,
    scrollableState: ScrollableState?,
    overflowState: CupertinoScrollOverflowState?
) {

    val nestedScrollConnection : NestedScrollConnection =
        CupertinoSearchTextFieldNestedScroll(
            state = this,
            topAppBarState = topAppBarState,
            scrollableState = scrollableState,
            overflowState = overflowState
        )

    var expanded by mutableStateOf(false)
        private set

    internal var height by mutableStateOf(0f)

    private var collapsedBy  by mutableStateOf(0f)

    internal var progress by mutableStateOf(0f)

    fun onPreScroll(available: Float): Float {
        val oldCollapsed = collapsedBy
        collapsedBy = (oldCollapsed - available).coerceIn(0f, height)
        progress =  if (height == 0f) 0f else collapsedBy / height
        return oldCollapsed - collapsedBy
    }

    suspend fun onRelease(): Velocity{
        expanded = collapsedBy <= height/2
        collapsedBy = if (expanded) 0f else height
        animate(progress, if (expanded) 0f else 1f) { v, _ ->
            progress = v
        }
        return Velocity.Zero
    }
}


private class CupertinoSearchTextFieldNestedScroll(
    private val state: CupertinoSearchTextFieldState,
    private val topAppBarState: TopAppBarState?,
    private val scrollableState: ScrollableState?,
    private val overflowState: CupertinoScrollOverflowState?
) : NestedScrollConnection {

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {

        // search should expand after top bar
        if (available.y > 0 && abs(topAppBarState?.collapsedFraction ?: 1f) > 0.001){
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
        return Offset(0f, state.onPreScroll(available.y))
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        return state.onRelease()
    }
}