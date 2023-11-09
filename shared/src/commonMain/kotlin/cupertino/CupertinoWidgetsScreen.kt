@file:OptIn(ExperimentalCupertinoApi::class)
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

package cupertino

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.IosShare
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhoneIphone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material.icons.outlined.IosShare
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTheme
import io.github.alexzhirkevich.cupertino.adaptive.Theme
import io.github.alexzhirkevich.cupertino.CupertinoActionSheet
import io.github.alexzhirkevich.cupertino.CupertinoActionSheetNative
import io.github.alexzhirkevich.cupertino.CupertinoActivityIndicator
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialog
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialogNative
import io.github.alexzhirkevich.cupertino.CupertinoButton
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults
import io.github.alexzhirkevich.cupertino.CupertinoButtonSize
import io.github.alexzhirkevich.cupertino.CupertinoDatePicker
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.CupertinoDateTimePicker
import io.github.alexzhirkevich.cupertino.CupertinoDateTimePickerState
import io.github.alexzhirkevich.cupertino.CupertinoDropdownMenu
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoIconButton
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBar
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBarItem
import io.github.alexzhirkevich.cupertino.CupertinoPicker
import io.github.alexzhirkevich.cupertino.CupertinoPickerSheet
import io.github.alexzhirkevich.cupertino.CupertinoPickerState
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoSearchTextField
import io.github.alexzhirkevich.cupertino.CupertinoSearchTextFieldDefaults
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControl
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControlTab
import io.github.alexzhirkevich.cupertino.CupertinoSlider
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTimePicker
import io.github.alexzhirkevich.cupertino.CupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.cancel
import io.github.alexzhirkevich.cupertino.default
import io.github.alexzhirkevich.cupertino.destructive
import io.github.alexzhirkevich.cupertino.isNavigationBarTransparent
import io.github.alexzhirkevich.cupertino.isTopBarTransparent
import io.github.alexzhirkevich.cupertino.rememberCupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoDateTimePickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoPickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoSearchTextFieldState
import io.github.alexzhirkevich.cupertino.rememberCupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.section.CupertinoLabelIcon
import io.github.alexzhirkevich.cupertino.section.SectionScope
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.section.section
import io.github.alexzhirkevich.cupertino.section.sectionContainerBackground
import io.github.alexzhirkevich.cupertino.section.sectionTitle
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.SystemBlue
import io.github.alexzhirkevich.cupertino.theme.SystemGreen
import io.github.alexzhirkevich.cupertino.theme.SystemIndigo
import io.github.alexzhirkevich.cupertino.theme.SystemOrange
import io.github.alexzhirkevich.cupertino.theme.SystemPurple
import io.github.alexzhirkevich.cupertino.theme.SystemRed
import io.github.alexzhirkevich.cupertino.theme.systemBlue
import io.github.alexzhirkevich.cupertino.theme.systemGreen
import io.github.alexzhirkevich.cupertino.theme.systemIndigo
import io.github.alexzhirkevich.cupertino.theme.systemOrange
import io.github.alexzhirkevich.cupertino.theme.systemPurple
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime


@Composable
fun CupertinoWidgetsScreen(
    component: CupertinoWidgetsComponent
) {

    val lazyListState = rememberLazyListState()

    CupertinoScaffold(
        topBar = {
            CupertinoTopAppBar(
                isTransparent = lazyListState.isTopBarTransparent(
                    CupertinoSearchTextFieldDefaults.PaddingValues.calculateTopPadding()
                ),
                navigationIcon = {
                    CupertinoButton(
                        onClick = {},
                        colors = CupertinoButtonDefaults.plainButtonColors()
                    ) {
                        CupertinoIcon(
                            imageVector = Icons.Outlined.ArrowBackIosNew,
                            contentDescription = null
                        )
                        CupertinoText("Back")
                    }
                },
                actions = {
                    CupertinoIconButton(
                        onClick = {}
                    ) {
                        CupertinoIcon(
                            imageVector = Icons.Outlined.IosShare,
                            contentDescription = null
                        )
                    }
                },
                title = {
                    CupertinoText("Compose Cupertino")
                }
            )
        },
        bottomBar = {

            var tab by remember {
                mutableStateOf(0)
            }
            CupertinoNavigationBar(
                isTransparent = lazyListState.isNavigationBarTransparent,
            ) {
                CupertinoNavigationBarItem(
                    selected = tab == 0,
                    onClick = { tab = 0 },
                    icon = {
                        CupertinoIcon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null
                        )
                    },
                    label = {
                        CupertinoText("Profile")
                    }
                )
                CupertinoNavigationBarItem(
                    selected = tab == 1,
                    onClick = { tab = 1 },
                    icon = {
                        CupertinoIcon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = null
                        )
                    },
                    label = {
                        CupertinoText("Settings")
                    }
                )
            }
        }
    ) {

        val toggleState = remember {
            mutableStateOf(false)
        }

        val pickerState = rememberCupertinoPickerState()
        val timePickerState = rememberCupertinoTimePickerState()
        val datePickerState = rememberCupertinoDatePickerState()
        val dateTimePickerState = rememberCupertinoDateTimePickerState()

        val pickerValues = remember {
            listOf(
                "January", "February",
                "March", "April",
                "May", "June", "July", "August", "Semptember",
                "October", "November", "December"
            )
        }

        var selectedPickerTab by remember {
            mutableStateOf(0)
        }

        val searchState = rememberCupertinoSearchTextFieldState(
            scrollableState = lazyListState,
            blockScrollWhenFocusedAndEmpty = true
        )

        LazyColumn(
            state = lazyListState,
            contentPadding = it,
            modifier = Modifier
                .widthIn(max = 500.dp)
                .fillMaxSize()
                .sectionContainerBackground()
                .nestedScroll(searchState.nestedScrollConnection)
        ) {

//                item {
//                    Row(
//                        modifier = Modifier.padding(horizontal = 12.dp),
//                        verticalAlignment = Alignment.CenterVertically,
//                        horizontalArrangement = Arrangement.spacedBy(12.dp)
//                    ) {
//                        AdaptiveSwitch(
//                            checked = target == Theme.Cupertino,
//                            onCheckedChange = {
//                                target = if (it) Theme.Cupertino else Theme.Material3
//                            }
//                        )
//                        Text("Theme")
//                    }
//                }

            item {
                var value by remember {
                    mutableStateOf("")
                }
                CupertinoSearchTextField(
                    value = value,
                    state = searchState,
                    onValueChange = {
                        value = it
                    }
                )
            }

            section(
                title = {
                    CupertinoText(
                        text = "Buttons".sectionTitle(),
                        modifier = Modifier.padding(it)
                    )
                }
            ) {
                buttons(onColorsChanged = component::onAccentColorChanged)
                switchAndProgressBar()
            }
//
            section(
                title = {
                    CupertinoText(
                        modifier = Modifier.padding(it),
                        text = "Dialogs".sectionTitle(),
                    )
                },
                caption = {
                    CupertinoText(
                        text = "Native dialogs will use UIAlertController on iOS and Compose Cupertino analogs on other platforms",
                        modifier = Modifier.padding(it)
                    )
                }
            ) {
                dialogs()
                sheets()
                dropdown()
            }

            item {
                CupertinoSegmentedControl(
                    selectedTabIndex = selectedPickerTab,
                ) {
                    val tabs = listOf(
                        "Picker",
                        "Time",
                        "Date",
                        "Date & Time"
                    )

                    tabs.forEachIndexed { index, s ->
                        CupertinoSegmentedControlTab(
                            isSelected = index == selectedPickerTab,
                            onClick = {
                                selectedPickerTab = index
                            }
                        ) {
                            CupertinoText(s)
                        }
                    }
                }
            }

            when (selectedPickerTab) {
                0 -> picker(pickerValues, pickerState)
                1 -> timePicker(timePickerState)
                2 -> datePicker(datePickerState)
                3 -> dateTimePicker(dateTimePickerState)
            }

            sections(toggleState, onNavigateToAdaptive = component::onNavigateToAdaptive)
        }
    }
}

fun LazyListScope.picker(
    pickerValues : List<String>, pickerState : CupertinoPickerState
){
    section(
        title = {
            CupertinoText(
                modifier = Modifier.padding(it),
                text = "Wheel Pickers".sectionTitle()
            )
        },
        caption = {
            CupertinoText(
                modifier = Modifier.padding(it),
                text = "Selected: ${pickerValues[pickerState.selectedItemIndex]}"
            )
        }
    ) {

        item {

            Column {
                CupertinoPicker(
                    modifier = Modifier.fillMaxWidth(),
                    state = pickerState,
                    items = pickerValues,
                    containerColor = CupertinoTheme.colorScheme.secondarySystemGroupedBackground
                ) {
                    CupertinoText(it)
                }
            }
        }
    }
}

fun LazyListScope.timePicker(
    state : CupertinoTimePickerState
){
    section(
        title = {
            CupertinoText(
                text = "Compose Time Picker".sectionTitle(),
                modifier = Modifier.padding(it)
            )
        },
        caption = {
            Text(
                modifier = Modifier.padding(it),
                text = "${state.hour} : ${state.minute}"
            )
        }
    ) {
        item {
            CupertinoTimePicker(
                modifier = Modifier.fillMaxWidth(),
                state = state
            )
        }
    }
}

fun LazyListScope.datePicker(
    state: CupertinoDatePickerState
){
    section(
        title = {
            CupertinoText(
                text = "Compose Date Picker".sectionTitle(),
                modifier = Modifier.padding(it)
            )
        },
        caption = {
            Text(
                modifier = Modifier.padding(it),
                text = Instant
                    .fromEpochMilliseconds(state.selectedDateMillis)
                    .toLocalDateTime(TimeZone.UTC)
                    .toString()
            )
        }
    ) {
        item {

            CupertinoDatePicker(
                modifier = Modifier.fillMaxWidth(),
                state = state
            )
        }
    }
}


@OptIn(ExperimentalCupertinoApi::class)
fun LazyListScope.dateTimePicker(
    state : CupertinoDateTimePickerState
){
    section(
        title = {
            CupertinoText(
                text = "Compose Date Time Picker".sectionTitle(),
                modifier = Modifier.padding(it)
            )
        },
        caption = {
            Text(
                modifier = Modifier.padding(it),
                text = Instant
                    .fromEpochMilliseconds(state.selectedDateTimeMillis)
                    .toLocalDateTime(TimeZone.UTC)
                    .toString()
            )
        }
    ) {
        item {
            CupertinoDateTimePicker(
                modifier = Modifier.fillMaxWidth(),
                state = state
            )
        }
    }
}



private fun SectionScope.switchAndProgressBar() {
    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            var active1 by remember {
                mutableStateOf(true)
            }

            var active2 by remember {
                mutableStateOf(false)
            }
            CupertinoSwitch(
                checked = active1,
                onCheckedChange = {
                    active1 = it
                }
            )
            CupertinoSwitch(
                checked = active2,
                onCheckedChange = {
                    active2 = it
                }
            )
            CupertinoSwitch(
                checked = true,
                enabled = false,
                onCheckedChange = {}
            )
            CupertinoSwitch(
                checked = false,
                enabled = false,
                onCheckedChange = {}
            )

            CupertinoActivityIndicator()
        }
    }

    item {
        Box(
            modifier = Modifier.padding(it),
        ) {
            var b by remember {
                mutableStateOf(.5f)
            }
            CupertinoSlider(
                value = b,
                onValueChange = {
                    b = it
                }
            )
        }
    }

//    item {
//        Box(
//            modifier = Modifier.padding(it),
//        ) {
//            var b by remember {
//                mutableStateOf(.5f)
//            }
//            CupertinoSlider(
//                value = b,
//                onValueChange = {
//                    b = it
//                },
//                steps = 5
//            )
//        }
//    }
//    item {
//        Box(
//            modifier = Modifier.padding(it),
//        ) {
//            var b by remember {
//                mutableStateOf(.25f..0.75f)
//            }
//            CupertinoRangeSlider(
//                value = b,
//                onValueChange = {
//                    b = it
//                },
//            )
//        }
//    }
//    item {
//        Box(
//            modifier = Modifier.padding(it),
//        ) {
//            var b by remember {
//                mutableStateOf(.25f..0.75f)
//            }
//            CupertinoRangeSlider(
//                value = b,
//                onValueChange = {
//                    b = it
//                },
//                steps = 5
//            )
//        }
//    }
}
private fun SectionScope.buttons(
    onColorsChanged : (light : Color, dark : Color) -> Unit
) {


    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoIconButton(
                onClick = {
                    onColorsChanged(
                        CupertinoColors.systemBlue(false),
                        CupertinoColors.systemBlue(true)
                    )
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.SystemBlue
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    onColorsChanged(
                        CupertinoColors.systemGreen(false),
                        CupertinoColors.systemGreen(true)
                    )
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.SystemGreen
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    onColorsChanged(
                        CupertinoColors.systemPurple(false),
                        CupertinoColors.systemPurple(true)
                    )
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.SystemPurple
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }

            CupertinoIconButton(
                onClick = {
                    onColorsChanged(
                        CupertinoColors.systemOrange(false),
                        CupertinoColors.systemOrange(true)
                    )
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.SystemOrange
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    onColorsChanged(
                        CupertinoColors.systemIndigo(false),
                        CupertinoColors.systemIndigo(true)
                    )
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.SystemIndigo
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
        }
    }


    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoIconButton(
                onClick = {},
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.IosShare,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {},
                colors = CupertinoButtonDefaults.filledButtonColors()
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {},
                colors = CupertinoButtonDefaults.grayButtonColors()
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {},
                enabled = false,
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }


        }
    }

    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.plainButtonColors(),
                onClick = {}
            ) {
                CupertinoText("Plain Button")
            }
            CupertinoButton(
                colors = CupertinoButtonDefaults.plainButtonColors(),
                onClick = {},
                enabled = false
            ) {
                CupertinoText("Disabled Plain")
            }
        }
    }

    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.filledButtonColors(),
                onClick = {}
            ) {
                CupertinoText("Filled")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.filledButtonColors(),
                onClick = {},
                enabled = false
            ) {
                CupertinoText("Filled Disabled")
            }
        }
    }

    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.grayButtonColors(),
                onClick = {}
            ) {
                CupertinoText("Gray")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.grayButtonColors(),
                onClick = {},
                enabled = false
            ) {
                CupertinoText("Gray Disabled")
            }
        }
    }


    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.tintedButtonColors(),
                onClick = {}
            ) {
                CupertinoText("Tinted")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.tintedButtonColors(),
                onClick = {},
                enabled = false
            ) {
                CupertinoText("Tinted Disabled")
            }
        }
    }


    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.filledButtonColors(),
                size = CupertinoButtonSize.Small,
                onClick = {}
            ) {
                CupertinoText("Small")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.filledButtonColors(),
                size = CupertinoButtonSize.Medium,
                onClick = {}
            ) {
                CupertinoText("Medium")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.filledButtonColors(),
                size = CupertinoButtonSize.Large,
                onClick = {}
            ) {
                CupertinoText("Large")
            }
        }
    }
}

private fun SectionScope.dialogs(){
    item {

        var alertVisible by remember {
            mutableStateOf(false)
        }
        var nativeAlertVisible by remember {
            mutableStateOf(false)
        }

        if (alertVisible) {
            CupertinoAlertDialog(
                onDismissRequest = {
                    alertVisible = false
                },
                title = {
                    CupertinoText("Alert Dialog")
                },
                message = {
                    CupertinoText("Alert dialog message")
                }
            ) {
                destructive(
                    onClick = {
                        alertVisible = false
                    }
                ) {
                    CupertinoText("Cancel")
                }
                default(
                    onClick = {
                        alertVisible = false
                    }
                ) {
                    CupertinoText("OK")
                }
            }
        }
        if (nativeAlertVisible) {
            CupertinoAlertDialogNative(
                onDismissRequest = {
                    nativeAlertVisible = false
                },
                title = "Alert Dialog",
                message = "Alert dialog message"
            ) {
                destructive(
                    onClick = {
                        nativeAlertVisible = false
                    },
                    title = "Cancel"
                )
                default(
                    onClick = {
                        nativeAlertVisible = false
                    },
                    title = "OK"
                )
            }
        }

        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.tintedButtonColors(),
                onClick = {
                    alertVisible = true
                }
            ) {
                CupertinoText("Alert")
            }
            CupertinoButton(
                colors = CupertinoButtonDefaults.tintedButtonColors(),
                onClick = {
                    nativeAlertVisible = true
                }
            ) {
                CupertinoText("Native Alert")
            }
        }
    }
}

private fun SectionScope.sheets(){
    item {

        var sheetVisible by remember {
            mutableStateOf(false)
        }
        var nativeSheetVisible by remember {
            mutableStateOf(false)
        }

        if (sheetVisible) {
            CupertinoActionSheet(
                onDismissRequest = {
                    sheetVisible = false
                },
                title = {
                    CupertinoText("Action Sheet")
                },
                message = {
                    CupertinoText("This is a message of the action sheet")
                },
            ) {
                default(
                    onClick = {
                        sheetVisible = false
                    }
                ) {
                    CupertinoText("OK")
                }
                destructive(
                    onClick = {
                        sheetVisible = false
                    }
                ) {
                    CupertinoText("Delete")
                }

                cancel(
                    onClick = {
                        sheetVisible = false
                    }
                ) {
                    CupertinoText("Cancel")
                }
            }
        }
        if (nativeSheetVisible) {
            CupertinoActionSheetNative(
                onDismissRequest = {
                    nativeSheetVisible = false
                },
                title = "Action Sheet",
                message = "This is a message of the action sheet"
            ) {
                default(
                    onClick = {
                        nativeSheetVisible = false
                    },
                    title = "OK"
                )
                destructive(
                    onClick = {
                        nativeSheetVisible = false
                    },
                    title = "Delete"
                )

                cancel(
                    onClick = {
                        nativeSheetVisible = false
                    },
                    title = "Cancel"
                )
            }
        }

        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.tintedButtonColors(),
                onClick = {
                    sheetVisible = true
                }
            ) {
                CupertinoText("Action Sheet")
            }
            CupertinoButton(
                colors = CupertinoButtonDefaults.tintedButtonColors(),
                onClick = {
                    nativeSheetVisible = true
                }
            ) {
                CupertinoText("Native Action Sheet")
            }
        }
    }
}


private fun SectionScope.dropdown(){


    item {

        var dropdownVisible by remember {
            mutableStateOf(false)
        }

        var pickerSheetVisible by remember {
            mutableStateOf(false)
        }
        if (pickerSheetVisible) {
            CupertinoPickerSheet(
                onDismissRequest = {
                    pickerSheetVisible = false
                },
                title = {
                    CupertinoText("Cupertino Picker Sheet")
                },
                message = {
                    CupertinoText("Pickers are the most used case for such sheets but you can place below any content you want")
                },
                buttons = {
                    default(
                        onClick = {
                            pickerSheetVisible = false
                        },
                    ){
                        CupertinoText("Confirm")
                    }
                    cancel(
                        onClick = {
                            pickerSheetVisible = false
                        },
                    ){
                        CupertinoText("Cancel")
                    }
                }
            ){
                CupertinoDateTimePicker(
                    rememberCupertinoDateTimePickerState()
                )
            }
        }

        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            CupertinoButton(
                colors = CupertinoButtonDefaults.tintedButtonColors(),
                onClick = {
                    pickerSheetVisible = true
                }
            ) {
                CupertinoText("Picker Sheet")
            }

            CupertinoButton(
                onClick = {
                    dropdownVisible = !dropdownVisible
                }
            ) {
                CupertinoText("Dropdown")
            }

            CupertinoDropdownMenu(
                expanded = dropdownVisible,
                onDismissRequest = {
                    dropdownVisible = false
                },
                title = {
                    CupertinoText(
                        modifier = Modifier.padding(it),
                        text = "Menu"
                    )
                }
            ) {
                button(
                    onClick = {
                        dropdownVisible = false
                    },
                    icon = {
                        CupertinoIcon(
                            imageVector = Icons.Default.IosShare,
                            contentDescription = null
                        )
                    }
                ){
                    CupertinoText("Share")
                }
                button(
                    onClick = {
                        dropdownVisible = false
                    },
                    icon = {
                        CupertinoIcon(
                            imageVector = Icons.Default.BookmarkBorder,
                            contentDescription = null
                        )
                    }
                ){
                    CupertinoText("Add to Favorites")
                }
                divider()
                button(
                    onClick = {
                        dropdownVisible = false

                    },
                    contentColor = { CupertinoColors.SystemRed },
                    icon = {
                        CupertinoIcon(
                            imageVector = Icons.Default.DeleteOutline,
                            contentDescription = null
                        )
                    }
                ){
                    CupertinoText("Delete")
                }
            }
        }
    }
}

private fun LazyListScope.sections(
    toggle : MutableState<Boolean>,
    onNavigateToAdaptive : () -> Unit
){

    section(
        style = SectionStyle.InsetGrouped,
        title = {
            CupertinoText(
                modifier = Modifier.padding(it),
                text = "Labels with icons".sectionTitle()
            )
        },
        caption = {
            CupertinoText(
                text = "Clickable labels with icons and adjusted separator padding",
                modifier = Modifier.padding(it)
            )
        }
    ){
        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = Icons.Default.PhoneIphone,
                    containerColor = CupertinoColors.SystemBlue
                )
            },
            caption = {
                Text("One")
            },
            onClick = onNavigateToAdaptive
        ) {
            CupertinoText("Adaptive Widgets")
        }
        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    containerColor = CupertinoColors.SystemRed
                )
            },
            caption = {
                Text("Two")
            },
            onClick = {}
        ) {
            CupertinoText("Clickable label")
        }
        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = Icons.Default.Event,
                    contentDescription = null,
                    containerColor = CupertinoColors.SystemIndigo
                )
            },
            caption = {
                Text("Three")
            },
            onClick = {}
        ) {
            CupertinoText("Clickable label")
        }
    }

    SectionStyle.values().forEach { style ->

        section(

            style = style,
            title = {
                CupertinoText(
                    modifier = Modifier.padding(it),
                    text = "Section ${style.name}".sectionTitle(),
                )
            },
            caption = {
                CupertinoText(
                    modifier = Modifier.padding(it),
                    text = "Sections can be used as a separate widget or as a part of a lazy list where each row is a separate lazy list item"
                )
            }
        ) {
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
            toggle(
                checked = toggle.value,
                onCheckedChange = {
                    toggle.value = it
                }
            ) {
                CupertinoText("Toggle")
            }
        }
    }
}