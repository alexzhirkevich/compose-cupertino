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
import androidx.compose.material.BackdropValue
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.text.font.FontWeight
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
import com.github.alexzhirkevich.lookandfeel.components.NavigateBackIcon
import com.github.alexzhirkevich.lookandfeel.components.PlatformEvents
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoAlertDialog
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoLargeTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSearchTextField
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoLargeTopAppBarColors
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoScrollBehavior
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.cupertinoScrollOverflow
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.rememberCupertinoScrollOverflowState
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.topBarScrollEnabled
import com.github.alexzhirkevich.lookandfeel.components.cupertino.rememberCupertinoSearchTextFieldState
import com.github.alexzhirkevich.lookandfeel.components.rememberAdaptiveBackdropScaffoldState
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveSettings
import com.github.alexzhirkevich.lookandfeel.navigation.Sheet
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
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
            ) {
                scene(Screen.Main.name) {
                    Scaffold(
                        isMaterial = isMaterial,
                        onMaterialChanged = { isMaterial = it },
                        isDark = isDark,
                        onDarkChanged = { isDark = it },
                    ) {
                        navigator.navigate(Screen.Backdrop.name)
                    }
                }

                scene(Screen.Backdrop.name) {
                    BackdropDemo()
                }
            }
        }
    }
}

@Composable
fun BackdropDemo2() {
    Box(Modifier.fillMaxSize()) {
        Sheet(
            label = {
                Button(
                    modifier = Modifier.align(Alignment.Center),
                    onClick = it,
                ) {
                    Text("Open modal")
                }
            },
        ) {
            Box(Modifier.fillMaxSize().background(Color.Gray))
        }
    }
}
@Composable
fun BackdropDemo() {
    val state = rememberAdaptiveBackdropScaffoldState(BackdropValue.Concealed)
    val scope = rememberCoroutineScope()


    AdaptiveBackdropScaffold(
        scaffoldState = state,
        appBar = {
            AdaptiveTopAppBar(
                modifier = Modifier,
                navigationIcon = {
                    NavigateBackIcon()
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
                        state.reveal()
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
                            state.conceal()
                        }
                    },
                ) {
                    Text("Hide front layer")
                }
            }
        },
    )
}

@Composable fun Scaffold(
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


    var dialogVisible by remember { mutableStateOf(false) }

    CupertinoAlertDialog(
        visible = dialogVisible,
        onDismissRequest = {
            dialogVisible = false
        },
        title = { Text("Alert Dialog") },
        text = { Text("This is alert dialog demo.\nCool, isn't it?") },
        buttons = {
            button(onClick = { dialogVisible = false }) {
                Text(
                    "Cancel",
                    fontWeight = FontWeight.Bold,
                )
            }
            button(onClick = { dialogVisible = false }){
                Text("Yes")
            }
        }
    )

    androidx.compose.material3.Scaffold(
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
                title = "Appearance",
                caption = "This demo is implemented in pure Compose. No platform widgets used",
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

                label(onClick = { dialogVisible = true }) {
                    Text("Alert dialog")
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

            Spacer(Modifier.height(1000.dp).width(20.dp).background(Color.Red))
            Spacer(Modifier.height(30.dp).width(20.dp).background(Color.Green))
        }
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

