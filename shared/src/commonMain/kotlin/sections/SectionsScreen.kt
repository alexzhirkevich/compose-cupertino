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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.CupertinoMenuDivider
import io.github.alexzhirkevich.cupertino.CupertinoMenuPickerAction
import io.github.alexzhirkevich.cupertino.CupertinoNavigateBackButton
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControl
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControlTab
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.isTopBarTransparent
import io.github.alexzhirkevich.cupertino.rememberCupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.section.CupertinoSection
import io.github.alexzhirkevich.cupertino.section.SectionScope
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.section.datePicker
import io.github.alexzhirkevich.cupertino.section.label
import io.github.alexzhirkevich.cupertino.section.dropdownMenu
import io.github.alexzhirkevich.cupertino.section.rememberSectionState
import io.github.alexzhirkevich.cupertino.section.section
import io.github.alexzhirkevich.cupertino.section.sectionTitle
import io.github.alexzhirkevich.cupertino.section.switch
import io.github.alexzhirkevich.cupertino.section.textField
import io.github.alexzhirkevich.cupertino.section.timePicker
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


@OptIn(ExperimentalCupertinoApi::class, ExperimentalFoundationApi::class,
    ExperimentalStdlibApi::class
)
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

    val datePickerState = rememberCupertinoDatePickerState()
    val timePickerState = rememberCupertinoTimePickerState()

    var datePickerExpanded by remember {
        mutableStateOf<SectionStyle?>(null)
    }
    var timePickerExpanded by remember {
        mutableStateOf<SectionStyle?>(null)
    }

    var pickerExpanded by remember {
        mutableStateOf<SectionStyle?>(null)
    }

    val pickedIndex = remember {
        mutableStateOf(0)
    }

    val textFieldValue = remember {
        mutableStateOf("")
    }

    val lazyState = rememberLazyListState()

    val defaultState = rememberScrollState()

    val currentState = if (isLazy)
        lazyState
    else defaultState

    val sectionState = rememberSectionState()

    LaunchedEffect(isLazy) {
        pagerState.animateScrollToPage(if (isLazy) 0 else 1)
    }

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
                        state = sectionState,
                        style = style,
                        title = {
                            Title(style)
                        },
                        caption = {
                            Caption()
                        }
                    ) {
                        sectionContent(
                            toggle = toggleState,
                            datePickerState = datePickerState,
                            datePickerExpanded = datePickerExpanded == style,
                            onDatePickerExpanded = { datePickerExpanded = if (it) style else null },
                            timePickerState = timePickerState,
                            timePickerExpanded = timePickerExpanded == style,
                            onTimePickerExpanded =  {
                                timePickerExpanded = if (it) style else null
                            },
                            pickedIndex = pickedIndex,
                            pickerExpanded = pickerExpanded == style,
                            onpickerExpanded = {
                                pickerExpanded = if (it) style else null
                            },
                            textFieldValue = textFieldValue
                        )
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
                        state = sectionState,
                        style = style,
                        title = {
                            Title(style)
                        },
                        caption = {
                            Caption()
                        }
                    ) {
                        sectionContent(
                            toggle = toggleState,
                            datePickerState = datePickerState,
                            datePickerExpanded = datePickerExpanded == style,
                            onDatePickerExpanded = { datePickerExpanded = if (it) style else null },
                            timePickerState = timePickerState,
                            timePickerExpanded = timePickerExpanded == style,
                            onTimePickerExpanded =  {
                                timePickerExpanded = if (it) style else null
                            },
                            pickedIndex = pickedIndex,
                            pickerExpanded = pickerExpanded == style,
                            onpickerExpanded = {
                                pickerExpanded = if (it) style else null
                            },
                            textFieldValue = textFieldValue
                        )
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

@OptIn(ExperimentalCupertinoApi::class)
private fun SectionScope.sectionContent(
    toggle: MutableState<Boolean>,
    datePickerState: CupertinoDatePickerState,
    datePickerExpanded : Boolean,
    onDatePickerExpanded : (Boolean) -> Unit,
    timePickerState: CupertinoTimePickerState,
    timePickerExpanded : Boolean,
    onTimePickerExpanded : (Boolean) -> Unit,
    pickerExpanded : Boolean,
    pickedIndex : MutableState<Int>,
    onpickerExpanded: (Boolean) -> Unit,
    textFieldValue : MutableState<String>
){
    item {
        CupertinoText(
            text = "Simple text",
            modifier = Modifier.padding(it)
        )
    }

    textField(
        value = textFieldValue.value,
        onValueChange = {textFieldValue.value = it},
        placeholder = {
            Text("Text field")
        }
    )

    label(
        onClick = {}
    ) {
        CupertinoText("Clickable label")
    }
    datePicker(
        state = datePickerState,
        expanded  = datePickerExpanded,
        onExpandedChange = onDatePickerExpanded,
        title = {
            CupertinoText("Date Picker")
        }
    )
    timePicker(
        state = timePickerState,
        expanded  = timePickerExpanded,
        onExpandedChange = onTimePickerExpanded,
        title = {
            CupertinoText("Time Picker")
        }
    )

    dropdownMenu(
        expanded = pickerExpanded,
        onDismissRequest =  {
            onpickerExpanded(false)
        },
        onClick = {
            onpickerExpanded(true)
        },
        title =  {
            CupertinoText("Popup picker")
        },
        selectedLabel = {
            CupertinoText(if (pickedIndex.value == 0) "None" else "Item ${pickedIndex.value}")
        }
    ){
        CupertinoMenuPickerAction(
            isSelected = pickedIndex.value == 0,
            onClick = {
                pickedIndex.value = 0
                onpickerExpanded(false)
            }
        ) {
            Text("None")
        }
        CupertinoMenuDivider()

        repeat(7){
            CupertinoMenuPickerAction(
                isSelected = pickedIndex.value == it + 1,
                onClick = {
                    pickedIndex.value = it + 1
                    onpickerExpanded(false)
                }
            ){
                Text("Item $it")
            }
        }
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
