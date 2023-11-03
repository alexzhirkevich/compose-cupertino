package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoDialogsTokens.AlertDialogTitleMessageSpacing
import io.github.alexzhirkevich.cupertino.section.SectionTokens
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.isDark
import io.github.alexzhirkevich.cupertino.theme.systemBlue
import io.github.alexzhirkevich.cupertino.theme.systemGray7
import io.github.alexzhirkevich.cupertino.theme.systemRed

/**
 * Style of the Cupertino alert action buttons
 * */
enum class AlertActionStyle {

    /**
     * Default action button
     * */
    Default {
        override fun apply(style: TextStyle, dark: Boolean): TextStyle {
            return style.copy(
                fontWeight = FontWeight.Normal,
                color = CupertinoColors.systemBlue(dark),
                textAlign = TextAlign.Center
            )
        }
    },

    /**
     * Cancel action button. It will be displayed below the other buttons
     * with different container color and bolder font
     * */
    Cancel {
        override fun apply(style: TextStyle, dark: Boolean): TextStyle {
            return style.copy(
                fontWeight = FontWeight.Bold,
                color = CupertinoColors.systemBlue(dark),
                textAlign = TextAlign.Center
            )
        }
    },

    /**
     * Destructive action button. It will be red
     * */
    Destructive {
        override fun apply(style: TextStyle, dark: Boolean): TextStyle {
            return style.copy(
                fontWeight = FontWeight.Normal,
                color = CupertinoColors.systemRed(dark),
                textAlign = TextAlign.Center
            )
        }
    };


    internal abstract fun apply(style: TextStyle, dark: Boolean): TextStyle
}


interface CupertinoAlertDialogButtonsScope {

    fun button(
        onClick : () -> Unit,
        style : AlertActionStyle = AlertActionStyle.Default,
        enabled : Boolean = true,
        title : @Composable () -> Unit
    )
}

/**
 * Native analog for the compose [CupertinoAlertDialog].
 *
 * @param onDismissRequest called when dialog is already dismissed. Must not be ignored
 * @param title alert dialog title
 * @param message alert dialog message
 * @param containerColor color of the dialog background
 * @param properties dialog properties
 * @param buttonsOrientation layout orientation of the dialog buttons
 * @param buttons actions builder block
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoAlertDialog(
    onDismissRequest: () -> Unit,
    title: @Composable () -> Unit,
    message: (@Composable () -> Unit)? = null,
    containerColor: Color = CupertinoColors.systemGray7,
    properties: DialogProperties = DialogProperties(),
    buttonsOrientation: Orientation = Orientation.Horizontal,
    buttons: CupertinoAlertDialogButtonsScope.() -> Unit
) {
    AnimatedDialog(
        properties = properties,
        onDismissRequest = onDismissRequest,
        enterTransition = scaleIn(initialScale = 1.2f) + fadeIn(),
//        exitTransition = fadeOut(animationSpec = tween(100))
    ) {
        Surface(
            Modifier
                .align(Alignment.Center)
                .shadow(
                    elevation = CupertinoDialogsTokens.AlertDialogElevation,
                    shape = CupertinoDialogsTokens.Shape
                ),
            color = containerColor,
        ) {
            Column(
                modifier = Modifier
                    .width(CupertinoDialogsTokens.AlertDialogWidth)
                    .heightIn(min = CupertinoDialogsTokens.AlertDialogMinHeight)
            ) {
                Column(
                    Modifier
                        .padding(CupertinoDialogsTokens.AlertDialogPadding)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(AlertDialogTitleMessageSpacing),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ProvideTextStyle(
                        CupertinoTheme.typography.headline.copy(
                            textAlign = TextAlign.Center
                        ),
                        content = title
                    )
                    message?.let {
                        ProvideTextStyle(
                            CupertinoTheme.typography.footnote.copy(
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Light
                            ),
                            content = it
                        )
                    }
                }

                val scope = remember(buttons, buttonsOrientation) {
                    CupertinoAlertDialogButtonsScopeImpl(buttonsOrientation).apply(buttons)
                }

                scope.Content()
            }
        }
    }
}

@Composable
@ExperimentalCupertinoApi
fun CupertinoPickerSheet(
    onDismissRequest : () -> Unit,
    title : (@Composable () -> Unit)? = null,
    message : (@Composable () -> Unit)? = null,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    secondaryContainerColor : Color = CupertinoTheme.colorScheme.tertiarySystemBackground,
    properties: DialogProperties = DialogProperties(),
    buttons : CupertinoAlertDialogButtonsScope.() -> Unit = {},
    picker : @Composable () -> Unit,
) = CupertinoSheet(
    onDismissRequest = onDismissRequest,
    title = title,
    message = message,
    containerColor = containerColor,
    secondaryContainerColor = secondaryContainerColor,
    properties = properties,
    content = picker,
    buttons = buttons
)


/**
 * Compose alert dialog with iOS action sheet style.
 *
 * @param onDismissRequest called when dialog is already dismissed. Must not be ignored
 * @param title alert dialog title
 * @param message alert dialog message
 * @param containerColor not used in native dialog
 * @param secondaryContainerColor not used in native dialog
 * @param properties dialog properties
 * @param buttons actions builder block
 *
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoActionSheet(
    onDismissRequest : () -> Unit,
    title : (@Composable () -> Unit)? = null,
    message : (@Composable () -> Unit)? = null,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    secondaryContainerColor : Color = CupertinoTheme.colorScheme.tertiarySystemBackground,
    properties: DialogProperties = DialogProperties(),
    buttons : CupertinoAlertDialogButtonsScope.() -> Unit
) = CupertinoSheet(
    onDismissRequest = onDismissRequest,
    title = title,
    message = message,
    containerColor = containerColor,
    secondaryContainerColor = secondaryContainerColor,
    properties = properties,
    content = null,
    buttons = buttons
)


@Composable
internal fun CupertinoSheet(
    onDismissRequest : () -> Unit,
    title : (@Composable () -> Unit)? = null,
    message : (@Composable () -> Unit)? = null,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    secondaryContainerColor : Color = CupertinoTheme.colorScheme.tertiarySystemBackground,
    properties: DialogProperties = DialogProperties(),
    content  : (@Composable () -> Unit) ?= null,
    buttons : CupertinoAlertDialogButtonsScope.() -> Unit
) {
    DialogSheet(
        onDismissRequest = onDismissRequest,
        dialogProperties = properties
    ) {
        val hasTitle = title != null || message != null
        val scope = remember(
            hasTitle,
            containerColor,
            secondaryContainerColor,
            buttons
        ) {
            CupertinoActionSheetImpl(
                hasTitle = hasTitle,
                primaryContainerColor = containerColor,
                secondaryContainerColor = secondaryContainerColor,
            ).apply(buttons)
        }

        scope.run {
            Content {
                Column {
                    if (hasTitle) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(CupertinoDialogsTokens.AlertDialogPadding),
//                            .padding(bottom = CupertinoDialogsTokens.ActionSheetTitleMessageSpacing),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement
                                .spacedBy(CupertinoDialogsTokens.ActionSheetTitleMessageSpacing)
                        ) {
                            CompositionLocalProvider(LocalContentColor provides CupertinoTheme.colorScheme.tertiaryLabel) {
                                if (title != null) {
                                    ProvideTextStyle(
                                        CupertinoTheme.typography.footnote.copy(
                                            fontWeight = FontWeight.SemiBold,
                                            textAlign = TextAlign.Center,
                                        )
                                    ) {
                                        title()
                                    }
                                }
                                if (message != null) {
                                    ProvideTextStyle(
                                        CupertinoTheme.typography.caption1.copy(
                                            textAlign = TextAlign.Center,
                                        )
                                    ) {
                                        message()
                                    }
                                }
                            }
                        }
                    }
                    if (content != null) {
                        if (hasTitle)
                            Separator()
                        content()
                    }
                }
            }
        }
    }
}


@Composable
@ReadOnlyComposable
internal expect fun FullscreenPopupProperties(
    dismissOnBackPress: Boolean = true,
    dismissOnClickOutside: Boolean = false,
    usePlatformDefaultWidth: Boolean = true,
) : PopupProperties


@Composable
private fun AnimatedDialog(
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    enterTransition: EnterTransition,
    scrimColor : Color = Color.Black.copy(alpha = if (isDark()) .4f else .2f),
    content: @Composable BoxScope.() -> Unit
) {
    Popup(
        onDismissRequest = onDismissRequest,
        properties = FullscreenPopupProperties(
            dismissOnBackPress = properties.dismissOnBackPress,
            dismissOnClickOutside = properties.dismissOnClickOutside,
            usePlatformDefaultWidth = false,
        )
    ) {
        var visible by remember {
            mutableStateOf(false)
        }
        LaunchedEffect(0) {
            visible = true
        }

        val animatedScrimColor by animateColorAsState(
            if (visible) scrimColor else scrimColor.copy(alpha = 0f),
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawWithContent {
                    drawRect(animatedScrimColor)
                    drawContent()
                }
                .let {
                    if (properties.dismissOnClickOutside)
                        it.pointerInput(0) {
                            detectTapGestures {
                                onDismissRequest()
                            }
                        } else it
                }
        ) {
            AnimatedVisibility(
                visible = visible,
                enter = enterTransition
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    content = content
                )
            }

        }
    }
}

@Composable
private fun DialogSheet(
    onDismissRequest: () -> Unit,
    dialogProperties: DialogProperties,
    content: @Composable () -> Unit
) {
    AnimatedDialog(
        onDismissRequest = onDismissRequest,
        properties = dialogProperties,
        enterTransition = slideInVertically { it },
        content = {
            Box(
                Modifier
                    .widthIn(max = CupertinoDialogsTokens.ActionSheetMaxWidth)
                    .align(Alignment.BottomCenter)
            ) {
                content()
            }
        }
    )
}

private class CupertinoAlertDialogButtonsScopeImpl(
    private val orientation: Orientation,
) : CupertinoAlertDialogButtonsScope {

    private val buttons = mutableListOf<@Composable () -> Unit>()

    override fun button(
        onClick: () -> Unit,
        style: AlertActionStyle,
        enabled: Boolean,
        title: @Composable () -> Unit
    ) {
        buttons.add {
            Box(
                Modifier
                    .clickable(
                        enabled = enabled,
                        onClick = onClick,
                        role = Role.Button,
                    )
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
                content = {
                    ProvideTextStyle(
                        style.apply(CupertinoTheme.typography.body, isDark()).copy(
                            fontWeight = FontWeight.Light
                        )
                    ) {
                        title()
                    }
                }
            )
        }
    }

    @Composable
    fun Content() {
        Column {
            Separator(color = CupertinoTheme.colorScheme.opaqueSeparator)
            if (orientation == Orientation.Horizontal) {
                Row(
                    modifier = Modifier
                        .height(CupertinoDialogsTokens.AlertDialogButtonHeight)
                ) {
                    buttons.fastForEachIndexed { i, btn ->
                        Box(Modifier.weight(1f)) {
                            btn()
                        }
                        if (i != buttons.lastIndex) {
                            VerticalSeparator(color = CupertinoTheme.colorScheme.opaqueSeparator)
                        }
                    }
                }
            } else {
                buttons.fastForEachIndexed { i, btn ->
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(CupertinoDialogsTokens.AlertDialogButtonHeight)
                    ) {
                        btn()
                    }
                    if (i != buttons.lastIndex) {
                        Separator(color = CupertinoTheme.colorScheme.opaqueSeparator)
                    }
                }
            }
        }
    }
}

private class CupertinoActionSheetImpl(
    private val hasTitle : Boolean,
    private val primaryContainerColor : Color,
    private val secondaryContainerColor: Color,
) : CupertinoAlertDialogButtonsScope {

    private val buttons = mutableListOf<Pair<AlertActionStyle, @Composable () -> Unit>>()

    override fun button(
        onClick: () -> Unit,
        style: AlertActionStyle,
        enabled: Boolean,
        title: @Composable () -> Unit
    ) {
        buttons.add(style to {
            Box(
                Modifier
                    .clickable(
                        enabled = enabled,
                        onClick = onClick,
                        role = Role.Button,
                    )
                    .fillMaxWidth()
                    .heightIn(min = CupertinoDialogsTokens.ActionSheetButtonHeight),
                contentAlignment = Alignment.Center,
                content = {
                    ProvideTextStyle(
                        style.apply(CupertinoTheme.typography.body, isDark()).copy(
                            fontWeight = if (style == AlertActionStyle.Cancel)
                                FontWeight.SemiBold else FontWeight.Light
                        )
                    ) {
                        title()
                    }
                }
            )
        })
    }

    @Composable
    fun Content(title: (@Composable ColumnScope.() -> Unit)? = null) {
        Column(
            modifier = Modifier
                .windowInsetsPadding(WindowInsets.navigationBars),
        ) {
            Surface(
                modifier = Modifier
                    .padding(CupertinoDialogsTokens.ActionSheetPadding),
                color = primaryContainerColor,
                shape = CupertinoDialogsTokens.Shape
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    title?.invoke(this)

                    buttons
                        .filter { it.first != AlertActionStyle.Cancel }
                        .fastForEachIndexed { i, btn ->
                            if (i > 0 || hasTitle)
                                Separator(color = CupertinoTheme.colorScheme.opaqueSeparator)
                            btn.second()
                        }
                }
            }

            buttons
                .filter { it.first == AlertActionStyle.Cancel }
                .fastForEach {
                    Surface(
                        modifier = Modifier
                            .padding(
                                start = CupertinoDialogsTokens.ActionSheetPadding,
                                end = CupertinoDialogsTokens.ActionSheetPadding,
                                bottom = CupertinoDialogsTokens.ActionSheetPadding,
                            ),
                        color = secondaryContainerColor,
                        shape = CupertinoDialogsTokens.Shape
                    ) {
                        it.second()
                    }
                }
        }
    }
}



internal object CupertinoDialogsTokens{
    val Shape : Shape
        @Composable
        get() = CupertinoTheme.shapes.medium

    val AlertDialogElevation: Dp = 1.dp
    val AlertDialogPadding = SectionTokens.HorizontalPadding
    val AlertDialogWidth : Dp = 270.dp
    val AlertDialogMinHeight : Dp = 110.dp
    val AlertDialogTitleMessageSpacing : Dp = 4.dp
    val AlertDialogButtonHeight : Dp = SectionTokens.MinHeight

    val ActionSheetMaxWidth: Dp = 500.dp
    val ActionSheetPadding = 6.dp
    val ActionSheetButtonHeight : Dp = 56.dp
    val ActionSheetTitleMessageSpacing : Dp = 8.dp
}