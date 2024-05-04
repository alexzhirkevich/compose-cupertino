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
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.PopupProperties


@OptIn(ExperimentalComposeUiApi::class)
@Composable
@ReadOnlyComposable
actual fun FullscreenPopupProperties(
    dismissOnBackPress: Boolean,
    dismissOnClickOutside: Boolean,
    usePlatformDefaultWidth: Boolean,
) : PopupProperties = PopupProperties(
    focusable = true,
    dismissOnClickOutside = dismissOnClickOutside,
    dismissOnBackPress = dismissOnBackPress,
    usePlatformDefaultWidth = usePlatformDefaultWidth,
    usePlatformInsets = false
)

actual val DialogProperties.platformInsets : Boolean get() = usePlatformInsets
