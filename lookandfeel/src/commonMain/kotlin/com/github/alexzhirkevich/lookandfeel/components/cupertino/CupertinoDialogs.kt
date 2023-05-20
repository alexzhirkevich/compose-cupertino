package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.Dialog
import com.github.alexzhirkevich.lookandfeel.components.DialogSheet
import com.github.alexzhirkevich.lookandfeel.components.SectionTokens
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoDialogsTokens.AlertDialogTitleMessageSpacing
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.AppleColors
import com.github.alexzhirkevich.lookandfeel.util.isDark
import com.github.alexzhirkevich.lookandfeel.util.navigationBarsPadding

enum class AlertActionStyle {

    Default {
        override fun apply(style: TextStyle, dark: Boolean): TextStyle {
            return style.copy(
                fontWeight = FontWeight.Normal,
                color = AppleColors.blue(dark),
                textAlign = TextAlign.Center
            )
        }
    },
    Cancel {
        override fun apply(style: TextStyle, dark: Boolean): TextStyle {
            return style.copy(
                fontWeight = FontWeight.Bold,
                color = AppleColors.blue(dark),
                textAlign = TextAlign.Center
            )
        }
    },
    Destructive {
        override fun apply(style: TextStyle, dark: Boolean): TextStyle {
            return style.copy(
                fontWeight = FontWeight.Normal,
                color = AppleColors.red(dark),
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

interface CupertinoNativeAlertDialogButtonsScope {

    fun button(
        onClick : () -> Unit,
        style : AlertActionStyle = AlertActionStyle.Default,
        enabled : Boolean = true,
        title : String
    )
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CupertinoAlertDialog(
    onDismissRequest : () -> Unit,
    title : @Composable () -> Unit,
    message : @Composable () -> Unit,
    containerColor : Color = AdaptiveTheme.colorScheme.surfaceVariant,
    buttonsOrientation: Orientation = Orientation.Horizontal,
    buttons : CupertinoAlertDialogButtonsScope.() -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        enterTransition = scaleIn(initialScale = 1.1f) + fadeIn(),
        exitTransition = fadeOut(animationSpec = tween(100))
    ) {
        Card(
            Modifier.align(Alignment.Center),
            colors = CardDefaults.cardColors(
                containerColor = containerColor
            )
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
                        AdaptiveTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Center
                        )
                    ) {
                        title()
                    }
                    ProvideTextStyle(
                        AdaptiveTheme.typography.bodySmall.copy(
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Center
                        )
                    ) {
                        message()
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


/**
 * Compose sheet dialog with iOS ActionSheet style.
 *
 * If you want to display it as truly native on iOS use [CupertinoActionSheetNative]
 */
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CupertinoActionSheet(
    onDismissRequest : () -> Unit,
    title : (@Composable () -> Unit) ?= null,
    message : (@Composable () -> Unit) ?= null,
    containerColor : Color = AdaptiveTheme.colorScheme.surface,
    secondaryContainerColor : Color = AdaptiveTheme.colorScheme.surfaceVariant,
    separateLastButton : Boolean = false,
    buttons : CupertinoAlertDialogButtonsScope.() -> Unit
) {
    DialogSheet(
        onDismissRequest = onDismissRequest
    ) {
        val hasTitle = title != null || message != null
        val scope = remember(
            hasTitle,
            containerColor,
            secondaryContainerColor,
            separateLastButton,
            buttons
        ) {
            CupertinoActionSheetImpl(
                hasTitle = hasTitle,
                primaryContainerColor = containerColor,
                secondaryContainerColor = secondaryContainerColor,
                separateLastButton = separateLastButton,
            ).apply(buttons)
        }

        scope.run {
            Content {
                if (hasTitle) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(CupertinoDialogsTokens.AlertDialogPadding)
                            .padding(bottom = CupertinoDialogsTokens.ActionSheetTitleMessageSpacing),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement
                            .spacedBy(CupertinoDialogsTokens.ActionSheetTitleMessageSpacing)
                    ) {
                        if (title != null) {
                            ProvideTextStyle(
                                AdaptiveTheme.typography.labelLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Normal,
                                    textAlign = TextAlign.Center,
                                    color = contentColorFor(containerColor).copy(
                                        alpha = .5f
                                    )
                                )
                            ) {
                                title.invoke()
                            }
                        }
                        if (message != null) {
                            ProvideTextStyle(
                                AdaptiveTheme.typography.labelLarge.copy(
                                    fontWeight = FontWeight.Normal,
                                    fontStyle = FontStyle.Normal,
                                    textAlign = TextAlign.Center,
                                    color = contentColorFor(containerColor).copy(
                                        alpha = .5f
                                    )
                                )
                            ) {
                                message.invoke()
                            }
                        }
                    }
                }
            }
        }
    }
}

/**
 * Native iOS action sheet.
 *
 * On iOS this dialog will be displayed using UIAlertController on top of other dialogs.
 * On other platforms [CupertinoActionSheet] will be used instead
 *
 * @param onDismissRequest called when action sheet is already dismissed. Must not be ignored.
 * @param title title of the action sheet
 * @param message message of the action sheet
 * @param buttons action sheet buttons builder scope
 * */
@Composable
expect fun CupertinoActionSheetNative(
    onDismissRequest : () -> Unit,
    title : String ?= null,
    message : String ?= null,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
)





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
                        style.apply(AdaptiveTheme.typography.bodyLarge, isDark)
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
            CupertinoDivider()
            if (orientation == Orientation.Horizontal) {
                Row(
                    modifier = Modifier
                        .height(CupertinoDialogsTokens.AlertDialogButtonHeight)
                ) {
                    buttons.forEachIndexed { i, btn ->
                        Box(Modifier.weight(1f)) {
                            btn()
                        }
                        if (i != buttons.lastIndex) {
                            CupertinoVerticalDivider()
                        }
                    }
                }
            } else {
                buttons.forEachIndexed { i, btn ->
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(CupertinoDialogsTokens.AlertDialogButtonHeight)
                    ) {
                        btn()
                    }
                    if (i != buttons.lastIndex) {
                        CupertinoDivider()
                    }
                }
            }
        }
    }
}
private class CupertinoActionSheetImpl(
    private val hasTitle : Boolean,
    private val separateLastButton: Boolean,
    private val primaryContainerColor : Color,
    private val secondaryContainerColor: Color,
) : CupertinoAlertDialogButtonsScope {

    private val buttons = mutableListOf<@Composable () -> Unit>()

    override fun button(
        onClick: () -> Unit,
        style : AlertActionStyle,
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
                    .fillMaxWidth()
                    .heightIn(min = CupertinoDialogsTokens.ActionSheetButtonHeight),
                contentAlignment = Alignment.Center,
                content = {
                    ProvideTextStyle(
                        style.apply(AdaptiveTheme.typography.titleSmall, isDark)
                    ) {
                        title()
                    }
                }
            )
        }
    }

    @Composable
    fun Content(title : (@Composable ColumnScope.() -> Unit)?=null) {
        Column(
            modifier = Modifier
                .navigationBarsPadding()
        ) {
            Card(
                modifier = Modifier
                    .padding(CupertinoDialogsTokens.ActionSheetPadding),
                colors = CardDefaults.cardColors(contentColor = primaryContainerColor)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                ) {

                    title?.invoke(this)

                    buttons
                        .let { if (separateLastButton) it.dropLast(1) else it }
                        .forEachIndexed { i, btn ->

                            if (i > 0 || hasTitle)
                                CupertinoDivider()

                            btn()
                        }
                }
            }

            if (separateLastButton) {
                Card(
                    modifier = Modifier
                        .padding(CupertinoDialogsTokens.ActionSheetPadding),
                    colors = CardDefaults.cardColors(contentColor = secondaryContainerColor)
                ) {
                    buttons.last().invoke()
                }
            }
        }
    }
}

internal class CupertinoAlertDialogButtonNative(
    val onClick: () -> Unit,
    val style: AlertActionStyle,
    val enabled : Boolean,
    val title: String
)

internal fun CupertinoAlertDialogButtonsScope.fromNative(
    native : CupertinoNativeAlertDialogButtonsScope.() -> Unit
) {

    val buttons = mutableListOf<CupertinoAlertDialogButtonNative>()

    object : CupertinoNativeAlertDialogButtonsScope {
        override fun button(
            onClick: () -> Unit,
            style: AlertActionStyle,
            enabled : Boolean,
            title: String
        ) {
            buttons.add(
                CupertinoAlertDialogButtonNative(
                    onClick = onClick,
                    style = style,
                    title = title,
                    enabled = enabled
                )
            )
        }
    }.apply(native)

    buttons.forEach {
        button(
            onClick = it.onClick,
            style = it.style,
            enabled = true
        ) {
            Text(it.title)
        }
    }
}



internal object CupertinoDialogsTokens{
    val AlertDialogPadding = SectionTokens.HorizontalPadding
    val AlertDialogWidth : Dp = 270.dp
    val AlertDialogMinHeight : Dp = 140.dp
    val AlertDialogTitleMessageSpacing : Dp = 4.dp
    val AlertDialogButtonHeight : Dp = SectionTokens.MinHeight

    val ActionSheetPadding = 6.dp
    val ActionSheetButtonHeight : Dp = 56.dp
    val ActionSheetTitleMessageSpacing : Dp = 4.dp
}