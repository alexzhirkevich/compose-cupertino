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
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.sf.ChevronRight
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoSwitchColors
import io.github.alexzhirkevich.cupertino.CupertinoSwitchDefaults
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.sf.SFSymbols
import io.github.alexzhirkevich.cupertino.Separator
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

private val LabelChevronSize = 24.dp

private object ContentTypeLabel

private object ContentTypeToggle

internal class SectionScopeImpl(
    val withChevron : Boolean = true
) : SectionScope {

    val items: List<SectionItem>
        get() = _items

    private val _items = mutableListOf<SectionItem>()

    internal fun item(
        key: Any? = null,
        contentType: Any? = null,
        dividerPadding: Dp? = null,
        minHeight: Dp,
        content: @Composable (PaddingValues) -> Unit,
    ) {
        _items += SectionItem(
            key = key,
            contentType = contentType,
            content = {
                ProvideTextStyle(CupertinoTheme.typography.body) {
                    Box(
                        modifier = Modifier
                            .heightIn(min = minHeight)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        content(it)
                    }
                }
            },
            dividerPadding = dividerPadding
        )
    }

    override fun item(
        key: Any?,
        contentType: Any?,
        dividerPadding: Dp,
        content: @Composable (PaddingValues) -> Unit
    ) {
        item(
            key = key,
            contentType = contentType,
            dividerPadding = dividerPadding,
            minHeight = SectionTokens.MinHeight,
            content = content
        )
    }

    override fun label(
        key: Any?,
        enabled: Boolean,
        onClick: () -> Unit,
        icon: (@Composable () -> Unit)?,
        dividerPadding: Dp,
        caption: @Composable () -> Unit,
        title: @Composable () -> Unit,
    ) {

        row(
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
                modifier = Modifier.offset(x = LabelChevronSize / 3),
                horizontalArrangement = Arrangement.spacedBy(SectionTokens.InlinePadding)
            ) {
                CompositionLocalProvider(
                    LocalContentColor provides CupertinoTheme.colorScheme.secondaryLabel
                ) {
                    ProvideTextStyle(CupertinoTheme.typography.body) {
                        caption()
                    }
                }

                if (withChevron) {
                    CupertinoIcon(
                        imageVector = SFSymbols.Default.ChevronRight,
                        contentDescription = null,
                        tint = CupertinoTheme.colorScheme.tertiaryLabel,
                        modifier = Modifier
                            .size(LabelChevronSize)
                    )
                }
            }
        }
    }

    override fun toggle(
        key: Any?,
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        enabled: Boolean,
        colors : CupertinoSwitchColors?,
        icon: (@Composable () -> Unit)?,
        dividerPadding: Dp,
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

    internal fun row(
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
}

@Composable
internal fun SectionScopeImpl.Draw() {
    Column {
        items.fastForEachIndexed { idx, item ->

            key(item.key) {
                item.content(
                    PaddingValues(
                        start = SectionTokens.HorizontalPadding,
                        top = SectionTokens.VerticalPadding,
                        end = SectionTokens.HorizontalPadding,
                        bottom = SectionTokens.VerticalPadding
                    )
                )

            }
            if (idx != items.lastIndex &&
                item.dividerPadding != null &&
                items[idx + 1].dividerPadding != null
            ) {

                Separator(
                    modifier = Modifier
                        .padding(start = item.dividerPadding)
                )
            }

        }
    }
}