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

package sections

import adaptive.SectionsComponent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoNavigateBackButton
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControl
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControlTab
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.isTopBarTransparent
import io.github.alexzhirkevich.cupertino.section.CupertinoSection
import io.github.alexzhirkevich.cupertino.section.SectionScope
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.section.label
import io.github.alexzhirkevich.cupertino.section.section
import io.github.alexzhirkevich.cupertino.section.sectionTitle
import io.github.alexzhirkevich.cupertino.section.switch
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@OptIn(ExperimentalCupertinoApi::class, ExperimentalFoundationApi::class)
@Composable
fun SectionsScreen(
    component: SectionsComponent
) {

    var isLazy by remember {
        mutableStateOf(true)
    }

    val pagerState = rememberPagerState(
        pageCount = { 2 }
    )

    val toggleState = remember {
        mutableStateOf(false)
    }

    LaunchedEffect(isLazy) {
        pagerState.animateScrollToPage(if (isLazy) 0 else 1)
    }

    val lazyState = rememberLazyListState()

    val defaultState = rememberScrollState()

    val currentState = if (isLazy)
        lazyState
    else defaultState

    CupertinoScaffold(
        topBar = {
            CupertinoTopAppBar(
                isTransparent = currentState.isTopBarTransparent,
                navigationIcon = {
                    CupertinoNavigateBackButton(
                        onClick = component::onNavigateBack,
                    ) {
                        CupertinoText("Back")
                    }
                },
                title = {
                    CupertinoSegmentedControl(
                        modifier = Modifier
                            .width(200.dp),
                        selectedTabIndex = if (isLazy) 0 else 1
                    ) {
                        CupertinoSegmentedControlTab(
                            isSelected = isLazy,
                            onClick = {
                                isLazy = true
                            }
                        ) {
                            CupertinoText("Lazy")
                        }
                        CupertinoSegmentedControlTab(
                            isSelected = !isLazy,
                            onClick = {
                                isLazy = false

                            }
                        ) {
                            CupertinoText("Default")
                        }
                    }
                }
            )
        }
    ) { pv ->
        if (isLazy) {
            LazyColumn(
                state = lazyState,
                modifier = Modifier
                    .fillMaxSize()
                    .background(CupertinoTheme.colorScheme.systemGroupedBackground),
            contentPadding = pv
            ) {

                SectionStyle.values().forEach { style ->
                    section(
                        style = style,
                        title = {
                            Title(style)
                        },
                        caption = {
                            Caption()
                        }
                    ) {
                        sectionContent(toggleState)
                    }
                }
            }
        } else {
            Column(
                modifier = Modifier
                    .verticalScroll(defaultState)
                    .background(CupertinoTheme.colorScheme.systemGroupedBackground)
                    .fillMaxSize()
                    .padding(pv)
            ) {

                SectionStyle.values().forEach { style ->
                    CupertinoSection(
                        style = style,
                        title = {
                            Title(style)
                        },
                        caption = {
                            Caption()
                        }
                    ) {
                        sectionContent(toggleState)
                    }
                }
            }
        }
    }
}

@Composable
private fun Title(style: SectionStyle){
    CupertinoText(
        text = "${style.name} section".sectionTitle(),
    )
}

@Composable
private fun Caption() {
    CupertinoText(
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed luctus felis sed maximus accumsan."
    )
}

private fun SectionScope.sectionContent(
    toggle: MutableState<Boolean>
){
    item {
        CupertinoText(
            text = "Simple text",
            modifier = Modifier.padding(it)
        )
    }
    label(
        onClick = {}
    ) {
        CupertinoText("Clickable label")
    }
    switch(
        checked = toggle.value,
        onCheckedChange = {
            toggle.value = it
        }
    ) {
        CupertinoText("Toggle")
    }
}
