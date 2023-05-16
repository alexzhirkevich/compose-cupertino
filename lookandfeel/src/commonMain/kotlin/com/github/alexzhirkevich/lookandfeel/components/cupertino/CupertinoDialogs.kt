package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.Dialog
import com.github.alexzhirkevich.lookandfeel.components.SectionTokens
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoDialogsTokens.TitleBodySpacing
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.AppleColors
import com.github.alexzhirkevich.lookandfeel.util.isDark

interface CupertinoAlertDialogButtonsScope {

    fun button(
        onClick : () -> Unit,
        enabled : Boolean = true,
        title : @Composable () -> Unit
    )
}


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CupertinoAlertDialog(
    visible : Boolean,
    onDismissRequest : () -> Unit,
    title : @Composable () -> Unit,
    text : @Composable () -> Unit,
    buttons : CupertinoAlertDialogButtonsScope.() -> Unit
) {
    Dialog(
        visible = visible,
        onDismissRequest = onDismissRequest,
        enterTransition = scaleIn(initialScale = 1.1f) + fadeIn(),
        exitTransition = fadeOut(animationSpec = tween(100))
    ) {
        Card(
            Modifier.align(Alignment.Center)
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
                    verticalArrangement = Arrangement.spacedBy(TitleBodySpacing),
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
                        text()
                    }
                }

                val scope = remember(buttons) {
                    CupertinoAlertDialogButtonsScopeImpl().apply(buttons)
                }

                scope.Content()
            }
        }
    }
}

private class CupertinoAlertDialogButtonsScopeImpl : CupertinoAlertDialogButtonsScope {

    private val buttons = mutableListOf<@Composable RowScope.() -> Unit>()

    override fun button(
        onClick: () -> Unit,
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
                    .fillMaxHeight()
                    .weight(1f),
                contentAlignment = Alignment.Center,
                content = {
                    ProvideTextStyle(AdaptiveTheme.typography.bodyLarge.copy(
                        color = AppleColors.blue(isDark)
                    )) {
                        title()
                    }
                }
            )
        }
    }

    @Composable
    fun Content() {
        Column(
            modifier = Modifier
                .height(CupertinoDialogsTokens.AlertDialogButtonHeight)
        ) {
            CupertinoDivider()
            Row(
                modifier = Modifier
                    .weight(1f)
            ) {
                buttons.forEachIndexed { i, btn ->
                    btn()
                    if (i != buttons.lastIndex) {
                        CupertinoVerticalDivider()
                    }
                }
            }
        }
    }
}

internal object CupertinoDialogsTokens{
    val AlertDialogPadding = SectionTokens.HorizontalPadding
    val AlertDialogWidth : Dp = 270.dp
    val AlertDialogMinHeight : Dp = 140.dp
    val TitleBodySpacing : Dp = 4.dp
    val AlertDialogButtonHeight : Dp = SectionTokens.MinHeight
}