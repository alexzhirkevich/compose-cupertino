package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastMaxBy
import androidx.compose.ui.util.fastSumBy
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

interface CupertinoSegmentedButtonRowScope

@Composable
fun CupertinoSegmentedButtonRow(
    modifier: Modifier = Modifier,
    containerColor : Color = CupertinoSegmentedButtonDefaults.containerColor,
    contentColor : Color = CupertinoSegmentedButtonDefaults.contentColor,
    dividerColor : Color = CupertinoSegmentedButtonDefaults.dividerColor,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    horizontalArrangement : Arrangement.Horizontal = Arrangement.SpaceEvenly,
    shape: Shape = CupertinoSegmentedButtonDefaults.shape,
    content : @Composable CupertinoSegmentedButtonRowScope.() -> Unit
) {

    var height by remember {
        mutableIntStateOf(0)
    }

    var offsets by remember {
        mutableStateOf(emptyList<Float>())
    }

    Surface(
        modifier = modifier,
        shape = shape,
        contentColor = contentColor,
        color = containerColor
    ) {
        val scope = remember {
            object : CupertinoSegmentedButtonRowScope {}
        }

        SubcomposeLayout(
            modifier = Modifier.drawBehind {
                val padding = size.height / 5f
                val h = 1 / density
                offsets.fastForEach {
                    drawLine(
                        color = dividerColor,
                        start = Offset(it, padding),
                        end = Offset(it, size.height - padding),
                        strokeWidth = h
                    )
                }
            }
        ) { constraints ->
            val contents = subcompose(null) {
                scope.content()
            }

            val placeables = contents.map { it.measure(constraints) }

            val w = if (constraints.hasBoundedWidth) {
                constraints.maxWidth
            } else {
                placeables.fastSumBy { it.width }
            }
            val h = placeables.fastMaxBy { it.height }?.height ?: 0

            height = h

            offsets = placeables.runningFold(0f) { acc, v ->
                acc + v.width
            }.drop(1).dropLast(1)

            val arranged = horizontalArrangement.run {
                IntArray(placeables.size).apply {
                    arrange(
                        totalSize = w,
                        sizes = placeables.map { it.width }.toIntArray(),
                        layoutDirection = layoutDirection,
                        outPositions = this
                    )
                }
            }

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
fun CupertinoSegmentedButtonRowScope.Button(
    onClick : () -> Unit,
    modifier: Modifier = Modifier,
    enabled : Boolean = true,
    contentPadding : PaddingValues = CupertinoSegmentedButtonDefaults.contentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content : @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .padding(contentPadding)
            .width(IntrinsicSize.Min)
            .height(IntrinsicSize.Min)
            .fillMaxSize()
            .clickable(
                enabled = enabled,
                onClick = onClick,
                indication = null,
                interactionSource = interactionSource
            )
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
        get() = CupertinoTheme.colorScheme.separator

    val shape : Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.shapes.small

    val contentPadding : PaddingValues = PaddingValues(
        horizontal = 8.dp,
        vertical = 4.dp
    )
}

@Composable
private fun RowScope.rememberCupertinoSegmentedButtonScope() : CupertinoSegmentedButtonRowScope{
    return remember(this) {
        object : CupertinoSegmentedButtonRowScope, RowScope by this {}
    }
}