/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino.section

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.util.fastMap
import androidx.compose.ui.util.fastSumBy
import io.github.alexzhirkevich.cupertino.CupertinoHorizontalDivider
import io.github.alexzhirkevich.cupertino.CupertinoSurface
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


/**
 * iOS-like list section.
 *
 * There is also an optimized [section] extension for lazy lists.
 *
 * @param modifier section modifier
 * @param style section style
 * @param shape section shape
 * @param color section background color
 * @param title section top label
 * @param caption section bottom label
 * @param content section builder
 *
 * @see section
 * @see SectionItem
 * @see SectionLink
 * @see SectionDatePicker
 * @see SectionTimePicker
 * @see SectionDropdownMenu
 * @see SectionTextField
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSection(
    modifier : Modifier = Modifier,
    style: SectionStyle = LocalSectionStyle.current,
    state: SectionState = rememberSectionState(canCollapse = true),
    enterTransition: EnterTransition = CupertinoSectionDefaults.EnterTransition,
    exitTransition: ExitTransition = CupertinoSectionDefaults.ExitTransition,
    shape : CornerBasedShape = CupertinoSectionDefaults.shape(style),
    color: Color = if (style.grouped)
        CupertinoSectionDefaults.Color
    else Color.Transparent,
    dividerPadding: PaddingValues = PaddingValues(
        start = CupertinoSectionDefaults.DividerPadding
    ),
    contentPadding : PaddingValues = CupertinoSectionDefaults.paddingValues(
        style = style,
        includePaddingBetweenSections = true
    ),
    title : (@Composable () -> Unit)? = null,
    caption : (@Composable () -> Unit)? = null,
    content : @Composable SectionScope.() -> Unit
) {
    CompositionLocalProvider(
        LocalSectionStyle provides style
    ) {
        Column(
            modifier = modifier
                .padding(contentPadding)
        ) {
            if (title != null) {
                SectionTitle(
                    style = style,
                    lazy = false,
                    state = state,
                    content = {
                        title()
                    }
                )
                SectionDivider(
                    modifier = Modifier.background(color),
                    style = style
                )
            }

            AnimateSection(
                style = style,
                state = state,
                enterTransition = enterTransition,
                exitTransition = exitTransition
            ) {
                Column {
                    CupertinoSurface(
                        shape = shape,
                        color = color
                    ) {
                        val showDivider = CupertinoTheme.colorScheme.separator
                            .let { it.isSpecified && it != Color.Transparent }

                        SubcomposeLayout { constraints ->
                            val measurables = subcompose(null) { content(SectionScopeImpl) }

                            val dividers = subcompose(Unit) {
                                if (showDivider) {
                                    repeat(measurables.size - 1) {
                                        CupertinoHorizontalDivider(
                                            modifier = Modifier.padding(dividerPadding)
                                        )
                                    }
                                }
                            }.fastMap { it.measure(constraints) }

                            val placeables = measurables.fastMap { it.measure(constraints) }

                            layout(
                                width = constraints.maxWidth,
                                height = (placeables + dividers).fastSumBy { it.height }
                            ) {
                                var h = 0
                                placeables.fastForEachIndexed { i, p ->
                                    p.place(0, h)
                                    h += p.height

                                    if (showDivider && i < placeables.lastIndex) {
                                        dividers[i].place(0, h)
                                        h += dividers[i].height
                                    }
                                }
                            }
                        }
                    }

                    SectionDivider(
                        modifier = Modifier.background(color),
                        style = style
                    )

                    if (caption != null) {

                        SectionCaption(
                            style = style,
                            lazy = false,
                            content = caption
                        )
                        if (!style.grouped) {
                            SectionDivider(style)
                        }
                    }
                }
            }
        }
    }
}

