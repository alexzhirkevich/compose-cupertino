package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.Separator

private object VerticalDividerContentType
private object SplitPaddingContentType
private object SectionTitleContentType
private object SectionCaptionContentType

/**
 * Section extension for lazy lists.
 *
 * Section title, caption and each row will be rendered as a separate lazy list item
 *
 * @param style style of the section. If no value provided [LocalSectionStyle] will be used
 * */
fun LazyListScope.section(
    style: SectionStyle? = null,
    shape : CornerBasedShape ?= null,
    title: @Composable (LazyItemScope.(padding: PaddingValues) -> Unit)? = null,
    caption: @Composable (LazyItemScope.(padding: PaddingValues) -> Unit)? = null,
    content: SectionScope.() -> Unit
) {

    val itemsPadding = PaddingValues(
        horizontal = SectionTokens.HorizontalPadding,
        vertical = SectionTokens.VerticalPadding,
    )

    @Composable
    fun resolvedStyle() : SectionStyle = style ?: LocalSectionStyle.current

    item(contentType = SplitPaddingContentType) {
        Spacer(Modifier.height(SectionTokens.SplitPadding))
    }

    if (title != null) {
        item(contentType = SectionTitleContentType) {
            SectionTitle(
                style = resolvedStyle()
            ) {
                title(this, it)
            }
        }
    }

    val items = SectionScopeImpl().apply(content).items

    item(contentType = VerticalDividerContentType) {
        SectionDivider(resolvedStyle())
    }

    items.forEachIndexed { index, item ->
        item(item.key, item.contentType) {

            val resolvedShape = shape ?: CupertinoSectionDefaults.Shape

            val clipShape = when {
                !resolvedStyle().inset || !resolvedStyle().grouped -> null

                else -> RoundedCornerShape(
                    topStart = if (index == 0) resolvedShape.topStart else CornerSizeZero,
                    topEnd = if (index == 0) resolvedShape.topEnd else CornerSizeZero,
                    bottomStart = if (index == items.lastIndex) resolvedShape.bottomStart else CornerSizeZero,
                    bottomEnd = if (index == items.lastIndex) resolvedShape.bottomEnd else CornerSizeZero
                )
            }

            val clipModifier = clipShape?.let { Modifier.clip(it) } ?: Modifier

            Column(
                modifier = Modifier
                    .padding(
                        horizontal = if (resolvedStyle().inset && resolvedStyle().grouped)
                            SectionTokens.HorizontalPadding else 0.dp
                    )
                    .then(clipModifier)
                    .background(CupertinoSectionDefaults.color())

            ) {
                CompositionLocalProvider(LocalSectionStyle provides resolvedStyle()) {
                    item.content(itemsPadding)
                }

                if (index != items.lastIndex &&
                    item.dividerPadding != null &&
                    items[index+1].dividerPadding != null) {
                    Separator(Modifier.padding(start = item.dividerPadding))
                }
            }
        }
    }

    item(contentType = VerticalDividerContentType) {
        SectionDivider(resolvedStyle())
    }

    if (caption != null) {
        item(contentType = SectionCaptionContentType) {
            SectionCaption(
                style = resolvedStyle()
            ) {
                caption(this, it)
            }
        }
    }

        item(contentType = VerticalDividerContentType) {
            if (!resolvedStyle().grouped) {
                SectionDivider(resolvedStyle())
            }
        }

    item(contentType = SplitPaddingContentType) {
        Spacer(Modifier.height(SectionTokens.SplitPadding))
    }
}

private val CornerSizeZero = CornerSize(0)