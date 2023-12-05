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

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.interop.UIKitView
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIPickerView

@Suppress("INVISIBLE_MEMBER")
@OptIn(ExperimentalForeignApi::class)
@Composable
@ExperimentalCupertinoApi
fun <T> CupertinoPickerNative(
    state: CupertinoPickerState,
    items: List<T>,
    modifier: Modifier = Modifier,
    height: Dp = CupertinoPickerDefaults.Height,
    containerColor: Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
    enabled : Boolean = true,
    content: (T) -> String
) {
    UIKitView(
        modifier = modifier.height(height),
        factory = {
            UIPickerView()
        }
    )
}