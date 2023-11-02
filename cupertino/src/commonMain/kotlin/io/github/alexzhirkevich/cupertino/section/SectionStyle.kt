package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


enum class SectionStyle(
    val inset : Boolean,
    val grouped : Boolean,

) {
    InsetGrouped(true,true),
    Inset(true,false),
    Grouped(false,true),
    Plain(false,false)
}

internal val SectionStyle.shouldCapsTitle
    get() = grouped

internal val SectionStyle.shouldFillContainer
    get() = !grouped

/**
 * Apply this to section title.
 * It will automatically [uppercase] text if needed
 * */
@Composable
fun String.sectionTitle(style: SectionStyle = LocalSectionStyle.current) =
    if (style.shouldCapsTitle) uppercase() else this

/**
 * Apply this modifier to the section container.
 * It will automatically set required background
 * */
fun Modifier.sectionContainerBackground(style: SectionStyle? = null) = composed {
    background(CupertinoSectionDefaults.containerColor(style ?: LocalSectionStyle.current))
}

/**
 * Style of the current section. Defaults to [SectionStyle.InsetGrouped]
 * */
val LocalSectionStyle = compositionLocalOf<SectionStyle> {
    SectionStyle.InsetGrouped
}
