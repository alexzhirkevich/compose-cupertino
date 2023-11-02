package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.LocalTextStyle
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.isDark
import io.github.alexzhirkevich.cupertino.theme.systemGray8
import io.github.alexzhirkevich.cupertino.theme.white


/**
 * Elevated sliding segment control with divider between tabs
 * */
@Composable
fun SegmentedControl(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier
        .padding(CupertinoSectionDefaults.paddingValues)
        .height(CupertinoSegmentedControlDefaults.MinHeight),
    containerColor: Color = CupertinoSegmentedControlDefaults.ContainerColor,
    contentColor: Color = LocalContentColor.current,
    indicatorColor: Color = CupertinoSegmentedControlDefaults.IndicatorColor,
    indicator: @Composable (tabPositions: List<TabPosition>) -> Unit = @Composable { tabPositions ->
        SegmentedControlIndicator(
            selectedTabIndex = selectedTabIndex,
            tabPositions = tabPositions,
            color = indicatorColor
        )
    },
    tabs: @Composable () -> Unit
) {
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier
            .clip(CupertinoTheme.shapes.small),
        containerColor = containerColor,
        contentColor = contentColor,
        indicator = indicator,
        tabs = tabs,
    )
}

@Composable
fun SegmentedControlIndicator(
    selectedTabIndex: Int,
    tabPositions: List<TabPosition>,
    dividerColor : Color = CupertinoTheme.colorScheme.separator,
    shape: Shape = CupertinoTheme.shapes.small,
    color: Color = CupertinoSegmentedControlDefaults.IndicatorColor,
) {

    Box(Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .drawBehind {
                    tabPositions
                        .map { it.right }
                        .dropLast(1)
                        .forEachIndexed { index, it ->
//                            if (index != selectedTabIndex && index != selectedTabIndex - 1) {
                                translate(
                                    left = it.toPx(),
                                    top = size.height * 0.2f
                                ) {
                                    drawLine(
                                        color = dividerColor,
                                        start = Offset.Zero,
                                        end = Offset(0f, size.height * 0.6f)
                                    )
                                }
//                            }
                        }
                }
                .cupertinoTabIndicatorOffset(tabPositions[selectedTabIndex])
                .padding(CupertinoSegmentedControlDefaults.IndicatorPadding)
                .shadow(
                    elevation = CupertinoSegmentedControlDefaults.IndicatorElevation,
                    shape = shape
                )
                .height(CupertinoSegmentedControlDefaults.MinHeight)
                .background(color)
        )
    }
}


@Composable
fun SegmentedControlTab(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    Box(
        modifier = modifier
            .clickable(
                onClick = onClick,
                indication = null,
                interactionSource = interactionSource
            )
            .heightIn(min = CupertinoSegmentedControlDefaults.MinHeight),
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


private fun Modifier.cupertinoTabIndicatorOffset(
    currentTabPosition: TabPosition
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "tabIndicatorOffset"
        value = currentTabPosition
    }
) {
    val currentTabWidth by animateDpAsState(
        targetValue = currentTabPosition.width,
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing)
    )
    val indicatorOffset by animateDpAsState(
        targetValue = currentTabPosition.left,
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing)
    )
    fillMaxWidth()
        .wrapContentSize(Alignment.CenterStart)
        .offset(x = indicatorOffset)
        .width(currentTabWidth)
}

object CupertinoSegmentedControlDefaults {

    val MinHeight = 32.dp

    val ContainerColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.quaternarySystemFill

    val IndicatorColor : Color
        @Composable
        @ReadOnlyComposable
        get() = if (isDark())
            CupertinoColors.systemGray8(true)
        else CupertinoColors.white

    val IndicatorElevation : Dp = 4.dp

    val IndicatorPadding : Dp = 2.dp
}