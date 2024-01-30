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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoButtonDefaults
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerColors
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerDefaults
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerPager
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerTextStyles
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.LocalContainerColor
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.filterNotNull

@Suppress("INVISIBLE_MEMBER")
@OptIn(ExperimentalCupertinoApi::class, ExperimentalMaterial3Api::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveDatePicker(
    state : CupertinoDatePickerState,
    modifier: Modifier = Modifier,
    dateValidator: (Long) -> Boolean = { true },
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
                materialState.setSelection(it)
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
            CupertinoDatePickerPager(
                modifier = modifier,
                state = state,
                colors = it.colors,
                textStyles = it.textStyles,
                rowSpacing = it.rowSpacing,
                rowMaxHeight = it.rowMaxHeight,
                userScrollEnabled = it.userScrollEnabled,
                containerColor = it.containerColor,
                dateValidator = dateValidator
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
                dateValidator = dateValidator,
                title = it.title,
                headline = it.headline,
                showModeToggle = it.showModeToggle,
            )
        }
    )
}

class CupertinoDatePickerAdaptation(
    var colors: CupertinoDatePickerColors,
    var textStyles: CupertinoDatePickerTextStyles,
    var rowSpacing : Dp = 0.dp,
    var rowMaxHeight : Dp = CupertinoButtonDefaults.IconButtonSize,
    var userScrollEnabled : Boolean = true,
    var containerColor: Color
)


@OptIn(ExperimentalMaterial3Api::class)
class MaterialDatePickerAdaptation(
    internal val state : DatePickerState,
    var colors : DatePickerColors,
    var dateFormatter: DatePickerFormatter = DatePickerFormatter(),
    var title: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerTitle(
            state,
            modifier = Modifier.padding(DatePickerTitlePadding)
        )
    },
    var headline: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerHeadline(
            state,
            dateFormatter,
            modifier = Modifier.padding(DatePickerHeadlinePadding)
        )
    },
    var showModeToggle: Boolean = true,
)

private val DatePickerTitlePadding = PaddingValues(start = 24.dp, end = 12.dp, top = 16.dp)
private val DatePickerHeadlinePadding = PaddingValues(start = 24.dp, end = 12.dp, bottom = 12.dp)

@OptIn(ExperimentalMaterial3Api::class, ExperimentalAdaptiveApi::class)
private class DatePickerAdaptation(
    private val state: DatePickerState
) : Adaptation<CupertinoDatePickerAdaptation, MaterialDatePickerAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoDatePickerAdaptation {
        val containerColor = LocalContainerColor.current

        val textStyles: CupertinoDatePickerTextStyles = CupertinoDatePickerDefaults.pagerTextStyles()
        val colors: CupertinoDatePickerColors = CupertinoDatePickerDefaults.pagerColors()

        return remember(textStyles, colors,containerColor) {
            CupertinoDatePickerAdaptation(
                textStyles =  textStyles,
                colors = colors,
                containerColor = containerColor
            )
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