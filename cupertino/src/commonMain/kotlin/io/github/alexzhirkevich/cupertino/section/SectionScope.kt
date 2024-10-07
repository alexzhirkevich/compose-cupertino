package io.github.alexzhirkevich.cupertino.section

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Indication
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoButtonTokens
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerDefaults
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.CupertinoDropdownMenuDefaults
import io.github.alexzhirkevich.cupertino.CupertinoHorizontalDivider
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTextField
import io.github.alexzhirkevich.cupertino.CupertinoTextFieldColors
import io.github.alexzhirkevich.cupertino.CupertinoTextFieldDefaults
import io.github.alexzhirkevich.cupertino.CupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.copy
import io.github.alexzhirkevich.cupertino.cupertinoTween
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronDown
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronUp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.toStringWithLeadingZero
import io.github.alexzhirkevich.defaultLocale

interface SectionScope

@Stable
internal object SectionScopeImpl : SectionScope

@Composable
@ExperimentalCupertinoApi
fun SectionScope.SectionItem(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = CupertinoSectionDefaults.PaddingValues,
    leadingContent: @Composable () -> Unit = {},
    trailingContent: @Composable () -> Unit = {},
    title: @Composable () -> Unit
) = InternalItem {
    Row(
        modifier = modifier
            .heightIn(min = CupertinoSectionTokens.MinHeight)
            .fillMaxWidth()
            .padding(paddingValues),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement
                .spacedBy(CupertinoSectionTokens.HorizontalPadding)
        ) {
            leadingContent()
            Box {
                title()
            }
        }
        CompositionLocalProvider(
            LocalContentColor provides CupertinoTheme.colorScheme.tertiaryLabel,
            trailingContent
        )
    }
}

/**
 * Clickable label with trailing icon (chevron by default), [title], optional [icon] and [caption].
 *
 * @param onClick action performed on label click.
 * @param enabled if label is clickable.
 * @param icon icon displayed at the start of this item. [CupertinoLinkIcon] is often used for it.
 * @param onClickLabel semantics description of this label. Should be the same text as in [title].
 * @param interactionSource label interaction source.
 * @param caption content displayed before the label chevron.
 * @param title label title.
 *
 * @see CupertinoLinkIcon
 * @see switch
 * */
@ExperimentalCupertinoApi
@Composable
fun SectionScope.SectionLink(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: @Composable () -> Unit = {},
    onClickLabel: String? = null,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource? = null,
    caption : @Composable () -> Unit = {},
    chevron : @Composable () -> Unit = {
        CupertinoSectionDefaults.LabelChevron()
    },
    title: @Composable () -> Unit,
) = LabelWithCustomChevron(
    chevron = {
        LabelCaption(caption)
        chevron()
    },
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    leadingContent = icon,
    onClickLabel = onClickLabel,
    indication = indication,
    interactionSource = interactionSource,
    title = title,
)


/**
 * Popup dropdown menu with [title], optional [icon] and [selectedLabel].
 *
 * @param onClick action performed on label click.
 * @param enabled if label is clickable.
 * @param icon icon displayed at the start of this item. [CupertinoLinkIcon] is often used for it.
 * @param onClickLabel semantics description of this label. Should be the same text as in [title].
 * @param interactionSource label interaction source.
 * @param selectedLabel content displayed before the label chevron.
 * @param title label title.
 *
 * @see CupertinoLinkIcon
 * @see switch
 * */
@ExperimentalCupertinoApi
@Composable
fun SectionScope.SectionDropdownMenu(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: @Composable () -> Unit = {},
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource? = null,
    selectedLabel : @Composable () -> Unit = {},
    title: @Composable () -> Unit,
    menu : @Composable (PaddingValues) -> Unit,
) = LabelWithCustomChevron(
    modifier = modifier,
    chevron = {
        LabelCaption(selectedLabel)
        Column {
            val defaultPadding = CupertinoDropdownMenuDefaults.PaddingValues
            val padding = defaultPadding.copy(
                top = defaultPadding.calculateTopPadding() + CupertinoSectionTokens.VerticalPadding,
                bottom =  defaultPadding.calculateBottomPadding() + CupertinoSectionTokens.VerticalPadding,
                start = 0.dp,
                end = 0.dp
            )
            menu(padding)

            CupertinoIcon(
                imageVector = CupertinoIcons.Default.ChevronUp,
                contentDescription = null,
                tint = CupertinoTheme.colorScheme.tertiaryLabel,
                modifier = Modifier
                    .size(8.dp)
            )
            CupertinoIcon(
                imageVector = CupertinoIcons.Default.ChevronDown,
                contentDescription = null,
                tint = CupertinoTheme.colorScheme.tertiaryLabel,
                modifier = Modifier
                    .size(8.dp)
            )
        }
    },
    onClick = onClick,
    enabled = enabled,
    leadingContent = icon,
    onClickLabel = onClickLabel,
    interactionSource = interactionSource,
    title = title,
)

@ExperimentalCupertinoApi
@Composable
fun SectionScope.SectionDatePicker(
    state: CupertinoDatePickerState,
    expanded : Boolean,
    modifier: Modifier = Modifier,
    onExpandedChange : (Boolean) -> Unit,
    enabled: Boolean = true,
    leadingContent: @Composable () -> Unit = {},
    buttonColor : Color = Color.Unspecified,
    button : @Composable (
        buttonModifier : Modifier,
        titleModifier: Modifier,
        text : String
    ) -> Unit = { buttonModifier, titleModifier, text ->
        CupertinoSectionDefaults.PickerButton(
            modifier = buttonModifier,
            containerColor = buttonColor,
            expanded = expanded,
            title = {
                CupertinoText(
                    text = text,
                    modifier = titleModifier
                )
            }
        )
    },
    picker : @Composable () -> Unit,
    title: @Composable () -> Unit,
) = Picker(
    modifier = modifier,
    expanded = expanded,
    enabled = enabled,
    onExpandedChange = onExpandedChange,
    title = title,
    button = button,
    leadingContent = leadingContent,
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
        Box(Modifier.padding(horizontal = 6.dp)){
            picker()
        }
    }
)

@ExperimentalCupertinoApi
@Composable
fun SectionScope.SectionTimePicker(
    state: CupertinoTimePickerState,
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    buttonColor : Color = Color.Unspecified,
    leadingContent: @Composable () -> Unit = {},
    button: @Composable (buttonModifier: Modifier, titleModifier: Modifier, text: String) -> Unit =
        { buttonModifier, titleModifier, text ->
            CupertinoSectionDefaults.PickerButton(
                modifier = buttonModifier,
                containerColor = buttonColor,
                expanded = expanded,
                title = {
                    CupertinoText(
                        text = text,
                        modifier = titleModifier
                    )
                }
            )
        },
    picker : @Composable () -> Unit,
    title: @Composable () -> Unit,
) = Picker(
    modifier = modifier,
    enabled = enabled,
    expanded = expanded,
    onExpandedChange = onExpandedChange,
    title = title,
    button = button,
    leadingContent = leadingContent,
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
    content = picker
)


@ExperimentalCupertinoApi
@Composable
fun SectionScope.SectionTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle? = null,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable ((InteractionSource) -> Unit)? = {
        val focused by it.collectIsFocusedAsState()

        val updatedValueChange by rememberUpdatedState(onValueChange)

        CupertinoSectionDefaults.TextFieldClearButton(
            visible = focused && value.isNotEmpty(),
            onClick = {
                updatedValueChange.invoke("")
            }
        )
    },
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource? = null,
    colors: CupertinoTextFieldColors? = null,
) = SectionItem(
    modifier = modifier,
    title = {
        ProvideTextStyle(
            textStyle ?: CupertinoTheme.typography.body
        ) {
            Box(
                contentAlignment = Alignment.CenterStart
            ) {

                val actualInteractionSource = interactionSource ?: remember {
                    MutableInteractionSource()
                }

                CupertinoTextField(
                    value = value,
                    onValueChange = onValueChange,
                    modifier = Modifier.fillMaxWidth(),
                    colors = colors ?: CupertinoTextFieldDefaults.colors(),
                    enabled = enabled,
                    readOnly = readOnly,
                    visualTransformation = visualTransformation,
                    keyboardOptions = keyboardOptions,
                    keyboardActions = keyboardActions,
                    singleLine = singleLine,
                    maxLines = maxLines,
                    minLines = minLines,
                    placeholder = placeholder,
                    interactionSource = actualInteractionSource,
                    trailingIcon = trailingIcon?.let {
                        { it(actualInteractionSource) }
                    }
                )
            }
        }
    },
)

@ExperimentalCupertinoApi
@Composable
private fun SectionScope.LabelWithCustomChevron(
    modifier: Modifier,
    chevron: @Composable RowScope.() -> Unit,
    onClick: () -> Unit,
    enabled: Boolean = true,
    leadingContent: @Composable () -> Unit = {},
    onClickLabel: String? = null,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource? = null,
    title: @Composable () -> Unit,
) = SectionItem(
    modifier = modifier
        .clickable(
            enabled = enabled,
            onClick = onClick,
            role = Role.Button,
            onClickLabel = onClickLabel,
            interactionSource = interactionSource ?: remember { MutableInteractionSource() },
            indication = indication
        ),
    title = {
        val color = if (enabled)
            CupertinoTheme.colorScheme.label
        else CupertinoTheme.colorScheme.secondaryLabel

        CompositionLocalProvider(LocalContentColor provides color, title)
    },
    leadingContent = leadingContent,
    trailingContent = {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(CupertinoSectionTokens.InlinePadding),
            content = chevron
        )
    }
)

@Composable
private fun LabelCaption(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalContentColor provides CupertinoTheme.colorScheme.secondaryLabel
    ) {
        ProvideTextStyle(CupertinoTheme.typography.body, content = content)
    }
}



@ExperimentalCupertinoApi
@Composable
private fun SectionScope.ExpandableRow(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    belowContentExpanded : Boolean,
    belowContent : @Composable () -> Unit,
    trailingContent : @Composable () -> Unit,
    leadingContent : @Composable () -> Unit
) = InternalItem { padding ->

    var expandedBeforeAnimation by rememberSaveable {
        mutableStateOf(belowContentExpanded)
    }

    Column {
        SectionItem(
            modifier = modifier
                .fillMaxWidth()
                .heightIn(min = CupertinoSectionTokens.MinHeight)
                .padding(
                    padding.copy(
                        top = padding.calculateTopPadding() / 2,
                        bottom = padding.calculateBottomPadding() / 2
                    )
                ),
            title = title,
            trailingContent = trailingContent,
            leadingContent = leadingContent
        )
        if (belowContentExpanded || expandedBeforeAnimation) {
            CupertinoHorizontalDivider(
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
                Box(
                    Modifier.padding(
                        top = padding.calculateTopPadding(),
                        bottom = padding.calculateBottomPadding()
                    )
                ) {
                    belowContent()
                }
            }
        }
    }
}

@ExperimentalCupertinoApi
@Composable
private fun SectionScope.Picker(
    modifier: Modifier = Modifier,
    expanded : Boolean,
    text : @Composable () -> String,
    onExpandedChange : (Boolean) -> Unit,
    enabled: Boolean = true,
    leadingContent: @Composable () -> Unit = {},
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
) = ExpandableRow(
    modifier = modifier,
    title = title,
    belowContentExpanded = expanded,
    belowContent = content,
    leadingContent = leadingContent,
    trailingContent = {
        val updatedOnExpandedChange by rememberUpdatedState(onExpandedChange)

        val interactionSource = remember {
            MutableInteractionSource()
        }

        val pressed by interactionSource.collectIsPressedAsState()

        val titleText = text()

        val animatedTextAlpha by animateFloatAsState(
            targetValue = if (pressed) CupertinoButtonTokens.PressedPlainButonAlpha else 1f,
            animationSpec = spring(stiffness = Spring.StiffnessLow),
            label = "Section Date Picker fade animation"
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
)

@Composable
private fun InternalItem(
    minHeight : Dp = CupertinoSectionTokens.MinHeight,
    content : @Composable (PaddingValues) -> Unit
) {
    val itemsPadding = CupertinoSectionDefaults.PaddingValues

    CompositionLocalProvider(
        LocalContentColor provides CupertinoTheme.colorScheme.label
    ) {
        ProvideTextStyle(CupertinoTheme.typography.body) {
            Box(
                modifier = Modifier
                    .heightIn(min = minHeight)
                    .fillMaxWidth(),
                contentAlignment = Alignment.CenterStart
            ) {
                content(itemsPadding)
            }
        }
    }
}