package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import io.github.alexzhirkevich.LocalTextStyle
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.isDark
import io.github.alexzhirkevich.cupertino.theme.systemGray8
import io.github.alexzhirkevich.cupertino.theme.white


/**
 * Sliding segmented control
 *
 * @param selectedTabIndex index of the current selected tab
 * @param modifier control modifier
 * @param colors segmented control colors
 * @param shape shape of the segmented control and its indicator
 * @param paddingValues outer paddings. Default values are equal to section paddings
 * @param indicator sliding indicator
 * @param tabs segmented control tabs
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSegmentedControl(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    colors : CupertinoSegmentedControlColors = CupertinoSegmentedControlDefaults.colors(),
    shape : CornerBasedShape = CupertinoSegmentedControlDefaults.Shape,
    paddingValues: PaddingValues = CupertinoSegmentedControlDefaults.PaddingValues,
    indicator: @Composable (tabPositions: List<TabPosition>) -> Unit = @Composable { tabPositions ->
        CupertinoSegmentedControlIndicator(
            selectedTabIndex = selectedTabIndex,
            tabPositions = tabPositions,
            color = colors.indicatorColor,
            shape = shape,
            separatorColor = colors.separatorColor
        )
    },
    tabs: @Composable () -> Unit
) {
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier
            .padding(paddingValues)
            .heightIn(min = CupertinoSegmentedControlDefaults.MinHeight)
            .clip(shape),
        containerColor = colors.containerColor,
        contentColor = colors.contentColor,
        indicator = indicator,
        tabs = tabs,
    )
}

/**
 * Sliding indicator of the [CupertinoSegmentedControl]
 *
 * @param selectedTabIndex index of the current selected tab
 * @param tabPositions positions of the [CupertinoSegmentedControl] tabs
 * @param shape indicator shape. Should be the same as [CupertinoSegmentedControl] shape.
 * @param color indicator color
 * @param separatorColor color of the divider between tabs
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSegmentedControlIndicator(
    selectedTabIndex: Int,
    tabPositions: List<TabPosition>,
    shape: CornerBasedShape = CupertinoTheme.shapes.small,
    color: Color,
    separatorColor : Color = CupertinoTheme.colorScheme.separator,
) {

    Box(
        modifier = Modifier
            .drawBehind {
                tabPositions
                    .dropLast(1)
                    .fastForEach {
                        translate(
                            left = it.right.toPx(),
                            top = size.height * 0.2f
                        ) {
                            drawLine(
                                color = separatorColor,
                                start = Offset.Zero,
                                end = Offset(0f, size.height * 0.6f)
                            )
                        }
                    }
            }
            .cupertinoTabIndicatorOffset(
                tabPositions = tabPositions,
                selectedTabIndex = selectedTabIndex
            )
            .padding(CupertinoSegmentedControlDefaults.IndicatorPadding)
            .shadow(
                elevation = CupertinoSegmentedControlDefaults.IndicatorElevation,
                shape = shape
            )
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color)
    )
}

/**
 * Tab of the [CupertinoSegmentedControl]
 *
 * @param onClick tab click callback
 * @param modifier tab modifier
 * @param interactionSource tab interaction source
 * @param content tab content
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSegmentedControlTab(
    onClick: () -> Unit,
    isSelected : Boolean,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {

    val pressed by interactionSource.collectIsPressedAsState()

    val animatedHeight by animateFloatAsState(
        if (pressed && isSelected) 1.05f else 1f
    )

    Box(
        modifier = modifier
            .heightIn(min = CupertinoSegmentedControlDefaults.MinHeight)
            .graphicsLayer {
                scaleY = animatedHeight
                scaleX = animatedHeight
            }
            .clickable(
                onClick = onClick,
                indication = null,
                interactionSource = interactionSource,
                role = Role.Tab
            ),
        contentAlignment = Alignment.Center
    ) {
        CompositionLocalProvider(
            LocalTextStyle provides CupertinoTheme.typography.caption1.copy(
                fontWeight = FontWeight.SemiBold,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center
            )
        ) {
            content()
        }
    }
}

private val OffsetShift = 6.dp

private fun Modifier.cupertinoTabIndicatorOffset(
    tabPositions: List<TabPosition>,
    selectedTabIndex: Int,
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "tabIndicatorOffset"
        value = tabPositions[selectedTabIndex]
    }
) {

    val isFirst = selectedTabIndex == 0
    val isLast = selectedTabIndex == tabPositions.lastIndex

    val currentTabPosition = tabPositions[selectedTabIndex]

    val currentTabWidth by animateDpAsState(
        targetValue = currentTabPosition.width + if (isFirst || isLast) OffsetShift/2 else OffsetShift,
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing)
    )
    val indicatorOffset by animateDpAsState(
        targetValue = currentTabPosition.left - if (isFirst) 0.dp else OffsetShift/2,
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing)
    )

    fillMaxWidth()
        .wrapContentSize(Alignment.CenterStart)
        .offset(x = indicatorOffset)
        .width(currentTabWidth)
}

class CupertinoSegmentedControlColors internal constructor(
    val containerColor: Color,
    val contentColor : Color,
    val indicatorColor: Color,
    val separatorColor : Color
)

object CupertinoSegmentedControlDefaults {

    val MinHeight = 32.dp
    val IndicatorElevation : Dp = 4.dp
    val IndicatorPadding : Dp = 2.dp

    val PaddingValues : PaddingValues
        get() = CupertinoSectionDefaults.paddingValues

    val Shape : CornerBasedShape
        @Composable
        get() = CupertinoTheme.shapes.small

    @Composable
    fun colors(
        containerColor : Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        indicatorColor: Color = if (isDark())
            CupertinoColors.systemGray8(true)
        else CupertinoColors.white,
        contentColor: Color = CupertinoTheme.colorScheme.label,
        separatorColor: Color = CupertinoTheme.colorScheme.separator
    ) = CupertinoSegmentedControlColors(
        containerColor = containerColor,
        contentColor = contentColor,
        indicatorColor = indicatorColor,
        separatorColor = separatorColor
    )

}