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
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.FabPosition
import io.github.alexzhirkevich.cupertino.CupertinoScaffoldDefaults
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


@OptIn(ExperimentalCupertinoApi::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    contentWindowInsets: WindowInsets = CupertinoScaffoldDefaults.contentWindowInsets,
    adaptation : AdaptationScope<ScaffoldAdaptation,ScaffoldAdaptation>.() -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
) {
    AdaptiveWidget(
        adaptation = remember {
            ScaffoldAdaptationImpl()
        },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoScaffold(
                modifier = modifier,
                topBar = topBar,
                bottomBar = bottomBar,
                snackbarHost = snackbarHost,
                floatingActionButton = floatingActionButton,
                floatingActionButtonPosition = floatingActionButtonPosition,
                containerColor = it.containerColor,
                contentColor = it.contentColor,
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
                containerColor = it.containerColor,
                contentColor = it.contentColor,
                contentWindowInsets = contentWindowInsets,
                content = content
            )
        }
    )
}

@OptIn(ExperimentalCupertinoApi::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    containerColor: Color = Color.Unspecified,
    contentColor: Color = Color.Unspecified,
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
                containerColor = containerColor.takeOrElse {
                    CupertinoScaffoldDefaults.containerColor
                },
                contentColor = contentColor.takeOrElse {
                    CupertinoScaffoldDefaults.contentColor
                },
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
                floatingActionButtonPosition = when (floatingActionButtonPosition) {
                    FabPosition.End -> androidx.compose.material3.FabPosition.End
                    else -> androidx.compose.material3.FabPosition.Center
                },
                containerColor = containerColor.takeOrElse {
                    MaterialTheme.colorScheme.background
                },
                contentColor = contentColor.takeOrElse {
                    MaterialTheme.colorScheme.onBackground
                },
                contentWindowInsets = contentWindowInsets,
                content = content
            )
        }
    )
}

@Stable
class ScaffoldAdaptation internal constructor(
    contentColor: Color,
    containerColor: Color
) {
    internal var contentColor by mutableStateOf(contentColor)
    internal var containerColor by mutableStateOf(containerColor)
}
@OptIn(ExperimentalAdaptiveApi::class)
@Stable
private class ScaffoldAdaptationImpl :
    Adaptation<ScaffoldAdaptation, ScaffoldAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): ScaffoldAdaptation {
        val contentColor = CupertinoScaffoldDefaults.contentColor
        val containerColor = CupertinoScaffoldDefaults.containerColor

        return remember(contentColor, containerColor) {
            ScaffoldAdaptation(
                contentColor = contentColor,
                containerColor = containerColor
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): ScaffoldAdaptation {
        val containerColor = MaterialTheme.colorScheme.background
        val contentColor = contentColorFor(containerColor)

        return remember(contentColor, containerColor) {
            ScaffoldAdaptation(
                contentColor = contentColor,
                containerColor = containerColor
            )
        }
    }
}