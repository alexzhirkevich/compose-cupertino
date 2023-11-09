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


import adaptive.AdaptiveWidgetsScreen
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
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.predictiveBackAnimatable
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.predictiveBackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.essenty.backhandler.BackDispatcher
import cupertino.CupertinoWidgetsComponent
import cupertino.CupertinoWidgetsScreen
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
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi
import io.github.alexzhirkevich.cupertino.cancel
import io.github.alexzhirkevich.cupertino.decompose.cupertinoPredictiveEnterModifier
import io.github.alexzhirkevich.cupertino.decompose.cupertinoPredictiveExitModifier
import io.github.alexzhirkevich.cupertino.decompose.cupertinoStackAnimator
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
import io.github.alexzhirkevich.cupertino.theme.systemRed
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime


@OptIn(ExperimentalDecomposeApi::class, ExperimentalAdaptiveApi::class)
@Composable
fun App(rootComponent: RootComponent) {

    var target by remember {
        mutableStateOf(Theme.Cupertino)
    }

    val dark = isSystemInDarkTheme()

    val (lightAccent, darkAccent) = rootComponent.accentColor.value

//    CupertinoTheme(
//        colorScheme = if (isSystemInDarkTheme())
//            darkColorScheme(accentColor.value.second) else lightColorScheme(accentColor.value.first)
//    )

    AdaptiveTheme(
        target = target,
        primaryColor = if (dark)
            lightAccent else darkAccent,
        useSystemColorTheme = false,
        useDarkTheme = dark
    ) {

        PredictiveBackGestureOverlay(
            modifier = Modifier.fillMaxSize(),
            backDispatcher = rootComponent.backHandler as BackDispatcher
        ){
            Children(
                stack = rootComponent.stack,
                modifier = Modifier.fillMaxSize(),
                animation = predictiveBackAnimation(
                    backHandler = rootComponent.backHandler,
                    animation = stackAnimation(cupertinoStackAnimator()),
                    onBack = rootComponent::onBack,
                    selector = { initialBackEvent, _, _ ->
                        predictiveBackAnimatable(
                            initialBackEvent = initialBackEvent,
                            exitModifier = { progress, _ ->
                                Modifier
                                    .cupertinoPredictiveExitModifier(progress = { progress })
                            },
                            enterModifier = { progress, _ ->
                                Modifier
                                    .cupertinoPredictiveEnterModifier(progress = { progress })
                            },
                        )
                    },
                ),
            ){
                when(val c = it.instance){
                    is RootComponent.Child.Cupertino -> CupertinoWidgetsScreen(c.component)
                    is RootComponent.Child.Adaptive -> AdaptiveWidgetsScreen(c.component)
                }
            }
        }
    }
}
