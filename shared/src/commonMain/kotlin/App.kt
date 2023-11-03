@file:OptIn(ExperimentalCupertinoApi::class)

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.adaptive.AdaptiveSwitch
import io.github.alexzhirkevich.adaptive.AdaptiveTheme
import io.github.alexzhirkevich.adaptive.Theme
import io.github.alexzhirkevich.cupertino.AlertActionStyle
import io.github.alexzhirkevich.cupertino.CupertinoActionSheet
import io.github.alexzhirkevich.cupertino.CupertinoActionSheetNative
import io.github.alexzhirkevich.cupertino.CupertinoActivityIndicator
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialog
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialogNative
import io.github.alexzhirkevich.cupertino.CupertinoButton
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults
import io.github.alexzhirkevich.cupertino.CupertinoButtonSize
import io.github.alexzhirkevich.cupertino.CupertinoDatePicker
import io.github.alexzhirkevich.cupertino.CupertinoDateTimePicker
import io.github.alexzhirkevich.cupertino.CupertinoDropdownMenu
import io.github.alexzhirkevich.cupertino.CupertinoIconButton
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBar
import io.github.alexzhirkevich.cupertino.CupertinoNavigationBarItem
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoPicker
import io.github.alexzhirkevich.cupertino.CupertinoPickerDefaults
import io.github.alexzhirkevich.cupertino.CupertinoPickerSheet
import io.github.alexzhirkevich.cupertino.CupertinoPickerState
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControl
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControlTab
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.section.CupertinoLabelIcon
import io.github.alexzhirkevich.cupertino.CupertinoSearchTextField
import io.github.alexzhirkevich.cupertino.CupertinoTimePicker
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.isNavigationBarTransparent
import io.github.alexzhirkevich.cupertino.isTopBarTransparent
import io.github.alexzhirkevich.cupertino.rememberCupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoDateTimePickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoPickerState
import io.github.alexzhirkevich.cupertino.rememberCupertinoTimePickerState
import io.github.alexzhirkevich.cupertino.section.SectionScope
import io.github.alexzhirkevich.cupertino.section.SectionStyle
import io.github.alexzhirkevich.cupertino.section.section
import io.github.alexzhirkevich.cupertino.section.sectionContainerBackground
import io.github.alexzhirkevich.cupertino.section.sectionTitle
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.darkColorScheme
import io.github.alexzhirkevich.cupertino.theme.lightColorScheme
import io.github.alexzhirkevich.cupertino.theme.systemBlue
import io.github.alexzhirkevich.cupertino.theme.systemGreen
import io.github.alexzhirkevich.cupertino.theme.systemIndigo
import io.github.alexzhirkevich.cupertino.theme.systemMint
import io.github.alexzhirkevich.cupertino.theme.systemOrange
import io.github.alexzhirkevich.cupertino.theme.systemPurple
import io.github.alexzhirkevich.cupertino.theme.systemRed
import kotlinx.coroutines.delay

//enum class Screen {
//    Main, Backdrop, Dialogs, LazySection
//}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
fun App() {

    val accentColor = remember {
        mutableStateOf(
            CupertinoColors.systemBlue(false) to
                    CupertinoColors.systemBlue(true)
        )
    }

    var target by remember {
        mutableStateOf(Theme.Cupertino)
    }

//    AdaptiveTheme(
//        target = target,
//        primaryColor = if (isSystemInDarkTheme())
//            accentColor.value.second else accentColor.value.first,
//        useSystemColorTheme = false
//    ){

    CupertinoTheme(
        colorScheme = if (isSystemInDarkTheme())
            darkColorScheme(accentColor.value.second) else lightColorScheme(accentColor.value.first)
    ) {

        val lazyListState = rememberLazyListState()


        CupertinoScaffold(
            topBar = {
                CupertinoTopAppBar(
                    isTransparent = lazyListState.isTopBarTransparent(10.dp),
                    navigationIcon = {
                        CupertinoIconButton(
                            onClick = {}
                        ) {
                            CupertinoIcon(
                                imageVector = Icons.Outlined.ArrowBackIosNew,
                                contentDescription = null
                            )
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
                        CupertinoText("Title")
                    }
                )
            },
            bottomBar = {
                CupertinoNavigationBar(
                    isTransparent = lazyListState.isNavigationBarTransparent(),
                ) {
                    CupertinoNavigationBarItem(
                        selected = true,
                        onClick = {},
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
                        selected = false,
                        onClick = {},
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

            LazyColumn(
                state = lazyListState,
                contentPadding = it,
                modifier = Modifier
                    .fillMaxSize()
                    .sectionContainerBackground()
            ) {

//                item {
//
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

                section(
                    title = {
                        CupertinoText(
                            text = "Buttons".sectionTitle(),
                            modifier = Modifier.padding(it)
                        )
                    }
                ) {
                    buttons(accentColor)
                    switchAndProgressBar()
                }

                item {
                    var value by remember {
                        mutableStateOf("")
                    }
                    CupertinoSearchTextField(
                        value = value,
                        onValueChange = {
                            value = it
                        }
                    )
                }

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

                when(selectedPickerTab){
                    0 -> picker(pickerValues, pickerState)
                    1 -> timePicker()
                    2 -> datePicker()
                    3 -> dateTimePicker()
                }

                sections(toggleState)
            }
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

            LaunchedEffect(3){
                delay(5000)
                pickerState.scrollToItem(1)
                delay(1000)
                pickerState.scrollToItem(3)
                delay(1000)
                pickerState.scrollToItem(5)
            }
            Column {
                CupertinoPicker(
                    state = pickerState,
                    modifier = Modifier
                        .height(CupertinoPickerDefaults.Height)
                        .fillMaxWidth(),
                    items = pickerValues,
                    containerColor = CupertinoTheme.colorScheme.secondarySystemGroupedBackground
                ) {
                    CupertinoText(it)
                }
            }
        }
    }
}

fun LazyListScope.timePicker(){
    section(
        title = {
            CupertinoText(
                text = "Compose Time Picker".sectionTitle(),
                modifier = Modifier.padding(it)
            )
        }
    ) {
        item {

            val state = rememberCupertinoTimePickerState()

            CupertinoTimePicker(
                modifier = Modifier.fillMaxWidth(),
                state = state
            )
        }
    }
}

fun LazyListScope.datePicker(){
    section(
        title = {
            CupertinoText(
                text = "Compose Date Picker".sectionTitle(),
                modifier = Modifier.padding(it)
            )
        }
    ) {
        item {

            val picker = rememberCupertinoDatePickerState()

            LaunchedEffect(picker.selectedDateMillis){
               picker.selectedDateMillis
            }

            CupertinoDatePicker(
                modifier = Modifier.fillMaxWidth(),
                state = picker
            )
        }
    }
}

fun LazyListScope.dateTimePicker(){
    section(
        title = {
            CupertinoText(
                text = "Compose Date Time Picker".sectionTitle(),
                modifier = Modifier.padding(it)
            )
        }
    ) {
        item {
            CupertinoDateTimePicker(
                modifier = Modifier.fillMaxWidth(),
                state = rememberCupertinoDateTimePickerState(
                    is24Hour = true
                )
            )
        }
    }
}

//@Composable
//fun App() {

//    var isDark by remember {
//        mutableStateOf(false)
//    }
//
//    MaterialTheme {
//        AdaptiveApplication(
//            darkMode = isDark,
//        ) {
//            var isMaterial by remember {
//                mutableStateOf(platformLookAndFeel == LookAndFeel.Material3)
//            }
//
//            // Optional part.
//            // Demo of look and feel provisioning.
//            // AdaptiveApplication automatically provides platformLookAndFeel
//            ProvideLookAndFeel(
//                if (isMaterial) {
//                    LookAndFeel.Material3
//                } else {
//                    LookAndFeel.Cupertino
//                },
//            ) {
//                val navigator = rememberNavigator()
//
//                NavHost(
//                    navigator = navigator,
//                    initialRoute = Screen.Main.name,
//                    modifier = Modifier
//                        .background(MaterialTheme.colorScheme.background)
//                ) {
//                    scene(Screen.Main.name) {
//
//                        MainScreen(
//                            isMaterial = isMaterial,
//                            onMaterialChanged = { isMaterial = it },
//                            isDark = isDark,
//                            onDarkChanged = { isDark = it },
//                            onNavigateToBackdrop = {
//                                navigator.navigate(Screen.Backdrop.name)
//                            },
//                            onNavigateToDialogs = {
//                                navigator.navigate(Screen.Dialogs.name)
//                            },
//                        )
//                    }
//
//                    scene(Screen.Backdrop.name) {
//                        BackdropScreen()
//                    }
////                    scene(Screen.Modal/BottomSheet.name) {
////                        ModalBottomSheetScreen()
////                    }
//
//                    scene(Screen.Dialogs.name) {
//                        DialogsScreen()
//                    }
//                }
//            }
//        }
//    }
//}

//@Composable
//fun Picker() {
//    LazyColumn {  }
//    CupertinoPicker(
//        modifier = Modifier
//            .height(200.dp)
//            .fillMaxWidth(),
//        items = List(1000){"Item $it"}.toSet()
//    )
//}



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
}
private fun SectionScope.buttons(accentColor : MutableState<Pair<Color,Color>>) {


    item {
        Row(
            modifier = Modifier.padding(it),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CupertinoIconButton(
                onClick = {
                    accentColor.value = CupertinoColors.systemBlue(false) to
                            CupertinoColors.systemBlue(true)
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.systemBlue
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    accentColor.value = CupertinoColors.systemRed(false) to
                            CupertinoColors.systemRed(true)
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.systemRed
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    accentColor.value = CupertinoColors.systemGreen(false) to
                            CupertinoColors.systemGreen(true)
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.systemGreen
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    accentColor.value = CupertinoColors.systemPurple(false) to
                            CupertinoColors.systemPurple(true)
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.systemPurple
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    accentColor.value = CupertinoColors.systemMint(false) to
                            CupertinoColors.systemMint(true)
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.systemMint
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    accentColor.value = CupertinoColors.systemOrange(false) to
                            CupertinoColors.systemOrange(true)
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.systemOrange
                )
            ) {
                CupertinoIcon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null
                )
            }
            CupertinoIconButton(
                onClick = {
                    accentColor.value = CupertinoColors.systemIndigo(false) to
                            CupertinoColors.systemIndigo(true)
                },
                colors = CupertinoButtonDefaults.tintedButtonColors(
                    contentColor = CupertinoColors.systemIndigo
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
                button(
                    style = AlertActionStyle.Destructive,
                    onClick = {
                        alertVisible = false
                    }
                ) {
                    CupertinoText("Cancel")
                }
                button(
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
                button(
                    style = AlertActionStyle.Destructive,
                    onClick = {
                        nativeAlertVisible = false
                    },
                    title = "Cancel"
                )
                button(
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
                button(
                    onClick = {
                        sheetVisible = false
                    }
                ) {
                    CupertinoText("OK")
                }
                button(
                    style = AlertActionStyle.Destructive,
                    onClick = {
                        sheetVisible = false
                    }
                ) {
                    CupertinoText("Delete")
                }

                button(
                    style = AlertActionStyle.Cancel,
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
                button(
                    onClick = {
                        nativeSheetVisible = false
                    },
                    title = "OK"
                )
                button(
                    style = AlertActionStyle.Destructive,
                    onClick = {
                        nativeSheetVisible = false
                    },
                    title = "Delete"
                )

                button(
                    style = AlertActionStyle.Cancel,
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
                    button(
                        onClick = {
                            pickerSheetVisible = false
                        },
                    ){
                        CupertinoText("Confirm")
                    }
                    button(
                        onClick = {
                            pickerSheetVisible = false
                        },
                        style = AlertActionStyle.Cancel
                    ){
                        CupertinoText("Cancel")
                    }
                }
            ){
                CupertinoDateTimePicker(rememberCupertinoDateTimePickerState())
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
                    contentColor = { CupertinoColors.systemRed },
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

private fun LazyListScope.sections(toggle : MutableState<Boolean>){

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
                    containerColor = CupertinoColors.systemBlue
                )
            },
            onClick = {}
        ) {
            CupertinoText("Clickable label")
        }
        label(
            icon = {
                CupertinoLabelIcon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    containerColor = CupertinoColors.systemRed
                )
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
                    containerColor = CupertinoColors.systemIndigo
                )
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