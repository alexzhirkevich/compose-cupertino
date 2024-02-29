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
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoDivider
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoIconDefaults
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.Surface
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronBackward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronForward
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

/**
 * Section state is used to manage collapsing behavior and state of sections with [SectionStyle.Sidebar]
 * */
@Composable
fun rememberSectionState(
    initiallyCollapsed: Boolean = false,
    canCollapse: Boolean = true
) : SectionState = rememberSaveable(
    saver = SectionState.Saver()
){
    SectionState(
        initiallyCollapsed = initiallyCollapsed,
        canCollapse = canCollapse
    )
}

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
    color: Color = CupertinoSectionDefaults.Color,
    containerColor : Color = CupertinoSectionDefaults.containerColor(style),
    contentPadding : PaddingValues = CupertinoSectionDefaults.paddingValues(
        style = style,
        includePaddingBetweenSections = true
    ),
    title : (@Composable () -> Unit)?=null,
    caption : (@Composable () -> Unit)?=null,
    content : SectionScope.() -> Unit
) {
    CompositionLocalProvider(
        LocalSectionStyle provides style
    ) {
        Column(
            modifier = modifier
                .background(containerColor)
                .padding(contentPadding)
        ) {
            if (title != null) {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = if (style.grouped)
                        containerColor
                    else color
                ) {
                    SectionTitle(
                        style = style,
                        lazy = false,
                        state = state,
                        content = title
                    )
                }
                SectionDivider(
                    modifier = Modifier.background(color),
                    style = style
                )
            }

            val scope = SectionScopeImpl().apply(content)

            AnimateSection(
                style = style,
                state = state,
                enterTransition = enterTransition,
                exitTransition = exitTransition
            ) {
                Column {
                    Surface(
                        color = color,
                        shape = shape,
                    ) {
                        scope.Draw()
                    }

                    SectionDivider(
                        modifier = Modifier.background(color),
                        style = style
                    )

                    if (caption != null) {
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            color = if (style.grouped)
                                containerColor
                            else color
                        ) {
                            SectionCaption(
                                style = style,
                                lazy = false,
                                content = caption
                            )
                        }
                        if (!style.grouped) {
                            SectionDivider(style)
                        }
                    }
                }
            }
        }
    }
}

/**
 * Section state is used to manage collapsing behavior and state of sections with [SectionStyle.Sidebar]
 * */
@Stable
class SectionState(
    initiallyCollapsed: Boolean,
    canCollapse : Boolean
) {
    var isCollapsed by mutableStateOf(initiallyCollapsed)
        private set

    var canCollapse by mutableStateOf(canCollapse)

    fun toggle() {
        if (isCollapsed)
            expand()
        else collapse()
    }

    fun collapse() {
        isCollapsed = true
    }

    fun expand() {
        isCollapsed = false
    }

    companion object {
        fun Saver(): Saver<SectionState, *> =
            Saver(
                save = {
                    listOf(it.isCollapsed, it.canCollapse)
                },
                restore = {
                    SectionState(
                        initiallyCollapsed = it[0],
                        canCollapse = it[1]
                    )
                }
            )
    }
}


@Composable
internal fun SectionTitle(
    style: SectionStyle,
    state: SectionState?,
    lazy : Boolean,
    content: @Composable () -> Unit
) {

    val additionalPadding = when {
        !lazy -> PaddingValues(0.dp)
        style == SectionStyle.InsetGrouped ->PaddingValues(
            horizontal = CupertinoSectionTokens.HorizontalPadding
        )
        style == SectionStyle.Sidebar -> PaddingValues(
            end = CupertinoSectionTokens.HorizontalPadding
        )
        else -> PaddingValues(0.dp)
    }

    val basePadding = PaddingValues(
        start = if (!lazy && style == SectionStyle.Sidebar )
            0.dp
        else CupertinoSectionTokens.HorizontalPadding,
        end = CupertinoSectionTokens.HorizontalPadding,
        bottom = if (style == SectionStyle.Sidebar)
            CupertinoSectionTokens.InlinePadding * 2
         else CupertinoSectionTokens.InlinePadding,
    )

    CompositionLocalProvider(
        LocalContentColor provides CupertinoSectionDefaults.titleColor(style),
        LocalSectionStyle provides style
    ) {
        val tapModifier = if (state != null && style == SectionStyle.Sidebar && state.canCollapse)
            Modifier
                .clickable(
                    onClickLabel = if (state.isCollapsed) "Expand" else "Hide",
                    interactionSource = remember { MutableInteractionSource() },
                    onClick = { state.toggle() },
                    indication = null
                )
         else Modifier

        ProvideTextStyle(CupertinoSectionDefaults.titleTextStyle(style)) {
            Row(
                modifier = tapModifier
                    .padding(basePadding)
                    .padding(additionalPadding),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                content()

                if (style == SectionStyle.Sidebar && state != null && state.canCollapse) {

                    val isLtr = LocalLayoutDirection.current == LayoutDirection.Ltr

                    val rotation by animateFloatAsState(
                        targetValue = when {
                            state.isCollapsed -> 0f
                            isLtr -> 90f
                            else -> -90f
                        },
                        animationSpec = spring(
                            stiffness = Spring.StiffnessMediumLow,
                        )
                    )

                    CupertinoIcon(
                        imageVector = if (isLtr)
                            CupertinoIcons.Default.ChevronForward
                        else CupertinoIcons.Default.ChevronBackward,
                        contentDescription = "Collapse",
                        modifier = Modifier
                            .size(CupertinoIconDefaults.SmallSize)
                            .graphicsLayer {
                                rotationZ = rotation
                            },
                        tint = CupertinoTheme.colorScheme.accent
                    )
                }
            }
        }
    }
}

@Composable
internal fun SectionCaption(
    style: SectionStyle,
    lazy : Boolean,
    content: @Composable () -> Unit
) {

    val addCorner = if (style.inset && style.grouped && lazy)
        CupertinoSectionTokens.HorizontalPadding else 0.dp

    CompositionLocalProvider(
        LocalContentColor provides CupertinoSectionDefaults.captionColor(style),
        LocalSectionStyle provides style
    ) {
        ProvideTextStyle(CupertinoSectionDefaults.captionTextStyle(style)) {
            Box(
                Modifier.padding(
                    PaddingValues(
                        horizontal = CupertinoSectionTokens.HorizontalPadding + addCorner,
                        vertical = CupertinoSectionTokens.InlinePadding
                    )
                )
            ) {
                content()
            }
        }
    }
}

@Composable
internal fun SectionDivider(
    style: SectionStyle,
    modifier: Modifier = Modifier
) {
    if (style.inset && style.grouped)
        return

    CupertinoDivider(
        modifier = modifier.padding(
            start = if (style.grouped)
                0.dp else CupertinoSectionTokens.HorizontalPadding
        )
    )
}
