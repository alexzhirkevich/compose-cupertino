@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalFoundationApi::class,
    ExperimentalMaterialApi::class,
    ExperimentalAnimationApi::class,
)

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BackdropScaffoldDefaults
import androidx.compose.material.BackdropValue
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.rememberBackdropScaffoldState
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.app.AdaptiveApplication
import com.github.alexzhirkevich.lookandfeel.app.ProvideLookAndFeel
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveBackdropScaffold
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveContextMenu
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBar
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBarItem
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveProgressIndicator
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSection
import com.github.alexzhirkevich.lookandfeel.components.DatePickerDialog
import com.github.alexzhirkevich.lookandfeel.components.NavigateBackIcon
import com.github.alexzhirkevich.lookandfeel.components.adaptiveAnimationSpec
import com.github.alexzhirkevich.lookandfeel.components.cupertino.AlertActionStyle
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoActionSheet
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoActionSheetNative
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoAlertDialog
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoLargeTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSearchTextField
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoLargeTopAppBarColors
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoScrollBehavior
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.cupertinoScrollOverflow
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.rememberCupertinoScrollOverflowState
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.topBarScrollEnabled
import com.github.alexzhirkevich.lookandfeel.components.cupertino.rememberCupertinoSearchTextFieldState
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveSettings
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import com.github.alexzhirkevich.lookandfeel.util.imePadding
import kotlinx.coroutines.launch
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator

enum class Screen {
    Main, Backdrop
}

@Composable
fun App() {

    var isMaterial by remember {
        mutableStateOf(false)
    }

    var isDark by remember {
        mutableStateOf(false)
    }

    MaterialTheme {
        AdaptiveApplication(
            darkMode = isDark,
        ) {
            ProvideLookAndFeel(
                if (isMaterial) {
                    LookAndFeel.Material3
                } else {
                    LookAndFeel.Cupertino
                },
            ) {
                val navigator = rememberNavigator()

                NavHost(
                    navigator = navigator,
                    initialRoute = Screen.Main.name,
                    modifier = Modifier.background(MaterialTheme.colorScheme.background)
                ) {
                    scene(Screen.Main.name) {
                        ScaffoldSample(
                            isMaterial = isMaterial,
                            onMaterialChanged = { isMaterial = it },
                            isDark = isDark,
                            onDarkChanged = { isDark = it },
                        ) {
                            navigator.navigate(Screen.Backdrop.name)
                        }
                    }

                    scene(Screen.Backdrop.name) {
                        BackdropSample()
                    }
                }
            }
        }
    }
}

@Composable
fun ScaffoldSample(
    isMaterial: Boolean,
    onMaterialChanged: (Boolean) -> Unit,
    isDark: Boolean,
    onDarkChanged: (Boolean) -> Unit,
    onNavigateToBackdrop: () -> Unit,
) {
    val topAppBarColors = TopAppBarDefaults.cupertinoLargeTopAppBarColors()

    val scrollOverflow = rememberCupertinoScrollOverflowState()

    val topBarScrollBehavior = TopAppBarDefaults.cupertinoScrollBehavior(
        "Settings top bar scroll behavior",
        canScroll = { scrollOverflow.topBarScrollEnabled },
    )

    val scrollState = rememberSaveable(
        saver = ScrollState.Saver,
        key = "Settings scroll state",
    ) {
        ScrollState(initial = 0)
    }

    val alertVisible = remember { mutableStateOf(false) }
    val actionSheetVisible = remember { mutableStateOf(false) }
    val nativeActionSheetVisible = remember { mutableStateOf(false) }
    val datePickerVisible = remember { mutableStateOf(false) }

    DialogsSample(
        alertVisible = alertVisible,
        actionSheetVisible = actionSheetVisible,
        nativeActionSheetVisible = nativeActionSheetVisible,
        datePickerVisible = datePickerVisible
    )

    androidx.compose.material3.Scaffold(
        modifier = Modifier.imePadding(),
        bottomBar = {
            var selected by remember {
                mutableStateOf(0)
            }
            AdaptiveNavigationBar {
                repeat(3) {
                    AdaptiveNavigationBarItem(
                        icon = {
                            Icon(
                                imageVector = Icons.Default.AdaptiveSettings,
                                contentDescription = null,
                            )
                        },
                        label = { Text("Settings") },
                        selected = it == selected,
                        onClick = { selected = it },
                    )
                }
            }
        },
        topBar = {
            CupertinoLargeTopAppBar(
                scrollOverflow = scrollOverflow,
                colors = topAppBarColors,
                scrollableState = scrollState,
                title = { Text("Settings") },
                scrollBehavior = topBarScrollBehavior,
            )
        },
    ) { paddingValues ->

        val textFieldState = rememberCupertinoSearchTextFieldState(
            topAppBarScrollBehavior = topBarScrollBehavior,
            scrollableState = scrollState,
            overflowState = scrollOverflow,
        )

        Column(
            Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .nestedScroll(textFieldState.nestedScrollConnection)
                .nestedScroll(topBarScrollBehavior.nestedScrollConnection)
                .cupertinoScrollOverflow(
                    orientation = Orientation.Vertical,
                    scrollState = scrollState,
                    overflowState = scrollOverflow,
                    topAppBarState = topBarScrollBehavior.state,
                    enabled = true,
                )
                .verticalScroll(scrollState),

        ) {
            var search by remember { mutableStateOf("") }
            CupertinoSearchTextField(
                state = textFieldState,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                value = search,
                onValueChange = { search = it },
            )
            CupertinoSection(
                title = {
                    Text(
                        text = "APPEARANCE",
                        modifier = Modifier.padding(it)
                    )
                },
                caption = {
                    Text(
                        text = "This demo is implemented in pure Compose. No platform widgets used",
                        modifier = Modifier.padding(it)
                    )
                },
            ) {
                toggle(
                    title = {
                        Text(text = "Use Material UI")
                    },
                    checked = isMaterial,
                    onCheckedChange = onMaterialChanged,
                )

                toggle(
                    title = {
                        Text(text = "Dark mode")
                    },
                    checked = isDark,
                    onCheckedChange = onDarkChanged,
                )
            }

            CupertinoSection {
                label(onClick = onNavigateToBackdrop) {
                    Text("Backdrop demo")
                }

                item {
                    ContextMenuSample(it)
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(it),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Progress Indicator")

                        AdaptiveProgressIndicator()
                    }
                }
            }

            CupertinoSection(
                title = {
                    Text(
                        text = "DIALOGS",
                        modifier = Modifier.padding(it)
                    )
                }
            ) {
                label(onClick = { actionSheetVisible.value = true }) {
                    Text("Action Sheet")
                }

                label(onClick = { nativeActionSheetVisible.value = true }) {
                    Text("Native Action Sheet")
                }

                label(onClick = { alertVisible.value = true }) {
                    Text("Alert Dialog")
                }
                label(onClick = { datePickerVisible.value = true }) {
                    Text("Date Picker")
                }
            }

            Spacer(Modifier.height(1000.dp).width(20.dp).background(Color.Red))
            Spacer(Modifier.height(30.dp).width(20.dp).background(Color.Green))
        }
    }
}

@Composable
fun BackdropSample() {

    val state = rememberBackdropScaffoldState(
        BackdropValue.Revealed,
        animationSpec = BackdropScaffoldDefaults.adaptiveAnimationSpec()
    )
    val scope = rememberCoroutineScope()

    AdaptiveBackdropScaffold(
        scaffoldState = state,
        appBar = {
            AdaptiveTopAppBar(
                modifier = Modifier,
                navigationIcon = {
                    NavigateBackIcon(
                        contentColor = AdaptiveTheme.colorScheme.primary
                    )
                },
                title = { Text("Backdrop Demo") },
            )
        },
        backLayerContent = {
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Button(onClick = {
                    scope.launch {
                        state.conceal()
                    }
                }) {
                    Text("Show front layer")
                }
            }
        },
        frontLayerContent = {
            Box(Modifier.fillMaxSize()) {
                Button(
                    modifier = Modifier.align(Alignment.Center),
                    onClick = {
                        scope.launch {
                            state.reveal()
                        }
                    },
                ) {
                    Text("Hide front layer")
                }
            }
        },
    )
}

@Composable
fun DialogsSample(
    alertVisible : MutableState<Boolean>,
    actionSheetVisible : MutableState<Boolean>,
    nativeActionSheetVisible : MutableState<Boolean>,
    datePickerVisible : MutableState<Boolean>,
) {
    if (alertVisible.value) {
        CupertinoAlertDialog(
            onDismissRequest = {
                alertVisible.value = false
            },
            title = { Text("Alert Dialog") },
            message = { Text("This is alert dialog demo.\nCool, isn't it?") },
            buttons = {
                button(
                    onClick = { alertVisible.value = false },
                    style = AlertActionStyle.Cancel
                ) {
                    Text("Cancel")
                }
                button(onClick = { alertVisible.value = false }) {
                    Text("Yes")
                }
            }
        )
    }

    if (actionSheetVisible.value) {
        CupertinoActionSheet(
            onDismissRequest = {
                actionSheetVisible.value = false
            },
            title = { Text("Action Sheet") },
            message = { Text("This is action sheet demo.\nCool, isn't it?") },
            separateLastButton = true,
            buttons = {
                button(onClick = { actionSheetVisible.value = false }) {
                    Text("Yeah",)
                }
                button(onClick = { actionSheetVisible.value = false }) {
                    Text("Absolutely")
                }
                button(
                    onClick = { actionSheetVisible.value = false },
                    style = AlertActionStyle.Destructive
                ) {
                    Text("Definitely")
                }
                button(
                    onClick = { actionSheetVisible.value = false },
                    style = AlertActionStyle.Cancel
                ) {
                    Text(
                        "Cancel",
                    )
                }
            }
        )
    }

    if (nativeActionSheetVisible.value) {
        CupertinoActionSheetNative(
            onDismissRequest = {
                nativeActionSheetVisible.value = false
            },
            title = if (currentLookAndFeel == LookAndFeel.Cupertino)
                "UIKit native action sheet" else "Works on iOS only :c",
            message = "On other platforms compose CupertinoActionSheet will be used",
            buttons = {
                button(
                    onClick = { actionSheetVisible.value = false },
                    title = "Yeah",
                )
                button(
                    onClick = { actionSheetVisible.value = false },
                    title = "Absolutely",
                )
                button(
                    onClick = { actionSheetVisible.value = false },
                    style = AlertActionStyle.Destructive,
                    title = "Definitely",
                )
                button(
                    onClick = { actionSheetVisible.value = false },
                    style = AlertActionStyle.Cancel,
                    title = "Cancel",
                )
            }
        )
    }


    var date by remember { mutableStateOf(0L) }

    if (datePickerVisible.value) {
        DatePickerDialog(
            onDismissRequest = {
                datePickerVisible.value = false
            },
            value = date,
            onValueChanged = { date = it }
        )
    }
}

@Composable
fun ContextMenuSample(paddingValues: PaddingValues) {
    var menuVisible by remember { mutableStateOf(false) }

    AdaptiveContextMenu(
        modifier = Modifier,
        visible = menuVisible,
        onDismissRequest = { menuVisible = false },
        menu = {
            label(
                onClick = {},
                icon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                    )
                },
            ) {
                Text(
                    text = "Option 1",
                )
            }
            label(
                onClick = {},
                icon = {
                    Icon(
                        imageVector = Icons.Default.Send,
                        contentDescription = null,
                    )
                },
            ) {
                Text(
                    text = "Option 2",
                )
            }
        },
    ) {
        Text(
            text = "Context menu (long press)",
            modifier = Modifier
                .shadow(
                    elevation = if (menuVisible && currentLookAndFeel == LookAndFeel.Cupertino) {
                        10.dp
                    } else {
                        0.dp
                    },
                    shape = CardDefaults.shape,
                )
                .combinedClickable(
                    enabled = menuVisible.not(),
                    onLongClick = {
                        menuVisible = true
                    },
                ) { }
                .clip(CardDefaults.shape)
                .background(AdaptiveTheme.colorScheme.surfaceVariant)
                .padding(paddingValues)
                .fillMaxWidth(),

        )
    }
}

