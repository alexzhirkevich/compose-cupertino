//@file:OptIn(
//    ExperimentalMaterial3Api::class,
//    ExperimentalAnimationApi::class,
//)
//
//import androidx.compose.animation.ExperimentalAnimationApi
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import io.github.alexzhirkevich.cupertino.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.style.TextAlign
//import com.github.alexzhirkevich.lookandfeel.TemporaryLookFeelApi
//import com.github.alexzhirkevich.lookandfeel.components.AdaptiveTopAppBar
//import com.github.alexzhirkevich.lookandfeel.components.DatePickerDialog
//import com.github.alexzhirkevich.lookandfeel.components.NavigateBackIcon
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.AlertActionStyle
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoActionSheet
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoActionSheetNative
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoAlertDialog
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoAlertDialogNative
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoColorPickerDialog
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoColorPickerDialogNative
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSheet
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSheetNative
//import com.github.alexzhirkevich.lookandfeel.components.cupertino.section.CupertinoSection
//import com.github.alexzhirkevich.lookandfeel.modifiers.adaptiveVerticalScroll
//import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
//import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
//
//@Composable
//fun DialogsSample(
//    alertVisible : MutableState<Boolean>,
//    nativeAlertVisible : MutableState<Boolean>,
//    actionSheetVisible : MutableState<Boolean>,
//    nativeActionSheetVisible : MutableState<Boolean>,
//    datePickerVisible : MutableState<Boolean>,
//    colorVisible : MutableState<Boolean>,
//    colorVisibleNative : MutableState<Boolean>,
//    sheetVisible : MutableState<Boolean>,
//    nativeSheetVisible : MutableState<Boolean>
//) {
//
//    if (alertVisible.value) {
//        CupertinoAlertDialog(
//            onDismissRequest = {
//                alertVisible.value = false
//            },
//            title = { Text("Alert Dialog") },
//            message = { Text("This is alert dialog demo.\nCool, isn't it?") },
//            buttons = {
//                button(
//                    onClick = { alertVisible.value = false },
//                    style = AlertActionStyle.Cancel
//                ) {
//                    Text("Cancel")
//                }
//                button(onClick = { alertVisible.value = false }) {
//                    Text("Yes")
//                }
//            }
//        )
//    }
//
//    if (nativeAlertVisible.value) {
//        CupertinoAlertDialogNative(
//            onDismissRequest = {
//                nativeAlertVisible.value = false
//            },
//            title = "Native Alert Dialog",
//            message = "This is native iOS alert dialog if you see that from iphone",
//            buttons = {
//                button(
//                    onClick = { nativeAlertVisible.value = false },
//                    style = AlertActionStyle.Cancel,
//                    title = "Cancel"
//                )
//                button(
//                    onClick = { nativeAlertVisible.value = false },
//                    title = "Yes"
//                )
//            }
//        )
//    }
//
//    if (actionSheetVisible.value) {
//        CupertinoActionSheet(
//            onDismissRequest = {
//                actionSheetVisible.value = false
//            },
//            title = { Text("Action Sheet") },
//            message = { Text("This is action sheet demo.\nCool, isn't it?") },
//            separateLastButton = true,
//            buttons = {
//                button(onClick = { actionSheetVisible.value = false }) {
//                    Text("Yeah",)
//                }
//                button(onClick = { actionSheetVisible.value = false }) {
//                    Text("Absolutely")
//                }
//                button(
//                    onClick = { actionSheetVisible.value = false },
//                    style = AlertActionStyle.Destructive
//                ) {
//                    Text("Definitely")
//                }
//                button(
//                    onClick = { actionSheetVisible.value = false },
//                    style = AlertActionStyle.Cancel
//                ) {
//                    Text(
//                        "Cancel",
//                    )
//                }
//            }
//        )
//    }
//
//    if (nativeActionSheetVisible.value) {
//        CupertinoActionSheetNative(
//            onDismissRequest = {
//                nativeActionSheetVisible.value = false
//            },
//            title = if (currentLookAndFeel == LookAndFeel.Cupertino)
//                "UIKit native action sheet" else "Works on iOS only :c",
//            message = "On other platforms compose CupertinoActionSheet will be used",
//            buttons = {
//                button(
//                    onClick = { nativeActionSheetVisible.value = false },
//                    title = "Yeah",
//                )
//                button(
//                    onClick = { nativeActionSheetVisible.value = false },
//                    title = "Absolutely",
//                )
//                button(
//                    onClick = { nativeActionSheetVisible.value = false },
//                    style = AlertActionStyle.Destructive,
//                    title = "Definitely",
//                )
//                button(
//                    onClick = { nativeActionSheetVisible.value = false },
//                    style = AlertActionStyle.Cancel,
//                    title = "Cancel",
//                )
//            }
//        )
//    }
//
//    if (sheetVisible.value){
//        CupertinoSheet(
//            onDismissRequest = {
//                sheetVisible.value = false
//            }
//        ){
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//                Text(
//                    text = "This is compose sheet available on all platforms.",
//                    textAlign = TextAlign.Center
//                )
//                Text(
//                    text = "Swipe down or click the button to dismiss it.",
//                    textAlign = TextAlign.Center
//                )
//                Button(
//                    onClick = {
//                        sheetVisible.value = false
//                    }
//                ) {
//                    Text("Dismiss")
//                }
//            }
//        }
//    }
//
//    if (nativeSheetVisible.value){
//        CupertinoSheetNative(
//            onDismissRequest = {
//                nativeSheetVisible.value = false
//            }
//        ){
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//                Text(
//                    text = "This is UIKit bottom sheet if you see it from iOS.",
//                    textAlign = TextAlign.Center
//                )
//                Text(
//                    text = "Swipe down or click the button to dismiss it.",
//                    textAlign = TextAlign.Center
//                )
//                Button(
//                    onClick = {
//                        nativeSheetVisible.value = false
//                    }
//                ) {
//                    Text("Dismiss")
//                }
//            }
//        }
//    }
//
//    var date by remember { mutableStateOf(0L) }
//
//    if (datePickerVisible.value) {
//        DatePickerDialog(
//            onDismissRequest = {
//                datePickerVisible.value = false
//            },
//            value = date,
//            onValueChanged = { date = it }
//        )
//    }
//
//    var color by remember {
//        mutableStateOf(Color.White)
//    }
//
//    if (colorVisible.value) {
//        CupertinoColorPickerDialog(
//            color = color,
//            onColorChanged = {color = it},
//            onDismissRequest = {
//                colorVisible.value=false
//            },
//            title = {
//                Text("Colors")
//            }
//        )
//    }
//
//    if (colorVisibleNative.value){
//        CupertinoColorPickerDialogNative(
//            color = color,
//            onColorChanged = {color = it},
//            onDismissRequest = {
//                colorVisibleNative.value = false
//            }
//        )
//    }
//}
//
//@TemporaryLookFeelApi
//@Composable
//fun DialogsScreen() {
//
//    val alertVisible = remember { mutableStateOf(false) }
//    val nativeAlertVisible = remember { mutableStateOf(false) }
//    val actionSheetVisible = remember { mutableStateOf(false) }
//    val nativeActionSheetVisible = remember { mutableStateOf(false) }
//    val datePickerVisible = remember { mutableStateOf(false) }
//    val colorVisible = remember { mutableStateOf(false) }
//    val colorVisibleNative = remember { mutableStateOf(false) }
//    val sheetVisible = remember { mutableStateOf(false) }
//    val nativeSheetVisible = remember { mutableStateOf(false) }
//
//    DialogsSample(
//        alertVisible = alertVisible,
//        nativeAlertVisible = nativeAlertVisible,
//        actionSheetVisible = actionSheetVisible,
//        nativeActionSheetVisible = nativeActionSheetVisible,
//        datePickerVisible = datePickerVisible,
//        colorVisible = colorVisible,
//        colorVisibleNative = colorVisibleNative,
//        sheetVisible = sheetVisible,
//        nativeSheetVisible = nativeSheetVisible
//    )
//
//    Scaffold(
//        topBar = {
//            AdaptiveTopAppBar(
//                title = {
//                    Text("Dialogs sample")
//                },
//                navigationIcon = {
//                    NavigateBackIcon{}
//                }
//            )
//        },
//    ) {
//        Column(
//            modifier = Modifier
//                .padding(it)
//                .adaptiveVerticalScroll(rememberScrollState())
//        ) {
//            CupertinoSection(
//                title = {
//                    Text(
//                        text = "DIALOGS",
//                        modifier = Modifier.padding(it)
//                    )
//                },
//                caption = {
//                    Text(
//                        modifier = Modifier.padding(it),
//                        text = "CupertinoActionSheetNative will use UIAlertController on iOS and CupertinoActionSheet on other platforms"
//                    )
//                }
//            ) {
//                label(onClick = { actionSheetVisible.value = true }) {
//                    Text("Action Sheet")
//                }
//
//                label(onClick = { nativeActionSheetVisible.value = true }) {
//                    Text("Native Action Sheet")
//                }
//            }
//
//            CupertinoSection(
//                caption ={
//                    Text(
//                        modifier = Modifier.padding(it),
//                        text = "CupertinoAlertDialogNative will use UIAlertController on iOS and CupertinoAlertDialog on other platforms"
//                    )
//                }
//            ) {
//                label(onClick = { alertVisible.value = true }) {
//                    Text("Alert Dialog")
//                }
//                label(onClick = { nativeAlertVisible.value = true }) {
//                    Text("Native Alert Dialog")
//                }
//            }
//
//            CupertinoSection() {
//                label(onClick = { sheetVisible.value = true }) {
//                    Text("Compose Sheet")
//                }
//                label(onClick = { nativeSheetVisible.value = true }) {
//                    Text("UIKit sheet")
//                }
//            }
//
//            CupertinoSection(
//                caption = {
//                    Text(
//                        text = "This dialog doesn't respect current look and feel. It uses platform implementation",
//                        modifier = Modifier.padding(it)
//                    )
//                }
//            ) {
//                label(onClick = { datePickerVisible.value = true }) {
//                    Text("Date Picker")
//                }
//            }
//
//
//            CupertinoSection(
//                caption = {
//                    Text(
//                        modifier = Modifier.padding(it),
//                        text = "Color dialogs is a POC and works bad now.\n CupertinoColorPickerNative uses UIColorPickerViewController on iOS 14+. Otherwise it will be Compose CupertinoColorPicker"
//                    )
//                }
//            ) {
//                label(onClick = { colorVisible.value = true }) {
//                    Text("Color Picker")
//                }
//                label(onClick = { colorVisibleNative.value = true }) {
//                    Text("Native Color Picker")
//                }
//            }
//        }
//    }
//}