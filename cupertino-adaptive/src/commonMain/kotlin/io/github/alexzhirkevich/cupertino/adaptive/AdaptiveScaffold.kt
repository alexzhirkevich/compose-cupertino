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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.FabPosition
import io.github.alexzhirkevich.cupertino.CupertinoScaffoldDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


@Composable
fun AdaptiveScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    containerColor: Color = CupertinoTheme.colorScheme.systemBackground,
    contentColor: Color = CupertinoTheme.colorScheme.label,
    contentWindowInsets: WindowInsets = CupertinoScaffoldDefaults.contentWindowInsets,
    content: @Composable (PaddingValues) -> Unit
) {
    AdaptiveWidget(
        cupertino = {
            CupertinoScaffold(
                modifier = modifier,
                topBar = topBar,
                bottomBar = bottomBar,
                snackbarHost = snackbarHost,
                floatingActionButton = floatingActionButton,
                floatingActionButtonPosition = floatingActionButtonPosition,
                containerColor = containerColor,
                contentColor = contentColor,
                contentWindowInsets = contentWindowInsets,
                content = content
            )
        },
        material = {
            Scaffold(
                modifier = modifier,
                topBar = topBar,
                bottomBar = bottomBar,
                snackbarHost = snackbarHost,
                floatingActionButton = floatingActionButton,
                floatingActionButtonPosition = when(floatingActionButtonPosition) {
                    FabPosition.End -> androidx.compose.material3.FabPosition.End
                    else -> androidx.compose.material3.FabPosition.Center
                },
                containerColor = containerColor,
                contentColor = contentColor,
                contentWindowInsets = contentWindowInsets,
                content = content
            )
        }
    )
}