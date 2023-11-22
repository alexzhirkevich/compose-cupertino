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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoSwitchColors
import io.github.alexzhirkevich.cupertino.CupertinoSwitchDefaults
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.SmallCupertinoIconSize
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronBackward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronForward
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


interface SectionScope {

    /**
     * Plain section item withoud additional controls
     * */
    fun item(
        key: Any? = null,
        contentType: Any? = null,
        dividerPadding : Dp = SectionTokens.DividerPadding,
        content: @Composable (padding : PaddingValues) -> Unit
    )
}

/**
 * Clickable label with trailing chevron, [title], optional [icon] and [caption].
 *
 * @see CupertinoLabelIcon
 * */
fun SectionScope.label(
    key: Any? = null,
    enabled: Boolean = true,
    onClick: () -> Unit,
    icon: (@Composable () -> Unit)? = null,
    dividerPadding: Dp = if (icon != null)
        SectionTokens.DividerPaddingWithIcon
    else SectionTokens.DividerPadding,
    caption : @Composable () -> Unit = {},
    title: @Composable () -> Unit,
)  = row(
        key = key,
        contentType = ContentTypeLabel,
        dividerPadding = dividerPadding,
        modifier = Modifier
            .clickable(enabled = enabled, onClick = onClick),
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement
                    .spacedBy(SectionTokens.HorizontalPadding)
            ) {
                icon?.invoke()
                title()
            }
        }
    ) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.offset(x = SmallCupertinoIconSize / 3),
        horizontalArrangement = Arrangement.spacedBy(SectionTokens.InlinePadding)
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
 * */
fun SectionScope.switch(
    key: Any? = null,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    colors : CupertinoSwitchColors ?= null,
    icon: (@Composable () -> Unit)? = null,
    dividerPadding: Dp = if (icon != null)
        SectionTokens.DividerPaddingWithIcon
    else SectionTokens.DividerPadding,
    title: @Composable () -> Unit,
) = row(
    key = key,
    contentType = ContentTypeToggle,
    dividerPadding = dividerPadding,
    title = title
) {
    CupertinoSwitch(
        enabled = enabled,
        checked = checked,
        colors = colors ?: CupertinoSwitchDefaults.colors(),
        onCheckedChange = onCheckedChange
    )
}

/**
 * Shortcut for adding a collection of items to the section
 * */
fun SectionScope.items(
    count : Int,
    key: (Int) -> Any? = { null },
    contentType: (Int) -> Any? = { null },
    dividerPadding : Dp = SectionTokens.DividerPadding,
    content: @Composable (idx : Int, padding : PaddingValues) -> Unit
) {
    repeat(count) {
        item(
            key = key(it),
            contentType = contentType(it),
            dividerPadding = dividerPadding,
        ) { pv ->
            content(it, pv)
        }
    }
}

/**
 * Shortcut for adding a collection of items to the section
 * */
fun <T> SectionScope.items(
    items : Collection<T>,
    key: (T) -> Any? = { null },
    contentType: (T) -> Any? = { null },
    dividerPadding : Dp = SectionTokens.DividerPadding,
    content: @Composable (item : T, padding : PaddingValues) -> Unit
) {
    items.forEach {
        item(
            key = key(it),
            contentType = contentType(it),
            dividerPadding = dividerPadding,
        ) { pv ->
            content(it, pv)
        }
    }
}

private fun SectionScope.row(
    key: Any?,
    contentType: Any?,
    dividerPadding: Dp,
    modifier : Modifier = Modifier,
    title: @Composable () -> Unit,
    content : @Composable () -> Unit
) = item(
    key = key,
    contentType = contentType,
    dividerPadding = dividerPadding
) {
    Row(
        modifier = modifier
            .heightIn(min = SectionTokens.MinHeight)
            .fillMaxWidth()
            .padding(it),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        title()
        content()
    }
}


private object ContentTypeLabel

private object ContentTypeToggle