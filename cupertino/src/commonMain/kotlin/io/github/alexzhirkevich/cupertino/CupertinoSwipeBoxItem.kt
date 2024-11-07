package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White

/**
 * Item for the [CupertinoSwipeBox]
 *
 * @param color item container color
 * @param onClick item click handler
 * @param modifier item modifier
 * @param enabled if item can be clicked
 * @param onClickLabel semantic / accessibility label for the onClick action
 * @param icon item icon
 * @param label item label
 *
 * @see CupertinoSwipeBox
 */
@Composable
@ExperimentalCupertinoApi
fun RowScope.CupertinoSwipeBoxItem(
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: @Composable () -> Unit,
    label: @Composable () -> Unit,
    weight: Float = 1f
) {
    CompositionLocalProvider(
        LocalContentColor provides CupertinoColors.White
    ) {
        ProvideTextStyle(
            CupertinoTheme.typography.footnote
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color)
                    .weight(weight)
                    .clickable(
                        enabled = enabled,
                        indication = LocalIndication.current,
                        onClick = onClick,
                        interactionSource = interactionSource,
                        onClickLabel = onClickLabel,
                        role = Role.Button,
                    )
                    .padding(horizontal = 8.dp)
                    .then(modifier),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        icon()
                    }
                    Box(
                        contentAlignment = Alignment.TopCenter
                    ) {
                        label()
                    }
                }
            }
        }
    }
}