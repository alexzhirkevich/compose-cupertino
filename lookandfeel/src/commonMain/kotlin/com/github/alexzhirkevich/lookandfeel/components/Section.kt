package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoDivider
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme

interface SectionScope {
    fun item(
        dividerPadding : Dp = SectionTokens.DividerPadding,
        content: @Composable (PaddingValues) -> Unit
    )

    fun label(
        enabled: Boolean = true,
        onClick: () -> Unit,
        icon: (@Composable () -> Unit)? = null,
        caption : @Composable () -> Unit = {},
        title: @Composable () -> Unit,
    )

    fun toggle(
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        enabled: Boolean = true,
        icon: (@Composable () -> Unit)? = null,
        title: @Composable () -> Unit,
    )
}

object CupertinoSectionDefaults {
    val paddingValues = PaddingValues(16.dp, 12.dp)
}


/**
 * Section of the iOS list.
 *
 * @param modifier section modifier
 * @param title top label of the section. Should be uppercase
 * @param caption bottom label of the section
 * @param content section builder
 * */
@Composable
fun CupertinoSection(
    modifier : Modifier = Modifier,
    title : (@Composable (PaddingValues) -> Unit)?=null,
    caption : (@Composable (PaddingValues) -> Unit)?=null,
    content : SectionScope.() -> Unit
) {
    val style = MaterialTheme.typography.labelLarge.copy(
        color = MaterialTheme.colorScheme.onBackground
            .copy(alpha = .5f)
    )

    Column(
        modifier.padding(CupertinoSectionDefaults.paddingValues)
    ) {
        if (title != null) {
            CompositionLocalProvider(LocalContentColor provides style.color) {
                ProvideTextStyle(style) {
                    title(
                        PaddingValues(
                            start = SectionTokens.HorizontalPadding,
                            bottom = 6.dp
                        )
                    )
                }
            }
        }
        Card {
            val scope = remember(content) {
                SectionScopeImpl().apply(content)
            }

            scope.Draw()
        }
        if (caption != null) {
            CompositionLocalProvider(LocalContentColor provides style.color) {

                ProvideTextStyle(style) {
                    caption(
                        PaddingValues(
                            start = SectionTokens.HorizontalPadding,
                            top = 6.dp
                        )
                    )
                }
            }
        }
    }
}


internal object SectionTokens {
    val VerticalPadding = 8.dp
    val HorizontalPadding = 18.dp
    val MinHeight = 48.dp
    val DividerPadding = HorizontalPadding
    val DividerPaddingWithIcon = DividerPadding +
            HorizontalPadding + MinHeight - VerticalPadding
}

private class SectionItem(
    val dividerPadding: Dp,
    val content: @Composable (PaddingValues) -> Unit,
)

private class SectionScopeImpl : SectionScope {

    private val items = mutableListOf<SectionItem>()
    override fun item(
        dividerPadding : Dp,
        content: @Composable (PaddingValues) -> Unit
    ) {
        items += SectionItem(
            content = content,
            dividerPadding = dividerPadding
        )
    }

    override fun label(
        enabled: Boolean,
        onClick: () -> Unit,
        icon: (@Composable () -> Unit)?,
        caption : @Composable () -> Unit,
        title: @Composable () -> Unit,
    ) = row(
        dividerPadding = if (icon != null) SectionTokens.DividerPaddingWithIcon else SectionTokens.DividerPadding,
        modifier = Modifier
            .clickable(enabled = enabled, onClick = onClick),
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(SectionTokens.HorizontalPadding)
            ) {
                icon?.invoke()
                title()
            }
        }
    ) {
        Row {
            ProvideTextStyle(AdaptiveTheme.typography.bodyLarge.copy(
                color = AdaptiveTheme.colorScheme.outlineVariant
            )) {

                caption()
                Icon(
                    imageVector = Icons.Outlined.ChevronRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.outlineVariant
                )
            }
        }
    }


    override fun toggle(
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        enabled: Boolean,
        icon: (@Composable () -> Unit)?,
        title: @Composable () -> Unit,
    ) = row(
        dividerPadding = if (icon != null) SectionTokens.DividerPaddingWithIcon else SectionTokens.DividerPadding,
        title = title
    ) {
        AdaptiveSwitch(
            enabled = enabled,
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }

    @Composable
    fun Draw() {
        Column {
            items.forEachIndexed { idx, item ->

                item.content(
                    PaddingValues(
                        start = SectionTokens.HorizontalPadding,
                        top = SectionTokens.VerticalPadding,
                        end = SectionTokens.HorizontalPadding,
                        bottom = SectionTokens.VerticalPadding
                    )
                )

                if (idx != items.lastIndex) {
                    CupertinoDivider(
                        modifier = Modifier
                            .padding(
                                start = item.dividerPadding,
                            )
                    )
                }
            }
        }
    }

    private fun row(
        dividerPadding: Dp,
        modifier : Modifier = Modifier,
        title: @Composable () -> Unit,
        content : @Composable () -> Unit
    ) = item(dividerPadding) {
        Row(
            modifier = modifier
                .heightIn(SectionTokens.MinHeight)
                .fillMaxWidth()
                .padding(it),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ProvideTextStyle(AdaptiveTheme.typography.bodyLarge) {
                title()
            }

            content()
        }
    }
}
