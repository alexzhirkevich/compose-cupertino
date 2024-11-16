package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White

@Composable
@ExperimentalCupertinoApi
fun RowScope.SimpleCupertinoSwipeBoxItem(
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: ImageVector? = null,
    label: String? = null,
    weight: Float = 1f
) {
    val expansionState = LocalSwipeBoxExpansionState.current
    val actionPosition = LocalSwipeActionPosition.current

    // Determine alignment based on expansion state and action position
    // TODO this isn't working
    val contentAlignment =
    if (expansionState.isFullyExpanded(actionPosition)) {
        if (actionPosition == SwipeActionPosition.Start) Alignment.CenterStart else Alignment.CenterEnd
    } else {
        if (actionPosition == SwipeActionPosition.Start) Alignment.CenterStart else Alignment.CenterEnd
    }

    // Set content color and typography style using CompositionLocalProvider
    CompositionLocalProvider(LocalContentColor provides CupertinoColors.White) {
        ProvideTextStyle(CupertinoTheme.typography.footnote) {
            Box(
                modifier = modifier
                    .weight(weight)
                    .fillMaxSize()
                    .background(color)
                    .clickable(
                        enabled = enabled,
                        indication = LocalIndication.current,
                        interactionSource = interactionSource,
                        onClick = onClick,
                        onClickLabel = onClickLabel,
                        role = Role.Button
                    )
                    .padding(horizontal = 8.dp),
                contentAlignment = contentAlignment
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    icon?.let {
                        CupertinoIcon(
                            imageVector = it,
                            contentDescription = onClickLabel,
                            tint = CupertinoColors.White,
                            modifier = Modifier.requiredSize(20.dp)
                        )
                    }

                    label?.let {
                        CupertinoText(
                            it,
                            fontSize = 12.sp,
                            maxLines = 1
                        )
                    }
                }
            }
        }
    }
}

/**
 * Extension function to check if the swipe box is fully expanded
 */
private fun SwipeBoxExpansionState.isFullyExpanded(position: SwipeActionPosition): Boolean {
    return when (position) {
        SwipeActionPosition.Start -> isStartFullyExpanded
        SwipeActionPosition.End -> isEndFullyExpanded
    }
}