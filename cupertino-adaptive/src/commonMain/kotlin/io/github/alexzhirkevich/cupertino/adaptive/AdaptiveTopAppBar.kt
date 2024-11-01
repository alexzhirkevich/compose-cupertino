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

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBarColors
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBarDefaults
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

@OptIn(ExperimentalMaterial3Api::class, ExperimentalCupertinoApi::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = CupertinoTopAppBarDefaults.windowInsets,
    adaptation: AdaptationScope<CupertinoTopAppBarAdaptation, MaterialTopAppBarAdaptation>.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptation = remember {
            TopAppBarAdaptation()
        },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoTopAppBar(
                title = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                windowInsets = windowInsets,
                colors = it.colors,
                isTransparent = it.isTransparent,
                isTranslucent = it.isTranslucent,
                divider = {
                    it.divider(it.isTransparent)
                }
            )
        },
        material = {
            SingleRowTopAppBar(
                title = title,
                isCenterAligned = it.isCenterAligned,
                colors = it.colors,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                windowInsets = windowInsets,
                scrollBehavior = it.scrollBehavior,
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SingleRowTopAppBar(
    title: @Composable () -> Unit,
    isCenterAligned: Boolean,
    colors: TopAppBarColors,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = CupertinoTopAppBarDefaults.windowInsets,
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    if (isCenterAligned) {
        CenterAlignedTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior,
        )
    } else {
        TopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            windowInsets = windowInsets,
            colors = colors,
            scrollBehavior = scrollBehavior,
        )
    }
}

@Stable
@OptIn(ExperimentalMaterial3Api::class)
class MaterialTopAppBarAdaptation internal constructor(
    colors: TopAppBarColors,
    isCenterAligned: Boolean = false,
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    var isCenterAligned: Boolean by mutableStateOf(isCenterAligned)
    var colors : TopAppBarColors by mutableStateOf(colors)
    var scrollBehavior : TopAppBarScrollBehavior? by mutableStateOf(scrollBehavior)
}

@Stable
class CupertinoTopAppBarAdaptation internal constructor(
    colors : CupertinoTopAppBarColors,
    isTransparent: Boolean = false,
    isTranslucent: Boolean = true,
    divider : @Composable (isTransparent: Boolean) -> Unit = {
        if (!it) {
            CupertinoTopAppBarDefaults.divider()
        }
    }
) {
    var colors: CupertinoTopAppBarColors by mutableStateOf(colors)
    var isTransparent: Boolean by mutableStateOf(isTransparent)
    var isTranslucent: Boolean by mutableStateOf(isTranslucent)
    var divider: @Composable (transparent: Boolean) -> Unit by mutableStateOf(divider)
}

@OptIn(ExperimentalAdaptiveApi::class)
@Stable
private class TopAppBarAdaptation :
    Adaptation<CupertinoTopAppBarAdaptation, MaterialTopAppBarAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoTopAppBarAdaptation {
        val colors = CupertinoTopAppBarDefaults.topAppBarColors()

        return remember(colors) {
            CupertinoTopAppBarAdaptation(
                colors = colors
            )
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun rememberMaterialAdaptation(): MaterialTopAppBarAdaptation {
        val colors = TopAppBarDefaults.topAppBarColors()

        return remember(colors) {
            MaterialTopAppBarAdaptation(
                colors = colors
            )
        }
    }
}