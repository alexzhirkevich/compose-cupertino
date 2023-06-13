@file:Suppress("INVISIBLE_MEMBER","INVISIBLE_REFERENCE")
@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)

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
import androidx.compose.foundation.MutatorMutex
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.CupertinoMinHeight
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSectionDefaults
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.ScrollOverflowState
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.topBarScrollEnabled
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.Magnifyingglass
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.SFSymbols
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.XmarkCircleFill
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.AppleColors
import com.github.alexzhirkevich.lookandfeel.util.LocalizedStrings
import com.github.alexzhirkevich.lookandfeel.util.isDark
import com.github.alexzhirkevich.lookandfeel.util.localized
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
@Composable
fun TextFieldDefaults.cupertinoSearchTextFieldColors(
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

/**
 * State of the [CupertinoSearchTextField]
 *
 * @param initiallyExpanded is search field is expanded after composition
 * @param topAppBarScrollBehavior state of the [CupertinoLargeTopAppBar] or adaptive one.
 * Helps adjust native behavior
 * @param scrollableState state of the list we want search in
 * @param overflowState state of the [scrollableState] overflow
 * @param collapseSelf controls if search field should be collapsed on scroll.
 * Native behavior (default) prevents collapsing when search is focused
 * @param collapseTopBarOnFocus top bar with collapsing [topAppBarScrollBehavior] will be collapsed
 * when search state is focused and expanded when focus is lost (native behavior)
 * @param blockScrollWhenSearchIsFocusedAndEmpty when search field is focused and search is empty
 * [scrollableState] will be blocked (native behavior)
 * */
@Composable
fun rememberCupertinoSearchTextFieldState(
    initiallyExpanded: Boolean = true,
    topAppBarScrollBehavior: TopAppBarScrollBehavior? = null,
    scrollableState: ScrollableState? = null,
    overflowState: ScrollOverflowState? = null,
    collapseSelf : (CupertinoSearchTextFieldState) -> Boolean = { !it.isFocused },
    collapseTopBarOnFocus : Boolean = true,
    blockScrollWhenSearchIsFocusedAndEmpty : Boolean = true,
) : CupertinoSearchTextFieldState {
    val density = LocalDensity.current
    return remember {
        CupertinoSearchTextFieldStateImpl(
            initiallyExpanded = initiallyExpanded,
            collapse = collapseSelf,
            blockScrollWhenSearchIsFocusedAndEmpty = blockScrollWhenSearchIsFocusedAndEmpty,
            collapseTopBarOnFocus = collapseTopBarOnFocus,
            topAppBarScrollBehavior = topAppBarScrollBehavior,
            scrollableState = scrollableState,
            overflowState = overflowState
        ).apply {
            maxHeight = density.run { TextFieldDefaults.CupertinoMinHeight.toPx() }
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
    textStyle: TextStyle = AdaptiveTheme.typography.bodyLarge,
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
    colors : TextFieldColors = TextFieldDefaults.cupertinoSearchTextFieldColors()
) {
    val focused by interactionSource.collectIsFocusedAsState()
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
            with(density){state.maxHeight.toDp() * (1f -state.progress) }
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

    Box(modifier
        .height(heightDp)
        .padding(
            top = 4.dp,
            bottom = 4.dp,
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
                .fillMaxWidth()
                .padding(end = LocalDensity.current.run {
                    cancelButtonSizeAnimated.toDp()
                })
                .clip(MaterialTheme.shapes.small)
                .background(colors.containerColor().value)
                .padding(horizontal = 8.dp)
        ) {


            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .graphicsLayer {
                        alpha = (1f - state.progress * 4).coerceIn(0f, 1f)
                    }
                    .fillMaxSize()
            ) {
                leadingIcon()
                Box(
                    Modifier
                        .weight(1f)
                ) {
                    val scope = rememberCoroutineScope()

                    LaunchedEffect(state.isFocused, value){
                        state.canScroll = !state.isFocused || value.isNotEmpty()
                    }

                    BasicTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .onFocusChanged {
                                scope.launch {
                                    state.setFocused(it.isFocused || it.hasFocus)
                                }
                            }
                            .focusable(),
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
                    CupertinoTextButton(
                        modifier = Modifier
                            .padding(start = 8.dp),
                        onClick = {
                            focusManager.clearFocus(true)
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
     * 0 if expanded and 1 if collapsed
     * */
    abstract val progress : Float

    abstract val maxHeight : Float

    abstract var canScroll : Boolean

    abstract val isFocused : Boolean

    internal abstract suspend fun setFocused(focused: Boolean)

    internal abstract fun onScroll(available: Float): Float
    internal abstract suspend fun onRelease(): Velocity
}

private class CupertinoSearchTextFieldStateImpl(
    initiallyExpanded : Boolean,
    private val collapse: (CupertinoSearchTextFieldState) -> Boolean,
    private val collapseTopBarOnFocus: Boolean,
    private val blockScrollWhenSearchIsFocusedAndEmpty : Boolean,
    private val topAppBarScrollBehavior: TopAppBarScrollBehavior?,
    private val scrollableState: ScrollableState?,
    overflowState: ScrollOverflowState?
) : CupertinoSearchTextFieldState() {

    override val nestedScrollConnection: NestedScrollConnection =
        CupertinoSearchTextFieldNestedScroll(
            state = this,
            topAppBarState = topAppBarScrollBehavior?.state,
            scrollableState = scrollableState,
            overflowState = overflowState,
            blockScrollWhenSearchIsFocusedAndEmpty = blockScrollWhenSearchIsFocusedAndEmpty
        )

    override var canScroll: Boolean = true

    override var isFocused: Boolean by mutableStateOf(false)

    override var maxHeight by mutableStateOf(0f)

    private var collapsedBy by mutableStateOf(0f)

    override var progress by mutableStateOf(if (initiallyExpanded) 0f else 1f)

    private val mutatorModifier = MutatorMutex()

    override suspend fun setFocused(focused: Boolean) {
        this.isFocused = focused
        if (topAppBarScrollBehavior == null) {

            return
        }
        val tbs = topAppBarScrollBehavior.state

        if (collapseTopBarOnFocus) {
            mutatorModifier.mutate {
                animate(
                    initialValue = tbs.heightOffset,
                    targetValue = if (focused) tbs.heightOffsetLimit else 0f,
                    animationSpec = topAppBarScrollBehavior.snapAnimationSpec ?: spring()
                ) { it, _ ->
                    tbs.heightOffset = it
                }
            }
        }
    }

    override fun onScroll(available: Float): Float {

        val oldCollapsed = collapsedBy

        val newCollapsedBy = (oldCollapsed - available).coerceIn(0f, maxHeight)

        if (collapse(this) || newCollapsedBy < oldCollapsed) {
            collapsedBy = newCollapsedBy
            progress = if (maxHeight == 0f) 0f else collapsedBy / maxHeight

            return oldCollapsed - collapsedBy
        }
        return 0f
    }


    override suspend fun onRelease(): Velocity {

        // text field can't be collapsed if scrollable state can't be scrolled
        val willBeExpanded = scrollableState
            ?.let { !it.canScrollForward && !it.canScrollBackward } == true ||
            collapsedBy <= maxHeight / 2


        animate(progress, if (willBeExpanded) 0f else 1f) { v, _ ->
            progress = v
        }

        collapsedBy = if (willBeExpanded) 0f else maxHeight

        return Velocity.Zero
    }

}


private class CupertinoSearchTextFieldNestedScroll(
    private val state: CupertinoSearchTextFieldState,
    private val blockScrollWhenSearchIsFocusedAndEmpty : Boolean,
    private val topAppBarState: TopAppBarState?,
    private val scrollableState: ScrollableState?,
    private val overflowState: ScrollOverflowState?
) : NestedScrollConnection {

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {

        //  consume all scroll when scroll is blocked
        if (blockScrollWhenSearchIsFocusedAndEmpty && !state.canScroll){
            return available
        }

        val canExpand = topAppBarState != null && topAppBarState.collapsedFraction < 0.05
        // search should expand after top bar
        if (available.y > 0 && !canExpand){
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

    override fun onPostScroll(
        consumed: Offset,
        available: Offset,
        source: NestedScrollSource
    ): Offset {
        return super.onPostScroll(consumed, available, source) +
                onPreScroll(available, source)
    }
    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        return state.onRelease()
    }
}