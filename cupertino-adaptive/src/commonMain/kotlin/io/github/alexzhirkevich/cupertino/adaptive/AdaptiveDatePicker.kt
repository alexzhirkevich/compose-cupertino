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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerFormatter
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoDatePicker
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.DatePickerStyle
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.InternalCupertinoApi
import io.github.alexzhirkevich.cupertino.LocalContainerColor
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.filterNotNull

@OptIn(ExperimentalCupertinoApi::class, ExperimentalMaterial3Api::class,
    InternalCupertinoApi::class
)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveDatePicker(
    state : CupertinoDatePickerState,
    modifier: Modifier = Modifier,
    adaptation: AdaptationScope<CupertinoDatePickerAdaptation, MaterialDatePickerAdaptation>. () -> Unit = {}
) {
    val materialState = key(state) {
        rememberDatePickerState(state.selectedDateMillis)
    }

    LaunchedEffect(state, materialState) {
        snapshotFlow {
            state.selectedDateMillis
        }.collectLatest {
            if (materialState.selectedDateMillis != it) {
                materialState.selectedDateMillis = it
            }
        }
    }

    LaunchedEffect(state ,materialState){
        snapshotFlow {
            materialState.selectedDateMillis
        }.filterNotNull().collectLatest {
            if (state.selectedDateMillis != it) {
                state.setSelection(it)
            }
        }
    }

    AdaptiveWidget(
        adaptation = remember(materialState) {
            DatePickerAdaptation(materialState)
        },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoDatePicker(
                modifier = modifier,
                state = state,
                style = it.style,
                containerColor = it.containerColor
            )
        },
        material = {
            DisposableEffect(state) {
                val old = state.isManual
                onDispose {
                    state.isManual = old
                }
            }

            DatePicker(
                state = it.state,
                modifier = modifier,
                colors = it.colors,
                dateFormatter = it.dateFormatter,
                title = it.title,
                headline = it.headline,
                showModeToggle = it.showModeToggle
            )
        }
    )
}

@Stable
class CupertinoDatePickerAdaptation internal constructor(
    style : DatePickerStyle,
    containerColor: Color
) {
    var style : DatePickerStyle by mutableStateOf(style)
    var containerColor: Color by mutableStateOf(containerColor)
}

@Stable
@OptIn(ExperimentalMaterial3Api::class)
class MaterialDatePickerAdaptation internal constructor(
    state : DatePickerState,
    colors : DatePickerColors,
    dateFormatter: DatePickerFormatter = DatePickerDefaults.dateFormatter(),
    title: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerTitle(
            displayMode = state.displayMode,
            modifier = Modifier.padding(DatePickerTitlePadding)
        )
    },
    headline: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerHeadline(
            selectedDateMillis = state.selectedDateMillis,
            displayMode = state.displayMode,
            dateFormatter = dateFormatter,
            modifier = Modifier.padding(DatePickerHeadlinePadding)
        )
    },
    showModeToggle: Boolean = true,
) {
    internal val state : DatePickerState by mutableStateOf(state)
    var colors : DatePickerColors by mutableStateOf(colors)
    var dateFormatter: DatePickerFormatter by mutableStateOf(dateFormatter)
    var title: (@Composable () -> Unit)? by mutableStateOf(title)
    var headline: (@Composable () -> Unit)? by mutableStateOf(headline)
    var showModeToggle: Boolean by mutableStateOf(showModeToggle)
}

private val DatePickerTitlePadding = PaddingValues(start = 24.dp, end = 12.dp, top = 16.dp)
private val DatePickerHeadlinePadding = PaddingValues(start = 24.dp, end = 12.dp, bottom = 12.dp)

@ExperimentalAdaptiveApi
@OptIn(ExperimentalMaterial3Api::class)
private class DatePickerAdaptation(
    private val state: DatePickerState
) : Adaptation<CupertinoDatePickerAdaptation, MaterialDatePickerAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoDatePickerAdaptation {
        val style = DatePickerStyle.Pager()
        val containerColor = LocalContainerColor.current

        return remember(style,containerColor) {
            CupertinoDatePickerAdaptation(style, containerColor)
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialDatePickerAdaptation {
        val colors = DatePickerDefaults.colors()
        return remember(state, colors) {
            MaterialDatePickerAdaptation(state, colors)
        }
    }
}