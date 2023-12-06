/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.section

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoButtonTokens
import io.github.alexzhirkevich.cupertino.CupertinoDatePicker
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerColors
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerDefaults
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.CupertinoDivider
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoSwitchColors
import io.github.alexzhirkevich.cupertino.CupertinoSwitchDefaults
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTimePicker
import io.github.alexzhirkevich.cupertino.CupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.DatePickerStyle
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.SmallCupertinoIconSize
import io.github.alexzhirkevich.cupertino.copy
import io.github.alexzhirkevich.cupertino.cupertinoTween
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronBackward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronForward
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.toStringWithLeadingZero
import io.github.alexzhirkevich.defaultLocale


sealed interface SectionScope {

    /**
     * Plain section item without additional controls
     *
     * @param key optional key for item.
     * @param contentType optional content type for item.
     * @param dividerPadding start divider padding
     * @param content item content
     *
     * @see items
     * */
    fun item(
        key: Any? = null,
        contentType: Any? = null,
        dividerPadding : Dp = CupertinoSectionDefaults.DividerPadding,
        content: @Composable (padding : PaddingValues) -> Unit
    )
}

/**
 * Clickable label with trailing chevron, [title], optional [icon] and [caption].
 *
 * @param onClick action performed on label click.
 * @param key optional key for item.
 * @param enabled if label is clickable.
 * @param icon icon displayed at the start of this item. [CupertinoLabelIcon] is often used for it.
 * @param dividerPadding start divider padding. By default inferred from presence of [icon].
 * @param onClickLabel semantics description of this label. Should be the same text as in [title].
 * @param interactionSource label interaction source.
 * @param caption content displayed before the label chevron.
 * @param title label title.
 *
 * @see CupertinoLabelIcon
 * @see switch
 * */
@ExperimentalCupertinoApi

fun SectionScope.label(
    onClick: () -> Unit,
    key: Any? = null,
    enabled: Boolean = true,
    icon: (@Composable () -> Unit)? = null,
    dividerPadding: Dp = if (icon != null)
        CupertinoSectionDefaults.DividerPaddingWithIcon
    else CupertinoSectionDefaults.DividerPadding,
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource? = null,
    caption : @Composable () -> Unit = {},
    title: @Composable () -> Unit,
) = row(
    key = key,
    contentType = ContentTypeLabel,
    dividerPadding = dividerPadding,
    modifier = {
        Modifier
            .clickable(
                enabled = enabled,
                onClick = onClick,
                role = Role.Button,
                onClickLabel = onClickLabel,
                interactionSource = interactionSource ?: remember { MutableInteractionSource() },
                indication = LocalIndication.current
            )
    },
    title = {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement
                .spacedBy(CupertinoSectionTokens.HorizontalPadding)
        ) {
            icon?.invoke()
            title()
        }
    }
    ) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.offset(x = SmallCupertinoIconSize / 3),
        horizontalArrangement = Arrangement.spacedBy(CupertinoSectionTokens.InlinePadding)
    ) {
        CompositionLocalProvider(
            LocalContentColor provides CupertinoTheme.colorScheme.secondaryLabel
        ) {
            ProvideTextStyle(CupertinoTheme.typography.body) {
                caption()
            }
        }

        CupertinoIcon(
            imageVector = if (LocalLayoutDirection.current == LayoutDirection.Ltr)
                CupertinoIcons.Default.ChevronBackward else CupertinoIcons.Default.ChevronForward,
            contentDescription = null,
            tint = CupertinoTheme.colorScheme.tertiaryLabel,
            modifier = Modifier
                .size(SmallCupertinoIconSize)
                .rotate(180f)
        )
    }
}

/**
 * Section control with [CupertinoSwitch]
 *
 * @param checked if switch is checked
 * @param onCheckedChange action performed when switch changes checked state
 * @param key optional key for item.
 * @param enabled if label is clickable.
 * @param icon icon displayed at the start of this item. [CupertinoLabelIcon] is often used for it.
 * @param dividerPadding start divider padding. By default inferred from presence of [icon].
 * @param interactionSource label interaction source.
 * @param thumbContent content of the [CupertinoSwitch] thumb.
 * @param title switch title.
 *
 * @see CupertinoSwitch
 * @see CupertinoLabelIcon
 * @see label
 * */
@ExperimentalCupertinoApi
fun SectionScope.switch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    key: Any? = null,
    enabled: Boolean = true,
    colors : CupertinoSwitchColors ?= null,
    icon: (@Composable () -> Unit)? = null,
    dividerPadding: Dp = if (icon != null)
        CupertinoSectionDefaults.DividerPaddingWithIcon
    else CupertinoSectionDefaults.DividerPadding,
    interactionSource: MutableInteractionSource? = null,
    thumbContent: @Composable (() -> Unit)? = null,
    title: @Composable () -> Unit,
) = row(
    key = key,
    contentType = ContentTypeToggle,
    dividerPadding = dividerPadding,
    title = {
        if (icon != null) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement
                    .spacedBy(CupertinoSectionTokens.HorizontalPadding)
            ) {
                icon.invoke()
                title.invoke()
            }
        } else {
            title.invoke()
        }
    }
) {
    CupertinoSwitch(
        enabled = enabled,
        checked = checked,
        thumbContent = thumbContent,
        colors = colors ?: CupertinoSwitchDefaults.colors(),
        onCheckedChange = onCheckedChange,
        interactionSource = interactionSource ?: remember { MutableInteractionSource() }
    )
}



@ExperimentalCupertinoApi
fun SectionScope.datePicker(
    state: CupertinoDatePickerState,
    expanded : Boolean,
    onExpandedChange : (Boolean) -> Unit,
    style : DatePickerStyle? = null,
    enabled: Boolean = true,
    icon: (@Composable () -> Unit)? = null,
    dividerPadding: Dp = if (icon != null)
        CupertinoSectionDefaults.DividerPaddingWithIcon
    else CupertinoSectionDefaults.DividerPadding,
    button : @Composable (
        buttonModifier : Modifier,
        titleModifier: Modifier,
        text : String
    ) -> Unit = { buttonModifier, titleModifier, text ->
        CupertinoSectionDefaults.PickerButton(
            modifier = buttonModifier,
            expanded = expanded,
            title = {
                CupertinoText(
                    text = text,
                    modifier = titleModifier
                )
            }
        )
    },
    title: @Composable () -> Unit,
) = picker(
    expanded = expanded,
    enabled = enabled,
    onExpandedChange = onExpandedChange,
    contentType = ContentTypeDatePicker,
    dividerPadding = dividerPadding,
    title = title,
    button = button,
    text = {
        val locale = defaultLocale()
        remember {
            derivedStateOf {
                state.stateData.calendarModel
                    .getCanonicalDate(state.selectedDateMillis)
                    .format(
                        state.stateData.calendarModel,
                        CupertinoDatePickerDefaults.YearAbbrMonthDaySkeleton,
                        locale
                    )
            }
        }.value
    },
    content = {
        CupertinoDatePicker(
            modifier = Modifier.fillMaxWidth(),
            state = state,
            style = style ?: DatePickerStyle.Pager(CupertinoDatePickerDefaults.pagerColors())
        )
    }
)

@ExperimentalCupertinoApi
fun SectionScope.timePicker(
    state: CupertinoTimePickerState,
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    icon: @Composable() (() -> Unit)? = null,
    dividerPadding: Dp = if (icon != null)
        CupertinoSectionDefaults.DividerPaddingWithIcon
    else CupertinoSectionDefaults.DividerPadding,
    button: @Composable (buttonModifier: Modifier, titleModifier: Modifier, text: String) -> Unit = { buttonModifier, titleModifier, text ->
        CupertinoSectionDefaults.PickerButton(
            modifier = buttonModifier,
            expanded = expanded,
            title = {
                CupertinoText(
                    text = text,
                    modifier = titleModifier
                )
            }
        )
    },
    title: @Composable () -> Unit,
) = picker(
    enabled = enabled,
    expanded = expanded,
    onExpandedChange = onExpandedChange,
    contentType = ContentTypeTimePicker,
    dividerPadding = dividerPadding,
    title = title,
    button = button,
    text = {
        remember(state) {
            derivedStateOf {
                "${state.hour % if (state.is24Hour) 24 else 12}:${state.minute.toStringWithLeadingZero()}" + when {
                    state.is24Hour -> ""
                    state.isEvening -> " PM"
                    else -> " AM"
                }
            }
        }.value
    },
    content = {
        CupertinoTimePicker(
            modifier = Modifier.fillMaxWidth(),
            state = state,
        )
    }
)


/**
 * Shortcut for adding a bunch of [SectionScope.item]s to the section
 *
 * @param count items count.
 * @param key optional key for specific item.
 * @param contentType optional content type for specific item.
 * @param dividerPadding start divider padding
 * @param content item content
 * */
inline fun SectionScope.items(
    count : Int,
    key: (Int) -> Any? = { null },
    contentType: (Int) -> Any? = { null },
    dividerPadding : Dp = CupertinoSectionDefaults.DividerPadding,
    crossinline content: @Composable (idx : Int, padding : PaddingValues) -> Unit
) = repeat(count) {
    item(
        key = key(it),
        contentType = contentType(it),
        dividerPadding = dividerPadding,
    ) { pv ->
        content(it, pv)
    }
}

/**
 * Shortcut for adding a bunch of [SectionScope.item]s to the section
 *
 * @param items items list.
 * @param key optional key for specific item.
 * @param contentType optional content type for specific item.
 * @param dividerPadding start divider padding
 * @param content item content
 * */
inline fun <T> SectionScope.items(
    items : Collection<T>,
    key: (T) -> Any? = { null },
    contentType: (T) -> Any? = { null },
    dividerPadding : Dp = CupertinoSectionDefaults.DividerPadding,
    crossinline content: @Composable (item : T, padding : PaddingValues) -> Unit
) = items.forEach {
    item(
        key = key(it),
        contentType = contentType(it),
        dividerPadding = dividerPadding,
    ) { pv ->
        content(it, pv)
    }
}


private fun SectionScope.row(
    key: Any?,
    contentType: Any?,
    dividerPadding: Dp,
    modifier: @Composable () -> Modifier = { Modifier },
    title: @Composable () -> Unit,
    endContent: @Composable () -> Unit
) = item(
    key = key,
    contentType = contentType,
    dividerPadding = dividerPadding
) {
    Row(
        modifier = modifier()
            .heightIn(min = CupertinoSectionTokens.MinHeight)
            .fillMaxWidth()
            .padding(it),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        title()
        endContent()
    }
}
private fun SectionScope.expandableRow(
    key: Any?,
    contentType: Any?,
    dividerPadding: Dp,
    modifier : @Composable () -> Modifier = { Modifier },
    title: @Composable () -> Unit,
    belowContentExpanded : Boolean,
    belowContent : @Composable () -> Unit,
    endContent : @Composable () -> Unit
) = item(
    key = key,
    contentType = contentType,
    dividerPadding = dividerPadding
) {

    var expandedBeforeAnimation by rememberSaveable {
        mutableStateOf(belowContentExpanded)
    }

    Column{
        Row(
            modifier = modifier()
                .fillMaxWidth()
                .heightIn(min = CupertinoSectionTokens.MinHeight)
                .padding(
                    it.copy(
                        top = it.calculateTopPadding()/2,
                        bottom = it.calculateBottomPadding()/2
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            title()
            endContent()
        }
        if (belowContentExpanded || expandedBeforeAnimation) {
            CupertinoDivider(
                modifier = Modifier
                    .padding(start = CupertinoSectionDefaults.DividerPadding)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .animateContentSize(
                    animationSpec = cupertinoTween(),
                    finishedListener = { _, _ ->
                        expandedBeforeAnimation = belowContentExpanded
                    }
                )
        ) {
            if (belowContentExpanded) {
                belowContent()
            }
        }
    }
}

@ExperimentalCupertinoApi
private fun SectionScope.picker(
    contentType: Any?,
    expanded : Boolean,
    text : @Composable () -> String,
    onExpandedChange : (Boolean) -> Unit,
    enabled: Boolean = true,
    icon: (@Composable () -> Unit)? = null,
    dividerPadding: Dp = if (icon != null)
        CupertinoSectionDefaults.DividerPaddingWithIcon
    else CupertinoSectionDefaults.DividerPadding,
    button : @Composable (
        buttonModifier : Modifier,
        titleModifier: Modifier,
        text : String
    ) -> Unit = { buttonModifier, titleModifier, text ->
        CupertinoSectionDefaults.PickerButton(
            modifier = buttonModifier,
            expanded = expanded,
            title = {
                CupertinoText(
                    text = text,
                    modifier = titleModifier
                )
            }
        )
    },
    content : @Composable () -> Unit,
    title: @Composable () -> Unit,
) = expandableRow(
    key = null,
    contentType = contentType,
    dividerPadding = dividerPadding,
    title = title,
    belowContentExpanded = expanded,
    belowContent = content
) {

    val updatedOnExpandedChange by rememberUpdatedState(onExpandedChange)

    val interactionSource = remember {
        MutableInteractionSource()
    }

    val pressed by interactionSource.collectIsPressedAsState()

    val titleText = text()

    val animatedTextAlpha by animateFloatAsState(
        targetValue = if (pressed) CupertinoButtonTokens.PressedPlainButonAlpha else 1f,
        animationSpec = spring(stiffness = Spring.StiffnessLow),
        label = "Section Date picker fade animation"
    )
    button(
        Modifier.clickable(
            interactionSource = interactionSource,
            enabled = enabled,
            indication = null,
            onClick = {
                updatedOnExpandedChange(!expanded)
            }
        ),
        Modifier.graphicsLayer {
            alpha = animatedTextAlpha
        },
        titleText
    )
}

private object ContentTypeLabel
private object ContentTypeToggle
private object ContentTypeDatePicker
private object ContentTypeTimePicker