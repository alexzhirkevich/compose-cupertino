@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalAnimationApi::class,
    ExperimentalFoundationApi::class
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
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.app.platformLookAndFeel
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveContextMenu
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveIconButton
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveMediumTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBar
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBarItem
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveProgressIndicator
import com.github.alexzhirkevich.lookandfeel.components.CupertinoOutlinedTextField
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSection
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSectionDefaults
import com.github.alexzhirkevich.lookandfeel.components.adaptiveExitUntilCollapsedTopBarScrollBehavior
import com.github.alexzhirkevich.lookandfeel.components.adaptiveLargeTopAppBarColors
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSearchTextField
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSegmentedControl
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSegmentedControlTab
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSheetNative
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSlidingSegmentedControl
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSlidingSegmentedControlTab
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoMaterial
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoScaffoldMaterial
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.cupertinoScrollOverflow
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.rememberCupertinoScrollOverflowState
import com.github.alexzhirkevich.lookandfeel.components.cupertino.modifiers.topBarScrollEnabled
import com.github.alexzhirkevich.lookandfeel.components.cupertino.rememberCupertinoSearchTextFieldState
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveEdit
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveSettings
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

@ExperimentalMaterialApi
@Composable
fun MainScreen(
    isMaterial: Boolean,
    onMaterialChanged: (Boolean) -> Unit,
    isDark: Boolean,
    onDarkChanged: (Boolean) -> Unit,
    onNavigateToBackdrop: () -> Unit,
    onNavigateToDialogs: () -> Unit,
) {

    //overflow state of the scrollable content
    val scrollOverflow = rememberCupertinoScrollOverflowState()

    //scrollable content scroll sttte
    val scrollState = rememberSaveable(
        saver = ScrollState.Saver,
        key = "Settings scroll state",
    ) {
        ScrollState(initial = 0)
    }

    var textFieldIsFocused by remember {
        mutableStateOf(false)
    }

    //scroll behavior of the collapsing top bar
    val topBarScrollBehavior = TopAppBarDefaults.adaptiveExitUntilCollapsedTopBarScrollBehavior(
        "Settings top bar scroll behavior",
        canScroll = {
            // scroll overflow can control top bar scroll
            // also we don't want top bar to scroll when we use search
            scrollOverflow.topBarScrollEnabled && !textFieldIsFocused
        },
    )

    var search by remember { mutableStateOf("") }

    val textFieldState = rememberCupertinoSearchTextFieldState(
        topAppBarScrollBehavior = topBarScrollBehavior,
        scrollableState = scrollState,
        overflowState = scrollOverflow,
        collapseSelf = {
            search.isEmpty()
        },
    )

    textFieldIsFocused = textFieldState.isFocused

    val density = LocalDensity.current

    val bottomPadding = 15.dp
    val bottomPaddingPx = density.run {
        bottomPadding.toPx()
    }

    val transparentPadding = density.run { 15.dp.toPx() }

    val isTopBarTransparent = {
        scrollState.value < transparentPadding
    }

    val isNavigationBarTransparent = {
        scrollState.maxValue - scrollState.value < bottomPaddingPx
    }

    androidx.compose.material3.Scaffold(
        bottomBar = {
            var selected by remember {
                mutableStateOf(0)
            }
            AdaptiveNavigationBar(
                containerColor = if (currentLookAndFeel == LookAndFeel.Cupertino)
                    CupertinoMaterial.ultraThin else NavigationBarDefaults.containerColor,
                isTransparent = isNavigationBarTransparent,
            ) {
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
            AdaptiveMediumTopAppBar(
                scrollOverflowState = scrollOverflow,
                colors = TopAppBarDefaults.adaptiveLargeTopAppBarColors(
                    containerColor = if (currentLookAndFeel == LookAndFeel.Cupertino)
                        CupertinoMaterial.ultraThin else AdaptiveTheme.colorScheme.surface,
                ),
                title = { Text("Settings") },

                actions = {
                    AdaptiveIconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.AdaptiveEdit,
                            contentDescription = null
                        )
                    }
                },
                isTransparent = isTopBarTransparent,
                scrollBehavior = topBarScrollBehavior,
            )
        },
    ) { paddingValues ->

        CupertinoScaffoldMaterial(
//            paddingValues = it,
//            topAppBarScrollBehavior = topBarScrollBehavior,
            enabledTop = { !isTopBarTransparent() },
            enabledBottom = { !isNavigationBarTransparent()}
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .nestedScroll(textFieldState.nestedScrollConnection)
                    .nestedScroll(topBarScrollBehavior.nestedScrollConnection)
                    .cupertinoScrollOverflow(
                        orientation = Orientation.Vertical,
                        scrollState = scrollState,
                        overflowState = scrollOverflow,
                        topAppBarState = topBarScrollBehavior.state,
                        enabled = true,
                    )
                    .verticalScroll(scrollState)
                    .padding(paddingValues)
                    .padding(bottom = bottomPadding)

            ) {
                CupertinoSearchTextField(
                    state = textFieldState,
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = search,
                    onValueChange = { search = it },
                )

                CupertinoSection(
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
                        Text("Backdrop sample")
                    }

                    label(onClick = onNavigateToDialogs) {
                        Text("Dialogs sample")
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


                var selectedTab by remember {
                    mutableStateOf(0)
                }
                CupertinoSegmentedControl(
                    selectedTabIndex = selectedTab
                ) {
                    repeat(3) {
                        CupertinoSegmentedControlTab(
                            isSelected = it == selectedTab,
                            onClick = {
                                selectedTab = it
                            }
                        ) {
                            Text("Tab $it")
                        }
                    }
                }

                var selectedTab2 by remember {
                    mutableStateOf(0)
                }

                CupertinoSlidingSegmentedControl(
                    selectedTabIndex = selectedTab2
                ) { modifier ->
                    repeat(3) {
                        CupertinoSlidingSegmentedControlTab(
                            modifier = modifier,
                            isSelected = it == selectedTab2,
                            onClick = {
                                selectedTab2 = it
                            }
                        ) {
                            Text("Tab $it")
                        }
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    repeat(3) {
                        Column {
                            Spacer(Modifier.height(1000.dp).width(20.dp).background(Color.Red))
                            Spacer(Modifier.height(30.dp).width(20.dp).background(Color.Green))
                        }
                    }
                }
            }
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

