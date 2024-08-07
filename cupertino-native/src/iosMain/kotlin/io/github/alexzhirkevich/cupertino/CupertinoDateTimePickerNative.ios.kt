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

package io.github.alexzhirkevich.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import platform.UIKit.UIDatePickerMode

@OptIn(InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
actual fun CupertinoDateTimePickerNative(
    state: CupertinoDateTimePickerState,
    modifier: Modifier,
    style: DatePickerStyle,
    containerColor : Color
) {
    LaunchedEffect(state){
        state.isManual = true
    }

    key(state) {
        CupertinoDatePickerNativeImpl(
            millis = state.selectedDateTimeMillis,
            mode = UIDatePickerMode.UIDatePickerModeDateAndTime,
            onChange = {
                state.setSelection(it)
            },
            modifier = modifier,
            style = style,
            containerColor = containerColor,
        )
    }
}