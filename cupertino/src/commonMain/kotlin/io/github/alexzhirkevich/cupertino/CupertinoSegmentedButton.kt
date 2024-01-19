package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastMaxBy
import androidx.compose.ui.util.fastSumBy
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

interface CupertinoSegmentedButtonRowScope

private object CupertinoSegmentedButtonRowScopeImpl : CupertinoSegmentedButtonRowScope

@Composable
fun CupertinoSegmentedButtonRow(
    modifier: Modifier = Modifier,
    containerColor : Color = CupertinoSegmentedButtonDefaults.containerColor,
    contentColor : Color = CupertinoSegmentedButtonDefaults.contentColor,
    dividerColor : Color = CupertinoSegmentedButtonDefaults.dividerColor,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    shape: Shape = CupertinoSegmentedButtonDefaults.shape,
    content : @Composable CupertinoSegmentedButtonRowScope.() -> Unit
) {

    var height by remember {
        mutableIntStateOf(0)
    }

    var offsets by remember {
        mutableStateOf(emptyList<Float>())
    }
    CompositionLocalProvider(LocalContentColor provides contentColor) {
        Layout(
            content = {
                CupertinoSegmentedButtonRowScopeImpl.content()
            },
            modifier = modifier
                .clip(shape)
                .background(containerColor)
                .drawBehind {
                    val padding = size.height / 5f

                    offsets.fastForEach {
                        drawLine(
                            color = dividerColor,
                            start = Offset(it, padding),
                            end = Offset(it, size.height - padding),
                        )
                    }
                }
        ) { measurables, constraints ->


            val maxWidth = when {
                measurables.isEmpty() -> 0
                constraints.hasFixedWidth -> constraints.maxWidth / measurables.size
                else -> Int.MAX_VALUE
            }

            val minWidth = measurables.maxOfOrNull { it.minIntrinsicWidth(0)  } ?: 0

            val childConstraints = constraints.copy(
                minWidth = minWidth,
                maxWidth = maxWidth
            )

            val placeables = measurables.map { it.measure(childConstraints) }

            val w = if (constraints.hasFixedWidth)
                constraints.maxWidth
            else placeables.fastSumBy { it.width }

            val h = if (constraints.hasFixedHeight)
                constraints.maxHeight
            else placeables.fastMaxBy { it.height }?.height ?: 0

            height = h
            offsets = placeables.runningFold(0f) { acc, v ->
                acc + v.width
            }.drop(1).dropLast(1)


            layout(w, h) {
                var o = 0
                placeables.fastForEach { p ->
                    p.placeRelative(x = o, y = verticalAlignment.align(p.height, h))
                    o += p.width
                }
            }
        }
    }
}


@Composable
fun CupertinoSegmentedButtonRowScope.CupertinoSegmentedButton(
    onClick : () -> Unit,
    modifier: Modifier = Modifier,
    enabled : Boolean = true,
    contentPadding : PaddingValues = CupertinoSegmentedButtonDefaults.contentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel : String? = null,
    content : @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .clickable(
                enabled = enabled,
                onClick = onClick,
                indication = null,
                interactionSource = interactionSource,
                onClickLabel = onClickLabel,
                role = Role.Button
            )
            .padding(contentPadding),
        contentAlignment = Alignment.Center
    ) {

        val alpha by interactionSource.animatePressedAlpha()

        CompositionLocalProvider(
            LocalContentColor provides LocalContentColor.current.copy(
                alpha = alpha
            )
        ) {
            content()
        }
    }
}

@Immutable
object CupertinoSegmentedButtonDefaults {
    val containerColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.quaternarySystemFill

    val contentColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.label

    val dividerColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.opaqueSeparator

    val shape : Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.shapes.small

    val contentPadding : PaddingValues = PaddingValues(
        horizontal = 12.dp,
        vertical = 6.dp
    )
}