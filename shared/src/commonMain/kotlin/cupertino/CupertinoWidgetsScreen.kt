@file:OptIn(ExperimentalCupertinoApi::class, ExperimentalLayoutApi::class,
    ExperimentalStdlibApi::class
)
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

import IsIos
import RootComponent
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.Button
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoActionSheet
import io.github.alexzhirkevich.cupertino.CupertinoActionSheetNative
import io.github.alexzhirkevich.cupertino.CupertinoActivityIndicator
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialog
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialogNative
import io.github.alexzhirkevich.cupertino.CupertinoBottomSheetContent
import io.github.alexzhirkevich.cupertino.CupertinoBottomSheetScaffold
import io.github.alexzhirkevich.cupertino.CupertinoBottomSheetScaffoldDefaults
import io.github.alexzhirkevich.cupertino.CupertinoButton
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults
import io.github.alexzhirkevich.cupertino.CupertinoButtonSize
import io.github.alexzhirkevich.cupertino.CupertinoDatePicker
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerNative
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.CupertinoDateTimePicker
import io.github.alexzhirkevich.cupertino.CupertinoDateTimePickerNative
import io.github.alexzhirkevich.cupertino.CupertinoDateTimePickerState
import io.github.alexzhirkevich.cupertino.CupertinoDropdownMenu
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoIconButton
import io.github.alexzhirkevich.cupertino.CupertinoIconDefaults
import io.github.alexzhirkevich.cupertino.CupertinoMenuAction
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBar
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBarItem
import io.github.alexzhirkevich.cupertino.CupertinoPicker
import io.github.alexzhirkevich.cupertino.CupertinoPickerState
import io.github.alexzhirkevich.cupertino.CupertinoSearchTextField
import io.github.alexzhirkevich.cupertino.CupertinoSearchTextFieldDefaults
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControl
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControlTab
import io.github.alexzhirkevich.cupertino.CupertinoSheetValue
import io.github.alexzhirkevich.cupertino.CupertinoSlider
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTimePicker
import io.github.alexzhirkevich.cupertino.CupertinoTimePickerNative
import io.github.alexzhirkevich.cupertino.CupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.CupertinoMenuSection
import io.github.alexzhirkevich.cupertino.CupertinoBorderedTextField
import io.github.alexzhirkevich.cupertino.CupertinoBorderedTextFieldDefaults
import io.github.alexzhirkevich.cupertino.CupertinoBottomSheet
import io.github.alexzhirkevich.cupertino.CupertinoBottomSheetScaffoldState
import io.github.alexzhirkevich.cupertino.CupertinoNavigationTitle
import io.github.alexzhirkevich.cupertino.CupertinoTextField
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.PresentationDetent
import io.github.alexzhirkevich.cupertino.PresentationStyle
import io.github.alexzhirkevich.cupertino.adaptive.icons.AdaptiveIcons
import io.github.alexzhirkevich.cupertino.adaptive.icons.Add
import io.github.alexzhirkevich.cupertino.adaptive.icons.Settings
import io.github.alexzhirkevich.cupertino.adaptive.icons.Share
import io.github.alexzhirkevich.cupertino.cancel
import io.github.alexzhirkevich.cupertino.default
import io.github.alexzhirkevich.cupertino.destructive
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.*
import io.github.alexzhirkevich.cupertino.icons.filled.*
import io.github.alexzhirkevich.cupertino.isNavigationBarTransparent
import io.github.alexzhirkevich.cupertino.isTopBarTransparent
import io.github.alexzhirkevich.cupertino.rememberCupertinoBottomSheetScaffoldState
import io.github.alexzhirkevich.cupertino.rememberCupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoDateTimePickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoPickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoSearchTextFieldState
import io.github.alexzhirkevich.cupertino.rememberCupertinoSheetState
import io.github.alexzhirkevich.cupertino.rememberCupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.section.CupertinoLabelIcon
import io.github.alexzhirkevich.cupertino.section.ProvideSectionStyle
import io.github.alexzhirkevich.cupertino.section.SectionScope
import io.github.alexzhirkevich.cupertino.section.SectionState
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.section.label
import io.github.alexzhirkevich.cupertino.section.rememberSectionState
import io.github.alexzhirkevich.cupertino.section.section
import io.github.alexzhirkevich.cupertino.section.sectionContainerBackground
import io.github.alexzhirkevich.cupertino.section.sectionTitle
import io.github.alexzhirkevich.cupertino.section.switch
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.SystemBlue
import io.github.alexzhirkevich.cupertino.theme.SystemCyan
import io.github.alexzhirkevich.cupertino.theme.SystemGreen
import io.github.alexzhirkevich.cupertino.theme.SystemIndigo
import io.github.alexzhirkevich.cupertino.theme.SystemOrange
import io.github.alexzhirkevich.cupertino.theme.SystemPurple
import io.github.alexzhirkevich.cupertino.theme.SystemRed
import io.github.alexzhirkevich.cupertino.theme.systemBlue
import io.github.alexzhirkevich.cupertino.theme.systemGreen
import io.github.alexzhirkevich.cupertino.theme.systemOrange
import io.github.alexzhirkevich.cupertino.theme.systemPurple
import io.github.alexzhirkevich.cupertino.theme.systemRed
import kotlinx.coroutines.launch
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.reflect.KClass

private enum class PickerTab {
    Picker, Time, Date, DateTime
}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
fun CupertinoWidgetsScreen(
    component: CupertinoWidgetsComponent
) {

    val lazyListState = rememberLazyListState()
    val sheetListState = rememberLazyListState()

    val scaffoldState = rememberCupertinoBottomSheetScaffoldState(
        rememberCupertinoSheetState(
            presentationStyle = PresentationStyle.Modal(
                detents = setOf(
                    PresentationDetent.Large,
                    PresentationDetent.Fraction(.6f),
                ),
            )
//            presentationStyle = PresentationStyle.Fullscreen
        )
    )

    val state2 = rememberCupertinoSheetState()

    val sheetSectionColor = CupertinoTheme.colorScheme.tertiarySystemBackground

    val focusManager = LocalFocusManager.current

    val nativePickers = remember {
        mutableStateOf(false)
    }

    LaunchedEffect(lazyListState.isScrollInProgress){
        if (lazyListState.isScrollInProgress){
            focusManager.clearFocus(force = true)
        }
    }

    LaunchedEffect(scaffoldState.bottomSheetState.targetValue){
        if (scaffoldState.bottomSheetState.targetValue == CupertinoSheetValue.Hidden){
            focusManager.clearFocus(force = true)
        }
    }

    CupertinoBottomSheet(
        sheetState = state2,
        sheetContent = {
            SheetSample(
                scaffoldState = scaffoldState,
                sheetListState = sheetListState,
                sheetSectionColor = sheetSectionColor
            )
        },
    ) {
        val scope = rememberCoroutineScope()
        CupertinoBottomSheetScaffold(
            colors = CupertinoBottomSheetScaffoldDefaults.colors(
                sheetContainerColor = CupertinoTheme.colorScheme
                    .secondarySystemBackground,
            ),
            sheetContent = {

                Box(Modifier.fillMaxSize()){
                    Button(onClick = {
                        scope.launch {
                            state2.show()
                        }
                    }, modifier = Modifier.align(Alignment.Center)){
                        Text("Sheet 2")
                    }
                }

            },
            scaffoldState = scaffoldState,
            topBar = {
                TopBarSample(
                    lazyListState = lazyListState,
                    nativePickers = nativePickers.value,
                    component = component
                )
            },
            bottomBar = {
                BottomBarSample(
                    lazyListState = lazyListState,
                    nativePickers = nativePickers.value
                )
            }
        ) { pv ->
            Body(
                paddingValues = pv,
                lazyListState = lazyListState,
                component = component,
                scaffoldState = scaffoldState,
                nativePickers = nativePickers
            )
        }
    }
}

@Composable
private fun Body(
    paddingValues: PaddingValues,
    lazyListState: LazyListState,
    component: CupertinoWidgetsComponent,
    scaffoldState: CupertinoBottomSheetScaffoldState,
    nativePickers : MutableState<Boolean>
) {

    val coroutineScope = rememberCoroutineScope()

    val pickerValues = remember {
        listOf(
            "January", "February",
            "March", "April",
            "May", "June", "July", "August", "Semptember",
            "October", "November", "December"
        )
    }

    val pickerState = rememberCupertinoPickerState()
    val timePickerState = rememberCupertinoTimePickerState()
    val datePickerState = rememberCupertinoDatePickerState()
    val dateTimePickerState = rememberCupertinoDateTimePickerState()

    var selectedPickerTab by remember {
        mutableStateOf(PickerTab.Picker)
    }

    val searchState = rememberCupertinoSearchTextFieldState(
        scrollableState = lazyListState,
        blockScrollWhenFocusedAndEmpty = true
    )

    val buttonsSectionState = rememberSectionState()
    val navSectionState = rememberSectionState()
    val popupsSectionState = rememberSectionState()
    val wheelPickersSectionState = rememberSectionState()

    ProvideSectionStyle(
        SectionStyle.Sidebar
    ) {
        LazyColumn(
            state = lazyListState,
            contentPadding = paddingValues + PaddingValues(top = 10.dp),
            modifier = Modifier
                .fillMaxSize()
                .sectionContainerBackground()
                .nestedScroll(searchState.nestedScrollConnection)
        ) {

            item {
                CupertinoNavigationTitle {
                    Text("Cupertino")
                }
            }
            item {
                var value by remember {
                    mutableStateOf("")
                }
                CupertinoSearchTextField(
                    value = value,
                    onValueChange = {
                        value = it
                    },
                    state = searchState,
                    paddingValues = CupertinoSearchTextFieldDefaults.PaddingValues +
                            PaddingValues(bottom = 12.dp)
                )
            }

            section {
                switch(
                    checked = component.isInvertLayoutDirection.value,
                    onCheckedChange = component::onInvertLayoutDirection
                ) {
                    Text("Toggle layout direction")
                }

                colorButtons(onColorsChanged = component::onAccentColorChanged)
            }

            labelsWithIcons(
                state = navSectionState,
                onSheetClicked = {
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.show()
                    }
                },
                onNavigate = component::onNavigate
            )

            section(
                state = buttonsSectionState,
                title = {
                    CupertinoText(
                        text = "Controls".sectionTitle(),
                    )
                }
            ) {
                buttons()
                switchAndProgressBar()
            }
//

            section(
                state = popupsSectionState,
                title = {
                    CupertinoText(
                        text = "Popups".sectionTitle(),
                    )
                },
                caption = {
                    CupertinoText(
                        text = "Native dialogs will use UIAlertController on iOS and Compose Cupertino analogs on other platforms",
                    )
                }
            ) {
                dialogs()
                sheets()
                dropdown()
            }

            section(
                state = wheelPickersSectionState,
                title = {
                    CupertinoText(
                        text = "Wheel Pickers".sectionTitle()
                    )
                },
                caption = {
                    CupertinoText(
                        text = when (selectedPickerTab) {
                            PickerTab.Picker ->
                                "Selected: ${
                                    pickerValues[pickerState.selectedItemIndex(
                                        pickerValues.size
                                    )]
                                }"

                            PickerTab.Time -> "${timePickerState.hour} : ${timePickerState.minute}"
                            PickerTab.Date -> remember {
                                derivedStateOf {
                                    Instant
                                        .fromEpochMilliseconds(datePickerState.selectedDateMillis)
                                        .toLocalDateTime(TimeZone.UTC)
                                        .toString()
                                }
                            }.value

                            PickerTab.DateTime -> remember {
                                derivedStateOf {
                                    Instant
                                        .fromEpochMilliseconds(dateTimePickerState.selectedDateTimeMillis)
                                        .toLocalDateTime(TimeZone.UTC)
                                        .toString()
                                }
                            }.value
                        }
                    )
                }
            ) {
                item {
                    CupertinoSegmentedControl(
                        selectedTabIndex = PickerTab.entries.indexOf(selectedPickerTab),
                    ) {
                        val tabs = PickerTab.entries

                        tabs.forEach { s ->
                            CupertinoSegmentedControlTab(
                                isSelected = s == selectedPickerTab,
                                onClick = {
                                    selectedPickerTab = s
                                }
                            ) {
                                CupertinoText(s.name)
                            }
                        }
                    }
                }

                switch(
                    checked = nativePickers.value,
                    onCheckedChange = {
                        nativePickers.value = it
                    }
                ) {
                    Text("Native")
                }
                when (selectedPickerTab) {
                    PickerTab.Picker -> picker(pickerValues, pickerState)
                    PickerTab.Time -> timePicker(timePickerState, nativePickers.value)
                    PickerTab.Date -> datePicker(datePickerState, nativePickers.value)
                    PickerTab.DateTime -> dateTimePicker(dateTimePickerState, nativePickers.value)
                }

            }
            item {
                Spacer(Modifier.imePadding())
            }
        }
    }
}

@Composable
private fun TopBarSample(
    lazyListState : LazyListState,
    nativePickers : Boolean,
    component : CupertinoWidgetsComponent
) {
    val density = LocalDensity.current

    val isTransparent by remember(lazyListState, density) {
        derivedStateOf {
            // top bar is collapsing only on mobile
            if (IsIos) {

                val isFirst = lazyListState.firstVisibleItemIndex < 2

                val isSecondWithPadding = lazyListState.firstVisibleItemIndex == 2 &&
                        lazyListState.firstVisibleItemScrollOffset < density.run { 20.dp.toPx() }

                isFirst || isSecondWithPadding
            } else {
                !lazyListState.canScrollBackward
            }

        }
    }

    CupertinoTopAppBar(
        // Currently UIKitView doesn't work inside a container with translucent app bars
        isTranslucent = isTransparent || !(IsIos && nativePickers),
        isTransparent = isTransparent,
        actions = {
            CupertinoIconButton(
                onClick = component::onThemeClicked
            ) {
                AnimatedContent(component.isDark.value) {
                    if (it) {
                        CupertinoIcon(
                            imageVector = CupertinoIcons.Default.SunMax,
                            contentDescription = null
                        )
                    } else {
                        CupertinoIcon(
                            imageVector = CupertinoIcons.Default.MoonStars,
                            contentDescription = null
                        )
                    }
                }
            }
        },
        title = {
            CupertinoText("Cupertino")
        }
    )
}

@Composable
private fun BottomBarSample(
    lazyListState : LazyListState,
    nativePickers: Boolean
) {
    var tab by remember {
        mutableStateOf(0)
    }

    val isTransparent = lazyListState.isNavigationBarTransparent

    CupertinoNavigationBar(
        // Currently UIKitView doesn't work inside a container with translucent app bars
        isTranslucent = isTransparent || !(IsIos && nativePickers),
        isTransparent = isTransparent,
    ) {
        CupertinoNavigationBarItem(
            selected = tab == 0,
            onClick = { tab = 0 },
            icon = {
                CupertinoIcon(
                    imageVector = CupertinoIcons.Filled.Person,
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
                    imageVector = CupertinoIcons.Filled.Gearshape,
                    contentDescription = null
                )
            },
            label = {
                CupertinoText("Settings")
            }
        )
    }
}

@Composable
private fun SheetSample(
    scaffoldState : CupertinoBottomSheetScaffoldState,
    sheetListState : LazyListState,
    sheetSectionColor : Color
) {

    val coroutineScope = rememberCoroutineScope()

    CupertinoBottomSheetContent(
        topBar = {
            CupertinoTopAppBar(
                title = {
                    CupertinoText("Bottom Sheet")
                },
                actions = {
                    CupertinoButton(
                        colors = CupertinoButtonDefaults.borderlessButtonColors(),
                        onClick = {
                            coroutineScope.launch {
                                scaffoldState.bottomSheetState.hide()
                            }
                        }
                    ){
                        CupertinoText("Done")
                    }
                },
                isTransparent = sheetListState.isTopBarTransparent
            )
        }
    ) { pv ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = sheetListState,
            contentPadding = pv ,
        ) {

            section(
                containerColor = Color.Transparent,
                color = sheetSectionColor
            ) {
                repeat(100) {
                    label(onClick = {}){
                        CupertinoText("Item $it")
                    }
                }
            }
            item {
                Spacer(Modifier.imePadding())
            }
        }
    }
}

@Composable
private operator fun PaddingValues.plus(other : PaddingValues) : PaddingValues{
    val layoutDirection = LocalLayoutDirection.current

    return PaddingValues(
        top = calculateTopPadding() + other.calculateTopPadding(),
        bottom = calculateBottomPadding() + other.calculateBottomPadding(),
        start = calculateStartPadding(layoutDirection) + other.calculateStartPadding(layoutDirection),
        end = calculateEndPadding(layoutDirection) + other.calculateEndPadding(layoutDirection)
    )
}

@OptIn(ExperimentalCupertinoApi::class)
fun SectionScope.picker(
    pickerValues: List<String>,
    pickerState: CupertinoPickerState
) {

    item {
        CupertinoPicker(
            state = pickerState,
            items = pickerValues,
            modifier = Modifier.fillMaxWidth(),
            containerColor = CupertinoTheme.colorScheme.secondarySystemGroupedBackground
        ) {
            CupertinoText(it)
        }
    }
}

fun SectionScope.timePicker(
    state : CupertinoTimePickerState, native : Boolean
) {
    item {
        if (native) {
            CupertinoTimePickerNative(
                modifier = Modifier.fillMaxWidth(),
                state = state
            )
        } else {
            CupertinoTimePicker(
                modifier = Modifier.fillMaxWidth(),
                state = state
            )
        }
    }
}

fun SectionScope.datePicker(
    state: CupertinoDatePickerState, native: Boolean
) {
    item {
        if (native) {
            CupertinoDatePickerNative(
                state = state,
                modifier = Modifier.fillMaxWidth(),
            )
        } else {
            CupertinoDatePicker(
                modifier = Modifier.fillMaxWidth(),
                state = state,
            )
        }
    }
}


@OptIn(ExperimentalCupertinoApi::class)
fun SectionScope.dateTimePicker(
    state : CupertinoDateTimePickerState, native: Boolean
) {

    item {
        if (native) {
            CupertinoDateTimePickerNative(
                state = state,
                modifier = Modifier.fillMaxWidth()
            )
        } else {
            CupertinoDateTimePicker(
                modifier = Modifier.fillMaxWidth(),
                state = state
            )
        }
    }
}



private fun SectionScope.switchAndProgressBar() {
    item { pv ->
        Row(
            modifier = Modifier.padding(pv),
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

    item { pv ->
        Row(
            modifier = Modifier.padding(pv),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            var b by remember {
                mutableStateOf(.5f)
            }
            CupertinoSlider(
                modifier = Modifier.weight(1f),
                value = b,
                onValueChange = {
                    b = it
                }
            )

            CupertinoActivityIndicator(
                progress = b
            )
//            Text(
//                text = b.toString().take(4),
//                modifier = Modifier.width(40.dp),
//                maxLines = 1
//            )
        }
    }

    item { pv ->
        Row(
            modifier = Modifier.padding(pv),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            var b by remember {
                mutableStateOf(.5f)
            }
            CupertinoSlider(
                modifier = Modifier.weight(1f),
                value = b,
                steps = 5,
                onValueChange = {
                    b = it
                }
            )

            Text(
                text = b.toString().take(4),
                modifier = Modifier.width(40.dp),
                maxLines = 1
            )
        }
    }

    item {
        var v by remember {
            mutableStateOf("")
        }

        CupertinoTextField(
            value = v,
            onValueChange = {
                v = it
            },
            placeholder = {
                CupertinoText("Text field...")
            },
            modifier = Modifier.padding(it)
        )
    }


    item {
        var v by remember {
            mutableStateOf("")
        }

        CupertinoBorderedTextField(
            modifier = Modifier.padding(it),
            value = v,
            onValueChange = {
                v = it
            },
            placeholder = {
                CupertinoText("Text field...")
            },
            contentAlignment = Alignment.Bottom,
            colors = CupertinoBorderedTextFieldDefaults.colors(
                focusedContainerColor = CupertinoTheme.colorScheme.systemBackground
            ),
            shape = CupertinoTheme.shapes.large,
            leadingIcon = {
                  CupertinoIcon(
                      modifier = Modifier.height(CupertinoIconDefaults.MediumSize),
                      imageVector = CupertinoIcons.Outlined.FaceSmiling,
                      contentDescription = null
                  )
            },
            trailingIcon = {
                CupertinoIcon(
                    modifier = Modifier.height(CupertinoIconDefaults.MediumSize),
                    imageVector = CupertinoIcons.Outlined.Paperclip,
                    contentDescription = null
                )
            },
        )
    }
}

private fun SectionScope.colorButtons(
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
                colors = CupertinoButtonDefaults.borderedButtonColors(
                    contentColor = CupertinoColors.SystemBlue
                )
            ) {
                CupertinoIcon(
                    imageVector = CupertinoIcons.Default.Paintpalette,
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
                colors = CupertinoButtonDefaults.borderedButtonColors(
                    contentColor = CupertinoColors.SystemGreen
                )
            ) {
                CupertinoIcon(
                    imageVector = CupertinoIcons.Default.Paintpalette,
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
                colors = CupertinoButtonDefaults.borderedButtonColors(
                    contentColor = CupertinoColors.SystemPurple
                )
            ) {
                CupertinoIcon(
                    imageVector = CupertinoIcons.Default.Paintpalette,
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
                colors = CupertinoButtonDefaults.borderedButtonColors(
                    contentColor = CupertinoColors.SystemOrange
                )
            ) {
                CupertinoIcon(
                    imageVector = CupertinoIcons.Default.Paintpalette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    onColorsChanged(
                        CupertinoColors.systemRed(false),
                        CupertinoColors.systemRed(true)
                    )
                },
                colors = CupertinoButtonDefaults.borderedButtonColors(
                    contentColor = CupertinoColors.SystemRed
                )
            ) {
                CupertinoIcon(
                    imageVector = CupertinoIcons.Default.Paintpalette,
                    contentDescription = null
                )
            }
        }
    }
}

private fun SectionScope.buttons() {

    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.borderlessButtonColors(),
                onClick = {}
            ) {
                CupertinoText("Plain")
            }
            CupertinoIconButton(
                onClick = {},
            ) {
                CupertinoIcon(
                    imageVector = AdaptiveIcons.Outlined.Share,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {},
                colors = CupertinoButtonDefaults.borderedButtonColors()
            ) {
                CupertinoIcon(
                    imageVector = AdaptiveIcons.Outlined.Add,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {},
                colors = CupertinoButtonDefaults.borderedGrayButtonColors()
            ) {
                CupertinoIcon(
                    imageVector = AdaptiveIcons.Outlined.Settings,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {},
                enabled = false,
            ) {
                CupertinoIcon(
                    imageVector = AdaptiveIcons.Outlined.Add,
                    contentDescription = null
                )
            }
        }
    }

    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedGrayButtonColors(),
                onClick = {},
                size = CupertinoButtonSize.Small
            ) {
                CupertinoText("Gray S")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedButtonColors(),
                onClick = {},
                size = CupertinoButtonSize.Regular
            ) {
                CupertinoText("Tinted M")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedProminentButtonColors(),
                onClick = {},
                size = CupertinoButtonSize.Large
            ) {
                CupertinoText("Filled L")
            }

        }
    }

    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.borderlessButtonColors(),
                onClick = {},
                enabled = false
            ) {
                CupertinoText("Disabled")
            }

            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedProminentButtonColors(),
                onClick = {},
                enabled = false
            ) {
                CupertinoText("Disabled")
            }
        }
    }

}

@OptIn(ExperimentalCupertinoApi::class)
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
                colors = CupertinoButtonDefaults.borderedButtonColors(),
                onClick = {
                    alertVisible = true
                }
            ) {
                CupertinoText("Alert")
            }
            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedButtonColors(),
                onClick = {
                    nativeAlertVisible = true
                }
            ) {
                CupertinoText("Native")
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

            CupertinoActionSheet(
                visible = sheetVisible,
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
            CupertinoActionSheetNative(
                visible = nativeSheetVisible,
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

        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedButtonColors(),
                onClick = {
                    sheetVisible = true
                }
            ) {
                CupertinoText("Action Sheet")
            }
            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedButtonColors(),
                onClick = {
                    nativeSheetVisible = true
                }
            ) {
                CupertinoText("Native")
            }
        }
    }
}


private fun SectionScope.dropdown() {


    item { pv ->

        var dropdownVisible by remember {
            mutableStateOf(false)
        }

        var pickerSheetVisible by remember {
            mutableStateOf(false)
        }
        CupertinoActionSheet(
            visible = pickerSheetVisible,
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
                ) {
                    CupertinoText("Confirm")
                }
                cancel(
                    onClick = {
                        pickerSheetVisible = false
                    },
                ) {
                    CupertinoText("Cancel")
                }
            },
            content = {
                CupertinoDatePicker(
                    state = rememberCupertinoDatePickerState(),
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        )


        Row(
            modifier = Modifier.padding(pv),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            CupertinoButton(
                colors = CupertinoButtonDefaults.borderedButtonColors(),
                onClick = {
                    pickerSheetVisible = true
                }
            ) {
                CupertinoText("Picker Sheet")
            }

            Spacer(Modifier.weight(1f))
            //Menu bar should be in the box with anchor to align correctly
            Box {
                CupertinoButton(
                    onClick = {
                        dropdownVisible = !dropdownVisible
                    }
                ) {
                    CupertinoText("Menu")
                }


                val red = CupertinoColors.SystemRed

                CupertinoDropdownMenu(
                    expanded = dropdownVisible,
                    onDismissRequest = {
                        dropdownVisible = false
                    }
                ) {
                    CupertinoMenuSection(
                        title = {
                            Text("Menu")
                        }
                    ) {
                        CupertinoMenuAction(
                            onClick = {
                                dropdownVisible = false
                            },
                            icon = {
                                CupertinoIcon(
                                    imageVector = CupertinoIcons.Default.SquareAndArrowUp,
                                    contentDescription = null
                                )
                            }
                        ) {
                            CupertinoText("Share")
                        }
                        CupertinoMenuAction(
                            enabled = false,
                            onClick = {
                                dropdownVisible = false
                            },
                            icon = {
                                CupertinoIcon(
                                    imageVector = CupertinoIcons.Default.Bookmark,
                                    contentDescription = null
                                )
                            }
                        ) {
                            CupertinoText("Add to Favorites")
                        }
                    }

                    CupertinoMenuAction(
                        onClick = {
                            dropdownVisible = false

                        },
                        contentColor = red,
                        icon = {
                            CupertinoIcon(
                                imageVector = CupertinoIcons.Default.Trash,
                                contentDescription = null
                            )
                        }
                    ) {
                        CupertinoText("Delete")
                    }
                }
            }
        }
    }
}

private fun LazyListScope.labelsWithIcons(
    state: SectionState,
    onSheetClicked : () -> Unit,
    onNavigate: (KClass<out RootComponent.Child>) -> Unit,
) {
    section(
        state = state,
        caption = {
            CupertinoText(
                text = "Clickable labels with icons and adjusted separator padding",
            )
        }
    ) {
        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = CupertinoIcons.Default.Heart,
                    contentDescription = null,
                    containerColor = CupertinoColors.SystemRed
                )
            },
            caption = {
                Text("One")
            },
            onClick = {
                onNavigate(RootComponent.Child.Icons::class)
            }
        ) {
            CupertinoText("SF Symbols")
        }

        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = CupertinoIcons.Default.SquareSplit1x2,
                    containerColor = CupertinoColors.SystemIndigo
                )
            },
            caption = {
                Text("Two")
            },
            onClick = {
                onNavigate(RootComponent.Child.Sections::class)
            }
        ) {
            CupertinoText("Sections")
        }


        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = CupertinoIcons.Default.Iphone,
                    containerColor = CupertinoColors.SystemBlue
                )
            },
            caption = {
                Text("Three")
            },
            onClick = {
                onNavigate(RootComponent.Child.Adaptive::class)
            }
        ) {
            CupertinoText("Adaptive Widgets")
        }

        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = CupertinoIcons.Default.RectangleStack,
                    contentDescription = null,
                    containerColor = CupertinoColors.SystemCyan
                )
            },
            caption = {
                Text("Four")
            },
            onClick = onSheetClicked
        ) {
            CupertinoText("Bottom Sheet")
        }
    }
}
