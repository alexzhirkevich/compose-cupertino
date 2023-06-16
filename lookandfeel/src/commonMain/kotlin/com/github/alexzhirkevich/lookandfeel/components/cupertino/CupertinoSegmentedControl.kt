package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSectionDefaults
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.AppleColors
import com.github.alexzhirkevich.lookandfeel.util.isDark

@Composable
fun CupertinoSegmentedControl(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier
        .padding(CupertinoSectionDefaults.paddingValues),
    containerColor: Color = AdaptiveTheme.colorScheme.surface,
    contentColor: Color = AdaptiveTheme.colorScheme.primary,
    shape: Shape = AdaptiveTheme.shapes.small,
    tabs: @Composable () -> Unit
) {
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier
            .clip(shape)
            .border(1.dp, contentColor, AdaptiveTheme.shapes.small),
        containerColor = containerColor,
        contentColor = contentColor,
        divider = {},
        indicator = {},
        tabs = tabs,
    )
}

@Composable
fun CupertinoSegmentedControlTab(
    isSelected : Boolean,
    onClick : () -> Unit,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    title : @Composable () -> Unit,
) {
    val color = LocalContentColor.current
    Box(
        modifier = Modifier
            .clickable(
                onClick = onClick,
                indication = LocalIndication.current,
                interactionSource = interactionSource
            )
            .background(if (isSelected) color else Color.Transparent)
            .border(1.dp, color)
            .heightIn(min = CupertinoSegmentedControlDefaults.minHeight),
        contentAlignment = Alignment.Center
    ) {
        CompositionLocalProvider(LocalTextStyle provides AdaptiveTheme.typography.labelLarge.copy(
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Normal,
            color = if (isSelected) contentColorFor(color) else color,
            textAlign = TextAlign.Center
        )) {
            title()
        }
    }
}

/**
 * Elevated sliding segment control with divider between tabs
 * */
@Composable
fun CupertinoSlidingSegmentedControlIndicator(
    selectedTabIndex: Int,
    tabPositions: List<TabPosition>,
    dividerColor : Color = AdaptiveTheme.colorScheme.outlineVariant,
    shape: Shape = AdaptiveTheme.shapes.small,
    color: Color,
) {

    Box(Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .drawBehind {
                    tabPositions
                        .map { it.right }
                        .dropLast(1)
                        .forEachIndexed { index, it ->
                            if (index != selectedTabIndex && index != selectedTabIndex - 1) {
                                translate(
                                    left = it.toPx(),
                                    top = size.height * 0.2f
                                ) {
                                    drawLine(
                                        dividerColor,
                                        Offset.Zero,
                                        end = Offset(0f, size.height * 0.6f)
                                    )
                                }
                            }
                        }
                }
                .cupertinoTabIndicatorOffset(tabPositions[selectedTabIndex])
                .padding(2.dp)
                .shadow(elevation = 1.dp, shape = AdaptiveTheme.shapes.small)
                .height(CupertinoSegmentedControlDefaults.minHeight)
                .clip(shape)
                .background(color)
                .zIndex(1f)
        )
    }
}

@Composable
fun CupertinoSlidingSegmentedControl(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier
        .padding(CupertinoSectionDefaults.paddingValues)
        .height(CupertinoSegmentedControlDefaults.minHeight),
    containerColor: Color = AppleColors.gray(isDark).copy(alpha = .25f),
    contentColor: Color = LocalTextStyle.current.color,
    indicatorColor: Color = AdaptiveTheme.colorScheme.secondaryContainer,
    indicator: @Composable (tabPositions: List<TabPosition>) -> Unit = @Composable { tabPositions ->
        CupertinoSlidingSegmentedControlIndicator(
            selectedTabIndex = selectedTabIndex,
            tabPositions = tabPositions,
            color = indicatorColor
        )
    },
    tabs: @Composable (Modifier) -> Unit
) {
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier
            .clip(AdaptiveTheme.shapes.small),
        containerColor = containerColor,
        contentColor = contentColor,
        divider = {},
        indicator = indicator,
        tabs = { tabs(Modifier.zIndex(2f)) },
    )
}


@Composable
fun CupertinoSlidingSegmentedControlTab(
    isSelected : Boolean,
    onClick : () -> Unit,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    title : @Composable () -> Unit,
) {
    Box(
        modifier = modifier
            .clickable(
                onClick = onClick,
                indication = null,
                interactionSource = interactionSource
            )
            .heightIn(min = CupertinoSegmentedControlDefaults.minHeight),
        contentAlignment = Alignment.Center
    ) {
        CompositionLocalProvider(LocalTextStyle provides AdaptiveTheme.typography.labelLarge.copy(
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Normal,
            color = AdaptiveTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )) {
            title()
        }
    }
}

/**
 * Equivalent to [tabIndicatorOffset] with [Alignment.CenterStart]
 * */
fun Modifier.cupertinoTabIndicatorOffset(
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

object CupertinoSegmentedControlDefaults{
    val minHeight = 32.dp
}