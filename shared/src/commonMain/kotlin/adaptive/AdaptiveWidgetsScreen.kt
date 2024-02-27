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

package adaptive

import IsIos
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoCheckBox
import io.github.alexzhirkevich.cupertino.CupertinoNavigateBackButton
import io.github.alexzhirkevich.cupertino.CupertinoSwitchDefaults
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTriStateCheckBox
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveAlertDialog
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveCheckbox
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveCircularProgressIndicator
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveDatePicker
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveFilledIconButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveIconButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveNavigationBar
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveNavigationBarItem
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveScaffold
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveSlider
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveSwitch
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTextButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTopAppBar
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTriStateCheckbox
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveWidget
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi
import io.github.alexzhirkevich.cupertino.adaptive.icons.AccountCircle
import io.github.alexzhirkevich.cupertino.adaptive.icons.AdaptiveIcons
import io.github.alexzhirkevich.cupertino.adaptive.icons.Add
import io.github.alexzhirkevich.cupertino.adaptive.icons.Create
import io.github.alexzhirkevich.cupertino.adaptive.icons.Delete
import io.github.alexzhirkevich.cupertino.adaptive.icons.Menu
import io.github.alexzhirkevich.cupertino.adaptive.icons.Person
import io.github.alexzhirkevich.cupertino.adaptive.icons.Search
import io.github.alexzhirkevich.cupertino.adaptive.icons.Settings
import io.github.alexzhirkevich.cupertino.adaptive.icons.Share
import io.github.alexzhirkevich.cupertino.adaptive.icons.ThumbUp
import io.github.alexzhirkevich.cupertino.cancel
import io.github.alexzhirkevich.cupertino.default
import io.github.alexzhirkevich.cupertino.rememberCupertinoDatePickerState

@OptIn(
    ExperimentalAdaptiveApi::class,
    ExperimentalLayoutApi::class,
    ExperimentalCupertinoApi::class
)
@Composable
fun AdaptiveWidgetsScreen(
    component: AdaptiveWidgetsComponent
) {

    AdaptiveScaffold(
        topBar = {
            AdaptiveTopAppBar(
                navigationIcon = {
                    AdaptiveWidget(
                        cupertino = {
                            CupertinoNavigateBackButton(
                                onClick = component::onNavigateBack,
                            ) {
                                CupertinoText("Back")
                            }
                        },
                        material = {
                            IconButton(
                                onClick = component::onNavigateBack
                            ) {
                                Icon(
                                    imageVector = if (LocalLayoutDirection.current == LayoutDirection.Ltr)
                                        Icons.Default.ArrowBack else Icons.Default.ArrowForward,
                                    contentDescription = "Back"
                                )
                            }
                        }
                    )
                },
                title = {
                    Text("Adaptive")
                },
                actions = {
                    Text("Theme")
                    AdaptiveSwitch(
                        modifier = Modifier.padding(horizontal = 6.dp),
                        checked = component.isMaterial.value,
                        onCheckedChange = {
                            component.onThemeChanged()
                        }
                    )
                }
            )
        },
        bottomBar = {
            AdaptiveNavigationBar {

                var selected by rememberSaveable {
                    mutableStateOf(0)
                }

                val content = listOf(
                    "Profile" to AdaptiveIcons.Outlined.Person,
                    "Menu" to AdaptiveIcons.Outlined.Menu,
                    "Settings" to AdaptiveIcons.Outlined.Settings
                )

                content.forEachIndexed { index, pair ->
                    AdaptiveNavigationBarItem(
                        selected = selected == index,
                        onClick = {
                            selected = index
                        },
                        icon = {
                            Icon(
                                imageVector = pair.second,
                                contentDescription = pair.first
                            )
                        },
                        label = {
                            Text(pair.first)
                        }
                    )
                }
            }
        }
    ) {

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                start = 12.dp,
                end = 12.dp,
                top = it.calculateTopPadding() + 12.dp,
                bottom = it.calculateBottomPadding()
            ),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            item {
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    adaptiveIcons().forEach {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            imageVector = it,
                            contentDescription = it.name
                        )
                    }
                }
            }

            item {
                var checked by remember { mutableStateOf(false) }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    AdaptiveSwitch(
                        checked = checked,
                        onCheckedChange = {
                            checked = it
                        }
                    )
                    AdaptiveSwitch(
                        checked = !checked,
                        onCheckedChange = {
                            checked = !it
                        }
                    )

                    AdaptiveCircularProgressIndicator()
                }
            }

            item {
                var v by remember {
                    mutableStateOf(.5f)
                }

                AdaptiveSlider(v, {v = it})
            }

            item {
                var v by remember {
                    mutableStateOf(.5f)
                }

                AdaptiveSlider(v, {v = it},steps = 5)
            }

            item {

                var alertVisible by remember {
                    mutableStateOf(false)
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AdaptiveButton(
                        onClick = {
                            alertVisible = true
                        }
                    ) {
                        Text("Alert")
                    }
                    AdaptiveTextButton(onClick = {}){
                        Text("Text Button")
                    }

                    AdaptiveIconButton(onClick = {}){
                        Icon(
                            imageVector = AdaptiveIcons.Outlined.Delete,
                            contentDescription = null
                        )
                    }
                    AdaptiveFilledIconButton(onClick = {}){
                        Icon(
                            imageVector = AdaptiveIcons.Outlined.Delete,
                            contentDescription = null
                        )
                    }
                }

                if (alertVisible){
                    AdaptiveAlertDialog(
                        onDismissRequest = {
                            alertVisible = false
                        },
                        title = {
                            Text("Alert")
                        },
                        message = {
                            Text("Adaptive Alert Dialog")
                        }
                    ){
                        cancel(onClick = {
                            alertVisible = false
                        }){
                            Text("Cancel")
                        }
                        default(onClick = {
                            alertVisible = false
                        }){
                            Text("OK")
                        }
                    }
                }
            }

            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    var a by remember { mutableStateOf(true) }
                    var b by remember { mutableStateOf(false) }
                    var c by remember { mutableStateOf(ToggleableState.Indeterminate) }

                    AdaptiveCheckbox(checked = a, onCheckedChange = { a = it })
                    AdaptiveCheckbox(checked = b, onCheckedChange = { b = it })
                    AdaptiveTriStateCheckbox(state = c, onClick = {
                        c = when (c) {
                            ToggleableState.On -> ToggleableState.Off
                            ToggleableState.Off -> ToggleableState.Indeterminate
                            ToggleableState.Indeterminate -> ToggleableState.On
                        }
                    })
                }
            }

            item {
                AdaptiveDatePicker(
                    state = rememberCupertinoDatePickerState(),
                    modifier = Modifier.fillMaxWidth(),
                    adaptation = {
                        material {
                            headline = null
                            showModeToggle = false
                            title = null
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun adaptiveIcons() = listOf(
    AdaptiveIcons.Outlined.Add,
    AdaptiveIcons.Outlined.Create,
    AdaptiveIcons.Outlined.Share,
    AdaptiveIcons.Outlined.Settings,
    AdaptiveIcons.Outlined.Person,
    AdaptiveIcons.Outlined.AccountCircle,
    AdaptiveIcons.Outlined.Delete,
    AdaptiveIcons.Outlined.ThumbUp,
    AdaptiveIcons.Outlined.Search,
)