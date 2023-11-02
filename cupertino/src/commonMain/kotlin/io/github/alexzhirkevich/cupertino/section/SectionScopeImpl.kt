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
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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

internal class SectionScopeImpl(
    val withChevron : Boolean = true
) : SectionScope {

    val items : List<SectionItem>
        get() = _items

    private val _items = mutableListOf<SectionItem>()

    internal fun item(
        key: Any? = null,
        contentType: Any? = null,
        dividerPadding : Dp? = null,
        minHeight : Dp,
        content: @Composable (PaddingValues) -> Unit,
    ){
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
        dividerPadding : Dp,
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
        contentType: Any?,
        enabled: Boolean,
        onClick: () -> Unit,
        icon: (@Composable () -> Unit)?,
        dividerPadding: Dp,
        caption : @Composable () -> Unit,
        title: @Composable () -> Unit,
    ) {

        row(
            key = key,
            contentType = contentType,
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
            Row {
                ProvideTextStyle(
                    CupertinoTheme.typography.body.copy(
                        color = CupertinoTheme.colorScheme.separator
                    )
                ) {
                    caption()

                    if (withChevron) {
                        CupertinoIcon(
                            imageVector = SFSymbols.Default.ChevronRight,
                            contentDescription = null,
                            tint = CupertinoTheme.colorScheme.separator,
                            modifier = Modifier
                                .size(LabelChevronSize)
                                .offset(x = LabelChevronSize / 3)
                        )
                    }
                }
            }
        }
    }


    override fun toggle(
        key: Any?,
        contentType: Any?,
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        enabled: Boolean,
        colors : CupertinoSwitchColors?,
        icon: (@Composable () -> Unit)?,
        dividerPadding: Dp,
        title: @Composable () -> Unit,
    ) = row(
        key = key,
        contentType = contentType,
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
        items.forEachIndexed { idx, item ->

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
                items[idx + 1].dividerPadding != null) {

                Separator(
                    modifier = Modifier
                        .padding(start = item.dividerPadding)
                )
            }

        }
    }
}